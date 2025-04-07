package ex_18_Opps_Polymorphism;

public class Lab068_mehtod_overiding2 {
    public static void main(String[] args) {
        Chrome c1=new Chrome();
        c1.openBrowser();
        Firefox f1=new Firefox();
        f1.openBrowser();
        CommonToAll cm=new CommonToAll();
        cm.openBrowser();
        CommonToAll c3=new Chrome();
        c3.openBrowser();
        CommonToAll c4=new Firefox();
        c4.openBrowser();
    }
}
class CommonToAll{
    void openBrowser(){
        System.out.println("Open brwoser");
    }

}
class Chrome extends CommonToAll{
    @Override
    void openBrowser() {
        System.out.println("Chrome will open");
    }
}
class Firefox extends CommonToAll{
    void openBrowser(){
        System.out.println("Firefox");
    }
}

