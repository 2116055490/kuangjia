import java.util.ArrayList;
import java.util.List;

/**
 * @author xujinwei
 * @date 2021/5/10 15:29
 */
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //添加数据
        list.add(123);
        list.add(456);
        //System.out.println(list);

        //替换数据
        list.set(1,111);
        //System.out.println(list);

        //将list中的所有数据放到list2中
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        //System.out.println(list2);

        //循环list2中的所有数据
        for (Integer integer : list2){
            System.out.println(integer);

            //删除循环出的对象
            list2.remove(integer);


        }
        //list集合是否有数据
        if (!list.isEmpty()){
            System.out.println(list);
            System.out.println("list.size="+list.size());

            //清空
            list.clear();
        }
        //清空list后，查看list中的数据
        System.out.println("list.size="+list.size());
    }
}
