package com.example.demo.Repository;

import com.example.demo.Entity.testEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import java.util.List;

@Repository
public interface testRespository extends JpaRepository<testEntity, Long>{
}
