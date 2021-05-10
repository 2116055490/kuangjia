import java.util.HashMap;
import java.util.Map;

/**
 * @author xujinwei
 * @date 2021/5/10 22:19
 */
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> set = new HashMap<>();
        set.put("name","张三");
        set.put("height","178cm");
        set.put("weight","60kg");
        for (Map.Entry<String,String> info : set.entrySet()){
            System.out.println(info);
        }
    }
}
