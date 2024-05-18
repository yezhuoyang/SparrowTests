class Main {
    public static void main(String[] args) {
        A a;
        B b;
        int result;
        a = new A();
        b = new B();
        
        result = a.calculate(1, 2, 3, 4, 5);
        System.out.println(result);
        result = b.calculate(1, 2, 3, 4, 5, 6);
        System.out.println(result);
    }
}

class A {
    int value;

    public int calculate(int a, int b, int c, int d, int e) {
        value = ((a + b) + c) + (d + e);
        return value;
    }
}

class B extends A {
    int anotherValue;

    public int calculate(int a, int b, int c, int d, int e, int f) {
        anotherValue = (((a + b) + c) + (d + e))+f;
        return anotherValue;
    }

}
