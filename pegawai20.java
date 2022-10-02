public class pegawai20 {
    private String nama, nip;
    private double gajiPokok;
    private int jumlahJamKerja;

    pegawai20 (String nip, String nama, int jumlahJamKerja){
        this.nip = nip;
        this.nama = nama;
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setNip (String nip){
        this.nip = nip;
    }
    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public void cetakPenghasilan(){
        System.out.println("Nip Pegawai\t\t : " + getNip());
        System.out.println("Nama Pegawai\t\t : " + getNama());
        System.out.println("Gaji Pokok\t\t : Rp." + getgajiPokok());
        System.out.println("Lembur\t\t\t : " + getLembur());
        System.out.println("Uang Makan\t\t : Rp." + getuangMakan());
        System.out.println("Transport Lembur\t : Rp." + getTransport());
        System.out.println("Total gaji yang diterima : Rp." + getTotalGaji());
        System.out.println("----------------------------------");
        System.out.println(" ");
    }
    public String getNama(){
        return nama;
    }
    public String getNip(){
        return nip;
    }
    public double getgajiPokok(){
        return (double) jumlahJamKerja * 2000;
    }
    public double getLembur(){
        if(jumlahJamKerja > 7 ){
            return (jumlahJamKerja - 7) * (gajiPokok * 1.5);
        } else {
            return 0;
            //System.out.println();
        }
    }
    public double getuangMakan(){
        if(jumlahJamKerja >= 8){
            return gajiPokok + 3500;
        } else {
            return 0;
            //System.out.println();
        }
    }
    public double getTransport(){
        if(jumlahJamKerja >= 9){
            return gajiPokok + 4000;
        } else {
            return 0;
            //System.out.println(transport);
        }
    }
    public int getJumlahJamKerja(){
        return jumlahJamKerja;
    }
    public double getTotalGaji(){
        return getgajiPokok() + getLembur() + getuangMakan() + getTransport();
    }
}
