package com.anna.library.repository;


import com.anna.library.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {
//    List<Library> findByClient_idContains(int id);
//    List<Library> findAllByBook_id(int id);
}
