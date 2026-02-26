package projectdavid;

public class MyClass {

	public static void main(String[] args){
		
		String word = "";
		
		for (int i = 0; i < 10; i++) {
			char randomLetter = (char) ('a' + (int)(Math.random() * 26));
			word += randomLetter;
		}
		System.out.println("Word 1: " + word);
		
		for (int count = 2; count <= 20; count++) {
			int randomIndex = (int) (Math.random() *10);
			char newLetter = (char) ('a' + (int) (Math.random() *26));
			char[] letters = word.toCharArray();
			letters[randomIndex] = newLetter;
			
			word = new String(letters);
			
			System.out.println("Word " + count + ": " + word);
		}
	}
}

