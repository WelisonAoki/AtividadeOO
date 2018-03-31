
package revisao.exercicio1;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.Month;


public class Funcionario {

    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean estaAtivo;
    
    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
    
public void atualizarSalario(double valor){
        setSalario(getSalario() + valor);
}

public void demitirFuncionario(){
        setEstaAtivo(false);
}

public void imprimir(){
    System.out.println("Dados do Funcionario:");
    System.out.println("ID do Funcionario: " + getIdFunc());
    System.out.println("Nome do Funcionario: " + getNomeFunc());
    System.out.println("Departamento: " + getDepartamento());
    System.out.println("Data de Contratação: " + getDataContratacao());
    System.out.println("Salario: " + getSalario());
    System.out.println("Documento: " + getDocumento());
    
    if( isEstaAtivo()){
        System.out.println("Funcionario está Ativo.");
    }else{
        System.out.println("Funcionario está Inativo");
    }
    }

    /*public void dataContratacao(int i, Month month, int i0) {
        setDataContratacao();
    }*/



}

