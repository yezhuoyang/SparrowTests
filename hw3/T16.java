class Main {
    public static void main(String[] args) {
        M m;
        N n;
        boolean rt;
        int result;
        Element e1;
        Element e2;
        Element e3;
        Element e4;
        Element e5;
        
        e1 = new Element();
        rt=e1.Init(1, 10, true);
        e2 = new Element();
        rt=e2.Init(2, 20, false);
        e3 = new Element();
        rt=e3.Init(3, 30, true);
        e4 = new Element();
        rt=e4.Init(4, 40, false);
        e5 = new Element();
        rt=e5.Init(5, 50, true);
        
        m = new M();
        n = new N();
        
        result = m.sum(e1, e2, e3, e4, e5);
        System.out.println(result);
        result = n.sum(e1, e2, e3, e4, e5);
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

    public int sumWithOthers(M m, N n) {
        return (m.sum(this, this, this, this, this)) + (n.sum(this, this, this, this, this));
    }
}

class M {
    int x;
    int y;
    int z;
    int w;
    int v;

    public int sum(Element e1, Element e2, Element e3, Element e4, Element e5) {
        int sum;
        sum = (((e1.GetValue()) + (e2.GetValue())) + ((e3.GetValue()) + (e4.GetValue()))) + (e5.GetValue());
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

    public int sum(Element e1, Element e2, Element e3, Element e4, Element e5) {
        int total;
        total = (((e1.GetID()) + (e2.GetID())) + ((e3.GetID()) + (e4.GetID()))) + (e5.GetID());
        a = total;
        b = total + 1;
        c = total + 2;
        d = total + 3;
        e = total + 4;
        return (((a + b) + (c + d)) + e);
    }
}
