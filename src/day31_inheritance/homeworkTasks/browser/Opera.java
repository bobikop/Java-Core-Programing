package day31_inheritance.homeworkTasks.browser;

public class Opera extends Browser{
    @Override
    public void openBrowser() {
        System.out.println("opening opera browser");
    }

    @Override
    public void closeBrowse() {
        System.out.println("closing opera browser");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
/*
 3. Opera extends Browser
                    methods:
                        openBrowser(): prints "opening opera browser"
                        closeBrowser(): prints "closing opera browser"
 */