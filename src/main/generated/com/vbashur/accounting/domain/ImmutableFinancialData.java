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
 * Immutable implementation of {@link FinancialData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFinancialData.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableFinancialData.of()}.
 */
@Generated(from = "FinancialData", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableFinancialData implements FinancialData {
  private final Double monthIncome;

  private ImmutableFinancialData(Double monthIncome) {
    this.monthIncome = Objects.requireNonNull(monthIncome, "monthIncome");
  }

  private ImmutableFinancialData(ImmutableFinancialData original, Double monthIncome) {
    this.monthIncome = monthIncome;
  }

  /**
   * @return The value of the {@code monthIncome} attribute
   */
  @JsonProperty("monthIncome")
  @Override
  public Double monthIncome() {
    return monthIncome;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link FinancialData#monthIncome() monthIncome} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for monthIncome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableFinancialData withMonthIncome(Double value) {
    Double newValue = Objects.requireNonNull(value, "monthIncome");
    if (this.monthIncome.equals(newValue)) return this;
    return new ImmutableFinancialData(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFinancialData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFinancialData
        && equalTo((ImmutableFinancialData) another);
  }

  private boolean equalTo(ImmutableFinancialData another) {
    return monthIncome.equals(another.monthIncome);
  }

  /**
   * Computes a hash code from attributes: {@code monthIncome}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + monthIncome.hashCode();
    return h;
  }


  /**
   * Prints the immutable value {@code FinancialData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("FinancialData")
        .omitNullValues()
        .add("monthIncome", monthIncome)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "FinancialData", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements FinancialData {
    Double monthIncome;
    @JsonProperty("monthIncome")
    public void setMonthIncome(Double monthIncome) {
      this.monthIncome = monthIncome;
    }
    @Override
    public Double monthIncome() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableFinancialData fromJson(Json json) {
    ImmutableFinancialData.Builder builder = ImmutableFinancialData.builder();
    if (json.monthIncome != null) {
      builder.monthIncome(json.monthIncome);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code FinancialData} instance.
   * @param monthIncome The value for the {@code monthIncome} attribute
   * @return An immutable FinancialData instance
   */
  public static ImmutableFinancialData of(Double monthIncome) {
    return new ImmutableFinancialData(monthIncome);
  }

  /**
   * Creates an immutable copy of a {@link FinancialData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable FinancialData instance
   */
  public static ImmutableFinancialData copyOf(FinancialData instance) {
    if (instance instanceof ImmutableFinancialData) {
      return (ImmutableFinancialData) instance;
    }
    return ImmutableFinancialData.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFinancialData ImmutableFinancialData}.
   * <pre>
   * ImmutableFinancialData.builder()
   *    .monthIncome(Double) // required {@link FinancialData#monthIncome() monthIncome}
   *    .build();
   * </pre>
   * @return A new ImmutableFinancialData builder
   */
  public static ImmutableFinancialData.Builder builder() {
    return new ImmutableFinancialData.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFinancialData ImmutableFinancialData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "FinancialData", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_MONTH_INCOME = 0x1L;
    private long initBits = 0x1L;

    private Double monthIncome;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code FinancialData} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(FinancialData instance) {
      Objects.requireNonNull(instance, "instance");
      monthIncome(instance.monthIncome());
      return this;
    }

    /**
     * Initializes the value for the {@link FinancialData#monthIncome() monthIncome} attribute.
     * @param monthIncome The value for monthIncome 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("monthIncome")
    public final Builder monthIncome(Double monthIncome) {
      this.monthIncome = Objects.requireNonNull(monthIncome, "monthIncome");
      initBits &= ~INIT_BIT_MONTH_INCOME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableFinancialData ImmutableFinancialData}.
     * @return An immutable instance of FinancialData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFinancialData build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableFinancialData(null, monthIncome);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_MONTH_INCOME) != 0) attributes.add("monthIncome");
      return "Cannot build FinancialData, some of required attributes are not set " + attributes;
    }
  }
}
