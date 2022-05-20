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
 * <p>Java-Klasse für NotificationMessage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NotificationMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="PublishTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NotificationData" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessage", propOrder = {
    "sequenceNumber",
    "publishTime",
    "notificationData"
})
public class NotificationMessage {

    @XmlElement(name = "SequenceNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sequenceNumber;
    @XmlElement(name = "PublishTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishTime;
    @XmlElementRef(name = "NotificationData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfExtensionObject> notificationData;

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
     * Ruft den Wert der publishTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishTime() {
        return publishTime;
    }

    /**
     * Legt den Wert der publishTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishTime(XMLGregorianCalendar value) {
        this.publishTime = value;
    }

    /**
     * Ruft den Wert der notificationData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ListOfExtensionObject> getNotificationData() {
        return notificationData;
    }

    /**
     * Legt den Wert der notificationData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfExtensionObject }{@code >}
     *     
     */
    public void setNotificationData(JAXBElement<ListOfExtensionObject> value) {
        this.notificationData = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final NotificationMessage.Builder<_B> _other) {
        _other.sequenceNumber = this.sequenceNumber;
        _other.publishTime = ((this.publishTime == null)?null:((XMLGregorianCalendar) this.publishTime.clone()));
        _other.notificationData = this.notificationData;
    }

    public<_B >NotificationMessage.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new NotificationMessage.Builder<_B>(_parentBuilder, this, true);
    }

    public NotificationMessage.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static NotificationMessage.Builder<Void> builder() {
        return new NotificationMessage.Builder<Void>(null, null, false);
    }

    public static<_B >NotificationMessage.Builder<_B> copyOf(final NotificationMessage _other) {
        final NotificationMessage.Builder<_B> _newBuilder = new NotificationMessage.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final NotificationMessage.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sequenceNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sequenceNumber"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sequenceNumberPropertyTree!= null):((sequenceNumberPropertyTree == null)||(!sequenceNumberPropertyTree.isLeaf())))) {
            _other.sequenceNumber = this.sequenceNumber;
        }
        final PropertyTree publishTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishTimePropertyTree!= null):((publishTimePropertyTree == null)||(!publishTimePropertyTree.isLeaf())))) {
            _other.publishTime = ((this.publishTime == null)?null:((XMLGregorianCalendar) this.publishTime.clone()));
        }
        final PropertyTree notificationDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("notificationData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(notificationDataPropertyTree!= null):((notificationDataPropertyTree == null)||(!notificationDataPropertyTree.isLeaf())))) {
            _other.notificationData = this.notificationData;
        }
    }

    public<_B >NotificationMessage.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new NotificationMessage.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public NotificationMessage.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >NotificationMessage.Builder<_B> copyOf(final NotificationMessage _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final NotificationMessage.Builder<_B> _newBuilder = new NotificationMessage.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static NotificationMessage.Builder<Void> copyExcept(final NotificationMessage _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static NotificationMessage.Builder<Void> copyOnly(final NotificationMessage _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final NotificationMessage _storedValue;
        private Long sequenceNumber;
        private XMLGregorianCalendar publishTime;
        private JAXBElement<ListOfExtensionObject> notificationData;

        public Builder(final _B _parentBuilder, final NotificationMessage _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.sequenceNumber = _other.sequenceNumber;
                    this.publishTime = ((_other.publishTime == null)?null:((XMLGregorianCalendar) _other.publishTime.clone()));
                    this.notificationData = _other.notificationData;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final NotificationMessage _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree sequenceNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sequenceNumber"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sequenceNumberPropertyTree!= null):((sequenceNumberPropertyTree == null)||(!sequenceNumberPropertyTree.isLeaf())))) {
                        this.sequenceNumber = _other.sequenceNumber;
                    }
                    final PropertyTree publishTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishTimePropertyTree!= null):((publishTimePropertyTree == null)||(!publishTimePropertyTree.isLeaf())))) {
                        this.publishTime = ((_other.publishTime == null)?null:((XMLGregorianCalendar) _other.publishTime.clone()));
                    }
                    final PropertyTree notificationDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("notificationData"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(notificationDataPropertyTree!= null):((notificationDataPropertyTree == null)||(!notificationDataPropertyTree.isLeaf())))) {
                        this.notificationData = _other.notificationData;
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

        protected<_P extends NotificationMessage >_P init(final _P _product) {
            _product.sequenceNumber = this.sequenceNumber;
            _product.publishTime = this.publishTime;
            _product.notificationData = this.notificationData;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sequenceNumber" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param sequenceNumber
         *     Neuer Wert der Eigenschaft "sequenceNumber".
         */
        public NotificationMessage.Builder<_B> withSequenceNumber(final Long sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishTime" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param publishTime
         *     Neuer Wert der Eigenschaft "publishTime".
         */
        public NotificationMessage.Builder<_B> withPublishTime(final XMLGregorianCalendar publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "notificationData" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param notificationData
         *     Neuer Wert der Eigenschaft "notificationData".
         */
        public NotificationMessage.Builder<_B> withNotificationData(final JAXBElement<ListOfExtensionObject> notificationData) {
            this.notificationData = notificationData;
            return this;
        }

        @Override
        public NotificationMessage build() {
            if (_storedValue == null) {
                return this.init(new NotificationMessage());
            } else {
                return ((NotificationMessage) _storedValue);
            }
        }

        public NotificationMessage.Builder<_B> copyOf(final NotificationMessage _other) {
            _other.copyTo(this);
            return this;
        }

        public NotificationMessage.Builder<_B> copyOf(final NotificationMessage.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends NotificationMessage.Selector<NotificationMessage.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static NotificationMessage.Select _root() {
            return new NotificationMessage.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>> sequenceNumber = null;
        private com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>> publishTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>> notificationData = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.sequenceNumber!= null) {
                products.put("sequenceNumber", this.sequenceNumber.init());
            }
            if (this.publishTime!= null) {
                products.put("publishTime", this.publishTime.init());
            }
            if (this.notificationData!= null) {
                products.put("notificationData", this.notificationData.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>> sequenceNumber() {
            return ((this.sequenceNumber == null)?this.sequenceNumber = new com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>>(this._root, this, "sequenceNumber"):this.sequenceNumber);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>> publishTime() {
            return ((this.publishTime == null)?this.publishTime = new com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>>(this._root, this, "publishTime"):this.publishTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>> notificationData() {
            return ((this.notificationData == null)?this.notificationData = new com.kscs.util.jaxb.Selector<TRoot, NotificationMessage.Selector<TRoot, TParent>>(this._root, this, "notificationData"):this.notificationData);
        }

    }

}
