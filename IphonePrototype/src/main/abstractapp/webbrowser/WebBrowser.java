package main.abstractapp.webbrowser;

public class WebBrowser {
    private Tab currentTab;

    public void openPage(String url) {
        System.out.println("Opening page: " + url);
    }

    public void addNewTab() {
        Tab newTab = new Tab();
        System.out.println("New tab added!");
    }

    public void reloadPage() {
        System.out.println("Page refreshed!");
    }
}
