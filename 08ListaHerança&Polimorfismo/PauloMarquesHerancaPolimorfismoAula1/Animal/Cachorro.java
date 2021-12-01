package Animal;

public class Cachorro extends Animal {
    @Override
    public void falar() {
        System.out.println("Au-Au ...");
    }

    public void morder(){
        System.out.println("Nhac!");
    }
}
