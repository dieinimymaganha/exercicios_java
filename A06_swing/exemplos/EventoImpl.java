/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A06_swing.exemplos;

/**
 *
 * @author Rafael
 */
public class EventoImpl implements Evento{

    @Override
    public void clicar() {
        System.out.println("Eu cliquei!!!!");
    }

    @Override
    public void arrastar() {
        System.out.println("Eu arrastei!!!");
    }

}
