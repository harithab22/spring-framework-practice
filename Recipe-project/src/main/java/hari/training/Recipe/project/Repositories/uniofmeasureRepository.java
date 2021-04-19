package hari.training.Recipe.project.Repositories;

import hari.training.Recipe.project.model.unitofmeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface uniofmeasureRepository extends CrudRepository<unitofmeasure,Long> {
}
