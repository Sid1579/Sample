import java.rmi.*;

public class server{

public static void main(String[] args){
try{

ServerImpl si=new ServerImpl();
Naming.rebind("server", si);
System.out.println("Server Started..");
}
catch(Exception e){
System.out.println("Exception Found: "+e.getMessage());
}
}}