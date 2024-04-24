package Lambda;

import java.util.Comparator;

public class Comparatore implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);   // compareTo è un metodo che:
                                    // o1==o2 => 0
                                    //  o2 viene prima di o1 => num neg
                                    //  o1 viene prima di o2 => num pos
    }
}
