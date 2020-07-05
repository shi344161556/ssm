import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("name","lisi");
//        Set<String> set = map.keySet();
//        for (String key:set){
//            String o = map.get(key);
//            System.out.println(o);
//        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +"  "+value);
        }

    }
}
