import java.util.Scanner;

public class StudiKasus220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,jenisKegiatan;
        int jumlDokumen,peringkat,syaratDokumen;
        

        System.out.println("Nama mahasiswa : ");
        nama=sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya) : ");
        jenisKegiatan=sc.nextLine();
        System.out.println("Jumlah dokumen yang diupload (0-4) : ");
        jumlDokumen=sc.nextInt();
         boolean status;
          if (jumlDokumen == 4) {
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.println("Peringkat juara (1/2/3, isi 0 jika bukan juara) : ");
            peringkat=sc.nextInt();
             
            if (peringkat >= 1 && peringkat <= 3) {
               
                    System.out.println("Mendapatkan dana penghargaan ");
                    System.out.println("Seluruh dokumen lengkap ");
                } else {
                    System.out.println("Tidak mendapatkan penghargaan ");
                    System.out.println("Dokumen belum lengkap ");
                }
            } else {
                if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                    System.out.println("Apakah anda lolos pendanaan? (true/false) : ");
                    status=sc.nextBoolean();
                    if (status==true) {
                        System.out.println("Status : pendanaan diberikan");
                    } else {
                        System.out.println("Status : Pendanaan tidak diberikan");
                    }
                } else {
                    System.out.println("Maaf,anda mengikuti kegiatan lain ");
                }
                
            }
        } else {
            syaratDokumen = 4- jumlDokumen;
            System.out.println("maaf,jumlah dokumen anda kurang " + syaratDokumen);
        }
    }
}