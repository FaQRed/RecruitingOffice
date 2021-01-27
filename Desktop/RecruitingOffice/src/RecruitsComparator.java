import java.util.Comparator;

public class RecruitsComparator implements Comparator <Recruit> {
    @Override
    public int compare(Recruit o1, Recruit o2) {
        return o1.getMiddleName().compareTo(o2.getMiddleName());
    }
}
