package gui;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class DlgGestCalificaciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTable tblCalificacion;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgGestCalificaciones frame = new DlgGestCalificaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DlgGestCalificaciones() {
		setTitle("Calificaciones");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 481, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> cboProcesos = new JComboBox<>();
		cboProcesos.setModel(new DefaultComboBoxModel<>(new String[] { "Ingresar calificacion", "Editar calificacion",
				"Eliminar calificacion", "Eliminar calificaciones" }));
		cboProcesos.setBounds(309, 11, 145, 22);
		contentPane.add(cboProcesos);

		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(309, 44, 145, 23);
		contentPane.add(btnProcesar);

		JButton btnListar = new JButton("Listar calificaciones");
		btnListar.setBounds(309, 78, 145, 23);
		contentPane.add(btnListar);

		JLabel lblCurso = new JLabel("Curso :");
		lblCurso.setBounds(10, 48, 108, 14);
		contentPane.add(lblCurso);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Matematica", "Historia", "Ciencias" }));
		comboBox.setBounds(154, 44, 145, 22);
		contentPane.add(comboBox);

		JLabel lblCodigo = new JLabel("Código de calificación :");
		lblCodigo.setBounds(10, 15, 134, 14);
		contentPane.add(lblCodigo);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(154, 12, 145, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);

		tblCalificacion = new JTable();
		tblCalificacion.setFillsViewportHeight(true);
		@SuppressWarnings("unused")
		DefaultTableModel tableModel = new DefaultTableModel(
			new Object[][] {},
			new String[] { "Columna 1", "Columna 2", "Columna 3" }
		);
		tblCalificacion.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Curso", "Calificaci\u00F3n"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(tblCalificacion);
		scrollPane.setBounds(10, 112, 444, 244);
		contentPane.add(scrollPane);
	}
}
