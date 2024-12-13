package pl.jareczeq.kodillahibernate.invoice.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.jareczeq.kodillahibernate.invoice.Invoice;
import pl.jareczeq.kodillahibernate.invoice.Item;
import pl.jareczeq.kodillahibernate.invoice.Product;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Ham");

        Item item1 = new Item(product, BigDecimal.valueOf(6.5), 10, BigDecimal.valueOf(15));
        Item item2 = new Item(product, BigDecimal.valueOf(3.5), 5, BigDecimal.valueOf(10));
        Item item3 = new Item(product, BigDecimal.valueOf(3.5), 5, BigDecimal.valueOf(10));

        Invoice invoice = new Invoice("42198389");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product);
        int productId = product.getId();
        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();
        itemDao.save(item3);
        int item3Id = item3.getId();

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, productId);
        assertNotEquals(0, item1Id);
        assertNotEquals(0, item2Id);
        assertNotEquals(0, item3Id);
        assertNotEquals(0, invoiceId);

        //CleanUp
        productDao.deleteById(productId);
        itemDao.deleteById(item1Id);
        itemDao.deleteById(item2Id);
        itemDao.deleteById(item3Id);
        invoiceDao.deleteById(invoiceId);
    }

}
