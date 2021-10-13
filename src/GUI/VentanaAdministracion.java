/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import modelo.domain.TipoAeronave;
import modelo.domain.*;
import controlador.Controlador;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class VentanaAdministracion extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;

    private DefaultListModel dlmCR = new DefaultListModel();
    private DefaultListModel dlmVA = new DefaultListModel();

    /**
     * Creates new form VentanaAdministracion
     *
     * @param c : controlador
     * @param p : previo JFrame
     */
    public VentanaAdministracion(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();
        limpiarTodo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbTripulantes = new javax.swing.JTable();
        txtIdTripulante = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listTripulantes_CapacitacionesRealizadas = new javax.swing.JList<>();
        btnTripulantes_Eliminar = new javax.swing.JButton();
        btnTripulantes_Limpiar = new javax.swing.JButton();
        btnTripulantes_Guardar = new javax.swing.JButton();
        btnTripulantes_CapacitacionesAgregar = new javax.swing.JButton();
        btnTripulantes_CapacitacionesRemover = new javax.swing.JButton();
        dpFechaNac = new org.jdesktop.swingx.JXDatePicker();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        listVuelos_TripulacionAsignados = new javax.swing.JList<>();
        btnTripulantes_VuelosAgregar = new javax.swing.JButton();
        btnTripulantes_VuelosRemover = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cbTripulantes_CapacitacionesDisponibles = new javax.swing.JComboBox<>();
        cbVuelos_TripulacionDisponibles = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        dpSalida = new org.jdesktop.swingx.JXDatePicker();
        dpArribo = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        cbAeronave = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVuelos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVuelos_Reservas = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnVuelos_Eliminar = new javax.swing.JButton();
        btnVuelos_Limpiar = new javax.swing.JButton();
        btnVuelos_Guardar = new javax.swing.JButton();
        txtIdVuelo = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        txtDistancia = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbVuelos_Tripulacion = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbAeronaves = new javax.swing.JTable();
        cbTipoAeronave = new javax.swing.JComboBox<>();
        txtModelo = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtIdAeronave = new javax.swing.JTextField();
        btnAeronaves_Eliminar = new javax.swing.JButton();
        btnAeronaves_Limpiar = new javax.swing.JButton();
        btnAeronaves_Guardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtIdTipoAeronave = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTipoAeronaves = new javax.swing.JTable();
        btnTipoAeronaves_Eliminar = new javax.swing.JButton();
        btnTipoAeronaves_Limpiar = new javax.swing.JButton();
        btnTipoAeronaves_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administracion");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel14.setText("idTripulante");

        jLabel15.setText("Nombre");

        jLabel16.setText("Apellido");

        jLabel17.setText("Telefono");

        jLabel18.setText("Email");

        jLabel19.setText("F. Nacimien");

        tbTripulantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idTripulante", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbTripulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbTripulantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTripulantesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbTripulantes);

        txtIdTripulante.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("CAPACIT. TIPO AERON.");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("VUELOS");

        jLabel23.setText("Realizadas");

        listTripulantes_CapacitacionesRealizadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane7.setViewportView(listTripulantes_CapacitacionesRealizadas);

        btnTripulantes_Eliminar.setText("Eliminar");
        btnTripulantes_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripulantes_EliminarActionPerformed(evt);
            }
        });

        btnTripulantes_Limpiar.setText("Limpiar");
        btnTripulantes_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripulantes_LimpiarActionPerformed(evt);
            }
        });

        btnTripulantes_Guardar.setText("Guardar");
        btnTripulantes_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripulantes_GuardarActionPerformed(evt);
            }
        });

        btnTripulantes_CapacitacionesAgregar.setText("Agregar>>");
        btnTripulantes_CapacitacionesAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripulantes_CapacitacionesAgregarActionPerformed(evt);
            }
        });

        btnTripulantes_CapacitacionesRemover.setText("<<Quitar");
        btnTripulantes_CapacitacionesRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripulantes_CapacitacionesRemoverActionPerformed(evt);
            }
        });

        jLabel30.setText("Disponibles");

        jLabel31.setText("Asignados");

        listVuelos_TripulacionAsignados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane12.setViewportView(listVuelos_TripulacionAsignados);

        btnTripulantes_VuelosAgregar.setText("Agregar>>");
        btnTripulantes_VuelosAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripulantes_VuelosAgregarActionPerformed(evt);
            }
        });

        btnTripulantes_VuelosRemover.setText("<<Quitar");
        btnTripulantes_VuelosRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripulantes_VuelosRemoverActionPerformed(evt);
            }
        });

        jLabel12.setText("Disponibles");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(btnTripulantes_CapacitacionesAgregar)
                                        .addGap(99, 99, 99)
                                        .addComponent(btnTripulantes_CapacitacionesRemover))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbTripulantes_CapacitacionesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnTripulantes_VuelosAgregar)
                                        .addGap(99, 99, 99)
                                        .addComponent(btnTripulantes_VuelosRemover)
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbVuelos_TripulacionDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel30))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel31)
                                            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addGap(145, 145, 145))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIdTripulante, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(dpFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTripulantes_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTripulantes_Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTripulantes_Guardar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtIdTripulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(dpFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(cbVuelos_TripulacionDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTripulantes_CapacitacionesRemover)
                            .addComponent(btnTripulantes_CapacitacionesAgregar)
                            .addComponent(btnTripulantes_VuelosRemover)
                            .addComponent(btnTripulantes_VuelosAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTripulantes_Eliminar)
                            .addComponent(btnTripulantes_Limpiar)
                            .addComponent(btnTripulantes_Guardar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbTripulantes_CapacitacionesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane12, jScrollPane7});

        jTabbedPane1.addTab("TRIPULANTES", jPanel2);

        jLabel2.setText("idVuelo");

        jLabel3.setText("Origen");

        jLabel4.setText("Destino");

        jLabel5.setText("F. Salida");

        jLabel6.setText("F. Arribo");

        jLabel7.setText("Distancia");

        jLabel8.setText("Aeronave");

        tbVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idVuelo", "Origen", "Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVuelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVuelos);

        jLabel10.setText("RESERVAS");

        tbVuelos_Reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "idReserva", "Apellido"
            }
        ));
        jScrollPane2.setViewportView(tbVuelos_Reservas);

        jLabel11.setText("TRIPULACION");

        btnVuelos_Eliminar.setText("Eliminar");
        btnVuelos_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelos_EliminarActionPerformed(evt);
            }
        });

        btnVuelos_Limpiar.setText("Limpiar");
        btnVuelos_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelos_LimpiarActionPerformed(evt);
            }
        });

        btnVuelos_Guardar.setText("Guardar");
        btnVuelos_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelos_GuardarActionPerformed(evt);
            }
        });

        txtIdVuelo.setEnabled(false);

        tbVuelos_Tripulacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "idTripulante", "Apellido"
            }
        ));
        jScrollPane8.setViewportView(tbVuelos_Tripulacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtOrigen))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)
                                        .addComponent(txtIdVuelo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dpArribo, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                            .addComponent(txtDestino)
                                            .addComponent(dpSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbAeronave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDistancia))))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(0, 194, Short.MAX_VALUE))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVuelos_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVuelos_Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVuelos_Guardar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(txtIdVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(dpSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(dpArribo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cbAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVuelos_Eliminar)
                    .addComponent(btnVuelos_Guardar)
                    .addComponent(btnVuelos_Limpiar))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane2, jScrollPane8});

        jTabbedPane1.addTab("VUELOS", jPanel1);

        jLabel24.setText("idAeronave");

        jLabel25.setText("Fabricante");

        jLabel26.setText("Modelo");

        jLabel27.setText("TipoAeronave");

        tbAeronaves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idAeronave", "Fabricante", "Modelo", "TipoAeronave"
            }
        ));
        tbAeronaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAeronavesMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbAeronaves);

        txtIdAeronave.setEnabled(false);

        btnAeronaves_Eliminar.setText("Eliminar");
        btnAeronaves_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAeronaves_EliminarActionPerformed(evt);
            }
        });

        btnAeronaves_Limpiar.setText("Limpiar");
        btnAeronaves_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAeronaves_LimpiarActionPerformed(evt);
            }
        });

        btnAeronaves_Guardar.setText("Guardar");
        btnAeronaves_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAeronaves_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo)
                            .addComponent(cbTipoAeronave, 0, 254, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFabricante)
                            .addComponent(txtIdAeronave))))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAeronaves_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAeronaves_Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAeronaves_Guardar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtIdAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(cbTipoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAeronaves_Limpiar)
                    .addComponent(btnAeronaves_Guardar)
                    .addComponent(btnAeronaves_Eliminar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("AERONAVES", jPanel3);

        jLabel13.setText("idTipoAeronave");

        jLabel22.setText("Descripcion");

        txtIdTipoAeronave.setEnabled(false);

        tbTipoAeronaves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "idTipoAeronave", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbTipoAeronaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTipoAeronavesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbTipoAeronaves);

        btnTipoAeronaves_Eliminar.setText("Eliminar");
        btnTipoAeronaves_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoAeronaves_EliminarActionPerformed(evt);
            }
        });

        btnTipoAeronaves_Limpiar.setText("Limpiar");
        btnTipoAeronaves_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoAeronaves_LimpiarActionPerformed(evt);
            }
        });

        btnTipoAeronaves_Guardar.setText("Guardar");
        btnTipoAeronaves_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoAeronaves_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdTipoAeronave, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTipoAeronaves_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTipoAeronaves_Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTipoAeronaves_Guardar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtIdTipoAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTipoAeronaves_Limpiar)
                    .addComponent(btnTipoAeronaves_Guardar)
                    .addComponent(btnTipoAeronaves_Eliminar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("TIPO AERONAVES", jPanel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ADMINISTRACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnTripulantes_VuelosRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripulantes_VuelosRemoverActionPerformed
        if (this.listVuelos_TripulacionAsignados.isSelectionEmpty() || this.tbTripulantes.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tripulante y un vuelo", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Vuelo vaux = this.listVuelos_TripulacionAsignados.getSelectedValue();
            Vuelo v = this.controlador.buscarVuelo(vaux.getIdVuelo());
            Tripulante t = this.controlador.buscarTripulante((Long) this.tbTripulantes.getModel().getValueAt(this.tbTripulantes.getSelectedRow(), 0));
            this.controlador.removerVueloTripulante(t, v);
            dlmVA.removeElement(v);
            this.listVuelos_TripulacionAsignados.setModel(dlmVA);
        }
        this.listVuelos_TripulacionAsignados.setSelectedIndex(-1);
    }//GEN-LAST:event_btnTripulantes_VuelosRemoverActionPerformed

    private void btnTripulantes_VuelosAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripulantes_VuelosAgregarActionPerformed
        if (this.cbVuelos_TripulacionDisponibles.getItemCount() == 0 || this.tbTripulantes.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tripulante y un vuelo", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            Vuelo vaux = this.cbVuelos_TripulacionDisponibles.getItemAt(this.cbVuelos_TripulacionDisponibles.getSelectedIndex());
            Vuelo v = this.controlador.buscarVuelo(vaux.getIdVuelo());
            Tripulante t = this.controlador.buscarTripulante((Long) this.tbTripulantes.getModel().getValueAt(this.tbTripulantes.getSelectedRow(), 0));

            if (dlmVA.contains(v)) {
                JOptionPane.showMessageDialog(null, "El tripulante ya se encuentra asignado a dicho vuelo", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!t.getTipoAeronaves().contains(v.getAeronave().getTipoAeronave())) {
                JOptionPane.showMessageDialog(null, "El tripulante no cuenta con la capacitacion para realizar este vuelo", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                this.controlador.agregarVueloTripulante(t, v);
                dlmVA.addElement(v);
                this.listVuelos_TripulacionAsignados.setModel(dlmVA);
            }
        }
        this.listVuelos_TripulacionAsignados.setSelectedIndex(-1);
        this.cbVuelos_TripulacionDisponibles.setSelectedIndex(-1);
    }//GEN-LAST:event_btnTripulantes_VuelosAgregarActionPerformed

    private void btnTripulantes_CapacitacionesRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripulantes_CapacitacionesRemoverActionPerformed
        if (this.listTripulantes_CapacitacionesRealizadas.isSelectionEmpty() || this.tbTripulantes.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tripulante y un tipo de aeronave", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Tripulante t = this.controlador.buscarTripulante((Long) this.tbTripulantes.getModel().getValueAt(this.tbTripulantes.getSelectedRow(), 0));
            TipoAeronave taaux = this.listTripulantes_CapacitacionesRealizadas.getSelectedValue();
            TipoAeronave ta = this.controlador.buscarTipoAeronave(taaux.getIdTipoAeronave());
            this.controlador.removerTipoAeronaveTripulante(t, ta);
            dlmCR.removeElement(ta);
            this.listTripulantes_CapacitacionesRealizadas.setModel(dlmCR);
        }
        this.listTripulantes_CapacitacionesRealizadas.setSelectedIndex(-1);
    }//GEN-LAST:event_btnTripulantes_CapacitacionesRemoverActionPerformed

    private void btnTripulantes_CapacitacionesAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripulantes_CapacitacionesAgregarActionPerformed
        if (this.cbTripulantes_CapacitacionesDisponibles.getItemCount() == 0 || this.tbTripulantes.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tripulante y un tipo de aeronave", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            TipoAeronave taaux = this.cbTripulantes_CapacitacionesDisponibles.getItemAt(this.cbTripulantes_CapacitacionesDisponibles.getSelectedIndex());
            TipoAeronave ta = this.controlador.buscarTipoAeronave(taaux.getIdTipoAeronave());
            Tripulante t = this.controlador.buscarTripulante((Long) this.tbTripulantes.getModel().getValueAt(this.tbTripulantes.getSelectedRow(), 0));
            if (dlmCR.contains(ta)) {
                JOptionPane.showMessageDialog(null, "El tripulante ya tiene esta capacitacion", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                this.controlador.agregarTipoAeronaveTripulante(t, ta);
                dlmCR.addElement(ta);
                this.listTripulantes_CapacitacionesRealizadas.setModel(dlmCR);
            }
        }
        this.listTripulantes_CapacitacionesRealizadas.setSelectedIndex(-1);
        this.cbTripulantes_CapacitacionesDisponibles.setSelectedIndex(-1);
    }//GEN-LAST:event_btnTripulantes_CapacitacionesAgregarActionPerformed

    private void btnTripulantes_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripulantes_GuardarActionPerformed
        if (!this.tbTripulantes.getSelectionModel().isSelectionEmpty()) {
            Tripulante t = this.controlador.buscarTripulante((Long) this.tbTripulantes.getModel().getValueAt(this.tbTripulantes.getSelectedRow(), 0));
            this.controlador.editarTripulante(t, this.txtNombre.getText(), this.txtApellido.getText(), this.txtTelefono.getText(),
                    this.txtEmail.getText(), this.dpFechaNac.getDate(), null, null);
        } else {
            this.controlador.agregarTripulante(this.txtNombre.getText(), this.txtApellido.getText(), this.txtTelefono.getText(),
                    this.txtEmail.getText(), this.dpFechaNac.getDate(), null, null);
        }

        limpiarTodo();
    }//GEN-LAST:event_btnTripulantes_GuardarActionPerformed

    private void tbTripulantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTripulantesMouseClicked
        if (!this.tbTripulantes.getSelectionModel().isSelectionEmpty()) {
            Tripulante t = this.controlador.buscarTripulante((Long) this.tbTripulantes.getModel().getValueAt(this.tbTripulantes.getSelectedRow(), 0));

            this.txtIdTripulante.setText(t.getIdTripulante().toString());
            this.txtNombre.setText(t.getNombre());
            this.txtApellido.setText(t.getApellido());
            this.txtTelefono.setText(t.getTelefono());
            this.txtEmail.setText(t.getEmail());
            this.dpFechaNac.setDate(t.getFnac());

            dlmCR.removeAllElements();
            List<TipoAeronave> tipoaeronaves = this.controlador.buscarTripulante(t.getIdTripulante()).getTipoAeronaves();
            for (TipoAeronave ta : tipoaeronaves) {
                dlmCR.addElement(ta);
            }
            this.listTripulantes_CapacitacionesRealizadas.setModel(dlmCR);

            dlmVA.removeAllElements();
            //List<Vuelo> vue = t.getVueloes();
            List<Vuelo> vuelos = this.controlador.buscarTripulante(t.getIdTripulante()).getVueloes();
            System.out.println(vuelos.toString());
            for (Vuelo v : vuelos) {
                dlmVA.addElement(v);
            }
            this.listVuelos_TripulacionAsignados.setModel(dlmVA);
        }
    }//GEN-LAST:event_tbTripulantesMouseClicked

    private void btnVuelos_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelos_GuardarActionPerformed

        if (!this.tbVuelos.getSelectionModel().isSelectionEmpty()) {
            Vuelo v = this.controlador.buscarVuelo((Long) this.tbVuelos.getModel().getValueAt(this.tbVuelos.getSelectedRow(), 0));
            this.controlador.editarVuelo(v, this.txtOrigen.getText().toUpperCase(), this.txtDestino.getText().toUpperCase(),
                    this.dpSalida.getDate(), this.dpArribo.getDate(), Integer.parseInt(this.txtDistancia.getText()),
                    this.cbAeronave.getModel().getElementAt(this.cbAeronave.getSelectedIndex()), null, null);
        } else {
            this.controlador.agregarVuelo(this.txtOrigen.getText().toUpperCase(), this.txtDestino.getText().toUpperCase(),
                    this.dpSalida.getDate(), this.dpArribo.getDate(), Integer.parseInt(this.txtDistancia.getText()),
                    this.cbAeronave.getModel().getElementAt(this.cbAeronave.getSelectedIndex()), null, null);
        }
        limpiarTodo();
    }//GEN-LAST:event_btnVuelos_GuardarActionPerformed

    private void btnTipoAeronaves_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoAeronaves_GuardarActionPerformed
        if (!this.tbTipoAeronaves.getSelectionModel().isSelectionEmpty()) {
            TipoAeronave ta = this.controlador.buscarTipoAeronave((Long) this.tbTipoAeronaves.getModel().getValueAt(this.tbTipoAeronaves.getSelectedRow(), 0));
            this.controlador.editarTipoAeronave(ta, this.txtDescripcion.getText().toUpperCase(), null, null);
        } else {
            this.controlador.agregarTipoAeronave(this.txtDescripcion.getText().toUpperCase(), null, null);
        }
        limpiarTodo();
    }//GEN-LAST:event_btnTipoAeronaves_GuardarActionPerformed

    private void btnAeronaves_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAeronaves_GuardarActionPerformed

        if (!this.tbAeronaves.getSelectionModel().isSelectionEmpty()) {
            Aeronave a = this.controlador.buscarAeronave((Long) this.tbAeronaves.getModel().getValueAt(this.tbAeronaves.getSelectedRow(), 0));
            this.controlador.editarAeronave(a, this.txtFabricante.getText().toUpperCase(), this.txtModelo.getText().toUpperCase(),
                    this.cbTipoAeronave.getModel().getElementAt(this.cbTipoAeronave.getSelectedIndex()), null);
        } else {
            this.controlador.agregarAeronave(this.txtFabricante.getText().toUpperCase(), this.txtModelo.getText().toUpperCase(),
                    this.cbTipoAeronave.getModel().getElementAt(this.cbTipoAeronave.getSelectedIndex()), null);
        }

        limpiarTodo();
    }//GEN-LAST:event_btnAeronaves_GuardarActionPerformed

    private void tbTipoAeronavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTipoAeronavesMouseClicked
        if (!this.tbTipoAeronaves.getSelectionModel().isSelectionEmpty()) {
            TipoAeronave ta = this.controlador.buscarTipoAeronave((Long) this.tbTipoAeronaves.getModel().getValueAt(this.tbTipoAeronaves.getSelectedRow(), 0));
            this.txtIdTipoAeronave.setText(ta.getIdTipoAeronave().toString());
            this.txtDescripcion.setText(ta.getDescripcion());

        }
    }//GEN-LAST:event_tbTipoAeronavesMouseClicked

    private void tbAeronavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAeronavesMouseClicked
        if (!this.tbAeronaves.getSelectionModel().isSelectionEmpty()) {
            Aeronave a = this.controlador.buscarAeronave((Long) this.tbAeronaves.getModel().getValueAt(this.tbAeronaves.getSelectedRow(), 0));
            this.txtIdAeronave.setText(a.getIdAeronave().toString());
            this.txtFabricante.setText(a.getFabricante());
            this.txtModelo.setText(a.getModelo());
            this.cbTipoAeronave.setSelectedItem(a.getTipoAeronave());
        }
    }//GEN-LAST:event_tbAeronavesMouseClicked

    private void tbVuelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVuelosMouseClicked
        if (!this.tbVuelos.getSelectionModel().isSelectionEmpty()) {
            Vuelo v = this.controlador.buscarVuelo((Long) this.tbVuelos.getModel().getValueAt(this.tbVuelos.getSelectedRow(), 0));
            this.txtIdVuelo.setText(v.getIdVuelo().toString());
            this.txtOrigen.setText(v.getOrigen());
            this.txtDestino.setText(v.getDestino());
            this.dpSalida.setDate(v.getFechaSalida());
            this.dpArribo.setDate(v.getFechaArribo());
            this.txtDistancia.setText(String.valueOf(v.getDistancia()));
            this.cbAeronave.setSelectedItem(v.getAeronave());

            Object[] nombreColumnas = {"idTripulante", "Apellido"};
            DefaultTableModel dtmVT = new DefaultTableModel(new Object[0][0], nombreColumnas);
            List<Tripulante> tripulantes = this.controlador.buscarVuelo(v.getIdVuelo()).getTripulantes();
            for (Tripulante tripulante : tripulantes) {
                Object[] t = new Object[2];
                t[0] = tripulante.getIdTripulante();
                t[1] = tripulante.getApellido();
                dtmVT.addRow(t);
            }
            this.tbVuelos_Tripulacion.setModel(dtmVT);

            Object[] nombreColumnas2 = {"idReserva", "Apellido"};
            DefaultTableModel dtmVR = new DefaultTableModel(new Object[0][0], nombreColumnas2);
            List<Reserva> reservas = this.controlador.buscarVuelo(v.getIdVuelo()).getReservas();
            for (Reserva reserva : reservas) {
                Object[] t = new Object[2];
                t[0] = reserva.getIdReserva();
                t[1] = reserva.getPasajero().getApellido();
                dtmVR.addRow(t);
            }
            this.tbVuelos_Reservas.setModel(dtmVR);
        }

    }//GEN-LAST:event_tbVuelosMouseClicked

    private void btnTipoAeronaves_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoAeronaves_LimpiarActionPerformed
        limpiarTodo();
    }//GEN-LAST:event_btnTipoAeronaves_LimpiarActionPerformed

    private void btnAeronaves_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAeronaves_LimpiarActionPerformed
        limpiarTodo();
    }//GEN-LAST:event_btnAeronaves_LimpiarActionPerformed

    private void btnVuelos_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelos_LimpiarActionPerformed
        limpiarTodo();
    }//GEN-LAST:event_btnVuelos_LimpiarActionPerformed

    private void btnTripulantes_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripulantes_LimpiarActionPerformed
        limpiarTodo();
    }//GEN-LAST:event_btnTripulantes_LimpiarActionPerformed

    private void btnTipoAeronaves_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoAeronaves_EliminarActionPerformed
        if (!this.tbTipoAeronaves.getSelectionModel().isSelectionEmpty()) {
            TipoAeronave ta = this.controlador.buscarTipoAeronave((Long) this.tbTipoAeronaves.getModel().getValueAt(this.tbTipoAeronaves.getSelectedRow(), 0));
            if (this.controlador.eliminarTipoAeronave(ta) == 0) {
                JOptionPane.showMessageDialog(null, "TIPO DE AERONAVE ELIMINADO CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "VERIFIQUE LAS CAPACITACIONES DE LOS TRIPULANTES", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de aeronave a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarTodo();
     }//GEN-LAST:event_btnTipoAeronaves_EliminarActionPerformed

    private void btnAeronaves_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAeronaves_EliminarActionPerformed
        if (!this.tbAeronaves.getSelectionModel().isSelectionEmpty()) {
            Aeronave a = this.controlador.buscarAeronave((Long) this.tbAeronaves.getModel().getValueAt(this.tbAeronaves.getSelectedRow(), 0));
            if (this.controlador.eliminarAeronave(a) == 0) {
                JOptionPane.showMessageDialog(null, "AERONAVE ELIMINADO CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "VERIFIQUE LOS VUELOS DE LA AERONAVE", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un aeronave a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarTodo();
    }//GEN-LAST:event_btnAeronaves_EliminarActionPerformed

    private void btnVuelos_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelos_EliminarActionPerformed
        if (!this.tbVuelos.getSelectionModel().isSelectionEmpty()) {
            Vuelo v = this.controlador.buscarVuelo((Long) this.tbVuelos.getModel().getValueAt(this.tbVuelos.getSelectedRow(), 0));
            List<Tripulante> t = v.getTripulantes();
            if (this.controlador.eliminarVuelo(v, t) == 0) {
                JOptionPane.showMessageDialog(null, "VUELO ELIMINADO CORRECTAMENTE", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "VERIFIQUE LAS RESERVAS DEL VUELO", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un vuelo a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarTodo();

    }//GEN-LAST:event_btnVuelos_EliminarActionPerformed

    private void btnTripulantes_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripulantes_EliminarActionPerformed
        if (!this.tbTripulantes.getSelectionModel().isSelectionEmpty()) {
            Tripulante t = this.controlador.buscarTripulante((Long) this.tbTripulantes.getModel().getValueAt(this.tbTripulantes.getSelectedRow(), 0));
            if (this.controlador.eliminarTripulante(t) == 0) {
                JOptionPane.showMessageDialog(null, "TRIPULANTE ELIMINADO CORRECTAMENTE", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "VERIFIQUE LOS VUELOS DEL TRIPULANTE", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tripulante a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarTodo();

    }//GEN-LAST:event_btnTripulantes_EliminarActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void limpiarTodo() {
        limpiarTipoAeronaves();
        limpiarAeronaves();
        limpiarVuelos();
        limpiarTripulantes();
    }

    private void limpiarTipoAeronaves() {
        this.txtIdTipoAeronave.setText("");
        this.txtDescripcion.setText("");

        Object[] nombreColumnas = {"idTipoAeronave", "Descripcion"};
        DefaultTableModel dtmTA = new DefaultTableModel(new Object[0][0], nombreColumnas);
        List<TipoAeronave> tipoaeronaves = this.controlador.listarTipoAeronave();
        for (TipoAeronave tipoaeronave : tipoaeronaves) {
            Object[] t = new Object[2];
            t[0] = tipoaeronave.getIdTipoAeronave();
            t[1] = tipoaeronave.getDescripcion();
            dtmTA.addRow(t);
        }
        this.tbTipoAeronaves.setModel(dtmTA);

    }

    public class cbTipoAeronaveListCellRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
            if (value instanceof TipoAeronave) {
                value = ((TipoAeronave) value).getDescripcion();
            }
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            return this;
        }
    }

    private void limpiarAeronaves() {
        this.txtIdAeronave.setText("");
        this.txtFabricante.setText("");
        this.txtModelo.setText("");

        DefaultComboBoxModel cbTA = new DefaultComboBoxModel();
        List<TipoAeronave> tipoaeronaves = this.controlador.listarTipoAeronave();
        for (TipoAeronave tipoaeronave : tipoaeronaves) {
            cbTA.addElement(tipoaeronave);
        }
        this.cbTipoAeronave.setModel(cbTA);
        this.cbTipoAeronave.setRenderer(new cbTipoAeronaveListCellRenderer());
        this.cbTipoAeronave.setSelectedIndex(-1);

        Object[] nombreColumnas = {"idAeronave", "Fabricante", "Modelo", "TipoAeronave"};
        DefaultTableModel dtmA = new DefaultTableModel(new Object[0][0], nombreColumnas);
        List<Aeronave> aeronaves = this.controlador.listarAeronave();
        for (Aeronave aeronave : aeronaves) {
            Object[] t = new Object[4];
            t[0] = aeronave.getIdAeronave();
            t[1] = aeronave.getFabricante();
            t[2] = aeronave.getModelo();
            t[3] = aeronave.getTipoAeronave();
            dtmA.addRow(t);
        }
        this.tbAeronaves.setModel(dtmA);

    }

    public class cbAeronaveListCellRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
            if (value instanceof Aeronave) {
                value = ((Aeronave) value).getModelo();
            }
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            return this;
        }
    }

    private void limpiarVuelos() {
        this.txtIdVuelo.setText("");
        this.txtOrigen.setText("");
        this.txtDestino.setText("");
        this.dpSalida.setDate(null);
        this.dpArribo.setDate(null);
        this.txtDistancia.setText("");

        DefaultComboBoxModel cbA = new DefaultComboBoxModel();
        List<Aeronave> aeronaves = this.controlador.listarAeronave();
        for (Aeronave aeronave : aeronaves) {
            cbA.addElement(aeronave);
        }
        this.cbAeronave.setModel(cbA);
        this.cbAeronave.setRenderer(new cbAeronaveListCellRenderer());
        this.cbAeronave.setSelectedIndex(-1);

        DefaultTableModel dtmVP = (DefaultTableModel) this.tbVuelos_Reservas.getModel();
        dtmVP.getDataVector().removeAllElements();
        dtmVP.fireTableDataChanged();

        DefaultTableModel dtmVT = (DefaultTableModel) this.tbVuelos_Tripulacion.getModel();
        dtmVT.getDataVector().removeAllElements();
        dtmVT.fireTableDataChanged();

        Object[] nombreColumnas = {"idVuelo", "Origen", "Destino"};
        DefaultTableModel dtmV = new DefaultTableModel(new Object[0][0], nombreColumnas);
        List<Vuelo> vuelos = this.controlador.listarVuelos();
        for (Vuelo vuelo : vuelos) {
            Object[] t = new Object[3];
            t[0] = vuelo.getIdVuelo();
            t[1] = vuelo.getOrigen();
            t[2] = vuelo.getDestino();
            dtmV.addRow(t);
        }
        this.tbVuelos.setModel(dtmV);
    }

    private void limpiarTripulantes() {

        this.txtIdTripulante.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtTelefono.setText("");
        this.txtEmail.setText("");
        this.dpFechaNac.setDate(null);

        dlmCR.removeAllElements();
        this.listTripulantes_CapacitacionesRealizadas.setModel(dlmCR);
        dlmVA.removeAllElements();
        this.listVuelos_TripulacionAsignados.setModel(dlmVA);

        Object[] nombreColumnas = {"idTripulante", "Apellido"};
        DefaultTableModel dtmT = new DefaultTableModel(new Object[0][0], nombreColumnas);
        List<Tripulante> tripulantes = this.controlador.listarTripulante();
        for (Tripulante tripulante : tripulantes) {
            Object[] t = new Object[2];
            t[0] = tripulante.getIdTripulante();
            t[1] = tripulante.getApellido();
            dtmT.addRow(t);
        }
        this.tbTripulantes.setModel(dtmT);
        this.tbTripulantes.clearSelection();

        DefaultComboBoxModel dcbmCD = new DefaultComboBoxModel();
        List<TipoAeronave> tipoaeronaves = this.controlador.listarTipoAeronave();
        for (TipoAeronave tipoaeronave : tipoaeronaves) {
            dcbmCD.addElement(tipoaeronave);
        }
        this.cbTripulantes_CapacitacionesDisponibles.setModel(dcbmCD);
        this.cbTripulantes_CapacitacionesDisponibles.setSelectedIndex(-1);

        DefaultComboBoxModel dcbmVD = new DefaultComboBoxModel();
        List<Vuelo> vuelos = this.controlador.listarVuelos();
        for (Vuelo vuelo : vuelos) {
            dcbmVD.addElement(vuelo);
        }
        this.cbVuelos_TripulacionDisponibles.setModel(dcbmVD);
        this.cbVuelos_TripulacionDisponibles.setSelectedIndex(-1);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAeronaves_Eliminar;
    private javax.swing.JButton btnAeronaves_Guardar;
    private javax.swing.JButton btnAeronaves_Limpiar;
    private javax.swing.JButton btnTipoAeronaves_Eliminar;
    private javax.swing.JButton btnTipoAeronaves_Guardar;
    private javax.swing.JButton btnTipoAeronaves_Limpiar;
    private javax.swing.JButton btnTripulantes_CapacitacionesAgregar;
    private javax.swing.JButton btnTripulantes_CapacitacionesRemover;
    private javax.swing.JButton btnTripulantes_Eliminar;
    private javax.swing.JButton btnTripulantes_Guardar;
    private javax.swing.JButton btnTripulantes_Limpiar;
    private javax.swing.JButton btnTripulantes_VuelosAgregar;
    private javax.swing.JButton btnTripulantes_VuelosRemover;
    private javax.swing.JButton btnVuelos_Eliminar;
    private javax.swing.JButton btnVuelos_Guardar;
    private javax.swing.JButton btnVuelos_Limpiar;
    private javax.swing.JComboBox<Aeronave> cbAeronave;
    private javax.swing.JComboBox<TipoAeronave> cbTipoAeronave;
    private javax.swing.JComboBox<TipoAeronave> cbTripulantes_CapacitacionesDisponibles;
    private javax.swing.JComboBox<Vuelo> cbVuelos_TripulacionDisponibles;
    private org.jdesktop.swingx.JXDatePicker dpArribo;
    private org.jdesktop.swingx.JXDatePicker dpFechaNac;
    private org.jdesktop.swingx.JXDatePicker dpSalida;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<TipoAeronave> listTripulantes_CapacitacionesRealizadas;
    private javax.swing.JList<Vuelo> listVuelos_TripulacionAsignados;
    private javax.swing.JTable tbAeronaves;
    private javax.swing.JTable tbTipoAeronaves;
    private javax.swing.JTable tbTripulantes;
    private javax.swing.JTable tbVuelos;
    private javax.swing.JTable tbVuelos_Reservas;
    private javax.swing.JTable tbVuelos_Tripulacion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtIdAeronave;
    private javax.swing.JTextField txtIdTipoAeronave;
    private javax.swing.JTextField txtIdTripulante;
    private javax.swing.JTextField txtIdVuelo;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
