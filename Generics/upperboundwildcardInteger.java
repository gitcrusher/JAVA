import java.util.List;

class A<T extends Number, S extends Number>{
    void add(T a,S b){
        if((a instanceof Integer)&&(b instanceof Integer)){
            System.out.println(a.intValue()+b.intValue());
        }else if ((a instanceof Integer)&&(b instanceof Double)){
            System.out.println(a.intValue()+b.doubleValue());
        }
    }
}



public class upperboundwildcardInteger {

    public static void main(String[] args) {
    A<Integer,Double> ar = new A<>();
    ar.add(100, 105.5);
    }
}
