package com.rudersonvf.dslist.repositories;

import com.rudersonvf.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
