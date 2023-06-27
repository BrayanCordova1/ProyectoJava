package gui;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DlgGestMatriculas extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCodigoAlumno;
    private JButton btnBuscarAlumno;
    private JButton btnListarAlumno;
    private JScrollPane scrollPane;
    private JTextArea txtS;
    @SuppressWarnings("rawtypes")
	private JComboBox cboCursos;
    @SuppressWarnings("rawtypes")
	private JComboBox cboProcesos;
    

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DlgGestMatriculas frame = new DlgGestMatriculas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public DlgGestMatriculas() {

        setTitle("Matrículas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 514, 413);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCodigoAlumno = new JLabel("Código de Alumno:");
        lblCodigoAlumno.setBounds(10, 11, 120, 20);
        contentPane.add(lblCodigoAlumno);

        txtCodigoAlumno = new JTextField();
        txtCodigoAlumno.setBounds(126, 11, 163, 20);
        contentPane.add(txtCodigoAlumno);
        txtCodigoAlumno.setColumns(10);

        JLabel lblCodigoCurso = new JLabel("Curso:");
        lblCodigoCurso.setBounds(10, 42, 120, 20);
        contentPane.add(lblCodigoCurso);

        JButton btnProcesar = new JButton("Procesar");
        btnProcesar.setBounds(299, 73, 90, 23);
        contentPane.add(btnProcesar);
        
        btnBuscarAlumno = new JButton("Buscar");
        btnBuscarAlumno.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		do_btnBuscarAlumno_actionPerformed(e);
        	}
        });
        btnBuscarAlumno.setBounds(299, 10, 89, 23);
        contentPane.add(btnBuscarAlumno);
        
        btnListarAlumno = new JButton("Listar");
        btnListarAlumno.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		do_btnListarAlumno_actionPerformed(e);
        	}
        });
        btnListarAlumno.setBounds(398, 10, 89, 23);
        contentPane.add(btnListarAlumno);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 114, 477, 249);
        contentPane.add(scrollPane);
        
        txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		cboCursos = new JComboBox();
		cboCursos.setModel(new DefaultComboBoxModel(new String[] {"Matematicas", "Comunicacion", "Ciencias"}));
		cboCursos.setBounds(126, 42, 163, 22);
		contentPane.add(cboCursos);
		
		cboProcesos = new JComboBox();
		cboProcesos.setModel(new DefaultComboBoxModel(new String[] {"Matricular estudiante", "Editar matrícula", "Eliminar matrícula", "Listar matrículas"}));
		cboProcesos.setBounds(126, 73, 163, 22);
		contentPane.add(cboProcesos);
    }
    


    protected void do_btnBuscarAlumno_actionPerformed(ActionEvent e) {

    }

    protected void do_btnListarAlumno_actionPerformed(ActionEvent e) {

    }

	
}
