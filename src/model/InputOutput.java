package model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author alexandre
 */
public class InputOutput{
    public String name;
    public double[][] limits;
    public double[] pertinencia;
    public int numCurvas;
    public String[] nomes;
    public boolean isInput;
    
    public InputOutput(String name, String[] nomes, double[][] points, boolean isInput){
        //nome da entrada
        this.name = name;
        //criar matriz de pontos
        this.limits = points;
        //vetor de n pertinencias
        this.pertinencia = new double[this.limits.length];
        //num de curvas
        this.numCurvas = this.pertinencia.length;
        //nome das curvas
        this.nomes = nomes;
        //se for input true, senão false
        this.isInput = isInput;
    }
    
    public double[] getPersistences(double point){
        
        for(int i=0; i<this.numCurvas; i++){
            switch (this.limits[i].length) {
            //rampa, 2 limites
                case 2:
                    this.pertinencia[i] = getRampaPersistence(i, point);
                    break;
            //triangulo, 3 limites
                case 3:
                    this.pertinencia[i] = getTriPersistence(i, point);
                    break;
            //trapezio, 4 limites
                case 4:
                    this.pertinencia[i] = getTraPersistence(i, point);
                    break;
                default:
                    break;
            }
        }
        
        return this.pertinencia; 
    }
    
    //retorna uma pertinencia baseada na curva de um triangulo
    private double getTriPersistence(int i, double point) {
        double inferior = this.limits[i][0];
        double middle = this.limits[i][1];
        double superior = this.limits[i][2];
        
        //se um ponto for menor que o limite inferior ou maior que o limite superior
        if(point <= inferior || point >= superior){
            return 0;
        }
        //se estiver entre o limite inferior e o meio do triangulo
        else if(point > inferior && point < middle){
            return (point - inferior)/(middle - inferior);
        }
        //se estiver entre o meio e o limite superior
        else if(point >= middle && point < superior){
            return (superior - point)/(superior - middle);
        }
        //caso algum erro
        else{
            return -1;
        }
    }
    
    //retorna uma pertinencia baseada na curva de um trapezio
    private double getTraPersistence(int i, double point) {
        double inferior = this.limits[i][0];
        double middle1 = this.limits[i][1];
        double middle2 = this.limits[i][2];
        double superior = this.limits[i][3];
        
        //se um ponto for menor que o limite inferior ou maior que o limite superior
        if(point <= inferior || point >= superior){
            return 0;
        }
        //se estiver entre limites inferior e meio1
        else if(point > inferior && point < middle1){
            return (point - inferior)/(middle1 - inferior);
        }
        //se estiver entre limites meio1 e meio2
        else if(point >= middle1 && point <= middle2){
            return 1;
        }
        //se estiver entre limites meio2 e superior
        else if(point > middle2 && point < superior){
            return (superior - point)/(superior - middle2);
        }
        //se houve erro
        else{
            return -1;
        }
    }
    
    //retorna uma pertinencia baseada na curva de uma rampa
    private double getRampaPersistence(int i, double point) {
        double inferior = this.limits[i][0];
        double superior = this.limits[i][1];
        //rampa invertida
        if(superior < inferior){
            //se for menor que o limite superior
            if(point <= superior){
                return 1;
            }
            //se for maior que o limite inferior
            else if(point >= inferior){
                return 0;
            }
            //se for entre o ponto superior e inferior
            else if(point < inferior && point > superior){
                return (inferior - point)/(inferior-superior);
            }
            return 0;
        }
        //rampa normal
        else{
            //se for um ponto menor que o limite inferior
            if(point <= inferior){
                return 0;
            }
            //se estiver entre o limite inferior e o superior
            else if(point > inferior && point < superior){
                return (point - inferior)/(superior - inferior);
            }
            //se for maior que o limite superior
            else if(point >= superior){
                return 1;
            }
            //caso algum erro
            else{
                return -1;
            }
        }
    }
}