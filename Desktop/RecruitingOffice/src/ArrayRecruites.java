import java.util.Arrays;
import java.util.Comparator;

public class ArrayRecruites {
    private Recruit[] recruites = new Recruit[0];

    public int size() {
        return recruites.length;
    }

    public Recruit get(int index) {
        try {
            return recruites[index];
        } catch (IndexOutOfBoundsException e) {
             System.out.println("Неправильно введен индекс " + e);
             return null;
        }
    }

    public void set(int index, Recruit recruit) {
        try {
            recruites[index] = recruit;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Неправильно введен индекс " + e);
        }
    }

    public void add(Recruit recruit) {
        Recruit[] recruitsBuf = Arrays.copyOf(recruites, recruites.length + 1);
        recruitsBuf[recruitsBuf.length - 1] = recruit;
        recruites = Arrays.copyOf(recruitsBuf, recruitsBuf.length);
    }

    public void sort(Comparator<Recruit> comparator) {
        Arrays.sort(recruites, comparator);
    }
}
