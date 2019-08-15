/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package A01_introducao_sintaxe.exemplos;

/**
 *
 * @author Rafael
 */
public class ExContinue
{
	public static void main (String args[])
	{
		for (int i = 0; i <= 100; i++)
		{
			//abrevia a iteracao se i for multiplo de 2, 3 ou 5
			if (i%2==0 || i%3==0 || i%5 == 0)
				continue;
			//processamento normal para os demais casos
			System.out.println ("i = " + i);
		}
	}
}

