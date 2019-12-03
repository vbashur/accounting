package com.vbashur.accounting.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Employee}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEmployee.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableEmployee.of()}.
 */
@Generated(from = "Employee", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableEmployee implements Employee {
  private final ImmutablePersonalData personalData;
  private final ImmutableFinancialData financialData;

  private ImmutableEmployee(
      PersonalData personalData,
      FinancialData financialData) {
    this.personalData = ImmutablePersonalData.copyOf(personalData);
    this.financialData = ImmutableFinancialData.copyOf(financialData);
  }

  private ImmutableEmployee(
      ImmutableEmployee original,
      ImmutablePersonalData personalData,
      ImmutableFinancialData financialData) {
    this.personalData = personalData;
    this.financialData = financialData;
  }

  /**
   * @return The value of the {@code personalData} attribute
   */
  @JsonProperty("personalData")
  @Override
  public ImmutablePersonalData personalData() {
    return personalData;
  }

  /**
   * @return The value of the {@code financialData} attribute
   */
  @JsonProperty("financialData")
  @Override
  public ImmutableFinancialData financialData() {
    return financialData;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#personalData() personalData} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for personalData
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withPersonalData(PersonalData value) {
    if (this.personalData == value) return this;
    ImmutablePersonalData newValue = ImmutablePersonalData.copyOf(value);
    return new ImmutableEmployee(this, newValue, this.financialData);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Employee#financialData() financialData} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for financialData
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEmployee withFinancialData(FinancialData value) {
    if (this.financialData == value) return this;
    ImmutableFinancialData newValue = ImmutableFinancialData.copyOf(value);
    return new ImmutableEmployee(this, this.personalData, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEmployee} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEmployee
        && equalTo((ImmutableEmployee) another);
  }

  private boolean equalTo(ImmutableEmployee another) {
    return personalData.equals(another.personalData)
        && financialData.equals(another.financialData);
  }

  /**
   * Computes a hash code from attributes: {@code personalData}, {@code financialData}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + personalData.hashCode();
    h += (h << 5) + financialData.hashCode();
    return h;
  }


  /**
   * Prints the immutable value {@code Employee} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Employee")
        .omitNullValues()
        .add("personalData", personalData)
        .add("financialData", financialData)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Employee", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Employee {
    PersonalData personalData;
    FinancialData financialData;
    @JsonProperty("personalData")
    public void setPersonalData(PersonalData personalData) {
      this.personalData = personalData;
    }
    @JsonProperty("financialData")
    public void setFinancialData(FinancialData financialData) {
      this.financialData = financialData;
    }
    @Override
    public PersonalData personalData() { throw new UnsupportedOperationException(); }
    @Override
    public FinancialData financialData() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEmployee fromJson(Json json) {
    ImmutableEmployee.Builder builder = ImmutableEmployee.builder();
    if (json.personalData != null) {
      builder.personalData(json.personalData);
    }
    if (json.financialData != null) {
      builder.financialData(json.financialData);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code Employee} instance.
   * @param personalData The value for the {@code personalData} attribute
   * @param financialData The value for the {@code financialData} attribute
   * @return An immutable Employee instance
   */
  public static ImmutableEmployee of(PersonalData personalData, FinancialData financialData) {
    return new ImmutableEmployee(personalData, financialData);
  }

  /**
   * Creates an immutable copy of a {@link Employee} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Employee instance
   */
  public static ImmutableEmployee copyOf(Employee instance) {
    if (instance instanceof ImmutableEmployee) {
      return (ImmutableEmployee) instance;
    }
    return ImmutableEmployee.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEmployee ImmutableEmployee}.
   * <pre>
   * ImmutableEmployee.builder()
   *    .personalData(com.vbashur.accounting.domain.PersonalData) // required {@link Employee#personalData() personalData}
   *    .financialData(com.vbashur.accounting.domain.FinancialData) // required {@link Employee#financialData() financialData}
   *    .build();
   * </pre>
   * @return A new ImmutableEmployee builder
   */
  public static ImmutableEmployee.Builder builder() {
    return new ImmutableEmployee.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEmployee ImmutableEmployee}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Employee", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_PERSONAL_DATA = 0x1L;
    private static final long INIT_BIT_FINANCIAL_DATA = 0x2L;
    private long initBits = 0x3L;

    private PersonalData personalData;
    private FinancialData financialData;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Employee} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Employee instance) {
      Objects.requireNonNull(instance, "instance");
      personalData(instance.personalData());
      financialData(instance.financialData());
      return this;
    }

    /**
     * Initializes the value for the {@link Employee#personalData() personalData} attribute.
     * @param personalData The value for personalData 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("personalData")
    public final Builder personalData(PersonalData personalData) {
      this.personalData = ImmutablePersonalData.copyOf(personalData);
      initBits &= ~INIT_BIT_PERSONAL_DATA;
      return this;
    }

    /**
     * Constructs and initializes the value for the {@link Employee#financialData() financialData} attribute.
     * @param monthIncome The value for {@code financialData.monthIncome} 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder financialData(Double monthIncome) {
      return financialData(ImmutableFinancialData.of(monthIncome));
    }

    /**
     * Initializes the value for the {@link Employee#financialData() financialData} attribute.
     * @param financialData The value for financialData 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("financialData")
    public final Builder financialData(FinancialData financialData) {
      this.financialData = ImmutableFinancialData.copyOf(financialData);
      initBits &= ~INIT_BIT_FINANCIAL_DATA;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEmployee ImmutableEmployee}.
     * @return An immutable instance of Employee
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEmployee build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEmployee(
          null,
          ImmutablePersonalData.copyOf(personalData),
          ImmutableFinancialData.copyOf(financialData));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PERSONAL_DATA) != 0) attributes.add("personalData");
      if ((initBits & INIT_BIT_FINANCIAL_DATA) != 0) attributes.add("financialData");
      return "Cannot build Employee, some of required attributes are not set " + attributes;
    }
  }
}
