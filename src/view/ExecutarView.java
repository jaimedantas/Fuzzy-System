package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.InputOutput;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class ExecutarView{
	private JFrame window;
	private JLabel[] entradasLabel, saidasLabel, resultadosSaidasLabel;
	private JTextField[] entradasTextField, saidasTextField;
	private JButton runBt;
	private JPanel contentPane;
	private JPanel entradasPanel, saidasPanel;
	private GridBagConstraints[] gbc_entradasLabels, gbc_saidasLabels, gbc_entradasTextArea, gbc_saidasTextArea;
	private int numEntradas, numSaidas;
	private JTextField valorMaxTextField;
	private JLabel lblValorMximoDa;

	/**
	 * Create the frame.
	 */
	public ExecutarView(ArrayList<InputOutput> entradas, ArrayList<InputOutput> saidas) {
		this.numEntradas = entradas.size();
		this.numSaidas = saidas.size();
		this.window = new JFrame("Execução");
		this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.window.setBounds(100, 100, 460, 356);
		this.window.setLocationRelativeTo(null);
		
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.window.setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		JLabel lblExecutarRegras = new JLabel("Executar Regras");
		lblExecutarRegras.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblExecutarRegras.setBounds(132, 0, 186, 32);
		contentPane.add(lblExecutarRegras);
		
		entradasPanel = new JPanel();
		entradasPanel.setBounds(6, 39, 218, 233);
		contentPane.add(entradasPanel);
		GridBagLayout gbl_entradasPanel = new GridBagLayout();
		gbl_entradasPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_entradasPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_entradasPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_entradasPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		entradasPanel.setLayout(gbl_entradasPanel);
		
		saidasPanel = new JPanel();
		saidasPanel.setBounds(236, 39, 218, 233);
		contentPane.add(saidasPanel);
		GridBagLayout gbl_saidasPanel = new GridBagLayout();
		gbl_saidasPanel.columnWidths = new int[]{0, 0, 0};
		gbl_saidasPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_saidasPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_saidasPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		saidasPanel.setLayout(gbl_saidasPanel);
		
		runBt = new JButton("Run");
		runBt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		runBt.setBounds(310, 284, 117, 44);
		contentPane.add(runBt);
		
		valorMaxTextField = new JTextField();
		valorMaxTextField.setBounds(154, 294, 130, 26);
		contentPane.add(valorMaxTextField);
		valorMaxTextField.setColumns(10);
		
		lblValorMximoDa = new JLabel("Valor Máximo da Saida:");
		lblValorMximoDa.setBounds(6, 299, 150, 16);
		contentPane.add(lblValorMximoDa);
		
		//-----------------------POPULATE entradasPanel AND saidasPanel--------------
		this.entradasLabel = new JLabel[entradas.size()];
		this.saidasLabel = new JLabel[saidas.size()];
		
		this.entradasTextField = new JTextField[entradas.size()];
		this.resultadosSaidasLabel = new JLabel[saidas.size()];
		
		this.gbc_entradasLabels = new GridBagConstraints[entradas.size()];
		this.gbc_saidasLabels = new GridBagConstraints[saidas.size()];
		this.gbc_entradasTextArea = new GridBagConstraints[entradas.size()];
		this.gbc_saidasTextArea = new GridBagConstraints[saidas.size()];
		
		for(int i=0; i < entradas.size(); ++i){
			this.entradasLabel[i] = new JLabel(entradas.get(i).name + ": ");
			this.gbc_entradasLabels[i] = new GridBagConstraints();
			this.gbc_entradasLabels[i].insets = new Insets(0, 0, 5, 5);
			this.gbc_entradasLabels[i].fill = GridBagConstraints.EAST;
			this.gbc_entradasLabels[i].gridx = 0;
			this.gbc_entradasLabels[i].gridy = i;
			entradasPanel.add(this.entradasLabel[i], this.gbc_entradasLabels[i]);
			
			entradasTextField[i] = new JTextField();
			this.gbc_entradasTextArea[i] = new GridBagConstraints();
			this.gbc_entradasTextArea[i].insets = new Insets(0, 0, 5, 0);
			this.gbc_entradasTextArea[i].fill = GridBagConstraints.BOTH;
			this.gbc_entradasTextArea[i].gridx = 1;
			this.gbc_entradasTextArea[i].gridy = i;
			entradasPanel.add(entradasTextField[i], this.gbc_entradasTextArea[i]);
		}
		
		for(int i=0; i < saidas.size(); ++i){
			this.saidasLabel[i] = new JLabel(saidas.get(i).name + ": ");
			this.gbc_saidasLabels[i] = new GridBagConstraints();
			this.gbc_saidasLabels[i].insets = new Insets(0, 0, 5, 5);
			this.gbc_saidasLabels[i].fill = GridBagConstraints.EAST;
			this.gbc_saidasLabels[i].gridx = 0;
			this.gbc_saidasLabels[i].gridy = i;
			saidasPanel.add(this.saidasLabel[i], this.gbc_saidasLabels[i]);
			
			this.resultadosSaidasLabel[i] = new JLabel();
			this.gbc_saidasTextArea[i] = new GridBagConstraints();
			this.gbc_saidasTextArea[i].insets = new Insets(0, 0, 5, 0);
			this.gbc_saidasTextArea[i].fill = GridBagConstraints.BOTH;
			this.gbc_saidasTextArea[i].gridx = 1;
			this.gbc_saidasTextArea[i].gridy = i;
			saidasPanel.add(this.resultadosSaidasLabel[i], this.gbc_saidasTextArea[i]);
		}
		
	}
	
	public void runBtListener(ActionListener listener){
		runBt.addActionListener(listener);
	}
	
	public double[] getEntradasValores(){
		double[] entradasVal = new double[this.numEntradas];
		for(int i=0; i<this.numEntradas; ++i){
			entradasVal[i] = Integer.parseInt(this.entradasTextField[i].getText());
		}
		return entradasVal;
	}
	
	public void setSaidasValores(double[] val){
		String s;
		for(int i=0; i < this.numSaidas; ++i){
			s = val[i] + "";
			this.resultadosSaidasLabel[i].setText(s);
		}
	}
	
	public void show(){
		this.window.setVisible(true);
	}
	
	public String getValMax(){
		return this.valorMaxTextField.getText();
	}
}
