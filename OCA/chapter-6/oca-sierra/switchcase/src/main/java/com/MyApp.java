package com;

import com.foo.*;

public class MyApp {
    EnumSize enumSizeBig = EnumSize.BIG;

    public static void main(String[] arg) {
        MyApp app = new MyApp();
        app.switchForEnum(app.enumSizeBig);
    }

    void switchForEnum(EnumSize es) {
        switch (es.getSize()) {
            case 1: {
                System.out.println("Size is small!");
                break;
            }
            case 2: {
                System.out.println("Size is medium!");
                break;
            }
            default: {
                System.out.println("Unknown size");
                break;
            }
            case 4: {
                System.out.println("Size is big!");
                break;
            }
        }
    }

    void doSwitch(String string) {
        String s = "JarJarBinks".toLowerCase();
        switch (string) {
            case "red":
                System.out.println("Case is 32");
            case "grean":
                System.out.println("Case is 42");
            case "re":
                System.out.println("Case is 12");
            case "bar":
                System.out.println("Case is 22");
            default:
                System.out.println("Switch is done");
        }
    }
}