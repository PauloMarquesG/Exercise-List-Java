package Animal;

public class Aplic {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        System.out.println("Cachorro1: ");
        animal1.falar();

        if (animal1 instanceof Cachorro) {
            Cachorro cachorro1 = (Cachorro) animal1;
            cachorro1.morder();
        }
            System.out.println();
        Cachorro cachorro2 = new Cachorro();
        System.out.println("Cachorro2: ");
        cachorro2.falar();
        cachorro2.morder();
    }
    /*public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();

        falar(cachorro1);
        falar(gato1);
    }
    private static void falar(Animal animal1){
        animal1.falar();
    }*/
}
