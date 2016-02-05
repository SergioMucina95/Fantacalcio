import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
Socket s;
    public Home() {
        initComponents();
        this.setSize(580,420);
        try{
         s = new Socket("localhost",15000);
         System.out.println("Client connesso");
    }catch(Exception e){System.out.println(e.getMessage());}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LaBenvenuto = new javax.swing.JLabel();
        Jcrea = new javax.swing.JButton();
        Jcalcola = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setLayout(null);

        LaBenvenuto.setBackground(new java.awt.Color(255, 255, 0));
        LaBenvenuto.setFont(new java.awt.Font("Leelawadee", 3, 36)); // NOI18N
        LaBenvenuto.setForeground(new java.awt.Color(255, 0, 51));
        LaBenvenuto.setText("BENVENUTO!!");
        jPanel1.add(LaBenvenuto);
        LaBenvenuto.setBounds(150, 50, 250, 60);

        Jcrea.setText("CREA SQUADRA");
        jPanel1.add(Jcrea);
        Jcrea.setBounds(30, 190, 230, 70);

        Jcalcola.setText("CALCOLA IL TUO PUNTEGGIO");
        Jcalcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcalcolaActionPerformed(evt);
            }
        });
        jPanel1.add(Jcalcola);
        Jcalcola.setBounds(310, 190, 220, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Utente\\Desktop\\java\\quinta\\Fantacalcio\\src\\free-shiny-soccer-ball-in-stadium-vector.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 0, 620, 370);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcalcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcalcolaActionPerformed
        Formazione f=new Formazione(s);
        f.setVisible(true);
        this.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_JcalcolaActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jcalcola;
    private javax.swing.JButton Jcrea;
    private javax.swing.JLabel LaBenvenuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}