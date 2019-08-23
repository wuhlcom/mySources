package design.compenent;

//组合模式解决部分与整体的表达不一致问题
// 组合模式优点
//         高层模块调用简单。组合模式中，用户不用关心到底是处理简单组件还是复合组件，可以按照统一的接口处理。不必判断组件类型，更不用为不同类型组件分开处理。
//         组合模式可以很容易的增加新的组件。若要增加一个简单组件或复合组件，只须找到它的父节点即可，非常容易扩展，符合“开放-关闭”原则。
// 组合模式缺点
//         无法限制组合组件中的子组件类型。在需要检测组件类型时，不能依靠编译期的类型约束来实现，必须在运行期间动态检测。
public class Test {
    public static void main(String[] args) {
        Node driveD = new Folder("D盘");

        Node doc = new Folder("文档");
        doc.add(new File("简历.doc"));
        doc.add(new File("项目介绍.ppt"));

        driveD.add(doc);
        Node music = new Folder("音乐");

        Node jay = new Folder("周杰伦");
        jay.add(new File("双截棍.mp3"));
        jay.add(new File("告白气球.mp3"));
        jay.add(new File("听妈妈的话.mp3"));

        Node jack = new Folder("张学友");
        jack.add(new File("吻别.mp3"));
        jack.add(new File("一千个伤心的理由.mp3"));

        music.add(jay);
        music.add(jack);
        driveD.add(music);

        driveD.ls();
    }
}
