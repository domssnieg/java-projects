import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.AbstractMap; 


public class Zad4z6 {

	public static void main(String[] args) {
		List <String> list= new ArrayList <String>();
		AbstractMap <Character ,Integer> map =new TreeMap <Character ,Integer> ();
		list.add("Styczeñ");
		list.add("Luty");
		list.add("Marzec");
		list.add("Kwiecieñ");
		list.add("Maj");
		list.add("Czerwiec");
		list.add("Lipiec");
		list.add("Sierpieñ");
		list.add("Wrzesieñ");
		list.add("PaŸdziernik");
		list.add("Listopad");
		list.add("Grudzieñ");
		
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
		if (map.containsKey('æ')==true) System.out.println("Zawieraj¹ literê æ.");
		else System.out.println("Nie zawieraj¹ litery æ.");
		if (map.containsValue(13)) System.out.println("Jest taka litera.");
		else System.out.println("Nie ma takiej litery.");
	}		
}


				 
			

