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
public class SistemAutenticaJira {
    public static void main(String[] args){
        List<String> especialidades2 = new ArrayList();
        especialidades2.add("Java");
        
        Analista a = new Analista(especialidades2,8000,"AnalistaProgramador","TI",1,"Joao","2929","3847");
        
        System.out.println("Verifica autenticação Jira");
        if(autentica(a,"u","s")){
            System.out.println("Autenticado");
        }

    }
    
    public static boolean autentica(Autenticavel a,String u, String s){
        return(a.autentica(u, s, "Jira"));
    }
    
}
