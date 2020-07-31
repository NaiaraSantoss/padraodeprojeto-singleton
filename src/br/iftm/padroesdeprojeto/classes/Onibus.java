package br.iftm.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/**Código sem a utilização de padrão de projeto
 * 
 */
public class Onibus {
    private Set<String> assentosDisponiveis;

    public Onibus() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("12A");
        assentosDisponiveis.add("12B");

    }

    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }
}
