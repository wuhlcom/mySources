package kata;

import java.util.ArrayList;
import java.util.List;

// Rectangle into Squares
public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer>  result = new ArrayList<>();
        if (lng == wdth)
            return null;
        else {
            rec(lng,wdth,result);
            return result;
        }
    }

    public static void rec(int lng,int wdth,List<Integer> result) {
        if (lng != wdth) {
            int max = Math.max(lng, wdth);
            int min = Math.min(lng, wdth);
            int div = max / min;
            for (int i = div; i >= 1; i--) {
                result.add(min);
            }
            int mod = max % min;
            if (mod > 0) {
                rec(mod, min, result);
            }
        }
    }


}
