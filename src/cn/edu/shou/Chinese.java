package cn.edu.shou;

public class Chinese implements Person {
	private String location;

	/* No Spring:	
	public Chinese(String loc){
		this.location = loc;		
	}*/
	
	/*Spring:*/
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Chinese drink tea.");
		System.out.println("LOCATION is:"+this.location);		
	}
}
