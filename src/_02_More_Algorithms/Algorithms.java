package _02_More_Algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int a = 0; a < eggs.size(); a++) {
			if(eggs.get(a).equals("cracked")) {
				return a;
			}
		}
		return -1;
		
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls = 0;
		for(int a = 0; a < oysters.size(); a++) {
			if(oysters.get(a) == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double tallest = 0.0;
		for(int a = 0; a < peeps.size(); a++) {
			if(peeps.get(a) > tallest) {
				tallest = peeps.get(a);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String longestWord = "";
		for(int a = 0; a < words.size(); a++) {
			if(words.get(a).length() > longestWord.length()) {
				longestWord = words.get(a);
			}
		}
		return longestWord;
	}

	public static Boolean containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for(int a = 0; a < message1.size(); a++) {
			if(message1.get(a).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		Collections.sort(results);
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		Collections.sort(unsortedSequences, Comparator.comparing(String::length));
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		Collections.sort(words);
		return words;
	}
}
