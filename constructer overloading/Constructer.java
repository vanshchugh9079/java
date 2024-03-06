class Qudilatrial{
    int length,breath;
    String shape;
    Qudilatrial(){
        System.out.println("plese provide side of quadilatria;");
    }
    Qudilatrial(int size){
        System.out.println("this is a squre");
        this.length=this.breath=size;
        this.shape="squre";
    }
    Qudilatrial(int l,int b)
    {
        System.out.println("this is a rectangle");
        this.length=l;
        this.breath=b;
        this.shape="rectangle";
    }
    void area(){
        System.out.println(length*breath);
        System.out.println(this.shape);
    }
}
class Constructer{
    public static void main(String[] args) {
        Qudilatrial q=new Qudilatrial(10,20);
        q.area();
    }
}
