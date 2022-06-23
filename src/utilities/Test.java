package utilities;
import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;
public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method1();


        System.out.println(AccessModifiers.publicData);

        System.out.println("------------------------");

      //  System.out.println(AccessModifiers.protectedData);
        // not accessible always is different packages

    //    System.out.println(AccessModifiers.defaultData);// default is not accessible


      //  System.out.println(AccessModifiers.private.data);  private not visible

        new AccessModifiers();
    }
}
