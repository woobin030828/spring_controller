package com.app.controller.controller.apis;

import com.app.controller.mapper.MemberMapper;
import com.app.controller.mapper.PostMapper;
import com.app.domain.vo.PostVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostAPI {

    private final PostMapper postMapper;

    @PostMapping("/write")
    public void postWrite(@RequestBody PostVO postVO) {
        postMapper.insert(postVO);
    }

    @GetMapping("/list")
    public List<PostVO> postList() {
        return postMapper.selectAll();
    }

    @PostMapping("/read")
    public PostVO postRead(@RequestBody PostVO postVO) {
        return postMapper.selectById(postVO.getId()).orElse(new PostVO());
    }

    @PostMapping("/count")
    public void postReadCount(@RequestBody PostVO postVO) {
        postMapper.updatePostReadCount(postVO.getId());
    }

    @PutMapping("/update")
    public void postUpdate(@RequestBody PostVO postVO) {
        postMapper.update(postVO);
    }

    @DeleteMapping("/delete")
    public void postDelete(@RequestBody PostVO postVO) {
        postMapper.delete(postVO.getId());
    }

}
