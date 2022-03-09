package kodlamaio.northwind.entities.concretes;

/*NOT NEDEN LOMBOK, DATA KULLANMADIGIMI MERAK EDERSENİZ EGİTİMCİ ARKADAS OYLE  YAPTIGI İCİN TEK TEK
EKLEDİM CONSTRUCTOR VE GETTER SETTERLERİ VE DEPENDENCİES KISMINDA LOMBOK YOK EKLEMEDİM*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

}
