
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminUI {
    public JFrame view;

    public JButton btnSystemConfig = new JButton("Set System Configuration");
    public JButton btnAddUser = new JButton("Add a New User");
    public JButton btnDeleteUser = new JButton("Delete an Existing User");

    public AdminUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Manager View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnSystemConfig);
        panelButtons.add(btnAddUser);
        panelButtons.add(btnDeleteUser);

        view.getContentPane().add(panelButtons);

//        btnSystemConfig.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                ui.view.setVisible(true);
//            }
//        });

        btnAddUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                NewUserUI ui = new NewUserUI();
                ui.setVisible(true);
            }
        });

        btnDeleteUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DeleteUserUI ui = new DeleteUserUI();
                ui.setVisible(true);
            }
        } );

    }
}
