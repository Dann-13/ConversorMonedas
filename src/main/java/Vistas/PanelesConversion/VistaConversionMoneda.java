/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas.PanelesConversion;

import Model.CurrencyConverter;
import Clases.Filtro.NumerosDocumentFilter;
import Controllers.CurrencyConverterController;
import Vistas.Componentes.Footer;
import Vistas.Contenedores.ConversionTemperaturaFrame;
import Vistas.Contenedores.ConversorMonedasFrame;
import Vistas.Contenedores.Menu;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author dan-dev
 */
public class VistaConversionMoneda extends javax.swing.JPanel {

    private CurrencyConverterController controller;
    private ConversorMonedasFrame frame;

    /**
     * Creates new form NewJPanel
     */
    public VistaConversionMoneda(ConversorMonedasFrame frame) {
        this.frame = frame;
        initComponents();
        uiEditor();
        setImageLabel(jLabelImg, "./src/main/java/Source/pesoeuro.png");
        controller = new CurrencyConverterController(new CurrencyConverter());
        inicializadorEventos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImporte = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        sourceCurrencyComboBox = new javax.swing.JComboBox<>();
        targetCurrencyComboBox = new javax.swing.JComboBox<>();
        btnConvert = new javax.swing.JButton();
        jLabelRes = new javax.swing.JLabel();
        jLabelImg = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(13, 24, 39));
        setPreferredSize(new java.awt.Dimension(500, 600));

        lblImporte.setForeground(new java.awt.Color(255, 255, 255));
        lblImporte.setText("IMPORTE");

        txtImporte.setBackground(new java.awt.Color(255, 255, 255));
        txtImporte.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(102, 255, 255)));
        txtImporte.setCaretColor(new java.awt.Color(0, 0, 0));
        txtImporte.setDragEnabled(true);
        txtImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImporteActionPerformed(evt);
            }
        });

        sourceCurrencyComboBox.setBackground(new java.awt.Color(255, 255, 255));
        sourceCurrencyComboBox.setForeground(new java.awt.Color(0, 0, 0));
        sourceCurrencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        targetCurrencyComboBox.setBackground(new java.awt.Color(255, 255, 255));
        targetCurrencyComboBox.setForeground(new java.awt.Color(0, 0, 0));
        targetCurrencyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConvert.setBackground(new java.awt.Color(45, 212, 191));
        btnConvert.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        btnConvert.setForeground(new java.awt.Color(0, 0, 0));
        btnConvert.setText("Convertir");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        jLabelRes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRes.setFont(new java.awt.Font("Big John", 0, 20)); // NOI18N
        jLabelRes.setForeground(new java.awt.Color(45, 212, 191));
        jLabelRes.setText("20");

        jButtonVolver.setBackground(new java.awt.Color(45, 212, 191));
        jButtonVolver.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(0, 0, 0));
        jButtonVolver.setText("<-");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelRes, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(targetCurrencyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sourceCurrencyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sourceCurrencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(targetCurrencyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImporteActionPerformed
        // TODO add your handling code here:
        ((AbstractDocument) txtImporte.getDocument()).setDocumentFilter(new NumerosDocumentFilter());


    }//GEN-LAST:event_txtImporteActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        // TODO add your handling code here:
        String selectedSourceCurrency = (String) sourceCurrencyComboBox.getSelectedItem();
        String selectedTargetCurrency = (String) targetCurrencyComboBox.getSelectedItem();
        String inputText = txtImporte.getText();

        if (inputText.isEmpty()) {
            // El campo está vacío, muestra una ventana de advertencia
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor en el campo de importe.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                double amount = Double.parseDouble(inputText);
                // Realizar la conversión de moneda con los valores seleccionados
                double convertedAmount = controller.convertCurrency(selectedSourceCurrency, selectedTargetCurrency, amount);
                this.jLabelRes.setText(String.valueOf(convertedAmount));
            } catch (NumberFormatException e) {
                // El valor ingresado no es un número válido, muestra una ventana de advertencia
                JOptionPane.showMessageDialog(this, "El valor ingresado no es válido. Por favor, ingrese un número.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelRes;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JComboBox<String> sourceCurrencyComboBox;
    private javax.swing.JComboBox<String> targetCurrencyComboBox;
    private javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables

    private void uiEditor() {

        String[] currencies = {"USD", "EUR", "JPY", "GBP"};
        DefaultComboBoxModel<String> sourceCurrencyModel = new DefaultComboBoxModel<>(currencies);
        sourceCurrencyComboBox.setModel(sourceCurrencyModel);

        DefaultComboBoxModel<String> targetCurrencyModel = new DefaultComboBoxModel<>(currencies);
        targetCurrencyComboBox.setModel(targetCurrencyModel);
        
        Footer linkLabel = new Footer("Visita mi sitio web, ¡Haz Click!");       
        linkLabel.setBounds(0, 530, 500, 30);
        this.add(linkLabel);

    }

    public void setImageLabel(JLabel labelName, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        labelName.setHorizontalAlignment(JLabel.CENTER);
        labelName.setVerticalAlignment(JLabel.CENTER);
        labelName.setIcon(icon);
    }

    private void inicializadorEventos() {
        ActionListener escuchaBtnVolver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escuchaBtnVolverClick();
            }
        };
        jButtonVolver.addActionListener(escuchaBtnVolver);
    }

    private void escuchaBtnVolverClick() {
        frame.dispose(); // Cierra el ConversionTemperaturaFrame actual
        Menu menu = new Menu();
        menu.setVisible(true);
    }

}
