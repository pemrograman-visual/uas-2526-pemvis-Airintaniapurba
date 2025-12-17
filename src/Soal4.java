//Airin Tania-12S25046
//Boas Hutahaean-12S25005

import java.util.*;
import java.lang.Math;

public class Soal4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totalShift, maxShift, minShift, tempShift;
        double avg;
        String[] names = new String[8];
        int[] shifts = new int[8];
        String maxName, minName;

        System.out.println("Masukkan Jumlah Asisten (Maks 8):");
        n = Integer.parseInt(input.nextLine());
        if (n > 8) {
            System.out.println("Error: Maksimal 8 asisten!");
        } else {
            totalShift = 0;
            maxShift = -1;
            minShift = 8;
            maxName = "";
            minName = "";
            for (i = 0; i <= n - 1; i++) {
                System.out.println("Nama Asisten ke-" + i + 1 + ":");
                names[i] = input.nextLine();
                tempShift = getValidShift();
                shifts[i] = tempShift;
                totalShift = totalShift + tempShift;
                if (tempShift > maxShift) {
                    maxShift = tempShift;
                    maxName = names[i];
                }
                if (tempShift < minShift) {
                    minShift = tempShift;
                    minName = names[i];
                }
            }
            avg = (double) totalShift / n;
            System.out.println("-----------------------");
            System.out.println("Daftar Shift:");
            for (i = 0; i <= n - 1; i++) {
                System.out.println(names[i] + " = " + shifts[i]);
            }
            System.out.println("-----------------------");
            System.out.println("Total Shift = " + totalShift);
            System.out.println("Rata-rata = " + avg);
            System.out.println("Shift Terbanyak: " + maxName + " (" + maxShift + ")");
            System.out.println("Shift Tersedikit: " + minName + " (" + minShift + ")");
            if (avg < 3) {
                System.out.println("Distribusi shift tidak merata, beberapa asisten terbebani.");
            } else {
                if (avg >= 5) {
                    System.out.println("Shift terlalu padat.");
                } else {
                    System.out.println("Distribusi shift normal.");
                }
            }
        }
    }
    
    public static int getValidShift() {
        int s;
        boolean valid;

        valid = false;
        while (valid == false) {
            System.out.println("Masukkan Jumlah Shift (0-7):");
            s = Integer.parseInt(input.nextLine());
            if (s >= 0 && s <= 7) {
                valid = true;
            } else {
                System.out.println("INVALID: Shift harus 0 sampai 7!");
            }
        }
        
        return s;
    }
}
