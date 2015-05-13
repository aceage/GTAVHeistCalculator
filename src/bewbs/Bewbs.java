package bewbs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JSeparator;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bewbs {

	private JFrame frame;
	private JTextField lName;
	private JTextField greatNameb;
	private JTextField threeNameb;
	private JTextField fourNameb;
	private JTextField costHeistb;
	private JTextField greatRoundsb;
	private JTextField midRoundsb;
	private JTextField lowRoundsb;
	private JTextField moneyPRb;
	private JTextField finalRewardb;
	private JTextField leadR;
	private JTextField greatR;
	private JTextField midR;
	private JTextField lowR;
	private JTextField oldtoatsb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bewbs window = new Bewbs();
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
	public Bewbs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeistLeaderName = new JLabel("Heist Leader Name");
		lblHeistLeaderName.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeistLeaderName.setBounds(20, 44, 111, 14);
		frame.getContentPane().add(lblHeistLeaderName);
		
		lName = new JTextField();
		lName.setHorizontalAlignment(SwingConstants.CENTER);
		lName.setBounds(10, 69, 132, 35);
		frame.getContentPane().add(lName);
		lName.setColumns(10);
		
		JLabel lblNames = new JLabel("Names");
		lblNames.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNames.setHorizontalAlignment(SwingConstants.CENTER);
		lblNames.setBounds(51, 19, 46, 14);
		frame.getContentPane().add(lblNames);
		
		JLabel lblPlayerWithThe = new JLabel("Player with the most rounds");
		lblPlayerWithThe.setBounds(10, 115, 178, 14);
		frame.getContentPane().add(lblPlayerWithThe);
		
		greatNameb = new JTextField();
		greatNameb.setBounds(10, 140, 132, 35);
		frame.getContentPane().add(greatNameb);
		greatNameb.setColumns(10);
		
		JLabel lblPlayerThree = new JLabel("Player Three");
		lblPlayerThree.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerThree.setBounds(20, 186, 111, 14);
		frame.getContentPane().add(lblPlayerThree);
		
		threeNameb = new JTextField();
		threeNameb.setBounds(10, 211, 132, 35);
		frame.getContentPane().add(threeNameb);
		threeNameb.setColumns(10);
		
		JLabel lblPlayerFour = new JLabel("Player Four");
		lblPlayerFour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerFour.setBounds(10, 257, 132, 14);
		frame.getContentPane().add(lblPlayerFour);
		
		fourNameb = new JTextField();
		fourNameb.setBounds(10, 282, 132, 35);
		frame.getContentPane().add(fourNameb);
		fourNameb.setColumns(10);
		
		costHeistb = new JTextField();
		costHeistb.setBounds(187, 69, 131, 35);
		frame.getContentPane().add(costHeistb);
		costHeistb.setColumns(10);
		
		greatRoundsb = new JTextField();
		greatRoundsb.setBounds(187, 140, 131, 35);
		frame.getContentPane().add(greatRoundsb);
		greatRoundsb.setColumns(10);
		
		midRoundsb = new JTextField();
		midRoundsb.setBounds(187, 211, 131, 35);
		frame.getContentPane().add(midRoundsb);
		midRoundsb.setColumns(10);
		
		lowRoundsb = new JTextField();
		lowRoundsb.setBounds(187, 282, 131, 35);
		frame.getContentPane().add(lowRoundsb);
		lowRoundsb.setColumns(10);
		
		JLabel lblCostOfThe = new JLabel("Cost of the Hesit");
		lblCostOfThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCostOfThe.setBounds(187, 44, 131, 14);
		frame.getContentPane().add(lblCostOfThe);
		
		JLabel lblRoundsPlayed = new JLabel("Rounds Played");
		lblRoundsPlayed.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoundsPlayed.setBounds(186, 115, 132, 14);
		frame.getContentPane().add(lblRoundsPlayed);
		
		JLabel lblRoundsPlayed_1 = new JLabel("Rounds Played");
		lblRoundsPlayed_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoundsPlayed_1.setBounds(187, 186, 131, 14);
		frame.getContentPane().add(lblRoundsPlayed_1);
		
		JLabel lblRoundsPlayed_2 = new JLabel("Rounds Played");
		lblRoundsPlayed_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoundsPlayed_2.setBounds(187, 257, 131, 14);
		frame.getContentPane().add(lblRoundsPlayed_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 340, 308, 2);
		frame.getContentPane().add(separator);
		
		moneyPRb = new JTextField();
		moneyPRb.setBounds(187, 377, 131, 35);
		frame.getContentPane().add(moneyPRb);
		moneyPRb.setColumns(10);
		
		finalRewardb = new JTextField();
		finalRewardb.setBounds(10, 377, 131, 35);
		frame.getContentPane().add(finalRewardb);
		finalRewardb.setColumns(10);
		
		JLabel lblFanaleReward = new JLabel("Fanale Reward");
		lblFanaleReward.setHorizontalAlignment(SwingConstants.CENTER);
		lblFanaleReward.setBounds(20, 352, 122, 14);
		frame.getContentPane().add(lblFanaleReward);
		
		JLabel lblMoneyPerSetup = new JLabel("Money per setup round");
		lblMoneyPerSetup.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoneyPerSetup.setBounds(187, 352, 131, 14);
		frame.getContentPane().add(lblMoneyPerSetup);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String playerL, greatName, midName, lowName;
				int moneyPR, finalReward, costHeist, greatRounds,
				midRounds, lowRounds, oldmon, midmon, lowmon, basemon, low, mid, basre, oldtoats;
				costHeist=Integer.parseInt(costHeistb.getText());
				greatRounds=Integer.parseInt(greatRoundsb.getText());
				midRounds=Integer.parseInt(midRoundsb.getText());
				lowRounds=Integer.parseInt(lowRoundsb.getText());
				moneyPR=Integer.parseInt(moneyPRb.getText());
				finalReward=Integer.parseInt(finalRewardb.getText());
				greatName=greatNameb.getText().toString();
				playerL=lName.getText().toString();
				midName=threeNameb.getText().toString();
				lowName=fourNameb.getText().toString();
				
				oldmon = (greatRounds * moneyPR);
				midmon = midRounds * moneyPR;
				lowmon = lowRounds * moneyPR;
				basemon = oldmon + costHeist;
				mid = oldmon - midmon;
				low = oldmon - lowmon;
				basre = ((finalReward - (basemon + mid + low)) / 4);
				oldtoats = basre + oldmon;
				leadR.setText(playerL +" should get $" +(costHeist + oldmon + basre));
				greatR.setText(greatName +" should get $" + basre);
				midR.setText(midName +" should get $" +(basre + mid));
				lowR.setText(lowName +" should get $" +(basre + low));
				oldtoatsb.setText("With a toatal of $" +oldtoats +" per player");
			}
		});
		btnCalculate.setBounds(20, 443, 298, 74);
		frame.getContentPane().add(btnCalculate);
		
		leadR = new JTextField();
		leadR.setHorizontalAlignment(SwingConstants.CENTER);
		leadR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		leadR.setEditable(false);
		leadR.setBounds(366, 83, 308, 74);
		frame.getContentPane().add(leadR);
		leadR.setColumns(10);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblResults.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblResults.setBounds(366, 28, 308, 35);
		frame.getContentPane().add(lblResults);
		
		greatR = new JTextField();
		greatR.setHorizontalAlignment(SwingConstants.CENTER);
		greatR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		greatR.setEditable(false);
		greatR.setBounds(366, 168, 308, 74);
		frame.getContentPane().add(greatR);
		greatR.setColumns(10);
		
		midR = new JTextField();
		midR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		midR.setHorizontalAlignment(SwingConstants.CENTER);
		midR.setEditable(false);
		midR.setBounds(366, 257, 308, 74);
		frame.getContentPane().add(midR);
		midR.setColumns(10);
		
		lowR = new JTextField();
		lowR.setHorizontalAlignment(SwingConstants.CENTER);
		lowR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lowR.setEditable(false);
		lowR.setBounds(366, 340, 308, 74);
		frame.getContentPane().add(lowR);
		lowR.setColumns(10);
		
		JLabel lblTotalMoneyPer = new JLabel("Total money per player");
		lblTotalMoneyPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalMoneyPer.setBounds(366, 425, 308, 14);
		frame.getContentPane().add(lblTotalMoneyPer);
		
		oldtoatsb = new JTextField();
		oldtoatsb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		oldtoatsb.setEditable(false);
		oldtoatsb.setBounds(366, 443, 308, 74);
		frame.getContentPane().add(oldtoatsb);
		oldtoatsb.setColumns(10);
	}
}
