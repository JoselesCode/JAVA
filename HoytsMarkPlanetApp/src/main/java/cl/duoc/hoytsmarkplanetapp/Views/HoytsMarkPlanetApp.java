package cl.duoc.hoytsmarkplanetapp.Views;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import cl.duoc.hoytsmarkplanetapp.DAO.ConexionDB;
/**
 *
 * @author Joseles Student
 */
public class HoytsMarkPlanetApp extends javax.swing.JFrame {

    /**
     * Creates new form HoytsMarkPlanetApp
     */
    public HoytsMarkPlanetApp() {
        initComponents();
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        DesktopPane = new javax.swing.JDesktopPane(){

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CrearPeli = new javax.swing.JMenuItem();
        ModificarPeli = new javax.swing.JMenuItem();
        EliminarPeli = new javax.swing.JMenuItem();
        ListarPeli = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HoytsMarkPlanet");

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenuBar1.setToolTipText("");

        jMenu1.setText("Peliculas");

        CrearPeli.setText("Crear Pelicula");
        CrearPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearPeliActionPerformed(evt);
            }
        });
        jMenu1.add(CrearPeli);

        ModificarPeli.setText("Modificar Pelicula");
        jMenu1.add(ModificarPeli);

        EliminarPeli.setText("Eliminar Pelicula");
        EliminarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPeliActionPerformed(evt);
            }
        });
        jMenu1.add(EliminarPeli);

        ListarPeli.setText("Listar Pelicula");
        ListarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarPeliActionPerformed(evt);
            }
        });
        jMenu1.add(ListarPeli);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("01010101");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearPeliActionPerformed
        CrearPelicula ventanauno = new CrearPelicula();
        DesktopPane.add(ventanauno);
        ventanauno.setVisible(true);
        ventanauno.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_CrearPeliActionPerformed

    private void ListarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarPeliActionPerformed
        // TODO add your handling code here:
       ListarPeli ventanados = new ListarPeli();
               DesktopPane.add(ventanados);
        ventanados.setVisible(true);
        ventanados.setVisible(true);
        
        
    }//GEN-LAST:event_ListarPeliActionPerformed

    private void EliminarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPeliActionPerformed
        EliminarPeli ventanatres = new EliminarPeli();
        DesktopPane.add(ventanatres);
        ventanatres.setVisible(true);
        ventanatres.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_EliminarPeliActionPerformed

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
            java.util.logging.Logger.getLogger(HoytsMarkPlanetApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanetApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanetApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanetApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoytsMarkPlanetApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CrearPeli;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuItem EliminarPeli;
    private javax.swing.JMenuItem ListarPeli;
    private javax.swing.JMenuItem ModificarPeli;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
