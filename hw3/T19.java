class Main {
    public static void main(String[] args) {
        A F;
        int result;
        F = new A();
        System.out.println(F.Fib(20));
    }
}

class A {
    int baseValue;

    public int Fib(int k) {
        B b;
        C c;
        D d;
        int rt;
        b = new B();
        c = new C();
        d = new D();
        if (k < 3) {
            rt = k;
        } else {
            rt = (((this.Fib(k - 2)) + (this.Fib(k - 1))) + (b.Fib(k - 1, this))) + ((c.Fib(k - 1, b)) + (d.Fib(k - 1, c)));
        }
        return rt;
    }

    public int BaseMethod() {
        baseValue = 100;
        return baseValue;
    }
}

class B extends A {
    int bValue;

    public int Fib(int k, A a) {
        int rt;
        if (k < 3) {
            rt = k;
        } else {
            rt = ((a.Fib(k - 2)) + (this.Helper(k))) + (this.BaseMethod());
        }
        return rt;
    }

    public int Helper(int k) {
        bValue = k * 2;
        return bValue;
    }

    public int BaseMethod() {
        bValue =10;
        return bValue;
    }
}

class C extends B {
    int cValue;

    public int Fib(int k, B b) {
        int rt;
        if (k < 3) {
            rt = k;
        } else {
            rt = ((b.Helper(k - 2)) + (this.Helper(k - 1))) + ((this.Fib(k - 3, b)) + (this.BaseMethod(k)));
        }
        return rt;
    }

    public int Helper(int k) {
        cValue = k * 3;
        return cValue;
    }

    public int BaseMethod(int k) {
        if(0<k){
            cValue = (this.BaseMethod(k-1)) + 20;
        }
        else{

        }
        return cValue;
    }
}

class D extends C {
    int dValue;

    public int Fib(int k, C c) {
        int rt;
        if (k < 3) {
            rt = k;
        } else {
            rt = ((c.Helper(k - 2)) + (this.Helper(k - 1))) + ((this.Fib(k - 4, c)) + (this.BaseMethod(k)));
        }
        return rt;
    }

    public int Helper(int k) {
        dValue = k * 4;
        return dValue;
    }

    public int BaseMethod(int k) {
        if(0<k){
            dValue = (this.BaseMethod(k-2)) + 30;
        }
        else{
            
        }
        return dValue;
    }
}

class E extends D {
    int eValue;

    public int Fib(int k, D d) {
        int rt;
        if (k < 3) {
            rt = k;
        } else {
            rt = ((d.Helper(k - 2)) + (this.Helper(k - 1))) + ((this.Fib(k - 5, d)) + (this.BaseMethod()));
        }
        return rt;
    }

    public int Helper(int k) {
        eValue = k * 5;
        return eValue;
    }

    public int BaseMethod() {
        return eValue;
    }
}
