class Main {
    public static void main(String[] args) {
        A a;
        B b;
        int result;
        a = new A();
        b = new B();
        
        result = a.calculate(10, 20, 30, 40, 50);
        System.out.println(result);
        result = b.calculate(10, 20, 30, 40, 50);
        System.out.println(result);
    }
}

class A {
    int x;
    int y;
    int z;
    int w;
    int v;

    public int calculate(int a, int b, int c, int d, int e) {
        x = a + b;
        y = b + c;
        z = c + d;
        w = d + e;
        v = e + a;
        return (((x + y) + (z + w)) + v);
    }
}

class B extends A {
    int a;
    int b;
    int c;
    int d;
    int e;

    public int calculate(int a, int b, int c, int d, int e) {
        a = a * b;
        b = b * c;
        c = c * d;
        d = d * e;
        e = e * a;
        return (((a + b) + (c + d)) + e);
    }
}
