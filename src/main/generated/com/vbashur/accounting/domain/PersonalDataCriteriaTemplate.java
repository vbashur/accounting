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
 * Base class for {@link PersonalDataCriteria} also used as matcher attribute on other criterias.
 * @param <R> root self-type for fluent API
 */
@Generated(from = "PersonalData", generator = "Criteria")
public abstract class PersonalDataCriteriaTemplate<R> extends AbstractContextHolder implements Criterion<PersonalData>,
            AndMatcher<PersonalDataCriteria>, OrMatcher<PersonalDataCriteria>,
            NotMatcher<R, PersonalDataCriteria>,
            WithMatcher<R, PersonalDataCriteria>, Projection<PersonalData> {

   public final StringMatcher.Template<R> id;
   public final StringMatcher.Template<R> name;

   @SuppressWarnings("unchecked")
   PersonalDataCriteriaTemplate(CriteriaContext context) {
     super(context);
     this.id = (StringMatcher.Template<R>) StringMatcher.creator().create(context.newChild(PersonalData.class, "id", StringMatcher.creator()));
     this.name = (StringMatcher.Template<R>) StringMatcher.creator().create(context.newChild(PersonalData.class, "name", StringMatcher.creator()));
   }
}
