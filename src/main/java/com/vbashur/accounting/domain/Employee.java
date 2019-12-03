package com.vbashur.accounting.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.criteria.Criteria;
import org.immutables.criteria.repository.sync.SyncReadable;
import org.immutables.criteria.repository.sync.SyncWritable;
import org.immutables.value.Value;

@Value.Immutable
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = ImmutableEmployee.class)
@JsonDeserialize(as = ImmutableEmployee.class)
@Criteria
@Criteria.Repository(facets= {SyncWritable.class, SyncReadable.class})
public interface Employee {

    @Criteria.Id
    String id();

//    String name();

//    @Value.Parameter
    @JsonProperty("personalData")
    PersonalData personalData();

//    @Value.Parameter
    @JsonProperty("financialData")
    FinancialData financialData();
}
