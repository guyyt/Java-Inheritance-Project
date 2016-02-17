package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Set;

public class TransportShip extends AbstractSpaceship{
	
	
	int cargoCapacity;
	int passengerCapacity;
	
	public TransportShip(String name, int commissionYear, float maximalSpeed,
			Set<CrewMember> crewMembers, int cargoCapacity, int passengerCapacity){
		super(name, commissionYear, maximalSpeed, crewMembers);
		this.cargoCapacity=cargoCapacity;
		this.passengerCapacity=passengerCapacity;
	}

	
	public int getCargoCapacity() {
		return cargoCapacity;
	}


	public int getPassengerCapacity() {
		return passengerCapacity;
	}


	@Override
	public int getAnnualMaintenanceCost() {
		return 3000+ (5*this.cargoCapacity)+ (3*this.passengerCapacity);
	}


	@Override
	public String toString() {
		return "TransportShip"+"\n" +
		super.toString()+"\n\t"+
		"AnnualMaintenanceCost="+getAnnualMaintenanceCost()+"\n\t"+
		"CargoCapacity=" + cargoCapacity +"\n\t"+"PassengerCapacity=" + passengerCapacity;
	}

	
}
