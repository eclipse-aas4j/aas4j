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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ServiceCounterDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceCounterDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCounterDataType", propOrder = {
    "totalCount",
    "errorCount"
})
public class ServiceCounterDataType {

    @XmlElement(name = "TotalCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalCount;
    @XmlElement(name = "ErrorCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long errorCount;

    /**
     * Ruft den Wert der totalCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * Legt den Wert der totalCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCount(Long value) {
        this.totalCount = value;
    }

    /**
     * Ruft den Wert der errorCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getErrorCount() {
        return errorCount;
    }

    /**
     * Legt den Wert der errorCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setErrorCount(Long value) {
        this.errorCount = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ServiceCounterDataType.Builder<_B> _other) {
        _other.totalCount = this.totalCount;
        _other.errorCount = this.errorCount;
    }

    public<_B >ServiceCounterDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ServiceCounterDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ServiceCounterDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ServiceCounterDataType.Builder<Void> builder() {
        return new ServiceCounterDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ServiceCounterDataType.Builder<_B> copyOf(final ServiceCounterDataType _other) {
        final ServiceCounterDataType.Builder<_B> _newBuilder = new ServiceCounterDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ServiceCounterDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree totalCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("totalCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(totalCountPropertyTree!= null):((totalCountPropertyTree == null)||(!totalCountPropertyTree.isLeaf())))) {
            _other.totalCount = this.totalCount;
        }
        final PropertyTree errorCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("errorCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(errorCountPropertyTree!= null):((errorCountPropertyTree == null)||(!errorCountPropertyTree.isLeaf())))) {
            _other.errorCount = this.errorCount;
        }
    }

    public<_B >ServiceCounterDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ServiceCounterDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ServiceCounterDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ServiceCounterDataType.Builder<_B> copyOf(final ServiceCounterDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ServiceCounterDataType.Builder<_B> _newBuilder = new ServiceCounterDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ServiceCounterDataType.Builder<Void> copyExcept(final ServiceCounterDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ServiceCounterDataType.Builder<Void> copyOnly(final ServiceCounterDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ServiceCounterDataType _storedValue;
        private Long totalCount;
        private Long errorCount;

        public Builder(final _B _parentBuilder, final ServiceCounterDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.totalCount = _other.totalCount;
                    this.errorCount = _other.errorCount;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ServiceCounterDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree totalCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("totalCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(totalCountPropertyTree!= null):((totalCountPropertyTree == null)||(!totalCountPropertyTree.isLeaf())))) {
                        this.totalCount = _other.totalCount;
                    }
                    final PropertyTree errorCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("errorCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(errorCountPropertyTree!= null):((errorCountPropertyTree == null)||(!errorCountPropertyTree.isLeaf())))) {
                        this.errorCount = _other.errorCount;
                    }
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

        protected<_P extends ServiceCounterDataType >_P init(final _P _product) {
            _product.totalCount = this.totalCount;
            _product.errorCount = this.errorCount;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "totalCount" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param totalCount
         *     Neuer Wert der Eigenschaft "totalCount".
         */
        public ServiceCounterDataType.Builder<_B> withTotalCount(final Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "errorCount" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param errorCount
         *     Neuer Wert der Eigenschaft "errorCount".
         */
        public ServiceCounterDataType.Builder<_B> withErrorCount(final Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }

        @Override
        public ServiceCounterDataType build() {
            if (_storedValue == null) {
                return this.init(new ServiceCounterDataType());
            } else {
                return ((ServiceCounterDataType) _storedValue);
            }
        }

        public ServiceCounterDataType.Builder<_B> copyOf(final ServiceCounterDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ServiceCounterDataType.Builder<_B> copyOf(final ServiceCounterDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ServiceCounterDataType.Selector<ServiceCounterDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ServiceCounterDataType.Select _root() {
            return new ServiceCounterDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ServiceCounterDataType.Selector<TRoot, TParent>> totalCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServiceCounterDataType.Selector<TRoot, TParent>> errorCount = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.totalCount!= null) {
                products.put("totalCount", this.totalCount.init());
            }
            if (this.errorCount!= null) {
                products.put("errorCount", this.errorCount.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServiceCounterDataType.Selector<TRoot, TParent>> totalCount() {
            return ((this.totalCount == null)?this.totalCount = new com.kscs.util.jaxb.Selector<TRoot, ServiceCounterDataType.Selector<TRoot, TParent>>(this._root, this, "totalCount"):this.totalCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServiceCounterDataType.Selector<TRoot, TParent>> errorCount() {
            return ((this.errorCount == null)?this.errorCount = new com.kscs.util.jaxb.Selector<TRoot, ServiceCounterDataType.Selector<TRoot, TParent>>(this._root, this, "errorCount"):this.errorCount);
        }

    }

}
