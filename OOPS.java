//Basic oops in java with its implimentations

class Pen{
    String color ;
    String type ;

    public void write() {
        System.out.println("Writing Something .");
    }

    public void Print() {
        System.out.println(this.color);
    }
}

class Student {
    String name ;
    int age ;   

    public void Print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student(String n , int a ) { // paarameterized cons...
    //     this.name = n ;
    //     this.age= a ;

    //     // System.out.println("First Cons: ");
    // }


    // Student(Student s2){  //copy cons,...
    //     this.name = s2.name ;
    //     this.age = s2.age ;
    // }

    // Student(){

    // }
}
public class OOPS {
    public static void main(String agrs[]){
        // Pen pen1 = new Pen();
        // pen1.color = "Blue" ;
        // pen1.type  = "Gel" ;

        // Pen pen2 = new Pen();
        // pen2.color = "red" ;
        // pen2.type = "Ball" ;

        // pen1.Print();
        // pen2.Print();

      
        // Student s1=  new Student() ;
        // s1.age = 21 ;
        // s1.name =  "Sujan" ;                    //copy cons

        // Student s2 = new Student(s1) ;
        // s2.Print();

    }
    
}
// same as C++ // in  java Destructor is auto  since it has garbage collector
//Abstraction Encapsulation Inheritance Polymorphism