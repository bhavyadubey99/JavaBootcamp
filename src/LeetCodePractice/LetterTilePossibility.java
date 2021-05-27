package LeetCodePractice;

public class LetterTilePossibility {
	
	static int count;

	public static void main(String[] args) {

		countFreq("MO");
		
		System.out.println(count - 1);

	}

	public static void countFreq(String tiles) {

		int[] freq = new int[26];

		for (int i = 0; i < tiles.length(); i++) {

			char ch = tiles.charAt(i);
			freq[ch - 'A']++;
		}
		
		count = 0;

		letterTilePoss(freq, "");
	}

	public static void letterTilePoss(int[] freq, String ans) {

//		System.out.println(ans);
		count++;

		for (int i = 0; i < freq.length; i++) {

			if (freq[i] > 0) {

				freq[i]--;
				letterTilePoss(freq, ans + (char) (i + 'A'));
				freq[i]++;
			}
		}

	}

}
