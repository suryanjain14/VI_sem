import java.util.ArrayList;
import java.util.Iterator;

public class mycoll {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList();
        obj.add("asd");
        obj.add("dsf");
        obj.add("ghi");
        obj.add("fre");

        Iterator itr = obj.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        itr = obj.listIterator(0);
        System.out.println(itr.next());
    }
}
