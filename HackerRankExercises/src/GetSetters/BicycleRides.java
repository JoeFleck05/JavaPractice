package GetSetters;

public class BicycleRides {
	
	public static void main(String[] args){
		
		String roadBikeMake = "Trek";
		String roadBikeModel = "Edmonda S4";
		String roadBikeGears = "18";
		String roadBikeFrameMaterial = "carbon";
		
		String mtbMake = "Rocky Mountain";
		String mtbModel = "Thunderbolt 730";
		String mtbGears = "18";
		String mtbFrameMaterial = "aluminum";
		String mtbFrameType = "Full Suspension";
		
		Bicycles bicycles = new Bicycles(null, null, null, null, null);
		
		bicycles.setModel(roadBikeModel);
		bicycles.setMake(roadBikeMake);
		bicycles.setGears(roadBikeGears);
		bicycles.setFrameMaterial(roadBikeFrameMaterial);
		System.out.println("My Road bike is " + bicycles.getMake() + " " + bicycles.getModel() +".");
		System.out.println("The " + bicycles.getMake() +" is made of " + bicycles.getFrameMaterial() +".");
		System.out.println("It's a " + bicycles.getGears() + " speed.");
		
		System.out.println(" ");
		
		bicycles.setModel(mtbModel);
		bicycles.setMake(mtbMake);
		bicycles.setGears(mtbGears);
		bicycles.setFrameMaterial(mtbFrameMaterial);
		bicycles.setMtbFrameType(mtbFrameType);
		System.out.println("My mountain bike is " + bicycles.getMake() + " " + bicycles.getModel() +".");
		System.out.println("The " + bicycles.getMake() + " is an " + bicycles.getFrameMaterial() + " frame and it is a " + bicycles.getMtbFrameType() +".");
		System.out.println("It's a " + bicycles.getGears() + " speed.");
	}

}
