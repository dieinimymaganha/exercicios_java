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
public class Vendedor extends Funcionario{

    public Vendedor(double salario, String cargo, String depto, int matricula, String nome, String cpf, String rg) {
        super(salario, cargo, depto, matricula, nome, cpf, rg);
    }

    @Override
    public double getBonus() {
        return 0;
    }
    
}
