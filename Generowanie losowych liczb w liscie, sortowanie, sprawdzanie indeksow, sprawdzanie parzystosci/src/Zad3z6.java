import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
public class Zad3z6{
	static Random rnd = new Random();

	public static void main(String[] args) {
		List <Integer> listaa = generateRandomNumbers();
		System.out.println("Max:" + Collections.max(listaa));
		System.out.println("Indeks of max element: "+ listaa.indexOf(Collections.max(listaa)));
		System.out.println("Min:"+Collections.min(listaa));
		System.out.println("Indeks of min element: "+ listaa.indexOf(Collections.min(listaa)));
		Collections.sort(listaa);
		System.out.println(listaa);
		System.out.println("Max:" + Collections.max(listaa));
		System.out.println("Indeks of max element: "+ listaa.indexOf(Collections.max(listaa)));
		System.out.println("Min:"+Collections.min(listaa));
		System.out.println("Indeks of min element: "+ listaa.indexOf(Collections.min(listaa)));
		System.out.println("Sorted out:");
		for (int x:listaa) {
			if (x%2==0) 
			{
				System.out.print(x+" ");
			}
		}
		for (int x:listaa) {
			if (x%2!=0) 
			{
				System.out.print(x+" ");
			}
		}
		
	}
	private static List<Integer> generateRandomNumbers() {
		List <Integer> lista = new ArrayList<Integer>();
		int i=0;
		while(i<10){
		lista.add(rnd.nextInt());
		i++;
		}
		return lista;
}
}