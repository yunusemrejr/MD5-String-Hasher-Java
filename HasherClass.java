import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HasherClass{
    public static void main(String[] args){
        System.out.println("Enter a string to be hashed with MD5: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Your input after MD5 hashing: ");
      System.out.println(HashIt(userInput));
    }
    public static String HashIt(String pass){
        try{
            MessageDigest msgDigest= MessageDigest.getInstance("MD5");
            msgDigest.update(pass.getBytes());
            byte[] resultBArray= msgDigest.digest();
            StringBuilder sbuilder = new StringBuilder();
            for(byte b:resultBArray){
                sbuilder.append(String.format("%02x",b));
            }
            return sbuilder.toString();
        }
        catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return "string";
    }
}




