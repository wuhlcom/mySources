package swing;


import javax.swing.*;
import java.awt.*;

public class TestSwing {
    /**{
     * 创建并显示GUI。出于线程安全的考虑，
     * 这个方法在事件调用线程中调用。
     */
    private static void createAndShowGUI() {
        // 确保一个漂亮的外观风格
        JFrame.setDefaultLookAndFeelDecorated(true);

        // 创建及设置窗口
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension=new Dimension(400,300);
        frame.setPreferredSize(dimension);
        frame.setVisible(true);

        // 添加 "Hello World" 标签
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // 显示窗口
        frame.pack();

    }

    public static void main(String[] args) {
        createAndShowGUI();
        // 显示应用 GUI
       // SwingUtilities.invokeLater(new Runnable() {
       //      public void run() {
       //          createAndShowGUI();
       //      }
       //  });
    }
}
