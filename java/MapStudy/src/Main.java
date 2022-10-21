import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username","leona");
        cookies.put("email","leona@gmail.com");
        cookies.put("phone","9970492");

        cookies.remove("email");
        // Always print last value for key
        cookies.put("phone","9834636");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.printf("Phone number:  %s \n",cookies.get("phone"));
        System.out.printf("Cookies size:  %s \n",cookies.size());

        // When key foo.containsKey(bar) is false returns null
        System.out.println("Contains 'email' key: " + cookies.containsKey("email") + "\n");

        System.out.println("All cookies: ");
        for(String key : cookies.keySet()) {
            System.out.printf("%s: %s \n", key, cookies.get(key));
        }

    }
}