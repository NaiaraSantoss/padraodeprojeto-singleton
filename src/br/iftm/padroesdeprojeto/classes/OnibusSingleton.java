package br.iftm.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Código com singleton
 * 30/07/2020
 */
public class OnibusSingleton {
    // EAGER INITIALIZATION - inicialização direto no atributo
	//private static final OnibusSingleton INSTANCE = new OnibusSingleton();
	
	private static OnibusSingleton INSTANCE;
    private Set<String> assentosDisponiveis;
    
    // Lazy INITIALIZATION - só irá criar a instância se for usar a instância
    
    /**
     * GetINSTANCE permite o acesso à instância 
     * @return
     */
    public static OnibusSingleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (OnibusSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new OnibusSingleton();
                }
            }
        }
        return INSTANCE;
    }

    
    /**
     * Construtor privado limita o acesso  -  hashset adiciona, remove, contem e dimensiona 
     * os assentos disponíveis
     */
    private OnibusSingleton() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("12A");
        assentosDisponiveis.add("12B");
    }
    
    /**
     * boolean que retorna verdadeiro ou falso para o assento disponível e remove assento reservado.
     * @param assento
     * @return
     */
    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }

}
