package abstractFactory;

public class WebsitePM implements ProjectManager{
    @Override
    public void manageProject() {
        System.out.println("PM manages website...");
    }
}
