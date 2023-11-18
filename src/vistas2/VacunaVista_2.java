package vistas2;

import Entidades.Vacuna;
import accesoADatos.Conexion;
import accesoADatos.VacunaData;
import java.sql.Connection;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.LaboratoriosPaisMarca;

/**
 *
 * @author Gonz@_
 */
public class VacunaVista_2 extends javax.swing.JPanel {

    private boolean esAplicada = false;
    private VacunaData vacunaData;
    private Vacuna vacunActual = null;
    private Vacuna borrar = null;
    private Vacuna vacunaEncontrada = null;
    private Connection conexion;
    private boolean colocada;
//    private String[] marcas = {"Moderna", "Pfizer", "AstraZeneca", "Sinopharm", "Sputnik"};
    private String[] medidas = {"0.3", "0.5", "0.9"};
    private DefaultTableModel modelo;
    private CitaVacunacionVista citaVacunacionVista;

    /**
     * Creates new form VacunaVista
     */
    public VacunaVista_2(CitaVacunacionVista citaVacunacionVista1) {
        this.citaVacunacionVista = citaVacunacionVista;
        conexion = Conexion.getConexion();
        initComponents();
//        cargarMarcas();
        LaboratoriosPaisMarca.cargarLaboratorios(jComboBox1_Marca);
        cargarMedidas();
        vacunaData = new VacunaData();
        citaVacunacionVista = new CitaVacunacionVista();
        jRadioButtonSi.setSelected(false);
        jRadioButtonNo.setSelected(true); ///valor incio
        modelo = new DefaultTableModel();
//        LlenarTabla();
        llenarTablaConVacunas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_aplicada = new javax.swing.ButtonGroup();
        jP_vacuna_fondo = new javax.swing.JPanel();
        jTabbedPane_listar_vacuna = new javax.swing.JTabbedPane();
        jPanel_vacuna = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jText_numSerie = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jRadioButtonNo = new javax.swing.JCheckBox();
        jRadioButtonSi = new javax.swing.JCheckBox();
        jComboBox1_Marca = new javax.swing.JComboBox<>();
        jComboBox2_Medida = new javax.swing.JComboBox<>();
        jCFechaCad = new com.toedter.calendar.JDateChooser();
        jPanel_titulo_ciudadano1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jButton1_Agregar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jButton3_Modificar = new javax.swing.JButton();
        jButton4_Eliminar = new javax.swing.JButton();
        jButton2_Buscar = new javax.swing.JButton();
        jPanel_listar_ciudadano = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txt_centroVacunacion_buscar = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_vacuna_tabla = new javax.swing.JTable();
        jPanel_titulo_ciudadano2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        btn_centroVacunacion_nuevo = new javax.swing.JButton();

        jP_vacuna_fondo.setBackground(new java.awt.Color(137, 161, 209));

        jTabbedPane_listar_vacuna.setBackground(new java.awt.Color(191, 200, 209));
        jTabbedPane_listar_vacuna.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jPanel_vacuna.setBackground(new java.awt.Color(59, 66, 109));

        jPanel6.setBackground(new java.awt.Color(191, 200, 209));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jText_numSerie.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(jText_numSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(59, 66, 109));
        jLabel18.setText("Marca:");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 30));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(59, 66, 109));
        jLabel19.setText("Nímero de Serie");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 30));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(59, 66, 109));
        jLabel20.setText("Medida:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 30));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(59, 66, 109));
        jLabel22.setText("Vacuna Aplicada:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 140, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 20, 240));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(59, 66, 109));
        jLabel23.setText("Fecha Caducidad:");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 30));

        jRadioButtonNo.setBackground(new java.awt.Color(191, 200, 209));
        buttonGroup_aplicada.add(jRadioButtonNo);
        jRadioButtonNo.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jRadioButtonNo.setForeground(new java.awt.Color(59, 66, 109));
        jRadioButtonNo.setText("No");
        jRadioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButtonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 30));

        jRadioButtonSi.setBackground(new java.awt.Color(191, 200, 209));
        buttonGroup_aplicada.add(jRadioButtonSi);
        jRadioButtonSi.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jRadioButtonSi.setForeground(new java.awt.Color(59, 66, 109));
        jRadioButtonSi.setText("Si");
        jRadioButtonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSiActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButtonSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, 30));

        jComboBox1_Marca.setBackground(new java.awt.Color(137, 161, 209));
        jComboBox1_Marca.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jComboBox1_Marca.setForeground(new java.awt.Color(59, 66, 109));
        jComboBox1_Marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca" }));
        jComboBox1_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_MarcaActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        jComboBox2_Medida.setBackground(new java.awt.Color(137, 161, 209));
        jComboBox2_Medida.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jComboBox2_Medida.setForeground(new java.awt.Color(59, 66, 109));
        jComboBox2_Medida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medida" }));
        jComboBox2_Medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2_MedidaActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox2_Medida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 32));

        jCFechaCad.setBackground(new java.awt.Color(137, 161, 209));
        jCFechaCad.setForeground(new java.awt.Color(59, 66, 109));
        jCFechaCad.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel6.add(jCFechaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 30));

        jPanel_titulo_ciudadano1.setBackground(new java.awt.Color(108, 132, 197));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 52, 59));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario Vacuna");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator5.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator5.setForeground(new java.awt.Color(48, 52, 59));

        javax.swing.GroupLayout jPanel_titulo_ciudadano1Layout = new javax.swing.GroupLayout(jPanel_titulo_ciudadano1);
        jPanel_titulo_ciudadano1.setLayout(jPanel_titulo_ciudadano1Layout);
        jPanel_titulo_ciudadano1Layout.setHorizontalGroup(
            jPanel_titulo_ciudadano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadano1Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGap(149, 149, 149))
                .addGroup(jPanel_titulo_ciudadano1Layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGap(269, 269, 269)))
        );
        jPanel_titulo_ciudadano1Layout.setVerticalGroup(
            jPanel_titulo_ciudadano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadano1Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel9.setBackground(new java.awt.Color(108, 132, 197));

        jButton1_Agregar.setBackground(new java.awt.Color(59, 66, 109));
        jButton1_Agregar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1_Agregar.setForeground(new java.awt.Color(246, 247, 248));
        jButton1_Agregar.setText("Agregar");
        jButton1_Agregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        jButton1_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_AgregarActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator6.setForeground(new java.awt.Color(48, 52, 59));

        jButton3_Modificar.setBackground(new java.awt.Color(59, 66, 109));
        jButton3_Modificar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3_Modificar.setForeground(new java.awt.Color(246, 247, 248));
        jButton3_Modificar.setText("Modificar");
        jButton3_Modificar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        jButton3_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_ModificarActionPerformed(evt);
            }
        });

        jButton4_Eliminar.setBackground(new java.awt.Color(59, 66, 109));
        jButton4_Eliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton4_Eliminar.setForeground(new java.awt.Color(246, 247, 248));
        jButton4_Eliminar.setText("Eliminar");
        jButton4_Eliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        jButton4_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_EliminarActionPerformed(evt);
            }
        });

        jButton2_Buscar.setBackground(new java.awt.Color(59, 66, 109));
        jButton2_Buscar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2_Buscar.setForeground(new java.awt.Color(246, 247, 248));
        jButton2_Buscar.setText("Buscar");
        jButton2_Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        jButton2_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton2_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jButton1_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(107, 107, 107)
                .addComponent(jButton3_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(117, 117, 117)
                .addComponent(jButton4_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel_vacunaLayout = new javax.swing.GroupLayout(jPanel_vacuna);
        jPanel_vacuna.setLayout(jPanel_vacunaLayout);
        jPanel_vacunaLayout.setHorizontalGroup(
            jPanel_vacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo_ciudadano1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_vacunaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_vacunaLayout.setVerticalGroup(
            jPanel_vacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_vacunaLayout.createSequentialGroup()
                .addComponent(jPanel_titulo_ciudadano1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_listar_vacuna.addTab("Vacuna", jPanel_vacuna);

        jPanel_listar_ciudadano.setBackground(new java.awt.Color(59, 66, 109));

        jPanel7.setBackground(new java.awt.Color(191, 200, 209));

        txt_centroVacunacion_buscar.setBackground(new java.awt.Color(137, 161, 209));

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(59, 66, 109));
        jLabel27.setText("Buscar:");

        jTable_vacuna_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° SerieDosis", "Marca", "Medida", "Fecha Caducidad", "Vacuna Aplicada"
            }
        ));
        jScrollPane1.setViewportView(jTable_vacuna_tabla);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_centroVacunacion_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_centroVacunacion_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_titulo_ciudadano2.setBackground(new java.awt.Color(108, 132, 197));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(48, 52, 59));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Vacunas");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator7.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator7.setForeground(new java.awt.Color(48, 52, 59));

        javax.swing.GroupLayout jPanel_titulo_ciudadano2Layout = new javax.swing.GroupLayout(jPanel_titulo_ciudadano2);
        jPanel_titulo_ciudadano2.setLayout(jPanel_titulo_ciudadano2Layout);
        jPanel_titulo_ciudadano2Layout.setHorizontalGroup(
            jPanel_titulo_ciudadano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadano2Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGap(149, 149, 149))
                .addGroup(jPanel_titulo_ciudadano2Layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGap(269, 269, 269)))
        );
        jPanel_titulo_ciudadano2Layout.setVerticalGroup(
            jPanel_titulo_ciudadano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadano2Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel10.setBackground(new java.awt.Color(108, 132, 197));

        jSeparator8.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator8.setForeground(new java.awt.Color(48, 52, 59));

        btn_centroVacunacion_nuevo.setBackground(new java.awt.Color(59, 66, 109));
        btn_centroVacunacion_nuevo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_centroVacunacion_nuevo.setForeground(new java.awt.Color(246, 247, 248));
        btn_centroVacunacion_nuevo.setText("Nuevo");
        btn_centroVacunacion_nuevo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_centroVacunacion_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_centroVacunacion_nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btn_centroVacunacion_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_centroVacunacion_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel_listar_ciudadanoLayout = new javax.swing.GroupLayout(jPanel_listar_ciudadano);
        jPanel_listar_ciudadano.setLayout(jPanel_listar_ciudadanoLayout);
        jPanel_listar_ciudadanoLayout.setHorizontalGroup(
            jPanel_listar_ciudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo_ciudadano2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_listar_ciudadanoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_listar_ciudadanoLayout.setVerticalGroup(
            jPanel_listar_ciudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_listar_ciudadanoLayout.createSequentialGroup()
                .addComponent(jPanel_titulo_ciudadano2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_listar_vacuna.addTab("Lista Vacuna", jPanel_listar_ciudadano);

        javax.swing.GroupLayout jP_vacuna_fondoLayout = new javax.swing.GroupLayout(jP_vacuna_fondo);
        jP_vacuna_fondo.setLayout(jP_vacuna_fondoLayout);
        jP_vacuna_fondoLayout.setHorizontalGroup(
            jP_vacuna_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_listar_vacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        jP_vacuna_fondoLayout.setVerticalGroup(
            jP_vacuna_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_listar_vacuna)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_vacuna_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_vacuna_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_AgregarActionPerformed
        int nroSerieDosis = 0;
        try {
            nroSerieDosis = Integer.parseInt(jText_numSerie.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El n° de Serie debe contener solo numeros");
        }
        String marca = jComboBox1_Marca.getSelectedItem().toString();
        double medida = Double.parseDouble(jComboBox2_Medida.getSelectedItem().toString());
        java.util.Date utilDate = jCFechaCad.getDate();
        if (utilDate != null) {
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            boolean colocada = jRadioButtonSi.isSelected();
            if (vacunActual == null) {
                vacunActual = new Vacuna(nroSerieDosis, marca, medida, sqlDate, colocada);
            }

            vacunaData.cargarVacunas(vacunActual);

            limpiarCampos();
             jRadioButtonNo.setSelected(true);
            llenarTablaConVacunas(); 
             
        } else {
            JOptionPane.showMessageDialog(this, "La fecha de caducidad no está seleccionada");
        }
        citaVacunacionVista.cargarNroSerieDosis();
    }//GEN-LAST:event_jButton1_AgregarActionPerformed

    private void jButton3_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_ModificarActionPerformed
        Vacuna vacunActual = null;
        int nroSerieDosis;
        try {
            nroSerieDosis = Integer.parseInt(jText_numSerie.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El n° de Serie debe contener solo numeros");
            return;
        }
        Vacuna vacunaEncontrada = vacunaData.obtenerVacunaPorNroSerie(nroSerieDosis);

        if (vacunaEncontrada != null) {
            String marca = jComboBox1_Marca.getSelectedItem().toString();
            double medida = Double.parseDouble(jComboBox2_Medida.getSelectedItem().toString());
            java.util.Date utilDate = jCFechaCad.getDate();
            if (utilDate != null) {
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                boolean colocada = jRadioButtonSi.isSelected();

                if (vacunActual == null) {
                    vacunActual = new Vacuna(nroSerieDosis, marca, medida, sqlDate, colocada);
                }

                vacunaData.modificarStockVacunas(vacunActual);

                limpiarCampos();
                 jRadioButtonNo.setSelected(true);
                llenarTablaConVacunas() ;
                JOptionPane.showMessageDialog(this, "Vacuna modificada con éxito");

            } else {
                JOptionPane.showMessageDialog(this, "Vacuna no encontrada!");
            }
        }
    }//GEN-LAST:event_jButton3_ModificarActionPerformed

    private void jButton4_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_EliminarActionPerformed
        Vacuna vacunActual = null;
        int nroSerieDosis;
        try {
            nroSerieDosis = Integer.parseInt(jText_numSerie.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El n° de Serie debe contener solo numeros");
            return;
        }
        Vacuna vacunaEncontrada = vacunaData.obtenerVacunaPorNroSerie(nroSerieDosis);

        if (vacunaEncontrada != null) {
            boolean colocada = true;
            if (vacunActual == null) {
                vacunActual = new Vacuna(nroSerieDosis, vacunaEncontrada.getMarca(), vacunaEncontrada.getMedida(), vacunaEncontrada.getFechaCaduca(), colocada);
            }
            vacunaData.modificarStockVacunas(vacunActual);
            limpiarCampos();
             jRadioButtonNo.setSelected(true);
               llenarTablaConVacunas(); 
            JOptionPane.showMessageDialog(this, "Vacuna modificada con éxito");

        } else {
            JOptionPane.showMessageDialog(this, "Vacuna no encontrada!");
        }
    }//GEN-LAST:event_jButton4_EliminarActionPerformed

    private void jRadioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoActionPerformed
        esAplicada = !jRadioButtonNo.isSelected();
    }//GEN-LAST:event_jRadioButtonNoActionPerformed

    private void jRadioButtonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSiActionPerformed
        esAplicada = jRadioButtonSi.isSelected();
    }//GEN-LAST:event_jRadioButtonSiActionPerformed

    private void jComboBox1_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_MarcaActionPerformed

    }//GEN-LAST:event_jComboBox1_MarcaActionPerformed

    private void jComboBox2_MedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2_MedidaActionPerformed

    }//GEN-LAST:event_jComboBox2_MedidaActionPerformed

    private void jButton2_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_BuscarActionPerformed
        int nroSerieDosis;
        try {
            nroSerieDosis = Integer.parseInt(jText_numSerie.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El n° de Serie debe contener solo numeros");
            return;
        }
        Vacuna vacunaEncontrada = vacunaData.obtenerVacunaPorNroSerie(nroSerieDosis);

        //        JOptionPane.showMessageDialog(this, vacunaEncontrada);   // para ver si llega vacuna de la BD
        if (vacunaEncontrada != null) {
            jComboBox1_Marca.setSelectedItem(vacunaEncontrada.getMarca());

            for (int i = 0; i < jComboBox1_Marca.getItemCount(); i++) {
                if (vacunaEncontrada.getMarca().equals(jComboBox1_Marca.getItemAt(i))) {

                    jComboBox1_Marca.setSelectedIndex(i);
                    break;
                }
            }

            jComboBox2_Medida.setSelectedItem(vacunaEncontrada.getMedida());

            for (int i = 0; i < jComboBox2_Medida.getItemCount(); i++) {
                if (vacunaEncontrada.getMedida() == (Double.valueOf(jComboBox2_Medida.getItemAt(i)))) {
                    jComboBox2_Medida.setSelectedIndex(i);
                    break;
                }
            }

            jCFechaCad.setDate(vacunaEncontrada.getFechaCaduca());

            if (vacunaEncontrada.isColocada() == true) {
                jRadioButtonSi.setSelected(true);

            } else {
                jRadioButtonNo.setSelected(true);
            }

            
        } else {
            JOptionPane.showMessageDialog(this, "Vacuna no encontrada!");
        }
    }//GEN-LAST:event_jButton2_BuscarActionPerformed

    private void btn_centroVacunacion_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_centroVacunacion_nuevoActionPerformed
//        if (jPanel_centroVac.isVisible()) {
//            jPanel_centroVac.setVisible(false); // Ocultar el JPanel
//        } else {
//            jPanel_centroVac.setVisible(true); // Mostrar el JPanel
//        }
        //        jBGuardar.setEnabled(true);
        //ciudadanoControlador.limpiarCampos();
    }//GEN-LAST:event_btn_centroVacunacion_nuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_centroVacunacion_nuevo;
    private javax.swing.ButtonGroup buttonGroup_aplicada;
    public javax.swing.JButton jButton1_Agregar;
    public javax.swing.JButton jButton2_Buscar;
    public javax.swing.JButton jButton3_Modificar;
    public javax.swing.JButton jButton4_Eliminar;
    private com.toedter.calendar.JDateChooser jCFechaCad;
    public javax.swing.JComboBox<String> jComboBox1_Marca;
    public javax.swing.JComboBox<String> jComboBox2_Medida;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jP_vacuna_fondo;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_listar_ciudadano;
    private javax.swing.JPanel jPanel_titulo_ciudadano1;
    private javax.swing.JPanel jPanel_titulo_ciudadano2;
    private javax.swing.JPanel jPanel_vacuna;
    public javax.swing.JCheckBox jRadioButtonNo;
    public javax.swing.JCheckBox jRadioButtonSi;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane_listar_vacuna;
    public javax.swing.JTable jTable_vacuna_tabla;
    public javax.swing.JTextField jText_numSerie;
    public javax.swing.JTextField txt_centroVacunacion_buscar;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jText_numSerie.setText("");
        jComboBox1_Marca.setSelectedItem("Marca");
        jComboBox2_Medida.setSelectedItem("Medida");
        jCFechaCad.setDate(null);
        buttonGroup_aplicada.clearSelection();
    }

    public boolean esAplicada() {
        return esAplicada;
    }

//    private void cargarMarcas() {
//        jComboBox1_Marca.setModel(new DefaultComboBoxModel<>(marcas));
//    }
    private void cargarMedidas() {
        jComboBox2_Medida.setModel(new DefaultComboBoxModel<>(medidas));
    }

//    private void LlenarTabla() {
//        try {
//            modelo = (DefaultTableModel) jTable_vacuna_tabla.getModel();
//            vacunaData.listarVacunas().forEach(v -> modelo.addRow(new Object[]{
//                v.getNroSerieDosis(),
//                v.getMarca(),
//                v.getMedida(),
//                v.getFechaCaduca(),
//                v.isColocada()
//            }));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
// ...
    private void llenarTablaConVacunas() {
        DefaultTableModel modelo = (DefaultTableModel) jTable_vacuna_tabla.getModel();
        List<Vacuna> vacunas = vacunaData.listarVacunas();

        modelo.setRowCount(0);

        for (Vacuna vacuna : vacunas) {
            Object[] fila = new Object[5];
            fila[0] = vacuna.getNroSerieDosis();
            fila[1] = vacuna.getMarca();
            fila[2] = vacuna.getMedida();
            fila[3] = vacuna.getFechaCaduca();
            fila[4] = vacuna.isColocada();

            modelo.addRow(fila);
        }
    }

}
