package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Traveling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubtotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traveling window = new Traveling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Traveling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 18));
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 21, 1115, 79);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticketing System");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Class");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 146, 217, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Segoe UI", Font.BOLD, 18));
		rdbtnStandard.setBounds(6, 185, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Segoe UI", Font.BOLD, 18));
		rdbtnEconomy.setBounds(6, 221, 109, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Segoe UI", Font.BOLD, 18));
		rdbtnFirstClass.setBounds(6, 262, 109, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Segoe UI", Font.BOLD, 18));
		rdbtnReturnTicket.setBounds(215, 221, 141, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnSingle = new JRadioButton("Single Ticket");
		rdbtnSingle.setFont(new Font("Segoe UI", Font.BOLD, 18));
		rdbtnSingle.setBounds(215, 185, 109, 23);
		frame.getContentPane().add(rdbtnSingle);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Segoe UI", Font.BOLD, 18));
		rdbtnAdult.setBounds(368, 185, 83, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Segoe UI", Font.BOLD, 18));
		rdbtnChild.setBounds(368, 221, 83, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox cabDestination = new JComboBox();
		cabDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Karachi", "Lahore", "Islamabad", "Peshawar"}));
		cabDestination.setFont(new Font("Segoe UI", Font.BOLD, 18));
		cabDestination.setBounds(223, 262, 206, 33);
		frame.getContentPane().add(cabDestination);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 177, 1004, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 306, 423, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel Tax = new JLabel("Tax");
		Tax.setFont(new Font("Roboto Slab", Font.BOLD, 18));
		Tax.setBounds(32, 340, 46, 14);
		frame.getContentPane().add(Tax);
		
		JLabel Subtotal = new JLabel("SubTotal");
		Subtotal.setFont(new Font("Roboto Slab", Font.BOLD, 18));
		Subtotal.setBounds(32, 379, 83, 14);
		frame.getContentPane().add(Subtotal);
		
		JLabel Total = new JLabel("Total");
		Total.setFont(new Font("Roboto Slab", Font.BOLD, 18));
		Total.setBounds(32, 416, 46, 14);
		frame.getContentPane().add(Total);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtTax.setHorizontalAlignment(SwingConstants.CENTER);
		txtTax.setBounds(181, 340, 86, 20);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(181, 379, 86, 20);
		frame.getContentPane().add(txtSubtotal);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setColumns(10);
		txtTotal.setBounds(181, 416, 86, 20);
		frame.getContentPane().add(txtTotal);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
				
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double tax =19.50;
				double MilesK8=700;
				double MilesK12=800;
				double MilesK20=900;
				double MilesK30=1200;
				double totalCost,eco=8000,fclass=15000;
				
				
				AbstractButton rdbtnSingleTicket;
				if(rdbtnStandard.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*MilesK8)/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*(MilesK8*2))/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK8 + totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*MilesK8)/100;
					String sTax = String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK8 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*(MilesK8*2))/100;
					String sTax = String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK8 +  totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*MilesK8)/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*(MilesK12*2))/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK12*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK12 + totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*MilesK12)/100;
					String sTax = String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK12*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK12 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*(MilesK12*2))/100;
					String sTax = String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK12*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK12 +  totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if(rdbtnStandard.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*MilesK12)/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK12);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", MilesK12 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*(MilesK20*2))/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK20*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK20 + totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*MilesK20)/100;
					String sTax = String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK20*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK20 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnStandard.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*(MilesK20*2))/100;
					String sTax = String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK20*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK20 +  totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if(rdbtnStandard.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*MilesK20)/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK20);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", MilesK20 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
					
					
				}
				
							
					
				else if(rdbtnEconomy.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*MilesK8+eco)/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8+eco);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", MilesK8 + eco+ totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*(MilesK8*2))/100;
					String sTax = String.format("RS%.2f",(totalCost+eco)-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8+eco);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK8 + eco + totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*(MilesK8*2))/100;
					String sTax = String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK8 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*(MilesK8*2))/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK8*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK8 + totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*MilesK12+eco)/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK12+eco);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", MilesK12 + eco+ totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*(MilesK12*2))/100;
					String sTax = String.format("RS%.2f",(totalCost+eco)-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK12+eco);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK12 + eco + totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*(MilesK12*2))/100;
					String sTax = String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK12*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK12 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*(MilesK12*2))/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK12*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK12 + totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*MilesK20+eco)/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK20+eco);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", MilesK20 + eco+ totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*(MilesK20*2))/100;
					String sTax = String.format("RS%.2f",(totalCost+eco)-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK20+eco);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK20 + eco + totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*(MilesK20*2))/100;
					String sTax = String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK20*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", ((MilesK20 + totalCost)*2)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}else if(rdbtnEconomy.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*(MilesK20*2))/100;
					String sTax = String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal =String.format("RS%.2f", MilesK20*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f", (MilesK20 + totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("Economy");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
							
					
				}
				
				
				
				// FIRST CLASS
				
else if(rdbtnFirstClass.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*(MilesK20*2))/100;
					String sTax=String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK20*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK20+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*(MilesK20+fclass))/100;
					String sTax=String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK20+fclass);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK20+totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =((tax*MilesK20+fclass))/100;
					String sTax=String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK20+fclass);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK20+fclass+totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Lahore")) {
					
					totalCost =(tax*(MilesK20*2))/100;
					String sTax=String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK20*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK20+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*(MilesK8*2))/100;
					String sTax=String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK8*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK8+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*(MilesK8+fclass))/100;
					String sTax=String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK8+fclass);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK8+totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =((tax*MilesK8+fclass))/100;
					String sTax=String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK8+fclass);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK8+fclass+totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Islamabad")) {
					
					totalCost =(tax*(MilesK8*2))/100;
					String sTax=String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK8*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK8+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*(MilesK12*2))/100;
					String sTax=String.format("RS%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK12*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK12+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnAdult.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*(MilesK12+fclass))/100;
					String sTax=String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK12+fclass);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK12+totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnSingle.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =((tax*MilesK12+fclass))/100;
					String sTax=String.format("RS%.2f",totalCost -18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK12+fclass);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK12+fclass+totalCost)-18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("One Way");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}else if(rdbtnFirstClass.isSelected()&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&cabDestination.getSelectedItem().equals("Peshawar")) {
					
					totalCost =(tax*(MilesK12*2))/100;
					String sTax=String.format("RS%.2f",totalCost-18);
					txtTax.setText(sTax);
					String subTotal=String.format("RS%.2f",MilesK12*2);
					txtSubtotal.setText(subTotal);
					String Total = String.format("RS%.2f",(MilesK12+totalCost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("FirstClass");
					txtTicket.setText("Return");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
					
				}
			
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Time
				Calendar timer= Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				
				// DATE
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-YY");
				txtDate.setText(Tdate.format(timer.getTime()));
				
				txtFrom.setText("Karachi *");
				txtTo.setText((String)cabDestination.getSelectedItem()+" *");
				
				
				// Random Number Generator
				
				int num1;
				String q1="";
				num1 = 1325 +(int)(Math.random()*4238);
				q1 += num1 + 1325;
				txtTicketNo.setText(q1);
				
				
				// Route
				
				txtRoute.setText("Any");
				
			}
		});
		btnNewButton.setToolTipText("Total Cost of Ticket");
		btnNewButton.setFont(new Font("Roboto Slab", Font.BOLD, 15));
		btnNewButton.setBounds(32, 487, 89, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.setFont(new Font("Roboto Slab", Font.BOLD, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtTax.setText(null);
				txtSubtotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				rdbtnSingle.setSelected(false);
				rdbtnEconomy.setSelected(false);
				cabDestination.setSelectedItem("Destination");
				txtTo.setText(null);
				txtFrom.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				txtTicketNo.setText(null);
				txtTicket.setText(null);
				txtAdult.setText(null);
				txtChild.setText(null);
				txtClass.setText(null);


				







				





			}
		});
		btnReset.setBounds(161, 487, 89, 33);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.setFont(new Font("Roboto Slab", Font.BOLD, 15));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				
				if(JOptionPane.showConfirmDialog(frame,"Confirm if You want to Exit","Ticketing System",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION);
				
				System.exit(0);
			}
		});
		btnExit.setBounds(286, 487, 89, 33);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(20, 474, 433, 2);
		frame.getContentPane().add(separator_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(457, 185, 2, 357);
		frame.getContentPane().add(separator_2);
		
		JLabel Subtotal_1 = new JLabel("Class");
		Subtotal_1.setHorizontalAlignment(SwingConstants.CENTER);
		Subtotal_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		Subtotal_1.setBounds(493, 177, 83, 23);
		frame.getContentPane().add(Subtotal_1);
		
		JLabel Subtotal_2 = new JLabel("Ticket");
		Subtotal_2.setHorizontalAlignment(SwingConstants.CENTER);
		Subtotal_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		Subtotal_2.setBounds(628, 177, 83, 23);
		frame.getContentPane().add(Subtotal_2);
		
		JLabel Subtotal_3 = new JLabel("Adult");
		Subtotal_3.setHorizontalAlignment(SwingConstants.CENTER);
		Subtotal_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		Subtotal_3.setBounds(752, 177, 83, 23);
		frame.getContentPane().add(Subtotal_3);
		
		JLabel Subtotal_4 = new JLabel("Child");
		Subtotal_4.setHorizontalAlignment(SwingConstants.CENTER);
		Subtotal_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		Subtotal_4.setBounds(901, 177, 83, 23);
		frame.getContentPane().add(Subtotal_4);
		
		txtClass = new JTextField();
		txtClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtClass.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtClass.setColumns(10);
		txtClass.setBounds(490, 226, 86, 20);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicket.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtTicket.setColumns(10);
		txtTicket.setBounds(625, 226, 86, 20);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdult.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtAdult.setColumns(10);
		txtAdult.setBounds(749, 226, 86, 20);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setHorizontalAlignment(SwingConstants.CENTER);
		txtChild.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtChild.setColumns(10);
		txtChild.setBounds(898, 226, 86, 20);
		frame.getContentPane().add(txtChild);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(457, 262, 567, 2);
		frame.getContentPane().add(separator_1_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(1022, 185, 2, 357);
		frame.getContentPane().add(separator_2_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_2_2.setBounds(731, 266, 2, 276);
		frame.getContentPane().add(separator_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(490, 288, 68, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("To");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(490, 357, 68, 17);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Date");
		lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(490, 419, 68, 17);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Time");
		lblNewLabel_2_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setBounds(490, 498, 68, 22);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		txtFrom = new JTextField();
		txtFrom.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrom.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtFrom.setColumns(10);
		txtFrom.setBounds(568, 285, 109, 20);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtTo.setColumns(10);
		txtTo.setBounds(568, 354, 109, 20);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtDate.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtDate.setColumns(10);
		txtDate.setBounds(568, 416, 109, 20);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtTime.setColumns(10);
		txtTime.setBounds(568, 495, 109, 20);
		frame.getContentPane().add(txtTime);
		
		JLabel lblNewLabel_2_4 = new JLabel("Ticket No");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(784, 315, 141, 26);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Price");
		lblNewLabel_2_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setBounds(784, 382, 113, 21);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Route");
		lblNewLabel_2_6.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6.setBounds(784, 450, 113, 26);
		frame.getContentPane().add(lblNewLabel_2_6);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicketNo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(811, 352, 86, 20);
		frame.getContentPane().add(txtTicketNo);
		
		txtPrice = new JTextField();
		txtPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtPrice.setColumns(10);
		txtPrice.setBounds(811, 414, 86, 20);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setHorizontalAlignment(SwingConstants.CENTER);
		txtRoute.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtRoute.setColumns(10);
		txtRoute.setBounds(811, 487, 86, 20);
		frame.getContentPane().add(txtRoute);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(10, 540, 1014, 2);
		frame.getContentPane().add(separator_1_3);
		
		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(457, 211, 565, 2);
		frame.getContentPane().add(separator_1_2_1);
	}
}
