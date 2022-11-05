public class Car {
    //nitelikler
    String type = "Sedan";
    String model = "TEST";

    String color;

    int speedLimit = 150;
    int speed;

    Car(String model,int speed){

        this.model = model;
        this.speed = speed;
    }
    //davranışlar
    void increaseSpeed(int increment){
      if((speed + increment) < speedLimit){
            this.speed += increment;
        }
    }
    void decreaseSpeed(int decrease){
        if(decrease > 0){
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hızınız: " + speed);
    }

    void printInfo(){
        System.out.println("Model : " + this.model);
    }
}
