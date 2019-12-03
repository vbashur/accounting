package com.vbashur.accounting.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.criteria.Criteria;
import org.immutables.value.Value;

@Value.Immutable
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = ImmutableEmployee.class)
@JsonDeserialize(as = ImmutableEmployee.class)
@Criteria
@Criteria.Repository
public interface Employee {

    @Value.Parameter
    @JsonProperty("personalData")
    PersonalData personalData();

    @Value.Parameter
    @JsonProperty("financialData")
    FinancialData financialData();
}
