public class Car {
    //nitelikler
    String type;
    String model;
    String color;

    int speedLimit = 150;
    int speed;

    //davranışlar
    void increaseSpeed(int increment){
      if((speed + increment) < speedLimit){
            speed += increment;
        }
    }
    void decreaseSpeed(int decrease){
        if(decrease > 0){
            speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hızınız: " + speed);
    }
}
