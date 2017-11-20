package GetSetters;

public class Bicycles {
	
	private String make;
	private String model;
	private String gears;
	private String frameMaterial;
	private String mtbFrameType;
	
	public Bicycles(String make, String model, String gears, String frameMaterial, String mtbFrameType){
		this.make = make;
		this.model = model;
		this.gears = gears;
		this.frameMaterial = frameMaterial;
		this.mtbFrameType = mtbFrameType;
	}
	public String getGears() {
		return gears;
	}
	public void setGears(String gears) {
		this.gears = gears;
	}
	public String getFrameMaterial() {
		return frameMaterial;
	}
	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}
	public String getMtbFrameType() {
		return mtbFrameType;
	}
	public void setMtbFrameType(String mtbFrameType) {
		this.mtbFrameType = mtbFrameType;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
