class Main {

    
    public static void main(String [] a){
        B b;
        b=new B();
        System.out.println(b.init());
        System.out.println(b.run());
        System.out.println(b.printb());
    }
}


class B extends A{

    int x;
    int b;
    public int init(){
        int x;
        int y;
        f=false;
        x=1;
        y=this.changex(x);
        return x;
    }


    public int changex(int b){
        if(f){
            b=5000;
            x=10000000;
        }
        else{
            b=2500;
            x=8000;
        }
        return 0;
    }
}

class A extends C{
    boolean f;
    int b;
    public int run(){
        System.out.println(x);
        return x;
    }

    public int printb(){
        System.out.println(b);
        return b;
    }


}



class C{
    int x;
    int b;
    public int run(){
        System.out.println(x);
        return 9;
    }
}
