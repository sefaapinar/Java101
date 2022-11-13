public class Student {
    String name;
    String stuNo;
    String classes;

    Course c1;
    Course c2;
    Course c3;

    double avarage;
    boolean isPass;

    double avaragec1;
    double avaragec2;
    double avaragec3;



    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int c1Note, int c2Note,int c3Note){

        if(c1Note >= 0 && c1Note <=100){
            this.c1.note = ((int) (c1Note*0.8));
        }
        if(c2Note >= 0 && c2Note <=100){
            this.c2.note = ((int) (c2Note*0.8));
        }
        if(c3Note >= 0 && c3Note <=100){
            this.c3.note = ((int) (c3Note*0.8));
        }

    }

    public void addBulkAddVerbalGrade(int not1,int not2, int not3){
        if(not1>= 0 && not1<=100){
            this.c1.verbal=((int) (not1*0.2));
        }
        if(not2>= 0 && not2<=100){
            this.c2.verbal=((int) (not2*0.2));
        }
        if(not3>= 0 && not3<=100){
            this.c3.verbal=((int) (not3*0.2));
        }
    }

    public void isPass(){
        System.out.println("\n------------------");
        this.avaragec1 = (this.c1.note + this.c1.verbal);
        this.avaragec2 = (this.c2.note + this.c2.verbal);
        this.avaragec3 = (this.c3.note + this.c3.verbal);
        this.avarage = (this.avaragec1 + this.avaragec2 + this.avaragec3) / 3.0;

        if(this.avarage >=55){
            System.out.println("Congratulations! ");
            this.isPass = true;
        }else{
            System.out.println("You did not pass the class!!");
            this.isPass = false;
        }
        PrintNote();
    }

    public void PrintNote(){
        System.out.println(this.c1.name + "Note: " + this.c1.note);
        System.out.println(this.c1.name + "Note: " + this.c1.verbal);
        System.out.println(this.c1.name + "Note: " + this.avaragec1);
        System.out.println("\n-----------");
        System.out.println(this.c2.name + "Note: " + this.c2.note);
        System.out.println(this.c2.name + "Note: " + this.c2.verbal);
        System.out.println(this.c2.name + "Note: " + this.avaragec2);
        System.out.println("\n-----------");
        System.out.println(this.c3.name + "Note: " + this.c3.note);
        System.out.println(this.c3.name + "Note: " + this.c3.verbal);
        System.out.println(this.c3.name + "Note: " + this.avaragec3);
        System.out.println("\n------");
        System.out.println("\n Your avarage is : " + this.avarage);
    }


}
