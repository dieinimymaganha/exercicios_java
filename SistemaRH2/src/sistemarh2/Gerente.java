/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh2;

import java.util.List;

/**
 *
 * @author rafae
 */
public class Gerente extends Funcionario implements Autenticavel{
    private List<Funcionario> subordinados;

    public Gerente(List<Funcionario> subordinados, double salario, String cargo, String depto, int matricula, String nome, String cpf, String rg) {
        super(salario, cargo, depto, matricula, nome, cpf, rg);
        this.subordinados = subordinados;
    }
    
    public void insereSubordinado(Funcionario f){
        subordinados.add(f);
    }
    
    public void retirarSubordinado(Funcionario f){
        subordinados.remove(f);
    }
    
    public void tranferirSubordinadoDeGerente(Funcionario f, Gerente g){
        if(subordinados.contains(f)){
            retirarSubordinado(f);
            g.insereSubordinado(f);
        }
    }

    public List<Funcionario> getSubordinados() {
        return subordinados;
    }
    
    
    
    @Override
    public double getBonus(){
        double salario = getSalario();
        double quantidadeFuncionarios = getSubordinados().size();
        double bonus = 2*getSalario()+0.1*salario*quantidadeFuncionarios;
        return bonus;
    }

    @Override
    public boolean autentica(String usuario, String senha, String sistema) {
        if(sistema.equalsIgnoreCase("RH")){
            //TODO: Verificar usuário e senha do sistema
            return true;
        }else{
            return false;
        }
    }
    
    
    @Override
    public String toString(){
        String funcString = super.toString();
        return funcString + " ; qFunc = "+ getSubordinados().size();
    }
    
}
