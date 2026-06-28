package com.urlshortener.repository;

import com.urlshortener.model.Click;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClickRepository extends JpaRepository<Click, Long> {

    List<Click> findByShortUrlId(Long shortUrlId);

    long countByShortUrlId(Long shortUrlId);
}