package com.radhsyn83;

public class Tunjangan {

    private double gajiPokok;
    private double tunjangan;
    private boolean statusMenikah;

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    private boolean isStatusMenikah(String statusMenikah) {
        if (statusMenikah.equals("menikah"))
            return true;
        else
            return false;
    }

    public void hasil(String statusMenikah) {
        this.statusMenikah = isStatusMenikah(statusMenikah);

        if (this.statusMenikah) {
            this.tunjangan = 0.35*this.gajiPokok;
        } else {
            this.tunjangan = 0.0;
        }

        System.out.println("=========== HASIL PERHITUNGAN ===========");
        System.out.println("Gaji Pokok\t\t\t: Rp " + this.gajiPokok);
        System.out.println("Tunjangan\t\t\t: Rp " + this.tunjangan);
        System.out.println("Total Gaji\t\t\t: Rp " + (this.tunjangan+this.gajiPokok));
    }
}
