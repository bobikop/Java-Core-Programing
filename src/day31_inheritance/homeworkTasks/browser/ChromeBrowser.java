package day31_inheritance.homeworkTasks.browser;

public class ChromeBrowser extends  Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowse() {
        System.out.println("closing chrome browser");
    }

    @Override
    public String toString() {
        return super.toString() + " is my favorite web browser";
    }
}
/*

            1. ChromeBrowser
                    methods:
                        openBrowser(): prints "opening chrome browser"
                        closeBrowser():  prints "closing chrome browser"



 */