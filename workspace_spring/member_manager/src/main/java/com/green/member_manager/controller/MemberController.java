package com.green.member_manager.controller;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.service.MemberService;
import com.green.member_manager.service.MemberServiceImpl;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/members")
public class MemberController {
  private MemberService memberService;

  public MemberController(MemberService memberService){
    this.memberService = memberService;
  }

  //회원 목록 조회 rest api
  //localhost:0808/members
  //localhost:0808/members/
  @GetMapping("")
  public List<MemberDTO> getMemberList(){
    log.info("회원 목록 조회 시작~");

    //회원 목록 조회
    return memberService.selectMemberList();
  }

  //회원 상세 정보 조회 rest api
  //(get) localhost:8080/members/java
  @GetMapping("/{memId}")
  public MemberDTO getMember(@PathVariable("memId") String memId){
    return memberService.findMemberByMemId(memId);
  }

  //회원 등록 rest api
  //localhost:8080/members
  @PostMapping("")
  public int regMember(@RequestBody MemberDTO memberDTO){
    return memberService.insertMember(memberDTO);
  }

  //회원 삭제 api
  // localhost:8080/members/java
  @DeleteMapping("/{memId}")
  public void deleteMember(@PathVariable("memId") String memId){
    memberService.deleteMember(memId);
  }

  //회원 정보 수정 api
  //(PUT) localhost:8080/members/java
  @PutMapping("/{memId}")
  public void updateMember(@PathVariable("memId") String memId, @RequestBody MemberDTO memberDTO){
    memberDTO.setMemId(memId);
    memberService.updateMember(memberDTO);
  }

}













