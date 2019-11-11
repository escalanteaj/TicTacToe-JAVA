package defaultPackage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {

	/**
	 * Attributes: Player name. Player's current turn. X and O .png images.
	 */
	private String playerName = "";
	private boolean myTurn = false;
	private Image xPlayerIcon = new ImageIcon(this.getClass().getResource("/xIcon.png")).getImage();
	private Image oPlayerIcon = new ImageIcon(this.getClass().getResource("/oIcon.png")).getImage();

	/**
	 * Default constructor.
	 */
	public Player() {
		super();
	}

	/**
	 * @return Returns the player name.
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param Sets the player name.
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return Returns true if it is the player's current turn.
	 */
	public boolean isMyTurn() {
		return myTurn;
	}

	/**
	 * @param Sets the player's current turn.
	 */
	public void setMyTurn(boolean myTurn) {
		this.myTurn = myTurn;
	}

	/**
	 * @return Returns the player's X icon.
	 */
	public Image getXPlayerIcon() {
		return xPlayerIcon;
	}

	/**
	 * @param Sets the player's X icon.
	 */
	public void setXPlayerIcon(Image xPlayerIcon) {
		this.xPlayerIcon = xPlayerIcon;
	}

	/**
	 * @return Returns the player's O icon.
	 */
	public Image getOPlayerIcon() {
		return oPlayerIcon;
	}

	/**
	 * @param Sets the player's O icon.
	 */
	public void setOPlayerIcon(Image oPlayerIcon) {
		this.oPlayerIcon = oPlayerIcon;
	}
}
