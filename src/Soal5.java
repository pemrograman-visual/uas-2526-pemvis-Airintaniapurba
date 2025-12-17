import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int i;
        String nama;
        double ipk;
        int gaji;
        int semester;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            ipk = Double.parseDouble(input.nextLine());
            gaji = Integer.parseInt(input.nextLine());
            semester = Integer.parseInt(input.nextLine());
            if (ipk >= 3.0 && semester >= 3 && gaji <= 3000000) {
                System.out.println(nama + " -> Lolos Syarat Awal");
            } else {
                System.out.println(nama + " -> Tidak Lolos");
            }
        }
    }
}
