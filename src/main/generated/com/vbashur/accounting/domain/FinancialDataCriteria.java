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
 * A {@code FinancialDataCriteria} provides fluent, type-safe API for querying documents
 * based on {@link FinancialData} model.
 *
 * <p>This class is immutable and thus thread-safe.</p>
 */
@Generated(from = "FinancialData", generator = "Criteria")
public class FinancialDataCriteria extends FinancialDataCriteriaTemplate<FinancialDataCriteria>
     implements Disjunction<FinancialDataCriteriaTemplate<FinancialDataCriteria>>  {

  /** Default criteria instance */
  public static final FinancialDataCriteria financialData = new FinancialDataCriteria(new CriteriaContext(FinancialData.class, creator()));

  /** Used to instantiate FinancialDataCriteria by other criterias */
  public static CriteriaCreator<FinancialDataCriteria> creator() {
     return FinancialDataCriteria::new;
  }

  private FinancialDataCriteria(CriteriaContext context) {
     super(context);
  }
}
