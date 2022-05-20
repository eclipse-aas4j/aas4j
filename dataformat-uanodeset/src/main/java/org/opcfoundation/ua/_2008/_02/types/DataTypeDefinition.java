//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für DataTypeDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataTypeDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataTypeDefinition")
@XmlSeeAlso({
    StructureDefinition.class,
    EnumDefinition.class
})
public class DataTypeDefinition {


    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataTypeDefinition.Builder<_B> _other) {
    }

    public<_B >DataTypeDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataTypeDefinition.Builder<_B>(_parentBuilder, this, true);
    }

    public DataTypeDefinition.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataTypeDefinition.Builder<Void> builder() {
        return new DataTypeDefinition.Builder<Void>(null, null, false);
    }

    public static<_B >DataTypeDefinition.Builder<_B> copyOf(final DataTypeDefinition _other) {
        final DataTypeDefinition.Builder<_B> _newBuilder = new DataTypeDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataTypeDefinition.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
    }

    public<_B >DataTypeDefinition.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataTypeDefinition.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DataTypeDefinition.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataTypeDefinition.Builder<_B> copyOf(final DataTypeDefinition _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataTypeDefinition.Builder<_B> _newBuilder = new DataTypeDefinition.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataTypeDefinition.Builder<Void> copyExcept(final DataTypeDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataTypeDefinition.Builder<Void> copyOnly(final DataTypeDefinition _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DataTypeDefinition _storedValue;

        public Builder(final _B _parentBuilder, final DataTypeDefinition _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DataTypeDefinition _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public _B end() {
            return this._parentBuilder;
        }

        protected<_P extends DataTypeDefinition >_P init(final _P _product) {
            return _product;
        }

        @Override
        public DataTypeDefinition build() {
            if (_storedValue == null) {
                return this.init(new DataTypeDefinition());
            } else {
                return ((DataTypeDefinition) _storedValue);
            }
        }

        public DataTypeDefinition.Builder<_B> copyOf(final DataTypeDefinition _other) {
            _other.copyTo(this);
            return this;
        }

        public DataTypeDefinition.Builder<_B> copyOf(final DataTypeDefinition.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataTypeDefinition.Selector<DataTypeDefinition.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataTypeDefinition.Select _root() {
            return new DataTypeDefinition.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {


        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            return products;
        }

    }

}
