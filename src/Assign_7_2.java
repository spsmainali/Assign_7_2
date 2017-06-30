import java.util.Scanner;
 
class Assign_7_2
{
   public static void main(String args[])
   {
      String string, sub,subString ;
      int i, c, length,check=0; // initialize check variable with 0 if it if condition goes true it will changed to 1
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to print it's all substrings");
      string  = in.nextLine();
      length = string.length(); 
      System.out.println("Enter the substring to search");
      subString = in.nextLine();
// loop for checking all the possible sub string with entered string
      for( c = 0 ; c < length ; c++ )
      {
         for( i = 1 ; i <= length - c ; i++ )
         {
            sub = string.substring(c, c+i);
           
           if(sub.equals(subString)){// Checking the availability by comparing the substring with main string using function equals.
        	   check=1;
        	   break;
           }      	   
         }
      }
      if(check==1){ //Providing output on the basis of value of check variable check
    	  System.out.println("SubString Found!");
      }
      else{
    	  System.out.println("SubString Not Found!");
      }
   }

}