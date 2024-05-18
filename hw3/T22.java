class Main {


    public static void main(String [] a){
        A c;
        c=new A();

        System.out.println(c.BaseMethod(10));
    }
}





class A{

    int cValue;


    public int BaseMethod(int k) {
        if(0<k){
            cValue = (this.BaseMethod(k-1)) + 20;
        }
        else{
        }
        return cValue;
    }
 
}