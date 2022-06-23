package abstractFactory;

public class BankingTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}
