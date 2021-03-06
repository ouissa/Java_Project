/*m
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseraGui;

import static CourseraGui.CourseraFrame.Courses;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import courseraapplication.course.Course;
import courseraapplication.course.CourseFeesComparator;
import java.util.List;
/**
 *
 * @author ouiss_000
 */
public class SerachCourse extends javax.swing.JPanel {
   
    
    DefaultTableModel model;
    String[] colNames = {"Title","Fees","Reference","Certificate"};
    

    /**
     * Creates new form SerachCourse
     */
    public SerachCourse() {
        
        System.out.println("we are in tables");
        System.out.println(Courses);
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colNames);
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

        serachLabel = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        serachLabel.setText("Course Search");

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Search_By_fees");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(serachLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(searchText)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serachLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(searchButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // Get keyword from the user :
    String str;
    str = searchText.getText();
    double fees;
    try{
        fees=Double.parseDouble(str);
    }catch(NumberFormatException exe){
        JOptionPane.showMessageDialog(SerachCourse.this, "Please enter a double","Search Course...." , JOptionPane.ERROR_MESSAGE);
       return;
       
    }//GEN-LAST:event_searchButtonActionPerformed
    Course temp= new Course("nk","lk","bk",fees,"yes");
    List <Course> results= Courses.searchElement(new CourseFeesComparator(),temp);
    for(Course result : results){
        System.out.println(result);
    }
            if(!results.isEmpty()){
            Object[][] data = new Object[results.size()][colNames.length]; 
            for(int i=0; i<results.size(); i++){
                Course cr=results.get(i);
                data[i][0]= cr.getTitle();
                data[i][1]= cr.getFees();
                data[i][3] = cr.getCertificate();
                data[i][2]= cr.getReference();
            }
           
            model.setDataVector(data,colNames);
            JOptionPane.showMessageDialog(SerachCourse.this,"results","Searching....",JOptionPane.INFORMATION_MESSAGE);
        }else{
            model.setDataVector(null,colNames);
            JOptionPane.showMessageDialog(SerachCourse.this,"No search results","Searching....",JOptionPane.INFORMATION_MESSAGE);
            return; 
            }
                
    }
    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel serachLabel;
    // End of variables declaration//GEN-END:variables
}
