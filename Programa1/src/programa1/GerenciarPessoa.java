
package programa1;

public class GerenciarPessoa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Lucas";
        p1.idade = 24;
        p1.imprimir();
        
        System.out.println("Pessoa faz aniversário!");
        p1.fazAniversario();
        
        p1.imprimir();
        
    }
    
}
