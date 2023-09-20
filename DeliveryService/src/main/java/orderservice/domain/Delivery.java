package orderservice.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import orderservice.DeliveryServiceApplication;
import orderservice.domain.Delivered;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    private String productId;

    private String customerId;

    @PostPersist
    public void onPostPersist() {
        Delivered delivered = new Delivered(this);
        delivered.publishAfterCommit();
    }

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryServiceApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startDelivery(Ordered ordered) {
        //implement business logic here:

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        Delivered delivered = new Delivered(delivery);
        delivered.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);

            Delivered delivered = new Delivered(delivery);
            delivered.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
