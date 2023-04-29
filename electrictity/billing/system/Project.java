
package electrictity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    
    String atype, meter;
    Project(String atype, String meter){
        this.atype = atype;
        this.meter = meter;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        // First menu Bar 
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
       // mb.add(master);
        
        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced", Font.PLAIN, 12));
        newcustomer.setBackground(Color.WHITE);
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('D');
        newcustomer.addActionListener(this);
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        master.add(newcustomer);
        
        
        JMenuItem customerdtatails = new JMenuItem("Customer Details");
        customerdtatails.setFont(new Font("monospaced", Font.PLAIN, 12));
        customerdtatails.setBackground(Color.WHITE);
        
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerdtatails.setIcon(new ImageIcon(image2));
        customerdtatails.setMnemonic('M');
        customerdtatails.addActionListener(this);
        customerdtatails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        master.add(customerdtatails);
        
        
        JMenuItem depositdtatails = new JMenuItem("Deposit Details");
        depositdtatails.setFont(new Font("monospaced", Font.PLAIN, 12));
        depositdtatails.setBackground(Color.WHITE);
        
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        depositdtatails.setIcon(new ImageIcon(image3));
        depositdtatails.setMnemonic('M');
        depositdtatails.addActionListener(this);
        depositdtatails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        master.add(depositdtatails);
        
        
        
        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setBackground(Color.WHITE);
        calculatebill.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('R');
        calculatebill.addActionListener(this);
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        master.add(calculatebill);
        
        
        
        // Second Menu Bar
        
        
        JMenu info = new JMenu("Information");
        info.setForeground(Color.RED);
        //mb.add(info);
        
        JMenuItem updateinfo = new JMenuItem("Update Information");
        updateinfo.setBackground(Color.WHITE);
        updateinfo.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        updateinfo.setIcon(new ImageIcon(image5));
        updateinfo.setMnemonic('S');
        updateinfo.addActionListener(this);
        updateinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        info.add(updateinfo);
        
        JMenuItem viewinfo = new JMenuItem("View Information");
        viewinfo.setBackground(Color.WHITE);
        viewinfo.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(image6));
        viewinfo.setMnemonic('L');
        viewinfo.addActionListener(this);
        viewinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        info.add(viewinfo);
        
        // Third Menu Bar
        JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);
        //mb.add(user);
        
        JMenuItem paybill = new JMenuItem("Pay Bill");
        paybill.setBackground(Color.WHITE);
        paybill.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('P');
        paybill.addActionListener(this);
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        user.add(paybill);
        
        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setBackground(Color.WHITE);
        billdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon8.png"));
        Image image8= icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(image8));
        billdetails.setMnemonic('N');
        billdetails.addActionListener(this);
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        user.add(billdetails);
        
        //Fifth MenuBar
        JMenu report = new JMenu("Report");
        report.setForeground(Color.RED);
       // mb.add(report);
        
        JMenuItem generatebill = new JMenuItem("Generate Bill");
        generatebill.setBackground(Color.WHITE);
        generatebill.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        generatebill.setIcon(new ImageIcon(image9));
        generatebill.setMnemonic('G');
        generatebill.addActionListener(this);
        generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        report.add(generatebill);
        
        // Forth MenuBar
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
       // mb.add(utility);        
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image10 = icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(image10));
        notepad.setMnemonic('N');
        notepad.addActionListener(this);
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        utility.add(notepad);
        
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setBackground(Color.WHITE);
        calculator.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11));
        calculator.setMnemonic('C');
        calculator.addActionListener(this);
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        utility.add(calculator);
        
        // sixth MenuBar
        
        JMenu mexit = new JMenu("Exit");
        mexit.setForeground(Color.RED);
        //mb.add(mexit);
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.setBackground(Color.WHITE);
        exit.setFont(new Font("monospaced", Font.PLAIN, 12));
        
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image12 = icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image12));
        exit.setMnemonic('X');
        exit.addActionListener(this);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        mexit.add(exit);
        
        if (atype.equals("Admin")) {
            mb.add(master);
        } else {
            mb.add(info);
            mb.add(user);
            mb.add(report);
        }
        
        mb.add(utility);
        mb.add(mexit);
        
        
        
        setLayout(new FlowLayout());
        
        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Customer")){
            new NewCustomer();
        }else if(msg.equals("Customer Details")){
            new CustomerDetails();
        }else if(msg.equals("Deposit Details")){
            new DepositDetails();
        }else if(msg.equals("Calculate Bill")){
            new CalculateBill();
        }else if( msg.equals("View Information")){
            new ViewInformation(meter);
        }
        else if(msg.equals("Update Information")){
            new UpdateInformation(meter);
        }
        else if(msg.equals("Bill Details")){
            new BillDetails(meter);
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(msg.equals("Exit")){
            setVisible(false);
            new Login();
        }
        else if(msg.equals("Pay Bill")){
            new PayBill(meter);
        }
        else if(msg.equals("Generate Bill")){
            new GenerateBill(meter);
        }
         
    }
    
    
    public static void main(String args[]){
        new Project("","");
    }
    
}
