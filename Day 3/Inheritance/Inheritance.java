public class Inheritance {
    static class Parent {
        public String last_name;
        public String eye_color;

        public Parent(String last_name, String eye_color){
            this.last_name = last_name;
            this.eye_color = eye_color;
        }
        public String getlast_name() {
            return this.last_name;
        }
        public String geteye_color() {
            return this.eye_color;
        }
    }
    static class Child extends Parent {
        public String first_name;

        public Child(String first_name, String last_name, String eye_color) {
            super(last_name, eye_color);
            this.first_name = first_name;
        }
        public String getfullname() {
            return this.first_name + " " + this.last_name;
        }
    }
    public static void main(String[] args) {
        Parent haichuan = new Parent("Zhang","Brown");
        Child alex = new Child("Alexander", "Zhang", "Black");

        System.out.println(alex.getfullname());
        System.out.println(haichuan.geteye_color());
    }
}
