package com.cibtf.files.pdf;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cibtf.dao.VacantesDAO;
import com.cibtf.model.AdminVacante;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class GetPdfServlet
 */
@WebServlet("/GetPdfVacanteServlet")
public class GetPdfVacanteServlet extends HttpServlet {
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
		
		int idVacante = Integer.parseInt(request.getParameter("idVacante"));
		
		AdminVacante vacante = new AdminVacante();
		VacantesDAO vacantesDAO = new VacantesDAO();
		vacante = vacantesDAO.getVacanteDAO(idVacante);
		
		Document document = new Document();
		try{
		    response.setContentType("application/pdf");
		    PdfWriter.getInstance(document, response.getOutputStream());
		    document.open();
		    //texto
		    
		    String cuerpo = "\r\nEmpresa: "+vacante.getNombreEmpresa()
			+ "\r\nCorreo: "+vacante.getCorreoEmpresa()
			+ "\r\nTeléfono: "+vacante.getTelefonoEmpresa()
			+ "\r\nNombre de la Vacante: "+vacante.getNombreVacante()
			+ "\r\nFunción: "+vacante.getFuncionVacante()
			+ "\r\nDescripción: "+vacante.getDescripcionVacante()
			+ "\r\nPlazas Disponibles: "+vacante.getPlazasVacante()
			+ "\r\nHabilidades Necesarias: "+vacante.getHabilidadesVacante()
			+ "\r\nExperiencia Necesaria: "+vacante.getExperienciaVacante()
			+ "\r\nEscolaridad Requerida: "+vacante.getEscolaridadVacante()
			+ "\r\nConocimientos Requeridos: "+vacante.getComisionesUsuario()
			+ "\r\nDías Laborales: "+vacante.getDiasLaboralesVacante()
			+ "\r\nIdiomas: "+vacante.getIdiomasVacante()
			+ "\r\nRango de Edades: "+vacante.getEdadesVacante()
			+ "\r\nSexo: "+vacante.getSexoVacante()
			+ "\r\nSueldo: "+vacante.getSueldoVacante()
			+ "\r\nPrestaciones: "+vacante.getPrestacionesVacante()
			+ "\r\nComisiones: "+vacante.getComisionesUsuario()
			+ "\r\nDisponibilidad de Viaje: "+vacante.getDispViajeVacante()
			+ "\r\nTurno: "+vacante.getTurnosVacante()
			+ "\r\nHorarios: "+vacante.getHorariosVacante()
			+ "\r\nEstado Civil: "+vacante.getEstadoCivilVacante();
		    
		    //fin testo
		    document.add(new Paragraph(cuerpo));		    
		}catch(Exception e){
		    e.printStackTrace();
		}
		    document.close();

	}

}
