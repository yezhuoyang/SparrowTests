class Main {
    public static void main(String[] args) {
        X x;
        Y y;
        Z z;
        W w;
        V v;
        int result;
        x = new X();
        y = new Y();
        z = new Z();
        w = new W();
        v = new V();
        
        //result = x.compute(10);
        //System.out.println(result);
        //result = y.compute(20);
        //System.out.println(result);
        //result = z.compute(30);
        //System.out.println(result);
        result = w.compute(40);
        System.out.println(result);
        result = v.compute(50);
        System.out.println(result);
    }
}

class V {
    int field1;
    int field2;
    int field3;
    int field4;
    int field5;
    int[] sharedArray;
    X dependency;

    public int[] getArray() {
        return sharedArray;
    }

    public int setArray(int[] ar) {
        sharedArray = ar;
        return 1;
    }

    public int compute(int val) {
        int i;
        int result;
        dependency = new X();
        result = dependency.calculate(val);
        sharedArray = new int[val];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = result;
            i = i + 1;
        }
        return result;
    }

    public int calculate(int val) {
        return val * 2;
    }
}

class W extends V {
    int[] depArray;
    Y dependency;

    public int setDepArray(int[] ar) {
        depArray = ar;
        return 1;
    }

    public int compute(int val) {
        int i;
        int result;
        dependency = new Y();
        result = dependency.calculate(val);
        //result=5;
        return result;
        /*
        sharedArray = new int[val];
        depArray = new int[val];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = result;
            depArray[i] = sharedArray[i];
            i = i + 1;
        }
        return result;
        */
    }
}

class Z extends W {
    int[] depArray;
    Z dependency;

    public int setDepArray(int[] ar) {
        depArray = ar;
        return 1;
    }

    public int compute(int val) {
        int i;
        int j;
        int result;
        dependency = new Z();
        result = dependency.calculate(val);
        sharedArray = new int[val];
        depArray = new int[val];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = result * 2;
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

class Y extends Z {
    int[] depArray;
    V dependency;

    public int setDepArray(int[] ar) {
        depArray = ar;
        return 1;
    }

    public int compute(int val) {
        int i;
        int j;
        int result;
        dependency = new V();
        result = dependency.calculate(val);
        sharedArray = new int[val];
        depArray = new int[val];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = result * 3;
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

class X extends Y {
    int[] depArray;
    W dependency;

    public int setDepArray(int[] ar) {
        depArray = ar;
        return 1;
    }


    public int compute(int val) {
        int i;
        int j;
        int result;
        dependency = new W();
        result = dependency.calculate(val);
        result=0;
        sharedArray = new int[val];
        depArray = new int[val];
        i = 0;
        while (i < (sharedArray.length)) {
            sharedArray[i] = result * 4;
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
