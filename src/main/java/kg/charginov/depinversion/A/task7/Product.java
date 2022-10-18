package kg.charginov.depinversion.A.task7;

import jdk.jfr.DataAmount;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Product {

    int price;

    String name;

    String manufacturer;

}
