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
public class Analista extends Funcionario implements Autenticavel{
    private List<String> especialidades;

    public Analista(List<String> especialidades, double salario, String cargo, String depto, int matricula, String nome, String cpf, String rg) {
        super(salario, cargo, depto, matricula, nome, cpf, rg);
        this.especialidades = especialidades;
    }
    
    public void insereEspecialidade(String especialidade){
        especialidades.add(especialidade);
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }
    
    
    
    public double getBonus(){
        double salario = getSalario();
        double quantidadeEspecialidade = especialidades.size();
        double bonus = salario + 0.05*salario*quantidadeEspecialidade;
        return bonus;
    }

    @Override
    public boolean autentica(String usuario, String senha, String sistema) {
        if(sistema.equalsIgnoreCase("Jira")){
            //TODO: Verificar usuário e senha do sistema
            return true;
        }else{
            return false;
        }
    }
    
}
