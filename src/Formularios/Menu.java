/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.*;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author juan
 */
public class Menu extends javax.swing.JFrame {

    
    
    /**
     * @return the nfac
     */
    public NuevaFactura getNfac() {
        return nfac;
    }

    /**
     * @param nfac the nfac to set
     */
    public void setNfac(NuevaFactura nfac) {
        this.nfac = nfac;
    }

    /**
     * Creates new form Menu
     */
     public Menu(String Usuario) throws SQLException{
        this.setUndecorated(true);
        initComponents();
        Setnameoflabels();
        cargarMenu(Usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jControlPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jblVisitas = new javax.swing.JButton();
        jblCroquis = new javax.swing.JButton();
        jblResidentes = new javax.swing.JButton();
        jblFactura = new javax.swing.JButton();
        jblMembresia = new javax.swing.JButton();
        jblDueno = new javax.swing.JButton();
        jblVivienda = new javax.swing.JButton();
        jblRegistro = new javax.swing.JButton();
        jblCerrar = new javax.swing.JLabel();
        jblMinimizar = new javax.swing.JLabel();

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/interfaz-de-hogar.png"))); // NOI18N
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anadir.png"))); // NOI18N
        jButton8.setToolTipText("");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setFocusTraversalPolicyProvider(true);
        jDesktopPane1.setOpaque(false);
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casas.jpg"))); // NOI18N
        jLabel2.setOpaque(true);

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1370, 710));

        jControlPanel.setBackground(new java.awt.Color(255, 255, 255));
        jControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.PNG"))); // NOI18N
        jControlPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jblVisitas.setBackground(new java.awt.Color(255, 255, 255));
        jblVisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Visi1.png"))); // NOI18N
        jblVisitas.setBorder(null);
        jblVisitas.setOpaque(false);
        jblVisitas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Visi.png"))); // NOI18N
        jblVisitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblVisitasMouseClicked(evt);
            }
        });
        jblVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblVisitasActionPerformed(evt);
            }
        });
        jControlPanel.add(jblVisitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 118, 30));

        jblCroquis.setBackground(new java.awt.Color(255, 255, 255));
        jblCroquis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Croquis1.png"))); // NOI18N
        jblCroquis.setBorder(null);
        jblCroquis.setOpaque(false);
        jblCroquis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Croquis.png"))); // NOI18N
        jblCroquis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblCroquisMouseClicked(evt);
            }
        });
        jblCroquis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblCroquisActionPerformed(evt);
            }
        });
        jControlPanel.add(jblCroquis, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 118, 30));

        jblResidentes.setBackground(new java.awt.Color(255, 255, 255));
        jblResidentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Resi1.png"))); // NOI18N
        jblResidentes.setBorder(null);
        jblResidentes.setOpaque(false);
        jblResidentes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Resi.png"))); // NOI18N
        jblResidentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblResidentesMouseClicked(evt);
            }
        });
        jControlPanel.add(jblResidentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 130, 30));

        jblFactura.setBackground(new java.awt.Color(255, 255, 255));
        jblFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Factu1.png"))); // NOI18N
        jblFactura.setBorder(null);
        jblFactura.setOpaque(false);
        jblFactura.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Factu.png"))); // NOI18N
        jblFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblFacturaMouseClicked(evt);
            }
        });
        jControlPanel.add(jblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 130, 30));

        jblMembresia.setBackground(new java.awt.Color(255, 255, 255));
        jblMembresia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Membre1.png"))); // NOI18N
        jblMembresia.setBorder(null);
        jblMembresia.setOpaque(false);
        jblMembresia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Membre.png"))); // NOI18N
        jblMembresia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblMembresiaMouseClicked(evt);
            }
        });
        jControlPanel.add(jblMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 130, 30));

        jblDueno.setBackground(new java.awt.Color(255, 255, 255));
        jblDueno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Due1.png"))); // NOI18N
        jblDueno.setBorder(null);
        jblDueno.setOpaque(false);
        jblDueno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Due.png"))); // NOI18N
        jblDueno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblDuenoMouseClicked(evt);
            }
        });
        jControlPanel.add(jblDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 50, 108, 30));

        jblVivienda.setBackground(new java.awt.Color(255, 255, 255));
        jblVivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Regis1.png"))); // NOI18N
        jblVivienda.setBorder(null);
        jblVivienda.setOpaque(false);
        jblVivienda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Regis.png"))); // NOI18N
        jControlPanel.add(jblVivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1835, 11, 130, -1));

        jblRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jblRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Regis1.png"))); // NOI18N
        jblRegistro.setBorder(null);
        jblRegistro.setOpaque(false);
        jblRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Palabras/Regis.png"))); // NOI18N
        jblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblRegistroMouseClicked(evt);
            }
        });
        jControlPanel.add(jblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 50, 116, 30));

        jblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrar (1).png"))); // NOI18N
        jblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblCerrarMouseClicked(evt);
            }
        });
        jControlPanel.add(jblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1337, 11, -1, -1));

        jblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minimizar (5).png"))); // NOI18N
        jblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblMinimizarMouseClicked(evt);
            }
        });
        jControlPanel.add(jblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1307, 11, -1, -1));

        getContentPane().add(jControlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    public void setjDesktopPane1(JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
    }
Vivienda v = new Vivienda(); Dueno d = new Dueno(); Fresidentes fr = new Fresidentes();  FrVisitas f=new FrVisitas();
Membresias mb = new Membresias(); Registrar r=new Registrar(); private NuevaFactura nfac = new NuevaFactura();Facturas fac = new Facturas(this);
Croquis cr= new Croquis();

    public void limpiarformularios(){
        v.dispose(); d.dispose(); fr.dispose();mb.dispose(); f.dispose(); r.dispose();fac.dispose();nfac.dispose(); cr.dispose();
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.limpiarformularios();
        v = new Vivienda();
       this.jDesktopPane1.add(v);v.setVisible(true);v.show();
      int x =(this.jDesktopPane1.getWidth()/2)-v.getWidth()/2;
      int y =(this.jDesktopPane1.getWidth()/2)-v.getWidth()/2;
      v.setLocation(x,y);v.setTitle("VIVIENDAS");
        try{
       // v.setMaximum(true);
     
    }catch(Exception ex){}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jblVisitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblVisitasMouseClicked
        // TODO add your handling code here:
        this.limpiarformularios();
        f = new FrVisitas();this.jDesktopPane1.add(f);f.setVisible(true);
    }//GEN-LAST:event_jblVisitasMouseClicked

    private void jblVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblVisitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblVisitasActionPerformed

    private void jblCroquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblCroquisMouseClicked
        // TODO add your handling code here:
        this.limpiarformularios();
        cr = new Croquis();cr.setClosable(true);cr.setAlignmentX(30);this.jDesktopPane1.add(cr);cr.setVisible(true);
    }//GEN-LAST:event_jblCroquisMouseClicked

    private void jblCroquisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblCroquisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jblCroquisActionPerformed

    private void jblResidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblResidentesMouseClicked
        // TODO add your handling code here:
        this.limpiarformularios();
        fr = new Fresidentes();this.jDesktopPane1.add(fr);fr.setVisible(true);
    }//GEN-LAST:event_jblResidentesMouseClicked

    private void jblFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblFacturaMouseClicked
        // TODO add your handling code here:

        this.limpiarformularios();
        fac.llenarTablaVwModelRecibos();
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.add(fac);
        fac.setVisible(true);
        fac.setTitle("FACTURAS");
        fac.show();
    }//GEN-LAST:event_jblFacturaMouseClicked

    private void jblMembresiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblMembresiaMouseClicked
        // TODO add your handling code here:
        this.limpiarformularios();
        mb= new Membresias();this.jDesktopPane1.add(mb);mb.setVisible(true);
    }//GEN-LAST:event_jblMembresiaMouseClicked

    private void jblDuenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblDuenoMouseClicked
        // TODO add your handling code here:
        this.limpiarformularios();
        d = new Dueno();this.jDesktopPane1.add(d);d.setVisible(true);
    }//GEN-LAST:event_jblDuenoMouseClicked

    private void jblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblRegistroMouseClicked
        // TODO add your handling code here:
        this.limpiarformularios();
        r=new Registrar();this.jDesktopPane1.add(r);r.setVisible(true);
    }//GEN-LAST:event_jblRegistroMouseClicked

    private void jblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblCerrarMouseClicked
        // TODO add your handling code here:
        try{
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int result= JOptionPane.showConfirmDialog(this, "Seguro que desea salir","EXIT",dialogButton);
            if(result==0){
                System.exit(0);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jblCerrarMouseClicked

    private void jblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(Formularios.Login1.ICONIFIED);
    }//GEN-LAST:event_jblMinimizarMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
                try {
                    new Menu(" ").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jControlPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jblCerrar;
    private javax.swing.JButton jblCroquis;
    private javax.swing.JButton jblDueno;
    private javax.swing.JButton jblFactura;
    private javax.swing.JButton jblMembresia;
    private javax.swing.JLabel jblMinimizar;
    private javax.swing.JButton jblRegistro;
    private javax.swing.JButton jblResidentes;
    private javax.swing.JButton jblVisitas;
    private javax.swing.JButton jblVivienda;
    // End of variables declaration//GEN-END:variables

 private void cargarMenu(String Users) throws SQLException {
        Conexion cn= new Conexion ();
        ArrayList<String> t=new ArrayList<String>();
        t =DAL.executeSprocInParams(cn.conectar(), DAL.GetRolId(Conexion.getConexion(), Users));
        for(int i=0; i<t.size();i++){
            Component[] indice = jControlPanel.getComponents();
            for(int j=0;j<jControlPanel.getComponents().length;j++){
            if(t.get(i).equals(jControlPanel.getComponent(j).getName())){
                jControlPanel.getComponent(j).setVisible(true);
            }
            }
        }
//            for(String i : t){
//                for(Component j:jControlPanel.getComponents()){
//                    if(j.getName()!=null){
//                    if(i.trim().equals(j.getName().trim())){
//                        j.setVisible(true);
//                    }
//                    }
//                }
//            }

        
    }

    private void Setnameoflabels() {
         jblCroquis.setName("jblCroquis");
    jblFactura.setName("jblFactura");
    jblMembresia.setName("jblMembresia");
  jblRegistro.setName("jblRegistro");
 jblResidentes.setName("jblResidente");
       jblVisitas.setName("jblVisitas");
   jblVivienda.setName("jblVivienda");
      jblCroquis.setVisible(false);
    jblFactura.setVisible(false);
    jblMembresia.setVisible(false);
  jblRegistro.setVisible(true);
 jblResidentes.setVisible(false);
       jblVisitas.setVisible(true);
   jblVivienda.setVisible(true);
//   jpNuevaFactura.setVisible(false);
    }
}

