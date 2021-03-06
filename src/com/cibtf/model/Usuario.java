package com.cibtf.model;

public class Usuario {

	//Propiedades del Objeto
	private int idUsuario;
	private String nombreUsuario;
	private String apellidosUsuario;
	private String correoUsuario;
	private String passUsuario;
	private String rolUsuario;
	private int statusUsuario;
	private int idUniversidad;
	private int idEmpresa;
	private String nombreUniversidad;
	private String nombreEmpresa;
	
	
	//Constructores
	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String nombreUsuario, String apellidosUsuario, String correoUsuario, String passUsuario, String rolUsuario, int statusUsuario, int idUniversidad, int idEmpresa, String nombreUniversidad, String nombreEmpresa) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.correoUsuario = correoUsuario;
		this.passUsuario = passUsuario;
		this.rolUsuario =rolUsuario;
		this.statusUsuario = statusUsuario;
		this.idUniversidad = idUniversidad;
		this.idEmpresa = idEmpresa;
		this.nombreUniversidad = nombreUniversidad;
		this.nombreEmpresa = nombreEmpresa;
	}
	
	
	//Getters and Setters
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidosUsuario() {
		return apellidosUsuario;
	}

	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getPassUsuario() {
		return passUsuario;
	}

	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}

	public String getRolUsuario() {
		return rolUsuario;
	}

	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

	public int getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(int statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

	public int getIdUniversidad() {
		return idUniversidad;
	}

	public void setIdUniversidad(int idUniversidad) {
		this.idUniversidad = idUniversidad;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	public String getNombreUniversidad() {
		return nombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidosUsuario="
				+ apellidosUsuario + ", correoUsuario=" + correoUsuario + ", passUsuario=" + passUsuario
				+ ", rolUsuario=" + rolUsuario + ", statusUsuario=" + statusUsuario + ", idUniversidad=" + idUniversidad
				+ ", idEmpresa=" + idEmpresa + ", nombreUniversidad=" + nombreUniversidad + ", nombreEmpresa="
				+ nombreEmpresa + "]";
	}


	
	
}
