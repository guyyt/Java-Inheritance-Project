package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StarfleetManager {

	/**
	 * Returns a list containing string representation of all fleet ships, sorted in descending order by
	 * fire power, and then in descending order by commission year
	 */
	public static List<String> getShipDescriptionsSortedByFirePowerAndCommissionYear(Collection<Spaceship> fleet) {
		List<Spaceship> fl =new ArrayList<Spaceship>(fleet);
		ShipsCompare FirePowerAndCommissionYearOrder = new ShipsCompare();
		Collections.sort(fl,FirePowerAndCommissionYearOrder);
	
		List<String> names=new ArrayList<String>();
		for(Spaceship s:fl){
			names.add(s.toString());
		}
		
		return names;
	}

	/**
	 * Returns a map containing ship type names as keys (the class name) and the number of instances created for each type as values
	 */
	public static Map<String, Integer> getInstanceNumberPerClass(Collection<Spaceship> fleet) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(Spaceship s: fleet){
			String type=s.getClass().getSimpleName();
			if(map.containsKey(type)){
				map.put(type, map.get(type)+1);
			}
			else{
				map.put(type,1);
			}
		}
		return map;
	}


	/**
	 * Returns the total annual maintenance cost of the fleet (which is the sum of maintenance costs of all the fleet's ships)
	 */
	public static int getTotalMaintenanceCost (Collection<Spaceship> fleet) {
		int sum=0;
		for(Spaceship s: fleet){
			sum+= s.getAnnualMaintenanceCost();
		}
		
		return sum;
	}


	/**
	 * Returns a set containing the names of all the fleet's weapons installed on any ship
	 */
	public static Set<String> getFleetWeaponNames(Collection<Spaceship> fleet) {
		
		Set<String> names=new HashSet<String>();
		for(Spaceship s: fleet){
			String name=s.getClass().getSimpleName();
			if(name.equals("Fighter")||name.equals("Bomber")||name.equals("StealthCruiser")){
				AbstractFighter f=(AbstractFighter) s;
				for(Weapon w:f.getWeapon()){
					names.add(w.getName());
				}
			}
		}
		
		return names;
	}

	/*
	 * Returns the total number of crew-members serving on board of the given fleet's ships.
	 */
	public static int getTotalNumberOfFleetCrewMembers(Collection<Spaceship> fleet) {
		int sum=0;
		for(Spaceship s: fleet){
			sum+= s.getCrewMembers().size();
		}
		return sum;
	}

	/*
	 * Returns the average age of all officers serving on board of the given fleet's ships. 
	 */
	public static float getAverageAgeOfFleetOfficers(Collection<Spaceship> fleet) {
		int sum=0;
		int count=0;
		for(Spaceship s: fleet){
			for(CrewMember m:s.getCrewMembers()){
				if(m.getClass().getSimpleName().equals("Officer")){
					sum+= m.getAge();
					count++;
				}
				
			}
		}
		return sum/count;
		
	}

	/*
	 * Returns a map mapping the highest ranking officer on each ship (as keys), to his ship (as values).
	 */
	public static Map<Officer, Spaceship> getHighestRankingOfficerPerShip(Collection<Spaceship> fleet) {
		Map<Officer, Spaceship> map=new HashMap<Officer, Spaceship>();
		for(Spaceship s: fleet){
			Officer f=null;
			for(CrewMember m:s.getCrewMembers()){
				if(m.getClass().getSimpleName().equals("Officer")){
					Officer mm=(Officer) m;
					if(f==null){
						f=mm;
					}
					else if (f.getRank().compareTo(mm.getRank())<0)
						f=mm;
				}
			}
			map.put(f, s);
		}
		return map;
	}

	/*
	 * Returns a List of entries representing ranks and their occurrences.
	 * Each entry represents a pair composed of an officer rank, and the number of its occurrences among starfleet personnel.
	 * The returned list is sorted descendingly based on the number of occurrences.
	 */
	public static List<Map.Entry<OfficerRank, Integer>> getOfficerRanksSortedByPopularity(Collection<Spaceship> fleet) {
		Map<OfficerRank, Integer> map=new HashMap<OfficerRank, Integer>();
		for(Spaceship s: fleet){
			for(CrewMember m:s.getCrewMembers()){
				if(m.getClass().getSimpleName().equals("Officer")){
					Officer mm=(Officer) m;
					OfficerRank type=mm.getRank();
					if(map.containsKey(type)){
						map.put(type, map.get(type)+1);
					}
					else{
						map.put(type,1);
					}
				}
			}
		}
		
		TreeMap<OfficerRank, Integer> sortedMap = SortByValue(map);
		List<Map.Entry<OfficerRank, Integer>> ls=new ArrayList<Map.Entry<OfficerRank, Integer>>();
			ls.addAll(sortedMap.entrySet());
			return ls;
	}

	private static TreeMap<OfficerRank, Integer> SortByValue(Map<OfficerRank, Integer> map) {
		CommonRankComp vc =  new CommonRankComp(map);
		TreeMap<OfficerRank, Integer> sortedMap = new TreeMap<OfficerRank, Integer>(vc);
		sortedMap.putAll(map);
		return sortedMap;
	}

}
