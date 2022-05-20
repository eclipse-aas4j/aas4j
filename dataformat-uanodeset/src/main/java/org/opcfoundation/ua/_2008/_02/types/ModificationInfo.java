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
 * <p>Java-Klasse für ModificationInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModificationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UpdateType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryUpdateType" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationInfo", propOrder = {
    "modificationTime",
    "updateType",
    "userName"
})
public class ModificationInfo {

    @XmlElement(name = "ModificationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationTime;
    @XmlElement(name = "UpdateType")
    @XmlSchemaType(name = "string")
    protected HistoryUpdateType updateType;
    @XmlElementRef(name = "UserName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;

    /**
     * Ruft den Wert der modificationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationTime() {
        return modificationTime;
    }

    /**
     * Legt den Wert der modificationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationTime(XMLGregorianCalendar value) {
        this.modificationTime = value;
    }

    /**
     * Ruft den Wert der updateType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HistoryUpdateType }
     *     
     */
    public HistoryUpdateType getUpdateType() {
        return updateType;
    }

    /**
     * Legt den Wert der updateType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryUpdateType }
     *     
     */
    public void setUpdateType(HistoryUpdateType value) {
        this.updateType = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ModificationInfo.Builder<_B> _other) {
        _other.modificationTime = ((this.modificationTime == null)?null:((XMLGregorianCalendar) this.modificationTime.clone()));
        _other.updateType = this.updateType;
        _other.userName = this.userName;
    }

    public<_B >ModificationInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ModificationInfo.Builder<_B>(_parentBuilder, this, true);
    }

    public ModificationInfo.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ModificationInfo.Builder<Void> builder() {
        return new ModificationInfo.Builder<Void>(null, null, false);
    }

    public static<_B >ModificationInfo.Builder<_B> copyOf(final ModificationInfo _other) {
        final ModificationInfo.Builder<_B> _newBuilder = new ModificationInfo.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ModificationInfo.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree modificationTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modificationTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modificationTimePropertyTree!= null):((modificationTimePropertyTree == null)||(!modificationTimePropertyTree.isLeaf())))) {
            _other.modificationTime = ((this.modificationTime == null)?null:((XMLGregorianCalendar) this.modificationTime.clone()));
        }
        final PropertyTree updateTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("updateType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(updateTypePropertyTree!= null):((updateTypePropertyTree == null)||(!updateTypePropertyTree.isLeaf())))) {
            _other.updateType = this.updateType;
        }
        final PropertyTree userNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userNamePropertyTree!= null):((userNamePropertyTree == null)||(!userNamePropertyTree.isLeaf())))) {
            _other.userName = this.userName;
        }
    }

    public<_B >ModificationInfo.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ModificationInfo.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ModificationInfo.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ModificationInfo.Builder<_B> copyOf(final ModificationInfo _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ModificationInfo.Builder<_B> _newBuilder = new ModificationInfo.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ModificationInfo.Builder<Void> copyExcept(final ModificationInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ModificationInfo.Builder<Void> copyOnly(final ModificationInfo _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ModificationInfo _storedValue;
        private XMLGregorianCalendar modificationTime;
        private HistoryUpdateType updateType;
        private JAXBElement<String> userName;

        public Builder(final _B _parentBuilder, final ModificationInfo _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.modificationTime = ((_other.modificationTime == null)?null:((XMLGregorianCalendar) _other.modificationTime.clone()));
                    this.updateType = _other.updateType;
                    this.userName = _other.userName;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ModificationInfo _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree modificationTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modificationTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modificationTimePropertyTree!= null):((modificationTimePropertyTree == null)||(!modificationTimePropertyTree.isLeaf())))) {
                        this.modificationTime = ((_other.modificationTime == null)?null:((XMLGregorianCalendar) _other.modificationTime.clone()));
                    }
                    final PropertyTree updateTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("updateType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(updateTypePropertyTree!= null):((updateTypePropertyTree == null)||(!updateTypePropertyTree.isLeaf())))) {
                        this.updateType = _other.updateType;
                    }
                    final PropertyTree userNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userNamePropertyTree!= null):((userNamePropertyTree == null)||(!userNamePropertyTree.isLeaf())))) {
                        this.userName = _other.userName;
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

        protected<_P extends ModificationInfo >_P init(final _P _product) {
            _product.modificationTime = this.modificationTime;
            _product.updateType = this.updateType;
            _product.userName = this.userName;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modificationTime" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param modificationTime
         *     Neuer Wert der Eigenschaft "modificationTime".
         */
        public ModificationInfo.Builder<_B> withModificationTime(final XMLGregorianCalendar modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "updateType" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param updateType
         *     Neuer Wert der Eigenschaft "updateType".
         */
        public ModificationInfo.Builder<_B> withUpdateType(final HistoryUpdateType updateType) {
            this.updateType = updateType;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param userName
         *     Neuer Wert der Eigenschaft "userName".
         */
        public ModificationInfo.Builder<_B> withUserName(final JAXBElement<String> userName) {
            this.userName = userName;
            return this;
        }

        @Override
        public ModificationInfo build() {
            if (_storedValue == null) {
                return this.init(new ModificationInfo());
            } else {
                return ((ModificationInfo) _storedValue);
            }
        }

        public ModificationInfo.Builder<_B> copyOf(final ModificationInfo _other) {
            _other.copyTo(this);
            return this;
        }

        public ModificationInfo.Builder<_B> copyOf(final ModificationInfo.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ModificationInfo.Selector<ModificationInfo.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ModificationInfo.Select _root() {
            return new ModificationInfo.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>> modificationTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>> updateType = null;
        private com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>> userName = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.modificationTime!= null) {
                products.put("modificationTime", this.modificationTime.init());
            }
            if (this.updateType!= null) {
                products.put("updateType", this.updateType.init());
            }
            if (this.userName!= null) {
                products.put("userName", this.userName.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>> modificationTime() {
            return ((this.modificationTime == null)?this.modificationTime = new com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>>(this._root, this, "modificationTime"):this.modificationTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>> updateType() {
            return ((this.updateType == null)?this.updateType = new com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>>(this._root, this, "updateType"):this.updateType);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>> userName() {
            return ((this.userName == null)?this.userName = new com.kscs.util.jaxb.Selector<TRoot, ModificationInfo.Selector<TRoot, TParent>>(this._root, this, "userName"):this.userName);
        }

    }

}
