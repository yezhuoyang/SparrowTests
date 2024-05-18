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
        
        result = a.calculate();
        System.out.println(result);
        result = b.calculate();
        System.out.println(result);
        result = c.calculate();
        System.out.println(result);
        result = d.calculate();
        System.out.println(result);
        result = e.calculate();
        System.out.println(result);
    }
}

class E {
    int[] sharedArray;
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int[] getArray() {
        return sharedArray;
    }

    public int setArray(int[] ar) {
        sharedArray = ar;
        return 1;
    }

    public int calculate() {
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

class D extends E {
    int[] depArray;

    public int setDepArray(int[] ar) {
        depArray = ar;
        return 1;
    }

    public int calculate() {
        int i;
        int result;
        result = 1;
        sharedArray = new int[10];
        depArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 3;
            depArray[i] = sharedArray[i];
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            result = result * (depArray[i]);
            i = i + 1;
        }
        return result;
    }
}

class C extends D {
    int[] depArray;

    public int setDepArray(int[] ar) {
        depArray = ar;
        return 1;
    }

    public int calculate() {
        int i;
        int j;
        int result;
        result = 0;
        sharedArray = new int[10];
        depArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 4;
            depArray[i] = sharedArray[i];
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            j = 0;
            while (j < (depArray.length)) {
                result = result + ((sharedArray[i]) + (depArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return result;
    }
}

class B extends C {
    int[] depArray;

    public int setDepArray(int[] ar) {
        depArray = ar;
        return 1;
    }

    public int calculate() {
        int i;
        int j;
        int result;
        result = 1;
        sharedArray = new int[10];
        depArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 5;
            depArray[i] = sharedArray[i];
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            j = 0;
            while (j < (depArray.length)) {
                result = result * ((sharedArray[i]) - (depArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return result;
    }
}

class A extends B {
    int[] depArray;

    public int setDepArray(int[] ar) {
        depArray = ar;
        return 1;
    }

    public int calculate() {
        int i;
        int j;
        int result;
        result = 0;
        sharedArray = new int[10];
        depArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 6;
            depArray[i] = sharedArray[i];
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            j = 0;
            while (j < (depArray.length)) {
                result = result + ((sharedArray[i]) * (depArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return result;
    }
}
