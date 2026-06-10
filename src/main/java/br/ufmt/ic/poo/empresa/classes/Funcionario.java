package br.ufmt.ic.poo.empresa.classes;

public abstract class Funcionario {
    
    private String nome;
    private String cpf;
    private double salarioBase;
    private String setor;
    private String matricula;
    
    public Funcionario() {
        System.out.println("Classe Funcionario Instanciada!");
    }

    public abstract double calcularSalario();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
