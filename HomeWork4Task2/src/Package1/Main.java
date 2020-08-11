package Package1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input type document:\n");
        String typeString = scanner.nextLine();
        scanner.close();
        switch (typeString) {
        case "DOC": {
            DOCHandler handler = new DOCHandler();
            handler.open();
            handler.create();
            handler.change();
            handler.save();
            break;
        }
        case "TXT": {
            TXTHandler handler = new TXTHandler();
            handler.open();
            handler.create();
            handler.change();
            handler.save();
            break;
        }
        case "XML":{
            XMLHandler handler = new XMLHandler();
            handler.open();
            handler.create();
            handler.change();
            handler.save();
            break;
        }
        default:
            System.out.println("Input type is not corrected");
            break;
        }
    }

}
