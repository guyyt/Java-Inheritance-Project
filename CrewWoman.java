package il.ac.tau.cs.sw1.ex9.starfleet;

public class CrewWoman extends AbstractMember{

	public CrewWoman(String name, int age, int yearsInService) {
		super(name, age, yearsInService);
		
	}

	@Override
	public String toString() {
		return "CrewWoman"+"\t\n" +
	     super.toString();
	}

	


}
