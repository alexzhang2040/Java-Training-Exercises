public class Encapsulation {
    static class Information {
        private String name;
        private int age;
        private String gender;

        public String getname() {
            return name;
        }
        public int getage() {
            return age;
        }
        public String getgender() {
            return gender;
        }
        public boolean getover21() {
            return age > 21;
        }
        public String getperson() {
            return "Name:" + name + '\n' + "Age:" + age + '\n' + "Gender:" + gender;
        }
        public void setperson(String newname, int newage, String newgender) {
            name = newname;
            age = newage;
            gender = newgender;
        }
    }
    public static void main(String[] args) {
        Information Al = new Information();
            Al.setperson("Alexander", 15, "Male");

            System.out.println(" ");
            System.out.println(Al.getname());
            System.out.println(Al.getage());
            System.out.println(Al.getgender());
            System.out.println(Al.getover21());
            System.out.println(" ");

        Information Ha = new Information();
            Ha.setperson("Haichuan", 32, "Male");

            System.out.println(Ha.getname());
            System.out.println(Ha.getage());
            System.out.println(Ha.getgender());
            System.out.println(Ha.getover21());
            System.out.println(" ");
    }
}
