package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);
        Tunjangan t = new Tunjangan();

        System.out.println("=========== PROGRAM TUNJANGAN ===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp ");
        t.setGajiPokok(s.nextInt());
        System.out.print("Status anda?: (menikah/belum) : ");
        t.hasil(s.next());

    }
}
