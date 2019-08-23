package design.bridge;

public class PDFConver implements Conver {
    @Override
    public void doConver() {
        System.out.println("转换成pdf");
    }
}
