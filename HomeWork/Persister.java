import out.production.HomeWork.Saver;

public class Persister implements Saver {
	private User user;
	
	public Persister(User user){
		this.user = user;
	}
	
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}