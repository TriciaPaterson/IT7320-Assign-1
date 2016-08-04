
public class Event {

	public void print(String eventName, String eventHeadline)
	{
		System.out.println(eventName + "\t" + eventHeadline );
	}
	
	public void dispatch(String location)
	{
		System.out.println("Units have been dispatched to " + location);
	}
}
