
package CadastroFuncio;

import DadosFuncionarios.Dependentes;
import DadosFuncionarios.Concursado;
import DadosFuncionarios.Temporarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class principal {
    
    
    public static void main(String[] args){
        int qtd = 0;
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        List<Concursado> list = new ArrayList <>(1);
        List<Temporarios> lista = new ArrayList <>(1);
        
        System.out.print("Qual a quantidade de Funcionarios que deseja cadastrar?");
        int numeroFuncionarios = sc.nextInt();
        
        for(int i=0;i<numeroFuncionarios;i++){
            System.out.println("Funcionario -- " + i );
            System.out.print("O Funcionario é Concursado ? (S/N) ");
             char cargo = sc.next().charAt(0); // LENDO CARACTER DIGITADO
             System.out.print("Digite o id : ");
             int id = sc.nextInt();
             
             System.out.print("Qual salario do colaborador?  ");
             Double salario = sc.nextDouble();
            
            System.out.print("Digite o nome : ");
             sc.nextLine();
             String nome = sc.nextLine();
             
             System.out.print("Quantos anos tem na empresa ?  ");
             int ano = sc.nextInt();
             
             
            
             //PERGUNTANDO SE POSSUI DEPENDENTES
             System.out.print("Possui dependentes ? (S/N) ");
             char tem = sc.next().charAt(0);
             
             if(tem == 'S'){
                  
                 System.out.print("Digite quantos dependetes possui:  ");
                  qtd = sc.nextInt();
                  
                  for(int j = 0;j < qtd;j++ ){
                      if(j < 5){
                      System.out.print("Quais as idades deles:  ");
                      sc.nextLine();
                        int idadeD = sc.nextInt();
                        if(idadeD <= 21){
                            if(cargo == 'S'){
                            salario = salario + 100;
                            }else{
                               salario = salario + 50; 
                            
                            }
                        }else{
                            System.out.println("IDADE NÃO CONCEDE AUMENTO");
                        }
                      }
                        
                  }
             }
             
             
             
             
             if( cargo == 'N'){
               
                  
                 
                 Temporarios em = new Temporarios(id, nome, salario, cargo, ano, qtd );
                 lista.add(em);
             
             }
             else {
                 
                 Concursado emp = new Concursado(id, nome, salario, cargo, ano, qtd);
                 list.add(emp);
             
                 
             }
                
                             
             
             
        
        }
        
       
        System.out.println(" "); 
        System.out.println(" LISTA FUNCIONARIOS ");
        System.out.println(" ");
        
        
        
        
        
        for(Concursado emp: list){
            System.out.println("--------------");
            System.out.println(" CONCURSADO ");
            System.out.println("--------------");
            System.out.println(" ");
            System.out.println("ID :" + emp.getId() + " \n NOME: " + emp.getNome() );
            
            System.out.println(" R$ " + emp.getsalario() );
            System.out.println("Funcionario com  " + emp.getano() + "  anos de empresa.");
            System.out.println("Possui " + emp.getqtd() + " dependentes.");
        }
        
        System.out.println(" ");
        for(Temporarios em: lista){
                
                System.out.println("--------------");
                System.out.println(" TEMPORARIO ");
                System.out.println("--------------");
                System.out.println(" ");
                System.out.println("ID :" + em.getId() + " \n NOME: " + em.getNome() );
            
                System.out.println("R$ " + em.getsalario() );
                System.out.println("Funcionario com  " + em.getano() + "  anos de empresa.");
                System.out.println("Possui " + em.getqtd() + " dependentes.");
        }
        
        
        
        
        
        
        
    sc.close();
    }
    
}
