package abstraction;
abstract class APerson{
    String name;
    String gender;
    int age;
    APerson(){
        System.out.println(" This is default constructor ");
    }
    APerson(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    void showMessade(){
        System.out.println(" This is from APerson ");
    }
    abstract  void input();
    abstract  void output();
}
class Student extends APerson{
    float score;
    String classroom;
    Student(String name, String gender, int age, float score, String classroom){
        super(name,gender,age);
        this.score= score;
        this.classroom=classroom;
    }
    @Override
    void input(){

    }
    @Override
    void output(){
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Age : "+ age);
        System.out.println("Score : "+ score);
        System.out.println("Classname: "+classroom);
    }

    void shoeMessage(){
        System.out.println("This is child class!!!");
    }
}

public class Demo {
    public static void main(String[] args) {
        Student student = new Student( "luna", "male",45, 90,"cpp");
        student.output();
        student.shoeMessage();
    }
}
