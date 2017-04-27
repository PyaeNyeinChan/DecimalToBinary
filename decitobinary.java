import java.util.*;
class DecToBin{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Decimal Number : ");
    int num = scan.nextInt();
    System.out.print("Binary Number is : ");
	toBinary(num);
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
}
//Code by PyaeNyeinChan(MetroB)