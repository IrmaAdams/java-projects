public class Main {
    public static void main(String[] args) {
        // wrapper class =  provides a way to use primitive data types as reference data types
        //                  reference data types contain useful methods
        //                  it can be used with collections
        //                  reference data types are slower to access than primitive data types

        // PRIMITIVE        WRAPPER
        // ---------------------------
        // boolean          Boolean
        // char             Character
        // int              Integer
        // double           Double
        // byte             Byte
        // short            Short
        // float            Float
        // long             Long
        // ---------------------------

        // autoboxing   =   the automatic conversion that the Java compiler makes between the primitive and their corresponding object wrapper class
        // unboxing     =   the reverse of autoboxing.  Automatic conversion of wrapper class to primitive

        boolean a = true;
        char b = '@';
        int c = 123;
        double d = 3.14159;
        String e = "Kitty";

        // convert primitive data type into wrapper objects
        Boolean aObject = Boolean.valueOf(a);           // or...    Boolean aObject = a;
        Character bObject = Character.valueOf(b);       // or...    Character bObject = b;
        Integer cObject = Integer.valueOf(c);           // or...    Integer cObject = c;
        Double dObject = Double.valueOf(d);             // or...    Double dObject = d;

        // test conversion
        if(aObject instanceof Boolean){
            System.out.println("An object of Boolean is created");
        }
        if(bObject instanceof Character){
            System.out.println("An object of Character is created");
        }
        if(cObject instanceof Integer){
            System.out.println("An object of Integer is created");
        }
        if(dObject instanceof Double){
            System.out.println("An object of Double is created");
        }

        // convert Wrapper Objects into primitive types
        boolean aPrimitive = aObject;
        char bPrimitive = bObject;
        int cPrimitive = cObject;
        double dPrimitive = dObject;
    }
}