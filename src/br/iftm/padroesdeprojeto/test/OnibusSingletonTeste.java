package br.iftm.padroesdeprojeto.test;
import br.iftm.padroesdeprojeto.classes.OnibusSingleton;
public class OnibusSingletonTeste {

	/**Com singleton 
	 * 30/07/2020
	 */
	
	//Principal
	public static void main(String[] args) {
		agendarAssento("12A");
		agendarAssento("12A");
	}
/**
 * getINSTANCE - Acesso à única instancia permitida e definida anteriormente
 */
	private static void agendarAssento(String assento) {
		OnibusSingleton a = OnibusSingleton.getINSTANCE();{
			System.out.println(a.bookAssento(assento));
		}
		
	}

}
