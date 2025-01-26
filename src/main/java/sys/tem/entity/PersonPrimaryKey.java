package sys.tem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonPrimaryKey {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private int age;
}
