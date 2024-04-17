public class Persona {
    //una classe senza il main puo essere utilizzata
    private String nome;
    private String cognome;
    private int eta;

    public TipoLavoro tipoLavoro;

    public static int count;  // con static la variabile diventa di classe(valore comune a tutti gli oggetti che la usano)
                              // e non di istanza

    //costruttore
    public Persona(String nome, String cognome, int eta, TipoLavoro tipoLavoro) {
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.tipoLavoro=tipoLavoro;
        count++;
    }

    public Persona(String nome, String cognome) {
        this.nome=nome;
        this.cognome=cognome;
        count++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
