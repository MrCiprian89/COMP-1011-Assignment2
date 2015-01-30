
public class SuperHero extends Hero {
	//PRIVATE VARIABLES ##################################################################
			private String superPowers[];
			
	//PUBLIC VARIABLES ###################################################################
			public String name;
			
	//CONSTRUCTORS #######################################################################
	public SuperHero(String name) {
		super(name);
		generateRandomPowers();
	}
	
	//PUBLIC METHODS ######################################################################	
	public void showPowers(){
		System.out.println(this.name + "'s super powers are " + this.superPowers);
	}
	
	//PRIVATE METHODS #####################################################################	
		private String[] generateRandomPowers(){
			String[] superPowers = null;
			String[] superPowersList = { "Super Speed", "Super Strength", "Body Armour", "Flight" , "Fire Generation", "Weather Control"};		
			return superPowers;		
		}
}
