/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JOptionPane;
import Clases.Conexion;
import Clases.DALVivienda;
import Modelos.Viviendas;
import java.net.URLDecoder;
import java.sql.Connection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author juan
 */
public class Vivienda extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vivienda
     */
    public Vivienda() {
        initComponents();this.jLabel2.setText("");this.jLabel2.setVisible(false); this.ver(); this.jLabel3.setVisible(false);this.jLabel4.setVisible(false);
        this.jLabel3.setText("");this.jLabel4.setText("");this.jCheckBox1.setText("");
    }
Conexion cn = new Conexion();
 List<Viviendas> listaVivienda  = new LinkedList<Viviendas>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textArea1 = new java.awt.TextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        textField4 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnImprimirVisitas = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(75, 123, 125));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Estado:");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        label2.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Cuota:");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        label3.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Dirección:");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        label4.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Residente:");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        label5.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Dueño:");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 30));

        textField1.setBackground(new java.awt.Color(102, 102, 102));
        textField1.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 170, 40));

        textArea1.setBackground(new java.awt.Color(102, 102, 102));
        textArea1.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jPanel1.add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 340, 70));

        jButton1.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, 45));

        jButton2.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 99, 45));

        jButton3.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Eliminar");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, -1, 45));

        jButton4.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Nuevo");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, 113, -1));

        textField2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 345, 30));

        textField3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 345, 30));

        jButton5.setText("...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, 30));

        jButton6.setText("...");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, 30));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setText("jCheckBox1");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 150, 40));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 253, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa-para-buscar.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jList1.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, 310, 348));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 350, 410));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Bodoni MT Black", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                              VIVIENDA ");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/disquete-de-guardar.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar (1).png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton-cancelar.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-notas.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/historial-medico.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, -1, -1));

        jbtnImprimirVisitas.setBackground(new java.awt.Color(51, 51, 51));
        jbtnImprimirVisitas.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jbtnImprimirVisitas.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(jbtnImprimirVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, 190, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ver(){
       
        try{
            DALVivienda dal = new DALVivienda();
         listaVivienda = dal.getViviendas();
         Object datos[]=new Object[listaVivienda.size()]; 
         for(int i=0; i < listaVivienda.size();i++){
              datos[i]= listaVivienda.get(i).getIdVivienda()+" - "+ listaVivienda.get(i).getDueno();
         }
          this.jList1.setListData(datos); this.jList1.setVisible(true);
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex.getMessage());}
       
    }
    
    public void ver2(int id){
       try{
            DALVivienda dal = new DALVivienda();
         listaVivienda = dal.getViviendas(id);
         
        try{ this.jCheckBox1.setSelected(Boolean.parseBoolean(listaVivienda.get(0).getEstado())); if(this.jCheckBox1.isSelected()){this.jCheckBox1.setText("Activo");}else{this.jCheckBox1.setText("Inactivo");}}catch(Exception ex){}
        this.textField1.setText(String.valueOf(listaVivienda.get(0).getCuota()));
        this.textArea1.setText( listaVivienda.get(0).getDireccion());
        this.textField2.setText(listaVivienda.get(0).getResidente());
        this.textField3.setText(listaVivienda.get(0).getDueno());
        this.jLabel3.setText(String.valueOf(listaVivienda.get(0).getIdDueno()));
        this.jLabel4.setText(String.valueOf(listaVivienda.get(0).getIdResidente()));
        
        }catch(Exception ex){  JOptionPane.showMessageDialog(this, ex.getMessage());}  
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Vdueno vd = new Vdueno(null,true);vd.setLocationRelativeTo(null); vd.setVisible(true);
        if(this.jLabel2.getText().length()>0){
        if(JOptionPane.showConfirmDialog(null, "Desea Agregar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
             { 
                 String a= vd.val1; String b = vd.val2;this.textField3.setText(b);
                  String strsql="update viviendas set idDueno = "+a+",Dueno = '"+this.textField3.getText()+"' where idVivienda = "+this.jLabel2.getText();
               // this.textArea1.setText(strsql);
                  if(cn.ejecutarsql(strsql)==true){
                      JOptionPane.showMessageDialog(this, "Información Procesada");
                     // this.ver();
                 }
                 else{
                      JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                 }
             }
        }
        else{
            String a= vd.val1; String b = vd.val2;this.jLabel3.setText(a); this.textField3.setText(b); 
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     Vresidente vd = new Vresidente(null,true);vd.setLocationRelativeTo(null); vd.setVisible(true);
        if(this.jLabel2.getText().length()>0){
        if(JOptionPane.showConfirmDialog(null, "Desea Agregar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
             { 
                 String a= vd.val1; String b = vd.val2;this.textField2.setText(b);
                  String strsql="update viviendas set IdResidente = "+a+",Residente = '"+this.textField2.getText()+"' where idVivienda = "+this.jLabel2.getText();
                //this.textArea1.setText(strsql);
                  if(cn.ejecutarsql(strsql)==true){
                      JOptionPane.showMessageDialog(this, "Información Procesada");
                     // this.ver();
                 }
                 else{
                      JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                 }
             }
      }
      else
      {
         String a= vd.val1; String b = vd.val2;this.jLabel4.setText(a); this.textField2.setText(b);
      }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try{
            int g=0; String a=this.jList1.getSelectedValue().toString(); String b="";
            for(int i=1; i < a.length();i++)
            {
                if(!a.substring(g,i).equals(" "))
                {
                    b += a.substring(g, i);
                }
                else
                {
                    i = a.length();
                }
                g++;
            }
           this.jLabel2.setText(b); int vb=0;
           vb = Integer.parseInt(b);
           this.ver2(vb);

        }catch(Exception ex){}
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(this.label2.getText().length()>0){
        if(JOptionPane.showConfirmDialog(null, "Desea Agregar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
             { 
                 String strsql="insert into Viviendas(Estado,Direccion,Cuota,dueno,IdResidente,IdDueno,Residente) values('"+this.jCheckBox1.isSelected()+"','"+this.textArea1.getText()+"',"+this.textField1.getText()+",'"+this.textField3.getText()+"',"+this.jLabel4.getText()+","+this.jLabel3.getText()+",'"+this.textField2.getText()+"')";
               
                 if(cn.ejecutarsql(strsql)==true){
                      JOptionPane.showMessageDialog(this, "Información Procesada");
                      this.ver();
                 }
                 else{
                      JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                 }
             }
      }
      else{
          
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(this.label2.getText().length()>0){
        if(JOptionPane.showConfirmDialog(null, "Desea Modificar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
             { 
                 String strsql="update Viviendas set Estado = '"+this.jCheckBox1.isSelected()+"',direccion = '"+this.textArea1.getText()+"',Cuota="+this.textField1.getText()+",Dueno = '"+this.textField3.getText()+"',Residente='"+this.textField2.getText()+"' where idVivienda="+this.jLabel2.getText()+"";
               
                 if(cn.ejecutarsql(strsql)==true){
                      JOptionPane.showMessageDialog(this, "Información Procesada");
                      this.ver();
                 }
                 else{
                      JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                 }
             }
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if(this.label2.getText().length()>0){
        if(JOptionPane.showConfirmDialog(null, "Desea Eliminar esta información?", "Confirmando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
             { 
                 String strsql="delete from Viviendas where idVivienda="+this.jLabel2.getText()+"";
               
                 if(cn.ejecutarsql(strsql)==true){
                      JOptionPane.showMessageDialog(this, "Información Procesada");
                      this.ver();
                 }
                 else{
                      JOptionPane.showMessageDialog(this, "No se pudo procesar la información");
                 }
             }
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.jLabel2.setText(""); this.jLabel3.setText(""); this.jLabel4.setText("");
       this.textField1.setText(""); this.textField2.setText(""); this.textField3.setText("");
       this.textArea1.setText("");this.textField1.setFocusable(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbtnImprimirVisitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnImprimirVisitasMouseClicked
        // TODO add your handling code here:
        String path="";
        try{
            path=getClass().getResource("/Reportes/reporte_dueño.jasper").getPath();
            path=URLDecoder.decode(path, "UTF-8");
            Connection cn = Conexion.getConexion();
            Map parametros=new HashMap();
            JasperReport reporte=(JasperReport)JRLoader.loadObject(path);
            JasperPrint imprimir= JasperFillManager.fillReport(reporte,parametros,cn);
            JasperViewer visor=new JasperViewer(imprimir,false);
            visor.setTitle("Reporte de visitas");
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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnImprimirVisitas;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
