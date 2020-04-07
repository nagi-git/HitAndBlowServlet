package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ResultDAO;
import dto.ResultDTO;

@WebServlet("/play")
public class PlayHAB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ResultDAO dbm; // 結果情報管理クラス

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("playScreen.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 送信したinputAnswerの取得
		String inputAnswer = request.getParameter("result");
		RequestDispatcher dispatcher;

		// セッションオブジェクトの取得
		HttpSession session = request.getSession();

		// セッションに値を保存
		int turnCount = 0;
		int hitCount = 0;
		int blowCount = 0;

		session.setAttribute("turncount", turnCount);
		session.setAttribute("inputanswer", inputAnswer);
		session.setAttribute("hitcount", hitCount);
		session.setAttribute("blowcount", blowCount);

		// 1度だけ ResultDAO オブジェクトを生成
		if(dbm == null){
			dbm = new ResultDAO();
		}

		dbm.setWriting(turnCount, Integer.parseInt(inputAnswer), hitCount, blowCount);

		// 書き込み内容追加後のリストを取得
		List<ResultDTO> list = dbm.getResultList();

		// リストをセッションに保存
		session.setAttribute("results", list);

		dispatcher = request.getRequestDispatcher("playScreen.jsp");
		dispatcher.forward(request, response);
	}

}
