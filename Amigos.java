import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Amigos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Nombres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Amigos frame = new Amigos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Amigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_Nombres = new JTextField();
		textField_Nombres.setBounds(184, 60, 331, 99);
		contentPane.add(textField_Nombres);
		textField_Nombres.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar nombre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String Nombres = "Mi nombre es Carlos Abraham Ojeda Pereira";
				JOptionPane.showMessageDialog(null, "Mi nombre es Carlos Abraham Ojeda Pereira");
		        textField_Nombres.setText(Nombres);
		        String Nombre = "Carlos, Nallely, Yazmin, Alba, Landy";
				JOptionPane.showMessageDialog(null, "Carlos, Nallely, Yazmin, Alba, Landy");
		        textField_Nombres.setText(Nombre);
			}
		});
		btnNewButton.setBounds(261, 186, 166, 107);
		contentPane.add(btnNewButton);
	}
}
