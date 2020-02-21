import java.util.HashMap;
import java.util.Map;

public class mymap {

    public static void main(String[] args) {
        Map<String, Integer> obj = new HashMap<>();
        obj.put("hello", 01);
        obj.put("asd", 123);
        obj.put("asd1", 1123);
        obj.put("asd2", 1223);
        obj.put("asd3", 1233);
        System.out.println(obj.get("asd"));
        System.out.println(obj.get("dsa"));
        Integer a = obj.get("asd");
        System.out.println(a);

    }
}
