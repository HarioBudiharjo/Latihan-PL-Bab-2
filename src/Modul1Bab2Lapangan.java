package modul1bab2lapangan;

import java.util.Scanner;

public class Modul1Bab2Lapangan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan jumlah Mahasiswa :");
        int jumlah_mahasiswa = in.nextInt();
        Mahasiswa[] ms = new Mahasiswa[jumlah_mahasiswa];
        System.out.println("Masukan panjang lapangan :");
        double panjang = in.nextDouble();
        System.out.println("Masukan lebar lapangan:");
        double lebar = in.nextDouble();
        System.out.println("--------------------------------");
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.println("Masukan NIM :");
            long NIM = in.nextLong();
            System.out.println("Masukan Nama :");
            String nama = in.next();
            System.out.println("Masukan jumlah Putaran :");
            double putaran = in.nextDouble();
            System.out.println("Masukan jumlah Waktu :");
            double waktu = in.nextDouble();
            ms[i] = new Mahasiswa(NIM, nama, putaran, waktu, panjang, lebar);
            System.out.println("--------------------------------");
        }
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.println("Nama:" + ms[i].getNama());
            System.out.println("Jarak tempuh :" + ms[i].getJarak());
            System.out.println("--------------------------------");
        }
        double max = 0;
        String nama = "";
        for (int i = 0; i < jumlah_mahasiswa; i++) {

            if (ms[i].getKecepatan() > max) {
                max = ms[i].getKecepatan();
                nama = ms[i].getNama();
            }

        }

        System.out.println("--------------------------------");
        System.out.println("Orang tercepat adalah :" + nama);
        System.out.println("--------------------------------");
    }

}
