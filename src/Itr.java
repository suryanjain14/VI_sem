import java.util.ArrayList;
import java.util.Iterator;

public class Itr {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(12);
        b.add(13);
        b.add(45);
        Iterator itr = b.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (Integer obj : b) {
            System.out.println(obj);
        }


    }

}
