package com.app.controller.controller.apis;

import com.app.domain.vo.MemberVO;
import com.app.controller.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberAPI {

    private final MemberMapper memberMapper;

    @PostMapping("/register")
    public void reqisterMember(@RequestBody MemberVO memberVO) {
        memberMapper.insert(memberVO);
        log.info("회원가입 성공!");
    }
    @PostMapping("/login")
    public MemberVO loginMember(@RequestBody MemberVO memberVO) {
        MemberVO member = memberMapper.selectByMemberEmailAndMemberPassword(memberVO).orElse(new MemberVO());
        log.info(member.toString());
        return member;
    }
    @PostMapping("/find")
    public MemberVO updateMember(@RequestBody MemberVO memberVO) {
        Long id = memberMapper.selectByMemberEmail(memberVO);
        log.info(String.valueOf(id));
        return memberMapper.selectById(id).orElse(new MemberVO());
    }

    @PutMapping("/modify")
    public void selectMember(@RequestBody MemberVO memberVO) {
        memberMapper.update(memberVO);
        log.info(memberVO.toString());
    }

    @DeleteMapping("/unregister")
    public void deleteMember(@RequestBody MemberVO memberVO) {
        Long id = memberMapper.selectByMemberEmail(memberVO);
        memberMapper.delete(id);
        log.info(memberVO.toString());
    }

}
