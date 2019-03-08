public class Car2{
	private String engineNumber;
	private String driver;
	private String quGou;
	public String getEngineNumber(){
		return this.engineNumber;
	}
	public Car2(String engineNumber){
		this.engineNumber = engineNumber;
	}
	public String getDriver(){
		return this.driver; 
	}
	public void setDriver(String driver){
		this.driver = driver;
	}
	public  String  quGou(){
		return this.quGou;
	}
	public void quGou(String quGou){
		this.quGou = quGou;
	}
	
	public void tell(){
		System.out.println(engineNumber+driver+quGou);
	}
	public static void main(String[] args){
		/*Car2 wlhg = new Car2();
		wlhg.setEngineNumber("chi翔");
		wlhg.setDriver("shabi");
		wlhg.tell();
		*/
	    Car2[] car = new Car2[]{
			new Car2("贱狗"),
			new Car2("贱狗"),
		};
		//car[0].setEngineNumber("大翔一号");
		car[0].setDriver("shabi");
		car[0].quGou("caonm");
		car[0].tell();
		
		//car[1].setEngineNumber("大翔we号");
		car[1].setDriver("shabi");
		car[1].quGou("caonm");
		car[1].tell();
	}
	
}