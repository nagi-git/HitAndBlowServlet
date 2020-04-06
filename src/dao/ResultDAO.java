package dao;

import java.util.ArrayList;

import dto.ResultDTO;

public class ResultDAO {
	private ArrayList<ResultDTO> resultList;	// 登録ユーザ情報リスト

	// 書き込み内容リストの getter
	public ArrayList<ResultDTO> getResultDTO() {
		return resultList;
	}

	// ログインユーザ情報と書き込み内容を受け取り、リストに追加する
	public void setWriting(int turnCount, int inputAnswer, int hitCount, int blowCount) {
		ResultDTO result = new ResultDTO();
		result.setTurnCount(turnCount);
		result.setInputAnswer(inputAnswer);
		result.setHitCount(hitCount);
		result.setBlowCount(blowCount);

		resultList.add(result);
	}
}
