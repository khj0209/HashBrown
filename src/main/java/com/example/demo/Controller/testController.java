package com.example.demo.Controller;

import com.example.demo.Entity.testEntity;
import com.example.demo.Repository.testRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class testController {

    private final testRespository testRepository;

    /**
     * 멤버 조회
     * @return
     */
    @GetMapping("member")
    public List<testEntity> findAllMember() {
        return testRepository.findAll();
    }

    /**
     * 회원가입
     * @return
     */
    @PostMapping("member")
    public testEntity signUp() {
        final testEntity member = testEntity.builder()
                .username("test_user@gmail.com")
                .hosu("test user")
                .build();
        return testRepository.save(member);
    }
}
    

