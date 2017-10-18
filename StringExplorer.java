/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
import java.lang.String;
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("1sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("2sample.toLowerCase() = " + lowerCase);
		System.out.println ("3After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
                int notForPsn = sample.indexOf("slow");
                System.out.println("4sample.indexOf(\"slow\") = " + notForPsn);
                
                int Psn = sample.indexOf("hi");
                
	}

}
