
public class Zad2z7 {

	void makeingAnExeption() throws Exception {
		if (new java.util.Random().nextInt(5) == 0)
		throw new Exception();
	}
	public static void main(String[] args) {
		Zad2z7 z = new Zad2z7();
		int i =0;
		try {
		z.makeingAnExeption();
		i++;
		z.makeingAnExeption();
		i++;
		z.makeingAnExeption();
		i++;
		z.makeingAnExeption();
		i++;
		z.makeingAnExeption();
		i++;
		} catch (Exception e) {
		System.out.println("An exeption was in: "+i);
		}
		if (i==5) {
			System.out.println("No exeption");	
		}

	}

}
