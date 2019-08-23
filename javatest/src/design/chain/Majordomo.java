package design.chain;

public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void manage(int salary) {
        if(salary<=5000){
            System.out.println(name+":批准加薪\n\n");
        }else{
            this.nextManager.manage(salary);
        }
    }
}
