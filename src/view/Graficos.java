package view;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection;

import model.InputOutput; 
/**
 *
 * @author alexandre
 */
public class Graficos{
    
    public JFrame window;
    public JTabbedPane tabs;
    public XYSeries[][] graficos;
    public XYSeriesCollection datasets;
    public JFreeChart[] charts;
    
    public Graficos(ArrayList<InputOutput> inputsOutputs){
        //quantidade de entradas e saidas
        int length = inputsOutputs.size();
        //janela principal
        window = new JFrame("Gráficos Fuzzy");
        //configurações da janela
        window.setSize(800,600);
        window.setLayout(new BorderLayout());
        
        WindowListener listener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent w) {
                window.setVisible(false);
            }
        };
        window.addWindowListener(listener);
        
        //n abas
        tabs = new JTabbedPane();
        //n panels
        //panels = new JPanel[length];
        //n graficos com m curvas
        graficos = new XYSeries[length][];
        //n datasets
        datasets = new XYSeriesCollection();
        //n charts
        charts = new JFreeChart[length];
        //para cada entrada/saida
        double superior, inferior, middle, middle2;
        for(int j = 0; j < length; j++){
            datasets = new XYSeriesCollection();
            //numCurvas quantidade de series, que serao adicionados ao dataset
            graficos[j] = new XYSeries[inputsOutputs.get(j).numCurvas];
            //para cada curva criar o series e adicionar os pontos a serie
            for(int i = 0; i < inputsOutputs.get(j).numCurvas; i++){
                //create new series
                graficos[j][i] = new XYSeries(inputsOutputs.get(j).nomes[i]);
                int numPointsCurve = inputsOutputs.get(j).limits[i].length;
                switch(numPointsCurve){
                    //rampa
                    case 2:
                        inferior = inputsOutputs.get(j).limits[i][0];
                        superior = inputsOutputs.get(j).limits[i][1];
                        graficos[j][i].add(superior, 1);
                        graficos[j][i].add(inferior, 0);
                        //se a rampa for invertida
                        if(superior < inferior){
                            graficos[j][i].addOrUpdate(0, 1);
                        }
                        //se não faz normal
                        else{
                            graficos[j][i].add(superior+(superior*0.2), 1);
                        }
                        break;
                    //triangulo
                    case 3:
                        inferior = inputsOutputs.get(j).limits[i][0];
                        middle = inputsOutputs.get(j).limits[i][1];
                        superior = inputsOutputs.get(j).limits[i][2];
                        graficos[j][i].add(inferior, 0);
                        graficos[j][i].add(middle, 1);
                        graficos[j][i].add(superior, 0);
                        break;
                    //trapezio
                    case 4:
                        inferior = inputsOutputs.get(j).limits[i][0];
                        middle = inputsOutputs.get(j).limits[i][1];
                        middle2 = inputsOutputs.get(j).limits[i][2];
                        superior = inputsOutputs.get(j).limits[i][3];
                        graficos[j][i].add(inferior, 0);
                        graficos[j][i].add(middle, 1);
                        graficos[j][i].add(middle2, 1);
                        graficos[j][i].add(superior, 0);
                        break;
                    default:
                        break;
                }
                //add series to dataset
                datasets.addSeries(graficos[j][i]);
            }
            
            //criar janela e grafico chart
            charts[j] = ChartFactory.createXYLineChart(
                inputsOutputs.get(j).name, 
                inputsOutputs.get(j).name, 
                "Pertinência", 
                datasets, 
                PlotOrientation.VERTICAL, 
                true, true, false);
            tabs.addTab(inputsOutputs.get(j).name, new ChartPanel(charts[j]));
        }
        
        window.getContentPane().add(tabs);
    }
    
    public void show(){
       window.setVisible(true);
    }
    
}
