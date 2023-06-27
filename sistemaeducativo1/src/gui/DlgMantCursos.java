package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class DlgMantCursos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCantidadEstudiantes;
	private JTextField txtCodigo;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgMantCursos frame = new DlgMantCursos();
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
	public DlgMantCursos() {
		setTitle("Mantenimiento Cursos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 545, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListado = new JButton("Listar cursos");
		btnListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnListado_actionPerformed(e);
			}
		});
		btnListado.setBounds(376, 77, 127, 23);
		contentPane.add(btnListado);
		
		JLabel lblNombre = new JLabel("Nombre del curso :");
		lblNombre.setBounds(10, 15, 153, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(Color.GREEN);
		txtNombre.setBounds(160, 12, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCantidadEstudiantes = new JTextField();
		txtCantidadEstudiantes.setBackground(Color.GREEN);
		txtCantidadEstudiantes.setBounds(160, 46, 86, 20);
		contentPane.add(txtCantidadEstudiantes);
		txtCantidadEstudiantes.setColumns(10);
		
		JLabel lblCantidadEstudiantes = new JLabel("Cantidad de estudiantes :");
		lblCantidadEstudiantes.setBounds(10, 49, 153, 14);
		contentPane.add(lblCantidadEstudiantes);
		
		JLabel lblDNI = new JLabel("Docente :  ");
		lblDNI.setBounds(268, 15, 113, 14);
		contentPane.add(lblDNI);
		
		JLabel lblCodigo = new JLabel("Código del curso :");
		lblCodigo.setBounds(268, 49, 113, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBackground(Color.GREEN);
		txtCodigo.setBounds(391, 46, 112, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 508, 259);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.GREEN);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DOC0001", "DOC0002"}));
		comboBox.setBounds(391, 11, 112, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ingresar", "Modificar", "Consultar", "Eliminar"}));
		comboBox_1.setBounds(91, 79, 127, 22);
		contentPane.add(comboBox_1);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(228, 79, 128, 23);
		contentPane.add(btnProcesar);
		
		JLabel lblProcesar = new JLabel("Procesar :");
		lblProcesar.setBounds(10, 83, 71, 14);
		contentPane.add(lblProcesar);
	}
	
	public static void mensaje(String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
	protected void do_btnListado_actionPerformed(ActionEvent e) {
	}
}
