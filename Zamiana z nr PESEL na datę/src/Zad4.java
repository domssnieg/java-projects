import java.util.Scanner;
public class Zad4 {

	public static void main(String[] args) {
		System.out.println("Podaj nr PESEL: ");
		Scanner scan = new Scanner(System.in);
        String pesel = scan.nextLine();
        Pesel peselek = new Pesel();
        peselek.whatsgoingtohappen(pesel);
	}
public static class Pesel{
	public String pes;
	public void whatsgoingtohappen(String pes) {
		int pesellength = pes.length();
		if (pesellength==11) {
			System.out.println("Urodzi³eœ siê: ");
			String year = pes.substring(0,2);
			String month = pes.substring(2, 4);
			String day = pes.substring(4, 6);
			String dot = ".";
			String slash = "/";
			String beginning = "19";
			String yearr = beginning.concat(year);
			String resultdot = dzien.concat(dota);
			resultdot = resultdot.concat(month);
			resultdot = resultdot.concat(dot);
			resultdot = resultdot.concat(yearr);
			System.out.println(wynikkropka);
			String resultslash = miesiac.concat(ukosnik);
			resultslash = resultslash.concat(day);
			resultslash = resultslash.concat(slash);
			resultslash = resultslash.concat(year);
			System.out.println(resultslash);
		}
		else {
			System.out.println("Pesel powinien posiadaæ 11 cyfr");
		}
	}
}
}
