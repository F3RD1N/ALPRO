import java.util.*;

public class ProcessAName5026211092{
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.print("Namamu siapa: ");
        String nama = scan.nextLine();
        int index = nama.indexOf(' ');
        String satu = nama.substring(index + 1);
        String dua = nama.substring(0,1);


        System.out.println("Namamu adalah: "+satu+", "+dua+".");
    }
}