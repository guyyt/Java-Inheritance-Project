package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StealthCruiser extends AbstractFighter{

	
	public static int countStealthCruisers;
	
	
	public StealthCruiser(String name, int commissionYear,
			float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons){
			super(name, commissionYear, maximalSpeed, crewMembers, weapons);
			StealthCruiser.countStealthCruisers++;
	}
	
	public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers){
		super(name, commissionYear, maximalSpeed, crewMembers, new ArrayList<Weapon>());
		this.weapons.add(new Weapon ("Laser Cannons",10,100));
		StealthCruiser.countStealthCruisers++;
		
		
		
	}
	public int getAnnualMaintenanceCost() {
		return 2500 + Math.round(1000 *this.MaximalSpeed) + 
				super.getAnnualWeaponsCost()+
		(StealthCruiser.countStealthCruisers*100);		
	}

	@Override
	public String toString() {
		return "StealthCruiser"+"\n"+
		super.toString()+"\n\t"+ 
		"AnnualMaintenanceCost=" + getAnnualMaintenanceCost()+"\n\t"+
		"Weapons=" + weapons.toString();
	}
	
	
}
