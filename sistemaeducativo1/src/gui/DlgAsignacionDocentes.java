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

public class DlgAsignacionDocentes extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCodigoDocente;
    private JTextField txtCodigoCurso;
    private JButton btnBuscarAlumno;
    private JButton btnBuscarCurso;
    private JButton btnListarAlumno;
    private JButton btnListarCurso;
    private JScrollPane scrollPane;
    private JTextArea txtS;
    private JButton btnAsignar;
    

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DlgAsignacionDocentes frame = new DlgAsignacionDocentes();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DlgAsignacionDocentes() {

        setTitle("Retiros");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 480, 413);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCodigoDocente = new JLabel("Código de Docente");
        lblCodigoDocente.setBounds(10, 11, 120, 20);
        contentPane.add(lblCodigoDocente);

        txtCodigoDocente = new JTextField();
        txtCodigoDocente.setBounds(131, 11, 120, 20);
        contentPane.add(txtCodigoDocente);
        txtCodigoDocente.setColumns(10);

        JLabel lblCodigoCurso = new JLabel("Código de Curso:");
        lblCodigoCurso.setBounds(10, 42, 120, 20);
        contentPane.add(lblCodigoCurso);

        txtCodigoCurso = new JTextField();
        txtCodigoCurso.setBounds(131, 42, 120, 20);
        contentPane.add(txtCodigoCurso);
        txtCodigoCurso.setColumns(10);
        
        btnBuscarAlumno = new JButton("Buscar");
        btnBuscarAlumno.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		do_btnBuscarAlumno_actionPerformed(e);
        	}
        });
        btnBuscarAlumno.setBounds(261, 10, 89, 23);
        contentPane.add(btnBuscarAlumno);
        
        btnBuscarCurso = new JButton("Buscar");
        btnBuscarCurso.setBounds(261, 41, 89, 23);
        contentPane.add(btnBuscarCurso);
        
        btnListarAlumno = new JButton("Listar");
        btnListarAlumno.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		do_btnListarAlumno_actionPerformed(e);
        	}
        });
        btnListarAlumno.setBounds(360, 10, 89, 23);
        contentPane.add(btnListarAlumno);
        
        btnListarCurso = new JButton("Listar");
        btnListarCurso.setBounds(360, 41, 89, 23);
        contentPane.add(btnListarCurso);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 114, 432, 249);
        contentPane.add(scrollPane);
        
        txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnAsignar = new JButton("Asginar");
		btnAsignar.setBounds(131, 73, 110, 30);
		contentPane.add(btnAsignar);
    }
    


    protected void do_btnBuscarAlumno_actionPerformed(ActionEvent e) {

    }

    protected void do_btnListarAlumno_actionPerformed(ActionEvent e) {
        
    }

	
}
