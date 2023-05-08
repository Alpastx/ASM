public class constructoreg {

    int age;
    String name;
    public constructoreg() {
        age = 0;
        name = "Unknown";
    }
    public constructoreg(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        constructoreg obj1 = new constructoreg();
        constructoreg obj2 = new constructoreg(25, "John");
        System.out.println("Object 1: Age = " + obj1.age + ", Name = " + obj1.name);
        System.out.println("Object 2: Age = " + obj2.age + ", Name = " + obj2.name);
    }
}