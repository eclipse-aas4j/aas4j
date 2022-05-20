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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für SemanticChangeStructureDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SemanticChangeStructureDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Affected" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="AffectedType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SemanticChangeStructureDataType", propOrder = {
    "affected",
    "affectedType"
})
public class SemanticChangeStructureDataType {

    @XmlElementRef(name = "Affected", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> affected;
    @XmlElementRef(name = "AffectedType", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> affectedType;

    /**
     * Ruft den Wert der affected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getAffected() {
        return affected;
    }

    /**
     * Legt den Wert der affected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setAffected(JAXBElement<NodeId> value) {
        this.affected = value;
    }

    /**
     * Ruft den Wert der affectedType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getAffectedType() {
        return affectedType;
    }

    /**
     * Legt den Wert der affectedType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setAffectedType(JAXBElement<NodeId> value) {
        this.affectedType = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SemanticChangeStructureDataType.Builder<_B> _other) {
        _other.affected = this.affected;
        _other.affectedType = this.affectedType;
    }

    public<_B >SemanticChangeStructureDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SemanticChangeStructureDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public SemanticChangeStructureDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SemanticChangeStructureDataType.Builder<Void> builder() {
        return new SemanticChangeStructureDataType.Builder<Void>(null, null, false);
    }

    public static<_B >SemanticChangeStructureDataType.Builder<_B> copyOf(final SemanticChangeStructureDataType _other) {
        final SemanticChangeStructureDataType.Builder<_B> _newBuilder = new SemanticChangeStructureDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SemanticChangeStructureDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree affectedPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("affected"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(affectedPropertyTree!= null):((affectedPropertyTree == null)||(!affectedPropertyTree.isLeaf())))) {
            _other.affected = this.affected;
        }
        final PropertyTree affectedTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("affectedType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(affectedTypePropertyTree!= null):((affectedTypePropertyTree == null)||(!affectedTypePropertyTree.isLeaf())))) {
            _other.affectedType = this.affectedType;
        }
    }

    public<_B >SemanticChangeStructureDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SemanticChangeStructureDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SemanticChangeStructureDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SemanticChangeStructureDataType.Builder<_B> copyOf(final SemanticChangeStructureDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SemanticChangeStructureDataType.Builder<_B> _newBuilder = new SemanticChangeStructureDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SemanticChangeStructureDataType.Builder<Void> copyExcept(final SemanticChangeStructureDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SemanticChangeStructureDataType.Builder<Void> copyOnly(final SemanticChangeStructureDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SemanticChangeStructureDataType _storedValue;
        private JAXBElement<NodeId> affected;
        private JAXBElement<NodeId> affectedType;

        public Builder(final _B _parentBuilder, final SemanticChangeStructureDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.affected = _other.affected;
                    this.affectedType = _other.affectedType;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SemanticChangeStructureDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree affectedPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("affected"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(affectedPropertyTree!= null):((affectedPropertyTree == null)||(!affectedPropertyTree.isLeaf())))) {
                        this.affected = _other.affected;
                    }
                    final PropertyTree affectedTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("affectedType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(affectedTypePropertyTree!= null):((affectedTypePropertyTree == null)||(!affectedTypePropertyTree.isLeaf())))) {
                        this.affectedType = _other.affectedType;
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

        protected<_P extends SemanticChangeStructureDataType >_P init(final _P _product) {
            _product.affected = this.affected;
            _product.affectedType = this.affectedType;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "affected" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param affected
         *     Neuer Wert der Eigenschaft "affected".
         */
        public SemanticChangeStructureDataType.Builder<_B> withAffected(final JAXBElement<NodeId> affected) {
            this.affected = affected;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "affectedType" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param affectedType
         *     Neuer Wert der Eigenschaft "affectedType".
         */
        public SemanticChangeStructureDataType.Builder<_B> withAffectedType(final JAXBElement<NodeId> affectedType) {
            this.affectedType = affectedType;
            return this;
        }

        @Override
        public SemanticChangeStructureDataType build() {
            if (_storedValue == null) {
                return this.init(new SemanticChangeStructureDataType());
            } else {
                return ((SemanticChangeStructureDataType) _storedValue);
            }
        }

        public SemanticChangeStructureDataType.Builder<_B> copyOf(final SemanticChangeStructureDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public SemanticChangeStructureDataType.Builder<_B> copyOf(final SemanticChangeStructureDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SemanticChangeStructureDataType.Selector<SemanticChangeStructureDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SemanticChangeStructureDataType.Select _root() {
            return new SemanticChangeStructureDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SemanticChangeStructureDataType.Selector<TRoot, TParent>> affected = null;
        private com.kscs.util.jaxb.Selector<TRoot, SemanticChangeStructureDataType.Selector<TRoot, TParent>> affectedType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.affected!= null) {
                products.put("affected", this.affected.init());
            }
            if (this.affectedType!= null) {
                products.put("affectedType", this.affectedType.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SemanticChangeStructureDataType.Selector<TRoot, TParent>> affected() {
            return ((this.affected == null)?this.affected = new com.kscs.util.jaxb.Selector<TRoot, SemanticChangeStructureDataType.Selector<TRoot, TParent>>(this._root, this, "affected"):this.affected);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SemanticChangeStructureDataType.Selector<TRoot, TParent>> affectedType() {
            return ((this.affectedType == null)?this.affectedType = new com.kscs.util.jaxb.Selector<TRoot, SemanticChangeStructureDataType.Selector<TRoot, TParent>>(this._root, this, "affectedType"):this.affectedType);
        }

    }

}
