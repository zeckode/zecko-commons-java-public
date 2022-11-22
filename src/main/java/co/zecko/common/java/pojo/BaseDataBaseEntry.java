package co.zecko.common.java.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseDataBaseEntry extends AbstractEntry<Long> {

    private static final long serialVersionUID = 1349160665663941607L;

    private Long id;

    private Date createdAt;

    private Date updatedAt;

    private String createdBy;

    String message;

    Date timestamp;
}