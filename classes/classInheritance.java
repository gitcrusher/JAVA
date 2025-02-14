package classes;

class A {
    A(int a , int b ){
        System.out.println(a + b);
    }
    A(int a, int b, int c){
        System.out.println(a + b + c);
    }
}

public class classInheritance {
    public static void main(String[] args) {
        A obj = new A(50, 60);
        A obj1 = new A(50, 60,70);
    }
}//if void was used then the java would understand it as a regular function 
