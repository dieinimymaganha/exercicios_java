/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A01_introducao_sintaxe.exemplos;

/**
 *
 * @author Rafael
 */
public class ExTryFinally
{
	public static void main(String[] args) {
		int j=5;  // valor default
		try{
			j=Integer.parseInt(args[0]);
		}
		catch(Exception e){
			System.out.println("Argumento inválido ou ausente.\nUsando valor default...");
		}
		finally{
			while(j>=0){
				System.out.println(j);
				j--;
			}
		}
	}
}

