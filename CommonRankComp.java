package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Comparator;
import java.util.Map;

public class CommonRankComp implements Comparator<OfficerRank> {
	Map<OfficerRank, Integer> map;

	public CommonRankComp(Map<OfficerRank, Integer> map){
		this.map=map;
	}
	@Override
	public int compare(OfficerRank arg0, OfficerRank arg1) {
		if(map.get(arg0)>map.get(arg1)) return -1;
		else return 1;
	}
	
	
}
