package il.ac.tau.cs.sw1.ex9.starfleet;


import java.util.Set;
import java.util.List;

public abstract class AbstractFighter extends AbstractSpaceship {

	List<Weapon> weapons;
	 
	public AbstractFighter(String name, int commissionYear, 
			float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons){
		super(name, commissionYear, maximalSpeed, crewMembers);
		this.weapons=weapons;
		
	}
	public List<Weapon> getWeapon(){
		return this.weapons;
	}
	
	public int getFirePower() {
		int sum=0;
		for(Weapon w:weapons){
			sum+= w.getFirePower();
		}
		return AbstractSpaceship.FirePower + sum;
	}
	public int getAnnualWeaponsCost() {
		int sum =0;
		for(Weapon w:weapons){
			sum+= w.getAnnualMaintenanceCost();
		}
		return sum;
	}


}
