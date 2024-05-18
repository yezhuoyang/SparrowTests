class Main {
    public static void main(String[] args) {
        X x;
        Y y;
        int result;
        Element e1;
        Element e2;
        Element e3;
        Element e4;
        Element e5;
        boolean rt;
        
        e1 = new Element();
        rt=e1.Init(10, 100, true);
        e2 = new Element();
        rt=e2.Init(20, 200, false);
        e3 = new Element();
        rt=e3.Init(30, 300, true);
        e4 = new Element();
        rt=e4.Init(40, 400, false);
        e5 = new Element();
        rt=e5.Init(50, 500, true);
        
        x = new X();
        y = new Y();
        
        result = x.compute(e1, e2, e3, e4, e5);
        System.out.println(result);
        result = y.compute(e1, e2, e3, e4, e5);
        System.out.println(result);
    }
}

class Element {
    int value;
    int id;
    boolean flag;

    public boolean Init(int v, int i, boolean f) {
        value = v;
        id = i;
        flag = f;
        return true;
    }

    public int GetValue() {
        return value;
    }

    public int GetID() {
        return id;
    }

    public boolean GetFlag() {
        return flag;
    }

    public int getMutualSum(X x, Y y) {
        return (x.compute(this, this, this, this, this)) + (y.compute(this, this, this, this, this));
    }
}

class X {
    int a;
    int b;
    int c;
    int d;
    int e;

    public int compute(Element e1, Element e2, Element e3, Element e4, Element e5) {
        int result;
        result = 0;
        result = (((e1.GetValue()) + (e2.GetValue())) + ((e3.GetValue()) + (e4.GetValue()))) + (e5.GetValue());
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

    public int compute(Element e1, Element e2, Element e3, Element e4, Element e5) {
        int result;
        result = 1;
        result = (((e1.GetID()) * (e2.GetID())) * ((e3.GetID()) * (e4.GetID()))) * (e5.GetID());
        p = result;
        q = result + 1;
        r = result + 2;
        s = result + 3;
        t = result + 4;
        return (((p + q) + (r + s)) + t);
    }
}
