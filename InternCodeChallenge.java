package CodeBin;

public class InternCodeChallenge {

	public String firstNonRepeated(String s) {
		String nonRepeatedCharacter = "";
		int indexCompared = -1;
		
		for (int i=0;i< s.length();i++) {
			if (i != indexCompared && i != s.length()-1) {
				indexCompared=i+1;
				if (s.charAt(i) != s.charAt(i+1)) {
					nonRepeatedCharacter=s.substring(i,i+1);
					break;
				}
			// accounts for edge case where a non repeated character
			// is detected at the last character of the string due to
			// being the final letter
			}else if(i!= indexCompared && i == s.length()-1) {
				nonRepeatedCharacter=s.substring(i);
			}
		}
		
		return nonRepeatedCharacter;
	}

}
