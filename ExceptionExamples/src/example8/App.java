package example8;

public class Parent {
    // предок пугает Exception
    public void f() throws Exception {}
}


// тут ошибка компиляции в Java, но, ДОПУСТИМ, ее нет
public class Child extends Parent {
    // потомок расширил Exception до Throwable
    public void f() throws Throwable {}
}


public class Demo {
    public static void test(Parent ref) {
        // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
        try {
            ref.f();
        } catch(Exception e) {}
    }
}


public class App {
    public static void main(String[] args) {
        // тут все компилируется, Demo.test хотел Parent и мы дали ему подтип - Child
        Demo.test(new Child());
    }
}
