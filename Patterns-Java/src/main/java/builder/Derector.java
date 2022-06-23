package builder;

public class Derector {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite bildWebSite() {
        builder.createWebSite();
        builder.buildCms();
        builder.buildName();
        builder.buildPrice();

        WebSite webSite = builder.getWebSite();

        return webSite;
    }
}