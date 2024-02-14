//ODEV:SENTENCE==NULL I ALTTAKIYLE TEK CONDITIONDA YAZMALISIN.

package Sorular;

public class HotPicsofDannyDeVito {

	public static void main(String[] args) {
		System.out.println(checkWordInSentenceOrNot(null));
	}

	public static String checkWordInSentenceOrNot(String sentence) {
		if (sentence == null) {
			return "Safe watching!";
		}
		if (sentence.length() == 0) {
			return "Safe watching!";
		}
		String array[] = sentence.split(" ");
		String forbiddenWords[] = { "anime", "meme", "vines", "roasts", "Danny DeVito" };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < forbiddenWords.length; j++) {
				if (forbiddenWords[j].equals(array[i])) {
					return "NO!";
				}
			}
		}
		return "Safe watching!";
	}
}
