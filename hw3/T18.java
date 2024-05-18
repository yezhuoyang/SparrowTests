class Main {
    public static void main(String[] args) {
        A F;
        int result;
        F = new A();
        System.out.println(F.Fib(20));
    }
}

class A {
    public int Fib(int k) {
        B b;
        C c;
        int rt;
        b = new B();
        c = new C();
        if (k < 3) {
            rt = k;
        } else {
            rt = (((this.Fib(k - 2)) + (this.Fib(k - 1))) + (b.Fib(k - 1))) + (c.Fib(k - 1));
        }
        return rt;
    }
}

class B extends A {
    public int Fib(int k) {
        int rt;
        if (k < 3) {
            rt = k;
        } else {
            rt = (this.Fib(k - 2)) + (this.Helper(k));
        }
        return rt;
    }

    public int Helper(int k) {
        int result;
        result = (this.Fib(k - 2));
        return result;
    }
}

class C extends B {
    public int Fib(int k) {
        int rt;
        if (k < 4) {
            rt = k;
        } else {
            rt = ((this.Helper(k - 2)) + (this.Helper(k - 1))) + (this.Fib(k - 3));
        }
        return rt;
    }

    public int Helper(int k) {
        int result;
        result = (this.Fib(k - 2));
        return result;
    }
}
