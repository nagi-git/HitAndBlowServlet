package pack;

//書き込み内容を保持するクラス
public class ResultDTO {
	private int turnNum;	// 回数
	private int inputAnswer;		// 入力した回答
	private int hitCount;		// ヒット数
	private int blowCount;		// ブロー数

	public ResultDTO() {

	}

	public ResultDTO(int turnNum, int inputAnswer, int hitCount, int blowCount) {
		this.turnNum = turnNum;
		this.inputAnswer = inputAnswer;
		this.hitCount = hitCount;
		this.blowCount = blowCount;
	}

	// 各メンバ変数の getter および setter
	public int getTurnNum() {
		return turnNum;
	}

	public void setTurnNum(int turnNum) {
		this.turnNum = turnNum;
	}

	public int getInputAnswer() {
		return inputAnswer;
	}

	public void setInputAnswer(int inputAnswer) {
		this.inputAnswer = inputAnswer;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	public int getBlowCount() {
		return blowCount;
	}

	public void setBlowCount(int blowCount) {
		this.blowCount = blowCount;
	}
}