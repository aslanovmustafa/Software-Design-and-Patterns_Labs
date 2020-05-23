public class BuildingTestDrive {
  
  public static void main(String[] args) {
       
    ExpensiveHouse expensiveHouse = new ExpensiveHouse();
    CheapHouse cheapHouse = new CheapHouse();
    
    System.out.println("\nBuilding expensive house...");
    expensiveHouse.build();
 
		System.out.println("\nBuilding cheap house...");
		cheapHouse.build();
  }
}