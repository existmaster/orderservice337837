package orderservice.domain;

import java.util.*;
import lombok.*;
import orderservice.domain.*;
import orderservice.infra.AbstractEvent;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
}
