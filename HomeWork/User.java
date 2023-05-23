import out.production.HomeWork.Reporter;
import out.production.HomeWork.Saver;

public class User implements Saver, Reporter {
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void save(){
		Persister persister = new Persister(this);
		persister.save();
	}
	
	public void report(){
		System.out.println("Report for user: " + name);
	}
}