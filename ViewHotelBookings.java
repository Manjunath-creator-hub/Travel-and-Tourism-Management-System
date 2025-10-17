/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

/**
 *
 * @author spnav
 */
//public class ViewHotelBookings {
//    
//}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package travel.management.system;

/**
 *
 * @author spnav
 */
//public class ViewPackageBookings {
//    
//}



//package travel.management.system;


import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewHotelBookings extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewHotelBookings frame = new ViewHotelBookings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public ViewHotelBookings() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(580, 220, 900, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,626,201);
                add(l2);
                
		
		table = new JTable();
		table.setBounds(0, 40, 900, 350);
		contentPane.add(table);
                
                try{
                    Conn c = new Conn();
                        String displayHotelsql = "select * from bookhotel";
                        ResultSet rs = c.s.executeQuery(displayHotelsql);
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(390, 400, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		lblAvailability = new JLabel("Username");
		lblAvailability.setBounds(10, 15, 69, 14);
		contentPane.add(lblAvailability);
		
		lblCleanStatus = new JLabel("Name");
		lblCleanStatus.setBounds(100, 15, 76, 14);
		contentPane.add(lblCleanStatus);
		
		JLabel l7= new JLabel("Persons");
		l7.setBounds(190, 15, 46, 14);
		contentPane.add(l7);

                lblNewLabel_1 = new JLabel("days");
		lblNewLabel_1.setBounds(275, 15, 46, 14);
		contentPane.add(lblNewLabel_1);
                
                JLabel l5 = new JLabel("AC");
		l5.setBounds(360, 15, 90, 14);
		contentPane.add(l5);
                
                JLabel l6 = new JLabel("Food");
		l6.setBounds(460, 15, 90, 14);
		contentPane.add(l6);
                                
		lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(550,15, 76, 14);
		contentPane.add(lblNewLabel_1);

		
		lblId = new JLabel("Number");
		lblId.setBounds(640, 15, 90, 14);
		contentPane.add(lblId);
                
                JLabel l3 = new JLabel("Phone");
		l3.setBounds(710, 15, 90, 14);
		contentPane.add(l3);
                
                JLabel l4 = new JLabel("Price");
		l4.setBounds(790, 15, 90, 14);
		contentPane.add(l4);
                
//                JLabel l5 = new JLabel("Phone");
//		l5.setBounds(720, 15, 90, 14);
//		contentPane.add(l5);
//                
//                JLabel l6 = new JLabel("Email");
//		l6.setBounds(820, 15, 90, 14);
//		contentPane.add(l6);
//                
                getContentPane().setBackground(Color.WHITE);
	}

}
