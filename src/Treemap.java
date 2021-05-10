import java.util.Map;
import java.util.TreeMap;

/**
 * @author xujinwei
 * @date 2021/5/10 22:31
 */
public class Treemap {
    public static void main(String[] args) {
        TreeMap<String , String> tree = new TreeMap<>();
        tree.put("name","jack");
        tree.put("age","22");
        tree.put("身高","173");
        tree.put("sex","man");
        tree.put("体重","70kg");
        System.out.println("--------------");
        for (Map.Entry<String,String> entry : tree.entrySet()){
            System.out.println(entry);
        }
        System.out.println("--------------");
        System.out.println("firstKey = "+tree.firstKey());
        System.out.println("firstEntry ="+tree.firstEntry());
        System.out.println("lastKey ="+tree.lastKey());
        System.out.println("lastEntry ="+tree.lastEntry());

    }
}
