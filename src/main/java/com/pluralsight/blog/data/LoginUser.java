package com.pluralsight.blog.data;




public class LoginUser {

public LoginUser(){
    
}

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}







//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

//public class LoginUser extends JFrame implements ActionListener {
//    JPanel panel;
//    JLabel user_label, password_label, message;
//    JTextField userName_text;
//    JPasswordField password_text;
//    JButton submit, cancel;
//    LoginUser(){
//        user_label = new JLabel();
//        user_label.setText("User Name :");
//        userName_text = new JTextField();
//
//        password_label = new JLabel();
//        password_label.setText("Password :");
//        password_text = new JPasswordField();
//
//        submit = new JButton("SUBMIT");
//        panel = new JPanel(new GridLayout(3, 1));
//        panel.add(user_label);
//        panel.add(userName_text);
//        panel.add(password_label);
//        panel.add(password_text);
//        message = new JLabel();
//        panel.add(message);
//        panel.add(submit);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        submit.addActionListener(this);
//        add(panel, BorderLayout.CENTER);
//        setTitle("Please Login Here !");
//        setSize(450,350);
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        new LoginUser();
//    }
//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        String userName = userName_text.getText();
//        String password = password_text.getText();
//        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
//            message.setText(" Hello " + userName + "");
//        } else {
//            message.setText(" Invalid user.. ");
//        }
//    }
//
//
//}
