package introduction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Number of students:");
        Student[] students = new Student[5];

        // this is a referece to the introduction.Student class;
        // by default, it is null
        // this is done in compile time, memory is not allocated
        Student student1;

        // new operator allocates the memory at runtime
        // and dynmaically allocates memory
        // and returns a reference to the object
        // and this refercerece is stored in the variable student1
        student1 = new Student();

        final int INCREASE = 2;
        // INCREASE = 3; -> this will give an error




    }

}

class Student{
    int rno;
    String name;
    float marks;

    // default constructor
    public Student(){
        this(0, "Unknown", 0.0f);
    }

    // parameterized constructor
    public Student(int rno, String name, float marks) {

        // this keyword is used to refer to current object
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // copy constructor
    public Student(Student st){
        this.rno = st.rno;
        this.name = st.name;
        this.marks = st.marks;
    }

    // finalize method is called by the garbage collector
    // when the object is no longer reachable
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
    }
}

class A{
    final int num = 10;
    String name;

    @Override
    public String toString(){

        return null;
    }
}

