class Main {
    public static void main(String[] args) {
        P p;
        Q q;
        R r;
        S s;
        T t;
        U u;
        int result;
        p = new P();
        q = new Q();
        r = new R();
        s = new S();
        t = new T();
        u = new U();
        
        result = p.calculate();
        System.out.println(result);
        result = q.calculate();
        System.out.println(result);
        result = r.calculate();
        System.out.println(result);
        result = s.calculate();
        System.out.println(result);
        result = t.calculate();
        System.out.println(result);
        result = u.calculate();
        System.out.println(result);
    }
}

class U {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;
    int[] sharedArray;

    public int calculate() {
        int i;
        int sum;
        sum = 0;
        sharedArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 2;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            sum = sum + (sharedArray[i]);
            i = i + 1;
        }
        return sum;
    }
}

class T extends U {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int calculate() {
        int i;
        int product;
        product = 1;
        sharedArray = new int[10];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = i * 3;
            i = i + 1;
        }
        i = 0;
        while (i < (sharedArray.length)) {
            product = product * (sharedArray[i]);
            i = i + 1;
        }
        return product;
    }
}

class S extends T {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int calculate() {
        int i;
        int j;
        int sum;
        sum = 0;
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
                sum = sum + ((sharedArray[i]) + (sharedArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return sum;
    }
}

class R extends S {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int calculate() {
        int i;
        int j;
        int product;
        product = 1;
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
                product = product * ((sharedArray[i]) - (sharedArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return product;
    }
}

class Q extends R {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int calculate() {
        int i;
        int j;
        int sum;
        sum = 0;
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
                sum = sum + ((sharedArray[i]) * (sharedArray[j]));
                j = j + 1;
            }
            i = i + 1;
        }
        return sum;
    }
}

class P extends Q {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;

    public int calculate() {
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
