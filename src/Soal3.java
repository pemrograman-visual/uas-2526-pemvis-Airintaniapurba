//Airin Tania-12S25046
//Boas Hutahean-12S25005
import java.util.*;
import java.lang.Math;

public class Soal3{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jmlPenghuni, i, j, jmlPerangkat, watt, totalPribadi, totalKamar;
        String nama;

        System.out.println("Masukkan Jumlah Penghuni:");
        jmlPenghuni = Integer.parseInt(input.nextLine());
        totalKamar = 0;
        for (i = 1; i <= jmlPenghuni; i++) {
            System.out.println("Nama Penghuni ke-" + i + ":");
            nama = input.nextLine();
            System.out.println("Jumlah Perangkat (Max 10):");
            jmlPerangkat = Integer.parseInt(input.nextLine());
            totalPribadi = 0;
            for (j = 1; j <= jmlPerangkat; j++) {
                watt = getValidWatt(j);
                totalPribadi = totalPribadi + watt;
            }
            System.out.println(nama + " = " + totalPribadi + " wh");
            totalKamar = totalKamar + totalPribadi;
        }
        System.out.println("---------------------------------");
        System.out.println("Total konsumsi kamar = " + totalKamar + " wh");
        checkSafety(totalKamar);
    }
    
    public static void checkSafety(int total) {
        if (total > 10000) {
            System.out.println("PERINGATAN: Konsumsi melebihi batas (10.000 wh)!");
        } else {
            System.out.println("Konsumsi masih dalam batas wajar.");
        }
    }
    
    public static int getValidWatt(int urutan) {
        int w;
        boolean valid;

        valid = false;
        while (valid == false) {
            System.out.println("Masukkan konsumsi (wh) perangkat ke-" + urutan + ":");
            w = Integer.parseInt(input.nextLine());
            if (w >= 0) {
                valid = true;
            } else {
                System.out.println("INVALID: Konsumsi tidak boleh negatif!");
            }
        }
        
        return w;
    }
}
