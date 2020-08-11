package Package1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String keyPro = "11111";
        final String keyExpert = "12345";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input key: ");
        String key = scanner.nextLine();
        //scanner.close();
        DocumentWorker documentWorker;
        
        switch (key) {
        case keyPro: {
            documentWorker = new ProDocumentWorker();
            break;
        }
        case keyExpert: {
            documentWorker = new ExpertDocumentWorker();
            break;
        }
        default:
            documentWorker = new DocumentWorker();
            break;
        }
        
        System.out.println("Input kode: \n1:Open\n2:Edit\n3:Save\n");
        int kode = scanner.nextInt();
        switch (kode) {
        case 1: {
            documentWorker.openDocument();
            break;
        }
        case 2:{
            documentWorker.editDocument();
            break;
        }
        case 3:{
            documentWorker.saveDocument();
            break;
        }
        }
    }

}
