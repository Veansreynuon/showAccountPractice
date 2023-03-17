package abstracttwo;

import java.util.Scanner;

interface IPerson{
    float PI = 3.14f;
    void input();
    void  output();
    void showMessage();
}
class Person implements IPerson{
    String name;
    String gender;
    int age;
    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your name: ");
        name = input.next();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        gender = input1.next();
        Scanner input2 = new Scanner(System.in);
        age = input2.nextInt();
    }
    @Override
    public void output() {
        System.out.println(""+name);
        System.out.println(""+gender);
        System.out.println(""+age);
    }

    @Override
    public void showMessage() {
        System.out.println("this is know as show message");
        System.out.println("Value of PI is : "+PI);

    }
}
public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.input();
        System.out.println("------------------------------");
        obj.output();
    }
}
