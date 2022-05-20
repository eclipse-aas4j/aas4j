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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für LiteralOperand complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LiteralOperand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}FilterOperand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiteralOperand", propOrder = {
    "value"
})
public class LiteralOperand
    extends FilterOperand
{

    @XmlElement(name = "Value")
    protected Variant value;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setValue(Variant value) {
        this.value = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final LiteralOperand.Builder<_B> _other) {
        super.copyTo(_other);
        _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other));
    }

    @Override
    public<_B >LiteralOperand.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new LiteralOperand.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public LiteralOperand.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static LiteralOperand.Builder<Void> builder() {
        return new LiteralOperand.Builder<Void>(null, null, false);
    }

    public static<_B >LiteralOperand.Builder<_B> copyOf(final FilterOperand _other) {
        final LiteralOperand.Builder<_B> _newBuilder = new LiteralOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >LiteralOperand.Builder<_B> copyOf(final LiteralOperand _other) {
        final LiteralOperand.Builder<_B> _newBuilder = new LiteralOperand.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final LiteralOperand.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other, valuePropertyTree, _propertyTreeUse));
        }
    }

    @Override
    public<_B >LiteralOperand.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new LiteralOperand.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public LiteralOperand.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >LiteralOperand.Builder<_B> copyOf(final FilterOperand _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final LiteralOperand.Builder<_B> _newBuilder = new LiteralOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >LiteralOperand.Builder<_B> copyOf(final LiteralOperand _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final LiteralOperand.Builder<_B> _newBuilder = new LiteralOperand.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static LiteralOperand.Builder<Void> copyExcept(final FilterOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static LiteralOperand.Builder<Void> copyExcept(final LiteralOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static LiteralOperand.Builder<Void> copyOnly(final FilterOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static LiteralOperand.Builder<Void> copyOnly(final LiteralOperand _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends FilterOperand.Builder<_B>
        implements Buildable
    {

        private Variant.Builder<LiteralOperand.Builder<_B>> value;

        public Builder(final _B _parentBuilder, final LiteralOperand _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this));
            }
        }

        public Builder(final _B _parentBuilder, final LiteralOperand _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
                    this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this, valuePropertyTree, _propertyTreeUse));
                }
            }
        }

        protected<_P extends LiteralOperand >_P init(final _P _product) {
            _product.value = ((this.value == null)?null:this.value.build());
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public LiteralOperand.Builder<_B> withValue(final Variant value) {
            this.value = ((value == null)?null:new Variant.Builder<LiteralOperand.Builder<_B>>(this, value, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "value".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "value".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends LiteralOperand.Builder<_B>> withValue() {
            if (this.value!= null) {
                return this.value;
            }
            return this.value = new Variant.Builder<LiteralOperand.Builder<_B>>(this, null, false);
        }

        @Override
        public LiteralOperand build() {
            if (_storedValue == null) {
                return this.init(new LiteralOperand());
            } else {
                return ((LiteralOperand) _storedValue);
            }
        }

        public LiteralOperand.Builder<_B> copyOf(final LiteralOperand _other) {
            _other.copyTo(this);
            return this;
        }

        public LiteralOperand.Builder<_B> copyOf(final LiteralOperand.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends LiteralOperand.Selector<LiteralOperand.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static LiteralOperand.Select _root() {
            return new LiteralOperand.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends FilterOperand.Selector<TRoot, TParent>
    {

        private Variant.Selector<TRoot, LiteralOperand.Selector<TRoot, TParent>> value = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            return products;
        }

        public Variant.Selector<TRoot, LiteralOperand.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new Variant.Selector<TRoot, LiteralOperand.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

    }

}
