package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo;

import java.io.Serializable;
import java.util.List;



public class Solicituds  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String direccionDestino;
	private String nombeRemitente;
	private String apellido;
	private String direccioRemitente;
	private String nombreDestinario;
	private String apellidoDes;
	private String direccionRecogidap;
	private String direccionEntregaPA;
	private double precio;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDireccionDestino() {
		return direccionDestino;
	}

	public void setDireccionDestino(String direccionDestino) {
		this.direccionDestino = direccionDestino;
	}

	public String getNombeRemitente() {
		return nombeRemitente;
	}

	public void setNombeRemitente(String nombeRemitente) {
		this.nombeRemitente = nombeRemitente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccioRemitente() {
		return direccioRemitente;
	}

	public void setDireccioRemitente(String direccioRemitente) {
		this.direccioRemitente = direccioRemitente;
	}

	public String getNombreDestinario() {
		return nombreDestinario;
	}

	public void setNombreDestinario(String nombreDestinario) {
		this.nombreDestinario = nombreDestinario;
	}

	public String getApellidoDes() {
		return apellidoDes;
	}

	public void setApellidoDes(String apellidoDes) {
		this.apellidoDes = apellidoDes;
	}

	public String getDireccionRecogidap() {
		return direccionRecogidap;
	}

	public void setDireccionRecogidap(String direccionRecogidap) {
		this.direccionRecogidap = direccionRecogidap;
	}

	public String getDireccionEntregaPA() {
		return direccionEntregaPA;
	}

	public void setDireccionEntregaPA(String direccionEntregaPA) {
		this.direccionEntregaPA = direccionEntregaPA;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Solicituds [codigo=" + codigo + ", direccionDestino=" + direccionDestino + ", nombeRemitente="
				+ nombeRemitente + ", apellido=" + apellido + ", direccioRemitente=" + direccioRemitente
				+ ", nombreDestinario=" + nombreDestinario + ", apellidoDes=" + apellidoDes + ", direccionRecogidap="
				+ direccionRecogidap + ", direccionEntregaPA=" + direccionEntregaPA + ", precio=" + precio + "]";
	}

}
