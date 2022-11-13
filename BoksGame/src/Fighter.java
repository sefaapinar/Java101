public class Fighter {
    String athleteName;
    int damage;
    int healthy;
    int weight;
    int dodge;

    public Fighter(String athleteName, int damage, int healthy, int weight,int dodge) {
        this.athleteName = athleteName;
        this.damage = damage;
        this.healthy = healthy;
        this.weight = weight;

        if(dodge >=0 && dodge<=100){
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.athleteName+"=>"+this.damage+" damage to "+foe.athleteName+".");

        if (foe.isDodge()){
            System.out.println(foe.athleteName+" is blocked the damage!");
            System.out.println("--");
            return foe.healthy;
        }

        if (foe.healthy-this.damage<0){
            return 0;
        }
        return foe.healthy-this.damage;
    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }


}
