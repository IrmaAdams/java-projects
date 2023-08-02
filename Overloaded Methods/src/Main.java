public class Main {
    public static void main(String[] args) {

        // overloaded methods   =   methods that share the same name but have different parameters
        //                          method name + parameters = method signature

        double x = add(4.3, 7.0);
        System.out.println(x);
        int y = add(4, 7, 4);
        System.out.println(y);
        int z = add(4, 7,9,2);
        System.out.println(z);

    }

    static int add(int a, int b){
        System.out.println("This is overloaded method Nr 1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method Nr 2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method Nr 3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("This is overloaded method Nr 4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded method Nr 5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method Nr 6");
        return a+b+c+d;
    }

}