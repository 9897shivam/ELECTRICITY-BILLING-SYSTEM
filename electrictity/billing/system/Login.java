

package electrictity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login, cancel, signup;
    JTextField username, password;
    Choice loginin;
    Login(){
        super("Login page");
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        JLabel uname = new JLabel("Username");
        uname.setBounds(300, 20, 150, 20 );
        add(uname);

        username = new JTextField();
        username.setBounds(400, 20, 150, 20);
        add(username);

        JLabel pswd = new JLabel("Password");
        pswd.setBounds(300, 60, 100, 20 );
        add(pswd);

        password = new JTextField();
        password .setBounds(400, 60, 150, 20);
        add(password );


        JLabel logininas = new JLabel("Login in as");
        logininas.setBounds(300, 100, 100, 20 );
        add(logininas);

        // text option in log in as

        loginin = new Choice();
        loginin.add("Admin");
        loginin.add("Customer");
        loginin.setBounds(400, 100, 150, 20);
        add(loginin);


        JTextField loguser = new JTextField();
        loguser .setBounds(400, 100, 150, 20);
        add(loguser);

        // Button
        login = new JButton("Login");
        login.setBounds(330, 160, 100, 20);
        login.addActionListener(this);
        add(login); 

        signup = new JButton("Signup");
        signup.setBounds(450, 160, 100, 20);
        signup.addActionListener(this);
        add(signup); 

        cancel = new JButton("Cancel");
        cancel.setBounds(400, 200, 100, 20);
        cancel.addActionListener(this);
        add(cancel); 

       




        setSize(640, 300);
        setLocation(400, 200);
        setVisible(true);
       
    }


    public static void main(String args[]){

        new Login();
    
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==login){
            
            String suser = username.getText();
            String spassword = password.getText();
            String user = loginin.getSelectedItem();
            
            try{
                
                Conn c = new Conn();
                String query = "select * from login where username = '"+suser+"'and password = '"+spassword+"'and user ='"+user+"'" ;
                
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    String meter = rs.getString("meter_nov");
                   setVisible(false);
                   new Project(user, meter);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Inavalid login");
                    username.setText("");
                    password.setText("");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
        else if(ae.getSource()==cancel){
            setVisible(false);
        }
        else if(ae.getSource()==signup){
            setVisible(false);

            new Signup();
        }

        
        
    }
    
}

