import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        //JOptionPane.showMessageDialog(null, input,"title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,
                "รักหรือเปล่า",
                "ถามเธอ", JOptionPane.YES_NO_CANCEL_OPTION);
        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักน้ะจุ๊บๆ");

        }else{
            JOptionPane.showMessageDialog(null,"จำไว้เลย");
        }
    }
}
