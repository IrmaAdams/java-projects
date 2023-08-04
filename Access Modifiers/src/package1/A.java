package package1;
import package2.*;

public class A {
    // public modifier =        visible to all classes
    // protected modifier =     visible to own class, other classes within the same package, all subclasses
    // default/no modifier =    visible to own class, other classes within the same package, subclasses within the same package
    // private modifier =       visible to own class only

    public static void main(String[] args) {

        C c = new C();

        //System.out.println(c.defaultMessage);           // error
        System.out.println(c.publicMessage);

    }
}
