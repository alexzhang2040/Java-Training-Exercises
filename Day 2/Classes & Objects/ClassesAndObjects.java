public class ClassesAndObjects {
    static class Me {
        String name;
        int age;

        public Me(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getname() {
            return name;
        }
        public int getage() {
            return age;
        }
    }
        public static void main(String[] args){
        Me alex = new Me("Alexander Zhang", 15);
        System.out.println(alex.getname() + ", " + alex.getage());
        }
}
