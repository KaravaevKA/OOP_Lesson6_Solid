import jdk.javadoc.doclet.Reporter;
import out.production.HomeWork.Reportable;

public class Reported implements Reportable {
    private User user;

    public Reported(User user) {
        this.user = user;
    }
    @Override
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
