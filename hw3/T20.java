class Main {

    
    public static void main(String [] a){
        B b;
        b=new B();
        System.out.println(b.init());
        System.out.println(b.run());
    }
}


class B extends A{

    int x;
    public int init(){
        int x;
        int y;
        x=1;
        y=this.changex(x);
        return x;
    }

    public int changex(int b){
        x=10000000;
        return 0;
    }
}

class A{
    int x;
    public int run(){
        System.out.println(x);
        return 9;
    }
}
