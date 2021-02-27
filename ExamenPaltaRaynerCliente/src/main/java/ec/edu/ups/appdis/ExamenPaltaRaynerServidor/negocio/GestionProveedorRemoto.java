package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Solicituds;


public interface GestionProveedorRemoto {
	public boolean insertarSolicitud(Solicituds soli) throws Exception ;
	public List<Solicituds> obtenerProductos();
}
