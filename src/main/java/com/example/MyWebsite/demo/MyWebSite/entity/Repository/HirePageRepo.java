package com.example.MyWebsite.demo.MyWebSite.entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyWebsite.demo.MyWebSite.entity.HirePage;


@Repository
public interface HirePageRepo extends JpaRepository<HirePage, Integer> {

}
