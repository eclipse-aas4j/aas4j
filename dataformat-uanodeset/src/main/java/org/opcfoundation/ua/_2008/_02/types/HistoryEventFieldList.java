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
 * <p>Java-Klasse für HistoryEventFieldList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryEventFieldList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventFields" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfVariant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryEventFieldList", propOrder = {
    "eventFields"
})
public class HistoryEventFieldList {

    @XmlElementRef(name = "EventFields", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfVariant> eventFields;

    /**
     * Ruft den Wert der eventFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public JAXBElement<ListOfVariant> getEventFields() {
        return eventFields;
    }

    /**
     * Legt den Wert der eventFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public void setEventFields(JAXBElement<ListOfVariant> value) {
        this.eventFields = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryEventFieldList.Builder<_B> _other) {
        _other.eventFields = this.eventFields;
    }

    public<_B >HistoryEventFieldList.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryEventFieldList.Builder<_B>(_parentBuilder, this, true);
    }

    public HistoryEventFieldList.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryEventFieldList.Builder<Void> builder() {
        return new HistoryEventFieldList.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryEventFieldList.Builder<_B> copyOf(final HistoryEventFieldList _other) {
        final HistoryEventFieldList.Builder<_B> _newBuilder = new HistoryEventFieldList.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryEventFieldList.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree eventFieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventFields"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventFieldsPropertyTree!= null):((eventFieldsPropertyTree == null)||(!eventFieldsPropertyTree.isLeaf())))) {
            _other.eventFields = this.eventFields;
        }
    }

    public<_B >HistoryEventFieldList.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryEventFieldList.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public HistoryEventFieldList.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryEventFieldList.Builder<_B> copyOf(final HistoryEventFieldList _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryEventFieldList.Builder<_B> _newBuilder = new HistoryEventFieldList.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryEventFieldList.Builder<Void> copyExcept(final HistoryEventFieldList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryEventFieldList.Builder<Void> copyOnly(final HistoryEventFieldList _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final HistoryEventFieldList _storedValue;
        private JAXBElement<ListOfVariant> eventFields;

        public Builder(final _B _parentBuilder, final HistoryEventFieldList _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.eventFields = _other.eventFields;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryEventFieldList _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree eventFieldsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventFields"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventFieldsPropertyTree!= null):((eventFieldsPropertyTree == null)||(!eventFieldsPropertyTree.isLeaf())))) {
                        this.eventFields = _other.eventFields;
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

        protected<_P extends HistoryEventFieldList >_P init(final _P _product) {
            _product.eventFields = this.eventFields;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventFields" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param eventFields
         *     Neuer Wert der Eigenschaft "eventFields".
         */
        public HistoryEventFieldList.Builder<_B> withEventFields(final JAXBElement<ListOfVariant> eventFields) {
            this.eventFields = eventFields;
            return this;
        }

        @Override
        public HistoryEventFieldList build() {
            if (_storedValue == null) {
                return this.init(new HistoryEventFieldList());
            } else {
                return ((HistoryEventFieldList) _storedValue);
            }
        }

        public HistoryEventFieldList.Builder<_B> copyOf(final HistoryEventFieldList _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryEventFieldList.Builder<_B> copyOf(final HistoryEventFieldList.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryEventFieldList.Selector<HistoryEventFieldList.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryEventFieldList.Select _root() {
            return new HistoryEventFieldList.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HistoryEventFieldList.Selector<TRoot, TParent>> eventFields = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.eventFields!= null) {
                products.put("eventFields", this.eventFields.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryEventFieldList.Selector<TRoot, TParent>> eventFields() {
            return ((this.eventFields == null)?this.eventFields = new com.kscs.util.jaxb.Selector<TRoot, HistoryEventFieldList.Selector<TRoot, TParent>>(this._root, this, "eventFields"):this.eventFields);
        }

    }

}
