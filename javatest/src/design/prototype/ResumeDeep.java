package design.prototype;

public class ResumeDeep implements Cloneable {
    private String name;
    private Integer age;
    private String sex;
    private Expirence expirence;


    public ResumeDeep() {
    }

    public ResumeDeep(String name) {
        this.name = name;
        expirence = new Expirence();
    }

    public void setPersonInfo(String sex, Integer age) {
        this.sex = sex;
        this.age = age;
        System.out.println("性别:" + sex);
        System.out.println("年龄:" + age);
    }

    public void setExpirence(String date, String company) {
        expirence.setDate(date);
        expirence.setCompany(company);
    }

    public void display() {
        System.out.println("姓名:" + name);
        System.out.println("性别:" + sex);
        System.out.println("年龄:" + age);
        System.out.println("工作时间:" + expirence.getDate());
        System.out.println("公司:" + expirence.getCompany());
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Expirence getExpirence() {
        return expirence;
    }

    public void setExpirence(Expirence expirence) {
        this.expirence = expirence;
    }

    public ResumeDeep clone() {
        Object obj = null;
        try {
            obj = super.clone();
            ResumeDeep resumeDeep = (ResumeDeep) obj;
            resumeDeep.setExpirence((Expirence) expirence.clone());
            return resumeDeep;
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
        return (ResumeDeep) obj;
    }


    @Override
    public String toString() {
        return "ResumeDeep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", expirence=" + expirence +
                '}';
    }
}
