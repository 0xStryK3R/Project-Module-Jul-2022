package com.scaler.todo_withdb.tasks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<TaskEntity, Long> {

    @Query("select case when count(t)> 0 then true else false end from tasks t where lower(t.name) like lower(:name)")
    boolean existsByName(@Param("name") String name);
}
