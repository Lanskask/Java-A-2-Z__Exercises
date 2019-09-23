package ru.smurtazin.cinema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.smurtazin.cinema.models.Hall;

public interface HallRepository extends JpaRepository<Hall, Long> {
}
