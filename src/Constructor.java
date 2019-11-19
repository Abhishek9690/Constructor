public class Constructor {
    Constructor()                       //COnstructor
    {
        System.out.println("Welcome in gla");
    }
    void Btech(){
        System.out.println("Btech prog..");
    }
    void Bca(){
        System.out.println("Bca pro..");
    }
    void Mca(){
        System.out.println("Mca pro..");
    }
    public static void main(String[] args) {
        Constructor obj=new Constructor();
        obj.Bca();
        obj.Btech();
        obj.Mca();
    }
}
