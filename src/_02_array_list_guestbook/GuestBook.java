package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	ArrayList<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	

	public void setup() {
		panel.add(button);
		panel.add(button1);
		frame.add(panel);
		button.setText("Add Name");
		button1.setText("View Names");
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonclicked = (JButton) e.getSource();
		if (buttonclicked == button) {
			String newName = JOptionPane.showInputDialog("Please enter a name to add.");
			names.add(newName);
			panel.add(new JTextField(names.size() - 1));
		}
		if (buttonclicked == button1) {
			JFrame frame1 = new JFrame();
			JPanel panel1 = new JPanel();
			JTextField Bob = new JTextField(names.get(0));
			JTextField Sandy = new JTextField(names.get(1));
			JTextField Greg = new JTextField(names.get(2));
			JTextField Donny = new JTextField(names.get(3));
			String stuff = " ";
			for(int i = 0; i<names.size(); i++) {
				stuff+=names.get(i) + ", ";
			}
			JOptionPane.showMessageDialog(null, stuff );
		
		}
	}

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}