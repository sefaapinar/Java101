public class Course {
    public int verbal;
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String prefix, String code){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher  = teacher;
        }else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
    }

}
