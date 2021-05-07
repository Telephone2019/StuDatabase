package main;

import javax.swing.*;

public class SingleInstance {
    private static volatile JFrame function_menu_form = null;
    private static volatile JFrame question1_form = null;
    private static volatile JFrame question2_form = null;
    private static volatile JFrame question3_form = null;
    private static volatile JFrame question4_form = null;
    private static volatile JFrame question5_form = null;
    private static volatile JFrame question6_form = null;
    private static volatile JFrame question7_form = null;
    private static volatile JFrame question8_form = null;
    private static volatile JFrame question9_form = null;
    private static volatile JFrame question10_form = null;

    public static JFrame getQuestionForm(int index){
        return switch (index) {
            case 0 -> getQuestion1_form();
            case 1 -> getQuestion2_form();
            case 2 -> getQuestion3_form();
            case 3 -> getQuestion4_form();
            case 4 -> getQuestion5_form();
            case 5 -> getQuestion6_form();
            case 6 -> getQuestion7_form();
            case 7 -> getQuestion8_form();
            case 8 -> getQuestion9_form();
            case 9 -> getQuestion10_form();
            default -> throw new IllegalStateException("Unexpected value: " + index);
        };
    }

    public synchronized static JFrame getFunction_menu_form() {
        if (function_menu_form == null){
            function_menu_form = new JFrame("");
        }
        return function_menu_form;
    }

    public synchronized static JFrame getQuestion1_form() {
        if (question1_form == null){
            question1_form = new JFrame("");
        }
        return question1_form;
    }

    public synchronized static JFrame getQuestion2_form() {
        if (question2_form == null){
            question2_form = new JFrame("");
        }
        return question2_form;
    }

    public synchronized static JFrame getQuestion3_form() {
        if (question3_form == null){
            question3_form = new JFrame("");
        }
        return question3_form;
    }

    public synchronized static JFrame getQuestion4_form() {
        if (question4_form == null){
            question4_form = new JFrame("");
        }
        return question4_form;
    }

    public synchronized static JFrame getQuestion5_form() {
        if (question5_form == null){
            question5_form = new JFrame("");
        }
        return question5_form;
    }

    public synchronized static JFrame getQuestion6_form() {
        if (question6_form == null){
            question6_form = new JFrame("");
        }
        return question6_form;
    }

    public synchronized static JFrame getQuestion7_form() {
        if (question7_form == null){
            question7_form = new JFrame("");
        }
        return question7_form;
    }

    public synchronized static JFrame getQuestion8_form() {
        if (question8_form == null){
            question8_form = new JFrame("");
        }
        return question8_form;
    }

    public synchronized static JFrame getQuestion9_form() {
        if (question9_form == null){
            question9_form = new JFrame("");
        }
        return question9_form;
    }

    public synchronized static JFrame getQuestion10_form() {
        if (question10_form == null){
            question10_form = new JFrame("");
        }
        return question10_form;
    }
}
