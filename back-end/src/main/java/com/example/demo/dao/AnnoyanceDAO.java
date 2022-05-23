package com.example.demo.dao;

import com.example.demo.entity.Annoyance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnoyanceDAO extends JpaRepository<Annoyance, Integer> {
    List<Annoyance> findByAccount(String account);
}