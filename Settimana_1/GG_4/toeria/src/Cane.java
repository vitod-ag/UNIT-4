public class Cane extends Animale implements MezzoDiTrasporto{
    private String breed;

    public Cane(String nome, int zampe, String breed) {
        // richiamo il costruttore vuoto della superclasse (lo fa Java senza dirgli nulla)
        super(nome,zampe); // richiamare il costruttore della classe madre (superclasse)
        // inizializzando gli attributi nome e zampe della classe madre Animale, poiché Cane estende Animale.
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //---------override---------
    @Override
    public String visualizzaDati() {
        return super.visualizzaDati()+", razza :" + breed;
    }

    // ---implemento abstract del metodo verso di Animale

    @Override
    public void verso() {
        System.out.println("bau bau");
    }

    @Override
    public void tipoTrasporto() {
        System.out.println("Traina una slitta");
    }
}
