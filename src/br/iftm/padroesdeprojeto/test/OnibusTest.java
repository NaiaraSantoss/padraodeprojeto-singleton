package br.iftm.padroesdeprojeto.test;

import br.iftm.padroesdeprojeto.classes.Onibus;

/**Sem singleton 
 * Código apresenta problema 
 * na reserva do assento e será resolvido em
 * uma outra classe utilizando singleton
 */

public class OnibusTest {

    public static void main(String[] args) {
        agendarAssento("12A");
        agendarAssento("12A");

    }

    private static void agendarAssento(String assento) {
        Onibus a = new Onibus();
        System.out.println(a.bookAssento(assento));
    }
}
