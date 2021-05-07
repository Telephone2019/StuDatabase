package ui_component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class LockActionListener implements ActionListener {
    public final Object data;

    public LockActionListener() {
        this.data = null;
    }

    public LockActionListener(Object data) {
        this.data = data;
    }

    private volatile boolean entered = false;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!entered){
            entered = true;
            actionPerformed_(e);
            entered = false;
        }
    }
    public abstract void actionPerformed_(ActionEvent e);
}
