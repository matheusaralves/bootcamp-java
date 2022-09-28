package generics;

public class AppGeneric {
    public static void main(String[] args) {
        MyClass<Integer> obj1 = new MyClass<>(222);
        MyClass<String> obj2 = new MyClass<>("Texto");


        System.out.println(obj1.getObj());
        System.out.println(obj2.getObj());
    }
}
