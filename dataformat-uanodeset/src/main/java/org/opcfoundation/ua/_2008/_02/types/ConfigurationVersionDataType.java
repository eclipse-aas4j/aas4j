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
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ConfigurationVersionDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationVersionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationVersionDataType", propOrder = {
    "majorVersion",
    "minorVersion"
})
public class ConfigurationVersionDataType {

    @XmlElement(name = "MajorVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long majorVersion;
    @XmlElement(name = "MinorVersion")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minorVersion;

    /**
     * Ruft den Wert der majorVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMajorVersion() {
        return majorVersion;
    }

    /**
     * Legt den Wert der majorVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMajorVersion(Long value) {
        this.majorVersion = value;
    }

    /**
     * Ruft den Wert der minorVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinorVersion() {
        return minorVersion;
    }

    /**
     * Legt den Wert der minorVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinorVersion(Long value) {
        this.minorVersion = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ConfigurationVersionDataType.Builder<_B> _other) {
        _other.majorVersion = this.majorVersion;
        _other.minorVersion = this.minorVersion;
    }

    public<_B >ConfigurationVersionDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ConfigurationVersionDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ConfigurationVersionDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ConfigurationVersionDataType.Builder<Void> builder() {
        return new ConfigurationVersionDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ConfigurationVersionDataType.Builder<_B> copyOf(final ConfigurationVersionDataType _other) {
        final ConfigurationVersionDataType.Builder<_B> _newBuilder = new ConfigurationVersionDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ConfigurationVersionDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree majorVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("majorVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(majorVersionPropertyTree!= null):((majorVersionPropertyTree == null)||(!majorVersionPropertyTree.isLeaf())))) {
            _other.majorVersion = this.majorVersion;
        }
        final PropertyTree minorVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("minorVersion"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(minorVersionPropertyTree!= null):((minorVersionPropertyTree == null)||(!minorVersionPropertyTree.isLeaf())))) {
            _other.minorVersion = this.minorVersion;
        }
    }

    public<_B >ConfigurationVersionDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ConfigurationVersionDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ConfigurationVersionDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ConfigurationVersionDataType.Builder<_B> copyOf(final ConfigurationVersionDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ConfigurationVersionDataType.Builder<_B> _newBuilder = new ConfigurationVersionDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ConfigurationVersionDataType.Builder<Void> copyExcept(final ConfigurationVersionDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ConfigurationVersionDataType.Builder<Void> copyOnly(final ConfigurationVersionDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ConfigurationVersionDataType _storedValue;
        private Long majorVersion;
        private Long minorVersion;

        public Builder(final _B _parentBuilder, final ConfigurationVersionDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.majorVersion = _other.majorVersion;
                    this.minorVersion = _other.minorVersion;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ConfigurationVersionDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree majorVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("majorVersion"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(majorVersionPropertyTree!= null):((majorVersionPropertyTree == null)||(!majorVersionPropertyTree.isLeaf())))) {
                        this.majorVersion = _other.majorVersion;
                    }
                    final PropertyTree minorVersionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("minorVersion"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(minorVersionPropertyTree!= null):((minorVersionPropertyTree == null)||(!minorVersionPropertyTree.isLeaf())))) {
                        this.minorVersion = _other.minorVersion;
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

        protected<_P extends ConfigurationVersionDataType >_P init(final _P _product) {
            _product.majorVersion = this.majorVersion;
            _product.minorVersion = this.minorVersion;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "majorVersion" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param majorVersion
         *     Neuer Wert der Eigenschaft "majorVersion".
         */
        public ConfigurationVersionDataType.Builder<_B> withMajorVersion(final Long majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "minorVersion" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param minorVersion
         *     Neuer Wert der Eigenschaft "minorVersion".
         */
        public ConfigurationVersionDataType.Builder<_B> withMinorVersion(final Long minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }

        @Override
        public ConfigurationVersionDataType build() {
            if (_storedValue == null) {
                return this.init(new ConfigurationVersionDataType());
            } else {
                return ((ConfigurationVersionDataType) _storedValue);
            }
        }

        public ConfigurationVersionDataType.Builder<_B> copyOf(final ConfigurationVersionDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ConfigurationVersionDataType.Builder<_B> copyOf(final ConfigurationVersionDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ConfigurationVersionDataType.Selector<ConfigurationVersionDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ConfigurationVersionDataType.Select _root() {
            return new ConfigurationVersionDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ConfigurationVersionDataType.Selector<TRoot, TParent>> majorVersion = null;
        private com.kscs.util.jaxb.Selector<TRoot, ConfigurationVersionDataType.Selector<TRoot, TParent>> minorVersion = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.majorVersion!= null) {
                products.put("majorVersion", this.majorVersion.init());
            }
            if (this.minorVersion!= null) {
                products.put("minorVersion", this.minorVersion.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConfigurationVersionDataType.Selector<TRoot, TParent>> majorVersion() {
            return ((this.majorVersion == null)?this.majorVersion = new com.kscs.util.jaxb.Selector<TRoot, ConfigurationVersionDataType.Selector<TRoot, TParent>>(this._root, this, "majorVersion"):this.majorVersion);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ConfigurationVersionDataType.Selector<TRoot, TParent>> minorVersion() {
            return ((this.minorVersion == null)?this.minorVersion = new com.kscs.util.jaxb.Selector<TRoot, ConfigurationVersionDataType.Selector<TRoot, TParent>>(this._root, this, "minorVersion"):this.minorVersion);
        }

    }

}
