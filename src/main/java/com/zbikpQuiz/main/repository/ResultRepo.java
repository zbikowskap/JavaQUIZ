package com.zbikpQuiz.main.repository;

import com.zbikpQuiz.main.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}
