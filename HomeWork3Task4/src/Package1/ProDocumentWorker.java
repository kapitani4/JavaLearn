package Package1;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    public void editDocument() {
        System.out.println("�������� ��������������");
    }
    @Override
    public void saveDocument() {
        System.out.println("������� �������� � ������ �������, ���������� � ��������� �������� �������� � ������ �������");
    }
}
