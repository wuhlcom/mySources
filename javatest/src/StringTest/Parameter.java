package stringTest;

public class Parameter {
    public static void main(String[] args) {
        Integer total=0;
        parameCheck(total);
        System.out.println(total);
        System.out.println(findResult());

    }

    public static void parameCheck(Integer total){
        if (total<1){
            total+=1;
        };
    }


    public static boolean findResult() {
        try {
            return true;
        }catch (Exception e ){
            return true;
        }finally {
            return false;
        }

    }
}
