package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Bomber extends AbstractFighter{
	
	int numberOfTechnicians;
	
	public Bomber(String name, int commissionYear, float maximalSpeed, 
			Set<CrewMember> crewMembers, List<Weapon> weapons, int numberOfTechnicians){
		super(name, commissionYear, maximalSpeed, crewMembers, weapons);
		this.numberOfTechnicians=numberOfTechnicians;
		
	}
	
	public int getNumberOfTechnicians() {
		return numberOfTechnicians;
	}
	
	public int getAnnualMaintenanceCost() {
		double dic=this.numberOfTechnicians*0.1;
		
		return (int) (5000 +
				Math.round(super.getAnnualWeaponsCost()*dic));
	}

	@Override
	public String toString() {
		return "Bomber"+"\n"+
		super.toString()+"\n\t"+
		"AnnualMaintenanceCost="+ 	getAnnualMaintenanceCost()+	"\n\t"+
		"Weapons=" + weapons.toString() +"\n\t"+
		"NumberOfTechnicians=" + numberOfTechnicians;
	}
	
	
}
