/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.*;
import Modelos.*;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Toshiba
 */
public class Facturas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Facturas
     */
    
    private Menu pane;
    
    public Facturas() {
        initComponents();
    }
    
    public Facturas(Menu pane) {
        initComponents();
        this.pane = pane;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFactura = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jbtnBuscar2 = new javax.swing.JButton();
        jbtnAñadir2 = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FacturasTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jbtnImprimirVisitas = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 684));

        jpFactura.setBackground(new java.awt.Color(255, 255, 255));
        jpFactura.setAlignmentX(3.3F);
        jpFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField9.setBackground(new java.awt.Color(102, 102, 102));
        jTextField9.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(75, 123, 125), 3, true));
        jpFactura.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1000, 40));

        jbtnBuscar2.setBackground(new java.awt.Color(102, 102, 102));
        jbtnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jbtnBuscar2.setToolTipText("");
        jbtnBuscar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jbtnBuscar2.setContentAreaFilled(false);
        jbtnBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBuscar2MouseClicked(evt);
            }
        });
        jbtnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscar2ActionPerformed(evt);
            }
        });
        jpFactura.add(jbtnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 130, 50, 40));

        jbtnAñadir2.setBackground(new java.awt.Color(102, 102, 102));
        jbtnAñadir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-o-mas-en-boton-cuadrado.png"))); // NOI18N
        jbtnAñadir2.setToolTipText("");
        jbtnAñadir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jbtnAñadir2.setContentAreaFilled(false);
        jbtnAñadir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAñadir2MouseClicked(evt);
            }
        });
        jbtnAñadir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAñadir2ActionPerformed(evt);
            }
        });
        jpFactura.add(jbtnAñadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 130, 50, 40));

        jbtnModificar.setBackground(new java.awt.Color(102, 102, 102));
        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anadir-punto-de-anclaje (1).png"))); // NOI18N
        jbtnModificar.setToolTipText("");
        jbtnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 123, 125), 3));
        jbtnModificar.setContentAreaFilled(false);
        jpFactura.add(jbtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 130, 50, 40));

        jScrollPane2.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        FacturasTable.setBackground(new java.awt.Color(75, 123, 125));
        FacturasTable.setForeground(new java.awt.Color(255, 255, 255));
        FacturasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Correlativo", "Vivienda", "Dueño", "Mes"
            }
        ));
        FacturasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturasTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(FacturasTable);

        jpFactura.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 1260, 240));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Modern No. 20", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(75, 123, 125));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FAC.png"))); // NOI18N
        jLabel12.setText("                                   VISITAS");
        jLabel12.setOpaque(true);
        jpFactura.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reportar (1).png"))); // NOI18N
        jpFactura.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 520, -1, 60));

        jbtnImprimirVisitas.setBackground(new java.awt.Color(51, 51, 51));
        jbtnImprimirVisitas.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jbtnImprimirVisitas.setForeground(new java.awt.Color(75, 123, 125));
        jbtnImprimirVisitas.setText("Reporte");
        jbtnImprimirVisitas.setBorder(null);
        jbtnImprimirVisitas.setContentAreaFilled(false);
        jbtnImprimirVisitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnImprimirVisitasMouseClicked(evt);
            }
        });
        jbtnImprimirVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImprimirVisitasActionPerformed(evt);
            }
        });
        jpFactura.add(jbtnImprimirVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    List<Recibos>  listarecibos = new LinkedList<Recibos>();
    DefaultTableModel model = new DefaultTableModel();
    private int IdRecibo = 0;
    
    
    //Residentes obj = new Residentes();
    Usuarios ob=  new Usuarios();
    Visitas o= new Visitas();
    NuevaFactura nueva = new NuevaFactura();
    
    
                    

    
    
     public void llenarTablaVwModelRecibos(){
        model =new DefaultTableModel();
        List<ViewModelRecibos> listaViewModelRecibos= new LinkedList<ViewModelRecibos>();
        FacturasTable.removeAll();
        DALRecibos dalRecibos = new DALRecibos();
      
        try {
            
            
            listaViewModelRecibos = dalRecibos.getViewModelRecibos();
            //DefaultTableModel model = new DefaultTableModel();
            String[] columnas = {"Código de Recibo",
                                "Código de Pago",
                                "idVivienda / IdResidente",
                                "Dueño / Residente",
                                "Descripción",
                                "Tipo Pago",
                                "EstadoPago",
                                "Monto"};
            
            
            model.setColumnIdentifiers(columnas);
            
            
            for(ViewModelRecibos r : listaViewModelRecibos){
                
                Object[] o = new Object[8];
                o[0] = r.getIdRecibos();
                o[1] = r.getIdPago();
                o[2] = r.getIdVivienda()!=0?r.getIdVivienda():r.getIdResidente();
                o[3] = r.getNombreDueno()!=null?r.getNombreDueno():r.getNombreResidente();
                o[4] = r.getDescripcion();
                o[5] = r.getTipoPago();
                o[6] = r.getEstadoPago();
                o[7] = r.getMonto();
                model.addRow(o);
            }
            
            FacturasTable.setModel(model);
            
            
        } catch (Exception ex) {
            
            System.out.println(ex.toString());
          //  Logger.getLogger(PnFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
     
     public void llenarTabla(){
        model =new DefaultTableModel();
        listarecibos = new LinkedList<Recibos>();
        FacturasTable.removeAll();
        DALRecibos recibos = new DALRecibos();
        DALVivienda viviendas = new DALVivienda();
        DALPagos pagos = new DALPagos();
        DALDueno dueno = new DALDueno();

        try {
            
            
            listarecibos = recibos.getRecibos();
            //DefaultTableModel model = new DefaultTableModel();
            String[] columnas = {"Código de Recibo",
                                "Código de Pago",
                                "Vivienda",
                                "Dueño",
                                "Descripción"};
            
            
            model.setColumnIdentifiers(columnas);
            
            
            for(Recibos r : listarecibos){
            
                Pagos pag = pagos.getPagos(r.getIdPago()).get(0);
                Viviendas vivien = viviendas.getViviendas(pag.getIdVivienda()).get(0);
                Modelos.Dueno duen = dueno.getDuenos(vivien.getIdDueno()).get(0);
                Object[] o = new Object[5];
                o[0] = r.getIdRecibos();
                o[1] = r.getIdPago();
                o[2] = pag.getIdVivienda();
                o[3] = duen.getNombre();
                o[4] = r.getDescripcion();
                model.addRow(o);
            }
            
            FacturasTable.setModel(model);
            
            
        } catch (Exception ex) {
            
            System.out.println(ex.toString());
          //  Logger.getLogger(PnFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
     
     public void limpiarformularios(){
        nueva.dispose();
        
    }
     
     
    private void jbtnAñadir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAñadir2MouseClicked
        // TODO add your handling code here:       
       
        
        pane.setNfac(nueva);      
        pane.limpiarformularios();
        nueva = new NuevaFactura();
        nueva.llenarComboBoxFacturas();
        //nueva = new NuevaFactura();
        nueva.setIdRecibo(0);     
        pane.getjDesktopPane1().removeAll();
        pane.getjDesktopPane1().add(nueva);
       
//        nueva.setVisible(true);
        this.setVisible(false);     
        nueva.setVisible(true);
        nueva.setTitle("FACTURAS");
        nueva.show();
     
        

    }//GEN-LAST:event_jbtnAñadir2MouseClicked

    private void FacturasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacturasTableMouseClicked
        // TODO add your handling code here:
        pane.limpiarformularios();
        pane.setNfac(nueva);
        nueva.llenarComboBoxFacturas();
        IdRecibo = (int) FacturasTable.getValueAt(FacturasTable.getSelectedRow(), 0);
        nueva.setIdRecibo(IdRecibo);
        pane.setNfac(nueva);
        nueva.setIdRecibo(IdRecibo);
        nueva.VistaModificar();
        pane.getjDesktopPane1().add(nueva);
   
        nueva.setVisible(true);
        this.setVisible(false);     
        nueva.setVisible(true);
        nueva.setTitle("FACTURAS");
        nueva.show();
        
    }//GEN-LAST:event_FacturasTableMouseClicked

    private void jbtnBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBuscar2MouseClicked
        try {
            // TODO add your handling code here:
            Conexion cn= new Conexion ();
          Connection cnt =cn.conectar();
            DAL.GenerarFactura(cnt);
            JOptionPane.showMessageDialog(this, "Factura generada exitosamente");
        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jbtnBuscar2MouseClicked

    private void jbtnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBuscar2ActionPerformed

    private void jbtnImprimirVisitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnImprimirVisitasMouseClicked
        // TODO add your handling code here:
        String path="";
        try{
            path=getClass().getResource("/Reportes/Factura.jasper").getPath();
            path=URLDecoder.decode(path, "UTF-8");
            Connection cn = Conexion.getConexion();
            Map parametros=new HashMap();
            JasperReport reporte=(JasperReport)JRLoader.loadObject(path);
            JasperPrint imprimir= JasperFillManager.fillReport(reporte,parametros,cn);
            JasperViewer visor=new JasperViewer(imprimir,false);
            visor.setTitle("Factura");
            visor.setVisible(true);
        }catch(Exception ex){
            System.out.println(ex.getMessage());

        }
    }//GEN-LAST:event_jbtnImprimirVisitasMouseClicked

    private void jbtnImprimirVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImprimirVisitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnImprimirVisitasActionPerformed

    private void jbtnAñadir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAñadir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAñadir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FacturasTable;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtnAñadir2;
    private javax.swing.JButton jbtnBuscar2;
    private javax.swing.JButton jbtnImprimirVisitas;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JPanel jpFactura;
    // End of variables declaration//GEN-END:variables
}
