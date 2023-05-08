import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter password: ");
String password = sc.nextLine();
try {
if (!password.equals("password")) {
throw new Exception("Authentication Failure");
}
System.out.println("Authentication Successful");
} catch (Exception e) {
System.out.println(e);
}
}
}
