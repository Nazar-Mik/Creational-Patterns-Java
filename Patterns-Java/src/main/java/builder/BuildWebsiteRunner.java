package builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {

        Derector derector = new Derector();

        derector.setBuilder(new VisitCardWebsiteBuilder());

        WebSite webSite = derector.bildWebSite();

        System.out.println(webSite);
    }
}
