package il.ac.tau.cs.sw1.ex9.starfleet;


import java.util.Set;

public abstract class AbstractSpaceship implements Spaceship {

	String Name;
	int CommissionYear;
	float MaximalSpeed;
	static int FirePower =10;
	Set<CrewMember> CrewMembers;
	int numberOfResearchLabs;
	
	
	
	public AbstractSpaceship(String name, int commissionYear, float maximalSpeed,
			Set<CrewMember> crewMembers) {
		
		Name = name;
		CommissionYear = commissionYear;
		MaximalSpeed = maximalSpeed;
		CrewMembers = crewMembers;
	}

	@Override
	public String getName() {
		return this.Name;
	}

	@Override
	public int getCommissionYear() {
		return this.CommissionYear;
	}

	@Override
	public float getMaximalSpeed() {
		return this.MaximalSpeed;
	}

	@Override
	public int getFirePower() {
		return AbstractSpaceship.FirePower;
	}

	@Override
	public Set<CrewMember> getCrewMembers() {
		return this.CrewMembers;
	}

	@Override
	public String toString() {
		return "\tName=" + getName() +"\n\t"+ "CommissionYear=" + getCommissionYear() +"\n\t"+"MaximalSpeed="
				+ getMaximalSpeed() +"\n\t"+ "FirePower=" + getFirePower() +"\n\t"+ "CrewMembers=" + getCrewMembers().size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractSpaceship other = (AbstractSpaceship) obj;
		if (Name == null) {
			if (other.getName() != null)
				return false;
		} else if (!Name.equals(other.getName()))
			return false;
		return true;
	}


}
