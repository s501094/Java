import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
@SuppressWarnings("resource")

public class Driver {
	
	/**
	 * @author TYLER ELLIS
	 * creating arrayList to hold the animal information based on type of animal. 
	 */
			
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
	public static ArrayList<String> monkeySpeciesList = new ArrayList<String>();
	
//-------------------------------------------------------------------------------------------------
	/**
	 * Additional methods to assist in main method.
	 */
	
    static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }
    
    
    /**
     * @author TYLER ELLIS
     * Initializing tests for on-boarding new dogs
     * Format for entry should be:
     * Dog(String, String, String, Integer, Integer, String, String, String, boolean, String)
     */
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", 1, 25.6, "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", 3, 35.2, "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", 4, 25.6, "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }
    
    /**
     * @author TYLER ELLIS
     * Initializing tests for on-boarding new dogs
     * Format for entry should be:
     * Dog(String, String, String, Integer, Integer, String, String, String, boolean, String)
     */
    public static void initializeMonkeyList() {
		Monkey monkey1 = new Monkey("john", "Guenon", "male", 23,
			    110, "june 8", "US", "inService", false , "China", 12, 98, 10);
		Monkey monkey2 = new Monkey("jerry", "Guenon", "male", 23,
			    110, "june 8", "US", "inService", false , "China", 12, 98, 10);
		Monkey monkey3 = new Monkey("joel", "Guenon", "male", 23,
			    110, "june 8", "US", "inService", false , "China", 12, 98, 10);
		//adding each new monkey to List 
		monkeyList.add(monkey1);
		monkeyList.add(monkey2);
		monkeyList.add(monkey3);
    }
    
    public static void initializeMonkeySpeciesList() {
    	monkeySpeciesList.add("Capuchin");
    	monkeySpeciesList.add("Guenon");
    	monkeySpeciesList.add("Macaque");
    	monkeySpeciesList.add("Marmoset");
    	monkeySpeciesList.add("Squirrel monkey");
    	monkeySpeciesList.add("Tamarin");
        for (int i = 0; i < monkeySpeciesList.size(); i++) {
            System.out.println(monkeySpeciesList.get(i));
          }
    }
 //----------------------------------------------------------------------------------------------
    
    /**
     * @author Tyler Ellis
     * Animal On-Boarding and validation
     */
    
    public static void intakeNewDog() {
    	try {
	    	@SuppressWarnings("resource")
			Scanner scnr = new Scanner(System.in);
	        System.out.println("What is the dog's name?");
	        String name = scnr.nextLine();
	        for(Dog dog: dogList) {
	        	/**
	        	 * @author Tyler Ellis
	        	 * First method validates if pet is already in the system. 
	        	 * if the pet is in the system, send error letting user know and breaking from intakeNewDog.
	        	 */
	        	
	            if(dog.getName().equalsIgnoreCase(name)) {
	                System.out.println("\n\nThis dog is already in our system\n\n");
	                return; //returns to menu
	            }
	
	            System.out.println("What is the Dogs breed?");
	           	String breed = scnr.nextLine();
	
	            System.out.println("What is the dog gender?");
	            String gender = scnr.nextLine();
	
		        System.out.println("What is the dog age?");
		        int age = scnr.nextInt();
	
	            System.out.println("What is the dog weight?");
	            int weight = scnr.nextInt();
	            
	            System.out.println("Where was the dog found?");
	            String acquisitionCountry = scnr.nextLine();
	            
	            System.out.println("When was the dog found?");
	            String acquisitionDate = scnr.nextLine();
	            
	            System.out.println("What is the current training status?");
	            String trainingStatus = scnr.nextLine();
	            
	            System.out.println("Is this dog currently reserved?(true or false)");
	            boolean reserved = scnr.nextBoolean();
	            
	            System.out.println("Final Question: Where will this dog be in service?");
	            String inServiceCountry = scnr.nextLine();
	
	            // Adding new dog to system based on users inputs. 
	            Dog newdog = new Dog(name,breed,gender,age,weight,acquisitionDate,acquisitionCountry,trainingStatus,reserved,inServiceCountry);
	            
	            dogList.add(newdog);
	        }
    	}catch(InputMismatchException e) {
    		System.out.println("Invalid input for Dog Onboarding. Please try again.");
    	}
	    
    }
    
   
    /**
     * @author tyler ellis
     * 
     * initiating On-Boarding of a new monkey method
     * First, check if monkey is already in the system.
     * If monkey is not,  check if species of monkey is in monkey species list
     * if monkey species is not in our system,  
     */
    
    public static void intakeNewMonkey() {
    	try {
	    	Scanner scnr = new Scanner(System.in);
	        System.out.println("What is the monkey's name?");
	        String name = scnr.nextLine();
	        /**
	         * First validate that the monkey is not already in the system by name.
	         */
	        for(Monkey monkey: monkeyList) {
	            if(monkey.getName().equalsIgnoreCase(name)) {
	                System.out.println("Monkey is already in our system.");
	                return; //returns to menu
	            }
	        }
	        /**
	         * second: Validate that the Monkey species is in our system.
	         */
	        System.out.println("What Species is the Monkey?");
	        String Species = scnr.nextLine();
	        for(Monkey monkey: monkeyList) {
	            if(!(monkeySpeciesList.contains(Species))) {
	                System.out.println("Monkey Species is not in our system.");
	                return; //returns to menu
	            }
	            System.out.println("What is the monkeys species?");
	            String species = scnr.nextLine();
	            
	            System.out.println("What is the monkeys gender?");
	            String gender = scnr.nextLine();
	            
	            System.out.println("What is the monkeys age?");
	            int age = scnr.nextInt();
	            
	            System.out.println("What is the monkeys weight?");
	            int weight = scnr.nextInt();
	            
	            System.out.println("What is the monkeys tail length?");
	            int tailLength = scnr.nextInt();
	            
	            System.out.println("What is the monkeys body length?");
	            int bodyLength = scnr.nextInt();
	            
	            System.out.println("What is the monkeys height?");
	            int height = scnr.nextInt();
	            
	            System.out.println("Where was the monkey found?");
	            String acquisitionCountry = scnr.nextLine();
	            
	            System.out.println("When was the monkey found?");
	            String acquisitionDate = scnr.nextLine();
	            
	            System.out.println("What is the current training status?");
	            String trainingStatus = scnr.nextLine();
	            
	            System.out.println("Is this monkey currently reserved?(true or false)");
	            boolean reserved = scnr.nextBoolean();
	            
	            System.out.println("Final Question: Where will this monkey be in service?");
	            String inServiceCountry = scnr.nextLine();
	            
	            
	            Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
	            
	            monkeyList.add(newMonkey);
	        
	      	}
    	}catch(InputMismatchException e) {
    		System.out.println("Invalid input for Monkey Onboarding. Please try again.");
    	}
     }

//--------------------------------------------------------------------------------------------------    
    /**
     * 
     * @param args
     */
    
	public static void reserveAnimal() {
		try {
			Scanner scnr = new Scanner(System.in);
			System.out.println("What is the animal type and Service Country??");
			String type = scnr.nextLine();
		    String ServiceCountry = scnr.nextLine();
		    if (type == "dog") {
		        for(Dog dog: dogList) {
		        	if(dog.getAnimalType().equals(type)) {
		        		if(dog.getInServiceLocation().equals(ServiceCountry)) {
		        			dog.setReserved(true);
		        			System.out.println("Dog Reserved.\n");
		        			return;
	
		        		}
		        	}
		        }
		    }
	        if(type == "monkey") {
		        for(Monkey monkey: monkeyList) {
		        	if(monkey.getAnimalType().equals(type)) {
		        		if(monkey.getInServiceLocation().equals(ServiceCountry)) {
		        			monkey.setReserved(true);
		        			System.out.println("Monkey Reserverd.\n");
		        			return;
		        		}
		        	}
		        }
	        }
    	}catch(InputMismatchException e) {
    		System.out.println("Invalid input to reserve Animal. Please try again.");
    	}
    }
//-----------------------------------------------------------------------------------------------
	
	/**
	 * @author Tyler Ellis
	 * Split each section up with an if statement which uses the userInput to determine what to output.
	 */
	    public static void printAnimals(int x) {
	    	try {
		    	if(x == 4) {
			        for(Dog dog: dogList) {
			        	// Available animals will be in "In Service" and not yet be reserved. 
			        		if((dog.getTrainingStatus() == "in service ")  && (dog.getReserved() == false)) {
			        			System.out.println("Dog Name: "+ dog.getName()+ " "+ "Training Status: "+ dog.getTrainingStatus()+" Acquisition Country: "+ dog.getAcquisitionLocation()+ " Reserved: "+ dog.getReserved());
			        		}
			        }
			        for(Monkey monkey: monkeyList) {
			        	// Available animals will be in "In Service" and not yet be reserved. 
			        		if((monkey.getTrainingStatus() == "in Service")&& (monkey.getReserved() == false)) {
			        			System.out.println("Monkey Name: "+ monkey.getName()+ " "+ "Training Status: "+ monkey.getTrainingStatus()+" Acquisition Country: "+ monkey.getAcquisitionLocation()+ " Reserved: "+ monkey.getReserved());
			        		}
			        }
		    	}
		    	else if(x == 5) {
			        for(Dog dog: dogList) {
			        	// Available animals will be in "In Service" and not yet be reserved. 
			        		if((dog.getTrainingStatus() == "in service ")  && (dog.getReserved() == false)) {
			        			System.out.println("Dog Name: "+ dog.getName()+ " "+ "Training Status: "+ dog.getTrainingStatus()+" Acquisition Country: "+ dog.getAcquisitionLocation()+ " Reserved: "+ dog.getReserved());
			        		}
			        }
		    	}
		    	else if(x == 6) {
			        for(Monkey monkey: monkeyList) {
			        	// Available animals will be in "In Service" and not yet be reserved. 
			        		if((monkey.getTrainingStatus() == "in Service")&& (monkey.getReserved() == false)) {
			        			System.out.println("Monkey Name: "+ monkey.getName()+ " "+ "Training Status: "+ monkey.getTrainingStatus()+" Acquisition Country: "+ monkey.getAcquisitionLocation()+ " Reserved: "+ monkey.getReserved());
			        		}
			        }
		    	}
	    	}catch(InputMismatchException e) {
	    		System.out.println("Invalid list animals input. Please try again.");
	    	}
	    }
	
	
 //----------------------------------------------------------------------------------------------   
    
    public static void main(String[] args) {
		// initializing the Scanner to in take user input.
		Scanner scnr = new Scanner(System.in);
		
		
//-----------------------------------------------------------------------------------------------
		
		/**
		 * @author - Tyler Ellis
		 * Initializing three lists in order to separate the animals.
		 */
	    initializeDogList(); 
	    initializeMonkeyList(); 
	    initializeMonkeySpeciesList(); 
	    
	    
	    
//-----------------------------------------------------------------------------------------------
		
	    
	  	/**
	  	 * @author - Tyler Ellis
	  	 * Opening switch loop for displayMenu();
	  	 * 
	  	 */
		displayMenu();
		while(!scnr.nextLine().equalsIgnoreCase("q")) {
			switch (scnr.nextLine()) {
				case "1":
				// if user input is 1 calling the input new dog method
					intakeNewDog();
					break;
				// if user input is 2 calling the input new monkey method	
				case "2":
					intakeNewMonkey();
					break;
				// if user input is 3 calling the reserved animal method
				case "3":
					reserveAnimal();
					break;
				// if user input is 4 calling the printAnimalDogs method
				case "4":
					// print all dogs
					int allDogs = 4;
					printAnimals(allDogs);
					break;
				// if user input is 5 calling the printAnimalMonkeys method
				case "5":
				// print all monkeys
					int allMonkeys = 5;
					printAnimals(allMonkeys);
					break;
				// if user input is 6 calling the print all non reserved animals method
				case "6":
					// print all non reserved animals
					int reservedAnimals = 6;
					printAnimals(reservedAnimals);;
					break;
				default:
				/**
				 * @author Tyler Ellis
				 * if user input is not one of the 6 numerical values above, checking if input is equal to q
				 * if it is not, outputting error and asking user to try again. 
				 * if scnr.nextLine() is equal to q, exiting program. 
				 */
					if (!scnr.nextLine().equals("q")) {
						System.out.println("Invalid Input, please try again.");
						break;
					}
					break;
				}
			}
		
		}
    

}

