package This;

public class A {
    int a = 10, b = 50;
    A(int a , int b){
        this(10,30,70);
        System.out.println(this);
        System.out.println(this.a+this.b);
        System.out.println("2 Argument wala constructor hoon");
    }
    A(int a , int b, int c ){
        System.out.println(a+b+c);
        System.out.println("3 Argument wala constructor hoon");
    }

}
class This {
    public static void main(String[] args) {
        A obj = new A(20, 10);
        A obj1 = new A(20, 10, 5);
        System.out.println(obj);
        System.out.println(obj1);
    }
}