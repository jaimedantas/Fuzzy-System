package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import model.InputOutput;

import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;

public class MainWindow{
	private JFrame window;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menuMenu;
	private JMenuItem sobreMenuItem, ajudaMenuItem, contatoMenuItem, fecharMenuItem; 
	private JButton regrasSistemaBt;
	private JButton verGraficosBt;
	private JButton executarBt;
	private JButton novaSaidaBt, novaEntradaBt, resetarBt; 
	private JLabel entradasLabel;
	private JLabel saidaLabel;
	private JScrollPane scrollPane_1;
	private JTextArea entradasLista, saidasLista;

	/**
	 * Create the frame.
	 */
	
	public MainWindow() {
		this.window = new JFrame("Sistema de Controle Fuzzy");
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.window.setBounds(100, 100, 688, 471);
		this.window.setLocationRelativeTo(null);
		
		this.menuBar = new JMenuBar();
		this.menuMenu = new JMenu("Menu");
		this.sobreMenuItem = new JMenuItem("Sobre");
		this.ajudaMenuItem = new JMenuItem("Ajuda");
		this.contatoMenuItem = new JMenuItem("Contato");
		this.fecharMenuItem = new JMenuItem("Fechar");
		
		this.menuMenu.add(this.sobreMenuItem);
		this.menuMenu.add(this.ajudaMenuItem);
		this.menuMenu.add(this.contatoMenuItem);
		this.menuMenu.add(this.fecharMenuItem);
		
		this.menuBar.add(this.menuMenu);
		
		this.window.setJMenuBar(this.menuBar);
		
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.window.setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		JLabel tituloLabel = new JLabel("Sistema de Controle Fuzzy");
		tituloLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		tituloLabel.setBounds(183, 0, 311, 42);
		contentPane.add(tituloLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(6, 37, 676, 219);
		contentPane.add(panel);
		panel.setLayout(null);
		
		novaEntradaBt = new JButton("Criar nova entrada");
		novaEntradaBt.setForeground(new Color(0, 102, 204));
		novaEntradaBt.setBounds(6, 38, 147, 40);
		panel.add(novaEntradaBt);
		
		novaSaidaBt = new JButton("Criar nova saida");
		novaSaidaBt.setForeground(new Color(51, 102, 0));
		novaSaidaBt.setBounds(6, 90, 147, 40);
		panel.add(novaSaidaBt);
		
		resetarBt = new JButton("Resetar Sistema");
		resetarBt.setForeground(new Color(204, 0, 51));
		resetarBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		resetarBt.setBounds(6, 142, 147, 40);
		panel.add(resetarBt);
		
		entradasLabel = new JLabel("Entradas");
		entradasLabel.setBounds(262, 20, 61, 16);
		panel.add(entradasLabel);
		
		saidaLabel = new JLabel("Saidas");
		saidaLabel.setBounds(520, 20, 40, 16);
		panel.add(saidaLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(206, 38, 168, 156);
		panel.add(scrollPane);
		
		entradasLista = new JTextArea();
		entradasLista.setForeground(new Color(0, 102, 204));
		entradasLista.setDragEnabled(false);
		entradasLista.setBackground(new Color(211, 211, 211));
		entradasLista.setEditable(false);
		scrollPane.setViewportView(entradasLista);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(452, 38, 168, 156);
		panel.add(scrollPane_1);
		
		saidasLista = new JTextArea();
		saidasLista.setForeground(new Color(204, 0, 51));
		saidasLista.setBackground(new Color(211, 211, 211));
		saidasLista.setDragEnabled(false);
		saidasLista.setEditable(false);
		scrollPane_1.setViewportView(saidasLista);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(6, 261, 676, 148);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		regrasSistemaBt = new JButton("Regras do Sistema");
		regrasSistemaBt.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		regrasSistemaBt.setBounds(6, 40, 182, 77);
		panel_1.add(regrasSistemaBt);
		
		verGraficosBt = new JButton("Ver Gráficos");
		verGraficosBt.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		verGraficosBt.setIcon(new ImageIcon(MainWindow.class.getResource("/imagens/grafico_modelo.png")));
		verGraficosBt.setBounds(246, 40, 182, 77);
		panel_1.add(verGraficosBt);
		
		executarBt = new JButton("Executar");
		executarBt.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		executarBt.setIcon(new ImageIcon(MainWindow.class.getResource("/imagens/execute.png")));
		executarBt.setBounds(488, 40, 182, 77);
		panel_1.add(executarBt);
	}
	
	//----------------------MENU ITEMS ACTION LISTENERS ---------------------------
	public void sobreMenuItemListener(ActionListener listener){
		this.sobreMenuItem.addActionListener(listener);
	}
	
	public void ajudaMenuItemListener(ActionListener listener){
		this.ajudaMenuItem.addActionListener(listener);
	}
	
	public void contatoMenuItemListener(ActionListener listener){
		this.contatoMenuItem.addActionListener(listener);
	}
	
	public void fecharMenuItemListener(ActionListener listener){
		this.fecharMenuItem.addActionListener(listener);
	}
	//----------------------BUTTONS ACTION LISTENERS ---------------------------	
	public void executarBtListener(ActionListener listener){
		this.executarBt.addActionListener(listener);
	}
	
	public void novaEntradaBtListener(ActionListener listener){
		this.novaEntradaBt.addActionListener(listener);
	}
	
	public void novaSaidaBtListener(ActionListener listener){
		this.novaSaidaBt.addActionListener(listener);
	}
	
	public void resetarBtListener(ActionListener listener){
		this.resetarBt.addActionListener(listener);
	}
	
	public void regrasSistemaBtListener(ActionListener listener){
		this.regrasSistemaBt.addActionListener(listener);
	}
	
	public void verGraficosBt(ActionListener listener){
		this.verGraficosBt.addActionListener(listener);
	}
	//---------------------SET ENTRADAS/SAIDAS LIST------------------------------
	public void setEntradasText(ArrayList<InputOutput> entradas){
		this.entradasLista.setText("");
		for(InputOutput s : entradas)
			this.entradasLista.append(s.name+"\n");
	}
	
	public void setSaidasText(ArrayList<InputOutput> saidas){
		this.saidasLista.setText("");
		for(InputOutput s : saidas)
			this.saidasLista.append(s.name+"\n");
	}
	
	public void showWindow(){
		this.window.setVisible(true);
	}

	public JButton getRegrasSistemaBt() {
		return regrasSistemaBt;
	}

	public JButton getVerGraficosBt() {
		return verGraficosBt;
	}

	public JButton getExecutarBt() {
		return executarBt;
	}
	
}
