import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;


public class SuperHero extends Hero {
	//PRIVATE VARIABLES ##################################################################
	ArrayList<String> superPowers = new ArrayList<String>();
			
	//CONSTRUCTORS #######################################################################
	public SuperHero(String name) {
		super(name);
		this.superPowers = generateRandomPowers(3);
	}
	
	//PUBLIC METHODS ######################################################################	
	public void showPowers(){
		System.out.println(this.name + "'s super powers are " + this.superPowers);
	}
	
	//PRIVATE METHODS #####################################################################	
		private ArrayList<String> generateRandomPowers(int numberOfPowers){
			
			ArrayList<String> superPowers = new ArrayList<String>(numberOfPowers);
			ArrayList<String> superPowersList = new ArrayList<String>(
				    Arrays.asList("Super Speed", "Super Strength", "Body Armour", "Flight" , "Fire Generation", "Weather Control"));
			int powersGenerated = superPowersList.size();//variable to generate a random number that will be within the size of possible powers
			
			for(int i = numberOfPowers; i>=1 ;i--){
			     int roll = (randomRoll(powersGenerated))-1;//roll a random number within the size of the array left over
			     superPowers.add( superPowersList.remove(roll)); 
			    		 powersGenerated--;
			}
			return superPowers;		
		}
}
