import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Home_6 {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();
        System.out.println(hs + " - HashSet (hs)\n" + lhs + " - LinkedHashSet (lhs)\n" + ts + " - TreeSet (ts)");
        hs.addAll(rndmList(5));
        lhs.addAll(rndmList(5));
        ts.addAll(rndmList(5));
        System.out.println("hs: " + hs + "\nlhs: " + lhs + "\nts: " + ts);
        System.out.println("hs: " + removeElementSet(hs, lhs));
        System.out.println("lhs: " + addElementSet(lhs, ts));
        Set<Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return int1 == int2 ? 0 : int2 % 2 == 0 ? -1 : 1;
            }
        });
        ts1.addAll(rndmList(15));
        System.out.println("ts1: " + ts1 + "\n");
    }

    
    private static List<Integer> rndmList(int sizeList) {
        List<Integer> rndList = new ArrayList<>();
        while (rndList.size() < sizeList) {
            rndList.add((int) (Math.random() * 100));
        }
        return rndList;
    }

    
    private static Set<Integer> removeElementSet(Set<Integer> hs, Set<Integer> lhs) {
        hs.removeAll(lhs);
        return hs;
    }

    
    private static Set<Integer> addElementSet(Set<Integer> lhs, Set<Integer> ts) {
        lhs.addAll(ts);
        return lhs;
    }
}
