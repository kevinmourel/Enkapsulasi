package Praktikum;

public class Bola {
  double jarijari;
        public void setjarijari(double jarijari){
            this.jarijari = jarijari;
        }
        public void showDiameter(){
            System.out.println("Besarnya diameter yaitu " + this.jarijari * 2);
        }
        public void showLuasPermukaan(){
            System.out.println("Luas Permukaan Bola yaitu " + 4 * Math.PI * this.jarijari * this.jarijari);
        }
        public double showVolume(){
            return(4 * Math.PI * this.jarijari * this.jarijari * this.jarijari)/ 3;
        }
}
