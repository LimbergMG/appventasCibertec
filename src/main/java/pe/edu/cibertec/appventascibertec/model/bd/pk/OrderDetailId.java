package pe.edu.cibertec.appventascibertec.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Embeddable
public class OrderDetailId {
    private Integer orderid;
    private Integer productid;
}
