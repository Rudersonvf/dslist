package com.rudersonvf.dslist.repositories;

import com.rudersonvf.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
