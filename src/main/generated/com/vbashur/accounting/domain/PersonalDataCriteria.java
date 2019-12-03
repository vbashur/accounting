package com.vbashur.accounting.domain;

import org.immutables.criteria.Criterion;
import org.immutables.criteria.expression.Query;
import org.immutables.criteria.expression.Queryable;
import org.immutables.criteria.matcher.AbstractContextHolder;
import org.immutables.criteria.matcher.CriteriaContext;
import org.immutables.criteria.matcher.CriteriaCreator;
import org.immutables.criteria.matcher.Disjunction;
import org.immutables.value.Generated;


/**
 * A {@code PersonalDataCriteria} provides fluent, type-safe API for querying documents
 * based on {@link PersonalData} model.
 *
 * <p>This class is immutable and thus thread-safe.</p>
 */
@Generated(from = "PersonalData", generator = "Criteria")
public class PersonalDataCriteria extends PersonalDataCriteriaTemplate<PersonalDataCriteria>
     implements Disjunction<PersonalDataCriteriaTemplate<PersonalDataCriteria>>  {

  /** Default criteria instance */
  public static final PersonalDataCriteria personalData = new PersonalDataCriteria(new CriteriaContext(PersonalData.class, creator()));

  /** Used to instantiate PersonalDataCriteria by other criterias */
  public static CriteriaCreator<PersonalDataCriteria> creator() {
     return PersonalDataCriteria::new;
  }

  private PersonalDataCriteria(CriteriaContext context) {
     super(context);
  }
}
