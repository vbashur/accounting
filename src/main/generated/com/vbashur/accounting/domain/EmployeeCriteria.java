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
 * A {@code EmployeeCriteria} provides fluent, type-safe API for querying documents
 * based on {@link Employee} model.
 *
 * <p>This class is immutable and thus thread-safe.</p>
 */
@Generated(from = "Employee", generator = "Criteria")
public class EmployeeCriteria extends EmployeeCriteriaTemplate<EmployeeCriteria>
     implements Disjunction<EmployeeCriteriaTemplate<EmployeeCriteria>>  {

  /** Default criteria instance */
  public static final EmployeeCriteria employee = new EmployeeCriteria(new CriteriaContext(Employee.class, creator()));

  /** Used to instantiate EmployeeCriteria by other criterias */
  public static CriteriaCreator<EmployeeCriteria> creator() {
     return EmployeeCriteria::new;
  }

  private EmployeeCriteria(CriteriaContext context) {
     super(context);
  }
}
