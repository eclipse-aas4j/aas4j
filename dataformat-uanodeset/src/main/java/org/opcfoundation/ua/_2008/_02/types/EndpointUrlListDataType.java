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
 * <p>Java-Klasse für EndpointUrlListDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EndpointUrlListDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndpointUrlList" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointUrlListDataType", propOrder = {
    "endpointUrlList"
})
public class EndpointUrlListDataType {

    @XmlElementRef(name = "EndpointUrlList", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> endpointUrlList;

    /**
     * Ruft den Wert der endpointUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getEndpointUrlList() {
        return endpointUrlList;
    }

    /**
     * Legt den Wert der endpointUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setEndpointUrlList(JAXBElement<ListOfString> value) {
        this.endpointUrlList = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EndpointUrlListDataType.Builder<_B> _other) {
        _other.endpointUrlList = this.endpointUrlList;
    }

    public<_B >EndpointUrlListDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EndpointUrlListDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public EndpointUrlListDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EndpointUrlListDataType.Builder<Void> builder() {
        return new EndpointUrlListDataType.Builder<Void>(null, null, false);
    }

    public static<_B >EndpointUrlListDataType.Builder<_B> copyOf(final EndpointUrlListDataType _other) {
        final EndpointUrlListDataType.Builder<_B> _newBuilder = new EndpointUrlListDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EndpointUrlListDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree endpointUrlListPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrlList"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlListPropertyTree!= null):((endpointUrlListPropertyTree == null)||(!endpointUrlListPropertyTree.isLeaf())))) {
            _other.endpointUrlList = this.endpointUrlList;
        }
    }

    public<_B >EndpointUrlListDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EndpointUrlListDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public EndpointUrlListDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EndpointUrlListDataType.Builder<_B> copyOf(final EndpointUrlListDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EndpointUrlListDataType.Builder<_B> _newBuilder = new EndpointUrlListDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EndpointUrlListDataType.Builder<Void> copyExcept(final EndpointUrlListDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EndpointUrlListDataType.Builder<Void> copyOnly(final EndpointUrlListDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final EndpointUrlListDataType _storedValue;
        private JAXBElement<ListOfString> endpointUrlList;

        public Builder(final _B _parentBuilder, final EndpointUrlListDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.endpointUrlList = _other.endpointUrlList;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final EndpointUrlListDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree endpointUrlListPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrlList"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlListPropertyTree!= null):((endpointUrlListPropertyTree == null)||(!endpointUrlListPropertyTree.isLeaf())))) {
                        this.endpointUrlList = _other.endpointUrlList;
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

        protected<_P extends EndpointUrlListDataType >_P init(final _P _product) {
            _product.endpointUrlList = this.endpointUrlList;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointUrlList" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param endpointUrlList
         *     Neuer Wert der Eigenschaft "endpointUrlList".
         */
        public EndpointUrlListDataType.Builder<_B> withEndpointUrlList(final JAXBElement<ListOfString> endpointUrlList) {
            this.endpointUrlList = endpointUrlList;
            return this;
        }

        @Override
        public EndpointUrlListDataType build() {
            if (_storedValue == null) {
                return this.init(new EndpointUrlListDataType());
            } else {
                return ((EndpointUrlListDataType) _storedValue);
            }
        }

        public EndpointUrlListDataType.Builder<_B> copyOf(final EndpointUrlListDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public EndpointUrlListDataType.Builder<_B> copyOf(final EndpointUrlListDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EndpointUrlListDataType.Selector<EndpointUrlListDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EndpointUrlListDataType.Select _root() {
            return new EndpointUrlListDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EndpointUrlListDataType.Selector<TRoot, TParent>> endpointUrlList = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.endpointUrlList!= null) {
                products.put("endpointUrlList", this.endpointUrlList.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EndpointUrlListDataType.Selector<TRoot, TParent>> endpointUrlList() {
            return ((this.endpointUrlList == null)?this.endpointUrlList = new com.kscs.util.jaxb.Selector<TRoot, EndpointUrlListDataType.Selector<TRoot, TParent>>(this._root, this, "endpointUrlList"):this.endpointUrlList);
        }

    }

}
