public class Main {
    public static void main(String[] args) {
       Fighter athlete1 = new Fighter("Sefa",10,120,100,30);
       Fighter athlete2 = new Fighter("Yasin",30,234,250,12);


       Match match = new Match(athlete1,athlete2,85,95);
       match.run();
    }
}