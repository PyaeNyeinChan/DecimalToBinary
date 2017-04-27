import java.util.*;
class BinaryNumDemo{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Decimal Number : ");
    int num = scan.nextInt();
	System.out.print("Binary Number is : ");
	toBinary(num);
	System.out.println("");
	System.out.print("Octal Number is : ");
	toOctal(num);
  }
  public static String toBinary(int n){
  if (n == 0){
	return "";
  } else{
    String output = n % 2 + "";
    System.out.print(output + toBinary(n/2)+" ");
    return "";
  }
  }
  
  public static String toOctal(int n){
	  if (n == 0){
		  return "";
	  } else{
		  String output = n%8 + "";
		  System.out.print(output + toOctal(n/8)+"");
		  return "";
	  }
  }
}
//Code by PyaeNyeinChan(MetroB)