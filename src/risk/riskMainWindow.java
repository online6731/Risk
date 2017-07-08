package risk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import sun.net.www.content.text.plain;



class Country {
    int ID;
    int sahebID;
    int soldirs;
    ArrayList<Integer> mojaver;
    
    public Country(int ID) {
        this.ID = ID;
        soldirs = 0;
    }
    
    public void moveSoldirs(int numberOfSoldirs, int targetID){
        if (mojaver.contains(targetID)){
            soldirs -= numberOfSoldirs;
            
            if (this.sahebID == World.countries.get(targetID).sahebID){
                World.countries.get(targetID).soldirs += numberOfSoldirs;
                // moving soldirs
            
            }else if(this.sahebID != World.countries.get(targetID).sahebID && numberOfSoldirs > World.countries.get(targetID).soldirs){
                World.countries.get(targetID).sahebID = ID;
                World.countries.get(targetID).soldirs = World.countries.get(targetID).soldirs - numberOfSoldirs;
                // the line above does not match the rules
                // attack & win
                
            }else if(this.sahebID != World.countries.get(targetID).sahebID && numberOfSoldirs < World.countries.get(targetID).soldirs){
                World.countries.get(targetID).soldirs -= numberOfSoldirs;
                // the line above does not match the rules                
                // attack & lost
            }
            
        }else{
            // your move is wrong!
        }
    }
    
    
    
    public void setMojaver(int[] mojavers){
        for (int i : mojavers) mojaver.add(i);
    }
    
}





public class riskMainWindow extends javax.swing.JFrame {

    public riskMainWindow() {
        initComponents();
        backgroundLabel.setIcon(new ImageIcon("C:/Users/Me/Desktop/map.PNG"));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(riskMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(riskMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(riskMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(riskMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new riskMainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    // End of variables declaration//GEN-END:variables
}
