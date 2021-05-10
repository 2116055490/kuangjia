import java.util.LinkedList;

/**
 * @author xujinwei
 * @date 2021/5/10 21:24
 */

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(111);
        //添加相同的数据
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(888);
        //System.out.println(list);

        //将数据添加到list末尾
        list.addLast(111);
        System.out.println(list);

        //将数据添加到list最前面
        list.addFirst(000);
        System.out.println(list);

        for (int i = 0;i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
