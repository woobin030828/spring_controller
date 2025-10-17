package com.app.controller.mapper;

import com.app.domain.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {
    public void insert(MemberVO memberVO);
    public Optional<MemberVO> selectByMemberEmailAndMemberPassword(MemberVO memberVO);
    public void update(MemberVO memberVO);

    public Optional<MemberVO> selectById(Long id);
    public Long selectByMemberEmail(MemberVO memberVO);
    public void delete(Long id);
}
