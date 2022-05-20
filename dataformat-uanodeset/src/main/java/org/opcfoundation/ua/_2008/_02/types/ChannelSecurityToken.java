//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ChannelSecurityToken complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ChannelSecurityToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TokenId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RevisedLifetime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelSecurityToken", propOrder = {
    "channelId",
    "tokenId",
    "createdAt",
    "revisedLifetime"
})
public class ChannelSecurityToken {

    @XmlElement(name = "ChannelId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long channelId;
    @XmlElement(name = "TokenId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long tokenId;
    @XmlElement(name = "CreatedAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "RevisedLifetime")
    @XmlSchemaType(name = "unsignedInt")
    protected Long revisedLifetime;

    /**
     * Ruft den Wert der channelId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * Legt den Wert der channelId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChannelId(Long value) {
        this.channelId = value;
    }

    /**
     * Ruft den Wert der tokenId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTokenId() {
        return tokenId;
    }

    /**
     * Legt den Wert der tokenId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTokenId(Long value) {
        this.tokenId = value;
    }

    /**
     * Ruft den Wert der createdAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Legt den Wert der createdAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Ruft den Wert der revisedLifetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevisedLifetime() {
        return revisedLifetime;
    }

    /**
     * Legt den Wert der revisedLifetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevisedLifetime(Long value) {
        this.revisedLifetime = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ChannelSecurityToken.Builder<_B> _other) {
        _other.channelId = this.channelId;
        _other.tokenId = this.tokenId;
        _other.createdAt = ((this.createdAt == null)?null:((XMLGregorianCalendar) this.createdAt.clone()));
        _other.revisedLifetime = this.revisedLifetime;
    }

    public<_B >ChannelSecurityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ChannelSecurityToken.Builder<_B>(_parentBuilder, this, true);
    }

    public ChannelSecurityToken.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ChannelSecurityToken.Builder<Void> builder() {
        return new ChannelSecurityToken.Builder<Void>(null, null, false);
    }

    public static<_B >ChannelSecurityToken.Builder<_B> copyOf(final ChannelSecurityToken _other) {
        final ChannelSecurityToken.Builder<_B> _newBuilder = new ChannelSecurityToken.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ChannelSecurityToken.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree channelIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("channelId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(channelIdPropertyTree!= null):((channelIdPropertyTree == null)||(!channelIdPropertyTree.isLeaf())))) {
            _other.channelId = this.channelId;
        }
        final PropertyTree tokenIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tokenId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tokenIdPropertyTree!= null):((tokenIdPropertyTree == null)||(!tokenIdPropertyTree.isLeaf())))) {
            _other.tokenId = this.tokenId;
        }
        final PropertyTree createdAtPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createdAt"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createdAtPropertyTree!= null):((createdAtPropertyTree == null)||(!createdAtPropertyTree.isLeaf())))) {
            _other.createdAt = ((this.createdAt == null)?null:((XMLGregorianCalendar) this.createdAt.clone()));
        }
        final PropertyTree revisedLifetimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedLifetime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedLifetimePropertyTree!= null):((revisedLifetimePropertyTree == null)||(!revisedLifetimePropertyTree.isLeaf())))) {
            _other.revisedLifetime = this.revisedLifetime;
        }
    }

    public<_B >ChannelSecurityToken.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ChannelSecurityToken.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ChannelSecurityToken.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ChannelSecurityToken.Builder<_B> copyOf(final ChannelSecurityToken _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ChannelSecurityToken.Builder<_B> _newBuilder = new ChannelSecurityToken.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ChannelSecurityToken.Builder<Void> copyExcept(final ChannelSecurityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ChannelSecurityToken.Builder<Void> copyOnly(final ChannelSecurityToken _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ChannelSecurityToken _storedValue;
        private Long channelId;
        private Long tokenId;
        private XMLGregorianCalendar createdAt;
        private Long revisedLifetime;

        public Builder(final _B _parentBuilder, final ChannelSecurityToken _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.channelId = _other.channelId;
                    this.tokenId = _other.tokenId;
                    this.createdAt = ((_other.createdAt == null)?null:((XMLGregorianCalendar) _other.createdAt.clone()));
                    this.revisedLifetime = _other.revisedLifetime;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ChannelSecurityToken _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree channelIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("channelId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(channelIdPropertyTree!= null):((channelIdPropertyTree == null)||(!channelIdPropertyTree.isLeaf())))) {
                        this.channelId = _other.channelId;
                    }
                    final PropertyTree tokenIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("tokenId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(tokenIdPropertyTree!= null):((tokenIdPropertyTree == null)||(!tokenIdPropertyTree.isLeaf())))) {
                        this.tokenId = _other.tokenId;
                    }
                    final PropertyTree createdAtPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createdAt"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createdAtPropertyTree!= null):((createdAtPropertyTree == null)||(!createdAtPropertyTree.isLeaf())))) {
                        this.createdAt = ((_other.createdAt == null)?null:((XMLGregorianCalendar) _other.createdAt.clone()));
                    }
                    final PropertyTree revisedLifetimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("revisedLifetime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(revisedLifetimePropertyTree!= null):((revisedLifetimePropertyTree == null)||(!revisedLifetimePropertyTree.isLeaf())))) {
                        this.revisedLifetime = _other.revisedLifetime;
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

        protected<_P extends ChannelSecurityToken >_P init(final _P _product) {
            _product.channelId = this.channelId;
            _product.tokenId = this.tokenId;
            _product.createdAt = this.createdAt;
            _product.revisedLifetime = this.revisedLifetime;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "channelId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param channelId
         *     Neuer Wert der Eigenschaft "channelId".
         */
        public ChannelSecurityToken.Builder<_B> withChannelId(final Long channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "tokenId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param tokenId
         *     Neuer Wert der Eigenschaft "tokenId".
         */
        public ChannelSecurityToken.Builder<_B> withTokenId(final Long tokenId) {
            this.tokenId = tokenId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "createdAt" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param createdAt
         *     Neuer Wert der Eigenschaft "createdAt".
         */
        public ChannelSecurityToken.Builder<_B> withCreatedAt(final XMLGregorianCalendar createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "revisedLifetime" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param revisedLifetime
         *     Neuer Wert der Eigenschaft "revisedLifetime".
         */
        public ChannelSecurityToken.Builder<_B> withRevisedLifetime(final Long revisedLifetime) {
            this.revisedLifetime = revisedLifetime;
            return this;
        }

        @Override
        public ChannelSecurityToken build() {
            if (_storedValue == null) {
                return this.init(new ChannelSecurityToken());
            } else {
                return ((ChannelSecurityToken) _storedValue);
            }
        }

        public ChannelSecurityToken.Builder<_B> copyOf(final ChannelSecurityToken _other) {
            _other.copyTo(this);
            return this;
        }

        public ChannelSecurityToken.Builder<_B> copyOf(final ChannelSecurityToken.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ChannelSecurityToken.Selector<ChannelSecurityToken.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ChannelSecurityToken.Select _root() {
            return new ChannelSecurityToken.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>> channelId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>> tokenId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>> createdAt = null;
        private com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>> revisedLifetime = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.channelId!= null) {
                products.put("channelId", this.channelId.init());
            }
            if (this.tokenId!= null) {
                products.put("tokenId", this.tokenId.init());
            }
            if (this.createdAt!= null) {
                products.put("createdAt", this.createdAt.init());
            }
            if (this.revisedLifetime!= null) {
                products.put("revisedLifetime", this.revisedLifetime.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>> channelId() {
            return ((this.channelId == null)?this.channelId = new com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>>(this._root, this, "channelId"):this.channelId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>> tokenId() {
            return ((this.tokenId == null)?this.tokenId = new com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>>(this._root, this, "tokenId"):this.tokenId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>> createdAt() {
            return ((this.createdAt == null)?this.createdAt = new com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>>(this._root, this, "createdAt"):this.createdAt);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>> revisedLifetime() {
            return ((this.revisedLifetime == null)?this.revisedLifetime = new com.kscs.util.jaxb.Selector<TRoot, ChannelSecurityToken.Selector<TRoot, TParent>>(this._root, this, "revisedLifetime"):this.revisedLifetime);
        }

    }

}
