package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.cliente.vista;

import java.awt.EventQueue;
import java.net.URL;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.xml.namespace.QName;

import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo.Solicituds;
import ec.edu.ups.appdis.ExamenPaltaRaynerServidor.negocio.GestionProveedorRemoto;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JList;

public class vistaRegistro {
	private JList list;
	private DefaultListModel modelo;//declaramos el Modelo
	private JScrollPane scrollLista;
	private JFrame frame;
	private List<Solicituds> ll;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private GestionProveedorRemoto on;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					vistaRegistro window = new vistaRegistro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vistaRegistro() {
		initialize();
		listar();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 463, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnRegistrar = new JButton("Listar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();
			}
		});
		btnRegistrar.setBounds(268, 18, 117, 29);
		frame.getContentPane().add(btnRegistrar);

		lb1 = new JLabel("");
		lb1.setEnabled(false);
		lb1.setBounds(28, 257, 104, 31);
		frame.getContentPane().add(lb1);

		lb2 = new JLabel("");
		lb2.setEnabled(false);
		lb2.setBounds(145, 257, 104, 31);
		frame.getContentPane().add(lb2);

		lb3 = new JLabel("");
		lb3.setEnabled(false);
		lb3.setBounds(237, 257, 104, 31);
		frame.getContentPane().add(lb3);

		lb4 = new JLabel("");
		lb4.setEnabled(false);
		lb4.setBounds(353, 257, 104, 31);
		frame.getContentPane().add(lb4);
		
		list = new JList();
		list.setBounds(41, 222, 364, -89);
		frame.getContentPane().add(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
		modelo = new DefaultListModel();
		scrollLista = new JScrollPane();
		scrollLista.setViewportView(list);

	}

	public void listar() {
		
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
              
            final String lookupName = 	"ejb:/envio/GestionProveedorOn!ec.ups.edu.envio.servicio.GestionProveedorRemoto";
            this.on = (GestionProveedorRemoto) context.lookup(lookupName);  
            ll = on.obtenerProductos();
            for (Solicituds solicituds : ll) {
            	modelo.addElement(solicituds);
            	list.setModel(modelo);
				System.out.println(solicituds.getApellido());
			}
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
              
        }  
	}
}
