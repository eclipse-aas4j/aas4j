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
 * <p>Java-Klasse für DeleteEventDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteEventDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryUpdateDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfByteString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteEventDetails", propOrder = {
    "eventIds"
})
public class DeleteEventDetails
    extends HistoryUpdateDetails
{

    @XmlElementRef(name = "EventIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfByteString> eventIds;

    /**
     * Ruft den Wert der eventIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public JAXBElement<ListOfByteString> getEventIds() {
        return eventIds;
    }

    /**
     * Legt den Wert der eventIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfByteString }{@code >}
     *     
     */
    public void setEventIds(JAXBElement<ListOfByteString> value) {
        this.eventIds = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DeleteEventDetails.Builder<_B> _other) {
        super.copyTo(_other);
        _other.eventIds = this.eventIds;
    }

    @Override
    public<_B >DeleteEventDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DeleteEventDetails.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DeleteEventDetails.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DeleteEventDetails.Builder<Void> builder() {
        return new DeleteEventDetails.Builder<Void>(null, null, false);
    }

    public static<_B >DeleteEventDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other) {
        final DeleteEventDetails.Builder<_B> _newBuilder = new DeleteEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DeleteEventDetails.Builder<_B> copyOf(final DeleteEventDetails _other) {
        final DeleteEventDetails.Builder<_B> _newBuilder = new DeleteEventDetails.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DeleteEventDetails.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree eventIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventIdsPropertyTree!= null):((eventIdsPropertyTree == null)||(!eventIdsPropertyTree.isLeaf())))) {
            _other.eventIds = this.eventIds;
        }
    }

    @Override
    public<_B >DeleteEventDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DeleteEventDetails.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DeleteEventDetails.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DeleteEventDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DeleteEventDetails.Builder<_B> _newBuilder = new DeleteEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DeleteEventDetails.Builder<_B> copyOf(final DeleteEventDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DeleteEventDetails.Builder<_B> _newBuilder = new DeleteEventDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DeleteEventDetails.Builder<Void> copyExcept(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DeleteEventDetails.Builder<Void> copyExcept(final DeleteEventDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DeleteEventDetails.Builder<Void> copyOnly(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DeleteEventDetails.Builder<Void> copyOnly(final DeleteEventDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends HistoryUpdateDetails.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfByteString> eventIds;

        public Builder(final _B _parentBuilder, final DeleteEventDetails _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.eventIds = _other.eventIds;
            }
        }

        public Builder(final _B _parentBuilder, final DeleteEventDetails _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree eventIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventIds"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventIdsPropertyTree!= null):((eventIdsPropertyTree == null)||(!eventIdsPropertyTree.isLeaf())))) {
                    this.eventIds = _other.eventIds;
                }
            }
        }

        protected<_P extends DeleteEventDetails >_P init(final _P _product) {
            _product.eventIds = this.eventIds;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventIds" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param eventIds
         *     Neuer Wert der Eigenschaft "eventIds".
         */
        public DeleteEventDetails.Builder<_B> withEventIds(final JAXBElement<ListOfByteString> eventIds) {
            this.eventIds = eventIds;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        @Override
        public DeleteEventDetails.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            super.withNodeId(nodeId);
            return this;
        }

        @Override
        public DeleteEventDetails build() {
            if (_storedValue == null) {
                return this.init(new DeleteEventDetails());
            } else {
                return ((DeleteEventDetails) _storedValue);
            }
        }

        public DeleteEventDetails.Builder<_B> copyOf(final DeleteEventDetails _other) {
            _other.copyTo(this);
            return this;
        }

        public DeleteEventDetails.Builder<_B> copyOf(final DeleteEventDetails.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DeleteEventDetails.Selector<DeleteEventDetails.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DeleteEventDetails.Select _root() {
            return new DeleteEventDetails.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends HistoryUpdateDetails.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DeleteEventDetails.Selector<TRoot, TParent>> eventIds = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.eventIds!= null) {
                products.put("eventIds", this.eventIds.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteEventDetails.Selector<TRoot, TParent>> eventIds() {
            return ((this.eventIds == null)?this.eventIds = new com.kscs.util.jaxb.Selector<TRoot, DeleteEventDetails.Selector<TRoot, TParent>>(this._root, this, "eventIds"):this.eventIds);
        }

    }

}
