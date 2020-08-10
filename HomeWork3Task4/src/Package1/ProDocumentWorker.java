package Package1;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }
    @Override
    public void saveDocument() {
        System.out.println("окумент сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
