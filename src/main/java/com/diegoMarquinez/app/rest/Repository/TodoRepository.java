package com.diegoMarquinez.app.rest.Repository;

import com.diegoMarquinez.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
