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
 * <p>Java-Klasse für Annotation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Annotation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnnotationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annotation", propOrder = {
    "message",
    "userName",
    "annotationTime"
})
public class Annotation {

    @XmlElementRef(name = "Message", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "UserName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;
    @XmlElement(name = "AnnotationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar annotationTime;

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Ruft den Wert der userName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Legt den Wert der userName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * Ruft den Wert der annotationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnotationTime() {
        return annotationTime;
    }

    /**
     * Legt den Wert der annotationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnotationTime(XMLGregorianCalendar value) {
        this.annotationTime = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final Annotation.Builder<_B> _other) {
        _other.message = this.message;
        _other.userName = this.userName;
        _other.annotationTime = ((this.annotationTime == null)?null:((XMLGregorianCalendar) this.annotationTime.clone()));
    }

    public<_B >Annotation.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new Annotation.Builder<_B>(_parentBuilder, this, true);
    }

    public Annotation.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static Annotation.Builder<Void> builder() {
        return new Annotation.Builder<Void>(null, null, false);
    }

    public static<_B >Annotation.Builder<_B> copyOf(final Annotation _other) {
        final Annotation.Builder<_B> _newBuilder = new Annotation.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final Annotation.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree messagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("message"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messagePropertyTree!= null):((messagePropertyTree == null)||(!messagePropertyTree.isLeaf())))) {
            _other.message = this.message;
        }
        final PropertyTree userNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userNamePropertyTree!= null):((userNamePropertyTree == null)||(!userNamePropertyTree.isLeaf())))) {
            _other.userName = this.userName;
        }
        final PropertyTree annotationTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("annotationTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(annotationTimePropertyTree!= null):((annotationTimePropertyTree == null)||(!annotationTimePropertyTree.isLeaf())))) {
            _other.annotationTime = ((this.annotationTime == null)?null:((XMLGregorianCalendar) this.annotationTime.clone()));
        }
    }

    public<_B >Annotation.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new Annotation.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public Annotation.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >Annotation.Builder<_B> copyOf(final Annotation _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final Annotation.Builder<_B> _newBuilder = new Annotation.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static Annotation.Builder<Void> copyExcept(final Annotation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static Annotation.Builder<Void> copyOnly(final Annotation _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final Annotation _storedValue;
        private JAXBElement<String> message;
        private JAXBElement<String> userName;
        private XMLGregorianCalendar annotationTime;

        public Builder(final _B _parentBuilder, final Annotation _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.message = _other.message;
                    this.userName = _other.userName;
                    this.annotationTime = ((_other.annotationTime == null)?null:((XMLGregorianCalendar) _other.annotationTime.clone()));
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final Annotation _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree messagePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("message"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messagePropertyTree!= null):((messagePropertyTree == null)||(!messagePropertyTree.isLeaf())))) {
                        this.message = _other.message;
                    }
                    final PropertyTree userNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userNamePropertyTree!= null):((userNamePropertyTree == null)||(!userNamePropertyTree.isLeaf())))) {
                        this.userName = _other.userName;
                    }
                    final PropertyTree annotationTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("annotationTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(annotationTimePropertyTree!= null):((annotationTimePropertyTree == null)||(!annotationTimePropertyTree.isLeaf())))) {
                        this.annotationTime = ((_other.annotationTime == null)?null:((XMLGregorianCalendar) _other.annotationTime.clone()));
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

        protected<_P extends Annotation >_P init(final _P _product) {
            _product.message = this.message;
            _product.userName = this.userName;
            _product.annotationTime = this.annotationTime;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "message" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param message
         *     Neuer Wert der Eigenschaft "message".
         */
        public Annotation.Builder<_B> withMessage(final JAXBElement<String> message) {
            this.message = message;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param userName
         *     Neuer Wert der Eigenschaft "userName".
         */
        public Annotation.Builder<_B> withUserName(final JAXBElement<String> userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "annotationTime" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param annotationTime
         *     Neuer Wert der Eigenschaft "annotationTime".
         */
        public Annotation.Builder<_B> withAnnotationTime(final XMLGregorianCalendar annotationTime) {
            this.annotationTime = annotationTime;
            return this;
        }

        @Override
        public Annotation build() {
            if (_storedValue == null) {
                return this.init(new Annotation());
            } else {
                return ((Annotation) _storedValue);
            }
        }

        public Annotation.Builder<_B> copyOf(final Annotation _other) {
            _other.copyTo(this);
            return this;
        }

        public Annotation.Builder<_B> copyOf(final Annotation.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends Annotation.Selector<Annotation.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static Annotation.Select _root() {
            return new Annotation.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>> message = null;
        private com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>> userName = null;
        private com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>> annotationTime = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.message!= null) {
                products.put("message", this.message.init());
            }
            if (this.userName!= null) {
                products.put("userName", this.userName.init());
            }
            if (this.annotationTime!= null) {
                products.put("annotationTime", this.annotationTime.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>> message() {
            return ((this.message == null)?this.message = new com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>>(this._root, this, "message"):this.message);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>> userName() {
            return ((this.userName == null)?this.userName = new com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>>(this._root, this, "userName"):this.userName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>> annotationTime() {
            return ((this.annotationTime == null)?this.annotationTime = new com.kscs.util.jaxb.Selector<TRoot, Annotation.Selector<TRoot, TParent>>(this._root, this, "annotationTime"):this.annotationTime);
        }

    }

}
