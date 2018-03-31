
package revisao.exercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class GerenciarFuncionario {

    
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        
        func1.idFunc = 1;
        func1.nomeFunc = "Joao";
        func1.departamento = "RH";
        //func1.dataContratacao(2018, Month.MARCH, 27);
        func1.salario = 1000;
        func1.documento = "123";
        func1.estaAtivo = true;
        
        func1.imprimir();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do aumento: ");
        double valor = Double.parseDouble(sc.nextLine());
        func1.atualizarSalario(valor);
        
        func1.imprimir();
        
        func1.demitirFuncionario();
        
        func1.imprimir();
        
    }
    
}
