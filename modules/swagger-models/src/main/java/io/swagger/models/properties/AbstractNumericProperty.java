package io.swagger.models.properties;

import java.math.BigDecimal;

public abstract class AbstractNumericProperty extends AbstractProperty implements Property {


    public AbstractNumericProperty minimum(BigDecimal minimum) {
        this.setMinimum(minimum);
        return this;
    }

    public AbstractNumericProperty maximum(BigDecimal maximum) {
        this.setMaximum(maximum);
        return this;
    }

    public AbstractNumericProperty exclusiveMinimum(Boolean exclusiveMinimum) {
        this.setExclusiveMinimum(exclusiveMinimum);
        return this;
    }

    public AbstractNumericProperty exclusiveMaximum(Boolean exclusiveMaximum) {
        this.setExclusiveMaximum(exclusiveMaximum);
        return this;
    }

    public AbstractNumericProperty multipleOf(BigDecimal multipleOf) {
        this.setMultipleOf(multipleOf);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractNumericProperty)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        AbstractNumericProperty that = (AbstractNumericProperty) o;

        if (minimum != null ? !minimum.equals(that.minimum) : that.minimum != null) {
            return false;
        }
        if (maximum != null ? !maximum.equals(that.maximum) : that.maximum != null) {
            return false;
        }
        if (multipleOf != null ? !multipleOf.equals(that.multipleOf) : that.multipleOf != null) {
            return false;
        }
        if (exclusiveMinimum != null ? !exclusiveMinimum.equals(that.exclusiveMinimum) : that.exclusiveMinimum != null) {
            return false;
        }
        return exclusiveMaximum != null ? exclusiveMaximum.equals(that.exclusiveMaximum) : that.exclusiveMaximum == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (minimum != null ? minimum.hashCode() : 0);
        result = 31 * result + (maximum != null ? maximum.hashCode() : 0);
        result = 31 * result + (multipleOf != null ? multipleOf.hashCode() : 0);
        result = 31 * result + (exclusiveMinimum != null ? exclusiveMinimum.hashCode() : 0);
        result = 31 * result + (exclusiveMaximum != null ? exclusiveMaximum.hashCode() : 0);
        return result;
    }
}