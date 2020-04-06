package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ResultDAO;

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
		String inputAnswer = request.getParameter("inputAnswer");
		RequestDispatcher dispatcher;

		// セッションオブジェクトの取得
		HttpSession session = request.getSession();

		// セッションに値を保存
		session.setAttribute("inputanswer", inputAnswer);

		// 1度だけ DataManager オブジェクトを生成
		if(dbm == null){
			dbm = new ResultDAO();
		}

		dbm.setWriting(Integer.parseInt(inputAnswer),);

		dispatcher = request.getRequestDispatcher("playScreen");
	}

}
