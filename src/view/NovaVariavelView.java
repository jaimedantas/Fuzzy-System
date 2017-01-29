/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.InputOutput;
import model.ValoresPertinencia;
/**
 *
 * @author jaime
 */
public class NovaVariavelView extends javax.swing.JFrame {
        //ImageIcon ii;                //not initialized  
    ValoresPertinencia parametro = new ValoresPertinencia();
    private static ArrayList<InputOutput> listaEntrada;
    //criar entrada 
    public InputOutput novaEntrada;
    int flag=0;
    private ArrayList<ArrayList<JTextField>> pertinencias;
    public int numCurvas;

    public NovaVariavelView() {
    	this.pertinencias = new ArrayList<ArrayList<JTextField>>();
    	for(int i=0; i<6; ++i){
    		ArrayList<JTextField> temp = new ArrayList<JTextField>();
    		for(int j=0; j<4; ++j){
    			temp.add(new JTextField());
    		}
    		this.pertinencias.add(temp);
    	}
    	
        initComponents();
        jComboBox2.setVisible(false);
        pertinencia2TIPO.setVisible(false);
        pertinencia3TIPO.setVisible(false);
        pertinencia4TIPO.setVisible(false);
        pertinencia5TIPO.setVisible(false);
        pertinencia6TIPO.setVisible(false);
        pertinencia1NOME.setVisible(false);
        pertinencia2NOME.setVisible(false);
        pertinencia3NOME.setVisible(false);
        pertinencia4NOME.setVisible(false);
        pertinencia5NOME.setVisible(false);
        pertinencia6NOME.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
                
        jLabel18.setVisible(false);
        this.pertinencias.get(0).get(0).setVisible(false);
        jLabel19.setVisible(false);
        this.pertinencias.get(0).get(1).setVisible(false);
        jLabel20.setVisible(false);
        this.pertinencias.get(0).get(2).setVisible(false);
        jLabel21.setVisible(false);
        this.pertinencias.get(0).get(3).setVisible(false);
        jLabel24.setVisible(false);
        this.pertinencias.get(1).get(0).setVisible(false);
        jLabel25.setVisible(false);
        this.pertinencias.get(1).get(1).setVisible(false);
        jLabel26.setVisible(false);
        this.pertinencias.get(1).get(2).setVisible(false);
        jLabel27.setVisible(false);
        this.pertinencias.get(1).get(3).setVisible(false);
        jLabel28.setVisible(false);
        this.pertinencias.get(2).get(0).setVisible(false);
        jLabel29.setVisible(false);
        this.pertinencias.get(2).get(1).setVisible(false);
        jLabel30.setVisible(false);
        this.pertinencias.get(2).get(2).setVisible(false);
        jLabel33.setVisible(false);
        this.pertinencias.get(2).get(3).setVisible(false);
        jLabel67.setVisible(false);
        this.pertinencias.get(3).get(0).setVisible(false);
        jLabel68.setVisible(false);
        this.pertinencias.get(3).get(1).setVisible(false);
        jLabel69.setVisible(false);
        this.pertinencias.get(3).get(2).setVisible(false);
        jLabel46.setVisible(false);
        this.pertinencias.get(3).get(3).setVisible(false); 
       
        jLabel49.setVisible(false);
        this.pertinencias.get(4).get(0).setVisible(false);
        jLabel50.setVisible(false);
        this.pertinencias.get(4).get(1).setVisible(false);
        jLabel51.setVisible(false);
        this.pertinencias.get(4).get(2).setVisible(false);
        jLabel52.setVisible(false);
        this.pertinencias.get(4).get(3).setVisible(false); 
       
        jLabel55.setVisible(false);
        this.pertinencias.get(5).get(0).setVisible(false);
        jLabel62.setVisible(false);
        this.pertinencias.get(5).get(1).setVisible(false);
        jLabel53.setVisible(false);
        this.pertinencias.get(5).get(2).setVisible(false);
        jLabel58.setVisible(false);
        this.pertinencias.get(5).get(3).setVisible(false); 
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jPanel3.setVisible(false);
        criarParamBt.setVisible(false);
        jPanel1.setVisible(false);
        
        //this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        QuantidadeVariaveis = new javax.swing.JComboBox();
        okBt = new javax.swing.JButton();
        criarParamBt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        pertinencia2TIPO = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        pertinencia3TIPO = new javax.swing.JComboBox();
        
        jLabel18 = new javax.swing.JLabel();
        
        jLabel19 = new javax.swing.JLabel();
        
        jLabel20 = new javax.swing.JLabel();
        
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        
        jLabel25 = new javax.swing.JLabel();
        
        jLabel26 = new javax.swing.JLabel();
        
        jLabel27 = new javax.swing.JLabel();
        
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        
        jLabel33 = new javax.swing.JLabel();
        
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        
        jLabel50 = new javax.swing.JLabel();
        
        jLabel51 = new javax.swing.JLabel();
        
        jLabel52 = new javax.swing.JLabel();
        
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        pertinencia4TIPO = new javax.swing.JComboBox();
        jLabel58 = new javax.swing.JLabel();
        
        
        pertinencia5TIPO = new javax.swing.JComboBox();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        
        pertinencia6TIPO = new javax.swing.JComboBox();
        
        jLabel64 = new javax.swing.JLabel();
        
        jLabel67 = new javax.swing.JLabel();
        
        jLabel68 = new javax.swing.JLabel();
        
        jLabel69 = new javax.swing.JLabel();
        
        pertinencia2NOME = new javax.swing.JTextField();
        pertinencia1NOME = new javax.swing.JTextField();
        pertinencia3NOME = new javax.swing.JTextField();
        pertinencia4NOME = new javax.swing.JTextField();
        pertinencia5NOME = new javax.swing.JTextField();
        pertinencia6NOME = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NomeVariavel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        criarBt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("PARÂMETROS DA NOVA VARIÁVEL");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Quantidades de Variáveis");

        QuantidadeVariaveis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

        okBt.setText("OK");
        okBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtActionPerformed(evt);
            }
        });

        criarParamBt.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        criarParamBt.setForeground(new java.awt.Color(0, 153, 102));
        criarParamBt.setText("Criar Parâmetros");
        criarParamBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarParamBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(QuantidadeVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(okBt)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(criarParamBt, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(QuantidadeVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(criarParamBt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Funcão de Pertinencia");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Variável");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Parâmetros");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rampa", "Triangular", "Trapezoidal" }));

        pertinencia2TIPO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rampa", "Triangular", "Trapezoidal" }));

        pertinencia3TIPO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rampa", "Triangular", "Trapezoidal" }));

        jLabel18.setText("X1=");

        jLabel19.setText("X2=");

        jLabel20.setText("X3=");

        jLabel21.setText("X4=");

        jLabel24.setText("X1=");

        jLabel25.setText("X2=");

        jLabel26.setText("X3=");

        jLabel27.setText("X4=");

        jLabel28.setText("X3=");

        jLabel29.setText("X1=");

        jLabel30.setText("X4=");

        jLabel33.setText("X2=");

        jLabel46.setText("X4=");

        jLabel49.setText("X1=");

        jLabel50.setText("X2=");

        jLabel51.setText("X3=");

        jLabel52.setText("X4=");

        jLabel53.setText("X3=");

        jLabel55.setText("X1=");

        pertinencia4TIPO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rampa", "Triangular", "Trapezoidal" }));

        jLabel58.setText("X4=");

        pertinencia5TIPO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rampa", "Triangular", "Trapezoidal" }));

        jLabel62.setText("X2=");

        pertinencia6TIPO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rampa", "Triangular", "Trapezoidal" }));

        jLabel67.setText("X1=");

        jLabel68.setText("X2=");

        jLabel69.setText("X3=");

        jButton3.setText("Criar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Criar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Criar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Criar");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Criar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Criar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(pertinencia5NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pertinencia5TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pertinencia4NOME, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(pertinencia6NOME, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(jButton6))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pertinencia4TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pertinencia6TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(this.pertinencias.get(3).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(this.pertinencias.get(3).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(this.pertinencias.get(3).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(this.pertinencias.get(3).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel55)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(this.pertinencias.get(5).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel62)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(this.pertinencias.get(5).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jLabel53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(this.pertinencias.get(5).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel58)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(this.pertinencias.get(5).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(this.pertinencias.get(4).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel50)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(this.pertinencias.get(4).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jLabel51)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(this.pertinencias.get(4).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel52)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(this.pertinencias.get(4).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pertinencia2NOME)
                            .addComponent(pertinencia1NOME, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(pertinencia3NOME, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jButton4)
                            .addComponent(jButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(127, 127, 127))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(pertinencia2TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pertinencia3TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(0).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(0).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(0).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(0).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(1).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(1).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(1).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(1).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(2).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(2).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(2).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(this.pertinencias.get(2).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pertinencia1NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(this.pertinencias.get(0).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(this.pertinencias.get(0).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(this.pertinencias.get(0).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(this.pertinencias.get(0).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(this.pertinencias.get(1).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(this.pertinencias.get(1).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(this.pertinencias.get(1).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(this.pertinencias.get(1).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pertinencia2TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pertinencia2NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(this.pertinencias.get(2).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33)
                                    .addComponent(this.pertinencias.get(2).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(this.pertinencias.get(2).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)
                                    .addComponent(this.pertinencias.get(2).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pertinencia3TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pertinencia3NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pertinencia4TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pertinencia4NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(this.pertinencias.get(3).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68)
                            .addComponent(this.pertinencias.get(3).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)
                            .addComponent(this.pertinencias.get(3).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addComponent(this.pertinencias.get(3).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pertinencia5TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pertinencia5NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jButton7))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel49)
                                .addComponent(this.pertinencias.get(4).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel50)
                                .addComponent(this.pertinencias.get(4).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel51)
                                .addComponent(this.pertinencias.get(4).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel52)
                                .addComponent(this.pertinencias.get(4).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pertinencia6TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pertinencia6NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(this.pertinencias.get(5).get(0), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62)
                            .addComponent(this.pertinencias.get(5).get(1), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)
                            .addComponent(this.pertinencias.get(5).get(2), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addComponent(this.pertinencias.get(5).get(3), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NomeVariavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeVariavelActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome da Entrada");

        criarBt.setText("Criar");
        criarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(criarBt, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(NomeVariavel))
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeVariavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(criarBt))
        );

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>                        

    private void okBtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        numCurvas = QuantidadeVariaveis.getSelectedIndex()+1;
        jLabel1.setEnabled(false);
        QuantidadeVariaveis.setEnabled(false);
        okBt.setEnabled(false);

        jLabel3.setVisible(true);
           jLabel4.setVisible(true);
           jLabel5.setVisible(true);
           jPanel3.setSize(683, 471);
           jPanel3.setVisible(true);
           criarParamBt.setVisible(true);

        switch(numCurvas){
            case 1:
                jComboBox2.setVisible(true);
                pertinencia1NOME.setVisible(true);
                jButton3.setVisible(true);
                break;
            case 2:
                jComboBox2.setVisible(true);
                pertinencia2TIPO.setVisible(true);
                pertinencia1NOME.setVisible(true);
                pertinencia2NOME.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                break;
            case 3:
                jComboBox2.setVisible(true);
                pertinencia2TIPO.setVisible(true);
                pertinencia3TIPO.setVisible(true);
                pertinencia1NOME.setVisible(true);
                pertinencia2NOME.setVisible(true);
                pertinencia3NOME.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                jButton5.setVisible(true);
                break;
            case 4:
                jComboBox2.setVisible(true);
                pertinencia2TIPO.setVisible(true);
                pertinencia3TIPO.setVisible(true);
                pertinencia4TIPO.setVisible(true);
                pertinencia1NOME.setVisible(true);
                pertinencia2NOME.setVisible(true);
                pertinencia3NOME.setVisible(true);
                pertinencia4NOME.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                jButton5.setVisible(true);
                jButton6.setVisible(true);
                break;
            case 5:
                jComboBox2.setVisible(true);
                pertinencia2TIPO.setVisible(true);
                pertinencia3TIPO.setVisible(true);
                pertinencia4TIPO.setVisible(true);
                pertinencia5TIPO.setVisible(true);
                pertinencia1NOME.setVisible(true);
                pertinencia2NOME.setVisible(true);
                pertinencia3NOME.setVisible(true);
                pertinencia4NOME.setVisible(true);
                pertinencia5NOME.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                jButton5.setVisible(true);
                jButton6.setVisible(true);
                jButton7.setVisible(true);
                break;
            case 6:
                jComboBox2.setVisible(true);
                pertinencia2TIPO.setVisible(true);
                pertinencia3TIPO.setVisible(true);
                pertinencia4TIPO.setVisible(true);
                pertinencia5TIPO.setVisible(true);
                pertinencia6TIPO.setVisible(true);
                pertinencia1NOME.setVisible(true);
                pertinencia2NOME.setVisible(true);
                pertinencia3NOME.setVisible(true);
                pertinencia4NOME.setVisible(true);
                pertinencia5NOME.setVisible(true);
                pertinencia6NOME.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                jButton5.setVisible(true);
                jButton6.setVisible(true);
                jButton7.setVisible(true);
                jButton8.setVisible(true);
                break;
            }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(pertinencia1NOME.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Nome da variável vazio!", "Erro!", JOptionPane.ERROR_MESSAGE);
        else    setFuncaoPertinecia1();

    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(pertinencia2NOME.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Nome da variável vazio!", "Erro!", JOptionPane.ERROR_MESSAGE);
        else    setFuncaoPertinecia2();
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(pertinencia3NOME.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Nome da variável vazio!", "Erro!", JOptionPane.ERROR_MESSAGE);
        else    setFuncaoPertinecia3();
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(pertinencia4NOME.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Nome da variável vazio!", "Erro!", JOptionPane.ERROR_MESSAGE);
        else    setFuncaoPertinecia4();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(pertinencia5NOME.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Nome da variável vazio!", "Erro!", JOptionPane.ERROR_MESSAGE);
        else    setFuncaoPertinecia5();
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(pertinencia6NOME.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Nome da variável vazio!", "Erro!", JOptionPane.ERROR_MESSAGE);
        else    setFuncaoPertinecia6();
    }                                        

    private void criarParamBtActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                       
    
    public void criarParamActionListener(ActionListener listener){
    	criarParamBt.addActionListener(listener);
    }

    private void NomeVariavelActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void criarBtActionPerformed(java.awt.event.ActionEvent evt) {                                         
	    if(NomeVariavel.getText().isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Nome da Entrada vazio!", "Erro!", JOptionPane.ERROR_MESSAGE);
	    }
	    else{
	        jPanel1.setVisible(true);
	        NomeVariavel.setEnabled(false);
	        criarBt.setEnabled(false);
	        jLabel6.setText(NomeVariavel.getText().toString());
	        jLabel8.setEnabled(false);     
	    }
    }                                        

    //codigos
public InputOutput getEntrada(){
    // TODO add your handling code here:
    //setParametrosdaVariavelEmClasse();
    
    //adiconar entrada
    double[][] limits = new double[numCurvas][];
    
    for(int i=0; i<numCurvas; ++i){
    	int numPontos = 0;
    	for(int j=0; j<4; ++j){
    		String valorPonto = this.pertinencias.get(i).get(j).getText();
    		if(!valorPonto.isEmpty()){
    			numPontos++;
    		}
    	}
    	double[] temp = new double[numPontos];
    	for(int j=0; j<numPontos; ++j){
    		String valorPonto = this.pertinencias.get(i).get(j).getText();
    		temp[j] = Double.parseDouble(valorPonto);
    		System.out.print(temp[j] + " ");
    	}
    	System.out.println();
    	limits[i] = temp;
    }
    
    String[] nomesCurvas = new String[Integer.parseInt(QuantidadeVariaveis.getSelectedItem().toString())];
    
    switch(Integer.parseInt(QuantidadeVariaveis.getSelectedItem().toString())){
        case 1:
            nomesCurvas[0] = pertinencia1NOME.getText();
            break;
        case 2:
            nomesCurvas[0] = pertinencia1NOME.getText();
            nomesCurvas[1] = pertinencia2NOME.getText();
            break;
        case 3:
            nomesCurvas[0] = pertinencia1NOME.getText();
            nomesCurvas[1] = pertinencia2NOME.getText();
            nomesCurvas[2] = pertinencia3NOME.getText();
            break;
        case 4:
            nomesCurvas[0] = pertinencia1NOME.getText();
            nomesCurvas[1] = pertinencia2NOME.getText();
            nomesCurvas[2] = pertinencia3NOME.getText();
            nomesCurvas[3] = pertinencia4NOME.getText();
            break;
        case 5:
            nomesCurvas[0] = pertinencia1NOME.getText();
            nomesCurvas[1] = pertinencia2NOME.getText();
            nomesCurvas[2] = pertinencia3NOME.getText();
            nomesCurvas[3] = pertinencia4NOME.getText();
            nomesCurvas[4] = pertinencia5NOME.getText();
            break;
        case 6:
            nomesCurvas[0] = pertinencia1NOME.getText();
            nomesCurvas[1] = pertinencia2NOME.getText();
            nomesCurvas[2] = pertinencia3NOME.getText();
            nomesCurvas[3] = pertinencia4NOME.getText();
            nomesCurvas[4] = pertinencia5NOME.getText();
            nomesCurvas[5] = pertinencia6NOME.getText();
            break;
        default:
            break;
    }
    
    this.novaEntrada = new InputOutput(NomeVariavel.getText(), nomesCurvas, limits, true);
    
    JOptionPane.showMessageDialog(null, "Variável Criada com sucesso!", "Aviso", JOptionPane.WARNING_MESSAGE);
    System.out.println(flag);
    this.flag=1;
    System.out.println(flag);
    this.dispose();
    
    return this.novaEntrada;
}
public int getFlag(){
    System.out.println("Consutou");
    return this.flag;
}

    // Variables declaration - do not modify                     
    private javax.swing.JTextField NomeVariavel;
    private javax.swing.JComboBox QuantidadeVariaveis;
    private javax.swing.JButton okBt;
    private javax.swing.JButton criarParamBt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton criarBt;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField pertinencia1NOME;
//    private javax.swing.JTextField pertinencia1X1;
//    private javax.swing.JTextField pertinencia1X2;
//    private javax.swing.JTextField pertinencia1X3;
//    private javax.swing.JTextField pertinencia1X4;
    private javax.swing.JTextField pertinencia2NOME;
    private javax.swing.JComboBox pertinencia2TIPO;
//    private javax.swing.JTextField pertinencia2X1;
//    private javax.swing.JTextField pertinencia2X2;
//    private javax.swing.JTextField pertinencia2X3;
//    private javax.swing.JTextField pertinencia2X4;
    private javax.swing.JTextField pertinencia3NOME;
    private javax.swing.JComboBox pertinencia3TIPO;
//    private javax.swing.JTextField pertinencia3X1;
//    private javax.swing.JTextField pertinencia3X2;
//    private javax.swing.JTextField pertinencia3X3;
//    private javax.swing.JTextField pertinencia3X4;
    private javax.swing.JTextField pertinencia4NOME;
    private javax.swing.JComboBox pertinencia4TIPO;
//    private javax.swing.JTextField pertinencia4X1;
//    private javax.swing.JTextField pertinencia4X2;
//    private javax.swing.JTextField pertinencia4X3;
//    private javax.swing.JTextField pertinencia4X4;
    private javax.swing.JTextField pertinencia5NOME;
    private javax.swing.JComboBox pertinencia5TIPO;
//    private javax.swing.JTextField pertinencia5X1;
//    private javax.swing.JTextField pertinencia5X2;
//    private javax.swing.JTextField pertinencia5X3;
//    private javax.swing.JTextField pertinencia5X4;
    private javax.swing.JTextField pertinencia6NOME;
    private javax.swing.JComboBox pertinencia6TIPO;
//    private javax.swing.JTextField pertinencia6X1;
//    private javax.swing.JTextField pertinencia6X2;
//    private javax.swing.JTextField pertinencia6X3;
//    private javax.swing.JTextField pertinencia6X4;
    // End of variables declaration                   

//Setar variavel 1
    void setFuncaoPertinecia1(){
        
        String grafico = jComboBox2.getSelectedItem().toString();
        ImageIcon ii = new ImageIcon(getClass().getResource("/imagens/"+grafico+".png"));
        jLabel7.setIcon(ii);

        
       if (grafico.equals("Triangular")){
           jLabel18.setVisible(true);
           this.pertinencias.get(0).get(0).setVisible(true);
           jLabel19.setVisible(true);
           this.pertinencias.get(0).get(1).setVisible(true);
           jLabel20.setVisible(true);
           this.pertinencias.get(0).get(2).setVisible(true);

           
       }
       else if(grafico.equals("Rampa")){
           jLabel18.setVisible(true);
           this.pertinencias.get(0).get(0).setVisible(true);
           jLabel19.setVisible(true);
           this.pertinencias.get(0).get(1).setVisible(true);

           
           
       }
       else if(grafico.equals("Trapezoidal")){
           jLabel18.setVisible(true);
           this.pertinencias.get(0).get(0).setVisible(true);
           jLabel19.setVisible(true);
           this.pertinencias.get(0).get(1).setVisible(true);
           jLabel20.setVisible(true);
           this.pertinencias.get(0).get(2).setVisible(true);
           jLabel21.setVisible(true);
           this.pertinencias.get(0).get(3).setVisible(true);
           
       }
    }
    void setFuncaoPertinecia2(){
        String grafico = pertinencia2TIPO.getSelectedItem().toString();
        ImageIcon ii = new ImageIcon(getClass().getResource("/imagens/"+grafico+".png"));
        jLabel11.setIcon(ii);

        
       if (grafico.equals("Triangular")){
           jLabel24.setVisible(true);
           this.pertinencias.get(1).get(0).setVisible(true);
           jLabel25.setVisible(true);
           this.pertinencias.get(1).get(1).setVisible(true);
           jLabel26.setVisible(true);
           this.pertinencias.get(1).get(2).setVisible(true);


           
       }
       else if(grafico.equals("Rampa")){
           jLabel24.setVisible(true);
           this.pertinencias.get(1).get(0).setVisible(true);
           jLabel25.setVisible(true);
           this.pertinencias.get(1).get(1).setVisible(true);


           
       }
       else if(grafico.equals("Trapezoidal")){
           jLabel24.setVisible(true);
           this.pertinencias.get(1).get(0).setVisible(true);
           jLabel25.setVisible(true);
           this.pertinencias.get(1).get(1).setVisible(true);
           jLabel26.setVisible(true);
           this.pertinencias.get(1).get(2).setVisible(true);
           jLabel27.setVisible(true);
           this.pertinencias.get(1).get(3).setVisible(true);
           
       }
    }
    void setFuncaoPertinecia3(){
        String grafico = pertinencia3TIPO.getSelectedItem().toString();
        ImageIcon ii = new ImageIcon(getClass().getResource("/imagens/"+grafico+".png"));
        jLabel12.setIcon(ii);

        
       if (grafico.equals("Triangular")){
           jLabel29.setVisible(true);
           this.pertinencias.get(2).get(0).setVisible(true);
           jLabel33.setVisible(true);
           this.pertinencias.get(2).get(1).setVisible(true);
           jLabel28.setVisible(true);
           this.pertinencias.get(2).get(2).setVisible(true);


           
       }
       else if(grafico.equals("Rampa")){
           jLabel29.setVisible(true);
           this.pertinencias.get(2).get(0).setVisible(true);
           jLabel33.setVisible(true);
           this.pertinencias.get(2).get(1).setVisible(true);

           
       }
       else if(grafico.equals("Trapezoidal")){
           jLabel29.setVisible(true);
           this.pertinencias.get(2).get(0).setVisible(true);
           jLabel33.setVisible(true);
           this.pertinencias.get(2).get(1).setVisible(true);
           jLabel28.setVisible(true);
           this.pertinencias.get(2).get(2).setVisible(true);
           jLabel30.setVisible(true);
           this.pertinencias.get(2).get(3).setVisible(true);
           
       }
    }
    void setFuncaoPertinecia4(){
        String grafico = pertinencia4TIPO.getSelectedItem().toString();
        ImageIcon ii = new ImageIcon(getClass().getResource("/imagens/"+grafico+".png"));
        jLabel56.setIcon(ii);

        
       if (grafico.equals("Triangular")){
           jLabel67.setVisible(true);
           this.pertinencias.get(3).get(0).setVisible(true);
           jLabel68.setVisible(true);
           this.pertinencias.get(3).get(1).setVisible(true);
           jLabel69.setVisible(true);
           this.pertinencias.get(3).get(2).setVisible(true);

           
       }
       else if(grafico.equals("Rampa")){
           jLabel67.setVisible(true);
           this.pertinencias.get(3).get(0).setVisible(true);
           jLabel68.setVisible(true);
           this.pertinencias.get(3).get(1).setVisible(true);
 
           
       }
       else if(grafico.equals("Trapezoidal")){
           jLabel67.setVisible(true);
           this.pertinencias.get(3).get(0).setVisible(true);
           jLabel68.setVisible(true);
           this.pertinencias.get(3).get(1).setVisible(true);
           jLabel69.setVisible(true);
           this.pertinencias.get(3).get(2).setVisible(true);
           jLabel46.setVisible(true);
           this.pertinencias.get(3).get(3).setVisible(true); 
       }
    }
    void setFuncaoPertinecia5(){
        String grafico = pertinencia5TIPO.getSelectedItem().toString();
        ImageIcon ii = new ImageIcon(getClass().getResource("/imagens/"+grafico+".png"));
        jLabel61.setIcon(ii);

        
       if (grafico.equals("Triangular")){
           jLabel49.setVisible(true);
           this.pertinencias.get(4).get(0).setVisible(true);
           jLabel50.setVisible(true);
           this.pertinencias.get(4).get(1).setVisible(true);
           jLabel51.setVisible(true);
           this.pertinencias.get(4).get(2).setVisible(true);

           
       }
       else if(grafico.equals("Rampa")){
           jLabel49.setVisible(true);
           this.pertinencias.get(4).get(0).setVisible(true);
           jLabel50.setVisible(true);
           this.pertinencias.get(4).get(1).setVisible(true);

           
       }
       else if(grafico.equals("Trapezoidal")){
           jLabel49.setVisible(true);
           this.pertinencias.get(4).get(0).setVisible(true);
           jLabel50.setVisible(true);
           this.pertinencias.get(4).get(1).setVisible(true);
           jLabel51.setVisible(true);
           this.pertinencias.get(4).get(2).setVisible(true);
           jLabel52.setVisible(true);
           this.pertinencias.get(4).get(3).setVisible(true); 
       }
    }
    void setFuncaoPertinecia6(){
        String grafico = pertinencia6TIPO.getSelectedItem().toString();
        ImageIcon ii = new ImageIcon(getClass().getResource("/imagens/"+grafico+".png"));
        jLabel64.setIcon(ii);

        
       if (grafico.equals("Triangular")){
           jLabel55.setVisible(true);
           this.pertinencias.get(5).get(0).setVisible(true);
           jLabel62.setVisible(true);
           this.pertinencias.get(5).get(1).setVisible(true);
           jLabel53.setVisible(true);
           this.pertinencias.get(5).get(2).setVisible(true);


           
       }
       else if(grafico.equals("Rampa")){
           jLabel55.setVisible(true);
           this.pertinencias.get(5).get(0).setVisible(true);
           jLabel62.setVisible(true);
           this.pertinencias.get(5).get(1).setVisible(true);

           
       }
       else if(grafico.equals("Trapezoidal")){
           jLabel55.setVisible(true);
           this.pertinencias.get(5).get(0).setVisible(true);
           jLabel62.setVisible(true);
           this.pertinencias.get(5).get(1).setVisible(true);
           jLabel53.setVisible(true);
           this.pertinencias.get(5).get(2).setVisible(true);
           jLabel58.setVisible(true);
           this.pertinencias.get(5).get(3).setVisible(true); 
       }
    }
    void setParametrosdaVariavelEmClasse(){
    }
    void getValores(){
                int n = QuantidadeVariaveis.getSelectedIndex()+1;
        switch(n){
            case 1:
                parametro.setTipoGrafico(jComboBox2.getSelectedItem().toString());
                parametro.setNomeFatorPertinecia(pertinencia1NOME.getText());
                break;
            case 2:
                pertinencia2TIPO.setVisible(true);
                pertinencia2NOME.setVisible(true);
                parametro.setTipoGrafico(jComboBox2.getSelectedItem().toString());
                parametro.setNomeFatorPertinecia(pertinencia1NOME.getText());
                break;
            case 3:

                pertinencia3TIPO.setVisible(true);

                pertinencia3NOME.setVisible(true);
                parametro.setTipoGrafico(jComboBox2.getSelectedItem().toString());
                parametro.setNomeFatorPertinecia(pertinencia1NOME.getText());
                break;
            case 4:

                pertinencia4TIPO.setVisible(true);

                pertinencia4NOME.setVisible(true);
                parametro.setTipoGrafico(jComboBox2.getSelectedItem().toString());
                parametro.setNomeFatorPertinecia(pertinencia1NOME.getText());
                break;
            case 5:

                pertinencia5TIPO.setVisible(true);

                pertinencia5NOME.setVisible(true);
                parametro.setTipoGrafico(jComboBox2.getSelectedItem().toString());
                parametro.setNomeFatorPertinecia(pertinencia1NOME.getText());
                break;
            case 6:

                pertinencia6TIPO.setVisible(true);

                pertinencia6NOME.setVisible(true);
                parametro.setTipoGrafico(jComboBox2.getSelectedItem().toString());
                parametro.setNomeFatorPertinecia(pertinencia1NOME.getText());
                break;
            }
    }
    void setNomeVariavelGlobal(String nome){
        //jLabel6.setText(nome);
    }
}
