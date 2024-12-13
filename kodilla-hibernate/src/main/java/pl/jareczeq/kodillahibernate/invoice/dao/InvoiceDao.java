package pl.jareczeq.kodillahibernate.invoice.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.jareczeq.kodillahibernate.invoice.Invoice;

import java.util.List;

@Transactional
@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
    List<Invoice> findByNumber(String number);
}
