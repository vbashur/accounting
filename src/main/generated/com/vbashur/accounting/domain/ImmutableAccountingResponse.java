package com.vbashur.accounting.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AccountingResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccountingResponse.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAccountingResponse.of()}.
 */
@Generated(from = "AccountingResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableAccountingResponse implements AccountingResponse {
  private final ImmutableList<Employee> employees;
  private final String message;

  private ImmutableAccountingResponse(Iterable<? extends Employee> employees, String message) {
    this.employees = ImmutableList.copyOf(employees);
    this.message = Objects.requireNonNull(message, "message");
  }

  private ImmutableAccountingResponse(
      ImmutableAccountingResponse original,
      ImmutableList<Employee> employees,
      String message) {
    this.employees = employees;
    this.message = message;
  }

  /**
   * @return The value of the {@code employees} attribute
   */
  @JsonProperty("employees")
  @Override
  public ImmutableList<Employee> employees() {
    return employees;
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @JsonProperty("message")
  @Override
  public String message() {
    return message;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AccountingResponse#employees() employees}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccountingResponse withEmployees(Employee... elements) {
    ImmutableList<Employee> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAccountingResponse(this, newValue, this.message);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AccountingResponse#employees() employees}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of employees elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccountingResponse withEmployees(Iterable<? extends Employee> elements) {
    if (this.employees == elements) return this;
    ImmutableList<Employee> newValue = ImmutableList.copyOf(elements);
    return new ImmutableAccountingResponse(this, newValue, this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountingResponse#message() message} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountingResponse withMessage(String value) {
    String newValue = Objects.requireNonNull(value, "message");
    if (this.message.equals(newValue)) return this;
    return new ImmutableAccountingResponse(this, this.employees, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccountingResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccountingResponse
        && equalTo((ImmutableAccountingResponse) another);
  }

  private boolean equalTo(ImmutableAccountingResponse another) {
    return employees.equals(another.employees)
        && message.equals(another.message);
  }

  /**
   * Computes a hash code from attributes: {@code employees}, {@code message}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + employees.hashCode();
    h += (h << 5) + message.hashCode();
    return h;
  }


  /**
   * Prints the immutable value {@code AccountingResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AccountingResponse")
        .omitNullValues()
        .add("employees", employees)
        .add("message", message)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AccountingResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AccountingResponse {
    List<Employee> employees = ImmutableList.of();
    String message;
    @JsonProperty("employees")
    public void setEmployees(List<Employee> employees) {
      this.employees = employees;
    }
    @JsonProperty("message")
    public void setMessage(String message) {
      this.message = message;
    }
    @Override
    public List<Employee> employees() { throw new UnsupportedOperationException(); }
    @Override
    public String message() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAccountingResponse fromJson(Json json) {
    ImmutableAccountingResponse.Builder builder = ImmutableAccountingResponse.builder();
    if (json.employees != null) {
      builder.addAllEmployees(json.employees);
    }
    if (json.message != null) {
      builder.message(json.message);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code AccountingResponse} instance.
   * @param employees The value for the {@code employees} attribute
   * @param message The value for the {@code message} attribute
   * @return An immutable AccountingResponse instance
   */
  public static ImmutableAccountingResponse of(List<Employee> employees, String message) {
    return of((Iterable<? extends Employee>) employees, message);
  }

  /**
   * Construct a new immutable {@code AccountingResponse} instance.
   * @param employees The value for the {@code employees} attribute
   * @param message The value for the {@code message} attribute
   * @return An immutable AccountingResponse instance
   */
  public static ImmutableAccountingResponse of(Iterable<? extends Employee> employees, String message) {
    return new ImmutableAccountingResponse(employees, message);
  }

  /**
   * Creates an immutable copy of a {@link AccountingResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccountingResponse instance
   */
  public static ImmutableAccountingResponse copyOf(AccountingResponse instance) {
    if (instance instanceof ImmutableAccountingResponse) {
      return (ImmutableAccountingResponse) instance;
    }
    return ImmutableAccountingResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAccountingResponse ImmutableAccountingResponse}.
   * <pre>
   * ImmutableAccountingResponse.builder()
   *    .addEmployees|addAllEmployees(com.vbashur.accounting.domain.Employee) // {@link AccountingResponse#employees() employees} elements
   *    .message(String) // required {@link AccountingResponse#message() message}
   *    .build();
   * </pre>
   * @return A new ImmutableAccountingResponse builder
   */
  public static ImmutableAccountingResponse.Builder builder() {
    return new ImmutableAccountingResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAccountingResponse ImmutableAccountingResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AccountingResponse", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_MESSAGE = 0x1L;
    private long initBits = 0x1L;

    private ImmutableList.Builder<Employee> employees = ImmutableList.builder();
    private String message;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AccountingResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AccountingResponse instance) {
      Objects.requireNonNull(instance, "instance");
      addAllEmployees(instance.employees());
      message(instance.message());
      return this;
    }

    /**
     * Adds one element to {@link AccountingResponse#employees() employees} list.
     * @param element A employees element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmployees(Employee element) {
      this.employees.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AccountingResponse#employees() employees} list.
     * @param elements An array of employees elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addEmployees(Employee... elements) {
      this.employees.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link AccountingResponse#employees() employees} list.
     * @param elements An iterable of employees elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("employees")
    public final Builder employees(Iterable<? extends Employee> elements) {
      this.employees = ImmutableList.builder();
      return addAllEmployees(elements);
    }

    /**
     * Adds elements to {@link AccountingResponse#employees() employees} list.
     * @param elements An iterable of employees elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllEmployees(Iterable<? extends Employee> elements) {
      this.employees.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link AccountingResponse#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("message")
    public final Builder message(String message) {
      this.message = Objects.requireNonNull(message, "message");
      initBits &= ~INIT_BIT_MESSAGE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAccountingResponse ImmutableAccountingResponse}.
     * @return An immutable instance of AccountingResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAccountingResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAccountingResponse(null, employees.build(), message);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_MESSAGE) != 0) attributes.add("message");
      return "Cannot build AccountingResponse, some of required attributes are not set " + attributes;
    }
  }
}
