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
 * <p>Java-Klasse für SubscriptionAcknowledgement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionAcknowledgement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionAcknowledgement", propOrder = {
    "subscriptionId",
    "sequenceNumber"
})
public class SubscriptionAcknowledgement {

    @XmlElement(name = "SubscriptionId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionId;
    @XmlElement(name = "SequenceNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceNumber;

    /**
     * Ruft den Wert der subscriptionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Legt den Wert der subscriptionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriptionId(Long value) {
        this.subscriptionId = value;
    }

    /**
     * Ruft den Wert der sequenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Legt den Wert der sequenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SubscriptionAcknowledgement.Builder<_B> _other) {
        _other.subscriptionId = this.subscriptionId;
        _other.sequenceNumber = this.sequenceNumber;
    }

    public<_B >SubscriptionAcknowledgement.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SubscriptionAcknowledgement.Builder<_B>(_parentBuilder, this, true);
    }

    public SubscriptionAcknowledgement.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SubscriptionAcknowledgement.Builder<Void> builder() {
        return new SubscriptionAcknowledgement.Builder<Void>(null, null, false);
    }

    public static<_B >SubscriptionAcknowledgement.Builder<_B> copyOf(final SubscriptionAcknowledgement _other) {
        final SubscriptionAcknowledgement.Builder<_B> _newBuilder = new SubscriptionAcknowledgement.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SubscriptionAcknowledgement.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
            _other.subscriptionId = this.subscriptionId;
        }
        final PropertyTree sequenceNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sequenceNumber"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sequenceNumberPropertyTree!= null):((sequenceNumberPropertyTree == null)||(!sequenceNumberPropertyTree.isLeaf())))) {
            _other.sequenceNumber = this.sequenceNumber;
        }
    }

    public<_B >SubscriptionAcknowledgement.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SubscriptionAcknowledgement.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SubscriptionAcknowledgement.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SubscriptionAcknowledgement.Builder<_B> copyOf(final SubscriptionAcknowledgement _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SubscriptionAcknowledgement.Builder<_B> _newBuilder = new SubscriptionAcknowledgement.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SubscriptionAcknowledgement.Builder<Void> copyExcept(final SubscriptionAcknowledgement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SubscriptionAcknowledgement.Builder<Void> copyOnly(final SubscriptionAcknowledgement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SubscriptionAcknowledgement _storedValue;
        private Long subscriptionId;
        private Long sequenceNumber;

        public Builder(final _B _parentBuilder, final SubscriptionAcknowledgement _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.subscriptionId = _other.subscriptionId;
                    this.sequenceNumber = _other.sequenceNumber;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SubscriptionAcknowledgement _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
                        this.subscriptionId = _other.subscriptionId;
                    }
                    final PropertyTree sequenceNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sequenceNumber"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sequenceNumberPropertyTree!= null):((sequenceNumberPropertyTree == null)||(!sequenceNumberPropertyTree.isLeaf())))) {
                        this.sequenceNumber = _other.sequenceNumber;
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

        protected<_P extends SubscriptionAcknowledgement >_P init(final _P _product) {
            _product.subscriptionId = this.subscriptionId;
            _product.sequenceNumber = this.sequenceNumber;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param subscriptionId
         *     Neuer Wert der Eigenschaft "subscriptionId".
         */
        public SubscriptionAcknowledgement.Builder<_B> withSubscriptionId(final Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sequenceNumber" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param sequenceNumber
         *     Neuer Wert der Eigenschaft "sequenceNumber".
         */
        public SubscriptionAcknowledgement.Builder<_B> withSequenceNumber(final Long sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        @Override
        public SubscriptionAcknowledgement build() {
            if (_storedValue == null) {
                return this.init(new SubscriptionAcknowledgement());
            } else {
                return ((SubscriptionAcknowledgement) _storedValue);
            }
        }

        public SubscriptionAcknowledgement.Builder<_B> copyOf(final SubscriptionAcknowledgement _other) {
            _other.copyTo(this);
            return this;
        }

        public SubscriptionAcknowledgement.Builder<_B> copyOf(final SubscriptionAcknowledgement.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SubscriptionAcknowledgement.Selector<SubscriptionAcknowledgement.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SubscriptionAcknowledgement.Select _root() {
            return new SubscriptionAcknowledgement.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionAcknowledgement.Selector<TRoot, TParent>> subscriptionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionAcknowledgement.Selector<TRoot, TParent>> sequenceNumber = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.subscriptionId!= null) {
                products.put("subscriptionId", this.subscriptionId.init());
            }
            if (this.sequenceNumber!= null) {
                products.put("sequenceNumber", this.sequenceNumber.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionAcknowledgement.Selector<TRoot, TParent>> subscriptionId() {
            return ((this.subscriptionId == null)?this.subscriptionId = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionAcknowledgement.Selector<TRoot, TParent>>(this._root, this, "subscriptionId"):this.subscriptionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionAcknowledgement.Selector<TRoot, TParent>> sequenceNumber() {
            return ((this.sequenceNumber == null)?this.sequenceNumber = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionAcknowledgement.Selector<TRoot, TParent>>(this._root, this, "sequenceNumber"):this.sequenceNumber);
        }

    }

}
