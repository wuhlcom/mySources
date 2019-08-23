package design.chain;

public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void manage(int salary) {
        System.out.println("加薪要求："+salary);
       if (salary<=1000){
           System.out.println(name+":批准加薪\n\n");
       }else {
           this.nextManager.manage(salary);
       }
    }
}
