package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm {
    private JPanel rootPanel;
    private JTextField surName;
    private JTextField patronymic;
    private JTextField name;
    private JTextField cityOfResidence;
    private JFormattedTextField birthday;
    private JButton save;

    public UserForm() {
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(name.getText()==""||name.getText()==null){
                    System.out.println(name.getText());
                    JOptionPane.showMessageDialog(rootPanel,"Введите имя!");
                }
                if(surName.getText()==""||surName.getText()==null){
                    JOptionPane.showMessageDialog(rootPanel,"Введите фамилию!");
                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
