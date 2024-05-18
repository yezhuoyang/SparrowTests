class Main {
    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        F f;
        int result;
        a = new A();
        b = new B();
        c = new C();
        d = new D();
        e = new E();
        f = new F();
        
        result = a.processData();
        System.out.println(result);
        result = b.processData();
        System.out.println(result);
        result = c.processData();
        System.out.println(result);
        result = d.processData();
        System.out.println(result);
        result = e.processData();
        System.out.println(result);
        result = f.processData();
        System.out.println(result);
    }
}

class F {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;
    int[] sharedArray;

    public int[] getArray() {
        return sharedArray;
    }

    public int setArray(int[] ar) {
        sharedArray = ar;
        return 1;
    }

    public int processData() {
        int i;
        int result;
        result = 0;
        sharedArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 2;
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

class E extends F {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int processData() {
        int i;
        int result;
        result = 1;
        sharedArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 3;
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

class D extends E {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int processData() {
        int i;
        int j;
        int result;
        result = 0;
        sharedArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 4;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            j = 0;
            while (j < (sharedArray.length)) {
                result = result + ((sharedArray[i]) + (sharedArray[j]));
                j = j + 1;
            }
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

    public int processData() {
        int i;
        int j;
        int result;
        result = 1;
        sharedArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 5;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            j = 0;
            while (j < (sharedArray.length)) {
                result = result * ((sharedArray[i]) - (sharedArray[j]));
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

    public int processData() {
        int i;
        int j;
        int result;
        result = 0;
        sharedArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 6;
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

class A extends B {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int processData() {
        int i;
        int j;
        int result;
        result = 1;
        sharedArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 7;
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
