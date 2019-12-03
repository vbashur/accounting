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
 * Immutable implementation of {@link PersonalData}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePersonalData.builder()}.
 */
@Generated(from = "PersonalData", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePersonalData implements PersonalData {
  private final String id;
  private final String name;

  private ImmutablePersonalData(String id, String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PersonalData#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePersonalData withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutablePersonalData(newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PersonalData#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePersonalData withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePersonalData(this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePersonalData} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePersonalData
        && equalTo((ImmutablePersonalData) another);
  }

  private boolean equalTo(ImmutablePersonalData another) {
    return id.equals(another.id)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + name.hashCode();
    return h;
  }


  /**
   * Prints the immutable value {@code PersonalData} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PersonalData")
        .omitNullValues()
        .add("id", id)
        .add("name", name)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PersonalData", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PersonalData {
    String id;
    String name;
    @JsonProperty("id")
    public void setId(String id) {
      this.id = id;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @Override
    public String id() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePersonalData fromJson(Json json) {
    ImmutablePersonalData.Builder builder = ImmutablePersonalData.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PersonalData} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PersonalData instance
   */
  public static ImmutablePersonalData copyOf(PersonalData instance) {
    if (instance instanceof ImmutablePersonalData) {
      return (ImmutablePersonalData) instance;
    }
    return ImmutablePersonalData.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePersonalData ImmutablePersonalData}.
   * <pre>
   * ImmutablePersonalData.builder()
   *    .id(String) // required {@link PersonalData#id() id}
   *    .name(String) // required {@link PersonalData#name() name}
   *    .build();
   * </pre>
   * @return A new ImmutablePersonalData builder
   */
  public static ImmutablePersonalData.Builder builder() {
    return new ImmutablePersonalData.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePersonalData ImmutablePersonalData}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PersonalData", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private long initBits = 0x3L;

    private String id;
    private String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PersonalData} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PersonalData instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      name(instance.name());
      return this;
    }

    /**
     * Initializes the value for the {@link PersonalData#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PersonalData#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePersonalData ImmutablePersonalData}.
     * @return An immutable instance of PersonalData
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePersonalData build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePersonalData(id, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      return "Cannot build PersonalData, some of required attributes are not set " + attributes;
    }
  }
}
