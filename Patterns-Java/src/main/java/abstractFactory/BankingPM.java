package abstractFactory;

public class BankingPM implements ProjectManager{
    @Override
    public void manageProject() {
        System.out.println("PM manages banking code...");
    }
}
