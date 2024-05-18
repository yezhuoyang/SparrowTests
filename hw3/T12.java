class Main {
    public static void main(String[] args) {
        M m;
        N n;
        int result;
        m = new M();
        n = new N();
        
        result = m.sum(1, 2, 3, 4, 5);
        System.out.println(result);
        result = n.sum(1, 2, 3, 4, 5);
        System.out.println(result);
    }
}

class M {
    int x;
    int y;
    int z;
    int w;
    int v;

    public int sum(int a, int b, int c, int d, int e) {
        int sum;
        sum = (((a + b) + (c + d)) + e);
        x = sum;
        y = sum + 1;
        z = sum + 2;
        w = sum + 3;
        v = sum + 4;
        return (((x + y) + (z + w)) + v);
    }
}

class N extends M {
    int a;
    int b;
    int c;
    int d;
    int e;

    public int sum(int a, int b, int c, int d, int e) {
        int total;
        total = (((a + b) + (c + d)) + e);
        a = total;
        b = total + 1;
        c = total + 2;
        d = total + 3;
        e = total + 4;
        return (((a + b) + (c + d)) + e);
    }
}
