
/**
 * Write a description of class messinground here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class messinground
{
    public static void main(String[]args){
    String str = "Hi there!";
    
    int endPosition = str.indexOf(' ');
    if (endPosition == -1)
       endPosition = str.length();
    
       
       String word = str.substring(0, endPosition);
       
       System.out.println(endPosition);
       System.out.println(word);
}
}
