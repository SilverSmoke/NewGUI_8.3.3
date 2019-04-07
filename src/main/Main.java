package main;

import frames.UserForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        UserForm form = new UserForm();
        frame.setContentPane(form.getCenterPanel());

        frame.setTitle("GUI Basics");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
