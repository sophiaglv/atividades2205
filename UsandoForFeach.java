package vetorArraylist;

public class UsandoForFeach {

	public static void main(String[] args) {
		String[] names = new String[3];
		
		names[0] = "Charles Leclerc";
		names[1] = "George Russell";
		names[2] = "Max Verstappen";
		
		for (String name : names) {
			System.out.print(name + ", ");
		}
	}

}
