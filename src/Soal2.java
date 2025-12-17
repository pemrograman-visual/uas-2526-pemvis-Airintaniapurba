import java.util.*;
import java.lang.Math;

public class Soal2{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;
        String[] nama = new String[10];
        int[] stokAwal = new int[10];
        int[] terjual = new int[10];
        int[] sisa = new int[10];
        String[] status = new String[10];

        System.out.println("Jumlah Barang (Max 10):");
        n = Integer.parseInt(input.nextLine());
        if (n > 10) {
            System.out.println("Max 10 barang!");
        } else {
            for (i = 0; i <= n - 1; i++) {
                System.out.println("Nama Barang " + i + 1 + ":");
                nama[i] = input.nextLine();
                stokAwal[i] = getValidStock();
                terjual[i] = getValidSold(stokAwal[i]);
                sisa[i] = stokAwal[i] - terjual[i];
                status[i] = getStatus(sisa[i]);
            }
            System.out.println("Nama | Awal | Jual | Sisa | Status");
            for (i = 0; i <= n - 1; i++) {
                System.out.println(nama[i] + " | " + stokAwal[i] + " | " + terjual[i] + " | " + sisa[i] + " | " + status[i]);
            }
        }
    }
    
    public static String getStatus(int s) {
        String res;

        if (s == 0) {
            res = "Habis, segera restock!";
        } else {
            if (s < 5) {
                res = "Stok menipis.";
            } else {
                res = "Stok aman.";
            }
        }
        
        return res;
    }
    
    public static int getValidSold(int maxS) {
        int j;
        boolean ok;

        ok = false;
        while (ok == false) {
            System.out.println("Jumlah Terjual (Max " + maxS + "):");
            j = Integer.parseInt(input.nextLine());
            if (j >= 0 && j <= maxS) {
                ok = true;
            } else {
                System.out.println("INVALID!");
            }
        }
        
        return j;
    }
    
    public static int getValidStock() {
        int s;
        boolean ok;

        ok = false;
        while (ok == false) {
            System.out.println("Stok Awal (>=0):");
            s = Integer.parseInt(input.nextLine());
            if (s >= 0) {
                ok = true;
            } else {
                System.out.println("INVALID!");
            }
        }
        
        return s;
    }
}
