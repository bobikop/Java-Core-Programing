package day31_inheritance.homeworkTasks.browser;

public class Safari extends  Browser{
    @Override
    public void openBrowser() {
        System.out.println("opening safari browser");
    }

    @Override
    public void closeBrowse() {
        System.out.println("closing safari browser");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
/*
 4. Safari extends Browser
                    methods:
                        openBrowser(): prints "opening safari browser"
                        closeBrowser(): prints "closing safari browser"
 */