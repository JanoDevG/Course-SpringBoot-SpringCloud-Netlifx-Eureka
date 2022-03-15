package cl.janodevg.itemservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Product product;
    private int number;

    public double getTotal() {
        return this.product.getPrice() * this.number;
    }

}
