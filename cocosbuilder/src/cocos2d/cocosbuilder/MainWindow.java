package cocos2d.cocosbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import cocos2d.cocos2d;

import com.badlogic.gdx.backends.lwjgl.LwjglCanvas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField txtCocosbuilder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_up = new JPanel();
		frame.getContentPane().add(panel_up, BorderLayout.NORTH);
		
		txtCocosbuilder = new JTextField();
		txtCocosbuilder.setText("cocosbuilder");
		panel_up.add(txtCocosbuilder);
		txtCocosbuilder.setColumns(10);
		
		JPanel panel_down = new JPanel();
		frame.getContentPane().add(panel_down, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_down.add(lblNewLabel_2);
		
		JPanel panel_left = new JPanel();
		frame.getContentPane().add(panel_left, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_left.add(lblNewLabel);
		
		JPanel panel_right = new JPanel();
		frame.getContentPane().add(panel_right, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_right.add(lblNewLabel_1);
		
		new CocosApplication();
		LwjglCanvas canvas = new LwjglCanvas(new cocos2d());
		JPanel panel_center = new JPanel();
		panel_center.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("click");
			}
		});
		frame.getContentPane().add(canvas.getCanvas(), BorderLayout.CENTER);
		
		
	}

}
