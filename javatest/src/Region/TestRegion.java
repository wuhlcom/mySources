package region;
import java.util.ArrayList;
import java.util.List;

public class TestRegion {
	public static void main(String[] args){
		check();
	}
	
	private static void check(){
		// AyPoint p = new AyPoint(117.18137,39.13884);
		// List<AyPoint> apl = new ArrayList<AyPoint>();
		// //117.18137,39.13884,117.18568,39.13874,117.18560,39.13709,117.18139,39.13724
		// apl.add(new AyPoint(117.18137,39.13884));
		// apl.add(new AyPoint(117.18568,39.13874));
		// apl.add(new AyPoint(117.18560,39.13709));
		// apl.add(new AyPoint(117.18139,39.13724));
		// //apl.add(new AyPoint(117.1171,39.392));
		// boolean b = AnalysisPointAndRegion.judgeMeetPoint(p, apl);
		// String isIn = b?"��":"��";
		// System.out.println("����Χ��  " + isIn);

		AyPoint p1 = new AyPoint(1.4,1.5);
		List<AyPoint> apl1 = new ArrayList<AyPoint>();
		apl1.add(new AyPoint(1,1));
		apl1.add(new AyPoint(1,2));
		apl1.add(new AyPoint(2,1));
        apl1.add(new AyPoint(2,2));

		boolean b1= AnalysisPointAndRegion.judgeMeetPoint(p1,apl1);
        String isIn1 = b1?"��":"��";
        System.out.println("����Χ��  " + isIn1);

    }
}
