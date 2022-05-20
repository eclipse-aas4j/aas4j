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
 * <p>Java-Klasse für MdnsDiscoveryConfiguration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MdnsDiscoveryConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DiscoveryConfiguration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MdnsServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerCapabilities" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MdnsDiscoveryConfiguration", propOrder = {
    "mdnsServerName",
    "serverCapabilities"
})
public class MdnsDiscoveryConfiguration
    extends DiscoveryConfiguration
{

    @XmlElementRef(name = "MdnsServerName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mdnsServerName;
    @XmlElementRef(name = "ServerCapabilities", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> serverCapabilities;

    /**
     * Ruft den Wert der mdnsServerName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdnsServerName() {
        return mdnsServerName;
    }

    /**
     * Legt den Wert der mdnsServerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdnsServerName(JAXBElement<String> value) {
        this.mdnsServerName = value;
    }

    /**
     * Ruft den Wert der serverCapabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getServerCapabilities() {
        return serverCapabilities;
    }

    /**
     * Legt den Wert der serverCapabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setServerCapabilities(JAXBElement<ListOfString> value) {
        this.serverCapabilities = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final MdnsDiscoveryConfiguration.Builder<_B> _other) {
        super.copyTo(_other);
        _other.mdnsServerName = this.mdnsServerName;
        _other.serverCapabilities = this.serverCapabilities;
    }

    @Override
    public<_B >MdnsDiscoveryConfiguration.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new MdnsDiscoveryConfiguration.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public MdnsDiscoveryConfiguration.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static MdnsDiscoveryConfiguration.Builder<Void> builder() {
        return new MdnsDiscoveryConfiguration.Builder<Void>(null, null, false);
    }

    public static<_B >MdnsDiscoveryConfiguration.Builder<_B> copyOf(final DiscoveryConfiguration _other) {
        final MdnsDiscoveryConfiguration.Builder<_B> _newBuilder = new MdnsDiscoveryConfiguration.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >MdnsDiscoveryConfiguration.Builder<_B> copyOf(final MdnsDiscoveryConfiguration _other) {
        final MdnsDiscoveryConfiguration.Builder<_B> _newBuilder = new MdnsDiscoveryConfiguration.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final MdnsDiscoveryConfiguration.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree mdnsServerNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("mdnsServerName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(mdnsServerNamePropertyTree!= null):((mdnsServerNamePropertyTree == null)||(!mdnsServerNamePropertyTree.isLeaf())))) {
            _other.mdnsServerName = this.mdnsServerName;
        }
        final PropertyTree serverCapabilitiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCapabilities"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCapabilitiesPropertyTree!= null):((serverCapabilitiesPropertyTree == null)||(!serverCapabilitiesPropertyTree.isLeaf())))) {
            _other.serverCapabilities = this.serverCapabilities;
        }
    }

    @Override
    public<_B >MdnsDiscoveryConfiguration.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new MdnsDiscoveryConfiguration.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public MdnsDiscoveryConfiguration.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >MdnsDiscoveryConfiguration.Builder<_B> copyOf(final DiscoveryConfiguration _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MdnsDiscoveryConfiguration.Builder<_B> _newBuilder = new MdnsDiscoveryConfiguration.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >MdnsDiscoveryConfiguration.Builder<_B> copyOf(final MdnsDiscoveryConfiguration _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final MdnsDiscoveryConfiguration.Builder<_B> _newBuilder = new MdnsDiscoveryConfiguration.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static MdnsDiscoveryConfiguration.Builder<Void> copyExcept(final DiscoveryConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MdnsDiscoveryConfiguration.Builder<Void> copyExcept(final MdnsDiscoveryConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static MdnsDiscoveryConfiguration.Builder<Void> copyOnly(final DiscoveryConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static MdnsDiscoveryConfiguration.Builder<Void> copyOnly(final MdnsDiscoveryConfiguration _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DiscoveryConfiguration.Builder<_B>
        implements Buildable
    {

        private JAXBElement<String> mdnsServerName;
        private JAXBElement<ListOfString> serverCapabilities;

        public Builder(final _B _parentBuilder, final MdnsDiscoveryConfiguration _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.mdnsServerName = _other.mdnsServerName;
                this.serverCapabilities = _other.serverCapabilities;
            }
        }

        public Builder(final _B _parentBuilder, final MdnsDiscoveryConfiguration _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree mdnsServerNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("mdnsServerName"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(mdnsServerNamePropertyTree!= null):((mdnsServerNamePropertyTree == null)||(!mdnsServerNamePropertyTree.isLeaf())))) {
                    this.mdnsServerName = _other.mdnsServerName;
                }
                final PropertyTree serverCapabilitiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverCapabilities"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverCapabilitiesPropertyTree!= null):((serverCapabilitiesPropertyTree == null)||(!serverCapabilitiesPropertyTree.isLeaf())))) {
                    this.serverCapabilities = _other.serverCapabilities;
                }
            }
        }

        protected<_P extends MdnsDiscoveryConfiguration >_P init(final _P _product) {
            _product.mdnsServerName = this.mdnsServerName;
            _product.serverCapabilities = this.serverCapabilities;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "mdnsServerName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param mdnsServerName
         *     Neuer Wert der Eigenschaft "mdnsServerName".
         */
        public MdnsDiscoveryConfiguration.Builder<_B> withMdnsServerName(final JAXBElement<String> mdnsServerName) {
            this.mdnsServerName = mdnsServerName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverCapabilities" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param serverCapabilities
         *     Neuer Wert der Eigenschaft "serverCapabilities".
         */
        public MdnsDiscoveryConfiguration.Builder<_B> withServerCapabilities(final JAXBElement<ListOfString> serverCapabilities) {
            this.serverCapabilities = serverCapabilities;
            return this;
        }

        @Override
        public MdnsDiscoveryConfiguration build() {
            if (_storedValue == null) {
                return this.init(new MdnsDiscoveryConfiguration());
            } else {
                return ((MdnsDiscoveryConfiguration) _storedValue);
            }
        }

        public MdnsDiscoveryConfiguration.Builder<_B> copyOf(final MdnsDiscoveryConfiguration _other) {
            _other.copyTo(this);
            return this;
        }

        public MdnsDiscoveryConfiguration.Builder<_B> copyOf(final MdnsDiscoveryConfiguration.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends MdnsDiscoveryConfiguration.Selector<MdnsDiscoveryConfiguration.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static MdnsDiscoveryConfiguration.Select _root() {
            return new MdnsDiscoveryConfiguration.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DiscoveryConfiguration.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, MdnsDiscoveryConfiguration.Selector<TRoot, TParent>> mdnsServerName = null;
        private com.kscs.util.jaxb.Selector<TRoot, MdnsDiscoveryConfiguration.Selector<TRoot, TParent>> serverCapabilities = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.mdnsServerName!= null) {
                products.put("mdnsServerName", this.mdnsServerName.init());
            }
            if (this.serverCapabilities!= null) {
                products.put("serverCapabilities", this.serverCapabilities.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, MdnsDiscoveryConfiguration.Selector<TRoot, TParent>> mdnsServerName() {
            return ((this.mdnsServerName == null)?this.mdnsServerName = new com.kscs.util.jaxb.Selector<TRoot, MdnsDiscoveryConfiguration.Selector<TRoot, TParent>>(this._root, this, "mdnsServerName"):this.mdnsServerName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, MdnsDiscoveryConfiguration.Selector<TRoot, TParent>> serverCapabilities() {
            return ((this.serverCapabilities == null)?this.serverCapabilities = new com.kscs.util.jaxb.Selector<TRoot, MdnsDiscoveryConfiguration.Selector<TRoot, TParent>>(this._root, this, "serverCapabilities"):this.serverCapabilities);
        }

    }

}
