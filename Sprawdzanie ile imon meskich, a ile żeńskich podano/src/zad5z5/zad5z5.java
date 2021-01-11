package zad5z5;

import java.util.Scanner;

public class zad5z5 {

	public static void main(String[] args) {
		System.out.println("Podaj 5 imion:");
		String array[] = new String[5];
		for (int i=0;i<5;i++) {
			System.out.print("Podaj imie: ");
			Scanner scan = new Scanner(System.in);
			array[i] = scan.nextLine();
		}
		int man = 0; 
		int woman = 0;	
		String wooman=" "; 
		String maan= " ";
		for (int i=0; i<5; i++) {
			if ((array[i].endsWith("a"))||(array[i].endsWith("A"))==true) {
				woman++;
				wooman = wooman.concat(array[i]);
				wooman = wooman.concat(", ");
			}
			else {
				man++;
				maan = maan.concat(tablica[i]);
				maan = maan.concat(", ");
			}
		}
		int lengthw=wooman.length();
		int lengthm=maan.length();
		lengthw=lengthw-2;
		lengthm=lengthm-2;
		String w = wooman.substring(0,lengthw);
		String m = maan.substring(0,lengthm);
		System.out.print(woman+" kobiety"+":"+w+".");
		System.out.println(" ");
		System.out.print(man+" mê¿czyzn"+":"+m+".");
}
}