package pl.jareczeq.kodillahibernate.manytomany.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.jareczeq.kodillahibernate.manytomany.Company;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

}
