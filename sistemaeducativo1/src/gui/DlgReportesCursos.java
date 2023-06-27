package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgReportesCursos extends JFrame {

	private static final long serialVersionUID = -6611735208164634723L;
	private JPanel contentPane;
	private JTextField txtCodigoCurso;
	private JTable tblReporteCursos;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgReportesCursos frame = new DlgReportesCursos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public DlgReportesCursos() {
		setTitle("Reporte Cursos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Reporte de inscripciones por curso",
				"Reporte de calificaciones por curso", "Reporte de asistencia por curso", "Reporte Completo" }));
		comboBox.setBounds(119, 40, 239, 22);
		contentPane.add(comboBox);

		JButton btnProceso = new JButton("Reportar");
		btnProceso.setBounds(116, 72, 89, 23);
		contentPane.add(btnProceso);

		JLabel lblCodigoCurso = new JLabel("Código del Curso :");
		lblCodigoCurso.setBounds(10, 15, 117, 14);
		contentPane.add(lblCodigoCurso);

		txtCodigoCurso = new JTextField();
		txtCodigoCurso.setBounds(119, 12, 86, 20);
		contentPane.add(txtCodigoCurso);
		txtCodigoCurso.setColumns(10);

		JLabel lblProceso = new JLabel("Proceso :");
		lblProceso.setBounds(10, 44, 82, 14);
		contentPane.add(lblProceso);

		JButton btnListar = new JButton("Listar cursos");
		btnListar.setBounds(213, 11, 145, 23);
		contentPane.add(btnListar);

		tblReporteCursos = new JTable();
		tblReporteCursos.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(tblReporteCursos);
		scrollPane.setBounds(10, 106, 414, 188);
		contentPane.add(scrollPane);
	}
}
