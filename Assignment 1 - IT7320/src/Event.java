
public class Event {

	public void print(String eventName, String eventHeadline)
	{
		System.out.println("The Event Type is: " + eventName + "\n" + "The Event Description is: " + eventHeadline );
	}
	
	public void dispatch(String location)
	{
		System.out.println("Units have been dispatched to " + location);
	}
	
	public void time(String eventTime)
	{
		System.out.println("The event happened at: " + eventTime);
	}
	
	public void informant(String informantName)
	{
		System.out.println("The informant's name is: " + informantName);
	}
	
	public void dispatcher(String dispatcherName, String qid)
	{
		System.out.println("The dispatcher's is: " + dispatcherName + "\nDispatcher's QID is: " + qid);
	}

}
