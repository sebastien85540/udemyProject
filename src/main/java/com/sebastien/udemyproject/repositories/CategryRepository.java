package com.sebastien.udemyproject.repositories;

import com.sebastien.udemyproject.entities.CategoryEntity;
import com.sebastien.udemyproject.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategryRepository extends JpaRepository<CategoryEntity, Long> {
}
