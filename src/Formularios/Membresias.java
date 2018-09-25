/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author juan
 */
import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Clases.DALmembresia;
import Clases.DALresidentes;
import Modelos.Membre;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import java.net.URLDecoder;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
public class Membresias extends javax.swing.JInternalFrame {

    /**
     * Creates new form Membresias
     */
   
    public Membresias() {
        initComponents();this.ver();this.jLabel6.setVisible(false);
    }
Conexion cn = new Conexion();
List<Membre> listamembresia  = new LinkedList<Membre>();
   
public void ver(){
    
    try{
        
            DALmembresia dal = new  DALmembresia();
         listamembresia = dal.getMembresia();
         Object datos[]=new Object[listamembresia.size()];
          for(int i=0; i < listamembresia.size();i++){
              datos[i]= listamembresia.get(i).getIdMembresia()+"-"+ listamembresia.get(i).getTipo();
              
         }
          this.jList1.setListData(datos); this.jList1.setVisible(true);
         
        }catch(Exception ex){  JOptionPane.showMessageDialog(this, ex.getMessage());}  
}

public void ver2(int id){
       try{
            DALmembresia dal = new  DALmembresia();
         listamembresia = dal.getMembresia(id);
         
         this.jTextField1.setText(listamembresia.get(0).getTipo());
       this.jTextField2.setText(String.valueOf(listamembresia.get(0).getValor()));
      this.jTextArea1.setText(listamembresia.get(0).getDetalle());
      this.jTextField3.setText(listamembresia.get(0).getFechaf());
       this.jLabel6.setText(String.valueOf(listamembresia.get(0).getIdMembresia()));
        }catch(Exception ex){  JOptionPane.showMessageDialog(this, ex.getMessage());}  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnImprimirVisitas = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(38, 34));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 684));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 123, 125));
        jLabel1.setText("Tipo de membresia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

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
        jPanel1.add(jbtnImprimirVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 550, 190, 50));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 300, 40));

        jButton1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(75, 123, 125));
        jButton1.setText("Guardar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 140, 45));

        jButton2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(75, 123, 125));
        jButton2.setText("Editar");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 110, 45));

        jButton3.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(75, 123, 125));
        jButton3.setText("Eliminar");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, 45));

        jButton4.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(75, 123, 125));
        jButton4.setText("Nuevo");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 113, -1));

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 123, 125));
        jLabel2.setText("Valor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 300, 40));

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(75, 123, 125));
        jLabel3.setText("Detalle");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 300, 40));

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(75, 123, 125));
        jLabel5.setText("Fecha vencimiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 300, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-notas_1.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        textField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField4KeyPressed(evt);
            }
        });
        jPanel2.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 330, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/historial-medico.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, -1, -1));

        jList1.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jList1.setForeground(new java.awt.Color(75, 123, 125));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 380, 240));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 440, 320));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Bodoni MT Black", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/meb.png"))); // NOI18N
        jLabel7.setText("                              MEMBRESIA");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1360, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/reportar (1).png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 470, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
            String a = this.jList1.getSelectedValue().toString();    
        String []val= a.split("-"); String b=val[0];
        this.ver2(Integer.parseInt(b));
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            if(JOptionPane.showConfirmDialog(null, "Desea Agregar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
            {
               String strsql="insert into Membresia values('"+this.jTextField1.getText()+"',"+this.jTextField2.getText()+",'"+this.jTextArea1.getText()+"','"+this.jTextField3.getText()+"')";
                if(cn.ejecutarsql(strsql)==true){
                    JOptionPane.showMessageDialog(this, "Información Procesada");
                    this.ver();
                }
                else{
                    JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                }
            }
       
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(JOptionPane.showConfirmDialog(null, "Desea Modificar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
            {
                String strsql="update Membresia set TipoMembresia = '"+this.jTextField1.getText()+"',VALOR = "+this.jTextField2.getText()+",Detalle ='"+this.jTextArea1.getText()+"',Fecha_vence='"+this.jTextField3.getText()+"' where IdMembresia = "+this.jLabel6.getText()+"";

                if(cn.ejecutarsql(strsql)==true){
                    JOptionPane.showMessageDialog(this, "Información Procesada");
                    this.ver();
                }
                else{
                    JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                }
            }       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(JOptionPane.showConfirmDialog(null, "Desea Eliminar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
            {
                String strsql="delete from Membresia where IdMembresia="+this.jLabel6.getText()+"";

                if(cn.ejecutarsql(strsql)==true){
                    JOptionPane.showMessageDialog(this, "Información Procesada");
                    this.ver();
                }
                else{
                    JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                }
            }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void textField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField4KeyPressed
      
    }//GEN-LAST:event_textField4KeyPressed

    private void jbtnImprimirVisitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnImprimirVisitasMouseClicked
        // TODO add your handling code here:
        String path="";
        try{
            path=getClass().getResource("/Reportes/ResiMembresia.jasper").getPath();
            path=URLDecoder.decode(path, "UTF-8");
            Connection cn = Conexion.getConexion();
            Map parametros=new HashMap();
            JasperReport reporte=(JasperReport)JRLoader.loadObject(path);
            JasperPrint imprimir= JasperFillManager.fillReport(reporte,parametros,cn);
            JasperViewer visor=new JasperViewer(imprimir,false);
            visor.setTitle("Membresias");
            visor.setVisible(true);
        }catch(Exception ex){
            System.out.println(ex.getMessage());

        }
    }//GEN-LAST:event_jbtnImprimirVisitasMouseClicked

    private void jbtnImprimirVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImprimirVisitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnImprimirVisitasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbtnImprimirVisitas;
    private java.awt.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
