package ui_component;

import javax.swing.*;
import java.util.Vector;

public class TTable extends JTable {
    public TTable(Vector<? extends Vector> rowData, Vector<?> columnNames) {
        super(rowData, columnNames);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
