package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.cliente.vista;

import java.awt.EventQueue;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JTable;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio.GestionProveedorRemoto;

import java.awt.Color;

public class VentanaListarSolicitudes {
	private GestionProveedorRemoto on;
	private JFrame frmSolicitudesEnvios;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListarSolicitudes window = new VentanaListarSolicitudes();
					window.frmSolicitudesEnvios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaListarSolicitudes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSolicitudesEnvios = new JFrame();
		frmSolicitudesEnvios.setTitle("SOLICITUDES ENVIOS");
		frmSolicitudesEnvios.setBounds(100, 100, 734, 472);
		frmSolicitudesEnvios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSolicitudesEnvios.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(204, 204, 255));
		table.setBounds(547, 74, -537, 336);
		frmSolicitudesEnvios.getContentPane().add(table);
	}
	
	public void referenciarOnEmpleado() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "sistemaTran");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "sistema");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = 	"ejb:/envio/GestionProveedorOn!ec.ups.edu.envio.servicio.GestionsProveedorRemoto";
            this.on = (GestionProveedorRemoto) context.lookup(lookupName);  
            System.out.print(on.obtenerProductos());
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	}
}
