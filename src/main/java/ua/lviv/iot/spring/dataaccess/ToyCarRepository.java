package ua.lviv.iot.spring.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.rest.model.ToyCar;

@Repository
public interface ToyCarRepository extends JpaRepository<ToyCar, Integer> {

}
