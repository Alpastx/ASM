
import java.util.*;
class Main{
	public static void main(String[] args) {
		Vector<String> vectu = new Vector<String>();
		vectu.add("Apple");
		vectu.add("Banana");
		vectu.add("Cherry");
		vectu.add("Pear");
		for(String element : vectu) {
			System.out.println("Elements in Vector after adding: "+ element);
		}
		vectu.remove("Banana");
		vectu.remove("Cherry");
		vectu.remove("Pear");
		for(String element : vectu) {
			System.out.println("");
			System.out.println("Elements in Vector after removing: "+ element);
		}
	}
}