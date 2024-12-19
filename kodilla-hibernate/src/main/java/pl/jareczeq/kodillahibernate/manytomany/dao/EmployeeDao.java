package pl.jareczeq.kodillahibernate.manytomany.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.jareczeq.kodillahibernate.manytomany.Employee;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> findByLastName(@Param("LASTNAME") String lastName);
}
