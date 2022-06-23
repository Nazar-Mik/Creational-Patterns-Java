package builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("EnterpriseSite");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
    webSite.setPrice(10000);
    }
}
