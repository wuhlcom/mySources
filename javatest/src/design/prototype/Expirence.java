package design.prototype;

//将所引用的类也添加clone方法
public class Expirence implements Cloneable {

    private String date;
    private String company;

    public Expirence() {
    }

    public Expirence(String date, String company) {
        this.date = date;
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Expirence{" +
                "date='" + date + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
