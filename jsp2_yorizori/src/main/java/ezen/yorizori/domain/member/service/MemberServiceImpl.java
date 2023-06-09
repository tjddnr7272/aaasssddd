package ezen.yorizori.domain.member.service;

import java.sql.SQLException;
import java.util.List;

import ezen.yorizori.domain.common.factory.DaoFactory;
import ezen.yorizori.domain.member.dao.MemberDao;
import ezen.yorizori.domain.member.dto.Member;
/**
 * 회원 관련 비즈니스 메소드 구현 및 트랙잭션 관리 
 * RDB, Open API 활용
 * @author 김성욱
 * @Date   2023. 3. 13.
 */
public class MemberServiceImpl implements MemberService {
	
	// RDB 정보 조회
	//DaoFactory.getInstance().getMemberDao()는 DAO(Data Access Object) 패턴에서 사용하는 팩토리 메서드 패턴을 적용한 코드입니다. 
	//이를 통해 MemberDao 인터페이스를 구현한 클래스의 인스턴스를 반환합니다. 이 방식을 사용하면 코드의 유연성을 높일 수 있습니다.
	private MemberDao memberDao = DaoFactory.getInstance().getMemberDao();
	
	// Open API 정보 조회
//    private MemberDao memberDao = new APIMemberDao();
	
	
	@Override
	public void registerMember(Member member) throws Exception{
			memberDao.create(member);
		}

	

	@Override
	public List<Member> getMembers() throws Exception{
		return memberDao.findAll();
	}

	@Override
	public Member isMember(String id, String password)  throws Exception{
		Member member = new Member();
		member.setId(id);
		member.setPassword(password);
		member = memberDao.isMember(member);
		return member;
		
	}

}
