package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio;

import java.util.List;


import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Destinatario;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Paquete;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Remitente;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.SolicitudPaquetes;

public interface GestionSistemaRemoto {
	
	public boolean registarDestinatario(Destinatario destinatario) throws Exception;

	public boolean registarRemitente(Remitente remitente) throws Exception;

	public boolean registarPaquete(Paquete paque) throws Exception;

	public boolean registaSolicitud(SolicitudPaquetes solicitud) throws Exception;

	public Remitente buscarRemitente(String cedula ) throws Exception ;

	public Destinatario buscarDest(String cedula ) throws Exception ;

	public Paquete buscarPaquete(int codigo ) throws Exception ;

	public SolicitudPaquetes buscarSoli( int codigo ) throws Exception ;

	public List<Remitente> listarRemi();

	public List<Destinatario> listarDesti();

	public List<Paquete> listarPaquete();

	public List<SolicitudPaquetes> listarSolicitudes();

	public String generaPrecio();


}
