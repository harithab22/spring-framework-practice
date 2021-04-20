package hari.training.Recipe.project.Repositories;

import hari.training.Recipe.project.model.unitofmeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface uniofmeasureRepository extends CrudRepository<unitofmeasure,Long> {
    Optional<unitofmeasure> findByDescription(String description);
}
