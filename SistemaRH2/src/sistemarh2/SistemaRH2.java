/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class SistemaRH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList();
        List<String> especialidades = new ArrayList();
        especialidades.add("Java");
        especialidades.add("SCRUM");
        List<String> especialidades2 = new ArrayList();
        especialidades2.add("Java");
        
        Analista a = new Analista(especialidades,8000,"AnalistaProgramador","TI",1,"Joao","2929","3847");
        Analista a2 = new Analista(especialidades2,5000,"AnalistaProgramador","TI",2,"Pedro","2329","3842");

        List<Funcionario> subordinados = new ArrayList();
        subordinados.add(a);
        subordinados.add(a2);
        funcionarios.add(a);
        funcionarios.add(a2);
        
        Gerente g = new Gerente(subordinados,15000,"Gerente de TI","TI",3,"Carlão","34343","32425423");
        
        funcionarios.add(g);
        
        imprimeRelatorioBonus(funcionarios);
        Funcionario f = g;
       // Analista  a3 = (Analista)f;
        
// TODO code application logic here
    }
    
    public static void imprimeRelatorioBonus(List<Funcionario> fs){
        for(Funcionario f:fs){
            System.out.println(f);

        }
    }
    
}
