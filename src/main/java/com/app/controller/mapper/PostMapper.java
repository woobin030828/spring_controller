package com.app.controller.mapper;

import com.app.domain.vo.MemberVO;
import com.app.domain.vo.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
    public void insert(PostVO postVO);
    public List<PostVO> selectAll();
    public Optional<PostVO> selectById(Long id);
    public void update(PostVO postVO);
    public void delete(Long id);
    public void updatePostReadCount(Long id);
}
