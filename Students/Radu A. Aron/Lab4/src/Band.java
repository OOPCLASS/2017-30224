
public class Band 
{
	private String name;
	private Musician[] musicians;
	private Instrument[] requiredInstruments;
	private int membersCount;
	private int requiredMembers;

	public Band() 
	{
		this.name = "Noname";
		this.requiredMembers = 3;
		this.membersCount = 0;
		this.requiredInstruments = new Instrument[3];

		this.requiredInstruments[0] = Instrument.GUITAR;
		this.requiredInstruments[1] = Instrument.VOICE;
		this.requiredInstruments[2] = Instrument.DRUMS;
		
		this.musicians = new Musician[this.requiredMembers];
	}
	
	public Band (String name, int reqMembers, Instrument[] reqInstruments)
	{
		this.membersCount = 0;
		this.name = name;
		this.requiredMembers = reqMembers;
		
		this.requiredInstruments = new Instrument[reqMembers];
		
		for (int i = 0; i < reqMembers; i++)
		{
			this.requiredInstruments[i] = reqInstruments[i];
		}
		
		this.musicians = new Musician[this.requiredMembers];
	}
	
	public boolean addMusician (Musician musician)
	{
		boolean requiredMusician = false;
		boolean instrumentIsFree = true;
		
		for (int i = 0; i < this.requiredMembers && !requiredMusician; i++)
		{
			if (this.requiredInstruments[i].equals(musician.getInstrument()))
				requiredMusician = true;
		}
		
		for (int i = 0; i < this.membersCount && instrumentIsFree; i++)
		{
			if (this.musicians[i].getInstrument().equals(musician.getInstrument()))
				instrumentIsFree = false;
		}
		
		if (requiredMusician && instrumentIsFree)
		{
			this.musicians[this.membersCount] = musician;
			
			this.membersCount++;
			
			
		}
		
		return requiredMusician && instrumentIsFree;
	}
	
	public Instrument[] getMissingInstruments ()
	{
		Instrument[] missingInstruments = new Instrument[this.requiredMembers];
		int counter = this.requiredMembers;
		
		for (int i = 0; i < this.requiredMembers; i++)
		{
			missingInstruments[i] = this.requiredInstruments[i];
		}
		
		for (int i = 0; i < this.membersCount; i++)
		{
			for (int j = 0; j < counter; j++)
			{
				if (this.musicians[i].getInstrument().equals(missingInstruments[j]))
				{
					for (int k = j; k < counter - 1; k++)
					{
						missingInstruments[k] = missingInstruments[k+1];
					}
					
					missingInstruments[counter-1] = null;
					counter--;
				}
			}
		}
		
		return missingInstruments;
	}
}
