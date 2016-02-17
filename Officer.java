package il.ac.tau.cs.sw1.ex9.starfleet;

public class Officer extends AbstractMember{
	
	OfficerRank rank;
	
	public Officer(String name, int age, int yearsInService, OfficerRank rank){
		super( name,  age,  yearsInService);
		this.rank=rank;
		
	}

	public OfficerRank getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "Officer"+"\t\n" +
	  super.toString()+
	  "Rank=" + rank;
	}

	
}
