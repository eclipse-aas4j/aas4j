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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für HistoryUpdateDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryUpdateDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryUpdateDetails", propOrder = {
    "nodeId"
})
@XmlSeeAlso({
    UpdateDataDetails.class,
    UpdateStructureDataDetails.class,
    UpdateEventDetails.class,
    DeleteRawModifiedDetails.class,
    DeleteAtTimeDetails.class,
    DeleteEventDetails.class
})
public class HistoryUpdateDetails {

    @XmlElementRef(name = "NodeId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> nodeId;

    /**
     * Ruft den Wert der nodeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getNodeId() {
        return nodeId;
    }

    /**
     * Legt den Wert der nodeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setNodeId(JAXBElement<NodeId> value) {
        this.nodeId = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryUpdateDetails.Builder<_B> _other) {
        _other.nodeId = this.nodeId;
    }

    public<_B >HistoryUpdateDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryUpdateDetails.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryUpdateDetails.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryUpdateDetails.Builder<Void> builder() {
        return new HistoryUpdateDetails.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryUpdateDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other) {
        final HistoryUpdateDetails.Builder<_B> _newBuilder = new HistoryUpdateDetails.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryUpdateDetails.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
            _other.nodeId = this.nodeId;
        }
    }

    public<_B >HistoryUpdateDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryUpdateDetails.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryUpdateDetails.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryUpdateDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryUpdateDetails.Builder<_B> _newBuilder = new HistoryUpdateDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryUpdateDetails.Builder<Void> copyExcept(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryUpdateDetails.Builder<Void> copyOnly(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryUpdateDetails _storedValue;
        private JAXBElement<NodeId> nodeId;

        public Builder(final _B _parentBuilder, final HistoryUpdateDetails _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.nodeId = _other.nodeId;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryUpdateDetails _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree nodeIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nodeId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nodeIdPropertyTree!= null):((nodeIdPropertyTree == null)||(!nodeIdPropertyTree.isLeaf())))) {
                        this.nodeId = _other.nodeId;
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

        protected<_P extends HistoryUpdateDetails >_P init(final _P _product) {
            _product.nodeId = this.nodeId;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        public HistoryUpdateDetails.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public HistoryUpdateDetails build() {
            if (_storedValue == null) {
                return this.init(new HistoryUpdateDetails());
            } else {
                return ((HistoryUpdateDetails) _storedValue);
            }
        }

        public HistoryUpdateDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryUpdateDetails.Builder<_B> copyOf(final HistoryUpdateDetails.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryUpdateDetails.Selector<HistoryUpdateDetails.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryUpdateDetails.Select _root() {
            return new HistoryUpdateDetails.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateDetails.Selector<TRoot, TParent>> nodeId = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.nodeId!= null) {
                products.put("nodeId", this.nodeId.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateDetails.Selector<TRoot, TParent>> nodeId() {
            return ((this.nodeId == null)?this.nodeId = new com.kscs.util.jaxb.Selector<TRoot, HistoryUpdateDetails.Selector<TRoot, TParent>>(this._root, this, "nodeId"):this.nodeId);
        }

    }

}
