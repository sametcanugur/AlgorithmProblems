package Sorular;

public class CharactersinShapes {

	public static void main(String[] args) {
		String[] array = { "###", "###", "###" };
		System.out.println(charactersInShapes(array));
	}

	public static int charactersInShapes(String[] array) {
		String text = "";
		for (int i = 0; i < array.length; i++) {
			text = text + array[i];
		}
		return text.length();
	}
}
