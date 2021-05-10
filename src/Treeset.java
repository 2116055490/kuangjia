import java.util.TreeSet;

/**
 * @author xujinwei
 * @date 2021/5/10 22:03
 */
public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

            set.add("8890");
            set.add("123");
            set.add("李四");
            set.add("张三");
            set.add("ABC");
            set.add("azxcv");
            for (String string : set) {
                System.out.println( string );
            }

    }
}
