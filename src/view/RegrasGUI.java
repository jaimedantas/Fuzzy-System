package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.InputOutput;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegrasGUI{
	private JFrame window;
	private JPanel contentPane, panel;
	private JTextField numRegrasTxt;
	private JComboBox[][] regras;
	private JLabel[][] operadoresLabel;
	public int numEntradas;
	public int numSaidas;
	public int numRegras;
	public ArrayList<InputOutput> entradas, saidas;
	public JButton criarRegrasBt;
	
	public RegrasGUI(ArrayList<InputOutput> entradas, ArrayList<InputOutput> saidas) {
		this.numEntradas = entradas.size();
		this.numSaidas = saidas.size();
		this.entradas = entradas;
		this.saidas = saidas;
		this.window = new JFrame("Regras do Sistema");
		
		
		//window listener para não fechar programa quando fechar janela
		//seta janela de regras para false apenas
		WindowListener listener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent w) {
                window.setVisible(false);
            }
        };
        this.window.addWindowListener(listener);
		this.window.setBounds(100, 100, 395, 91);
		this.window.setLocationRelativeTo(null);
		
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.window.setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		JLabel regrasLabel = new JLabel("Regras");
		regrasLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		regrasLabel.setBounds(6, 6, 96, 26);
		this.contentPane.add(regrasLabel);
		
		this.numRegrasTxt = new JTextField();
		this.numRegrasTxt.setText("Qnt. Regras");
		this.numRegrasTxt.setBounds(6, 35, 130, 26);
		this.contentPane.add(this.numRegrasTxt);
		this.numRegrasTxt.setColumns(10);
		
		JButton gerarBt = new JButton("Gerar");
		gerarBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int x = Integer.parseInt(numRegrasTxt.getText());
					gerarTabelaRegras(x);
				}catch(Exception e1){
					JOptionPane.showMessageDialog(gerarBt, "Número inválido.");
				}
			}
		});
		
		gerarBt.setBounds(148, 35, 117, 29);
		this.contentPane.add(gerarBt);
		
		criarRegrasBt = new JButton("Criar Regras");
		criarRegrasBt.setBounds(270, 35, 117, 29);
		this.contentPane.add(criarRegrasBt);
		
		this.panel = new JPanel();
		
		contentPane.add(this.panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		this.panel.setLayout(gbl_panel);
	}

	public int[][] getRegras(){
		int[][] userDefinedRules = new int[this.numRegras][this.numEntradas+this.numSaidas];
		
		for(int i=0; i < this.numRegras; ++i){
			for(int j=0; j < this.numEntradas+this.numSaidas; ++j){
				if(this.regras[i][j].getSelectedItem().toString() != "")
					userDefinedRules[i][j] = this.regras[i][j].getSelectedIndex();
				else//se não foi defininda uma pertinencia na regra, colocar -1 na regra
					userDefinedRules[i][j] = -1;
				
				System.out.print(userDefinedRules[i][j] + " ");
			}
			System.out.println();
		}
		return userDefinedRules;
	}
	
	public void gerarTabelaRegras(int qntRegras){
		this.panel.removeAll();
		this.numRegras = qntRegras;
		
		int minWidth = 395;
		
		int width = (int) (150*(this.numEntradas+this.numSaidas));
		
		if(minWidth > width)
			width = minWidth;
		
		int heigth = 700;
		
		if(numRegras<10)
			heigth = 150 + (int) (24*numRegras);
		else if(numRegras<=30)
			heigth = 150 + (int) (27*numRegras);

		this.window.setBounds(100, 100, width, heigth);
		this.panel.setBounds(6, 69, width-12, heigth-97);
		this.window.setLocationRelativeTo(null);
		
		//modificar a partir daqui		
				//-----------------------------LABELS DE ENTRADAS E SAIDAS---------------------------------
				JLabel[] entradasLabel = new JLabel[this.numEntradas];
				GridBagConstraints[] gbc_entradasLabel = new GridBagConstraints[this.numEntradas];
				int posx = 0;
				for(int i=0; i<this.numEntradas; i++){
					entradasLabel[i]  = new JLabel(entradas.get(i).name);
					gbc_entradasLabel[i] = new GridBagConstraints();
					gbc_entradasLabel[i].insets = new Insets(0, 0, 5, 5);
					gbc_entradasLabel[i].gridx = posx;
					gbc_entradasLabel[i].gridy = 0;
					this.panel.add(entradasLabel[i], gbc_entradasLabel[i]);
					posx += 2;
				}

				JLabel[] saidasLabel = new JLabel[this.numSaidas];
				GridBagConstraints[] gbc_saidasLabel = new GridBagConstraints[this.numSaidas];
				
				for(int i = 0; i < this.numSaidas; i++){
					saidasLabel[i]  = new JLabel(saidas.get(i).name);
					gbc_saidasLabel[i] = new GridBagConstraints();
					gbc_saidasLabel[i].insets = new Insets(0, 0, 5, 5);
					gbc_saidasLabel[i].gridx = posx;
					gbc_saidasLabel[i].gridy = 0;
					this.panel.add(saidasLabel[i], gbc_saidasLabel[i]);
					posx += 2;
				}
				//--------------------------COMBOBOXES DE CADA REGRA----------------------------------------
				//inicializar labels dos operadores
				this.operadoresLabel = new JLabel[this.numRegras][this.numEntradas+this.numSaidas-1];
				GridBagConstraints[][] gbc_operadoresLabel = new GridBagConstraints[this.numRegras][this.numEntradas+this.numSaidas-1];
				
				//inicializar os combobox das regras
				this.regras = new JComboBox[this.numRegras][this.numEntradas+this.numSaidas];
				GridBagConstraints[][] gbc_regras = new GridBagConstraints[this.numRegras][this.numEntradas+this.numSaidas];
				
				//posições de referência no grid, posx e posy
				posx = 0;
				int posy = 1;
				
				int comboBoxIterator = 0, labelIterator = 0;
				
				for(int indexRegra=0; indexRegra < this.numRegras; indexRegra++){
					for(int indexEntrada=0; indexEntrada < this.numEntradas; indexEntrada++){
						//criar ComboBoxes das entradas
						this.regras[indexRegra][comboBoxIterator] = new JComboBox();
						//adicionar as curvas de pertinencia ao comboBox de cada entrada
						this.regras[indexRegra][comboBoxIterator].setModel(new DefaultComboBoxModel(this.entradas.get(indexEntrada).nomes));
						this.regras[indexRegra][comboBoxIterator].addItem("");
						//layoutGrid config do comboBox
						gbc_regras[indexRegra][comboBoxIterator] = new GridBagConstraints();
						gbc_regras[indexRegra][comboBoxIterator].fill  = GridBagConstraints.HORIZONTAL;
						gbc_regras[indexRegra][comboBoxIterator].insets = new Insets(0,0,0,0);
						gbc_regras[indexRegra][comboBoxIterator].gridx = posx;
						gbc_regras[indexRegra][comboBoxIterator].gridy = posy;
						//add comboBox ao grid
						this.panel.add(this.regras[indexRegra][comboBoxIterator], gbc_regras[indexRegra][comboBoxIterator]);
						
						comboBoxIterator++;
						posx++;
						
						if(indexEntrada != this.numEntradas-1){
							//criar label
							this.operadoresLabel[indexRegra][labelIterator] = new JLabel("&");
							//layoutGrid config do label
							gbc_operadoresLabel[indexRegra][labelIterator] = new GridBagConstraints();
							gbc_operadoresLabel[indexRegra][labelIterator].anchor = GridBagConstraints.EAST;
							gbc_operadoresLabel[indexRegra][labelIterator].insets = new Insets(0, 0, 0, 0);
							gbc_operadoresLabel[indexRegra][labelIterator].gridx = posx;
							gbc_operadoresLabel[indexRegra][labelIterator].gridy = posy;
							//add label ao grid
							this.panel.add(this.operadoresLabel[indexRegra][labelIterator], gbc_operadoresLabel[indexRegra][labelIterator]);
							
							labelIterator++;
							posx++;
						}
					}
					for(int indexSaida=0; indexSaida < this.numSaidas; indexSaida++){
						//criar label
						this.operadoresLabel[indexRegra][labelIterator] = new JLabel("&");
						if(indexSaida == 0)//se for a primeira saida, coloca um Then
							this.operadoresLabel[indexRegra][labelIterator] = new JLabel("Then");
						//layoutGrid config do label
						gbc_operadoresLabel[indexRegra][labelIterator] = new GridBagConstraints();
						gbc_operadoresLabel[indexRegra][labelIterator].anchor = GridBagConstraints.EAST;
						gbc_operadoresLabel[indexRegra][labelIterator].insets = new Insets(0, 0, 0, 0);
						gbc_operadoresLabel[indexRegra][labelIterator].gridx = posx;
						gbc_operadoresLabel[indexRegra][labelIterator].gridy = posy;
						this.panel.add(this.operadoresLabel[indexRegra][labelIterator], gbc_operadoresLabel[indexRegra][labelIterator]);
						
						labelIterator++;
						posx++;
						
						//criar comboBoxes das saidas
						this.regras[indexRegra][comboBoxIterator] = new JComboBox();
						//adicionar as curvas de pertinencia ao comboBox de cada saida
						this.regras[indexRegra][comboBoxIterator].setModel(new DefaultComboBoxModel(this.saidas.get(indexSaida).nomes));
						this.regras[indexRegra][comboBoxIterator].addItem("");
						//layoutGrid config do comboBox
						gbc_regras[indexRegra][comboBoxIterator] = new GridBagConstraints();
						gbc_regras[indexRegra][comboBoxIterator].fill  = GridBagConstraints.HORIZONTAL;
						gbc_regras[indexRegra][comboBoxIterator].insets = new Insets(0,0,0,0);
						gbc_regras[indexRegra][comboBoxIterator].gridx = posx;
						gbc_regras[indexRegra][comboBoxIterator].gridy = posy;
						//add comboBox ao grid
						this.panel.add(this.regras[indexRegra][comboBoxIterator], gbc_regras[indexRegra][comboBoxIterator]);
						
						comboBoxIterator++;
						posx++;
					}
					labelIterator = 0;
					comboBoxIterator = 0;
					posx = 0;
					posy++;
				}
		this.panel.revalidate();
	}
	
	public void showRegras(){
		this.window.setVisible(true);
	}
	
	public JButton getCriarRegrasBt(){
		return this.criarRegrasBt;
	}
	
	public void hideRegras(){
		this.window.setVisible(false);
	}
	
	public void criarRegrasListener(ActionListener listener){
		this.criarRegrasBt.addActionListener(listener);
	}
}