/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlamningsuppgift_12;

import javax.swing.JOptionPane;

/**
 *
 * @author aagic
 */
public class Inlamningsuppgift_12_frame extends javax.swing.JFrame {
//private String display="";
private double total1=0.0;
private double total2=0.0;
private char mathOperator;
private double minne=0.0;
//private double plusMinus=0.0;
    /**
     * Creates new form Inlamningsuppgift_12_frame
     */
    public Inlamningsuppgift_12_frame() {
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

        btnEtt = new javax.swing.JButton();
        btnTva = new javax.swing.JButton();
        btnTre = new javax.swing.JButton();
        btnFyra = new javax.swing.JButton();
        btnFem = new javax.swing.JButton();
        btnSex = new javax.swing.JButton();
        btnSju = new javax.swing.JButton();
        btnAtta = new javax.swing.JButton();
        btnNio = new javax.swing.JButton();
        btnNoll = new javax.swing.JButton();
        btnDelat = new javax.swing.JButton();
        btnGanger = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        lblDisplay = new javax.swing.JLabel();
        btnLikaMed = new javax.swing.JButton();
        btnRensa = new javax.swing.JButton();
        btnKomma = new javax.swing.JButton();
        btnMPlus = new javax.swing.JButton();
        btnMMinus = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnRotenUr = new javax.swing.JButton();
        btnUpphojtTillTva = new javax.swing.JButton();
        btnUpphojtTillTre = new javax.swing.JButton();
        btnEttDelatMed = new javax.swing.JButton();
        btnNFakultet = new javax.swing.JButton();
        btnUpphojtTillY = new javax.swing.JButton();
        lblMinne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Miniräknare");

        btnEtt.setText("1");
        btnEtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEttActionPerformed(evt);
            }
        });

        btnTva.setText("2");
        btnTva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTvaActionPerformed(evt);
            }
        });

        btnTre.setText("3");
        btnTre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreActionPerformed(evt);
            }
        });

        btnFyra.setText("4");
        btnFyra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFyraActionPerformed(evt);
            }
        });

        btnFem.setText("5");
        btnFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemActionPerformed(evt);
            }
        });

        btnSex.setText("6");
        btnSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSexActionPerformed(evt);
            }
        });

        btnSju.setText("7");
        btnSju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSjuActionPerformed(evt);
            }
        });

        btnAtta.setText("8");
        btnAtta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttaActionPerformed(evt);
            }
        });

        btnNio.setText("9");
        btnNio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNioActionPerformed(evt);
            }
        });

        btnNoll.setText("0");
        btnNoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNollActionPerformed(evt);
            }
        });

        btnDelat.setText("÷");
        btnDelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelatActionPerformed(evt);
            }
        });

        btnGanger.setText("x");
        btnGanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGangerActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        lblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLikaMed.setText("=");
        btnLikaMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLikaMedActionPerformed(evt);
            }
        });

        btnRensa.setText("C");
        btnRensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRensaActionPerformed(evt);
            }
        });

        btnKomma.setText(".");
        btnKomma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKommaActionPerformed(evt);
            }
        });

        btnMPlus.setText("M+");
        btnMPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMPlusActionPerformed(evt);
            }
        });

        btnMMinus.setText("M-");
        btnMMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMMinusActionPerformed(evt);
            }
        });

        btnMC.setText("MC");
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });

        btnMR.setText("MR");
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });

        btnPlusMinus.setText("+/-");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btnRotenUr.setText("√");
        btnRotenUr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotenUrActionPerformed(evt);
            }
        });

        btnUpphojtTillTva.setText("^2");
        btnUpphojtTillTva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpphojtTillTvaActionPerformed(evt);
            }
        });

        btnUpphojtTillTre.setText("^3");
        btnUpphojtTillTre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpphojtTillTreActionPerformed(evt);
            }
        });

        btnEttDelatMed.setText("1/x");
        btnEttDelatMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEttDelatMedActionPerformed(evt);
            }
        });

        btnNFakultet.setText("n!");
        btnNFakultet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNFakultetActionPerformed(evt);
            }
        });

        btnUpphojtTillY.setText("x^y");
        btnUpphojtTillY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpphojtTillYActionPerformed(evt);
            }
        });

        lblMinne.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNoll)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEtt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTva)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTre)
                                    .addComponent(btnKomma)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFyra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSex))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSju)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRensa)
                                        .addGap(7, 7, 7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAtta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNio))
                                    .addComponent(lblMinne, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelat)
                            .addComponent(btnGanger)
                            .addComponent(btnMinus)
                            .addComponent(btnPlus)
                            .addComponent(btnLikaMed))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlusMinus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnMPlus, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMMinus)
                                .addComponent(btnMC)
                                .addComponent(btnMR))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRotenUr)
                    .addComponent(btnUpphojtTillTva)
                    .addComponent(btnUpphojtTillTre)
                    .addComponent(btnEttDelatMed)
                    .addComponent(btnNFakultet)
                    .addComponent(btnUpphojtTillY))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelat)
                            .addComponent(btnRensa)
                            .addComponent(lblMinne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNio)
                            .addComponent(btnAtta)
                            .addComponent(btnSju)
                            .addComponent(btnGanger))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSex)
                            .addComponent(btnFem)
                            .addComponent(btnFyra)
                            .addComponent(btnMinus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEtt)
                            .addComponent(btnTva)
                            .addComponent(btnTre)
                            .addComponent(btnPlus)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlusMinus)
                            .addComponent(btnRotenUr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMPlus)
                            .addComponent(btnUpphojtTillTva))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMR)
                                    .addComponent(btnNFakultet)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(btnMMinus))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpphojtTillTre)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMC)
                                    .addComponent(btnEttDelatMed))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNoll)
                        .addComponent(btnLikaMed)
                        .addComponent(btnKomma))
                    .addComponent(btnUpphojtTillY))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEttActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"1");
    }//GEN-LAST:event_btnEttActionPerformed

    private void btnTvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTvaActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"2");
    }//GEN-LAST:event_btnTvaActionPerformed

    private void btnTreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"3");
    }//GEN-LAST:event_btnTreActionPerformed

    private void btnFyraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFyraActionPerformed
        // TODO add your handling code here:
    lblDisplay.setText(lblDisplay.getText()+"4");
    }//GEN-LAST:event_btnFyraActionPerformed

    private void btnFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"5");
    }//GEN-LAST:event_btnFemActionPerformed

    private void btnSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSexActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"6");
    }//GEN-LAST:event_btnSexActionPerformed

    private void btnSjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSjuActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"7");
    }//GEN-LAST:event_btnSjuActionPerformed

    private void btnAttaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttaActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"8");
    }//GEN-LAST:event_btnAttaActionPerformed

    private void btnNioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNioActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"9");
    }//GEN-LAST:event_btnNioActionPerformed

    private void btnNollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNollActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(lblDisplay.getText()+"0");
    }//GEN-LAST:event_btnNollActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
          String knappText=btnPlus.getText();
          getOperator(knappText);
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnLikaMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLikaMedActionPerformed
        // TODO add your handling code here:
     switch (mathOperator) {
        case '+':
            total2 = total1 + Double.parseDouble(lblDisplay.getText( ) );
            break;
        case '-':
            total2 = total1 - Double.parseDouble(lblDisplay.getText( ) );
            break;
        case '÷':
            if (Double.parseDouble(lblDisplay.getText())==0){
                JOptionPane.showMessageDialog(null,
                                        "Nämnaren kan inte vara 0 i division \n Mata in en ny nämnare.",
                                        "Fel i inmatning",
                                        JOptionPane.ERROR_MESSAGE);
                lblDisplay.setText("");
                
                return;
            }
            total2 = total1 / Double.parseDouble(lblDisplay.getText());
            break;
        case 'x':
            total2 = total1 * Double.parseDouble(lblDisplay.getText());
            break;
        case 'u':
            total2 = Math.pow(total1, Double.parseDouble(lblDisplay.getText()));
            break;
    }
     Visa(total2);
     total1=0;
    }//GEN-LAST:event_btnLikaMedActionPerformed

    private void btnRensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRensaActionPerformed
        // TODO add your handling code here:
        total1=0;
        total2=0;
        //display="";
        lblDisplay.setText("");
    }//GEN-LAST:event_btnRensaActionPerformed

    private void btnKommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKommaActionPerformed
        // TODO add your handling code here:
        String display=lblDisplay.getText();
        if (display.length()==0){
            lblDisplay.setText(lblDisplay.getText()+"0.");
            return;
        }
        
        double decimalKontroll=Double.valueOf(lblDisplay.getText());
        decimalKontroll=decimalKontroll*10;
        decimalKontroll=decimalKontroll%10;
        if (decimalKontroll==0){
            lblDisplay.setText(lblDisplay.getText()+".");
        }
        else {
                        JOptionPane.showMessageDialog(null,
                           "Talet kan bara innehålla ett decimaltecken",
                           "Fel i inmatning",
                           JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnKommaActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:
        String knappText=btnMinus.getText();
        getOperator(knappText);
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnGangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGangerActionPerformed
        // TODO add your handling code here:
        String knappText=btnGanger.getText();
        getOperator(knappText);
    }//GEN-LAST:event_btnGangerActionPerformed

    private void btnDelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelatActionPerformed
        // TODO add your handling code here:
        String knappText=btnDelat.getText();
        getOperator(knappText);
    }//GEN-LAST:event_btnDelatActionPerformed

    private void btnMPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMPlusActionPerformed
        // TODO add your handling code here:
        minne=minne+Double.parseDouble(lblDisplay.getText());
        System.out.println(minne+" Läggs till minnet");
        kollaMinne();
    }//GEN-LAST:event_btnMPlusActionPerformed

    private void btnMMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMMinusActionPerformed
        // TODO add your handling code here:
        minne=minne-Double.parseDouble(lblDisplay.getText());
        System.out.println(lblDisplay.getText()+" togs bort, minnet är nu "+minne);
        kollaMinne();
    }//GEN-LAST:event_btnMMinusActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        // TODO add your handling code here:
        minne=0;
        kollaMinne();
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(Double.toString(minne));
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed
        // TODO add your handling code here:
        double plusMinus;
        plusMinus=Double.parseDouble(lblDisplay.getText());
        plusMinus=plusMinus*(-1);
        Visa(plusMinus);
    }//GEN-LAST:event_btnPlusMinusActionPerformed

    private void btnRotenUrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotenUrActionPerformed
        // TODO add your handling code here:
        if (Double.parseDouble(lblDisplay.getText( ) )<0){
            JOptionPane.showMessageDialog(null,
                           "Kan ej dra roten ur negativa tal",
                           "Fel i inmatning",
                           JOptionPane.ERROR_MESSAGE);
        //    return;
        }
        else {
        double rotenUr=(Math.sqrt(Double.valueOf(lblDisplay.getText())));
        Visa(rotenUr);
        }
    }//GEN-LAST:event_btnRotenUrActionPerformed

    private void btnUpphojtTillTvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpphojtTillTvaActionPerformed
        // TODO add your handling code here:
        double tal=Double.valueOf(lblDisplay.getText());
        tal=tal*tal;
        Visa(tal);
    }//GEN-LAST:event_btnUpphojtTillTvaActionPerformed

    private void btnUpphojtTillTreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpphojtTillTreActionPerformed
        // TODO add your handling code here:
        double tal=Double.valueOf(lblDisplay.getText());
        tal=tal*tal*tal;
        Visa(tal);
    }//GEN-LAST:event_btnUpphojtTillTreActionPerformed

    private void btnEttDelatMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEttDelatMedActionPerformed
        // TODO add your handling code here:
        double tal=Double.valueOf(lblDisplay.getText());
        tal=1/tal;
        lblDisplay.setText(String.valueOf(tal));
    }//GEN-LAST:event_btnEttDelatMedActionPerformed

    private void btnNFakultetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNFakultetActionPerformed
        // TODO add your handling code here:
        int tal=0;
        
        try {
            tal=Integer.valueOf(lblDisplay.getText());
        }
        catch (java.lang.NumberFormatException error) {
            JOptionPane.showMessageDialog(null,
                                        "n! fungerar endast med positiva heltal",
                                        "Fel i inmatning",
                                        JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tal>20){
                        JOptionPane.showMessageDialog(null,
                                        "n! fungerar endast upp till 20",
                                        "Fel i inmatning",
                                        JOptionPane.ERROR_MESSAGE);
//            lblDisplay.setText("");
            return;
        }
        long resultat=tal;
      //  for (int i=2; i<tal; i++){

          for (int i=1; i<tal; i++){
                resultat=resultat*i; //Loopen vid inmatat värde 5 ger 5*2*3*4=120, multiplikation bör vara oberoende av ordningen
                                     //Fungerar upp till 12!

        }
                lblDisplay.setText(String.valueOf(resultat));
    }//GEN-LAST:event_btnNFakultetActionPerformed

    private void btnUpphojtTillYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpphojtTillYActionPerformed
        // TODO add your handling code here:
        String knappText="u";
        getOperator(knappText);
    }//GEN-LAST:event_btnUpphojtTillYActionPerformed

    private void getOperator (String knapp) {
        mathOperator= knapp.charAt(0);
        
        try {
        total1=total1+Double.parseDouble(lblDisplay.getText());
        }
        catch (java.lang.NumberFormatException error) {
            JOptionPane.showMessageDialog(null,
                                        "Mata in ett tal först!",
                                        "Fel i inmatning",
                                        JOptionPane.ERROR_MESSAGE);
            return;
        }
        lblDisplay.setText("");
    }
    
    private void kollaMinne(){
        if (minne<0||minne>0) {
            lblMinne.setText("M");
        }
        else if (minne==0){
            lblMinne.setText(" ");
        }
    }
    
    private void Visa(double innehall){
/*        double kollaDecimal=innehall;
        kollaDecimal=kollaDecimal*kollaDecimal;
        kollaDecimal=kollaDecimal%kollaDecimal;
        
        if (kollaDecimal!=0){
            int utskrift= (int)innehall;
            lblDisplay.setText(String.valueOf(utskrift));
        }
        else {            
            lblDisplay.setText(String.valueOf(innehall));            
        }

*/
        String decimalTal = Double.toString(innehall);
        int decimalPlats = decimalTal.indexOf('.');
        int taletsLangd = decimalTal.length();
        String enbartDecimaler = decimalTal.substring(decimalPlats+1, taletsLangd);
        double enbartDecimalerSiffror = Double.valueOf(enbartDecimaler);
        
        if (enbartDecimalerSiffror==0){
            int utskrift= (int)innehall;
            lblDisplay.setText(String.valueOf(utskrift));
        }
        else{
            lblDisplay.setText(String.valueOf(innehall));
        }
//*/
    }
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
            java.util.logging.Logger.getLogger(Inlamningsuppgift_12_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inlamningsuppgift_12_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inlamningsuppgift_12_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inlamningsuppgift_12_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inlamningsuppgift_12_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtta;
    private javax.swing.JButton btnDelat;
    private javax.swing.JButton btnEtt;
    private javax.swing.JButton btnEttDelatMed;
    private javax.swing.JButton btnFem;
    private javax.swing.JButton btnFyra;
    private javax.swing.JButton btnGanger;
    private javax.swing.JButton btnKomma;
    private javax.swing.JButton btnLikaMed;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMMinus;
    private javax.swing.JButton btnMPlus;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnNFakultet;
    private javax.swing.JButton btnNio;
    private javax.swing.JButton btnNoll;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnRensa;
    private javax.swing.JButton btnRotenUr;
    private javax.swing.JButton btnSex;
    private javax.swing.JButton btnSju;
    private javax.swing.JButton btnTre;
    private javax.swing.JButton btnTva;
    private javax.swing.JButton btnUpphojtTillTre;
    private javax.swing.JButton btnUpphojtTillTva;
    private javax.swing.JButton btnUpphojtTillY;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblMinne;
    // End of variables declaration//GEN-END:variables
}