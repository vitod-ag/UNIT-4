public abstract class Animale {
    private int zampe;
    private String nome;

    public Animale(int zampe, String nome) {
        this.zampe = zampe;
        this.nome = nome;
    }

    // overload => uso la stessa signature ma DEVE avere parametri diversi


    public Animale(String nome){
        this.nome=nome;
    }

    public Animale(String nome, int zampe){
        this.zampe=zampe;
        this.nome=nome;
    }

    //------------------------------------------------------------------------

    public int getZampe() {
        return this.zampe;
    }

    public void setZampe(int zampe) {
        this.zampe = zampe;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // overriding

    public String visualizzaDati() {
        return "Nome: " + nome + ", zampe: " + zampe;
    }

    // astrazione (ha bisogno che anche la classe stessa sia astratta

    public abstract void verso();


}
