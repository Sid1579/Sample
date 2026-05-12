
import java.rmi.*;
import java.util.*;

public class client{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);


try{


String serverURL="rmi://localhost/server";

ServerIntf si1=(ServerIntf)Naming.lookup(serverURL);

System.out.println("Enter No 1: ");
int num1=sc.nextInt();

System.out.println("Enter No 2: ");
int num2=sc.nextInt();

System.out.println("Numbers Are: "+num1+" "+num2);
System.out.println("Result: ");

System.out.println("Addition: "+si1.addition(num1,num2));
System.out.println("Substraction: "+si1.substraction(num1,num2));
System.out.println("Multiplication: "+si1.multiplication(num1,num2));
System.out.println("Division: "+si1.division(num1,num2));

}
catch(Exception e){
System.out.println("Exception Found: "+e.getMessage());
}
}}