package co.zecko.common.java.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntry  implements Serializable {

    private static final long serialVersionUID = 1166608276332260653L;

    List<ErrorEntry> errors;

    String message;

    Date timestamp;
}
