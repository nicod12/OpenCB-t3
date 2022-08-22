package Java;

public class main {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.setAge(20);
        person.setName("Oscar");
        person.setPhone(548712);
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getPhone());
    }

    public static class Persona {
        private int age;
        private String name;
        private int phone;

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public int getPhone() {
            return phone;
        }
    }
}
