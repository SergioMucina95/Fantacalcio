import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.io.File;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Formazione extends javax.swing.JFrame {
int yDef=100;int yCent=190;int yAtt=280;
String s="milan";
String []a;
Squadre sq;
Squadre casa;


    /**
     * Creates new form Formazione
     */
    public Formazione() {
        try{
        System.out.println("chiamato");
        initComponents();
        this.setSize(580,490);
        this.setLocation(10,100);
        sfondo2.setBackground(java.awt.Color.green);
        sfondo2.setVisible(false);
        BSalva.setVisible(false);
        this.cmbTutto();
      //  this.s=s;
        sq=new Squadre();
        casa=new Squadre();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sfondo = new javax.swing.JPanel();
        Lmod = new javax.swing.JLabel();
        CmbMod = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        sfondo2 = new javax.swing.JPanel();
        CmbAtt1 = new javax.swing.JComboBox();
        CmbPortier = new javax.swing.JComboBox();
        CmbDef3 = new javax.swing.JComboBox();
        CmbDef5 = new javax.swing.JComboBox();
        CmbDef4 = new javax.swing.JComboBox();
        CmbDef2 = new javax.swing.JComboBox();
        CmbDef1 = new javax.swing.JComboBox();
        CmbCent1 = new javax.swing.JComboBox();
        CmbCent6 = new javax.swing.JComboBox();
        CmbCent5 = new javax.swing.JComboBox();
        CmbCent4 = new javax.swing.JComboBox();
        CmbCent3 = new javax.swing.JComboBox();
        CmbCent2 = new javax.swing.JComboBox();
        CmbAtt2 = new javax.swing.JComboBox();
        CmbAtt3 = new javax.swing.JComboBox();
        BSalva = new javax.swing.JButton();
        Jnome = new javax.swing.JLabel();
        CmbSquadra = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Sfondo.setLayout(null);

        Lmod.setText("inserisci modulo→");
        Sfondo.add(Lmod);
        Lmod.setBounds(80, 60, 130, 20);

        CmbMod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3-4-3", "3-5-2", "3-6-1", "4-4-2", "4-3-3", "4-5-1", "5-3-2", "5-2-3", "5-4-1" }));
        CmbMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbModActionPerformed(evt);
            }
        });
        Sfondo.add(CmbMod);
        CmbMod.setBounds(230, 60, 110, 20);
        Sfondo.add(jSeparator2);
        jSeparator2.setBounds(0, 90, 580, 20);

        sfondo2.setLayout(null);

        CmbAtt1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbAtt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbAtt1ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbAtt1);
        CmbAtt1.setBounds(130, 280, 70, 30);

        CmbPortier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbPortier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbPortierActionPerformed(evt);
            }
        });
        sfondo2.add(CmbPortier);
        CmbPortier.setBounds(220, 50, 90, 30);

        CmbDef3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbDef3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbDef3ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbDef3);
        CmbDef3.setBounds(230, 100, 70, 30);

        CmbDef5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbDef5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbDef5ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbDef5);
        CmbDef5.setBounds(0, 100, 70, 30);

        CmbDef4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbDef4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbDef4ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbDef4);
        CmbDef4.setBounds(120, 100, 70, 30);

        CmbDef2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbDef2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbDef2ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbDef2);
        CmbDef2.setBounds(360, 100, 70, 30);

        CmbDef1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbDef1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbDef1ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbDef1);
        CmbDef1.setBounds(480, 100, 70, 30);

        CmbCent1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbCent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCent1ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbCent1);
        CmbCent1.setBounds(0, 190, 70, 30);

        CmbCent6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbCent6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCent6ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbCent6);
        CmbCent6.setBounds(480, 190, 70, 30);

        CmbCent5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbCent5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCent5ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbCent5);
        CmbCent5.setBounds(390, 190, 70, 30);

        CmbCent4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbCent4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCent4ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbCent4);
        CmbCent4.setBounds(280, 190, 70, 30);

        CmbCent3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbCent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCent3ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbCent3);
        CmbCent3.setBounds(190, 190, 70, 30);

        CmbCent2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbCent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCent2ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbCent2);
        CmbCent2.setBounds(90, 190, 70, 30);

        CmbAtt2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbAtt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbAtt2ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbAtt2);
        CmbAtt2.setBounds(240, 280, 70, 30);

        CmbAtt3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CmbAtt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbAtt3ActionPerformed(evt);
            }
        });
        sfondo2.add(CmbAtt3);
        CmbAtt3.setBounds(360, 280, 70, 30);

        Sfondo.add(sfondo2);
        sfondo2.setBounds(0, 90, 580, 360);

        BSalva.setText("salva");
        BSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalvaActionPerformed(evt);
            }
        });
        Sfondo.add(BSalva);
        BSalva.setBounds(230, 450, 90, 40);

        Jnome.setText("SQUADRA:");
        Sfondo.add(Jnome);
        Jnome.setBounds(160, 20, 80, 14);

        CmbSquadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbSquadraActionPerformed(evt);
            }
        });
        Sfondo.add(CmbSquadra);
        CmbSquadra.setBounds(240, 20, 70, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Sfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Sfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void BSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalvaActionPerformed
        casa.carica(s);
        a=raccogli();
        if(controllaPieni(a)<7)
        JOptionPane.showMessageDialog(this,"non puoi giocare con meno di sette giocatori");
        else if(!controllone(a))
        JOptionPane.showMessageDialog(this,"non puoi scegliere giocatori uguali");
        else{

            // JOptionPane.showMessageDialog(this,"casa"+casa.getDim());
            sq=titolari(a);
            JOptionPane.showMessageDialog(this,sq.getDim());
            for(int i=0;i<sq.getDim();i++)
            JOptionPane.showMessageDialog(this,sq.GetCal(i).getCognome());

        }
    }//GEN-LAST:event_BSalvaActionPerformed

    private void CmbAtt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbAtt3ActionPerformed

    }//GEN-LAST:event_CmbAtt3ActionPerformed

    private void CmbAtt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbAtt2ActionPerformed

    }//GEN-LAST:event_CmbAtt2ActionPerformed

    private void CmbCent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCent2ActionPerformed

    }//GEN-LAST:event_CmbCent2ActionPerformed

    private void CmbCent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCent3ActionPerformed

    }//GEN-LAST:event_CmbCent3ActionPerformed

    private void CmbCent4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCent4ActionPerformed

    }//GEN-LAST:event_CmbCent4ActionPerformed

    private void CmbCent5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCent5ActionPerformed

    }//GEN-LAST:event_CmbCent5ActionPerformed

    private void CmbCent6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCent6ActionPerformed

    }//GEN-LAST:event_CmbCent6ActionPerformed

    private void CmbCent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCent1ActionPerformed

    }//GEN-LAST:event_CmbCent1ActionPerformed

    private void CmbDef1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbDef1ActionPerformed

    }//GEN-LAST:event_CmbDef1ActionPerformed

    private void CmbDef2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbDef2ActionPerformed

    }//GEN-LAST:event_CmbDef2ActionPerformed

    private void CmbDef4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbDef4ActionPerformed

    }//GEN-LAST:event_CmbDef4ActionPerformed

    private void CmbDef5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbDef5ActionPerformed

    }//GEN-LAST:event_CmbDef5ActionPerformed

    private void CmbDef3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbDef3ActionPerformed

    }//GEN-LAST:event_CmbDef3ActionPerformed

    private void CmbPortierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbPortierActionPerformed

    }//GEN-LAST:event_CmbPortierActionPerformed

    private void CmbAtt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbAtt1ActionPerformed

    }//GEN-LAST:event_CmbAtt1ActionPerformed

    private void CmbModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbModActionPerformed
        
        BSalva.setVisible(true);
        sfondo2.setVisible(true);
        int x=CmbMod.getSelectedIndex();
        switch(x){
            case 0:{vediTutto();vuoto();CmbDef1.setVisible(false);CmbDef5.setVisible(false);
                CmbCent1.setVisible(false);CmbCent6.setVisible(false);
                break;}//3-4-3
            case 1:{vediTutto();vuoto();CmbDef1.setVisible(false);CmbDef5.setVisible(false);
                CmbCent3.setVisible(false);CmbCent4.setLocation(230,190);CmbCent2.setLocation(120,190);CmbCent5.setLocation(360,190);
                CmbAtt2.setVisible(false);CmbAtt1.setLocation(150,yAtt);CmbAtt3.setLocation(330,yAtt);
                break;}//3-5-2
            case 2:{vediTutto();vuoto();CmbDef1.setVisible(false);CmbDef5.setVisible(false);
                CmbAtt1.setVisible(false);CmbAtt3.setVisible(false);
                break;}//3-6-1
            case 3: {vediTutto();vuoto();CmbDef3.setVisible(false);CmbDef4.setLocation(150,yDef);CmbDef2.setLocation(330,yDef);
                CmbCent3.setVisible(false);CmbCent4.setVisible(false);CmbCent5.setLocation(150,yCent);CmbCent2.setLocation(330,yCent);
                CmbAtt2.setVisible(false);CmbAtt1.setLocation(150,yAtt);CmbAtt3.setLocation(330,yAtt);
                break;}//4-4-2
            case 4:{vediTutto();vuoto();CmbDef3.setVisible(false);CmbDef4.setLocation(150,yDef);CmbDef2.setLocation(330,yDef);
                CmbCent1.setVisible(false);CmbCent3.setVisible(false);CmbCent6.setVisible(false);CmbCent4.setLocation(230,yCent);
                break;}//4-3-3
            case 5:{vediTutto();vuoto();CmbDef3.setVisible(false);CmbDef4.setLocation(150,yDef);CmbDef2.setLocation(330,yDef);
                CmbCent3.setVisible(false);CmbCent4.setLocation(230,190);CmbCent2.setLocation(120,190);CmbCent5.setLocation(360,190);
                CmbAtt1.setVisible(false);CmbAtt3.setVisible(false);
                break;}//4-5-1
            case 6:{vediTutto();vuoto();
                CmbCent1.setVisible(false);CmbCent3.setVisible(false);CmbCent6.setVisible(false);CmbCent4.setLocation(230,yCent);
                CmbAtt2.setVisible(false);CmbAtt1.setLocation(150,yAtt);CmbAtt3.setLocation(330,yAtt);
                break;}//5-3-2
            case 7:{vediTutto();vuoto();
                CmbCent1.setVisible(false);CmbCent3.setVisible(false);CmbCent6.setVisible(false);CmbCent4.setVisible(false);CmbCent5.setLocation(150,yCent);CmbCent2.setLocation(330,yCent);
                break;}//5-2-3
            case 8:{vediTutto();vuoto();
                CmbCent3.setVisible(false);CmbCent4.setVisible(false);CmbCent5.setLocation(150,yCent);CmbCent2.setLocation(330,yCent);
                CmbAtt1.setVisible(false);CmbAtt3.setVisible(false);
                break;}//5-4-1

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_CmbModActionPerformed

    private void CmbSquadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbSquadraActionPerformed
        /*File f=new File("squadre");
        String b[]=f.list();
        for(int i=0;i<a.length;i++)
        CmbSquadra.addItem(b[i]);     
        */
            // TODO add your handling code here:
    }//GEN-LAST:event_CmbSquadraActionPerformed

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
            java.util.logging.Logger.getLogger(Formazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formazione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSalva;
    private javax.swing.JComboBox CmbAtt1;
    private javax.swing.JComboBox CmbAtt2;
    private javax.swing.JComboBox CmbAtt3;
    private javax.swing.JComboBox CmbCent1;
    private javax.swing.JComboBox CmbCent2;
    private javax.swing.JComboBox CmbCent3;
    private javax.swing.JComboBox CmbCent4;
    private javax.swing.JComboBox CmbCent5;
    private javax.swing.JComboBox CmbCent6;
    private javax.swing.JComboBox CmbDef1;
    private javax.swing.JComboBox CmbDef2;
    private javax.swing.JComboBox CmbDef3;
    private javax.swing.JComboBox CmbDef4;
    private javax.swing.JComboBox CmbDef5;
    private javax.swing.JComboBox CmbMod;
    private javax.swing.JComboBox CmbPortier;
    private javax.swing.JComboBox CmbSquadra;
    private javax.swing.JLabel Jnome;
    private javax.swing.JLabel Lmod;
    private javax.swing.JPanel Sfondo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel sfondo2;
    // End of variables declaration//GEN-END:variables
public void vediTutto(){
    
    CmbDef1.setVisible(true);CmbDef2.setVisible(true);CmbDef3.setVisible(true);CmbDef4.setVisible(true);CmbDef5.setVisible(true);
    CmbCent1.setVisible(true);CmbCent2.setVisible(true);CmbCent3.setVisible(true);CmbCent4.setVisible(true);CmbCent5.setVisible(true);CmbCent6.setVisible(true);
    CmbAtt1.setVisible(true);CmbAtt2.setVisible(true);CmbAtt3.setVisible(true);
    CmbDef5.setLocation(0,yDef);CmbDef4.setLocation(120,yDef);CmbDef3.setLocation(230,yDef);CmbDef2.setLocation(360,yDef);CmbDef1.setLocation(480,yDef);
    CmbCent1.setLocation(0,yCent);CmbCent2.setLocation(90,yCent);CmbCent3.setLocation(190,yCent);CmbCent4.setLocation(280,yCent);CmbCent5.setLocation(390,yCent);CmbCent6.setLocation(480,yCent);
    CmbAtt1.setLocation(130,yAtt);CmbAtt2.setLocation(230,yAtt);CmbAtt3.setLocation(360,yAtt);
}

public void cmbTutto()throws Exception{
    Socket s = new Socket("localhost",15000);
    System.out.println("Client connesso");
    DataOutputStream esterno = new DataOutputStream(s.getOutputStream());
    esterno.write(0);
    DataOutputStream extern = new DataOutputStream(s.getOutputStream());
    ObjectOutputStream out = new ObjectOutputStream(extern);
    DataInputStream interno = new DataInputStream(s.getInputStream());
    ObjectInputStream in = new ObjectInputStream(interno);
    System.out.println("post dichiarazioni");
      int dimensione=interno.read();
   Squadre m1=new Squadre();
    for(int i=0;i<dimensione;i++)
       m1.aggiungiG((Giocatore)in.readObject());
    for(int i=0;i<m1.getDim();i++){ 
        CmbPortier.addItem(m1.GetCal(i).getCognome());
        CmbDef1.addItem(m1.GetCal(i).getCognome());
        CmbDef2.addItem(m1.GetCal(i).getCognome());
        CmbDef3.addItem(m1.GetCal(i).getCognome());
        CmbDef4.addItem(m1.GetCal(i).getCognome());
        CmbDef5.addItem(m1.GetCal(i).getCognome());
        CmbCent1.addItem(m1.GetCal(i).getCognome());
        CmbCent2.addItem(m1.GetCal(i).getCognome());
        CmbCent3.addItem(m1.GetCal(i).getCognome());
        CmbCent4.addItem(m1.GetCal(i).getCognome());
        CmbCent5.addItem(m1.GetCal(i).getCognome());
        CmbCent6.addItem(m1.GetCal(i).getCognome());
        CmbAtt1.addItem(m1.GetCal(i).getCognome());
        CmbAtt2.addItem(m1.GetCal(i).getCognome());
        CmbAtt3.addItem(m1.GetCal(i).getCognome());
        
}
}
public void vuoto(){
        CmbPortier.setSelectedItem("");
        CmbDef1.setSelectedItem("");
        CmbDef2.setSelectedItem("");
        CmbDef3.setSelectedItem("");
        CmbDef4.setSelectedItem("");
        CmbDef5.setSelectedItem("");
        CmbCent1.setSelectedItem("");
        CmbCent2.setSelectedItem("");
        CmbCent3.setSelectedItem("");
        CmbCent4.setSelectedItem("");
        CmbCent5.setSelectedItem("");
        CmbCent6.setSelectedItem("");
        CmbAtt1.setSelectedItem("");
        CmbAtt2.setSelectedItem("");
        CmbAtt3.setSelectedItem("");
}
public String[] raccogli(){
        String a[]=new String[15]; 
         a[0]=(String)CmbPortier.getSelectedItem();
         a[1]=(String)CmbDef1.getSelectedItem();
          a[2]=(String)CmbDef2.getSelectedItem();
           a[3]=(String)CmbDef3.getSelectedItem();
            a[4]=(String)CmbDef4.getSelectedItem();
             a[5]=(String)CmbDef5.getSelectedItem();
              a[6]=(String)CmbCent1.getSelectedItem();
               a[7]=(String)CmbCent2.getSelectedItem();
                a[8]=(String)CmbCent3.getSelectedItem();
                 a[9]=(String)CmbCent4.getSelectedItem();
                  a[10]=(String)CmbCent5.getSelectedItem();
                   a[11]=(String)CmbCent6.getSelectedItem();
                    a[12]=(String)CmbAtt1.getSelectedItem();
                     a[13]=(String)CmbAtt2.getSelectedItem();
                      a[14]=(String)CmbAtt3.getSelectedItem();
       
/*            for(int i=0;i<s.getDim();i++)
                a[i]=s.GetCal(i).getCognome();
                      */return a;
}
public boolean controllone(String a[]){
    int i;
    for(i=0;i<a.length-1;i++)
        for(int j=i+1;j<a.length;j++){
            if(a[i].equals(a[j])&&a[i].equals("")==false)
                return false;
        }
    
    return true;
}

public int controllaPieni(String a[])
{   int acc=0;
    for(int i=0;i<a.length;i++)
    {
        if(!a[i].equals(""))
           acc++; 
    }
    return acc;
}

public Squadre titolari(String a[]){
    Squadre s=new Squadre();
    for(int i=0;i<a.length;i++){
        if(a[i].equals("")==false)
           s.aggiungiG(casa.GetCal(casa.cerca(a[i])));
       
        
    }
    JOptionPane.showMessageDialog(this,"s"+s.getDim());
    return s;
}
}
