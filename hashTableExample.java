import java.util.Enumeration;
import java.util.Hashtable;
public class hashTableExample {
    // This is a simple example of how to use a hashtable in Java
    public static void main(String[] args) {
        // Create a hashtable
        Hashtable<String , String> ht = new Hashtable<>();
        ht.put("key 1","Romeo");
        ht.put("key 2","Juleat");
        
        Enumeration<String> name = ht.keys();
        // Print the keys and values in the hashtable
        while(name.hasMoreElements()){
            String key = name.nextElement();
            System.out.println("Key:" + key + " \t Value :" + ht.get(key));
        }
    }
}