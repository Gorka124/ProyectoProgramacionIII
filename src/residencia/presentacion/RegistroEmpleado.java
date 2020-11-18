package residencia.presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField apellidos;
	private JTextField usuario;
	private JTextField contrasenia;
	private JTextField dni;
	private JTextField edad;
	private JTextField Ocupacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroEmpleado frame = new RegistroEmpleado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 3, 69, 20);
		contentPane.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setBounds(109, 0, 146, 26);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(15, 34, 85, 20);
		contentPane.add(lblApellidos);
		
		apellidos = new JTextField();
		apellidos.setBounds(109, 31, 146, 26);
		contentPane.add(apellidos);
		apellidos.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(15, 70, 69, 20);
		contentPane.add(lblUsuario);
		
		usuario = new JTextField();
		usuario.setBounds(109, 67, 146, 26);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setBounds(15, 106, 85, 20);
		contentPane.add(lblContrasenia);
		
		contrasenia = new JTextField();
		contrasenia.setBounds(109, 103, 146, 26);
		contentPane.add(contrasenia);
		contrasenia.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(15, 142, 69, 20);
		contentPane.add(lblDni);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(15, 178, 69, 20);
		contentPane.add(lblEdad);
		
		dni = new JTextField();
		dni.setBounds(109, 139, 146, 26);
		contentPane.add(dni);
		dni.setColumns(10);
		
		edad = new JTextField();
		edad.setBounds(109, 175, 146, 26);
		contentPane.add(edad);
		edad.setColumns(10);
		
		JLabel lblOcupacion = new JLabel("Ocupaci\u00F3n:");
		lblOcupacion.setBounds(15, 214, 95, 20);
		contentPane.add(lblOcupacion);
		
		Ocupacion = new JTextField();
		Ocupacion.setBounds(109, 211, 146, 26);
		contentPane.add(Ocupacion);
		Ocupacion.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(298, 59, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroEmpleado.this.setVisible(false);
				LoginEmpleado loginEmpleado = new LoginEmpleado();
				loginEmpleado.setVisible(true);
			}
		});
		btnCancelar.setBounds(298, 133, 115, 29);
		contentPane.add(btnCancelar);
		

	}
}
