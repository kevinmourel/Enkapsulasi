package Latihan2;

public class UjiBus1 {
public static void main(String []arg){
    Bus busBesar = new Bus(40);
    busBesar.cetak();
    
    busBesar.addpenumpang(15);
    busBesar.cetak();
    
    busBesar.addpenumpang(5);
    busBesar.cetak();
    
    busBesar.addpenumpang(26);
    busBesar.cetak();
}
}

