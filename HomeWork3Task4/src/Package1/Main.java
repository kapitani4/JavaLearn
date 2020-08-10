package Package1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String keyPro = "11111";
        final String keyExpert = "12345";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input key: ");
        String key = scanner.nextLine();
        scanner.close();
        DocumentWorker documentWorker;
        
        switch (key) {
        case keyPro: {
            documentWorker = new ProDocumentWorker();
        }
        case keyExpert: {
            documentWorker = new ExpertDocumentWorker();
        }
        default:
            documentWorker = new DocumentWorker();
        }
        
        System.out.println("Input kode: \n1:Open\n2:Edit\n3:Save\n");
        Scanner sc = new Scanner(System.in);
        int kode = sc.nextInt();
        sc.close();
        switch (kode) {
        case 1: {
            documentWorker.openDocument();
        }
        case 2:{
            documentWorker.editDocument();
        }
        case 3:{
            documentWorker.saveDocument();
        }
        }
    }

}
