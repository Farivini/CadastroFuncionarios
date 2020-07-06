
package DadosFuncionarios;



    
public class Concursado  {

	private Integer id;
	private String nome;
	public Double salario;
        private int ano;
        public char cargo;
        private int qtd;
        public int idadeD;
    
        
	
	public Concursado() {
	}
	
	public Concursado(Integer id, String nome, double salario, char cargo, int ano, int qtd) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
                this.ano = ano;
                this.cargo = cargo;
                this.qtd = qtd;
        }
        
         public int getqtd(){
            
            return qtd;
        }
        public void setqtd(int qtd){
           this.qtd = qtd;
           
        }
        
        public int getano(){
            
            return ano;
        }
        public void setano(int ano){
           this.ano = ano;
           
        }
        
        

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public Double getsalario() {
          return salario;
        }
	public void setsalario(Double salario) {
         this.salario = salario;
        }
	
	public void incrementoSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}

    

