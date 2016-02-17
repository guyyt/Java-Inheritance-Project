package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Fighter extends AbstractFighter{

	public Fighter(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons) {
		super(name, commissionYear, maximalSpeed, crewMembers, weapons);
		
	}

	@Override
	public int getAnnualMaintenanceCost() {
		return 2500 + Math.round(1000 *this.MaximalSpeed) + 
				super.getAnnualWeaponsCost();
	}

	@Override
	public String toString() {
		return "Fighter"+"\n"+
		super.toString()+"\n\t"+
		"AnnualMaintenanceCost="+ 	getAnnualMaintenanceCost()+	"\n\t"+
		"Weapons=" + weapons.toString();
	}

}
