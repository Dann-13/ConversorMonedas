/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.PanelesConversion;

import Clases.Filtro.NumerosDocumentFilter;
import Controllers.TemperaturaController;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author dan-dev
 */
public class VistaConversionTemperatura extends javax.swing.JPanel {

    
    TemperaturaController temController;

    /**
     * Creates new form Temperatura
     */
    public VistaConversionTemperatura() {
        temController = new TemperaturaController();
        initComponents();
        uiEditor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        txtTemperaura = new javax.swing.JTextField();
        sourceTempComboBox = new javax.swing.JComboBox<>();
        targetTempComboBox = new javax.swing.JComboBox<>();
        btnConvert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelRes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 24, 39));
        setPreferredSize(new java.awt.Dimension(500, 600));

        txtTemperaura.setBackground(new java.awt.Color(255, 255, 255));
        txtTemperaura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(102, 255, 255)));
        txtTemperaura.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTemperaura.setDragEnabled(true);
        txtTemperaura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperauraActionPerformed(evt);
            }
        });

        sourceTempComboBox.setBackground(new java.awt.Color(255, 255, 255));
        sourceTempComboBox.setForeground(new java.awt.Color(0, 0, 0));
        sourceTempComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sourceTempComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTempComboBoxActionPerformed(evt);
            }
        });

        targetTempComboBox.setBackground(new java.awt.Color(255, 255, 255));
        targetTempComboBox.setForeground(new java.awt.Color(0, 0, 0));
        targetTempComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConvert.setBackground(new java.awt.Color(45, 212, 191));
        btnConvert.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        btnConvert.setForeground(new java.awt.Color(0, 0, 0));
        btnConvert.setText("Convertir");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TEMPERATURA");

        jLabelRes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRes.setFont(new java.awt.Font("Big John", 0, 20)); // NOI18N
        jLabelRes.setForeground(new java.awt.Color(45, 212, 191));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTemperaura, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceTempComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetTempComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTemperaura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(sourceTempComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(targetTempComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperauraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperauraActionPerformed


    }//GEN-LAST:event_txtTemperauraActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        // TODO add your handling code here:
        String selectedSourceTemp = (String) sourceTempComboBox.getSelectedItem();
        String selectedTargetTemp = (String) targetTempComboBox.getSelectedItem();
        double amount = Double.parseDouble(txtTemperaura.getText());
        
        double res = temController.convertirTemperatura(amount, selectedSourceTemp, selectedTargetTemp);
        jLabelRes.setText(String.valueOf(res));


    }//GEN-LAST:event_btnConvertActionPerformed

    private void sourceTempComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTempComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTempComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelRes;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JComboBox<String> sourceTempComboBox;
    private javax.swing.JComboBox<String> targetTempComboBox;
    private javax.swing.JTextField txtTemperaura;
    // End of variables declaration//GEN-END:variables

    private void uiEditor() {
        String[] temps = {"Centigrados ºC ", "Fahrenheit ºF", "Kelvin K", "Rankine R"};
        DefaultComboBoxModel<String> sourceTempModel = new DefaultComboBoxModel<>(temps);
        sourceTempComboBox.setModel(sourceTempModel);

        DefaultComboBoxModel<String> targetTempModel = new DefaultComboBoxModel<>(temps);
        targetTempComboBox.setModel(targetTempModel);

        AbstractDocument doc = (AbstractDocument) txtTemperaura.getDocument();
        doc.setDocumentFilter(new NumerosDocumentFilter());
    }

}
