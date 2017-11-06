import java.util.Scanner;

public class Band {

	private Instrument[] requiredInstruments;
	private Musician[] members;
	int lastMemberIndex=0;

	public Band(int numberOfMusicians, Musician[] existingMembers, Instrument[] requiredInstruments)
	{	
		int index;
		
		this.members = new Musician[numberOfMusicians];
		
		for(lastMemberIndex=0; lastMemberIndex < existingMembers.length; lastMemberIndex++)
		{
			members[lastMemberIndex]= new Musician();
			members[lastMemberIndex]=existingMembers[lastMemberIndex];
		}
		
		this.requiredInstruments = new Instrument[requiredInstruments.length];
		this.requiredInstruments = requiredInstruments;
	}
	
	public void showBandMembers()
	{
		int index=0;
		
		System.out.print("Here you have the members for the selected band: ");
		
		for(index=0; index<lastMemberIndex-1; index++)
		System.out.print(members[index].getName() + ", ");
		System.out.print(members[index].getName() + " ");
		System.out.println("");
	}
	
	public void showMissingInstruments()
	{
		int index, limit=requiredInstruments.length;
		
		System.out.print("About the missing instruments... ");
		
		if(requiredInstruments == null)
			System.out.print("There are no missing Intruments");
		else
			{	
				System.out.print("It would be great if you could play the following: ");
				for(index=0;index<limit-1;index++)
					System.out.print(requiredInstruments[index]+", ");
			}
		System.out.print(requiredInstruments[limit-1]);
		System.out.println("");
	}
	
	private boolean instrumentExists(Instrument instrument)
	{
		int index;
		
		if(this.requiredInstruments == null)
			return false;
		else
			for(index=0; index<requiredInstruments.length; index++)
				if(requiredInstruments[index].equals(instrument))
					return true;
		return false;
	}
	
	public void addMusician(Instrument instrument)
	{
		int index, position; 
		Instrument[] requiredInstrumentsCopy = new Instrument[requiredInstruments.length-1];
		
		Scanner input = new Scanner(System.in);
		
		if(instrumentExists(instrument)==false)
		{
			System.out.print("The instrument you play doesn't exist in the band. You're good to go! Write your name here: ");
			members[lastMemberIndex] = new Musician();
			members[lastMemberIndex].setName(input.nextLine());
			members[lastMemberIndex].setInstrument(instrument);
			lastMemberIndex++;
			
			index=0;
			position=-1;
			
			while(requiredInstruments[index] != instrument && index < requiredInstruments.length-1)
				{position++;
				index++;}

			requiredInstruments[position]=requiredInstruments[requiredInstruments.length-1];
			
			for(index=0; index < requiredInstruments.length-1; index++)
				requiredInstrumentsCopy[index] = requiredInstruments[index];
			
			requiredInstruments=requiredInstrumentsCopy;
		}
		else
			System.out.println("This band already has someone playing that instrument!");
			
	}
}
