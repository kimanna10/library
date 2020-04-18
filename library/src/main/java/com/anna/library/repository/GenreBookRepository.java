package com.anna.library.repository;

import com.anna.library.entity.GenreBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreBookRepository extends JpaRepository<GenreBook, Integer> {
}