/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author malki
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    private void Enternumber(String q){
        
      String nums=jfieldanswer.getText()+q;
      jfieldanswer.setText(nums);
       
        
        
        
        
    }
    
    double num1;
    double num2;
    double result;
    String op;
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfieldanswer = new javax.swing.JTextField();
        jbtnCE = new javax.swing.JButton();
        jbtnB = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtnsub = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtnadd = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtnmul = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtndiv = new javax.swing.JButton();
        jbtnequal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jfieldanswer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jfieldanswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jfieldanswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfieldanswerActionPerformed(evt);
            }
        });
        getContentPane().add(jfieldanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 70));

        jbtnCE.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 70, 70));

        jbtnB.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnB.setText("B");
        jbtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 70));

        jbtnPM.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnPM.setText("+/-");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 70, 70));

        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 70, 70));

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(153, 0, 102));
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 70, 70));

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(153, 0, 102));
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, 70));

        jbtnsub.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnsub.setForeground(new java.awt.Color(0, 153, 51));
        jbtnsub.setText("-");
        jbtnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsubActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 70, 70));

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(153, 0, 102));
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 70, 70));

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(153, 0, 102));
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 70, 70));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(153, 0, 102));
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, 70));

        jbtnadd.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnadd.setForeground(new java.awt.Color(0, 153, 51));
        jbtnadd.setText("+");
        jbtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 70, 70));

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(153, 0, 102));
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 70, 70));

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(153, 0, 102));
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 70, 70));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(153, 0, 102));
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, 70));

        jbtnmul.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnmul.setForeground(new java.awt.Color(0, 153, 51));
        jbtnmul.setText("*");
        jbtnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmulActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnmul, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 70, 70));

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(153, 0, 102));
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 70, 70));

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtn0.setForeground(new java.awt.Color(153, 0, 102));
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 70, 70));

        jbtndot.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 70, 70));

        jbtndiv.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtndiv.setForeground(new java.awt.Color(0, 153, 51));
        jbtndiv.setText("/");
        jbtndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtndiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 70, 70));

        jbtnequal.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jbtnequal.setText("=");
        jbtnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnequalActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnequal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
      
       Enternumber("3") ; 
// TODO add your handling code here:
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed

         Enternumber("8") ;
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
         Enternumber("4") ; 
// TODO add your handling code here:
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
          Enternumber("7") ;       // TODO add your handling code here:
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
       Enternumber("5") ;
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
      Enternumber("6") ;
        
// TODO add your handling code here:
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
     Enternumber("1") ;


        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
  Enternumber("2") ;


        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed

     Enternumber("0") ;

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
       Enternumber("9") ;
        

// TODO add your handling code here:
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndivActionPerformed


    num1=Double.parseDouble(jfieldanswer.getText());
    jfieldanswer.setText("");
    op="/";


        // TODO add your handling code here:
    }//GEN-LAST:event_jbtndivActionPerformed

    private void jbtnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmulActionPerformed

num1=Double.parseDouble(jfieldanswer.getText());
    jfieldanswer.setText("");
    op="*";




        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnmulActionPerformed

    private void jbtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnaddActionPerformed
    num1=Double.parseDouble(jfieldanswer.getText());
    jfieldanswer.setText("");
    op="+";
        


// TODO add your handling code here:
    }//GEN-LAST:event_jbtnaddActionPerformed

    private void jbtnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsubActionPerformed
      
num1=Double.parseDouble(jfieldanswer.getText());
    jfieldanswer.setText("");
    op="-";      
    // TODO add your handling code here:
    }//GEN-LAST:event_jbtnsubActionPerformed

    private void jbtnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnequalActionPerformed

num2=Double.parseDouble(jfieldanswer.getText());
if(op=="+")
{
    
  result=num1+num2;  
  jfieldanswer.setText(String.valueOf(result));
    
}
else if( op =="-")
{
    
      
  result=num1-num2;  
  jfieldanswer.setText(String.valueOf(result));
    
}

else if( op =="/")
{
    
      
  result=num1/num2;  
  jfieldanswer.setText(String.valueOf(result)); 
  

  
} 
  else if( op =="*")
{
    
      
  result=num1*num2;  
  jfieldanswer.setText(String.valueOf(result)); 
    

}
    

    

    }//GEN-LAST:event_jbtnequalActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
     jfieldanswer.setText("");


        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jfieldanswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfieldanswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfieldanswerActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed

  jfieldanswer.setText("");
  String fn,sn;
  fn=String.valueOf(num1);
  sn=String.valueOf(num2);
   fn="";
   sn="";



        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
double nums = Double.parseDouble(String.valueOf(jfieldanswer.getText()));

nums=nums*(-1);
jfieldanswer.setText(String.valueOf(nums));


        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBActionPerformed
         String bs=null;    
        
    if(jfieldanswer.getText().length()>0){
   
   StringBuilder p= new StringBuilder(jfieldanswer.getText());
   p.deleteCharAt(jfieldanswer.getText().length()-1);
   bs=p.toString();
   jfieldanswer.setText(bs);

}



    }//GEN-LAST:event_jbtnBActionPerformed

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
    if(!jfieldanswer.getText().contains("."))
    {
       jfieldanswer.setText(jfieldanswer.getText()+jbtndot.getText());
        
    } 
        
        
    }//GEN-LAST:event_jbtndotActionPerformed



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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnB;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnadd;
    private javax.swing.JButton jbtndiv;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtnequal;
    private javax.swing.JButton jbtnmul;
    private javax.swing.JButton jbtnsub;
    private javax.swing.JTextField jfieldanswer;
    // End of variables declaration//GEN-END:variables
}
