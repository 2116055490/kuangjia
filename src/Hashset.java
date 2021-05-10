import java.util.HashSet;

/**
 * @author xujinwei
 * @date 2021/5/10 21:46
 */
public class Hashset {
    public static void main(String[] args) {
        HashSet   set = new HashSet<>();
        set.add(new Object());
        set.add(new Object());
        set.add("hello");
        set.add("hello");
        set.add("你好");
        set.add(123);
        set.add(123);
        set.add("haha");
        set.remove(123);
        set.remove(new Object());
        for (Object object : set){

            System.out.println(object);
        }

    }
}
