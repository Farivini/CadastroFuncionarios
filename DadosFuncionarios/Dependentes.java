
package DadosFuncionarios;

/**
 *
 * @author VINICIUS FARINELI FREIRE
 */
public class Dependentes extends Concursado {

    
    public char tem;
    public int qtd;
    public int idadeD;
    
    public Dependentes(){ }
    
    public Dependentes (char tem, int qtd, int idadeD){
        
        this.tem = tem;
        this.qtd = qtd;
        this.idadeD = idadeD;
        
    }
    
    public char gettem(){
        return tem;
    }
    
    public void settem(char tem){
        this.tem = tem;
    
    }
    
    
    public int getqtd(){
        
        return qtd;
        
    }
    
    public void setqtd(int qtd){
        if(qtd <= 5){
        this.qtd = qtd;
        }else{
            System.out.println("Limite excedido");
        }
    }
    
    public int getidadeD  (){
        return idadeD ;
        
    }
    
    public void setidadeD(int idadeD){
       
        this.idadeD  = idadeD;
        
        }
    
    
}

