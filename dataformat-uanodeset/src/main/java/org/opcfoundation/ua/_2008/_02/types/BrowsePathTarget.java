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
 * <p>Java-Klasse für BrowsePathTarget complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BrowsePathTarget"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExpandedNodeId" minOccurs="0"/&gt;
 *         &lt;element name="RemainingPathIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowsePathTarget", propOrder = {
    "targetId",
    "remainingPathIndex"
})
public class BrowsePathTarget {

    @XmlElementRef(name = "TargetId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpandedNodeId> targetId;
    @XmlElement(name = "RemainingPathIndex")
    @XmlSchemaType(name = "unsignedInt")
    protected Long remainingPathIndex;

    /**
     * Ruft den Wert der targetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public JAXBElement<ExpandedNodeId> getTargetId() {
        return targetId;
    }

    /**
     * Legt den Wert der targetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpandedNodeId }{@code >}
     *     
     */
    public void setTargetId(JAXBElement<ExpandedNodeId> value) {
        this.targetId = value;
    }

    /**
     * Ruft den Wert der remainingPathIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingPathIndex() {
        return remainingPathIndex;
    }

    /**
     * Legt den Wert der remainingPathIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingPathIndex(Long value) {
        this.remainingPathIndex = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final BrowsePathTarget.Builder<_B> _other) {
        _other.targetId = this.targetId;
        _other.remainingPathIndex = this.remainingPathIndex;
    }

    public<_B >BrowsePathTarget.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new BrowsePathTarget.Builder<_B>(_parentBuilder, this, true);
    }

    public BrowsePathTarget.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static BrowsePathTarget.Builder<Void> builder() {
        return new BrowsePathTarget.Builder<Void>(null, null, false);
    }

    public static<_B >BrowsePathTarget.Builder<_B> copyOf(final BrowsePathTarget _other) {
        final BrowsePathTarget.Builder<_B> _newBuilder = new BrowsePathTarget.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final BrowsePathTarget.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree targetIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetIdPropertyTree!= null):((targetIdPropertyTree == null)||(!targetIdPropertyTree.isLeaf())))) {
            _other.targetId = this.targetId;
        }
        final PropertyTree remainingPathIndexPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("remainingPathIndex"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(remainingPathIndexPropertyTree!= null):((remainingPathIndexPropertyTree == null)||(!remainingPathIndexPropertyTree.isLeaf())))) {
            _other.remainingPathIndex = this.remainingPathIndex;
        }
    }

    public<_B >BrowsePathTarget.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new BrowsePathTarget.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public BrowsePathTarget.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >BrowsePathTarget.Builder<_B> copyOf(final BrowsePathTarget _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final BrowsePathTarget.Builder<_B> _newBuilder = new BrowsePathTarget.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static BrowsePathTarget.Builder<Void> copyExcept(final BrowsePathTarget _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static BrowsePathTarget.Builder<Void> copyOnly(final BrowsePathTarget _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final BrowsePathTarget _storedValue;
        private JAXBElement<ExpandedNodeId> targetId;
        private Long remainingPathIndex;

        public Builder(final _B _parentBuilder, final BrowsePathTarget _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.targetId = _other.targetId;
                    this.remainingPathIndex = _other.remainingPathIndex;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final BrowsePathTarget _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree targetIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetIdPropertyTree!= null):((targetIdPropertyTree == null)||(!targetIdPropertyTree.isLeaf())))) {
                        this.targetId = _other.targetId;
                    }
                    final PropertyTree remainingPathIndexPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("remainingPathIndex"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(remainingPathIndexPropertyTree!= null):((remainingPathIndexPropertyTree == null)||(!remainingPathIndexPropertyTree.isLeaf())))) {
                        this.remainingPathIndex = _other.remainingPathIndex;
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

        protected<_P extends BrowsePathTarget >_P init(final _P _product) {
            _product.targetId = this.targetId;
            _product.remainingPathIndex = this.remainingPathIndex;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param targetId
         *     Neuer Wert der Eigenschaft "targetId".
         */
        public BrowsePathTarget.Builder<_B> withTargetId(final JAXBElement<ExpandedNodeId> targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "remainingPathIndex" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param remainingPathIndex
         *     Neuer Wert der Eigenschaft "remainingPathIndex".
         */
        public BrowsePathTarget.Builder<_B> withRemainingPathIndex(final Long remainingPathIndex) {
            this.remainingPathIndex = remainingPathIndex;
            return this;
        }

        @Override
        public BrowsePathTarget build() {
            if (_storedValue == null) {
                return this.init(new BrowsePathTarget());
            } else {
                return ((BrowsePathTarget) _storedValue);
            }
        }

        public BrowsePathTarget.Builder<_B> copyOf(final BrowsePathTarget _other) {
            _other.copyTo(this);
            return this;
        }

        public BrowsePathTarget.Builder<_B> copyOf(final BrowsePathTarget.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends BrowsePathTarget.Selector<BrowsePathTarget.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static BrowsePathTarget.Select _root() {
            return new BrowsePathTarget.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, BrowsePathTarget.Selector<TRoot, TParent>> targetId = null;
        private com.kscs.util.jaxb.Selector<TRoot, BrowsePathTarget.Selector<TRoot, TParent>> remainingPathIndex = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.targetId!= null) {
                products.put("targetId", this.targetId.init());
            }
            if (this.remainingPathIndex!= null) {
                products.put("remainingPathIndex", this.remainingPathIndex.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowsePathTarget.Selector<TRoot, TParent>> targetId() {
            return ((this.targetId == null)?this.targetId = new com.kscs.util.jaxb.Selector<TRoot, BrowsePathTarget.Selector<TRoot, TParent>>(this._root, this, "targetId"):this.targetId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, BrowsePathTarget.Selector<TRoot, TParent>> remainingPathIndex() {
            return ((this.remainingPathIndex == null)?this.remainingPathIndex = new com.kscs.util.jaxb.Selector<TRoot, BrowsePathTarget.Selector<TRoot, TParent>>(this._root, this, "remainingPathIndex"):this.remainingPathIndex);
        }

    }

}
