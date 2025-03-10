package com.green.member_manager.mapper;

import com.green.member_manager.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//xml 파일에 작성한 쿼리문을 실행시키는 메서드를 정의
//MemberMapper memberMapper = new MemberMapper();
@Mapper
public interface MemberMapper {
  //회원 목록 조회 쿼리
  public List<MemberDTO> selectMemberList();

  //회원 상세 정보 조회 쿼리
  public MemberDTO findMemberByMemId(String memId);

  //회원 등록 쿼리
  public int insertMember(MemberDTO memberDTO);

  //회원 삭제 쿼리
  public void deleteMember(String memId);

  //회원 수정 쿼리
  public void updateMember(MemberDTO memberDTO);

}




