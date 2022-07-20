package day31_inheritance.homeworkTasks.browser;

public class FireFox extends Browser{


    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowse() {
        System.out.println("closing firefox browser");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
/*
  2. FireFox extends Browser
                    methods:
                        openBrowser(): prints "opening firefox browser"
                        closeBrowser(): prints "closing fire fox browser"

            3. Opera extends Browser
                    methods:
                        openBrowser(): prints "opening opera browser"
                        closeBrowser(): prints "closing opera browser"

            4. Safari extends Browser
                    methods:
                        openBrowser(): prints "opening safari browser"
                        closeBrowser(): prints "closing safari browser"
 */