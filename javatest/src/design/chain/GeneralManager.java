package design.chain;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void manage(int salary) {
        if(salary<=10000){
            System.out.println(name+":批准加薪\n\n");
        }else{
            System.out.println(name+":不符合加薪制度");
        }
    }
}
