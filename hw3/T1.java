class Main {
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        int result;
        a = new A();
        b = new B();
        c = new C();
        d = new D();
        e = new E();
        
        result = a.compute(5);
        System.out.println(result);
        result = b.compute(6);
        System.out.println(result);
        result = c.compute(7);
        System.out.println(result);
        result = d.compute(8);
        System.out.println(result);
        result = e.compute(9);
        System.out.println(result);
    }
}

class E {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;
    int[] sharedArray;

    public int compute(int val) {
        int i;
        int result;
        result = 0;
        sharedArray = new int[val];
        i = 0;
        while (i < val) {
            sharedArray[i] = i;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            result = result + (sharedArray[i]);
            i = i + 1;
        }
        return result;
    }
}

class D extends E {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int compute(int val) {
        int i;
        int result;
        result = 1;
        sharedArray = new int[val];
        i = 0;
        while (i < val) {
            sharedArray[i] = i * 2;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            result = result * (sharedArray[i]);
            i = i + 1;
        }
        return result;
    }
}

class C extends D {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int compute(int val) {
        int i;
        int j;
        int result;
        result = 0;
        sharedArray = new int[val];
        i = 0;
        while (i < val) {
            sharedArray[i] = i;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            j = 0;
            while (j < (sharedArray.length)) {
                result = result + ((sharedArray[i]) * (sharedArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return result;
    }
}

class B extends C {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int compute(int val) {
        int i;
        int j;
        int result;
        result = 1;
        sharedArray = new int[val];
        i = 0;
        while (i < val) {
            sharedArray[i] = i * 2;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            j = 0;
            while (j < (sharedArray.length)) {
                result = result * ((sharedArray[i]) + (sharedArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return result;
    }
}

class A extends B {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int compute(int val) {
        int i;
        int j;
        int result;
        result = 0;
        sharedArray = new int[val];
        i = 0;
        while (i < val) {
            sharedArray[i] = i * 3;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            j = 0;
            while (j < (sharedArray.length)) {
                result = result + ((sharedArray[i]) - (sharedArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return result;
    }
}
