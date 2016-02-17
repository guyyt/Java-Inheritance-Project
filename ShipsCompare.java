package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Comparator;

public class ShipsCompare implements Comparator<Spaceship> {

	@Override
	public int compare(Spaceship arg0, Spaceship arg1) {
		if (arg0.getFirePower()>arg1.getFirePower())
			return -1;
		else if (arg0.getFirePower()<arg1.getFirePower())
			return 1;
		else{
			if(arg0.getCommissionYear()>arg1.getCommissionYear())
				return -1;
			else return 1;
		}
	}

}
