
package DadosFuncionarios;


public class Temporarios extends Concursado   {
    
    public char cargo;
    
    public Temporarios(){
    super ();
    }
    
   public Temporarios(Integer id, String nome, double salario, char cargo, int ano, int qtd){
    
        super(id, nome, salario, cargo, ano, qtd);
        this.cargo = cargo;
    }

    
    public char getcargo (){
        return cargo;
    }
    
    public void setcargo(char cargo){
        this.cargo = cargo;
    }
    
    
   
    
    
}
