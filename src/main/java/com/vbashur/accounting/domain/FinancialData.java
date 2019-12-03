package com.vbashur.accounting.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.criteria.Criteria;
import org.immutables.value.Value;

@Value.Immutable
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = ImmutableFinancialData.class)
@JsonDeserialize(as = ImmutableFinancialData.class)
@Criteria
//@Criteria.Repository
public interface FinancialData {

//    @Criteria.Id
//    String id();

    //    @Value.Parameter
//    @Criteria.Id
    @JsonProperty("monthIncome")
    Double monthIncome();
}
