
package revisao.exercicio1;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.Month;


public class Funcionario {
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean estaAtivo;
    
    public boolean estaAtivo() {
        return estaAtivo;
    }
    
public void atualizarSalario(double valor){
    salario += valor;
}

public void demitirFuncionario(){
    estaAtivo = false;
}

public void imprimir(){
    System.out.println("Dados do Funcionario:");
    System.out.println("ID do Funcionario: " + idFunc);
    System.out.println("Nome do Funcionario: " + nomeFunc);
    System.out.println("Departamento: " + departamento);
    System.out.println("Data de Contratação: " + dataContratacao);
    System.out.println("Salario: " + salario);
    System.out.println("Documento: " + documento);
    if(estaAtivo){
        System.out.println("Funcionario está Ativo.");
    }else{
        System.out.println("Funcionario está Inativo");
    }
    }

    public void dataContratacao(int i, Month month, int i0) {
        dataContratacao = LocalDate.of(2018, Month.MARCH, 27);
    }



}

