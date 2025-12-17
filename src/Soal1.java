import java.util.*;
import java.lang.Math;

public class Soal1{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, val, total, maxVal, minVal, count4;
        double avg;
        int[] ratings = new int[20];

        System.out.println("Masukkan Jumlah Reviewer (Maks 20):");
        n = Integer.parseInt(input.nextLine());
        if (n > 20) {
            System.out.println("Error: Maksimal 20 reviewer!");
        } else {
            total = 0;
            maxVal = -1;
            minVal = 6;
            count4 = 0;
            for (i = 0; i <= n - 1; i++) {
                val = getValidRating();
                ratings[i] = val;
                total = total + val;
                if (val > maxVal) {
                    maxVal = val;
                }
                if (val < minVal) {
                    minVal = val;
                }
                if (val >= 4) {
                    count4 = count4 + 1;
                }
            }
            avg = (double) total / n;
            System.out.println("Rata-rata: " + avg);
            System.out.println("Tertinggi: " + maxVal);
            System.out.println("Terendah: " + minVal);
            System.out.println("Rating >= 4: " + count4 + " orang");
            if (avg < 3) {
                System.out.println("Kantin perlu evaluasi manajemen!");
            } else {
                if (avg < 4) {
                    System.out.println("Kondisi cukup, masih perlu peningkatan.");
                } else {
                    System.out.println("Kantin dalam kondisi baik.");
                }
            }
        }
    }
    
    public static int getValidRating() {
        int rate;
        boolean valid;

        valid = false;
        while (valid == false) {
            System.out.println("Masukkan Rating (1-5):");
            rate = Integer.parseInt(input.nextLine());
            if (rate >= 1 && rate <= 5) {
                valid = true;
            } else {
                System.out.println("INVALID: Input harus 1-5");
            }
        }
        
        return rate;
    }
}
