package lokdon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileEncryption {
   public static void main(String[] args){
       String sampleFile="C:\\users\\nahom\\OneDrive\\Desktop\\sample\\input.txt";
       String outFile="C:\\users\\nahom\\OneDrive\\Desktop\\sample\\output.txt";
       String key="12345678_long_key";
       int[] pin={1,2,3,4};
       Scanner scanner=new Scanner(System.in);
       System.out.println("Input File:");
       sampleFile=scanner.nextLine();
       System.out.println("Output File: ");
       outFile=scanner.nextLine();
       try{
           File input=new File(sampleFile);
           File output=new File(outFile);


           if(!output.exists()){
               output.createNewFile();
           }
           encryptFile(input,output,key,pin);
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }

   /*
    * @param password: acts as a public key, the longer the better
    * @param privateKey: acts as a public key, example 4-digit pin, the longer not really the better b/c not directly used
    * @return string: returns a composite key that's used to encrypt/decrypt the requested binary
    */
   public static String getCompositeKey(String password,int[] privateKey,int keySize){
       String composite="";
       int keyLength=keySize/250;
       if(keyLength<1)
           keyLength=1;
       for(int i=0;i<keySize;i++){
           composite+=CipherControl.getInstance().encryptWithKt(password,4,privateKey[i%privateKey.length]);
       }
       return composite;
   }
   public static void encryptFileBasic(File input, File output,String password) throws Exception{
       FileReader f=new FileReader(input);
       FileInputStream fis=new FileInputStream(input);
       byte[] inputBytes=fis.readAllBytes();
       fis.close();
       byte[] encrypted=CipherControl.getInstance().xorWithKey(inputBytes,password.getBytes());
       FileOutputStream fos=new FileOutputStream(output);
       fos.write(encrypted);
   }
   public static void decryptFileBasic(File input,File output,String password) throws Exception{
       FileReader f=new FileReader(input);
       FileInputStream fis=new FileInputStream(input);
       byte[] inputBytes=fis.readAllBytes();
       fis.close();
       byte[] encrypted=CipherControl.getInstance().xorWithKey(inputBytes,password.getBytes());
       FileOutputStream fos=new FileOutputStream(output);
       fos.write(encrypted);
   }

    public static void encryptFile(File input, File output,String password,int[] pin) throws Exception {
        FileReader f=new FileReader(input);
        FileInputStream fis=new FileInputStream(input);
        byte[] inputBytes=fis.readAllBytes();
        fis.close();
        int byteLength=inputBytes.length;
        String cipher=getCompositeKey(password,pin,inputBytes.length);
        byte[] cipherBytes=cipher.getBytes(StandardCharsets.UTF_8);
        byte[] outputBytes=CipherControl.getInstance().xorWithKey(inputBytes,cipherBytes);
        System.out.println("Encryption completed, writing to file");
        FileOutputStream fos=new FileOutputStream(output);
        fos.write(outputBytes);
        System.out.println("Write Complete, file saved to: "+output.getAbsolutePath());
    }
    public static void decryptFile(File input, File output,String password, int[] pin) throws Exception {
        FileReader f=new FileReader(input);
        FileInputStream fis=new FileInputStream(input);
        byte[] inputBytes=fis.readAllBytes();
        fis.close();
        int byteLength=inputBytes.length;
        String cipher=getCompositeKey(password,pin,inputBytes.length);
        byte[] cipherBytes=cipher.getBytes(StandardCharsets.UTF_8);
        byte[] outputBytes=CipherControl.getInstance().xorWithKey(inputBytes,cipherBytes);
        System.out.println("Decryption completed, writing to file");
        FileOutputStream fos=new FileOutputStream(output);
        fos.write(outputBytes);
        System.out.println("Write Complete, file saved to: "+output.getAbsolutePath());
    }
}
