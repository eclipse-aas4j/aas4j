//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für IdentityMappingRuleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IdentityMappingRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CriteriaType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}IdentityCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="Criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityMappingRuleType", propOrder = {
    "criteriaType",
    "criteria"
})
public class IdentityMappingRuleType {

    @XmlElement(name = "CriteriaType")
    @XmlSchemaType(name = "string")
    protected IdentityCriteriaType criteriaType;
    @XmlElementRef(name = "Criteria", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> criteria;

    /**
     * Ruft den Wert der criteriaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityCriteriaType }
     *     
     */
    public IdentityCriteriaType getCriteriaType() {
        return criteriaType;
    }

    /**
     * Legt den Wert der criteriaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityCriteriaType }
     *     
     */
    public void setCriteriaType(IdentityCriteriaType value) {
        this.criteriaType = value;
    }

    /**
     * Ruft den Wert der criteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCriteria() {
        return criteria;
    }

    /**
     * Legt den Wert der criteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCriteria(JAXBElement<String> value) {
        this.criteria = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final IdentityMappingRuleType.Builder<_B> _other) {
        _other.criteriaType = this.criteriaType;
        _other.criteria = this.criteria;
    }

    public<_B >IdentityMappingRuleType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new IdentityMappingRuleType.Builder<_B>(_parentBuilder, this, true);
    }

    public IdentityMappingRuleType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static IdentityMappingRuleType.Builder<Void> builder() {
        return new IdentityMappingRuleType.Builder<Void>(null, null, false);
    }

    public static<_B >IdentityMappingRuleType.Builder<_B> copyOf(final IdentityMappingRuleType _other) {
        final IdentityMappingRuleType.Builder<_B> _newBuilder = new IdentityMappingRuleType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final IdentityMappingRuleType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree criteriaTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("criteriaType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(criteriaTypePropertyTree!= null):((criteriaTypePropertyTree == null)||(!criteriaTypePropertyTree.isLeaf())))) {
            _other.criteriaType = this.criteriaType;
        }
        final PropertyTree criteriaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("criteria"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(criteriaPropertyTree!= null):((criteriaPropertyTree == null)||(!criteriaPropertyTree.isLeaf())))) {
            _other.criteria = this.criteria;
        }
    }

    public<_B >IdentityMappingRuleType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new IdentityMappingRuleType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public IdentityMappingRuleType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >IdentityMappingRuleType.Builder<_B> copyOf(final IdentityMappingRuleType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final IdentityMappingRuleType.Builder<_B> _newBuilder = new IdentityMappingRuleType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static IdentityMappingRuleType.Builder<Void> copyExcept(final IdentityMappingRuleType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static IdentityMappingRuleType.Builder<Void> copyOnly(final IdentityMappingRuleType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final IdentityMappingRuleType _storedValue;
        private IdentityCriteriaType criteriaType;
        private JAXBElement<String> criteria;

        public Builder(final _B _parentBuilder, final IdentityMappingRuleType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.criteriaType = _other.criteriaType;
                    this.criteria = _other.criteria;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final IdentityMappingRuleType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree criteriaTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("criteriaType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(criteriaTypePropertyTree!= null):((criteriaTypePropertyTree == null)||(!criteriaTypePropertyTree.isLeaf())))) {
                        this.criteriaType = _other.criteriaType;
                    }
                    final PropertyTree criteriaPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("criteria"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(criteriaPropertyTree!= null):((criteriaPropertyTree == null)||(!criteriaPropertyTree.isLeaf())))) {
                        this.criteria = _other.criteria;
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

        protected<_P extends IdentityMappingRuleType >_P init(final _P _product) {
            _product.criteriaType = this.criteriaType;
            _product.criteria = this.criteria;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "criteriaType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param criteriaType
         *     Neuer Wert der Eigenschaft "criteriaType".
         */
        public IdentityMappingRuleType.Builder<_B> withCriteriaType(final IdentityCriteriaType criteriaType) {
            this.criteriaType = criteriaType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "criteria" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param criteria
         *     Neuer Wert der Eigenschaft "criteria".
         */
        public IdentityMappingRuleType.Builder<_B> withCriteria(final JAXBElement<String> criteria) {
            this.criteria = criteria;
            return this;
        }

        @Override
        public IdentityMappingRuleType build() {
            if (_storedValue == null) {
                return this.init(new IdentityMappingRuleType());
            } else {
                return ((IdentityMappingRuleType) _storedValue);
            }
        }

        public IdentityMappingRuleType.Builder<_B> copyOf(final IdentityMappingRuleType _other) {
            _other.copyTo(this);
            return this;
        }

        public IdentityMappingRuleType.Builder<_B> copyOf(final IdentityMappingRuleType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends IdentityMappingRuleType.Selector<IdentityMappingRuleType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static IdentityMappingRuleType.Select _root() {
            return new IdentityMappingRuleType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, IdentityMappingRuleType.Selector<TRoot, TParent>> criteriaType = null;
        private com.kscs.util.jaxb.Selector<TRoot, IdentityMappingRuleType.Selector<TRoot, TParent>> criteria = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.criteriaType!= null) {
                products.put("criteriaType", this.criteriaType.init());
            }
            if (this.criteria!= null) {
                products.put("criteria", this.criteria.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, IdentityMappingRuleType.Selector<TRoot, TParent>> criteriaType() {
            return ((this.criteriaType == null)?this.criteriaType = new com.kscs.util.jaxb.Selector<TRoot, IdentityMappingRuleType.Selector<TRoot, TParent>>(this._root, this, "criteriaType"):this.criteriaType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, IdentityMappingRuleType.Selector<TRoot, TParent>> criteria() {
            return ((this.criteria == null)?this.criteria = new com.kscs.util.jaxb.Selector<TRoot, IdentityMappingRuleType.Selector<TRoot, TParent>>(this._root, this, "criteria"):this.criteria);
        }

    }

}
