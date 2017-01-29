package model;

/**
*
* @author jaime
*/
public class ValoresPertinencia {
	public String tipoGrafico, nomeFatorPertinecia;
	public float[] pontos;
   
   
	public ValoresPertinencia(){
       
	}
	public void setTipoGrafico(String nome){
       this.tipoGrafico=nome;
       
	}
	public void setNomeFatorPertinecia(String pert){
       this.nomeFatorPertinecia=pert;
	}
	public void setPontos(float[] _pontos){
       this.pontos=_pontos;
	}
}
