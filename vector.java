import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector<String> vectu = new Vector<String>();
        vectu.add("Apple");
        vectu.add("Banana");
        vectu.add("Cherry");
        vectu.add("Date");
        System.out.println("Elements of vector: ");
        for(String element: vectu) {
        System.out.println(element);
        }
        if(vectu.contains("Banana")) {
        System.out.println("Vector contains the element 'banana'");
        }
        System.out.println(vectu.indexOf("Cherry"));
        vectu.remove("Apple");
        System.out.println("The elements in the vector after removing the element 'apple': ");
        for(String element : vectu) {
        System.out.println(element);
        }
        vectu.clear();
        }
        
}
