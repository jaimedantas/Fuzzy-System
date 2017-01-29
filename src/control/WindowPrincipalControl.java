package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Centroid;
import model.InputOutput;
import model.Regras;
import view.Ajuda;
import view.Contato;
import view.ExecutarView;
import view.Graficos;
import view.RegrasGUI;
import view.Sobre;
import view.MainWindow;
import view.NovaVariavelView;

/** 
*
* @author alexandre
*/

public class WindowPrincipalControl {
	
	public MainWindow mainWindow;
	public Ajuda ajudaWindow;
	public Sobre sobreWindow;
	public Contato contatoWindow;
	public Graficos graficosWindow;
	public RegrasGUI regrasWindow;
	public ExecutarView executarWindow;
	public NovaVariavelView novaEntradaView, novaSaidaView;
	public Regras regrasModel;
	public Centroid centroidModel;
	public static ArrayList<InputOutput> entradasList, saidasList;
	public static int[][] regras;
	public static double[] valoresEntradas;
	public int valorMaxSaida;
	public boolean regrasCriadas = false;
	
	public WindowPrincipalControl(){
		this.mainWindow = new MainWindow();
		this.ajudaWindow = new Ajuda();
		this.ajudaWindow.setLocationRelativeTo(null);
		this.sobreWindow = new Sobre();
		this.sobreWindow.setLocationRelativeTo(null);
		this.contatoWindow = new Contato();
		this.contatoWindow.setLocationRelativeTo(null);
		this.centroidModel = new Centroid();
		
		entradasList = new ArrayList<InputOutput>();
		saidasList = new ArrayList<InputOutput>();
		
		
		//--menu listeners janela principal
		this.mainWindow.ajudaMenuItemListener(new AjudaListener());
		this.mainWindow.sobreMenuItemListener(new SobreListener());
		this.mainWindow.contatoMenuItemListener(new ContatoListener());
		this.mainWindow.fecharMenuItemListener(new FecharListener());
		
		//--buttons listeners janela principal
		this.mainWindow.resetarBtListener(new ResetarBtListener());
		this.mainWindow.executarBtListener(new ExecutarListener());
		this.mainWindow.novaEntradaBtListener(new NovaEntradaListener());
		this.mainWindow.novaSaidaBtListener(new NovaSaidaListener());
		this.mainWindow.verGraficosBt(new VerGraficosListener());
		this.mainWindow.regrasSistemaBtListener(new RegrasSistemasListener());
		

		
		
		
		this.mainWindow.showWindow();
	}
	
	class RegrasSistemasListener implements ActionListener{
		private boolean firstTime = true;
		private int numEntradas, numSaidas;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!entradasList.isEmpty() && !saidasList.isEmpty()){
				if(firstTime || this.numEntradas != entradasList.size() || this.numSaidas != saidasList.size()){
					this.numEntradas = entradasList.size();
					this.numSaidas = saidasList.size();
					regrasWindow = new RegrasGUI(entradasList, saidasList);
					firstTime = false;
					//--button listeners janela de regras
					regrasWindow.criarRegrasListener(new CriarRegrasListener());
					//mostrar janela
					regrasWindow.showRegras();
				}
				else{
					regrasWindow.showRegras();
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "Não há entradas e/ou saidas no sistema.", "Erro!", JOptionPane.ERROR_MESSAGE);
				firstTime = true;
			}
		}
		
		class CriarRegrasListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				regras = regrasWindow.getRegras();
				regrasModel = new Regras(regras, entradasList.size());
				regrasCriadas = true;
				JOptionPane.showMessageDialog(null, "Regras criadas com sucesso.", "Aviso", JOptionPane.WARNING_MESSAGE);
				regrasWindow.hideRegras();
			}
		}
	}
	
	class VerGraficosListener implements ActionListener{
		private boolean firstTime = true;
		private int numEntradas, numSaidas;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!entradasList.isEmpty() && !saidasList.isEmpty()){
				if(firstTime || this.numEntradas != entradasList.size() || this.numSaidas != saidasList.size()){
					this.numEntradas = entradasList.size();
					this.numSaidas = saidasList.size();
					ArrayList<InputOutput> temp = new ArrayList<InputOutput>();
					for(InputOutput t : entradasList)
						temp.add(t);
					for(InputOutput t : saidasList)
						temp.add(t);
					
					graficosWindow = new Graficos(temp);
					graficosWindow.show();
				}
				else{
					graficosWindow.show();
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "Não há entradas e/ou saidas no sistema.", "Erro!", JOptionPane.ERROR_MESSAGE);
				firstTime = true;
			}
		}
	}
	
	class NovaSaidaListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(saidasList.size() > 0){
				JOptionPane.showMessageDialog(null, "Limite máximo de uma saida atingido,\npor favor resete o sistema para poder adicionar uma nova saida.", "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			else{
				novaSaidaView = new NovaVariavelView();
				novaSaidaView.criarParamActionListener(new CriarParamBtListener());
				novaSaidaView.setLocationRelativeTo(null);
				novaSaidaView.setVisible(true);
			}
		}
		
		class CriarParamBtListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				saidasList.add(novaSaidaView.getEntrada());
				mainWindow.setSaidasText(saidasList);
			}
		}
	}
	
	class NovaEntradaListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			novaEntradaView = new NovaVariavelView();
			novaEntradaView.criarParamActionListener(new CriarParamBtListener());
			novaEntradaView.setLocationRelativeTo(null);
			novaEntradaView.setVisible(true);
		}
		
		class CriarParamBtListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				entradasList.add(novaEntradaView.getEntrada());
				mainWindow.setEntradasText(entradasList);
			}
		}
	}
	
	class ExecutarListener implements ActionListener{
		private boolean firstTime = true;
		private int numEntradas;
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!entradasList.isEmpty() && !saidasList.isEmpty()){
				if(firstTime || this.numEntradas != entradasList.size()){
					this.numEntradas = entradasList.size();
					executarWindow = new ExecutarView(entradasList, saidasList);
					executarWindow.runBtListener(new RunListener());
					executarWindow.show();
					firstTime = false;
				}
				else{
					executarWindow.show();
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "Não há entradas e/ou saidas no sistema.", "Erro!", JOptionPane.ERROR_MESSAGE);
				firstTime = true;
			}
		}
		
		class RunListener implements ActionListener{
			double[] valoresEntrada = new double[entradasList.size()];
			double valorMaxSaida;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(regrasCriadas){
					try{
						valorMaxSaida = Double.parseDouble(executarWindow.getValMax());
						valoresEntrada = executarWindow.getEntradasValores();
						double[] resultados = regrasModel.executarRegras(valoresEntrada, entradasList, saidasList.get(0).nomes.length);
						double resultadoFinal = centroidModel.getCentroid(valorMaxSaida, saidasList.get(0), resultados);
						double[] val = {resultadoFinal};
						executarWindow.setSaidasValores(val);
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Número inválido. Número deve ser inteiro.", "Erro!", JOptionPane.ERROR_MESSAGE);
					}	
				}
				else{
					JOptionPane.showMessageDialog(null, "Não há regras definidas no sistema.", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
	
	class ResetarBtListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			entradasList.clear();
			saidasList.clear();
			mainWindow.setSaidasText(saidasList);
			mainWindow.setEntradasText(entradasList);
			regrasCriadas = false;
		}
	}
	
	class AjudaListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			ajudaWindow.setVisible(true);
		}
	}
	
	class SobreListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			sobreWindow.setVisible(true);
		}
	}
	
	class ContatoListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			contatoWindow.setVisible(true);
		}
	}
	
	class FecharListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}
