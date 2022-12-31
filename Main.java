import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	/*	Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
		3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.  */
		
	
	        int k, toplam = 0, sayac = 0;
	        double ortalama;

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Sayiyi giriniz: ");
	        k = scanner.nextInt();

	        for (int i = 0; i <= k; i++) {
	            if (i % 12 == 0) {
	                System.out.println(i);
	                toplam = toplam + i;
	                sayac++;
	            }
	        }
	        System.out.println("Toplam: " + toplam);
	        ortalama = toplam / sayac;

	        System.out.print("Ortalama: " + ortalama);
	    }
	
	}


