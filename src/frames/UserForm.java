package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm {
    private JPanel rootPanel;
    private JPanel centerPanel;
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
                if(name.getText().equals("")){
                    JOptionPane.showMessageDialog(
                            rootPanel,
                            "Введите имя!");
                }
                if(surName.getText().equals("")){
                    JOptionPane.showMessageDialog(
                            rootPanel,
                            "Введите фамилию!");
                }
                if(patronymic.getText().equals("")){
                    JOptionPane.showConfirmDialog(
                            rootPanel,
                            "Уверены ли Вы в том, что не хотите установить отчество?",
                            "Уверены ли Вы в том, что не хотите установить отчество?",
                            JOptionPane.YES_NO_OPTION);
                }
            }
        });
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }
}
