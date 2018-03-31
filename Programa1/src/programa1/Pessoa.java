
package programa1;

public class Pessoa {
    
    public String nome;
    public int idade;
    
    public void imprimir(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessoa: " + idade);
    }
    
    public void fazAniversario(){
        idade++;
    }
    
}
