package il.ac.tau.cs.sw1.ex9.starfleet;

public abstract class AbstractMember implements CrewMember {
	
	String name;
	int age;
	int yearsInService;
	
	public AbstractMember(String name, int age, int yearsInService){
	
		this.age=age;
		this.name=name;
		this.yearsInService=yearsInService;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public int getYearsInService() {
		return this.yearsInService;
	}
	
	
	@Override
	public String toString() {
		return "\tName=" + name +"\n\t"+"Age=" + age +"\n\t"+ "YearsInService=" + yearsInService;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		AbstractMember other = (AbstractMember) obj;
		if (name == null) {
			if (other.getName() != null)
				return false;
		} else if (!name.equals(other.getName()))
			return false;
		return true;
	}


}
