package main;

import data.Dept;
import data.Sex;
import ui_component.LockActionListener;
import ui_component.TButton;
import ui_component.TTable;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class Main {

    private static void init_S() {
        try {
            String sql = "INSERT INTO S (SNO, SNAME, AGE, SEX, SDEPT) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement prepareStatement = database_cnt.prepareStatement(sql);
            for (int i = 0; i < 10; i++) {
                String sno = "1800236526" + i;
                String sname = "古天龙";
                int age = 56;
                String sex = Sex.MAN.toString();
                String sdept = Dept.SOFTWARE.toString();

                prepareStatement.setString(1, sno);
                prepareStatement.setString(2, sname);
                prepareStatement.setInt(3, age);
                prepareStatement.setString(4, sex);
                prepareStatement.setString(5, sdept);

                prepareStatement.addBatch();
            }
            prepareStatement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void init_C() {
        try {
            String sql = "INSERT INTO C (CNO, CNAME, CDEPT, TNAME) VALUES (?, ?, ?, ?)";
            PreparedStatement prepareStatement = database_cnt.prepareStatement(sql);
            for (int i = 0; i < 10; i++) {
                String no = "2010246" + i;
                String name = "高等数学";
                String dept = Dept.SOFTWARE.toString();
                String tname = "老王";

                prepareStatement.setString(1, no);
                prepareStatement.setString(2, name);
                prepareStatement.setString(3, dept);
                prepareStatement.setString(4, tname);

                prepareStatement.addBatch();
            }
            prepareStatement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void init_SC() {
        try {
            String sql = "INSERT INTO SC (SNO, CNO, GRADE) VALUES (?, ?, ?)";
            PreparedStatement prepareStatement = database_cnt.prepareStatement(sql);
            for (int i = 0; i < 10; i++) {
                String sno = "1800236526" + i;
                String cno = "2010246" + i;
                float grade = 98.9f;

                prepareStatement.setString(1, sno);
                prepareStatement.setString(2, cno);
                prepareStatement.setFloat(3, grade);

                prepareStatement.addBatch();
            }
            prepareStatement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void show_sql_result(Vector<String> header_names, Vector<Vector<Object>> values, int question_index, @Nullable String title) {
        if (title == null){
            title = "查询结果";
        }
        JPanel panel = new JPanel(new BorderLayout());
        JTable table = new TTable(values, header_names);

        panel.add(table.getTableHeader(), BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);

        JFrame frame = SingleInstance.getQuestionForm(question_index);
        frame.setTitle(title);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static List<Map.Entry<ActionListener, String>> new_default_button_data_list(){
        List<Map.Entry<ActionListener, String>> res = new LinkedList<>();
        res.add(new AbstractMap.SimpleEntry<>(new LockActionListener(res.size()) {
            @Override
            public void actionPerformed_(ActionEvent e) {
                try {
                    PreparedStatement prepareStatement = database_cnt.prepareStatement("SELECT SNO, SNO, GRADE FROM SC");
                    ResultSet rs = prepareStatement.executeQuery();
                    Vector<String> headers = new Vector<>(){
                        {
                            add("学号");
                            add("课号");
                            add("成绩");
                        }};
                    Vector<Vector<Object>> values = new Vector<>();
                    while(rs.next()){
                        Vector<Object> value = new Vector<>();
                        String sno  = rs.getString("SNO");
                        String cno = rs.getString("SNO");
                        float grade = rs.getFloat("GRADE");

                        value.add(sno);
                        value.add(cno);
                        value.add(grade);

                        values.add(value);
                    }
                    show_sql_result(headers, values, (Integer) this.data, "所有年龄在20岁以下的学生姓名及年龄");
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }, "3.查所有年龄在20岁以下的学生姓名及年龄。"));
        res.add(new AbstractMap.SimpleEntry<>(new LockActionListener(res.size()) {
            @Override
            public void actionPerformed_(ActionEvent e) {
                try {
                    PreparedStatement prepareStatement = database_cnt.prepareStatement("SELECT SNO, SNO, GRADE FROM SC");
                    ResultSet rs = prepareStatement.executeQuery();
                    Vector<String> headers = new Vector<>(){
                        {
                            add("学号");
                            add("课号");
                            add("成绩");
                        }};
                    Vector<Vector<Object>> values = new Vector<>();
                    while(rs.next()){
                        Vector<Object> value = new Vector<>();
                        String sno  = rs.getString("SNO");
                        String cno = rs.getString("SNO");
                        float grade = rs.getFloat("GRADE");

                        value.add(sno);
                        value.add(cno);
                        value.add(grade);

                        values.add(value);
                    }
                    show_sql_result(headers, values, (Integer) this.data, "考试成绩有不及格的学生的学号");
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }, "4.查考试成绩有不及格的学生的学号。"));
        res.add(new AbstractMap.SimpleEntry<>(new LockActionListener(res.size()) {
            @Override
            public void actionPerformed_(ActionEvent e) {
                try {
                    PreparedStatement prepareStatement = database_cnt.prepareStatement("SELECT SNO, SNO, GRADE FROM SC");
                    ResultSet rs = prepareStatement.executeQuery();
                    Vector<String> headers = new Vector<>(){
                        {
                            add("学号");
                            add("课号");
                            add("成绩");
                        }};
                    Vector<Vector<Object>> values = new Vector<>();
                    while(rs.next()){
                        Vector<Object> value = new Vector<>();
                        String sno  = rs.getString("SNO");
                        String cno = rs.getString("SNO");
                        float grade = rs.getFloat("GRADE");

                        value.add(sno);
                        value.add(cno);
                        value.add(grade);

                        values.add(value);
                    }
                    show_sql_result(headers, values, (Integer) this.data, "所有年龄在20至23岁之间的学生姓名、系别及年龄");
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }, "5.查所有年龄在20至23岁之间的学生姓名、系别及年龄。"));
        res.add(new AbstractMap.SimpleEntry<>(new LockActionListener(res.size()) {
            @Override
            public void actionPerformed_(ActionEvent e) {
                try {
                    PreparedStatement prepareStatement = database_cnt.prepareStatement("SELECT SNO, SNO, GRADE FROM SC");
                    ResultSet rs = prepareStatement.executeQuery();
                    Vector<String> headers = new Vector<>(){
                        {
                            add("学号");
                            add("课号");
                            add("成绩");
                        }};
                    Vector<Vector<Object>> values = new Vector<>();
                    while(rs.next()){
                        Vector<Object> value = new Vector<>();
                        String sno  = rs.getString("SNO");
                        String cno = rs.getString("SNO");
                        float grade = rs.getFloat("GRADE");

                        value.add(sno);
                        value.add(cno);
                        value.add(grade);

                        values.add(value);
                    }
                    show_sql_result(headers, values, (Integer) this.data, "计算机系、数学系、信息系的学生姓名、性别");
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }, "6.查计算机系、数学系、信息系的学生姓名、性别。"));
        res.add(new AbstractMap.SimpleEntry<>(new LockActionListener(res.size()) {
            @Override
            public void actionPerformed_(ActionEvent e) {
                try {
                    PreparedStatement prepareStatement = database_cnt.prepareStatement("SELECT SNO, SNO, GRADE FROM SC");
                    ResultSet rs = prepareStatement.executeQuery();
                    Vector<String> headers = new Vector<>(){
                        {
                            add("学号");
                            add("课号");
                            add("成绩");
                        }};
                    Vector<Vector<Object>> values = new Vector<>();
                    while(rs.next()){
                        Vector<Object> value = new Vector<>();
                        String sno  = rs.getString("SNO");
                        String cno = rs.getString("SNO");
                        float grade = rs.getFloat("GRADE");

                        value.add(sno);
                        value.add(cno);
                        value.add(grade);

                        values.add(value);
                    }
                    show_sql_result(headers, values, (Integer) this.data, "既不是计算机系、数学系、又不是信息系的学生姓名、性别");
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }, "7.查既不是计算机系、数学系、又不是信息系的学生姓名、性别。"));
        res.add(new AbstractMap.SimpleEntry<>(new LockActionListener(res.size()) {
            @Override
            public void actionPerformed_(ActionEvent e) {
                try {
                    PreparedStatement prepareStatement = database_cnt.prepareStatement("SELECT SNO, SNO, GRADE FROM SC");
                    ResultSet rs = prepareStatement.executeQuery();
                    Vector<String> headers = new Vector<>(){
                        {
                            add("学号");
                            add("课号");
                            add("成绩");
                        }};
                    Vector<Vector<Object>> values = new Vector<>();
                    while(rs.next()){
                        Vector<Object> value = new Vector<>();
                        String sno  = rs.getString("SNO");
                        String cno = rs.getString("SNO");
                        float grade = rs.getFloat("GRADE");

                        value.add(sno);
                        value.add(cno);
                        value.add(grade);

                        values.add(value);
                    }
                    show_sql_result(headers, values, (Integer) this.data, "所有姓“刘”的学生的姓名、学号和性别");
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }, "8.查所有姓“刘”的学生的姓名、学号和性别。"));
        res.add(new AbstractMap.SimpleEntry<>(new LockActionListener(res.size()) {
            @Override
            public void actionPerformed_(ActionEvent e) {
                try {
                    PreparedStatement prepareStatement = database_cnt.prepareStatement("SELECT SNO, SNO, GRADE FROM SC");
                    ResultSet rs = prepareStatement.executeQuery();
                    Vector<String> headers = new Vector<>(){
                        {
                            add("学号");
                            add("课号");
                            add("成绩");
                        }};
                    Vector<Vector<Object>> values = new Vector<>();
                    while(rs.next()){
                        Vector<Object> value = new Vector<>();
                        String sno  = rs.getString("SNO");
                        String cno = rs.getString("SNO");
                        float grade = rs.getFloat("GRADE");

                        value.add(sno);
                        value.add(cno);
                        value.add(grade);

                        values.add(value);
                    }
                    show_sql_result(headers, values, (Integer) this.data, "姓“上官”且全名为3个汉字的学生姓名");
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }, "9.查姓“上官”且全名为3个汉字的学生姓名。"));
        res.add(new AbstractMap.SimpleEntry<>(new LockActionListener(res.size()) {
            @Override
            public void actionPerformed_(ActionEvent e) {
                try {
                    PreparedStatement prepareStatement = database_cnt.prepareStatement("SELECT SNO, SNO, GRADE FROM SC");
                    ResultSet rs = prepareStatement.executeQuery();
                    Vector<String> headers = new Vector<>(){
                        {
                            add("学号");
                            add("课号");
                            add("成绩");
                        }};
                    Vector<Vector<Object>> values = new Vector<>();
                    while(rs.next()){
                        Vector<Object> value = new Vector<>();
                        String sno  = rs.getString("SNO");
                        String cno = rs.getString("SNO");
                        float grade = rs.getFloat("GRADE");

                        value.add(sno);
                        value.add(cno);
                        value.add(grade);

                        values.add(value);
                    }
                    show_sql_result(headers, values, (Integer) this.data, "所有不姓“张”的学生的姓名");
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }, "10.查所有不姓“张”的学生的姓名。"));
        return res;
    }

    private static JPanel new_buttons_panel(@Nullable List<Map.Entry<ActionListener, String>> data){
        if (data == null){
            data = new_default_button_data_list();
        }
        GridLayout gridLayout = new GridLayout(0, 1);
        JPanel panel = new JPanel(gridLayout);
        for(Map.Entry<ActionListener, String> d : data) {
            panel.add(new TButton(d.getKey(), d.getValue()));
        }
        return panel;
    }

    private static void show_function_menu(){
        JFrame frame = SingleInstance.getFunction_menu_form();
        frame.setTitle("主菜单");
        frame.setContentPane(new_buttons_panel(null));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private volatile static Connection database_cnt = null;

    public static void main(String[] args) {
        String url = "jdbc:sqlite:test.sqlite";
        String username = null;
        String password = null;

        try {
            database_cnt = getConnection(url, username, password);

            database_cnt.prepareStatement("DELETE from SC").executeUpdate(); // delete SC first, due to foreign key constraint
            database_cnt.prepareStatement("DELETE from S").executeUpdate();
            database_cnt.prepareStatement("DELETE from C").executeUpdate();

            init_S();
            init_C();
            init_SC(); // init SC last, due to foreign key constraint
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return;
        }

        show_function_menu();
    }
}
