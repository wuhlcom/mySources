package object;

import java.util.ArrayList;
import java.util.List;

public class Variable {

    public static String V_Static = "h";

    private String v;
    private List<Integer> numbers=new ArrayList<Integer>();

    public String set(String str) {
        this.v = str;
        return str;
    }

    public String set2(String str) {
        this.v = str;
        return str;
    }

    public String getV() {
        System.out.println(v);
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getV_Static() {
        System.out.println(Variable.V_Static);
        return Variable.V_Static;
    }

    public void setV_Static(String str) {
        Variable.V_Static = str;
    }

    public void listAdd(Integer i) {
        this.numbers.add(i);
    }
    public void listAdd2(Integer i) {
        this.numbers.add(i);
    }

    public List<Integer> getNumbers() {
        System.out.println(numbers);
        return this.numbers;
    }

}
