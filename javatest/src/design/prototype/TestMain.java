package design.prototype;

public class TestMain {

    public static void main(String[] args) {
        Resume r1 = new Resume("张三");
        r1.setAge(33);
        r1.setSex("男");
        r1.setCompany("博彦");
        r1.setDate("2011-03");
        Resume r2 = r1.clone();
        r2.setAge(32);

        // System.out.println(r1);
        // System.out.println(r2);
        r1.display();
        r2.display();


        ResumeDeep resumeDeep= new ResumeDeep("李四");
        resumeDeep.setAge(21);
        resumeDeep.setSex("女");
        resumeDeep.setExpirence("2015-3","知路");
        ResumeDeep resumeDeep1=(ResumeDeep) resumeDeep.clone();
        resumeDeep1.setExpirence("2016-3","知路");
        // System.out.println(resumeDeep);
        // System.out.println(resumeDeep1);
        resumeDeep.display();
        resumeDeep1.display();
    }
}
