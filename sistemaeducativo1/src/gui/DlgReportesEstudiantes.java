package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgReportesEstudiantes extends JFrame {

	private static final long serialVersionUID = 6400148752524378073L;
	private JPanel contentPane;
	private JTextField txtCodigoEstudiante;
	private JTable tblReportesEstudiantes;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgReportesEstudiantes frame = new DlgReportesEstudiantes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public DlgReportesEstudiantes() {
		setTitle("Reporte Estudiantes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoEstudiante = new JLabel("Código del estudiante:");
		lblCodigoEstudiante.setBounds(10, 11, 135, 14);
		contentPane.add(lblCodigoEstudiante);
		
		txtCodigoEstudiante = new JTextField();
		txtCodigoEstudiante.setBounds(155, 8, 86, 20);
		contentPane.add(txtCodigoEstudiante);
		txtCodigoEstudiante.setColumns(10);
		
		JButton btnListar = new JButton("Listar estudiantes");
		btnListar.setBounds(251, 7, 173, 23);
		contentPane.add(btnListar);
		
		JLabel lblProceso = new JLabel("Proceso:");
		lblProceso.setBounds(10, 36, 135, 14);
		contentPane.add(lblProceso);
		
		JComboBox<String> cboProcesos = new JComboBox<String>();
		cboProcesos.setModel(new DefaultComboBoxModel(new String[] {"Reporte de calificaciones por estudiante", "Reporte de asistencia por estudiante", "Reporte de matrícula por estudiante", "Reporte completo"}));
		cboProcesos.setBounds(155, 32, 269, 22);
		contentPane.add(cboProcesos);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setBounds(155, 58, 89, 23);
		contentPane.add(btnReportar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 92, 414, 231);
		contentPane.add(scrollPane);
		
		tblReportesEstudiantes = new JTable();
		scrollPane.setViewportView(tblReportesEstudiantes);
		tblReportesEstudiantes.setFillsViewportHeight(true);
	}
}
