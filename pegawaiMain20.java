import java.util.Scanner;

public class pegawaiMain20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
            System.out.print("Masukkan jumlah pegawai : ");
            int jmPegawai20 = sc.nextInt();
            System.out.println("==================================");
            for(int i=0; i < jmPegawai20; i++){
                System.out.print("Masukkan NIP Anda : ");
                String nip20 = sc.next();
                System.out.print("Masukkan Nama Anda : ");
                String nama20 = sc.next();
                System.out.print("Masukkan jumlah jam kerja Anda : ");
                int jamKerja20 = sc.nextInt();
                System.out.println("==================================");
                pegawai20 p20 = new pegawai20(nip20,nama20,jamKerja20);
                p20.getJumlahJamKerja();
                p20.getLembur();
                p20.getTransport();
                p20.getuangMakan();
                p20.getgajiPokok();
                p20.getTotalGaji();
                p20.cetakPenghasilan();
            }
        }
    }
}