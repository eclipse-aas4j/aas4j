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
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für UABinaryFileDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UABinaryFileDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataTypeSchemaHeader"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SchemaLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileHeader" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfKeyValuePair" minOccurs="0"/&gt;
 *         &lt;element name="Body" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UABinaryFileDataType", propOrder = {
    "schemaLocation",
    "fileHeader",
    "body"
})
public class UABinaryFileDataType
    extends DataTypeSchemaHeader
{

    @XmlElementRef(name = "SchemaLocation", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schemaLocation;
    @XmlElementRef(name = "FileHeader", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfKeyValuePair> fileHeader;
    @XmlElement(name = "Body")
    protected Variant body;

    /**
     * Ruft den Wert der schemaLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * Legt den Wert der schemaLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchemaLocation(JAXBElement<String> value) {
        this.schemaLocation = value;
    }

    /**
     * Ruft den Wert der fileHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ListOfKeyValuePair> getFileHeader() {
        return fileHeader;
    }

    /**
     * Legt den Wert der fileHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public void setFileHeader(JAXBElement<ListOfKeyValuePair> value) {
        this.fileHeader = value;
    }

    /**
     * Ruft den Wert der body-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getBody() {
        return body;
    }

    /**
     * Legt den Wert der body-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setBody(Variant value) {
        this.body = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final UABinaryFileDataType.Builder<_B> _other) {
        super.copyTo(_other);
        _other.schemaLocation = this.schemaLocation;
        _other.fileHeader = this.fileHeader;
        _other.body = ((this.body == null)?null:this.body.newCopyBuilder(_other));
    }

    @Override
    public<_B >UABinaryFileDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new UABinaryFileDataType.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public UABinaryFileDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static UABinaryFileDataType.Builder<Void> builder() {
        return new UABinaryFileDataType.Builder<Void>(null, null, false);
    }

    public static<_B >UABinaryFileDataType.Builder<_B> copyOf(final DataTypeSchemaHeader _other) {
        final UABinaryFileDataType.Builder<_B> _newBuilder = new UABinaryFileDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >UABinaryFileDataType.Builder<_B> copyOf(final UABinaryFileDataType _other) {
        final UABinaryFileDataType.Builder<_B> _newBuilder = new UABinaryFileDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final UABinaryFileDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree schemaLocationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("schemaLocation"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(schemaLocationPropertyTree!= null):((schemaLocationPropertyTree == null)||(!schemaLocationPropertyTree.isLeaf())))) {
            _other.schemaLocation = this.schemaLocation;
        }
        final PropertyTree fileHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fileHeader"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fileHeaderPropertyTree!= null):((fileHeaderPropertyTree == null)||(!fileHeaderPropertyTree.isLeaf())))) {
            _other.fileHeader = this.fileHeader;
        }
        final PropertyTree bodyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(bodyPropertyTree!= null):((bodyPropertyTree == null)||(!bodyPropertyTree.isLeaf())))) {
            _other.body = ((this.body == null)?null:this.body.newCopyBuilder(_other, bodyPropertyTree, _propertyTreeUse));
        }
    }

    @Override
    public<_B >UABinaryFileDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new UABinaryFileDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public UABinaryFileDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >UABinaryFileDataType.Builder<_B> copyOf(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UABinaryFileDataType.Builder<_B> _newBuilder = new UABinaryFileDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >UABinaryFileDataType.Builder<_B> copyOf(final UABinaryFileDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final UABinaryFileDataType.Builder<_B> _newBuilder = new UABinaryFileDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static UABinaryFileDataType.Builder<Void> copyExcept(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UABinaryFileDataType.Builder<Void> copyExcept(final UABinaryFileDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static UABinaryFileDataType.Builder<Void> copyOnly(final DataTypeSchemaHeader _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static UABinaryFileDataType.Builder<Void> copyOnly(final UABinaryFileDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends DataTypeSchemaHeader.Builder<_B>
        implements Buildable
    {

        private JAXBElement<String> schemaLocation;
        private JAXBElement<ListOfKeyValuePair> fileHeader;
        private Variant.Builder<UABinaryFileDataType.Builder<_B>> body;

        public Builder(final _B _parentBuilder, final UABinaryFileDataType _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.schemaLocation = _other.schemaLocation;
                this.fileHeader = _other.fileHeader;
                this.body = ((_other.body == null)?null:_other.body.newCopyBuilder(this));
            }
        }

        public Builder(final _B _parentBuilder, final UABinaryFileDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree schemaLocationPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("schemaLocation"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(schemaLocationPropertyTree!= null):((schemaLocationPropertyTree == null)||(!schemaLocationPropertyTree.isLeaf())))) {
                    this.schemaLocation = _other.schemaLocation;
                }
                final PropertyTree fileHeaderPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("fileHeader"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(fileHeaderPropertyTree!= null):((fileHeaderPropertyTree == null)||(!fileHeaderPropertyTree.isLeaf())))) {
                    this.fileHeader = _other.fileHeader;
                }
                final PropertyTree bodyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("body"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(bodyPropertyTree!= null):((bodyPropertyTree == null)||(!bodyPropertyTree.isLeaf())))) {
                    this.body = ((_other.body == null)?null:_other.body.newCopyBuilder(this, bodyPropertyTree, _propertyTreeUse));
                }
            }
        }

        protected<_P extends UABinaryFileDataType >_P init(final _P _product) {
            _product.schemaLocation = this.schemaLocation;
            _product.fileHeader = this.fileHeader;
            _product.body = ((this.body == null)?null:this.body.build());
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "schemaLocation" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param schemaLocation
         *     Neuer Wert der Eigenschaft "schemaLocation".
         */
        public UABinaryFileDataType.Builder<_B> withSchemaLocation(final JAXBElement<String> schemaLocation) {
            this.schemaLocation = schemaLocation;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "fileHeader" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param fileHeader
         *     Neuer Wert der Eigenschaft "fileHeader".
         */
        public UABinaryFileDataType.Builder<_B> withFileHeader(final JAXBElement<ListOfKeyValuePair> fileHeader) {
            this.fileHeader = fileHeader;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "body" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param body
         *     Neuer Wert der Eigenschaft "body".
         */
        public UABinaryFileDataType.Builder<_B> withBody(final Variant body) {
            this.body = ((body == null)?null:new Variant.Builder<UABinaryFileDataType.Builder<_B>>(this, body, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "body".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "body".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends UABinaryFileDataType.Builder<_B>> withBody() {
            if (this.body!= null) {
                return this.body;
            }
            return this.body = new Variant.Builder<UABinaryFileDataType.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "namespaces" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param namespaces
         *     Neuer Wert der Eigenschaft "namespaces".
         */
        @Override
        public UABinaryFileDataType.Builder<_B> withNamespaces(final JAXBElement<ListOfString> namespaces) {
            super.withNamespaces(namespaces);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "structureDataTypes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param structureDataTypes
         *     Neuer Wert der Eigenschaft "structureDataTypes".
         */
        @Override
        public UABinaryFileDataType.Builder<_B> withStructureDataTypes(final JAXBElement<ListOfStructureDescription> structureDataTypes) {
            super.withStructureDataTypes(structureDataTypes);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enumDataTypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enumDataTypes
         *     Neuer Wert der Eigenschaft "enumDataTypes".
         */
        @Override
        public UABinaryFileDataType.Builder<_B> withEnumDataTypes(final JAXBElement<ListOfEnumDescription> enumDataTypes) {
            super.withEnumDataTypes(enumDataTypes);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "simpleDataTypes" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param simpleDataTypes
         *     Neuer Wert der Eigenschaft "simpleDataTypes".
         */
        @Override
        public UABinaryFileDataType.Builder<_B> withSimpleDataTypes(final JAXBElement<ListOfSimpleTypeDescription> simpleDataTypes) {
            super.withSimpleDataTypes(simpleDataTypes);
            return this;
        }

        @Override
        public UABinaryFileDataType build() {
            if (_storedValue == null) {
                return this.init(new UABinaryFileDataType());
            } else {
                return ((UABinaryFileDataType) _storedValue);
            }
        }

        public UABinaryFileDataType.Builder<_B> copyOf(final UABinaryFileDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public UABinaryFileDataType.Builder<_B> copyOf(final UABinaryFileDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends UABinaryFileDataType.Selector<UABinaryFileDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static UABinaryFileDataType.Select _root() {
            return new UABinaryFileDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends DataTypeSchemaHeader.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>> schemaLocation = null;
        private com.kscs.util.jaxb.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>> fileHeader = null;
        private Variant.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>> body = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.schemaLocation!= null) {
                products.put("schemaLocation", this.schemaLocation.init());
            }
            if (this.fileHeader!= null) {
                products.put("fileHeader", this.fileHeader.init());
            }
            if (this.body!= null) {
                products.put("body", this.body.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>> schemaLocation() {
            return ((this.schemaLocation == null)?this.schemaLocation = new com.kscs.util.jaxb.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>>(this._root, this, "schemaLocation"):this.schemaLocation);
        }

        public com.kscs.util.jaxb.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>> fileHeader() {
            return ((this.fileHeader == null)?this.fileHeader = new com.kscs.util.jaxb.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>>(this._root, this, "fileHeader"):this.fileHeader);
        }

        public Variant.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>> body() {
            return ((this.body == null)?this.body = new Variant.Selector<TRoot, UABinaryFileDataType.Selector<TRoot, TParent>>(this._root, this, "body"):this.body);
        }

    }

}
