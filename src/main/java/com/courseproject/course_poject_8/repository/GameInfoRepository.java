package com.courseproject.course_poject_8.repository;

import com.courseproject.course_poject_8.entity.GameInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameInfoRepository extends CrudRepository<GameInfo, Long> {
}
