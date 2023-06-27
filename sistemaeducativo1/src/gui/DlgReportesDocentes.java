package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgReportesDocentes extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCodigoDocente;
    private JTable tblReporteDocentes;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DlgReportesDocentes frame = new DlgReportesDocentes();
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
    public DlgReportesDocentes() {
        setTitle("Reportes Docentes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 388);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCodigoDocente = new JLabel("Código del Docente :");
        lblCodigoDocente.setBounds(10, 11, 126, 14);
        contentPane.add(lblCodigoDocente);

        JLabel lblProceso = new JLabel("Proceso :");
        lblProceso.setBounds(10, 37, 126, 14);
        contentPane.add(lblProceso);

        txtCodigoDocente = new JTextField();
        txtCodigoDocente.setBounds(146, 8, 86, 20);
        contentPane.add(txtCodigoDocente);
        txtCodigoDocente.setColumns(10);

        JComboBox<String> cboProcesos = new JComboBox<String>();
        cboProcesos.setModel(new DefaultComboBoxModel<String>(
                new String[] { "Reporte de cursos asignados por docente", "Reporte de asistencia por docente",
                        "Reporte de calificaciones por docente", "Reporte completo" }));
        cboProcesos.setBounds(146, 33, 278, 22);
        contentPane.add(cboProcesos);

        JButton btnListarDocentes = new JButton("Listar docentes");
        btnListarDocentes.setBounds(242, 7, 182, 23);
        contentPane.add(btnListarDocentes);

        JButton btnReportar = new JButton("Reportar");
        btnReportar.setBounds(146, 58, 89, 23);
        contentPane.add(btnReportar);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 92, 414, 247);
        contentPane.add(scrollPane);

        tblReporteDocentes = new JTable();
        tblReporteDocentes.setFillsViewportHeight(true);
        scrollPane.setViewportView(tblReporteDocentes);
    }

}
