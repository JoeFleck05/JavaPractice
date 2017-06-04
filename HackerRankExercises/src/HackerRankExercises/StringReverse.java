package HackerRankExercises;

//Given a string , A print Yes if it is a palindrome, print No otherwise.
//
//Constraints
//
//A will consist at most  lower case english letters.
//Sample Input
//
//madam
//Sample Output
//
//Yes

public class StringReverse {

  public static String reverseString(String A) {
      
      String returnStr = null;
      
      if(A.length() <= 100) {
          String revisedString = new StringBuilder(A).reverse().toString();
          if(revisedString.matches(A)) {
              returnStr = "Yes";
          } else {
              returnStr = "No";
          }
      }
      return returnStr;
  }
}
