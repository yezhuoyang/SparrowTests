class Main {
    public static void main(String[] args) {
        X x;
        Y y;
        int result;
        x = new X();
        y = new Y();
        
        result = x.compute(10, 20, 30, 40, 50);
        System.out.println(result);
        result = y.compute(10, 20, 30, 40, 50);
        System.out.println(result);
    }
}

class X {
    int a;
    int b;
    int c;
    int d;
    int e;

    public int compute(int a, int b, int c, int d, int e) {
        int result;
        result = 0;
        result = (((a + b) + (c + d)) + e);
        a = result;
        b = result + 1;
        c = result + 2;
        d = result + 3;
        e = result + 4;
        return (((a + b) + (c + d)) + e);
    }
}

class Y extends X {
    int p;
    int q;
    int r;
    int s;
    int t;

    public int compute(int p, int q, int r, int s, int t) {
        int result;
        result = 1;
        result = (((p * q) * (r * s)) * t);
        p = result;
        q = result + 1;
        r = result + 2;
        s = result + 3;
        t = result + 4;
        return (((p + q) + (r + s)) + t);
    }
}
