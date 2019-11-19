public class TypesOfConstructor {
    TypesOfConstructor(){
        System.out.println("Non para constructor");
    }
    TypesOfConstructor(int a){
        System.out.println("para constructor");
    }

    public static void main(String[] args) {
        TypesOfConstructor obj1=new TypesOfConstructor(15);
        TypesOfConstructor obj2=new TypesOfConstructor();
    }
}
