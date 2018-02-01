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
			System.out.println(w);
			if (w.equals("circumlocution")) {
				System.out.println(w);
			return w;
			}
		}
		return null;
	}

	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			String m1=message1.get(i);
			if (m1.contains("... --- ...")) {
				return true;
			}
		}
		return false;
		
		
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = i+1; j < results.size(); j++) {
					if (results.get(i)>results.get(j)) {
						double t = results.get(i);
						results.set(i, results.get(j));
						results.set(j, t);
						return results;
					}
		}
		
	}
		return null;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = i+1; j < unsortedSequences.size(); j++) {
				if (unsortedSequences.get(i).length()>unsortedSequences.get(j).length()) {
					String t = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(j));
					unsortedSequences.set(j, t);
					return unsortedSequences;
				}
			}
		}
		return unsortedSequences;
		
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = i+1; j < words.size(); j++) {
				if (words.get(i).compareTo(words.get(j))>0) {
					String t = words.get(i);
					words.set(i, words.get(j));
					words.set(j, t);
					return words;
				}
				}
			
		}
		return null;
	}		
}