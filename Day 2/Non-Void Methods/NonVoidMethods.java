public class NonVoidMethods {
    static String frialbert(String namein){
        String nameout = namein + " is friends with albert";
        return nameout;
    }
    static double doublenum(double numin){
        double numout = numin * 2;
        return numout;
    }
    static boolean optixenjoyer(boolean ansin){
        boolean ansout = !ansin;
        return ansout;
    }
    public static void main(String[] args) {
        System.out.println(frialbert("Alex"));
        System.out.println(doublenum(3749.0));
        System.out.println("Is Alex an Optix Enjoyer?: " + optixenjoyer(false));
    }
}
