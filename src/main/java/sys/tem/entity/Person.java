package sys.tem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    @EmbeddedId
    private PersonPrimaryKey personPrimaryKey;
    private String phoneOfNumber;
    private String cityOfLiving;
}
