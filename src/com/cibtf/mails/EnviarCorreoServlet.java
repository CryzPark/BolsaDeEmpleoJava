package com.cibtf.mails;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cibtf.dao.CorreoDAO;
import com.cibtf.session.controller.SessionUser;

/**
 * Servlet implementation class EnviarCorreoServlet
 */
@WebServlet("/EnviarCorreoServlet")
public class EnviarCorreoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String nombre = request.getParameter("nombreContacto");
		String correo = request.getParameter("correoContacto");
		String asunto = request.getParameter("asuntoContacto");
		String mensaje = request.getParameter("mensajeContacto");
		
		mensaje = " Nombre: "+nombre
				+ "\n Correo: "+correo
				+ "\n Mensaje: "+mensaje;
		System.out.println(mensaje);
		
		CorreoDAO correoDAO = new CorreoDAO();
		String status = correoDAO.enviarCorreoDAOSppt(asunto, mensaje);
		
		//Validar Sesión y Rol
		SessionUser sessionUser = new SessionUser();
		
		HttpSession session = request.getSession();
		
		sessionUser = (SessionUser) session.getAttribute("sessionUser");
		if(sessionUser == null || sessionUser.getRolUsuario().equals("admin")) {
			System.out.println("no index");
			request.setAttribute("status", status);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else if(sessionUser.getRolUsuario().equals("empresa") || sessionUser.getRolUsuario().equals("universidad")){
			System.out.println("idex");
			request.setAttribute("status", status);
			request.getRequestDispatcher("contacto.jsp").forward(request, response);
		}
		//Fin Validar Sesión y Rol

		
		
	}

}
