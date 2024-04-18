
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
    }

}