package cn.cienet.bannerLib;

public class BannerItem implements IBannerItem {
    
	String url;
    public BannerItem(String url){
        this.url = url;
    }
    
    @Override
    public String getUrl() {
        return url;
    }
}
