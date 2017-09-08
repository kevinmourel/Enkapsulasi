package Praktikum;

public class UjiBola {
        public static void main(String[] args){
        Bola bola = new Bola();
        bola.setjarijari(14);
        bola.showDiameter();
        bola.showLuasPermukaan();
        System.out.println("Volume Bola yaitu "+ bola.showVolume());
        
        bola.setjarijari(21);
        bola.showDiameter();
        bola.showLuasPermukaan();
        System.out.println("Volume Bola yaitu "+ bola.showVolume());
    
       
    }
}
