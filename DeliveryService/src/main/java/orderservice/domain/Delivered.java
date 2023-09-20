package orderservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import orderservice.domain.*;
import orderservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Delivered extends AbstractEvent {

    private Long id;

    public Delivered(Delivery aggregate) {
        super(aggregate);
    }

    public Delivered() {
        super();
    }
}
//>>> DDD / Domain Event
