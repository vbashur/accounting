package com.vbashur.accounting.domain;

import java.util.Objects;
import org.immutables.criteria.Criterion;
import org.immutables.criteria.expression.Call;
import org.immutables.criteria.expression.Constant;
import org.immutables.criteria.expression.Expression;
import org.immutables.criteria.expression.ExpressionVisitor;
import org.immutables.criteria.expression.Expressions;
import org.immutables.criteria.expression.Operator;
import org.immutables.criteria.expression.Operators;
import org.immutables.criteria.expression.Path;
import org.immutables.criteria.matcher.AbstractContextHolder;
import org.immutables.criteria.matcher.AndMatcher;
import org.immutables.criteria.matcher.BooleanMatcher;
import org.immutables.criteria.matcher.ComparableMatcher;
import org.immutables.criteria.matcher.CriteriaContext;
import org.immutables.criteria.matcher.CriteriaCreator;
import org.immutables.criteria.matcher.IterableMatcher;
import org.immutables.criteria.matcher.Matchers;
import org.immutables.criteria.matcher.NotMatcher;
import org.immutables.criteria.matcher.ObjectMatcher;
import org.immutables.criteria.matcher.OptionalMatcher;
import org.immutables.criteria.matcher.OrMatcher;
import org.immutables.criteria.matcher.Projection;
import org.immutables.criteria.matcher.StringMatcher;
import org.immutables.criteria.matcher.WithMatcher;
import org.immutables.value.Generated;


/**
 * Base class for {@link EmployeeCriteria} also used as matcher attribute on other criterias.
 * @param <R> root self-type for fluent API
 */
@Generated(from = "Employee", generator = "Criteria")
public abstract class EmployeeCriteriaTemplate<R> extends AbstractContextHolder implements Criterion<Employee>,
            AndMatcher<EmployeeCriteria>, OrMatcher<EmployeeCriteria>,
            NotMatcher<R, EmployeeCriteria>,
            WithMatcher<R, EmployeeCriteria>, Projection<Employee> {

   public final PersonalDataCriteriaTemplate<R> personalData;
   public final FinancialDataCriteriaTemplate<R> financialData;

   @SuppressWarnings("unchecked")
   EmployeeCriteriaTemplate(CriteriaContext context) {
     super(context);
     this.personalData = (PersonalDataCriteriaTemplate<R>) PersonalDataCriteria.creator().create(context.newChild(Employee.class, "personalData", PersonalDataCriteria.creator()));
     this.financialData = (FinancialDataCriteriaTemplate<R>) FinancialDataCriteria.creator().create(context.newChild(Employee.class, "financialData", FinancialDataCriteria.creator()));
   }
}
