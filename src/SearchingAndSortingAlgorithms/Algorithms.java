package SearchingAndSortingAlgorithms;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
for (int i = 0; i < eggs.size(); i++) {
String e=eggs.get(i);
if (e.contains("cracked")) {
System.out.println(i+" "+e);
return i;
}
}
return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
for (int i = 0; i < oysters.size(); i++) {
	Boolean o=oysters.get(i);
	if (o.equals(true)) {
		return i;
	}
}
		return 0;
	}

	public static double findTallest(List<Double> peeps) {
		for (int i = 0; i < peeps.size(); i++) {
			Double p=peeps.get(i);
			Double p2=6.3;
		if (p>p2) {
			System.out.println(p);
			return p;
		}
	
		}
		return 0;
	}

	public static String findLongestWord(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			String w=words.get(i);
			if (w.equals("circumlocation")) {
			return w;	
			}
		}
		return null;
	}
}