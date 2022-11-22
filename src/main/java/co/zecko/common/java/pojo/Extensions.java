package co.zecko.common.java.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Extensions {

    private static final long serialVersionUID = -4606681125986523611L;

    String code;

    Integer cost;

    Integer maxCost;
}
