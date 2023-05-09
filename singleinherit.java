
import java.util.*;
class animal{
public String sound = "Bark";
}
class dog extends animal{
Scanner sc = new Scanner(System.in);
public void disp() {
System.out.println("The dog "+ sound);
}
}
public class Main {
public static void main(String[] args) {
dog dog = new dog();
dog.disp();
}
}