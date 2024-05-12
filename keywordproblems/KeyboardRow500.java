package keywordproblems;

public class KeyboardRow500 {

	public static void main(String[] args) {

		String words[] = { "hello", "alaska", "dad", "peace", "zz" };
		String s1 = "asdfghjkl";
		String error = "zxcvbnmqwertyuiop";
		char[] s2 = s1.toCharArray();
		char[] error2 = error.toCharArray();

		String result[] = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			char[] c = words[i].toCharArray();
			String out = "---";

			boolean foundInS2 = false;

			for (int j = 0; j < c.length; j++) {

				for (int k = 0; k < s2.length; k++) {
					if (c[j] == s2[k]) {
						foundInS2 = true;
					}

					if (foundInS2) {
						for (int m = 0; m < error2.length; m++) {
							if (c[j] == error2[m]) {
								out = null;
								break;
							}
							out = words[i];

						}
					}

				}
				
				
				
				
				
				
				
				
				
				
				
				result[i] = out;
			} // j

		}

		for (int i = 0; i < result.length; i++) {

			System.out.println(result[i]);

		}
	}
}