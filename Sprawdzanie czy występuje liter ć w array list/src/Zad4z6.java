import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.AbstractMap; 


public class Zad4z6 {

	public static void main(String[] args) {
		List <String> list= new ArrayList <String>();
		AbstractMap <Character ,Integer> map =new TreeMap <Character ,Integer> ();
		list.add("Stycze�");
		list.add("Luty");
		list.add("Marzec");
		list.add("Kwiecie�");
		list.add("Maj");
		list.add("Czerwiec");
		list.add("Lipiec");
		list.add("Sierpie�");
		list.add("Wrzesie�");
		list.add("Pa�dziernik");
		list.add("Listopad");
		list.add("Grudzie�");
		
		for (String x: lista) {
					for (int i=0; i<x.length()-1; i++)
					{
						 if (map.containsKey(x.charAt(i))== true) {
							 char letter=x.charAt(i);
							 map.put(letter,map.get(letter)+1);
						 }
						 if (map.containsKey(x.charAt(i))== false){
							 
							map.put(x.charAt(i), 1);
						 }
						 }
					}
		System.out.println(mapa);
		if (map.containsKey('�')==true) System.out.println("Zawieraj� liter� �.");
		else System.out.println("Nie zawieraj� litery �.");
		if (map.containsValue(13)) System.out.println("Jest taka litera.");
		else System.out.println("Nie ma takiej litery.");
	}		
}


				 
			

