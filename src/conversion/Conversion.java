
package conversion;
import java.util.Scanner;

public class Conversion {
    
    //Conversion to Binary method,...
    
public String toBinary(int n) {
       
if (n == 0) {
return "0";
}
String binary = ""; // declared or created a binary variable 
while (n > 0) { // do below provided n is greater than 0
int rem = n % 2; // assigns the modulus division in rem variable...
 //line 17 simply means "save" the remainder of n/2 in rem variable...
binary = rem + binary;
n = n / 2;
        }
return binary; //a method with arguments must return a value. 
        }  
    
    
    // Decimal to octal conversion method 

 int num;
   //this method gets input from users and stores it
    //in the instance num variable...
void getVal() {
System.out.println("Decimal to Octal selected");
Scanner input = new Scanner(System.in);

System.out.println("\nEnter Decimal number :");
num = Integer.parseInt(input.nextLine());
}

  //converts the users input to octal 
void convert() {
String octal = Integer.toOctalString(num);
System.out.println("Octal Value is : " + octal);
}
   
 //program execution method Main()
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Conversion options\nEnter 1 for Decimal to BInary"
        + "\nEnter 2 for Decimal to Octal\n");
      
        int selection =in.nextInt();
        
    if (selection==1){
    System.out.println("Decimal to Binary selected");
    System.out.println("Please enter the decimal no");
            int decimal = in.nextInt();
            
     /*below creates an object that calls the toBInary method
            and resolves it in the binary variable*/
         Conversion dtb = new Conversion();
         String binary = dtb.toBinary(decimal);
          
System.out.println("The binary value is " + binary);
        }
        
        else if(selection==2){
            Conversion obj = new Conversion();

obj.getVal();
obj.convert();
        }
        
    }

}




