import org.example.Customer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    @Test
    public void canRemoveMoney(){
        Customer customer = new Customer("John Smith", 10000);
        customer.removeMoney(1000);
        assertThat(customer.getWallet()).isEqualTo(9000);
    }
}
