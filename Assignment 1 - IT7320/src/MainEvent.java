import java.util.Scanner;

public class MainEvent {

	public static void main(String[] args) {
				
		Scanner eventObj = new Scanner(System.in);
		
		System.out.println("Enter event type: ");
		
		String eventName = eventObj.nextLine();
		
		System.out.println("Enter event description: ");
		
		String eventHeadline = eventObj.nextLine();
		
		Event e = new Event(); 
		
		e.print(eventName, eventHeadline);
		
		

	}

}
