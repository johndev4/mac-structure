/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johndev4.MACStructure;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author raphm
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
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

        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jRadioBtnFormal = new javax.swing.JRadioButton();
        jRadioBtnInformal = new javax.swing.JRadioButton();
        jRadioBtnCustom = new javax.swing.JRadioButton();
        jBtnFormat = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jChkBoxUpperCase = new javax.swing.JCheckBox();
        jChkBoxColon = new javax.swing.JCheckBox();
        jChkBoxSquareBrackets = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldResults = new javax.swing.JTextField();
        jBtnCheck = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jBtnAbout = new javax.swing.JButton();
        jBtnCopy = new javax.swing.JButton();
        textFieldMacAddress = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAC Structure v1.0.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(246, 246, 246));

        jPanel4.setBackground(new java.awt.Color(246, 246, 246));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Basic", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 17))); // NOI18N

        buttonGroup3.add(jRadioBtnFormal);
        jRadioBtnFormal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioBtnFormal.setSelected(true);
        jRadioBtnFormal.setText("Formal");
        jRadioBtnFormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnFormalActionPerformed(evt);
            }
        });
        jRadioBtnFormal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioBtnFormalKeyPressed(evt);
            }
        });

        buttonGroup3.add(jRadioBtnInformal);
        jRadioBtnInformal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioBtnInformal.setText("Informal");
        jRadioBtnInformal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnInformalActionPerformed(evt);
            }
        });
        jRadioBtnInformal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioBtnInformalKeyPressed(evt);
            }
        });

        buttonGroup3.add(jRadioBtnCustom);
        jRadioBtnCustom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioBtnCustom.setText("Custom");
        jRadioBtnCustom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioBtnCustomKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jRadioBtnFormal)
                .addGap(33, 33, 33)
                .addComponent(jRadioBtnInformal)
                .addGap(51, 51, 51)
                .addComponent(jRadioBtnCustom)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBtnFormal)
                    .addComponent(jRadioBtnInformal)
                    .addComponent(jRadioBtnCustom))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jBtnFormat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnFormat.setText("Format");
        jBtnFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFormatActionPerformed(evt);
            }
        });
        jBtnFormat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnFormatKeyPressed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(246, 246, 246));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Advance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 17))); // NOI18N

        jChkBoxUpperCase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jChkBoxUpperCase.setSelected(true);
        jChkBoxUpperCase.setText("Uppercase");
        jChkBoxUpperCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkBoxUpperCaseActionPerformed(evt);
            }
        });
        jChkBoxUpperCase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jChkBoxUpperCaseKeyPressed(evt);
            }
        });

        jChkBoxColon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jChkBoxColon.setSelected(true);
        jChkBoxColon.setText("Colon (:)");
        jChkBoxColon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkBoxColonActionPerformed(evt);
            }
        });
        jChkBoxColon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jChkBoxColonKeyPressed(evt);
            }
        });

        jChkBoxSquareBrackets.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jChkBoxSquareBrackets.setText("Enclose with Brackets");
        jChkBoxSquareBrackets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkBoxSquareBracketsActionPerformed(evt);
            }
        });
        jChkBoxSquareBrackets.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jChkBoxSquareBracketsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChkBoxSquareBrackets)
                    .addComponent(jChkBoxColon)
                    .addComponent(jChkBoxUpperCase))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jChkBoxUpperCase)
                .addGap(18, 18, 18)
                .addComponent(jChkBoxColon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jChkBoxSquareBrackets)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("MAC Address:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Results:");

        jTextFieldResults.setEditable(false);
        jTextFieldResults.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldResultsMouseClicked(evt);
            }
        });
        jTextFieldResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultsActionPerformed(evt);
            }
        });

        jBtnCheck.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnCheck.setText("Check");
        jBtnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCheckActionPerformed(evt);
            }
        });
        jBtnCheck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnCheckKeyPressed(evt);
            }
        });

        jBtnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnClear.setText("Clear");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });
        jBtnClear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnClearKeyPressed(evt);
            }
        });

        jBtnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        jBtnExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnExitKeyPressed(evt);
            }
        });

        jBtnAbout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnAbout.setText("About");
        jBtnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAboutActionPerformed(evt);
            }
        });
        jBtnAbout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnAboutKeyPressed(evt);
            }
        });

        jBtnCopy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBtnCopy.setText("Copy");
        jBtnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCopyActionPerformed(evt);
            }
        });
        jBtnCopy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtnCopyKeyPressed(evt);
            }
        });

        textFieldMacAddress.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        textFieldMacAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldMacAddressKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldMacAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jTextFieldResults))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBtnFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBtnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMacAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioBtnFormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnFormalActionPerformed
        jChkBoxUpperCase.setSelected(true);
        jChkBoxColon.setSelected(true);
        jChkBoxSquareBrackets.setSelected(false);
    }//GEN-LAST:event_jRadioBtnFormalActionPerformed

    private void jRadioBtnInformalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnInformalActionPerformed
        jChkBoxUpperCase.setSelected(false);
        jChkBoxColon.setSelected(false);
        jChkBoxSquareBrackets.setSelected(false);
    }//GEN-LAST:event_jRadioBtnInformalActionPerformed

    private void jChkBoxUpperCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkBoxUpperCaseActionPerformed
        jRadioBtnCustom.setSelected(true);
    }//GEN-LAST:event_jChkBoxUpperCaseActionPerformed

    private void jChkBoxColonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkBoxColonActionPerformed
        jRadioBtnCustom.setSelected(true);
    }//GEN-LAST:event_jChkBoxColonActionPerformed

    private void jChkBoxSquareBracketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkBoxSquareBracketsActionPerformed
        jRadioBtnCustom.setSelected(true);
    }//GEN-LAST:event_jChkBoxSquareBracketsActionPerformed

    private void jBtnFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFormatActionPerformed
        MacAddress addr = new MacAddress();
        addr.setText(textFieldMacAddress.getText());
        
        if (!addr.toString().equals(MacAddress.ERROR_MESSAGE)){
            jTextFieldResults.setText(addr.format(jChkBoxUpperCase.isSelected(), jChkBoxColon.isSelected(), jChkBoxSquareBrackets.isSelected()));
            
        } else if (textFieldMacAddress.getText().isEmpty()){
            JLabel label = new JLabel("Textfield is empty.");
            label.setFont(new Font("Tahoma", 0, 18));
            JOptionPane.showMessageDialog(null,label,"Invalid!",JOptionPane.WARNING_MESSAGE);
            
        } else{
            JLabel label = new JLabel("\"" + textFieldMacAddress.getText() + "\"" + " is not a invalid MAC Address.");
            label.setFont(new Font("Tahoma", 0, 18));
            JOptionPane.showMessageDialog(null,label,"Invalid!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnFormatActionPerformed

    private void jBtnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCheckActionPerformed
        MacAddress addr = new MacAddress();
        addr.setText(textFieldMacAddress.getText());
        
        if (!addr.toString().equals(MacAddress.ERROR_MESSAGE)){
            JLabel label = new JLabel("Verified!");
            label.setFont(new Font("Tahoma", 0, 18));
            JOptionPane.showMessageDialog(null,label,"",JOptionPane.INFORMATION_MESSAGE);
            
        } else if (textFieldMacAddress.getText().isEmpty()){
            JLabel label = new JLabel("Textfield is empty.");
            label.setFont(new Font("Tahoma", 0, 18));
            JOptionPane.showMessageDialog(null,label,"Invalid!",JOptionPane.WARNING_MESSAGE);
            
        } else{
            JLabel label = new JLabel("\"" + textFieldMacAddress.getText() + "\"" + " is not a invalid MAC Address.");
            label.setFont(new Font("Tahoma", 0, 18));
            JOptionPane.showMessageDialog(null,label,"Invalid!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnCheckActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        textFieldMacAddress.setText("");
        jTextFieldResults.setText("");
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnCheckKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnCheckKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBtnCheck.doClick();
        }
    }//GEN-LAST:event_jBtnCheckKeyPressed

    private void jRadioBtnFormalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioBtnFormalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jRadioBtnFormal.doClick();
        }
    }//GEN-LAST:event_jRadioBtnFormalKeyPressed

    private void jRadioBtnInformalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioBtnInformalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jRadioBtnInformal.doClick();
        }
    }//GEN-LAST:event_jRadioBtnInformalKeyPressed

    private void jRadioBtnCustomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioBtnCustomKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jRadioBtnCustom.doClick();
        }
    }//GEN-LAST:event_jRadioBtnCustomKeyPressed

    private void jChkBoxUpperCaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jChkBoxUpperCaseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jChkBoxUpperCase.doClick();
        }
    }//GEN-LAST:event_jChkBoxUpperCaseKeyPressed

    private void jChkBoxColonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jChkBoxColonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jChkBoxColon.doClick();
        }
    }//GEN-LAST:event_jChkBoxColonKeyPressed

    private void jChkBoxSquareBracketsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jChkBoxSquareBracketsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jChkBoxSquareBrackets.doClick();
        }
    }//GEN-LAST:event_jChkBoxSquareBracketsKeyPressed

    private void jBtnFormatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnFormatKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBtnFormat.doClick();
        }
    }//GEN-LAST:event_jBtnFormatKeyPressed

    private void jBtnClearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnClearKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBtnClear.doClick();
        }
    }//GEN-LAST:event_jBtnClearKeyPressed

    private void jBtnExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnExitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBtnExit.doClick();
        }
    }//GEN-LAST:event_jBtnExitKeyPressed

    private void jBtnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAboutActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_jBtnAboutActionPerformed

    private void jBtnAboutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnAboutKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBtnAbout.doClick();
        }
    }//GEN-LAST:event_jBtnAboutKeyPressed

    private void jBtnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCopyActionPerformed
        if (!jTextFieldResults.getText().isEmpty()){
            StringSelection stringSelection = new StringSelection(jTextFieldResults.getText());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

            JLabel label = new JLabel("Copied to clipboard.");
            label.setFont(new Font("Tahoma", 0, 18));
            JOptionPane.showMessageDialog(null,label,"",JOptionPane.INFORMATION_MESSAGE);
            
        } else{
            JLabel label = new JLabel("Textfield is empty.");
            label.setFont(new Font("Tahoma", 0, 18));
            JOptionPane.showMessageDialog(null,label,"Invalid!",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnCopyActionPerformed

    private void jBtnCopyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnCopyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBtnCopy.doClick();
        }
    }//GEN-LAST:event_jBtnCopyKeyPressed

    private void jTextFieldResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultsActionPerformed
        jTextFieldResults.selectAll();
    }//GEN-LAST:event_jTextFieldResultsActionPerformed

    private void jTextFieldResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldResultsMouseClicked
        jTextFieldResults.selectAll();
    }//GEN-LAST:event_jTextFieldResultsMouseClicked

    private void textFieldMacAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldMacAddressKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBtnFormat.doClick();
        }
    }//GEN-LAST:event_textFieldMacAddressKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jBtnAbout;
    private javax.swing.JButton jBtnCheck;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnCopy;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnFormat;
    private javax.swing.JCheckBox jChkBoxColon;
    private javax.swing.JCheckBox jChkBoxSquareBrackets;
    private javax.swing.JCheckBox jChkBoxUpperCase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioBtnCustom;
    private javax.swing.JRadioButton jRadioBtnFormal;
    private javax.swing.JRadioButton jRadioBtnInformal;
    private javax.swing.JTextField jTextFieldResults;
    private java.awt.TextField textFieldMacAddress;
    // End of variables declaration//GEN-END:variables
}
