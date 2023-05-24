import out.production.HomeWork.Reportable;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister(user);
		Reported report = new Reported(user);
		persister.save();
		report.report();
	}
}