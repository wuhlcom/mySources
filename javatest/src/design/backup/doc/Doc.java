package design.backup.doc;

//文档对象
public class Doc {
    private String title;
    private String body;

    public Doc(String title) {
        this.title = title;
        this.body = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public History creatHistory(){
        return new History(body);
    }

    public void restore(History history){
           this.body=history.getBody()+"\n";
    }
}
