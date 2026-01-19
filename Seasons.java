
public class Seasons {

	public static void main(String[] args) {
		
		String month = "Jun to Aug";
		switch (month) {
		case "Dec to Feb" :
			System.out.println("Winter");
			break;
		case "Mar to May":
			System.out.println("Summer");
			break;
		case "Jun to Aug":
			System.out.println("Monson");
			break;
		case "Sep to Nov":
			System.out.println("Autumn");
			break;
			default :
				System.out.println("Invalid Input");
		}
	}
}
