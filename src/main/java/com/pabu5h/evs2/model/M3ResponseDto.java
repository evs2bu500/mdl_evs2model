package com.pabu5h.evs2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class M3ResponseDto<T> {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    T result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    String mid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    String rls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rls_mid")
    String rlsMid;
}
