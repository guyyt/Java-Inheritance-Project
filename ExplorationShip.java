package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Set;

public class ExplorationShip extends AbstractSpaceship{

	
	int numberOfResearchLabs;
	
	public ExplorationShip(String name, int commissionYear, float maximalSpeed, 
			Set<CrewMember> crewMembers, int numberOfResearchLabs) {
		super(name, commissionYear, maximalSpeed, crewMembers);
		
		this.numberOfResearchLabs=numberOfResearchLabs;
		
		
		
	}

	@Override
	public int getAnnualMaintenanceCost() {
		return 4000 + (this.numberOfResearchLabs*2500);
		
	}
	
	public int getNumberOfResearchLabs(){
		return this.numberOfResearchLabs;
		
		
	}

	@Override
	public String toString() {
		
		return "ExplorationShip"+"\n"+
		super.toString()+"\n\t"+
		"AnnualMaintenanceCost="+ getAnnualMaintenanceCost()+"\n\t"+
		"NumberOfResearchLabs=" + numberOfResearchLabs;
	}
	
	

}
