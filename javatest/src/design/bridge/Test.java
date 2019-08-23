package design.bridge;

public class Test {

    public static void main(String[] args) {
        Conver pdfConver =new PDFConver();
        Conver xmlConver=new XMLConver();

        System.out.println("=============mysql 数据转换==========");
        DataBase dataBase=new MySql(pdfConver);
        dataBase.conversion();
        dataBase.setConver(xmlConver);
        dataBase.conversion();

        System.out.println("=============Oracle 数据转换==========");
        DataBase dataBase1=new Oracle(pdfConver);
        dataBase1.conversion();
        dataBase1.setConver(xmlConver);
        dataBase1.conversion();
    }
}
