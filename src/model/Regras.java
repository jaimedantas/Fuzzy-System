package model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.util.Arrays.fill;

import java.util.ArrayList;


/**
 *
 * @author alexandre
 */
public class Regras {
    
    public int numRegras;
    public int[][] regras;
    public int numEntradas, tamRegras;
    public double[][] pertinencias;
    public double[] pertinenciasTemp;
    
    public Regras(int[][] regras, int numEntradas){
        this.regras = regras;
        this.tamRegras = regras[0].length;
        this.numRegras = regras.length;
        this.pertinencias = new double[numEntradas][];
        this.pertinenciasTemp = new double[numEntradas];
    }
    
    public double[] executarRegras(double[] inputs, ArrayList<InputOutput> entradas, int numCurvasSaida){
        this.numEntradas = entradas.size();
        //criar matriz de pertinencias e pegar pertinencias para as entradas
        //dadas em inputs
        //fuzzyficação
        for(int i=0; i<this.numEntradas; i++){
            pertinencias[i] = new double[entradas.get(i).numCurvas];
            pertinencias[i] = entradas.get(i).getPersistences(inputs[i]);
        }
        //onde vai ficar salvo o valor resultado de cada regra
        double[] resultadoRegras = new double[this.numRegras];
        int indexCurva;
        //execução das regras
        for(int i=0; i<this.numRegras; i++){
            double min = 1;
            for(int j=0; j<this.numEntradas; j++){
                //pegar o valor da pertinencia da curva, que está na regra
                //e comparar com o mínimo já existente
                indexCurva = regras[i][j];
                //se for -1, significa que a entrada não é considerada na regra
                if(!(indexCurva == -1))
                    min = min < pertinencias[j][indexCurva] ? min : pertinencias[j][indexCurva];
            }
            resultadoRegras[i] = min;
        }
        
        for(double d : resultadoRegras){
            System.out.print(d + " ");
        }
        System.out.println();
        //regrasFinal tem tamanho igual ao numero de curvas da saida
        double[] resultadosFinal = new double[numCurvasSaida];
        //preencher com 1s
        fill(resultadosFinal, 0);
        //representa que curva vai ser analizada em cada iteração
        for(int i=0; i<this.numRegras;i++){
            indexCurva = this.regras[i][this.tamRegras-1];
            //se o valor atual resultadoRegras[i] for maior que o valor que já está naquela curva
            //então substituir, senão deixa como está
            resultadosFinal[indexCurva] = resultadosFinal[indexCurva] > resultadoRegras[i] ? resultadosFinal[indexCurva] : resultadoRegras[i];
        }
        
        return resultadosFinal;
    }
    
    public double min(double[] perMin){
        double min = 0;
        for(int i=0 ; i< perMin.length ; i++){
           min = perMin[i] < min ? min : perMin[i]; 
        }
        return min;
    }
    
    public void mostrarRegras(){
        System.out.println("Regras");
        for(int[] regra: this.regras){
            for(int r : regra){
                System.out.print(r + "\t");
            }
            System.out.println();
        }
    }
}