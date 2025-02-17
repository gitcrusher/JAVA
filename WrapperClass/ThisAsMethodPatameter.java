package WrapperClass;

public class ThisAsMethodPatameter {
    int a ;
    int b ;
    ThisAsMethodPatameter(){
        a = 10 ;
        b = 20 ;
    }
    void display(ThisAsMethodPatameter obj){
        System.out.println("A: " + obj.a + ", B: " + obj.b);
    }
    void get() {display(this);}
    public static void main(String[] args) {
        ThisAsMethodPatameter object = new ThisAsMethodPatameter();
        object.get();
    }
}
