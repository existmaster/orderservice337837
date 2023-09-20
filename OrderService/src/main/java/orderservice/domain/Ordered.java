package orderservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import orderservice.domain.*;
import orderservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;

    public Ordered(Order aggregate) {
        super(aggregate);
    }

    public Ordered() {
        super();
    }
}
//>>> DDD / Domain Event
