package com.vbashur.accounting.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.reactivex.annotations.Nullable;
import org.immutables.value.Value;

import java.util.List;


@Value.Immutable
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = ImmutableAccountingResponse.class)
@JsonDeserialize(as = ImmutableAccountingResponse.class)
public interface AccountingResponse {

    @Value.Parameter
    List<Employee> employees();

    @Value.Parameter
    String message();
}
