package ezen.yorizori.web.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ezen.yorizori.domain.common.factory.DaoFactory;
import ezen.yorizori.domain.member.dao.MemberDao;
import ezen.yorizori.domain.member.dto.Member;
import ezen.yorizori.domain.member.service.MemberService;
import ezen.yorizori.domain.member.service.MemberServiceImpl;

/**
 * 로그인 화면과 로그인 처리 컨트롤러
 */

// 두가지 작업을 동시에 한다
@WebServlet(value = {"/member/login.do"})
public class LoginController extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
   // 비즈니스 객체 사용
   // private MemberService memberService = new MemberServiceImpl();
   /**
    * 로그인 화면 처리 
    */
   //이 코드는 클라이언트로부터 들어온 요청에 대해, /WEB-INF/views/member/loginForm.jsp 파일을 찾아 
   //해당 파일을 클라이언트에게 보여주기 위한 준비를 함...
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //RDB,OPEN API 필요시 사용(모델 사용 X)
      //단순히 회원 가입 화면으로 포워드
      RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/views/member/loginForm.jsp");
      // 클라이언트에게 답장
	      rd.forward(request, response);
   }

/**
 * 로그인 처리 
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
}

}