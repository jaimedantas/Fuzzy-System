package model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emerson
 */
public class Centroid {
    
    public Centroid(){
        
    }
    
    public double max(double[] perMax){
        double max = 0;
        for(int i=0 ; i< perMax.length ; i++){
           max = perMax[i] < max ? max : perMax[i]; 
        }
            
        return max;
    }
    
    public double getCentroid(double valorMax, InputOutput saida, double[] results){
        double pertinencias[];
        double soma = 0,pesoSoma = 0;
        for(double i=0; i < valorMax ; i += valorMax*0.01 ){
            pertinencias = saida.getPersistences(i);
                
            for(int j=0; j< saida.numCurvas ; j++){
                
                pertinencias[j] = pertinencias[j] < results[j] ? pertinencias[j] : results[j]; 
                    
            }
            double max = max(pertinencias);
            pesoSoma += max(pertinencias);

            soma += i*max;
            
        }    
        
        return soma/pesoSoma;
    } 
            
}