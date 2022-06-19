package TaksimetreHesaplama;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        double kM;
        double ucret = 10;

        System.out.print("Gidelen mesafe: ");
        kM = input.nextDouble();

        ucret = ucret + (kM*2.20);

        if (ucret<20){
            System.out.print("Odemeniz gereken tutar: " + 20 );
        } else {
            System.out.print("Odemeniz gereken tutar: " + ucret);
        }
    }
}
