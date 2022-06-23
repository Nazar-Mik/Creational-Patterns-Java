package abstractFactory;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
