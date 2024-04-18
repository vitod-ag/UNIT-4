
public class UsaCane {
    public static void main(String[] args) {
        Cane cane = new Cane("Thor", 4,"Chihuahua");

//        cane.setNome("Thor");
//        cane.setZampe(4);
        System.out.println();
        System.out.println(cane.getNome());
        System.out.println(cane.getZampe());
        System.out.println(cane.getBreed());
        System.out.println();

        System.out.println(cane.visualizzaDati());
        cane.verso();

        //polimorfismo

        Animale animale = new Cane("Mimmo", 4, "Bulldog");
        System.out.println("\nPolimorfismo");
        System.out.println(animale.visualizzaDati());// posso usare SOLO metodi della superclasse

        // NO COSI--> Cane cane = new Animale()
        // quindi da superclasse a sottoclasse e non viceversa

        Animale[] animals = new Animale[3];

        animals[0]=animale;
        animals[1]=new Cane("Muffin",4,"barboncino");
        animals[2]=new Cane("Carlo",4,"boxer");

        for (int i=0; i<animals.length; i++){
            System.out.println(animals[i].visualizzaDati());
            animals[i].verso();
        }
    }

}