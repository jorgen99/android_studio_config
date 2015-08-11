package ${PACKAGE_NAME};

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ${NAME} extends JFrame {

	public static final Logger logger = Logger.getLogger(${NAME}.class);

	private double xPos;
	private double yPos;

	private Action doitAction;
	private Action exitAction;

	private JPanel main;
	private JLabel label;

	public static void main(String[] args) {
		new ${NAME}();
	}

	public ${NAME}() {
		setUpActionsAndListeners();
		initComponents();
		getContentPane().add(main);
		setSize(300, 300);
		setLocationMiddle();

        setVisible(true);
	}

	private void doIt() {
	}

	private void setUpActionsAndListeners() {

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


		doitAction = new AbstractAction("Do It!") {
			public void actionPerformed(ActionEvent event) {
				doIt();
			}
		};

		exitAction = new AbstractAction("I'm done.") {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		};
	}

	private void initComponents() {
		setTitle("Jugges Testapp");
		main = new JPanel(new BorderLayout());

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton defaultButton = new JButton(doitAction);
		JButton exitButton = new JButton(exitAction);
		buttonPanel.add(defaultButton);
		buttonPanel.add(exitButton);
		main.add(buttonPanel, BorderLayout.NORTH);

		label = new JLabel("This is a label");
		main.add(label, BorderLayout.SOUTH);
	}

	private void setLocationMiddle() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		xPos = screenSize.width / 2 - getWidth() / 2;
		xPos = (xPos < 0) ? 0 : xPos;
		yPos = screenSize.height / 2 - getHeight() / 2;
		yPos = (yPos < 0) ? 0 : yPos;
		setLocation((int)xPos, (int)yPos);
	}

}
