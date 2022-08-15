package com.mustardus.frog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustardus.frog.Model.Frog;

@Repository
public interface FrogRepository extends JpaRepository<Frog, Integer>{

}
