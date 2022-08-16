public class Monkey extends RescueAnimal {
	
	// Instance Variables
    public int tailLength; 
	private int height;
	private int bodyLength;
	private String species;
	
	/**
	 * @author TYLER ELLIS
	 * Default Constructor in the instance that no data is provided
	 */
	public Monkey() {
        String species = "null";
        int tailLength = 0;
        int height = 0;
        int bodyLength = 0;
	}
	
	/**
	 * @author TYLER ELLIS
	 * Constructor for On-boarding new Monkey
	 */
    public Monkey(String name, String species, String gender, int age,
    int weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, int tailLength, int height, int bodyLength)
   {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }
    
    public String monkeySpecies(String Species) {
    	return getSpecies();
    }


    /**
     * Mutators for the data that is specific to monkeys
     */
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}
	
    /**
     * getter for the data that is specific to monkeys
     */
	public String getSpecies() {
		return species;
	}
	
	public int getTailLength() {
		return tailLength;
	}
    
	public int getHeight() {
		return height;
	}
	
	public int getBodyLength() {
		return bodyLength;
	}
}
	
	
	
