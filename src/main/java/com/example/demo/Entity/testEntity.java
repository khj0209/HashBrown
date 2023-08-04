package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter // getter 메소드 생성
@Builder // 빌더를 사용할 수 있게 함
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="usertest") // 테이블 명을 작성

public class testEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pid;

    @Column(nullable = false, unique = true, length = 30)
    private String username;

    @Column(nullable = false, length = 100)
    private String hosu;

    public testEntity(String username, String hosu) {
        this.username = username;
        this.hosu = hosu;
    }
    
}
