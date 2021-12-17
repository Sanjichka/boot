import java.io.*;
import java.util.Scanner;

class JavaExceptionExample{

    //Unchecked exception AritmethicException
//    public static void example() {
//        int data=100/0;
//        System.out.println("rest of the code...");
//    }

    //handling unchecked exception
//    public static void example() {
//        try{
//            int data=100/0;
//        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("rest of the code...");
//    }

    //unchecked exception NullPointerException
//    public static void example() {
//        String s=null;
//        System.out.println(s.length());
//    }

    //Unchecked exception ArrayIndexOutOfBoundsException
//    public static void example() {
//        try {
//            int a[] = new int[2];
//            System.out.println("Access element three :" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown  :" + e);
//        }
//        System.out.println("Out of the block");
//    }

    //try...catch...finally
//    public static void example() {
//        int a[] = new int[2];
//        try {
//            System.out.println("Access element three :" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown  :" + e);
//            return;
//        } finally {
//            a[0] = 6;
//            System.out.println("First element value: " + a[0]);
//            System.out.println("The finally statement is executed");
//        }
//    }

    //Fix this code so the application can run normally
    public static void example(){
        FileReader fr = null;
        File file = new File("C:\\Users\\Marija Miloshevska\\Downloads\\OPTs\\living_situations.en");
        try{
            fr = new FileReader(file);
        }
        catch(FileNotFoundException e) {
            System.out.println(e);
        }
        char [] a = new char[50];
        try{
            fr.read(a);   // reads the content to the array
        }
        catch(IOException e1){
            System.out.println(e1);
        }
        for(char c : a)
            System.out.print(c);   // prints the characters one by one
        try{
            fr.close();
        }
        catch(IOException e1){
            System.out.println(e1);
        }
    }

    //checked exception will be thrown
    /*public static void example1() {
        File file = new File("E://file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
        example1();
    }*/

    /*public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("continue...");
    }*/
    public static void main(String args[]) {

            try{
                throw new CustomExc("MSG...");
            }
            catch(CustomExc e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }

    }

}
