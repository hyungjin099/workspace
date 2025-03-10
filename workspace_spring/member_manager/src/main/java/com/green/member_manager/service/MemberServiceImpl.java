package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

//어떤 클래스에 controller라는 이름을 붙여요?
//모든 요청을 받는 관제탑 역할을 하는 클래스를 controller

//프로그램의 핵심기능을 구현한 클래스에 service라는 이름을 붙인다.
//회원조회, 회원 등록, 삭제, 수정 -> 쿼리 기능
//MemberServiceImpl memberServiceImpl = new MemberServiceImpl();
@Service
public class MemberServiceImpl implements MemberService{
  private MemberMapper memberMapper;

  public MemberServiceImpl(MemberMapper memberMapper){
    this.memberMapper = memberMapper;
  }

  //회원 목록 조회 기능
  @Override
  public List<MemberDTO> selectMemberList() {
    //회원 목록을 조회하는 쿼리 실행
    return memberMapper.selectMemberList();
  }
  
  //회원 상세 정보 조회 기능
  @Override
  public MemberDTO findMemberByMemId(String memId) {
    return memberMapper.findMemberByMemId(memId);
  }

  //회원 등록 기능
  @Override
  public int insertMember(MemberDTO memberDTO) {
    return memberMapper.insertMember(memberDTO);
  }

  //회원 삭제 기능
  @Override
  public void deleteMember(String memId) {
    memberMapper.deleteMember(memId);
  }

  //회원 정보 수정 기능
  @Override
  public void updateMember(MemberDTO memberDTO) {
    memberMapper.updateMember(memberDTO);
  }


}






