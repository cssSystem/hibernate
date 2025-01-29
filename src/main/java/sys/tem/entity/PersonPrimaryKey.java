package sys.tem.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonPrimaryKey implements Serializable {
    @Serial
    private static final long serialVersionUID = -8017169685576683498L;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private int age;
}
