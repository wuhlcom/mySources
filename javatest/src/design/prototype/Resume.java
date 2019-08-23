package design.prototype;


/*      一般而言，Java语言中的clone()方法满足：

          (1) 对任何对象x，都有x.clone() != x，即克隆对象与原型对象不是同一个对象；

          (2) 对任何对象x，都有x.clone().getClass() == x.getClass()，即克隆对象与原型对象的类型一样；

          (3) 如果对象x的equals()方法定义恰当，那么x.clone().equals(x)应该成立。

          为了获取对象的一份拷贝，我们可以直接利用Object类的clone()方法，具体步骤如下：

          (1) 在派生类中覆盖基类的clone()方法，并声明为public；

          (2) 在派生类的clone()方法中，调用super.clone()；

          (3)派生类需实现Cloneable接口。

          此时，Object类相当于抽象原型类，所有实现了Cloneable接口的类相当于具体原型类。*/

public class Resume implements Cloneable {

    private String name;
    private Integer age;
    private String sex;
    private String company;
    private String date;

    public Resume() {
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Resume(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPersonInfo(String sex,Integer age){
        this.sex=sex;
        this.age=age;
        System.out.println("性别:"+sex);
        System.out.println("年龄:"+age);
    }


    public void setExpirence(String date,String company){
        this.date=date;
        this.company=company;
        System.out.println("工作时间:"+date);
        System.out.println("公司:"+company);
    }

    public void display(){
        System.out.println("姓名:"+name);
        System.out.println("性别:"+sex);
        System.out.println("年龄:"+age);
        System.out.println("工作时间:"+date);
        System.out.println("公司:"+company);
    }



    public Resume clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (Resume) obj;
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
        return (Resume) obj;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", company='" + company + '\'' +
                ", date='" + date + '\'' +
                '}';
    }


}
