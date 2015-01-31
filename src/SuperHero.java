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
			
			//ArrayList to store the returned powers
			ArrayList<String> superPowers = new ArrayList<String>(numberOfPowers);
			//ArrayList that store all possible powers to be generated
			ArrayList<String> superPowersList = new ArrayList<String>(
				    Arrays.asList("Super Speed", "Super Strength", "Body Armour", "Flight" , "Fire Generation", "Weather Control"));
			//variable to control the random index taken from superPowerList, keeps within the current size of the ArrayList
			int powersGenerated = superPowersList.size();
		    //for loop that removes a power from superPowerList and adds it to superPowers
			for(int i = numberOfPowers; i>=1 ;i--){
			     int roll = (randomRoll(powersGenerated))-1;//roll a random number within the size of the array left over
			     superPowers.add( superPowersList.remove(roll)); 
			     powersGenerated--;//removes 1 from the roll because the ArrayList is reduced by 1 after being removed.
			}
			return superPowers;		
		}//END generateRandomPowers
}
