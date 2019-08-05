import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
public class VIEW extends javax.swing.JFrame {


    public VIEW() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("HOSTEL");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("STUDENT");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("FEE");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("ROOM");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("MESS");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("MESS EMPLOYEE");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("FURNITURE");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("VISITORS");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                VIEW TABLES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton5))
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(177, 177, 177)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(jRadioButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton7))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed

    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{Class.forName("oracle.jdbc.OracleDriver");
           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@Kishan:1521:orcl","kishan","kishan");
           String show="";
            if(jRadioButton1.isSelected())
            { 
                Statement st=con1.createStatement();
                ResultSet rs=st.executeQuery("select *FROM HOSTEL");
                show+="Building_no\t"+"No_of_rooms\t"+"No_of_student\t"+"Annual_expanses\t"+"Location\n";
                while(rs.next())
                {
                    int Building_no=rs.getInt("Building_no");
                   int No_of_rooms=rs.getInt("No_of_rooms");
                   int No_of_student=rs.getInt("No_of_student");
                   int Annual_expanses=rs.getInt("Annual_expanses");
                    String Location = rs.getString("Location");
                    show+=Building_no+"\t"+No_of_rooms+"\t"+No_of_student+"\t"+Annual_expanses+"\t"+Location+"\n";
                    jTextArea1.setText(show);
                }

            }
            if(jRadioButton2.isSelected())
            {
                Statement st=con1.createStatement();
                 ResultSet rs=st.executeQuery("select *from student");
                 show+="student_id\t"+"student_Name\t"+"father_name\t"+"department\t"+"cell_no\t"+"dob\t"+"building_number\n";
                 while(rs.next())
                {
                    int student_id=rs.getInt("student_id");
                    String student_name=rs.getString("student_name");
                    String father_name=rs.getString("father_name");
                    String department=rs.getString("department");
                    int cell_no=rs.getInt("cell_no");
                    String dob=rs.getString("dob");
                    int Building_number = rs.getInt("Building_number");
                    show+=student_id+"\t"+student_name+"\t"+father_name+"\t"+department+"\t"+cell_no+"\t"+dob+"\t"+Building_number+"\n";
                    jTextArea1.setText(show);
                }
            }  
            if(jRadioButton3.isSelected())
            {
                Statement st=con1.createStatement();
                ResultSet rs=st.executeQuery("select *from fee");
                show+="fee_month\t"+"fee_status\t"+"student_id\n";
                while(rs.next())
                {
                    String fee_month=rs.getString("fee_month");
                    String fee_status=rs.getString("fee_status");
                    int student_id=rs.getInt("student_id");
                    show+=fee_month+"\t"+fee_status+"\t"+student_id+"\n";
                    jTextArea1.setText(show);
                }
            }
            if(jRadioButton4.isSelected())
            { 
                Statement st=con1.createStatement();
                ResultSet rs=st.executeQuery("select * from room");
                show+="room_id\t"+"capacity\t"+"furniture_id\t"+"building_no\t"+"student_id\n";
                while(rs.next())
                {
                    int room_id=rs.getInt("room_id");
                   int capacity=rs.getInt("capacity");
                   String furniture_id=rs.getString("furniture_id");
                   int building_no =rs.getInt("building_no");
                    int student_id= rs.getInt("student_id");
                    show+=room_id+"\t"+capacity+"\t"+furniture_id+"\t"+building_no+"\t"+student_id+"\n";
                    jTextArea1.setText(show);
                }

            }
            if(jRadioButton5.isSelected())
            {
                Statement st=con1.createStatement();
                 ResultSet rs=st.executeQuery("select *from mess");
                 show+="mess_incharge\t"+"monthly_expanses\t"+"mess_timming\n";
                 while(rs.next())
                 {
                    String mess_incharge=rs.getString("mess_incharge");
                    int monthly_expanses=rs.getInt("monthly_expanses");
                    String mess_timming=rs.getString("mess_timming");
                    show+=mess_incharge+"\t"+monthly_expanses+"\t"+mess_timming+"\n";
                    jTextArea1.setText(show);
                }
            }  
            if(jRadioButton6.isSelected())
            {
                Statement st=con1.createStatement();
                ResultSet rs=st.executeQuery("select *from mess_employee");
                show+="emp_id\t"+"emp_name\t"+"address\t"+"emp_salary\t"+"cell_no\t"+"Building_no\t"+"mess_incharge\n";
                while(rs.next())
                {
                    int emp_id=rs.getInt("emp_id");
                    String emp_name=rs.getString("emp_name");
                    String address=rs.getString("address");
                    int emp_salary=rs.getInt("emp_salary");
                    String cell_no=rs.getString("cell_no");
                    int Building_no=rs.getInt("Building_no");
                    String mess_incharge=rs.getString("mess_incharge");
                    show+=emp_id+"\t"+emp_name+"\t"+address+"\t"+emp_salary+"\t"+cell_no+"\t"+Building_no+"\t"+mess_incharge+"\n";
                    jTextArea1.setText(show);
                }
            }
             if(jRadioButton7.isSelected())
            {
                Statement st=con1.createStatement();
                 ResultSet rs=st.executeQuery("select *from furniture");
                 show+="furniture_id\t"+"furniture_type\n";
                 while(rs.next())
                 {
                    String furniture_id=rs.getString("furniture_id");
                    String furniture_type=rs.getString("furniture_type");
                    show+=furniture_id+"\t"+furniture_type+"\n";
                    jTextArea1.setText(show);
                }
            }  
            if(jRadioButton8.isSelected())
            {
                Statement st=con1.createStatement();
                ResultSet rs=st.executeQuery("select *from visitors");
                show+="visitors_name\t"+"time_in\t"+"time_out\t"+"todays_date\t"+"student_id\n";
                while(rs.next())
                {
                    
                    String visitors_name=rs.getString("visitors_name");
 
                    String time_in=rs.getString("time_in");
                    String time_out=rs.getString("time_out");
                    String todays_date=rs.getString("todays_date");
                      int student_id=rs.getInt("student_id");
                    show+=visitors_name+"\t"+time_in+"\t"+time_out+"\t"+todays_date+"\t"+student_id+"\n";
                    jTextArea1.setText(show);
                }
            }
            
        }
        catch(Exception e) {JOptionPane.showMessageDialog(null,"Error="+e);}       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ADMIN aobj=new ADMIN();
       aobj.show();
       this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      VIEW vobj=new VIEW();
      vobj.show();
      this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
