public class Main {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.model = "A3";
        audi.speed = 10;
        audi.increaseSpeed(50);
        System.out.println(audi.model + " Hızı : " + audi.speed);

        Car bmw = new Car();
        bmw.model = "520İ";
        bmw.speed = 20;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(100);
        bmw.printSpeed();
        System.out.println(bmw.model + " Hızı: " + bmw.speed);

        Car renault = new Car();
        renault.model = "Egea";
        renault.speed = 14;
        System.out.println(renault.model + " Hızı: " + renault.speed);





    }
}