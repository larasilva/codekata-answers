//Counts vowels in a String

public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    // your code here
    
    vowelsCount = str.length() - str.replaceAll("a|e|i|o|u|", "").length();
    return vowelsCount;
  }

}