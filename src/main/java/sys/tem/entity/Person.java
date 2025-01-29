package sys.tem.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.EmbeddedId;

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
