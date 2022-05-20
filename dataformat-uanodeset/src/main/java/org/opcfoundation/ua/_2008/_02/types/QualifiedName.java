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
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für QualifiedName complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QualifiedName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamespaceIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedName", propOrder = {
    "namespaceIndex",
    "name"
})
public class QualifiedName {

    @XmlElement(name = "NamespaceIndex")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer namespaceIndex;
    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;

    /**
     * Ruft den Wert der namespaceIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNamespaceIndex() {
        return namespaceIndex;
    }

    /**
     * Legt den Wert der namespaceIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNamespaceIndex(Integer value) {
        this.namespaceIndex = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final QualifiedName.Builder<_B> _other) {
        _other.namespaceIndex = this.namespaceIndex;
        _other.name = this.name;
    }

    public<_B >QualifiedName.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new QualifiedName.Builder<_B>(_parentBuilder, this, true);
    }

    public QualifiedName.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static QualifiedName.Builder<Void> builder() {
        return new QualifiedName.Builder<Void>(null, null, false);
    }

    public static<_B >QualifiedName.Builder<_B> copyOf(final QualifiedName _other) {
        final QualifiedName.Builder<_B> _newBuilder = new QualifiedName.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final QualifiedName.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namespaceIndexPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceIndex"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceIndexPropertyTree!= null):((namespaceIndexPropertyTree == null)||(!namespaceIndexPropertyTree.isLeaf())))) {
            _other.namespaceIndex = this.namespaceIndex;
        }
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
    }

    public<_B >QualifiedName.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new QualifiedName.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public QualifiedName.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >QualifiedName.Builder<_B> copyOf(final QualifiedName _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final QualifiedName.Builder<_B> _newBuilder = new QualifiedName.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static QualifiedName.Builder<Void> copyExcept(final QualifiedName _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static QualifiedName.Builder<Void> copyOnly(final QualifiedName _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final QualifiedName _storedValue;
        private Integer namespaceIndex;
        private JAXBElement<String> name;

        public Builder(final _B _parentBuilder, final QualifiedName _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.namespaceIndex = _other.namespaceIndex;
                    this.name = _other.name;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final QualifiedName _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namespaceIndexPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("namespaceIndex"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namespaceIndexPropertyTree!= null):((namespaceIndexPropertyTree == null)||(!namespaceIndexPropertyTree.isLeaf())))) {
                        this.namespaceIndex = _other.namespaceIndex;
                    }
                    final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                        this.name = _other.name;
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

        protected<_P extends QualifiedName >_P init(final _P _product) {
            _product.namespaceIndex = this.namespaceIndex;
            _product.name = this.name;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "namespaceIndex" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param namespaceIndex
         *     Neuer Wert der Eigenschaft "namespaceIndex".
         */
        public QualifiedName.Builder<_B> withNamespaceIndex(final Integer namespaceIndex) {
            this.namespaceIndex = namespaceIndex;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public QualifiedName.Builder<_B> withName(final JAXBElement<String> name) {
            this.name = name;
            return this;
        }

        @Override
        public QualifiedName build() {
            if (_storedValue == null) {
                return this.init(new QualifiedName());
            } else {
                return ((QualifiedName) _storedValue);
            }
        }

        public QualifiedName.Builder<_B> copyOf(final QualifiedName _other) {
            _other.copyTo(this);
            return this;
        }

        public QualifiedName.Builder<_B> copyOf(final QualifiedName.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends QualifiedName.Selector<QualifiedName.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static QualifiedName.Select _root() {
            return new QualifiedName.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, QualifiedName.Selector<TRoot, TParent>> namespaceIndex = null;
        private com.kscs.util.jaxb.Selector<TRoot, QualifiedName.Selector<TRoot, TParent>> name = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.namespaceIndex!= null) {
                products.put("namespaceIndex", this.namespaceIndex.init());
            }
            if (this.name!= null) {
                products.put("name", this.name.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, QualifiedName.Selector<TRoot, TParent>> namespaceIndex() {
            return ((this.namespaceIndex == null)?this.namespaceIndex = new com.kscs.util.jaxb.Selector<TRoot, QualifiedName.Selector<TRoot, TParent>>(this._root, this, "namespaceIndex"):this.namespaceIndex);
        }

        public com.kscs.util.jaxb.Selector<TRoot, QualifiedName.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, QualifiedName.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

    }

}
