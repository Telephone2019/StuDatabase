package ui_component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TButton extends JButton {
    public TButton(ActionListener actionListener, String text){
        super(text);
        setFont(new Font("微软雅黑", Font.PLAIN, 32));
        setMargin(new Insets(24,8,24,8));
        addActionListener(actionListener);
    }
}
