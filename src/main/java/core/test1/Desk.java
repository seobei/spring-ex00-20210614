package core.test1;

//import lombok.Setter;
//import lombok.ToString;
//
//@Setter
//@ToString
public class Desk {
	private Leg leg;
	
//	public Desk(Leg leg) {
//		this.leg = leg;
//	}
	
	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	@Override
	public String toString() {
		return "Desk [leg=" + leg + "]";
	}
	
}
