package vistas2;

import Entidades.Laboratorio;
import accesoADatos.Conexion;
import accesoADatos.LaboratorioData;
import accesoADatos.VacunaData;
import java.sql.Connection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilidades.LabPaisMarca;
import utilidades.LaboratoriosPaisMarca;
import utilidades.ValidarCUIT;

/**
 *
 * @author Gonz@_
 */
public class LaboratorioVista_2 extends javax.swing.JPanel {

    private DefaultTableModel modelo;
    private LaboratorioData laboratoriodata;
    private Laboratorio laboratorio;
    private Connection con = null;
//    DefaultTableModel model = new DefaultTableModel(); //tabla
    private VacunaVista_2 vacunaVista;
    private VacunaData vacunaData;

    /**
     * Creates new form LaboratorioVista_2
     */
    public LaboratorioVista_2() {
        con = Conexion.getConexion();
        initComponents();
        txt_id.setVisible(false);
        laboratoriodata = new LaboratorioData(con);

        this.laboratorio = new Laboratorio();
        CitaVacunacionVista citaVacunacionVista = null;
        this.vacunaVista = new VacunaVista_2(citaVacunacionVista);
        // Inicializa el ComboBox de laboratorios
        LaboratoriosPaisMarca.cargarLaboratorios(jCB_nombreLavoratorio);

        // Agrega un listener para manejar la selección de laboratorio
        jCB_nombreLavoratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_nombreLavoratorioActionPerformed(evt);
            }
        });

        modelo = new DefaultTableModel();
        LlenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_laboratorio_fondo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_laboratorio = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txt_Laboratorio_Cuit = new javax.swing.JTextField();
        txt_Laboratorio_domComercial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        jCB_nombreLavoratorio = new javax.swing.JComboBox<>();
        jCB_lab_pais = new javax.swing.JComboBox<>();
        jPanel_titulo_ciudadano1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        btn_laboratorio_agregar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btn_laboratorio_modificar = new javax.swing.JButton();
        btn_laboratorio_eliminar = new javax.swing.JButton();
        btn_buscar_laboratotio = new javax.swing.JButton();
        jPanel_listar_laboratorio = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txt_laboratorio_buscar = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_laboratorio_tabla = new javax.swing.JTable();
        jPanel_titulo_ciudadano2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        btn_laboratorio_nuevo = new javax.swing.JButton();

        jP_laboratorio_fondo.setBackground(new java.awt.Color(137, 161, 209));

        jTabbedPane1.setBackground(new java.awt.Color(191, 200, 209));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jPanel_laboratorio.setBackground(new java.awt.Color(59, 66, 109));

        jPanel6.setBackground(new java.awt.Color(191, 200, 209));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Laboratorio_Cuit.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(txt_Laboratorio_Cuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        txt_Laboratorio_domComercial.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(txt_Laboratorio_domComercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 30));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(59, 66, 109));
        jLabel18.setText("Nomre Laboratorio");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 30));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(59, 66, 109));
        jLabel19.setText("CUIT:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 30));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(59, 66, 109));
        jLabel20.setText("País:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 30));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(59, 66, 109));
        jLabel22.setText("Dominio Comercial:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 30));
        jPanel6.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 70, 30));

        jCB_nombreLavoratorio.setBackground(new java.awt.Color(137, 161, 209));
        jCB_nombreLavoratorio.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCB_nombreLavoratorio.setForeground(new java.awt.Color(59, 66, 109));
        jCB_nombreLavoratorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laboratorio" }));
        jCB_nombreLavoratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_nombreLavoratorioActionPerformed(evt);
            }
        });
        jPanel6.add(jCB_nombreLavoratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        jCB_lab_pais.setBackground(new java.awt.Color(137, 161, 209));
        jCB_lab_pais.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCB_lab_pais.setForeground(new java.awt.Color(59, 66, 109));
        jCB_lab_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "País Origen" }));
        jCB_lab_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_lab_paisActionPerformed(evt);
            }
        });
        jPanel6.add(jCB_lab_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 32));

        jPanel_titulo_ciudadano1.setBackground(new java.awt.Color(108, 132, 197));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 52, 59));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario Laboratorio");
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

        btn_laboratorio_agregar.setBackground(new java.awt.Color(59, 66, 109));
        btn_laboratorio_agregar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_laboratorio_agregar.setForeground(new java.awt.Color(246, 247, 248));
        btn_laboratorio_agregar.setText("Agregar");
        btn_laboratorio_agregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_laboratorio_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laboratorio_agregarActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator6.setForeground(new java.awt.Color(48, 52, 59));

        btn_laboratorio_modificar.setBackground(new java.awt.Color(59, 66, 109));
        btn_laboratorio_modificar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_laboratorio_modificar.setForeground(new java.awt.Color(246, 247, 248));
        btn_laboratorio_modificar.setText("Modificar");
        btn_laboratorio_modificar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_laboratorio_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laboratorio_modificarActionPerformed(evt);
            }
        });

        btn_laboratorio_eliminar.setBackground(new java.awt.Color(59, 66, 109));
        btn_laboratorio_eliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_laboratorio_eliminar.setForeground(new java.awt.Color(246, 247, 248));
        btn_laboratorio_eliminar.setText("Eliminar");
        btn_laboratorio_eliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_laboratorio_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laboratorio_eliminarActionPerformed(evt);
            }
        });

        btn_buscar_laboratotio.setBackground(new java.awt.Color(59, 66, 109));
        btn_buscar_laboratotio.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_buscar_laboratotio.setForeground(new java.awt.Color(246, 247, 248));
        btn_buscar_laboratotio.setText("Buscar");
        btn_buscar_laboratotio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_buscar_laboratotio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_laboratotioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btn_buscar_laboratotio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btn_laboratorio_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btn_laboratorio_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(104, 104, 104)
                .addComponent(btn_laboratorio_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(58, 58, 58))
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
                    .addComponent(btn_laboratorio_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_laboratorio_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_laboratorio_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_laboratotio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel_laboratorioLayout = new javax.swing.GroupLayout(jPanel_laboratorio);
        jPanel_laboratorio.setLayout(jPanel_laboratorioLayout);
        jPanel_laboratorioLayout.setHorizontalGroup(
            jPanel_laboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo_ciudadano1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_laboratorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_laboratorioLayout.setVerticalGroup(
            jPanel_laboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_laboratorioLayout.createSequentialGroup()
                .addComponent(jPanel_titulo_ciudadano1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Laboratorio", jPanel_laboratorio);

        jPanel_listar_laboratorio.setBackground(new java.awt.Color(59, 66, 109));

        jPanel7.setBackground(new java.awt.Color(191, 200, 209));

        txt_laboratorio_buscar.setBackground(new java.awt.Color(137, 161, 209));

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(59, 66, 109));
        jLabel27.setText("Buscar:");

        jTable_laboratorio_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Laboratorio", "CUIT", "Nombre Laboratorio", "País", "Dominio Comercial"
            }
        ));
        jTable_laboratorio_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_laboratorio_tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_laboratorio_tabla);

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
                        .addComponent(txt_laboratorio_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_laboratorio_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_titulo_ciudadano2.setBackground(new java.awt.Color(108, 132, 197));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(48, 52, 59));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Laboratorios");
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

        btn_laboratorio_nuevo.setBackground(new java.awt.Color(59, 66, 109));
        btn_laboratorio_nuevo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_laboratorio_nuevo.setForeground(new java.awt.Color(246, 247, 248));
        btn_laboratorio_nuevo.setText("Nuevo");
        btn_laboratorio_nuevo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_laboratorio_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laboratorio_nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btn_laboratorio_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btn_laboratorio_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel_listar_laboratorioLayout = new javax.swing.GroupLayout(jPanel_listar_laboratorio);
        jPanel_listar_laboratorio.setLayout(jPanel_listar_laboratorioLayout);
        jPanel_listar_laboratorioLayout.setHorizontalGroup(
            jPanel_listar_laboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo_ciudadano2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_listar_laboratorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_listar_laboratorioLayout.setVerticalGroup(
            jPanel_listar_laboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_listar_laboratorioLayout.createSequentialGroup()
                .addComponent(jPanel_titulo_ciudadano2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista Laboratorio", jPanel_listar_laboratorio);

        javax.swing.GroupLayout jP_laboratorio_fondoLayout = new javax.swing.GroupLayout(jP_laboratorio_fondo);
        jP_laboratorio_fondo.setLayout(jP_laboratorio_fondoLayout);
        jP_laboratorio_fondoLayout.setHorizontalGroup(
            jP_laboratorio_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        jP_laboratorio_fondoLayout.setVerticalGroup(
            jP_laboratorio_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_laboratorio_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_laboratorio_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_laboratorio_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laboratorio_eliminarActionPerformed
        String cuit = txt_Laboratorio_Cuit.getText();

        Laboratorio laboratorio = laboratoriodata.obtenerLaboratorioPorCUIT(cuit);

        if (laboratorio != null) {

            int idLaboratorio = laboratorio.getIdLaboratorio();

            laboratoriodata.eliminarLaboratorio(idLaboratorio);
            limpiarCampos();
            LlenarTabla();
            JOptionPane.showMessageDialog(null, "Laboratorio eliminado correctamente.");

        } else {

            JOptionPane.showMessageDialog(null, "Laboratorio no encontrado.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_laboratorio_eliminarActionPerformed

    private void btn_laboratorio_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laboratorio_agregarActionPerformed
        try {
            String cuitCompleto = txt_Laboratorio_Cuit.getText();
            String nombreLaboratorio = jCB_nombreLavoratorio.getSelectedItem().toString();
            String pais = jCB_lab_pais.getSelectedItem().toString();
            String direccion = txt_Laboratorio_domComercial.getText();

            //  valida el CUIT
            if (!ValidarCUIT.esUnCUITValido(cuitCompleto)) {
                String cuitSinUltimoDigito = cuitCompleto.substring(0, 10);
                int digitoVerificadorCalculado = ValidarCUIT.calcularDigitoVerificador(cuitSinUltimoDigito);
                int option = JOptionPane.showConfirmDialog(
                        null,
                        "El CUIT ingresado es incorrecto. ¿Desea utilizar el CUIT corregido: " + cuitSinUltimoDigito + digitoVerificadorCalculado + "?",
                        "Confirmación",
                        JOptionPane.YES_NO_OPTION
                );
                if (option == JOptionPane.YES_OPTION) {
                    cuitCompleto = cuitSinUltimoDigito + digitoVerificadorCalculado;
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha agregado el laboratorio debido a un CUIT incorrecto.", "", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Crear un nuevo laboratorio con el ID en este caso se le asigna 0, ya que se generará automáticamente en la base de datos
            Laboratorio laboratorio = new Laboratorio(0, cuitCompleto, nombreLaboratorio, pais, direccion);
            laboratoriodata.agregarLaboratorio(laboratorio);
            limpiarCampos();
            LlenarTabla();
            JOptionPane.showMessageDialog(null, "Laboratorio agregado correctamente.");

        } catch (Exception e) {
            System.err.println("Error al agregar laboratorio: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al agregar laboratorio.", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_laboratorio_agregarActionPerformed

    //BOTON MODIFICAR
    private void btn_laboratorio_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laboratorio_modificarActionPerformed
        String cuit = txt_Laboratorio_Cuit.getText();

        Laboratorio laboratorioExistente = laboratoriodata.obtenerLaboratorioPorCUIT(cuit);

        if (laboratorioExistente != null) {
            int idLaboratorio = laboratorioExistente.getIdLaboratorio();

            String nombreLaboratorio = jCB_nombreLavoratorio.getSelectedItem().toString();
            String pais = jCB_lab_pais.getSelectedItem().toString();
            String domComercial = txt_Laboratorio_domComercial.getText();

            Laboratorio laboratorioModificado = new Laboratorio(idLaboratorio, cuit, nombreLaboratorio, pais, domComercial);
            laboratoriodata.actualizarLaboratorio(laboratorioModificado);
            limpiarCampos();
            LlenarTabla();
            JOptionPane.showMessageDialog(null, "Laboratorio actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Laboratorio no encontrado.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_laboratorio_modificarActionPerformed

    //BOTON BUSCAR
    private void btn_buscar_laboratotioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_laboratotioActionPerformed
        String cuit = txt_Laboratorio_Cuit.getText();

        Laboratorio laboratorio = laboratoriodata.obtenerLaboratorioPorCUIT(cuit);
        if (laboratorio != null) {
            // Establece los valores seleccionados en los JComboBox.
            jCB_nombreLavoratorio.setSelectedItem(laboratorio.getNomLaboratorio());
            jCB_lab_pais.setSelectedItem(laboratorio.getPais());
            txt_Laboratorio_domComercial.setText(laboratorio.getDomComercial());
        } else {
            JOptionPane.showMessageDialog(null, "Laboratorio no encontrado.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscar_laboratotioActionPerformed

    //COMBOBOX PADRE QUE ARMA LOS OTROS DOS
    private void jCB_nombreLavoratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_nombreLavoratorioActionPerformed
        String laboratorioSeleccionado = (String) jCB_nombreLavoratorio.getSelectedItem();  //// Evento que se ejecuta al seleccionar un laboratorio en el ComboBox padre  
        LaboratoriosPaisMarca.cargarPaises(jCB_lab_pais, laboratorioSeleccionado);
        LaboratoriosPaisMarca.cargarMarcas(vacunaVista.jComboBox1_Marca, laboratorioSeleccionado);

    }//GEN-LAST:event_jCB_nombreLavoratorioActionPerformed

    private void jCB_lab_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_lab_paisActionPerformed

    }//GEN-LAST:event_jCB_lab_paisActionPerformed

    private void btn_laboratorio_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laboratorio_nuevoActionPerformed
        //        if (jPanel_centroVac.isVisible()) {
        //            jPanel_centroVac.setVisible(false); // Ocultar el JPanel
        //        } else {
        //            jPanel_centroVac.setVisible(true); // Mostrar el JPanel
        //        }
        //        jBGuardar.setEnabled(true);
        //ciudadanoControlador.limpiarCampos();
    }//GEN-LAST:event_btn_laboratorio_nuevoActionPerformed

    private void jTable_laboratorio_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_laboratorio_tablaMouseClicked
        if (evt.getClickCount() == 1) {
            JTable tablaPendiente = (JTable) evt.getSource();
            txt_id.setText(tablaPendiente.getModel().getValueAt(tablaPendiente.getSelectedRow(), 0).toString());
            txt_Laboratorio_Cuit.setText(tablaPendiente.getModel().getValueAt(tablaPendiente.getSelectedRow(), 1).toString());
            jCB_nombreLavoratorio.setSelectedItem(tablaPendiente.getModel().getValueAt(tablaPendiente.getSelectedRow(), 2).toString());
            jCB_lab_pais.setSelectedItem(tablaPendiente.getModel().getValueAt(tablaPendiente.getSelectedRow(), 3).toString());
            txt_Laboratorio_domComercial.setText(tablaPendiente.getModel().getValueAt(tablaPendiente.getSelectedRow(), 4).toString());
        }

    }//GEN-LAST:event_jTable_laboratorio_tablaMouseClicked

    //LIMPIA LOS CAMPOS LUEGO DEL USO DE ALGUN BOTON
    public void limpiarCampos() {
        txt_Laboratorio_Cuit.setText("");
        jCB_nombreLavoratorio.setSelectedItem("Laboratorio");
        jCB_lab_pais.setSelectedItem("Pais Origen");
        txt_Laboratorio_domComercial.setText("");
    }

//    // Método para cargar los laboratorios en el ComboBox padre (jCB_nombreLavoratorio)
//    private void cargarLaboratorios() {
//        String[] laboratorios = LabPaisMarca.obtenerLaboratorios();
//        jCB_nombreLavoratorio.setModel(new DefaultComboBoxModel<>(laboratorios));
//    }
//
//// Método para cargar el país y la marca basados en la selección del laboratorio
//    private void cargarPaisYMarcaPorLaboratorio(String laboratorio) {
//        String pais = LabPaisMarca.obtenerPaisPorLaboratorio(laboratorio);
//        String marca = LabPaisMarca.obtenerMarcaPorLaboratorio(laboratorio);
//
//        // Actualiza los JComboBox de país y marca
//        jCB_lab_pais.setSelectedItem(pais);
//        vacunaVista.jComboBox1_Marca.setSelectedItem(marca);
//    }
    private void LlenarTabla() {
        try {
            modelo = (DefaultTableModel) jTable_laboratorio_tabla.getModel();
            laboratoriodata.listarLaboratorios().forEach(c -> modelo.addRow(new Object[]{
                c.getIdLaboratorio(),
                c.getCuit(),
                c.getNomLaboratorio(),
                c.getPais(),
                c.getDomComercial(),}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_laboratotio;
    public javax.swing.JButton btn_laboratorio_agregar;
    public javax.swing.JButton btn_laboratorio_eliminar;
    public javax.swing.JButton btn_laboratorio_modificar;
    public javax.swing.JButton btn_laboratorio_nuevo;
    public javax.swing.JComboBox<String> jCB_lab_pais;
    public javax.swing.JComboBox<String> jCB_nombreLavoratorio;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jP_laboratorio_fondo;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_laboratorio;
    private javax.swing.JPanel jPanel_listar_laboratorio;
    private javax.swing.JPanel jPanel_titulo_ciudadano1;
    private javax.swing.JPanel jPanel_titulo_ciudadano2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable_laboratorio_tabla;
    public javax.swing.JTextField txt_Laboratorio_Cuit;
    public javax.swing.JTextField txt_Laboratorio_domComercial;
    public javax.swing.JLabel txt_id;
    public javax.swing.JTextField txt_laboratorio_buscar;
    // End of variables declaration//GEN-END:variables
}
