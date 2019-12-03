package com.vbashur.accounting.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = ImmutablePersonalData.class)
@JsonDeserialize(as = ImmutablePersonalData.class)
public interface PersonalData {

    String name();
}
