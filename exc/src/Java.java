import java.io.*;

//class JavaExceptionExample{

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
//    public static void example() {
//        FileReader fr = null;
//        File file = new File("C:\\Users\\Marija Miloshevska\\Downloads\\OPTs\\living_situations.en");
//        fr = new FileReader(file); char [] a = new char[50];
//        fr.read(a);   // reads the content to the array
//        for(char c : a)
//            System.out.print(c);   // prints the characters one by one
//        fr.close();
//    }

    //checked exception will be thrown
    /*public static void example() {
        File file = new File("E://file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        example();
    }*/


//}

class JavaExceptionExample {
    public static void main(String[] args) {

        try {
            int data = 3 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("continue...");

    }
}