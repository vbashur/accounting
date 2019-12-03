package com.vbashur.accounting.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.criteria.Criteria;
import org.immutables.value.Value;

@Value.Immutable
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(as = ImmutablePersonalData.class)
@JsonDeserialize(as = ImmutablePersonalData.class)
@Criteria
//@Criteria.Repository
public interface PersonalData {

//    @Criteria.Id
//    String id();

//    @Criteria.Id
    String name();
}
