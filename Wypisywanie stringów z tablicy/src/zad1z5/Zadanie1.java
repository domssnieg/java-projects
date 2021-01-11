package zad1z5;

public class Zadanie1 {
	public static void main(String[] args) {
		String[] array = {" Ladna jest pogoda ", " Swieci slonce", "Niestety nie jest cieplo   "};
		for (int i = 0; i<3; i++) {
			array [i] = array[i].trim();
		}
	   String pomocnicza=" ";
	   for (int i=0; i<2; i++) {
		   if(array[i].length()>array[i+1].length()) {
			   temp = array[i];
			   array[i]=array[i+1];
			   array[i+1]=temp;
		   }
	   }
	   for (int i=0; i<3; i++) {
		   System.out.println(array[i]);
	   }
	}
}
