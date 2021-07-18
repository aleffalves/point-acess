package com.github.aleffalves.pointacess.repository;

import com.github.aleffalves.pointacess.model.WorkJorney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JourneyRepository extends JpaRepository<WorkJorney,Long> {
}
