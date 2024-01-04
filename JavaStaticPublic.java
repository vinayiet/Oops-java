/**
 * JavaStaticPublic
 */
public class JavaStaticPublic {
    public static void main(String args[]) {
        // new keyword dynamically allocates the memory and return reference variavle to
        // it
        // dynamic memory allocation : the allocation of the memory at the run time
        student student1 = new student(12, "vipin", 24);
        // constructor:Construtor is special funtion , that runs when you create an
        // object and it allocates some variables
        // student() (Basically it defines what happens when your obj
        // will be created )
        // student student1 -> compile time , new student() -> runtime

        // student1.changeName("vishal");
        student1.greeting();
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
    }

}

// instance variable : variable inside the class is known as instance variable
class student {
    int rollno;
    String name;
    float marks;

    void greeting() {
        System.out.println("hello my name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }
    // we need a way to add the values of the above
    // properties obj by obj

    // we need one word to access every object
    // this is constructor
    student() {
        this.rollno = 13;
        this.name = "Vinay";
        this.marks = 34;
    }

    student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}