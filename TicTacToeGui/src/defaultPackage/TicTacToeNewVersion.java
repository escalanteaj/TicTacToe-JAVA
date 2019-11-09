package defaultPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class TicTacToeNewVersion {

	private JFrame ticTacToeFrame;
	private JPanel boardPanel;
	private JPanel resultsPanel;
	private JLabel playerLabel;
	private JLabel currentPlayerLabel;
	private JLabel gameResultLabel;
	private JButton topLButton;
	private JButton topCButton;
	private JButton topRButton;
	private JButton middleLButton;
	private JButton middleCButton;
	private JButton middleRButton;
	private JButton bottomLButton;
	private JButton bottomCButton;
	private JButton bottomRButton;
	private JButton resetButton;
	private JButton checkButton;
	private int turnsCount = 0;
	private String winner = "";

	Player playerX = new Player();
	Player playerO = new Player();
	Image playerXIcon = playerX.getXPlayerIcon();
	Image playerOIcon = playerO.getOPlayerIcon();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeNewVersion window = new TicTacToeNewVersion();
					window.ticTacToeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToeNewVersion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ticTacToeFrame = new JFrame();
		ticTacToeFrame.setResizable(false);
		ticTacToeFrame.setTitle("Tic Tac Toe");
		ticTacToeFrame.setBounds(650, 300, 300, 400);
		ticTacToeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		boardPanel = new JPanel();
		ticTacToeFrame.getContentPane().add(boardPanel, BorderLayout.NORTH);
		boardPanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		boardPanel.setLayout(new GridLayout(3, 3, 0, 0));
		boardPanel.setPreferredSize(new Dimension(210, 210));

		resultsPanel = new JPanel();
		resultsPanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		ticTacToeFrame.getContentPane().add(resultsPanel, BorderLayout.CENTER);
		resultsPanel.setLayout(null);

		playerLabel = new JLabel("Player:");
		playerLabel.setHorizontalAlignment(SwingConstants.LEFT);
		playerLabel.setBounds(10, 11, 47, 14);
		resultsPanel.add(playerLabel);

		currentPlayerLabel = new JLabel("X");
		currentPlayerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		currentPlayerLabel.setBounds(54, 11, 17, 14);
		resultsPanel.add(currentPlayerLabel);

		gameResultLabel = new JLabel("");
		gameResultLabel.setHorizontalAlignment(SwingConstants.LEFT);
		gameResultLabel.setBounds(10, 126, 264, 14);
		resultsPanel.add(gameResultLabel);

		playerX.setPlayerName("X");
		playerO.setPlayerName("O");

		topLButton = new JButton();
		topLButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					topLButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					topLButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				topLButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		topLButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(topLButton);

		topCButton = new JButton();
		topCButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					topCButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					topCButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				topCButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		topCButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(topCButton);

		topRButton = new JButton();
		topRButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					topRButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					topRButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				topRButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		topRButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(topRButton);

		middleLButton = new JButton();
		middleLButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					middleLButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					middleLButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				middleLButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		middleLButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(middleLButton);

		middleCButton = new JButton();
		middleCButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					middleCButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					middleCButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				middleCButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		middleCButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(middleCButton);

		middleRButton = new JButton();
		middleRButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					middleRButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					middleRButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				middleRButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		middleRButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(middleRButton);

		bottomLButton = new JButton();
		bottomLButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					bottomLButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					bottomLButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				bottomLButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		bottomLButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(bottomLButton);

		bottomCButton = new JButton();
		bottomCButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					bottomCButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					bottomCButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				bottomCButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		bottomCButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(bottomCButton);

		bottomRButton = new JButton();
		bottomRButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPlayerLabel.getText() == "X") {
					bottomRButton.setIcon(new ImageIcon(playerXIcon, "X"));
				} else {
					bottomRButton.setIcon(new ImageIcon(playerOIcon, "O"));
				}
				bottomRButton.setEnabled(false);
				turnsCount++;
				alternatePlayers();
				gameLogic();
			}
		});
		bottomRButton.setPreferredSize(new Dimension(70, 70));
		boardPanel.add(bottomRButton);

		resetButton = new JButton("Reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetGame();
			}
		});
		resetButton.setBounds(185, 7, 89, 23);
		resultsPanel.add(resetButton);

		checkButton = new JButton("Check");
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameLogic();
			}
		});
		checkButton.setBounds(185, 41, 89, 23);
		resultsPanel.add(checkButton);

	}

	protected void gameLogic() {
		if (topLButton.isEnabled() == false && topCButton.isEnabled() == false && topRButton.isEnabled() == false) {
			if (topLButton.getIcon().toString().equals(topCButton.getIcon().toString())
					&& topCButton.getIcon().toString() == topRButton.getIcon().toString()) {
				winner = "topRow";
				gameResultLabel.setText("Game ended. The winner is: " + topLButton.getIcon().toString());
			}
		}
		if (middleLButton.isEnabled() == false && middleCButton.isEnabled() == false
				&& middleRButton.isEnabled() == false) {
			if (middleLButton.getIcon().toString().equals(middleCButton.getIcon().toString())
					&& middleCButton.getIcon().toString() == middleRButton.getIcon().toString()) {
				winner = "middleRow";
				gameResultLabel.setText("Game ended. The winner is: " + middleLButton.getIcon().toString());
			}
		}
		if (bottomLButton.isEnabled() == false && bottomCButton.isEnabled() == false
				&& bottomRButton.isEnabled() == false) {
			if (bottomLButton.getIcon().toString().equals(bottomCButton.getIcon().toString())
					&& bottomCButton.getIcon().toString() == bottomRButton.getIcon().toString()) {
				winner = "bottomRow";
				gameResultLabel.setText("Game ended. The winner is: " + bottomLButton.getIcon().toString());
			}
		}
		if (topLButton.isEnabled() == false && middleLButton.isEnabled() == false
				&& bottomLButton.isEnabled() == false) {
			if (topLButton.getIcon().toString().equals(middleLButton.getIcon().toString())
					&& middleLButton.getIcon().toString() == bottomLButton.getIcon().toString()) {
				winner = "leftCol";
				gameResultLabel.setText("Game ended. The winner is: " + topLButton.getIcon().toString());
			}
		}
		if (topCButton.isEnabled() == false && middleCButton.isEnabled() == false
				&& bottomCButton.isEnabled() == false) {
			if (topCButton.getIcon().toString().equals(middleCButton.getIcon().toString())
					&& middleCButton.getIcon().toString() == bottomCButton.getIcon().toString()) {
				winner = "centerCol";
				gameResultLabel.setText("Game ended. The winner is: " + topCButton.getIcon().toString());
			}
		}
		if (topRButton.isEnabled() == false && middleRButton.isEnabled() == false
				&& bottomRButton.isEnabled() == false) {
			if (topRButton.getIcon().toString().equals(middleRButton.getIcon().toString())
					&& middleRButton.getIcon().toString() == bottomRButton.getIcon().toString()) {
				winner = "rightCol";
				gameResultLabel.setText("Game ended. The winner is: " + topRButton.getIcon().toString());
			}
		}

		if (topLButton.isEnabled() == false && middleCButton.isEnabled() == false
				&& bottomRButton.isEnabled() == false) {
			if (topLButton.getIcon().toString().equals(middleCButton.getIcon().toString())
					&& middleCButton.getIcon().toString() == bottomRButton.getIcon().toString()) {
				winner = "forwardDiagonal";
				gameResultLabel.setText("Game ended. The winner is: " + topLButton.getIcon().toString());
			}
		}

		if (topRButton.isEnabled() == false && middleCButton.isEnabled() == false
				&& bottomLButton.isEnabled() == false) {
			if (topRButton.getIcon().toString().equals(middleCButton.getIcon().toString())
					&& middleCButton.getIcon().toString() == bottomLButton.getIcon().toString()) {
				winner = "backwardDiagonal";
				gameResultLabel.setText("Game ended. The winner is: " + topRButton.getIcon().toString());
			}
		}

		switch (winner) {
		case "topRow":
			topRowWinner();
			break;

		case "middleRow":
			middleRowWinner();
			break;

		case "bottomRow":
			bottomRowWinner();
			break;

		case "leftCol":
			leftColWinner();
			break;

		case "centerCol":
			centerColWinner();
			break;

		case "rightCol":
			rightColWinner();
			break;

		case "forwardDiagonal":
			forwardDiagonalWinner();
			break;

		case "backwardDiagonal":
			backwardDiagonalWinner();
			break;

		default:
			noWinner();
			break;
		}

	}

	public void alternatePlayers() {
		if (currentPlayerLabel.getText() == "X") {
			playerX.setMyTurn(true);
			playerO.setMyTurn(false);
			currentPlayerLabel.setText("O");
		} else if (currentPlayerLabel.getText() == "O") {
			playerX.setMyTurn(false);
			playerO.setMyTurn(true);
			currentPlayerLabel.setText("X");
		}
	}

	public void gameEnded() {
		if (turnsCount == 9) {
			gameResultLabel.setText("Game ended. The winner is: ");
		}
	}

	public void resetGame() {
		topLButton.setEnabled(true);
		topLButton.setIcon(null);
		topCButton.setEnabled(true);
		topCButton.setIcon(null);
		topRButton.setEnabled(true);
		topRButton.setIcon(null);
		middleLButton.setEnabled(true);
		middleLButton.setIcon(null);
		middleCButton.setEnabled(true);
		middleCButton.setIcon(null);
		middleRButton.setEnabled(true);
		middleRButton.setIcon(null);
		bottomLButton.setEnabled(true);
		bottomLButton.setIcon(null);
		bottomCButton.setEnabled(true);
		bottomCButton.setIcon(null);
		bottomRButton.setEnabled(true);
		bottomRButton.setIcon(null);
		turnsCount = 0;
		gameResultLabel.setText(null);
		checkButton.setEnabled(true);
		winner = "";
	}

	public void topRowWinner() {
		topLButton.setEnabled(true);
		topCButton.setEnabled(true);
		topRButton.setEnabled(true);
		middleLButton.setEnabled(false);
		middleCButton.setEnabled(false);
		middleRButton.setEnabled(false);
		bottomLButton.setEnabled(false);
		bottomCButton.setEnabled(false);
		bottomRButton.setEnabled(false);
		checkButton.setEnabled(false);
	}

	public void middleRowWinner() {
		topLButton.setEnabled(false);
		topCButton.setEnabled(false);
		topRButton.setEnabled(false);
		middleLButton.setEnabled(true);
		middleCButton.setEnabled(true);
		middleRButton.setEnabled(true);
		bottomLButton.setEnabled(false);
		bottomCButton.setEnabled(false);
		bottomRButton.setEnabled(false);
		checkButton.setEnabled(false);
	}

	public void bottomRowWinner() {
		topLButton.setEnabled(false);
		topCButton.setEnabled(false);
		topRButton.setEnabled(false);
		middleLButton.setEnabled(false);
		middleCButton.setEnabled(false);
		middleRButton.setEnabled(false);
		bottomLButton.setEnabled(true);
		bottomCButton.setEnabled(true);
		bottomRButton.setEnabled(true);
		checkButton.setEnabled(false);
	}

	public void leftColWinner() {
		topLButton.setEnabled(true);
		topCButton.setEnabled(false);
		topRButton.setEnabled(false);
		middleLButton.setEnabled(true);
		middleCButton.setEnabled(false);
		middleRButton.setEnabled(false);
		bottomLButton.setEnabled(true);
		bottomCButton.setEnabled(false);
		bottomRButton.setEnabled(false);
		checkButton.setEnabled(false);
	}

	public void centerColWinner() {
		topLButton.setEnabled(false);
		topCButton.setEnabled(true);
		topRButton.setEnabled(false);
		middleLButton.setEnabled(false);
		middleCButton.setEnabled(true);
		middleRButton.setEnabled(false);
		bottomLButton.setEnabled(false);
		bottomCButton.setEnabled(true);
		bottomRButton.setEnabled(false);
		checkButton.setEnabled(false);
	}

	public void rightColWinner() {
		topLButton.setEnabled(false);
		topCButton.setEnabled(false);
		topRButton.setEnabled(true);
		middleLButton.setEnabled(false);
		middleCButton.setEnabled(false);
		middleRButton.setEnabled(true);
		bottomLButton.setEnabled(false);
		bottomCButton.setEnabled(false);
		bottomRButton.setEnabled(true);
		checkButton.setEnabled(false);
	}

	public void forwardDiagonalWinner() {
		topLButton.setEnabled(true);
		topCButton.setEnabled(false);
		topRButton.setEnabled(false);
		middleLButton.setEnabled(false);
		middleCButton.setEnabled(true);
		middleRButton.setEnabled(false);
		bottomLButton.setEnabled(false);
		bottomCButton.setEnabled(false);
		bottomRButton.setEnabled(true);
		checkButton.setEnabled(false);
	}

	public void backwardDiagonalWinner() {
		topLButton.setEnabled(false);
		topCButton.setEnabled(false);
		topRButton.setEnabled(true);
		middleLButton.setEnabled(false);
		middleCButton.setEnabled(true);
		middleRButton.setEnabled(false);
		bottomLButton.setEnabled(true);
		bottomCButton.setEnabled(false);
		bottomRButton.setEnabled(false);
		checkButton.setEnabled(false);
	}

	public void noWinner() {
		if (turnsCount == 9) {
			gameResultLabel.setText("There are no winners.");
			checkButton.setEnabled(false);
		}
	}

}
