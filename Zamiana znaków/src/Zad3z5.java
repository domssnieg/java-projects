
public class Zad3z5 {
	public static void main(String[] args) {
		String cypher = "Java";
		StringBuffer wiadomosc = new StringBuffer("Zaszyfrowany tekst to: "); 
		cypher = cypher.replace("J", "m");
		cypher = cypher.replace("a", "3");
		cypher = cypher.replace("v", "$");
		System.out.println(wiadomosc.append(cypher));
	}
}
