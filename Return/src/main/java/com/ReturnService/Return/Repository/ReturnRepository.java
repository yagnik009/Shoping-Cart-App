package com.ReturnService.Return.Repository;

import com.ReturnService.Return.Entiry.Return;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnRepository extends JpaRepository<Return,Long> {
}
