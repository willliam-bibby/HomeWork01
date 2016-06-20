
public class FlowerBed {

	public int radius;

	public FlowerBed (int radius) {
		this.radius = radius;
	}
	
	public Double getCircumference () {
		return this.radius * Math.PI * 2; 
	}
	
	public Double getArea () {
		return this.radius * this.radius * Math.PI; 
	}

}
