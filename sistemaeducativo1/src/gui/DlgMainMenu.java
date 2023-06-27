package gui;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DlgMainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passContrasena;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgMainMenu frame = new DlgMainMenu();
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
	public DlgMainMenu() {
		setTitle("Sistema educativo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmDocentes = new JMenuItem("Mantenimiento Docentes");
		mntmDocentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmDocentes_actionPerformed(e);
			}
		});
		mnMantenimiento.add(mntmDocentes);
		
		JMenuItem mntmAlumnos = new JMenuItem("Mantenimiento Alumnos");
		mntmAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmAlumnos_actionPerformed(e);
			}
		});
		mnMantenimiento.add(mntmAlumnos);
		
		JMenuItem mntmCursos = new JMenuItem("Mantenimiento Cursos");
		mntmCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmCursos_actionPerformed(e);
			}
		});
		mnMantenimiento.add(mntmCursos);
		
		JMenu mnGestionAcademica = new JMenu("Gestión Académica");
		menuBar.add(mnGestionAcademica);
		
		JMenuItem mntmGestionMatriculas = new JMenuItem("Gestión de Matrículas");
		mntmGestionMatriculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmGestionMatriculas_actionPerformed(e);
			}
		});
		mnGestionAcademica.add(mntmGestionMatriculas);
		
		JMenuItem mntmGestionCalificaciones = new JMenuItem("Gestión de Calificaciones");
		mntmGestionCalificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmGestionCalificaciones_actionPerformed(e);
			}
		});
		mnGestionAcademica.add(mntmGestionCalificaciones);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenuItem mntmReportesCursos = new JMenuItem("Reportes de Cursos");
		mntmReportesCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmReportesCursos_actionPerformed(e);
			}
		});
		mnReportes.add(mntmReportesCursos);
		
		JMenuItem mntmReporteEstudiantes = new JMenuItem("Reportes de Estudiantes");
		mntmReporteEstudiantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmReporteEstudiantes_actionPerformed(e);
			}
		});
		mnReportes.add(mntmReporteEstudiantes);
		
		JMenuItem mntmReporteDocentes = new JMenuItem("Reportes de Docentes");
		mntmReporteDocentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmReporteDocentes_actionPerformed(e);
			}
		});
		mnReportes.add(mntmReporteDocentes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setBounds(192, 74, 73, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContasena = new JLabel("Contraseña :");
		lblContasena.setBounds(192, 104, 73, 14);
		contentPane.add(lblContasena);
		
		passContrasena = new JPasswordField();
		passContrasena.setBounds(286, 101, 106, 20);
		contentPane.add(passContrasena);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(286, 71, 106, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
	}

	@SuppressWarnings("unused")
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	protected void do_mntmDocentes_actionPerformed(ActionEvent e) {
	    DlgMantDocentes mantDocentes = new DlgMantDocentes();
	    mantDocentes.setVisible(true);
	}

	protected void do_mntmAlumnos_actionPerformed(ActionEvent e) {
		DlgMantAlumnos mantAlumnos = new DlgMantAlumnos();
		mantAlumnos.setVisible(true);
	}
	protected void do_mntmCursos_actionPerformed(ActionEvent e) {
		DlgMantCursos mantCursos = new DlgMantCursos();
		mantCursos.setVisible(true);
	}
	protected void do_mntmGestionCalificaciones_actionPerformed(ActionEvent e) {
		DlgGestCalificaciones mantCalificaciones = new DlgGestCalificaciones();
		mantCalificaciones.setVisible(true);
	}
	protected void do_mntmGestionMatriculas_actionPerformed(ActionEvent e) {
		DlgGestMatriculas mantMatriculas = new DlgGestMatriculas();
		mantMatriculas.setVisible(true);
	}
	protected void do_mntmReportesCursos_actionPerformed(ActionEvent e) {
		DlgReportesCursos mantReptCrusos = new DlgReportesCursos();
		mantReptCrusos.setVisible(true);
	}
	protected void do_mntmReporteEstudiantes_actionPerformed(ActionEvent e) {
		DlgReportesEstudiantes mantReptEstudiantes = new DlgReportesEstudiantes();
		mantReptEstudiantes.setVisible(true);
	}
	protected void do_mntmReporteDocentes_actionPerformed(ActionEvent e) {
		DlgReportesDocentes mantReptDocnetes = new DlgReportesDocentes();
		mantReptDocnetes.setVisible(true);
	}
}
