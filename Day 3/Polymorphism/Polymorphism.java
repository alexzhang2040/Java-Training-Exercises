public class Polymorphism {
    static public class Calculator {
        int idivide(int a, int b) {
            return a/b;
        }
        double ddivide(double a, double b) {
            return a/b;
        }
        int imultiply(int a, int b) {
            return a * b;
        }
        //added double to balance out code
        double dmultiply(double a, double b) {
            return a * b;
        }
    }
    
    static public class Slowcalculator extends Calculator{
        private int i;
        private int total;
        
        @Override
            public int imultiply(int a, int b) {
                for(i = 0; i < b; i++) {
                    total += a;
                }
                return total;
            }
    }
    public static void main(String[] args) {
        Slowcalculator calc = new Slowcalculator();
            System.out.println(calc.ddivide(39.0, 49.0));
            System.out.println(calc.idivide(39, 49));
            System.out.println(calc.imultiply(39, 49));
    }
}
