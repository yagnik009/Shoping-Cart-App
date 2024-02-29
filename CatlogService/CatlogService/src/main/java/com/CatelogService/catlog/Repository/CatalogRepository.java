package com.CatelogService.catlog.Repository;


import com.CatelogService.catlog.Entity.Catlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<Catlog,Long> {
}
