public class Match {
    Fighter athlete1;
    Fighter athlete2;
    int minWeight;
    int maxWeight;


    public Match(Fighter athlete1, Fighter athlete2, int minWeight, int maxWeight) {
        this.athlete1 = athlete1;
        this.athlete2 = athlete2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheck()){
            while (this.athlete1.healthy > 0 && this.athlete2.healthy > 0) {
                System.out.println("\n----NEW ROUND----");
                int chance = Math.round((float) Math.random());
                System.out.println("chance : " + chance);
                if(chance == 0) {
                    athlete2.healthy = athlete1.hit(athlete2);
                    if(isWin()){
                        break;
                    }
                    athlete1.healthy = athlete2.hit(athlete1);
                    if (isWin()){
                        break;
                    }
                }
                if(chance == 1){
                    athlete1.healthy = athlete2.hit(athlete1);
                    if(isWin()){
                        break;
                    }
                    athlete2.healthy = athlete1.hit(athlete2);
                    if(isWin()){
                        break;
                    }
                }
                printScore();
            }

        }else{
            System.out.println("is not incompitable");
        }
    }

    private boolean isWin() {
        if (this.athlete1.healthy == 0) {
            System.out.println("\n");
            System.out.println(athlete2.athleteName + " is win!");
            return true;
        }
        if (this.athlete2.healthy == 0) {
            System.out.println("\n");
            System.out.println(this.athlete1.athleteName + " is win!");
            return true;
        }
        return false;
    }

    private void printScore() {
        System.out.println("--");
        System.out.println(athlete1.athleteName + " Kalan can \t:" + athlete1.healthy);
        System.out.println(athlete1.athleteName + " Kalan can \t:" + athlete2.healthy);
    }

    boolean isCheck(){
        return (this.athlete1.weight >= minWeight && this.athlete1.weight <=maxWeight) && (this.athlete2.weight >= minWeight && this.athlete2.weight <= maxWeight);

    }
}
