package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import datos.DataAlumnos;
import utilidades.mensaje;

public class DlgMantAlumnos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JTextField txtCodigo;
	private JTextArea txtS;
	@SuppressWarnings("rawtypes")
	private JComboBox cboProceso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgMantAlumnos frame = new DlgMantAlumnos();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public DlgMantAlumnos() {
		setTitle("Mantenimiento Alumnos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 575, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListado = new JButton("Listar Alumnos");
		btnListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnListado_actionPerformed(e);
			}
		});
		btnListado.setBounds(297, 77, 149, 23);
		contentPane.add(btnListado);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(10, 15, 58, 14);
		contentPane.add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setToolTipText("Nombre del alumno");
		txtNombres.setBackground(Color.GREEN);
		txtNombres.setForeground(Color.BLACK);
		txtNombres.setBounds(76, 12, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(172, 15, 58, 14);
		contentPane.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setBackground(Color.GREEN);
		txtApellidos.setForeground(Color.BLACK);
		txtApellidos.setBounds(240, 12, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(172, 49, 58, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBackground(Color.GREEN);
		txtTelefono.setForeground(Color.BLACK);
		txtTelefono.setBounds(240, 46, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBackground(Color.GREEN);
		txtDNI.setForeground(Color.BLACK);
		txtDNI.setBounds(76, 46, 86, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		JLabel lblDNI = new JLabel("DNI:");
		lblDNI.setBounds(10, 49, 58, 14);
		contentPane.add(lblDNI);
		
		JLabel lblCodigo = new JLabel("Código de alumno :");
		lblCodigo.setBounds(338, 15, 108, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBackground(Color.RED);
		txtCodigo.setForeground(Color.BLACK);
		txtCodigo.setBounds(463, 12, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 113, 539, 257);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		JLabel lblProceso = new JLabel("Proceso :");
		lblProceso.setBounds(10, 81, 71, 14);
		contentPane.add(lblProceso);
		
		cboProceso = new JComboBox();
		cboProceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_cboProceso_actionPerformed(e);
			}
		});
		cboProceso.setModel(new DefaultComboBoxModel(new String[] {"Agregar", "Modificar", "Eliminar", "Consultar"}));
		cboProceso.setBounds(76, 77, 112, 22);
		contentPane.add(cboProceso);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnProcesar_actionPerformed(e);
			}
		});
		btnProcesar.setBounds(198, 77, 89, 23);
		contentPane.add(btnProcesar);
	}
	
	protected void do_cboProceso_actionPerformed(ActionEvent e) {
		switch(cboProceso.getSelectedIndex()){
		case 0:
			txtNombres.setEditable(true);
			txtNombres.setBackground(Color.GREEN);
			txtDNI.setEditable(true);
			txtDNI.setBackground(Color.GREEN);
			txtApellidos.setEditable(true);
			txtApellidos.setBackground(Color.GREEN);
			txtTelefono.setEditable(true);
			txtTelefono.setBackground(Color.GREEN);
			txtCodigo.setEditable(false);
			txtCodigo.setBackground(Color.RED);
			break;
		case 1:
			txtNombres.setEditable(false);
			txtNombres.setBackground(Color.RED);
			txtDNI.setEditable(false);
			txtDNI.setBackground(Color.RED);
			txtApellidos.setEditable(false);
			txtApellidos.setBackground(Color.RED);
			txtTelefono.setEditable(false);
			txtTelefono.setBackground(Color.RED);
			txtCodigo.setEditable(true);
			txtCodigo.setBackground(Color.GREEN);
			break;
		case 2:
			txtNombres.setEditable(false);
			txtNombres.setBackground(Color.RED);
			txtDNI.setEditable(false);
			txtDNI.setBackground(Color.RED);
			txtApellidos.setEditable(false);
			txtApellidos.setBackground(Color.RED);
			txtTelefono.setEditable(false);
			txtTelefono.setBackground(Color.RED);
			txtCodigo.setEditable(true);
			txtCodigo.setBackground(Color.GREEN);
			break;
		case 3:
			txtNombres.setEditable(false);
			txtNombres.setBackground(Color.RED);
			txtDNI.setEditable(false);
			txtDNI.setBackground(Color.RED);
			txtApellidos.setEditable(false);
			txtApellidos.setBackground(Color.RED);
			txtTelefono.setEditable(false);
			txtTelefono.setBackground(Color.RED);
			txtCodigo.setEditable(true);
			txtCodigo.setBackground(Color.GREEN);
			break;
		case 4:
			txtNombres.setEditable(false);
			txtNombres.setBackground(Color.RED);
			txtDNI.setEditable(false);
			txtDNI.setBackground(Color.RED);
			txtApellidos.setEditable(false);
			txtApellidos.setBackground(Color.RED);
			txtTelefono.setEditable(false);
			txtTelefono.setBackground(Color.RED);
			txtCodigo.setEditable(false);
			txtCodigo.setBackground(Color.RED);
			break;
	}
	}
	
	protected void do_btnListado_actionPerformed(ActionEvent e) {
	    try {
	        BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"));
	        StringBuilder sb = new StringBuilder();
	        String linea;
	        
	        while ((linea = br.readLine()) != null) {
	            sb.append(linea).append("\n");
	        }
	        
	        br.close();
	        
	        txtS.setText(sb.toString());
	    } catch (IOException e1) {
	        mensaje.mostrarMensaje("Primero debes crear un alumno");
	    }
	}

	protected void do_btnProcesar_actionPerformed(ActionEvent e) {
	    try {
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            String dni = txtDNI.getText();
            String telefono = txtTelefono.getText();
            PrintWriter alumnos = new PrintWriter(new FileWriter("alumnos.txt", true));
            
	        switch(cboProceso.getSelectedIndex()) {
	            case 0:
	                if (nombres.length() < 1) {
	                    mensaje.mostrarMensaje("Ingresa un nombre");
	                    break;
	                }
	                
	                if (apellidos.length() < 1) {
	                    mensaje.mostrarMensaje("Ingrese los apellidos");
	                    break;
	                }
	                
	                if (dni.length() != 8) {
	                    mensaje.mostrarMensaje("Ingrese un DNI válido");
	                    break;
	                }
	                
	                if (telefono.length() != 9) {
	                    mensaje.mostrarMensaje("Ingrese un número de teléfono válido");
	                    break;
	                }
	                
	                int ultimoCodigo = obtenerUltimoCodigo();
	                String codigo = Integer.toString(ultimoCodigo + 1);
	                
	                DataAlumnos alumno = new DataAlumnos(codigo, nombres, apellidos, dni, telefono);
	                
	                alumnos.println(alumno.toString());
	                alumnos.close();
	                
	                mensaje.mostrarMensaje("Datos guardados correctamente.");
	                break;
	                
	            case 1:
	                if (nombres.length() < 1) {
	                    mensaje.mostrarMensaje("Ingresa un nombre");
	                    break;
	                }
	                
	                if (apellidos.length() < 1) {
	                    mensaje.mostrarMensaje("Ingrese los apellidos");
	                    break;
	                }
	                
	                if (dni.length() != 8) {
	                    mensaje.mostrarMensaje("Ingrese un DNI válido");
	                    break;
	                }
	                
	                if (telefono.length() != 9) {
	                    mensaje.mostrarMensaje("Ingrese un número de teléfono válido");
	                    break;
	                }
	                
	                
	                
	                mensaje.mostrarMensaje("Datos guardados correctamente.");
	                break;
	            case 2:
	                if (nombres.length() < 1) {
	                    mensaje.mostrarMensaje("Ingresa un nombre");
	                    break;
	                }
	                
	                if (apellidos.length() < 1) {
	                    mensaje.mostrarMensaje("Ingrese los apellidos");
	                    break;
	                }
	                
	                if (dni.length() != 8) {
	                    mensaje.mostrarMensaje("Ingrese un DNI válido");
	                    break;
	                }
	                
	                if (telefono.length() != 9) {
	                    mensaje.mostrarMensaje("Ingrese un número de teléfono válido");
	                    break;
	                }
	                
	                
	                
	                mensaje.mostrarMensaje("Datos guardados correctamente.");
	                break;
	            default:
	                mensaje.mostrarMensaje("Proceso no válido seleccionado.");
	        }
	    } catch (IOException e1) {
	        System.out.println("Error al crear el archivo: " + e1.getMessage());
	    }
	}
	
	private int obtenerUltimoCodigo() {
	    int UltimoCodigo = 0;
	    try {
	        BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"));
	        String linea;
	        while ((linea = br.readLine()) != null) {
	            if (linea.startsWith("Codigo: ")) {
	                int codigo = Integer.parseInt(linea.substring(8));
	                UltimoCodigo = Math.max(UltimoCodigo, codigo);
	            }
	        }
	        br.close();
	    } catch (IOException e) {
	        System.out.println("Error al obtener el codigo");
	    }
	    return UltimoCodigo;
	}
}
