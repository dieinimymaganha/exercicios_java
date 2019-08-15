/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh2;

/**
 *
 * @author rafae
 */
public abstract class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private String depto;
    private int matricula;

    public Funcionario(double salario, String cargo, String depto, int matricula, String nome, String cpf, String rg) {
        super(nome, cpf, rg);
        this.salario = salario;
        this.cargo = cargo;
        this.depto = depto;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public int getMatricula() {
        return matricula;
    }

    public abstract double getBonus();
    
    @Override
    public int hashCode() {
        String cpf = getCpf();
        int hash = cpf.length();
        return hash;
    }
    
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!obj.getClass().equals(this.getClass()) )
            return false;

        Funcionario objFuncionario = (Funcionario)obj;

        if(!objFuncionario.getCpf().equalsIgnoreCase(this.getCpf()))
            return false;

        return true;       
    }
    
    
    @Override
    public String toString(){
        return "Nome: "+getNome() +
                "CPF: "+getCpf() +
                "Bonus: "+getBonus();
    }
    

}
