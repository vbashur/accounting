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
import org.immutables.criteria.matcher.DoubleMatcher;
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
 * Base class for {@link FinancialDataCriteria} also used as matcher attribute on other criterias.
 * @param <R> root self-type for fluent API
 */
@Generated(from = "FinancialData", generator = "Criteria")
public abstract class FinancialDataCriteriaTemplate<R> extends AbstractContextHolder implements Criterion<FinancialData>,
            AndMatcher<FinancialDataCriteria>, OrMatcher<FinancialDataCriteria>,
            NotMatcher<R, FinancialDataCriteria>,
            WithMatcher<R, FinancialDataCriteria>, Projection<FinancialData> {

   public final DoubleMatcher.Template<R> monthIncome;

   @SuppressWarnings("unchecked")
   FinancialDataCriteriaTemplate(CriteriaContext context) {
     super(context);
     this.monthIncome = (DoubleMatcher.Template<R>) DoubleMatcher.creator().create(context.newChild(FinancialData.class, "monthIncome", DoubleMatcher.creator()));
   }
}
