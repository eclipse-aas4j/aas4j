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
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ViewDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ViewDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ViewId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ViewVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewDescription", propOrder = {
    "viewId",
    "timestamp",
    "viewVersion"
})
public class ViewDescription {

    @XmlElementRef(name = "ViewId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> viewId;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "ViewVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long viewVersion;

    /**
     * Ruft den Wert der viewId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getViewId() {
        return viewId;
    }

    /**
     * Legt den Wert der viewId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setViewId(JAXBElement<NodeId> value) {
        this.viewId = value;
    }

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Ruft den Wert der viewVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getViewVersion() {
        return viewVersion;
    }

    /**
     * Legt den Wert der viewVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setViewVersion(Long value) {
        this.viewVersion = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ViewDescription.Builder<_B> _other) {
        _other.viewId = this.viewId;
        _other.timestamp = ((this.timestamp == null)?null:((XMLGregorianCalendar) this.timestamp.clone()));
        _other.viewVersion = this.viewVersion;
    }

    public<_B >ViewDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ViewDescription.Builder<_B>(_parentBuilder, this, true);
    }

    public ViewDescription.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ViewDescription.Builder<Void> builder() {
        return new ViewDescription.Builder<Void>(null, null, false);
    }

    public static<_B >ViewDescription.Builder<_B> copyOf(final ViewDescription _other) {
        final ViewDescription.Builder<_B> _newBuilder = new ViewDescription.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ViewDescription.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree viewIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("viewId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(viewIdPropertyTree!= null):((viewIdPropertyTree == null)||(!viewIdPropertyTree.isLeaf())))) {
            _other.viewId = this.viewId;
        }
        final PropertyTree timestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestamp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampPropertyTree!= null):((timestampPropertyTree == null)||(!timestampPropertyTree.isLeaf())))) {
            _other.timestamp = ((this.timestamp == null)?null:((XMLGregorianCalendar) this.timestamp.clone()));
        }
        final PropertyTree viewVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("viewVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(viewVersionPropertyTree!= null):((viewVersionPropertyTree == null)||(!viewVersionPropertyTree.isLeaf())))) {
            _other.viewVersion = this.viewVersion;
        }
    }

    public<_B >ViewDescription.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ViewDescription.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ViewDescription.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ViewDescription.Builder<_B> copyOf(final ViewDescription _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ViewDescription.Builder<_B> _newBuilder = new ViewDescription.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ViewDescription.Builder<Void> copyExcept(final ViewDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ViewDescription.Builder<Void> copyOnly(final ViewDescription _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ViewDescription _storedValue;
        private JAXBElement<NodeId> viewId;
        private XMLGregorianCalendar timestamp;
        private Long viewVersion;

        public Builder(final _B _parentBuilder, final ViewDescription _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.viewId = _other.viewId;
                    this.timestamp = ((_other.timestamp == null)?null:((XMLGregorianCalendar) _other.timestamp.clone()));
                    this.viewVersion = _other.viewVersion;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ViewDescription _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree viewIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("viewId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(viewIdPropertyTree!= null):((viewIdPropertyTree == null)||(!viewIdPropertyTree.isLeaf())))) {
                        this.viewId = _other.viewId;
                    }
                    final PropertyTree timestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("timestamp"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(timestampPropertyTree!= null):((timestampPropertyTree == null)||(!timestampPropertyTree.isLeaf())))) {
                        this.timestamp = ((_other.timestamp == null)?null:((XMLGregorianCalendar) _other.timestamp.clone()));
                    }
                    final PropertyTree viewVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("viewVersion"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(viewVersionPropertyTree!= null):((viewVersionPropertyTree == null)||(!viewVersionPropertyTree.isLeaf())))) {
                        this.viewVersion = _other.viewVersion;
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

        protected<_P extends ViewDescription >_P init(final _P _product) {
            _product.viewId = this.viewId;
            _product.timestamp = this.timestamp;
            _product.viewVersion = this.viewVersion;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "viewId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param viewId
         *     Neuer Wert der Eigenschaft "viewId".
         */
        public ViewDescription.Builder<_B> withViewId(final JAXBElement<NodeId> viewId) {
            this.viewId = viewId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "timestamp" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param timestamp
         *     Neuer Wert der Eigenschaft "timestamp".
         */
        public ViewDescription.Builder<_B> withTimestamp(final XMLGregorianCalendar timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "viewVersion" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param viewVersion
         *     Neuer Wert der Eigenschaft "viewVersion".
         */
        public ViewDescription.Builder<_B> withViewVersion(final Long viewVersion) {
            this.viewVersion = viewVersion;
            return this;
        }

        @Override
        public ViewDescription build() {
            if (_storedValue == null) {
                return this.init(new ViewDescription());
            } else {
                return ((ViewDescription) _storedValue);
            }
        }

        public ViewDescription.Builder<_B> copyOf(final ViewDescription _other) {
            _other.copyTo(this);
            return this;
        }

        public ViewDescription.Builder<_B> copyOf(final ViewDescription.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ViewDescription.Selector<ViewDescription.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ViewDescription.Select _root() {
            return new ViewDescription.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>> viewId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>> timestamp = null;
        private com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>> viewVersion = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.viewId!= null) {
                products.put("viewId", this.viewId.init());
            }
            if (this.timestamp!= null) {
                products.put("timestamp", this.timestamp.init());
            }
            if (this.viewVersion!= null) {
                products.put("viewVersion", this.viewVersion.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>> viewId() {
            return ((this.viewId == null)?this.viewId = new com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>>(this._root, this, "viewId"):this.viewId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>> timestamp() {
            return ((this.timestamp == null)?this.timestamp = new com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>>(this._root, this, "timestamp"):this.timestamp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>> viewVersion() {
            return ((this.viewVersion == null)?this.viewVersion = new com.kscs.util.jaxb.Selector<TRoot, ViewDescription.Selector<TRoot, TParent>>(this._root, this, "viewVersion"):this.viewVersion);
        }

    }

}
