public class ImterfaceCLass {
    public static void main(String[] args) {

    }
}

interface AnimalDo {
    public void eat();

    public void travel();
}

class Cow implements AnimalDo {
    @Override
    public void eat() {
        System.out.println("cow eats grass");
    }

    @Override
    public void travel() {
        System.out.println("cow travel on 4 foot");
    }
}