import java.util.Comparator;

public class MedianaComparator implements Comparator<ForMedianaComparator> {

    int mediana;

    @Override
    public int compare(ForMedianaComparator o1, ForMedianaComparator o2) {
        int med1 = Math.abs(o1.num - mediana);
        int med2 = Math.abs(o2.num - mediana);
        return med1 - med2;
    }
}
