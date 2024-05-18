class Main {
    public static void main(String[] args) {
        A a;
        B b;
        int result;
        boolean rt;
        Element e1;
        Element e2;
        Element e3;
        Element e4;
        Element e5;
        
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
        
        a = new A();
        b = new B();
        
        result = a.calculate(e1, e2, e3, e4, e5);
        System.out.println(result);
        result = b.calculate(e1, e2, e3, e4, e5);
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
}

class A {
    int x;
    int y;
    int z;
    int w;
    int v;

    public int calculate(Element e1, Element e2, Element e3, Element e4, Element e5) {
        x = ((((e1.GetValue()) + (e2.GetValue())) + ((e3.GetValue()) + (e4.GetValue()))) + (e5.GetValue()));
        y = ((((e1.GetID()) + (e2.GetID())) + ((e3.GetID()) + (e4.GetID()))) + ((e5.GetID())));
        z = 0;
        if ((e1.GetFlag())) {z = z + 1;}
        else{

        }
        if ((e2.GetFlag())) z = z + 1;
        else{

        }
        if ((e3.GetFlag())) z = z + 1;
        else{

        }
        if ((e4.GetFlag())) z = z + 1;
        else{

        }
        if ((e5.GetFlag())) z = z + 1;
        else{

        }
        w = x * y;
        v = w + z;
        return ((x + y) + (z + w)) + v;
    }
}

class B extends A {
    int a;
    int b;
    int c;
    int d;
    int e;

    public int calculate(Element e1, Element e2, Element e3, Element e4, Element e5) {
        a = (((e1.GetValue()) * (e2.GetValue())) * ((e3.GetValue()) * (e4.GetValue()))) * (e5.GetValue());
        b = (((e1.GetID()) * (e2.GetID())) * ((e3.GetID()) * (e4.GetID()))) * (e5.GetID());
        c = 0;
        if ((e1.GetFlag())) c = c + 1;
        else{

        }
        if ((e2.GetFlag())) c = c + 1;
        else{
            
        }
        if ((e3.GetFlag())) c = c + 1;
        else{
            
        }
        if ((e4.GetFlag())) c = c + 1;
        else{
            
        }
        if ((e5.GetFlag())) c = c + 1;
        else{
            
        }
        d = a * b;
        e = d + c;
        return ((a + b) + (c + d)) + e;
    }
}
