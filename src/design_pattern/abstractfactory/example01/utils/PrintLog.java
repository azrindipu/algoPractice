package design_pattern.abstractfactory.example01.utils;

public class PrintLog {

    public static void booting(){
        System.out.println("I am booting.....");
    }

    public static void printAlert(String string){
        System.out.println("I am a "+string+" type alert box");
    }

    public static void printPopup(String string){
        System.out.println("I am a "+string+" type pop up");
    }
}
