package pl.jareczeq.kodillahibernate.invoice.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.jareczeq.kodillahibernate.invoice.Item;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {

}
