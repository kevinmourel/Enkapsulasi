package latihan3;

public class TestSiswa {
   public static void main(String args[]){
   EncapSiswa siswa = new EncapSiswa();
   siswa.setName("Kevin Mourel Praditya");
   siswa.setAbsen(20);
   siswa.setAddress("Blitar");
   
   System.out.print("Name : "+siswa.getName()
   +" Absen : "+siswa.getAbsen()
   +" Address : "+siswa.getAddress());
  }
}