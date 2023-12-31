package vistas2;

import Entidades.*;
import accesoADatos.*;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import controladores.CiudadanoControlador;
import controladores.ConfiguracionControlador;
import desplazable.Desface;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonz@_
 */
public class Principal extends javax.swing.JFrame {

    //ATRIBUTOS MENUS
    private Desface desplazar;
    private boolean menuDesplegado = false;
    //ATRIBUTOS CLASES PANELES
    private CiudadanoVista_2 ciudadanoVista;
    private CitaVacunacionVista citaVacunacionVista;
    private CentroVacunacionVista_2 centroVacunacionVista;
    private LaboratorioVista_2 laboratorioVista;
//  private VacinaVista VacinaVista;
    private Ciudadano ciudadano;
    private CiudadanoData ciudadanoData;
    private VacunaVista_2 vacunaVista;

    public Principal() {
        initComponents();
        setSize(1200, 650);
        setLocationRelativeTo(null);
        // jPanel_botones_principal.setVisible(true);
        jDesktopVacuna.setVisible(true);
        desplazar = new Desface();
        conifgDate();
        Connection conexion = Conexion.getConexion();

        ciudadanoVista = new CiudadanoVista_2(this);
        ciudadano = new Ciudadano();
        ciudadanoData = new CiudadanoData(conexion);
        laboratorioVista = new LaboratorioVista_2();
        vacunaVista = new VacunaVista_2(citaVacunacionVista);
        centroVacunacionVista = new CentroVacunacionVista_2();
        citaVacunacionVista = new CitaVacunacionVista();
        

        //CONFIGS CONTROLADOR
        ConfiguracionControlador controladorconfig = new ConfiguracionControlador(this);
        // CIUDADANO CONTTROLADOR
        CiudadanoControlador controladorCiudadano = new CiudadanoControlador(ciudadano, ciudadanoData, ciudadanoVista);
        controladorCiudadano.listarTodosLosCiudadanos();

        this.repaint(); //al final siempre
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        JP_titulo = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();
        jL_logo_ulp = new javax.swing.JLabel();
        JP_Botones = new keeptoo.KGradientPanel();
        btn_ciudadano = new javax.swing.JButton();
        btn_laboratorio = new javax.swing.JButton();
        btn_centro_vacunacion = new javax.swing.JButton();
        btn_vacuna = new javax.swing.JButton();
        btn_cita_vacunacion = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jL_fechaHora = new javax.swing.JLabel();
        JP_informacion = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel_Escritorio = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/escritorio_principal.jpg"));
        Image image = icon.getImage();
        jDesktopVacuna = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vacunación Grupo 8");
        setBackground(new java.awt.Color(24, 24, 27));
        setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 153));

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 24, 39));
        kGradientPanel1.setkStartColor(new java.awt.Color(9, 9, 11));

        JP_titulo.setkEndColor(new java.awt.Color(30, 58, 138));
        JP_titulo.setkGradientFocus(1500);
        JP_titulo.setkStartColor(new java.awt.Color(24, 24, 27));

        jLabel2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema de Vacunación G8");

        btn_menu.setBackground(new java.awt.Color(23, 37, 84));
        btn_menu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_menu.setForeground(new java.awt.Color(204, 204, 204));
        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/menú-ico.png"))); // NOI18N
        btn_menu.setText("    Menú");
        btn_menu.setActionCommand("Ciudadano");
        btn_menu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(13, 4, 248)));
        btn_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_menu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        jL_logo_ulp.setBackground(new java.awt.Color(0, 0, 255));
        jL_logo_ulp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo-ulp.png"))); // NOI18N
        jL_logo_ulp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_logo_ulpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JP_tituloLayout = new javax.swing.GroupLayout(JP_titulo);
        JP_titulo.setLayout(JP_tituloLayout);
        JP_tituloLayout.setHorizontalGroup(
            JP_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_tituloLayout.createSequentialGroup()
                .addComponent(btn_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(107, 107, 107)
                .addComponent(jL_logo_ulp, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JP_tituloLayout.setVerticalGroup(
            JP_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_tituloLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(JP_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_tituloLayout.createSequentialGroup()
                        .addComponent(jL_logo_ulp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        JP_Botones.setkGradientFocus(1400);
        JP_Botones.setkStartColor(new java.awt.Color(17, 24, 39));

        btn_ciudadano.setBackground(new java.awt.Color(23, 37, 84));
        btn_ciudadano.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_ciudadano.setForeground(new java.awt.Color(204, 204, 204));
        btn_ciudadano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ciudadano-ico.png"))); // NOI18N
        btn_ciudadano.setText("    Ciudadano");
        btn_ciudadano.setActionCommand("Ciudadano");
        btn_ciudadano.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(13, 4, 248)));
        btn_ciudadano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ciudadano.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ciudadano.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_ciudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ciudadanoActionPerformed(evt);
            }
        });

        btn_laboratorio.setBackground(new java.awt.Color(23, 37, 84));
        btn_laboratorio.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_laboratorio.setForeground(new java.awt.Color(204, 204, 204));
        btn_laboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/laboratorio-ico.png"))); // NOI18N
        btn_laboratorio.setText("    Laboratorio");
        btn_laboratorio.setActionCommand("Ciudadano");
        btn_laboratorio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(13, 4, 248)));
        btn_laboratorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_laboratorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_laboratorio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laboratorioActionPerformed(evt);
            }
        });

        btn_centro_vacunacion.setBackground(new java.awt.Color(23, 37, 84));
        btn_centro_vacunacion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_centro_vacunacion.setForeground(new java.awt.Color(204, 204, 204));
        btn_centro_vacunacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/hospital-ico.png"))); // NOI18N
        btn_centro_vacunacion.setText("    Centro de Vacunación");
        btn_centro_vacunacion.setActionCommand("Ciudadano");
        btn_centro_vacunacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(13, 4, 248)));
        btn_centro_vacunacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_centro_vacunacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_centro_vacunacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_centro_vacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_centro_vacunacionActionPerformed(evt);
            }
        });

        btn_vacuna.setBackground(new java.awt.Color(23, 37, 84));
        btn_vacuna.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_vacuna.setForeground(new java.awt.Color(204, 204, 204));
        btn_vacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/vacuna-ico.png"))); // NOI18N
        btn_vacuna.setText("    Vacuna");
        btn_vacuna.setActionCommand("Ciudadano");
        btn_vacuna.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(13, 4, 248)));
        btn_vacuna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vacuna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_vacuna.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_vacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vacunaActionPerformed(evt);
            }
        });

        btn_cita_vacunacion.setBackground(new java.awt.Color(23, 37, 84));
        btn_cita_vacunacion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_cita_vacunacion.setForeground(new java.awt.Color(204, 204, 204));
        btn_cita_vacunacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cita-vacun-ico.png"))); // NOI18N
        btn_cita_vacunacion.setText("    Cita Vacunación");
        btn_cita_vacunacion.setActionCommand("Ciudadano");
        btn_cita_vacunacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(13, 4, 248)));
        btn_cita_vacunacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cita_vacunacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_cita_vacunacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_cita_vacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cita_vacunacionActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(23, 37, 84));
        btn_salir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(204, 204, 204));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/salir-ico.png"))); // NOI18N
        btn_salir.setText("    Salir");
        btn_salir.setActionCommand("Ciudadano");
        btn_salir.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(13, 4, 248)));
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jL_fechaHora.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jL_fechaHora.setForeground(new java.awt.Color(153, 153, 255));
        jL_fechaHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_fechaHora.setText("{dayname} {day} de {month} de {year}");
        jL_fechaHora.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(13, 4, 248)));
        jL_fechaHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout JP_BotonesLayout = new javax.swing.GroupLayout(JP_Botones);
        JP_Botones.setLayout(JP_BotonesLayout);
        JP_BotonesLayout.setHorizontalGroup(
            JP_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ciudadano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_laboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_vacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_cita_vacunacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_centro_vacunacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_fechaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JP_BotonesLayout.setVerticalGroup(
            JP_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_fechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ciudadano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_laboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_vacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_centro_vacunacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_cita_vacunacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        JP_informacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(13, 4, 248)), "Sobre nuestro Sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(53, 88, 152))); // NOI18N
        JP_informacion.setForeground(new java.awt.Color(204, 204, 204));
        JP_informacion.setkEndColor(new java.awt.Color(30, 58, 138));
        JP_informacion.setkStartColor(new java.awt.Color(24, 24, 27));

        jLabel1.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("\"Está diseñado para administar");

        jLabel4.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("el proceso de vacunación.");

        jLabel5.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Permite a las autoridades de");

        jLabel6.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("salud gestionar la asignación");

        jLabel7.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("de citas de vacunación, el registro");

        jLabel10.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("de ciudadanos, el seguimiento de");

        jLabel11.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("la dosis de la vacuna y la ");

        jLabel12.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("generación de informes. Los");

        jLabel13.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("ciudadanos pueden inscribirse en el");

        jLabel14.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("formulario de vacunación y ");

        jLabel15.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("programar citas para recibir sus ");

        jLabel16.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("dosis. El sistema garantiza que las ");

        jLabel17.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("segundas dosis se administren a");

        jLabel18.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("tiempo y permite reprogramar");

        jLabel19.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("citas si las dosis son insuficientes.");

        jLabel20.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Además, realiza un seguimiento ");

        jLabel21.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("detallado de las vacunas por");

        jLabel22.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("laboratorio y centro de vacunación.\"");

        javax.swing.GroupLayout JP_informacionLayout = new javax.swing.GroupLayout(JP_informacion);
        JP_informacion.setLayout(JP_informacionLayout);
        JP_informacionLayout.setHorizontalGroup(
            JP_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_informacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_informacionLayout.createSequentialGroup()
                        .addGroup(JP_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JP_informacionLayout.setVerticalGroup(
            JP_informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_informacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jPanel_Escritorio.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopVacunaLayout = new javax.swing.GroupLayout(jDesktopVacuna);
        jDesktopVacuna.setLayout(jDesktopVacunaLayout);
        jDesktopVacunaLayout.setHorizontalGroup(
            jDesktopVacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        jDesktopVacunaLayout.setVerticalGroup(
            jDesktopVacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel_Escritorio.add(jDesktopVacuna, java.awt.BorderLayout.CENTER);
        jPanel_Escritorio.add(jDesktopVacuna, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JP_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(JP_Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel_Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(JP_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(852, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JP_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JP_Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(JP_informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        if (menuDesplegado) {
            int iconWidth = btn_ciudadano.getWidth();
            desplazar.desplazarDerecha(JP_Botones, JP_Botones.getX(), JP_Botones.getX() + iconWidth, 10, 10);
            btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/menú-ico.png")));
        } else {
            int panelWidth = JP_Botones.getWidth();
            desplazar.desplazarIzquierda(JP_Botones, JP_Botones.getX(), JP_Botones.getX() - panelWidth, 10, 10);

            btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/flecha-icoo.png")));
        }

        menuDesplegado = !menuDesplegado; // Cambia el estado del menú

    }//GEN-LAST:event_btn_menuActionPerformed

    //BOTON SALIR
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(
                this, "¿Seguro que deseas salir?", "Salida", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            jPanel_Escritorio.removeAll();
            jPanel_Escritorio.add(jDesktopVacuna, BorderLayout.CENTER);
            jPanel_Escritorio.setVisible(true);

            this.dispose(); // cierra la ventana en la que estamos
            //nos vemos en disny!
            System.exit(0);
        }
    }//GEN-LAST:event_btn_salirActionPerformed

    //BOTON CIUDADANO
    private void btn_ciudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ciudadanoActionPerformed
        jPanel_Escritorio.removeAll();
        jPanel_Escritorio.add(ciudadanoVista, BorderLayout.CENTER);
        ciudadanoVista.setVisible(true);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();
    }//GEN-LAST:event_btn_ciudadanoActionPerformed

    //BOTON LABORATORIO
    private void btn_laboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laboratorioActionPerformed
        jPanel_Escritorio.removeAll();
        jPanel_Escritorio.add(laboratorioVista, BorderLayout.CENTER);
        laboratorioVista.setVisible(true);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();
    }//GEN-LAST:event_btn_laboratorioActionPerformed

    private void jL_logo_ulpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_logo_ulpMouseClicked
        // en vez boton volver al escritotio usaremos el logo para mostrar el escritorio
        jPanel_Escritorio.removeAll();
        jPanel_Escritorio.add(jDesktopVacuna);
        jDesktopVacuna.setVisible(true);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();
//        mostrarEscritorio();
    }//GEN-LAST:event_jL_logo_ulpMouseClicked

    private void btn_cita_vacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cita_vacunacionActionPerformed
        jPanel_Escritorio.removeAll();
        jPanel_Escritorio.add(citaVacunacionVista, BorderLayout.CENTER);
        citaVacunacionVista.setVisible(true);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();


    }//GEN-LAST:event_btn_cita_vacunacionActionPerformed

    private void btn_centro_vacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_centro_vacunacionActionPerformed
        jPanel_Escritorio.removeAll();
        jPanel_Escritorio.add(centroVacunacionVista, BorderLayout.CENTER);
        centroVacunacionVista.setVisible(true);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();
    }//GEN-LAST:event_btn_centro_vacunacionActionPerformed

    private void btn_vacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vacunaActionPerformed
        jPanel_Escritorio.removeAll();
        jPanel_Escritorio.add(vacunaVista, BorderLayout.CENTER);
        vacunaVista.setVisible(true);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();

    }//GEN-LAST:event_btn_vacunaActionPerformed

    //VUELVE A MOSTRAR EL ESCRITORIO AL CLICKEAR LOGO ULP (funcion escondida -_º)...
    private void mostrarEscritorio() {
        jPanel_Escritorio.removeAll();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/escritorio_principal.jpg"));
        Image image = icon.getImage();
        jDesktopVacuna = new JDesktopPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jPanel_Escritorio.setSize(jPanel_Escritorio.getWidth(), jDesktopVacuna.getHeight());
        jPanel_Escritorio.setVisible(true);
        jPanel_Escritorio.add(jDesktopVacuna);
        //  jD_desktop   activo en el jPanel_desktop
        jPanel_Escritorio.setComponentZOrder(jDesktopVacuna, 0);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();
    }

    private void conifgDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        jL_fechaHora.setText(now.format(DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
        try {
            UIManager.setLookAndFeel(new McWinLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        // crea e inicializa el  principal
        java.awt.EventQueue.invokeLater(() -> {
            Principal principal = new Principal();  // misma intancia
            principal.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public keeptoo.KGradientPanel JP_Botones;
    private keeptoo.KGradientPanel JP_informacion;
    public keeptoo.KGradientPanel JP_titulo;
    public javax.swing.JButton btn_centro_vacunacion;
    public javax.swing.JButton btn_cita_vacunacion;
    public javax.swing.JButton btn_ciudadano;
    public javax.swing.JButton btn_laboratorio;
    private javax.swing.JButton btn_menu;
    public javax.swing.JButton btn_salir;
    public javax.swing.JButton btn_vacuna;
    private javax.swing.JDesktopPane jDesktopVacuna;
    private javax.swing.JLabel jL_fechaHora;
    public javax.swing.JLabel jL_logo_ulp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_Escritorio;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables

}
