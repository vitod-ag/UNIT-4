package it.epicode.esercizio3;

import java.util.HashMap;
import java.util.Set;

public class RubricaTelefonica {
    private HashMap<String,String> rubrica;
    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    public  void inserisciContatto(String nome, String numero) {
        rubrica.put(nome,numero);
    }

    public void rimuoviContatto(String nome) {
        rubrica.remove(nome);
    }

    public String cercaPerNome(String nome) {
        return rubrica.get(nome);
    }

    public String cercaPerTelefono(String numero) {
        Set<String> nomi = rubrica.keySet();
        for (String nome:nomi) {
            String numeroTelefono = rubrica.get(nome);
            if (numeroTelefono.equals(numero)) {
                return nome;
            }
        }
        return null;
    }

    public void stampaRubrica() {
        System.out.println(rubrica);
    }
}
