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
	public void setWriting(int turnNum, int inputAnswer, int hitAnswer, int blowCount) {
		ResultDTO result = new ResultDTO();
		result.setTurnNum(turnNum);
		result.setInputAnswer(inputAnswer);
		result.setHitCount(hitAnswer);
		result.setBlowCount(blowCount);

		resultList.add(result);
	}
}
