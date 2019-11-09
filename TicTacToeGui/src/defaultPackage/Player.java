package defaultPackage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {

	private String playerName = "";
	private boolean didIStart = false;
	private boolean myTurn = false;
	private byte turnNumber = 0;
	private final byte MAX_TURNS = 5;
	private Image xPlayerIcon = new ImageIcon(this.getClass().getResource("/equis.png")).getImage();
	private Image oPlayerIcon = new ImageIcon(this.getClass().getResource("/circle.png")).getImage();

	/**
	 *
	 */
	public Player() {
		super();
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the didIStart
	 */
	public boolean isDidIStart() {
		return didIStart;
	}

	/**
	 * @param didIStart the didIStart to set
	 */
	public void setDidIStart(boolean didIStart) {
		this.didIStart = didIStart;
	}

	/**
	 * @return the myTurn
	 */
	public boolean isMyTurn() {
		return myTurn;
	}

	/**
	 * @param myTurn the myTurn to set
	 */
	public void setMyTurn(boolean myTurn) {
		this.myTurn = myTurn;
	}

	/**
	 * @return the turnNumber
	 */
	public byte getTurnNumber() {
		return turnNumber;
	}

	/**
	 * @param turnNumber the turnNumber to set
	 */
	public void setTurnNumber(byte turnNumber) {
		this.turnNumber = turnNumber;
	}

	/**
	 * @return the xPlayerIcon
	 */
	public Image getXPlayerIcon() {
		return xPlayerIcon;
	}

	/**
	 * @param xPlayerIcon the xPlayerIcon to set
	 */
	public void setXPlayerIcon(Image xPlayerIcon) {
		this.xPlayerIcon = xPlayerIcon;
	}

	/**
	 * @return the oPlayerIcon
	 */
	public Image getOPlayerIcon() {
		return oPlayerIcon;
	}

	/**
	 * @param oPlayerIcon the oPlayerIcon to set
	 */
	public void setOPlayerIcon(Image oPlayerIcon) {
		this.oPlayerIcon = oPlayerIcon;
	}

	/**
	 * @return the mAX_TURNS
	 */
	public byte getMAX_TURNS() {
		return MAX_TURNS;
	}

}
