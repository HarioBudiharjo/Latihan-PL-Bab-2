package modul1bab2lapangan;

public class Mahasiswa {
    private long NIM;
    private String nama_mahasiswa;
    private double jumlahPutaran, jumlah_waktu,jarak_tempuh,keliling_lapangan,kecepatan;
    Mahasiswa(long nim,String nama,double putaran,double waktu,double panjang,double lebar){
        this.NIM=nim;
        this.nama_mahasiswa=nama;
        this.jumlahPutaran=putaran;
        this.jumlah_waktu=waktu;
        this.keliling_lapangan=(panjang+lebar)*2;
    }
    public double getJarak(){
        this.jarak_tempuh=keliling_lapangan*this.jumlahPutaran;
        return this.jarak_tempuh;
    }
    public String getNama(){
        return this.nama_mahasiswa;
    }
    public double getKecepatan(){
        this.kecepatan=jarak_tempuh/jumlah_waktu;
        return this.kecepatan;
    }
}
