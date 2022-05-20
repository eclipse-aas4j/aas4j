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
 * <p>Java-Klasse für DataValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="SourceTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SourcePicoseconds" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="ServerTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ServerPicoseconds" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataValue", propOrder = {
    "value",
    "statusCode",
    "sourceTimestamp",
    "sourcePicoseconds",
    "serverTimestamp",
    "serverPicoseconds"
})
public class DataValue {

    @XmlElement(name = "Value")
    protected Variant value;
    @XmlElement(name = "StatusCode")
    protected StatusCode statusCode;
    @XmlElement(name = "SourceTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sourceTimestamp;
    @XmlElement(name = "SourcePicoseconds")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer sourcePicoseconds;
    @XmlElement(name = "ServerTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serverTimestamp;
    @XmlElement(name = "ServerPicoseconds")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer serverPicoseconds;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setValue(Variant value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der statusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Legt den Wert der statusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatusCode(StatusCode value) {
        this.statusCode = value;
    }

    /**
     * Ruft den Wert der sourceTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSourceTimestamp() {
        return sourceTimestamp;
    }

    /**
     * Legt den Wert der sourceTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSourceTimestamp(XMLGregorianCalendar value) {
        this.sourceTimestamp = value;
    }

    /**
     * Ruft den Wert der sourcePicoseconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourcePicoseconds() {
        return sourcePicoseconds;
    }

    /**
     * Legt den Wert der sourcePicoseconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourcePicoseconds(Integer value) {
        this.sourcePicoseconds = value;
    }

    /**
     * Ruft den Wert der serverTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServerTimestamp() {
        return serverTimestamp;
    }

    /**
     * Legt den Wert der serverTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServerTimestamp(XMLGregorianCalendar value) {
        this.serverTimestamp = value;
    }

    /**
     * Ruft den Wert der serverPicoseconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServerPicoseconds() {
        return serverPicoseconds;
    }

    /**
     * Legt den Wert der serverPicoseconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServerPicoseconds(Integer value) {
        this.serverPicoseconds = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataValue.Builder<_B> _other) {
        _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other));
        _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other));
        _other.sourceTimestamp = ((this.sourceTimestamp == null)?null:((XMLGregorianCalendar) this.sourceTimestamp.clone()));
        _other.sourcePicoseconds = this.sourcePicoseconds;
        _other.serverTimestamp = ((this.serverTimestamp == null)?null:((XMLGregorianCalendar) this.serverTimestamp.clone()));
        _other.serverPicoseconds = this.serverPicoseconds;
    }

    public<_B >DataValue.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataValue.Builder<_B>(_parentBuilder, this, true);
    }

    public DataValue.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataValue.Builder<Void> builder() {
        return new DataValue.Builder<Void>(null, null, false);
    }

    public static<_B >DataValue.Builder<_B> copyOf(final DataValue _other) {
        final DataValue.Builder<_B> _newBuilder = new DataValue.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataValue.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
            _other.value = ((this.value == null)?null:this.value.newCopyBuilder(_other, valuePropertyTree, _propertyTreeUse));
        }
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree sourceTimestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sourceTimestamp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sourceTimestampPropertyTree!= null):((sourceTimestampPropertyTree == null)||(!sourceTimestampPropertyTree.isLeaf())))) {
            _other.sourceTimestamp = ((this.sourceTimestamp == null)?null:((XMLGregorianCalendar) this.sourceTimestamp.clone()));
        }
        final PropertyTree sourcePicosecondsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sourcePicoseconds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sourcePicosecondsPropertyTree!= null):((sourcePicosecondsPropertyTree == null)||(!sourcePicosecondsPropertyTree.isLeaf())))) {
            _other.sourcePicoseconds = this.sourcePicoseconds;
        }
        final PropertyTree serverTimestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverTimestamp"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverTimestampPropertyTree!= null):((serverTimestampPropertyTree == null)||(!serverTimestampPropertyTree.isLeaf())))) {
            _other.serverTimestamp = ((this.serverTimestamp == null)?null:((XMLGregorianCalendar) this.serverTimestamp.clone()));
        }
        final PropertyTree serverPicosecondsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverPicoseconds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverPicosecondsPropertyTree!= null):((serverPicosecondsPropertyTree == null)||(!serverPicosecondsPropertyTree.isLeaf())))) {
            _other.serverPicoseconds = this.serverPicoseconds;
        }
    }

    public<_B >DataValue.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataValue.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DataValue.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataValue.Builder<_B> copyOf(final DataValue _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataValue.Builder<_B> _newBuilder = new DataValue.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataValue.Builder<Void> copyExcept(final DataValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataValue.Builder<Void> copyOnly(final DataValue _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DataValue _storedValue;
        private Variant.Builder<DataValue.Builder<_B>> value;
        private StatusCode.Builder<DataValue.Builder<_B>> statusCode;
        private XMLGregorianCalendar sourceTimestamp;
        private Integer sourcePicoseconds;
        private XMLGregorianCalendar serverTimestamp;
        private Integer serverPicoseconds;

        public Builder(final _B _parentBuilder, final DataValue _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this));
                    this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this));
                    this.sourceTimestamp = ((_other.sourceTimestamp == null)?null:((XMLGregorianCalendar) _other.sourceTimestamp.clone()));
                    this.sourcePicoseconds = _other.sourcePicoseconds;
                    this.serverTimestamp = ((_other.serverTimestamp == null)?null:((XMLGregorianCalendar) _other.serverTimestamp.clone()));
                    this.serverPicoseconds = _other.serverPicoseconds;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DataValue _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree valuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("value"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(valuePropertyTree!= null):((valuePropertyTree == null)||(!valuePropertyTree.isLeaf())))) {
                        this.value = ((_other.value == null)?null:_other.value.newCopyBuilder(this, valuePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree sourceTimestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sourceTimestamp"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sourceTimestampPropertyTree!= null):((sourceTimestampPropertyTree == null)||(!sourceTimestampPropertyTree.isLeaf())))) {
                        this.sourceTimestamp = ((_other.sourceTimestamp == null)?null:((XMLGregorianCalendar) _other.sourceTimestamp.clone()));
                    }
                    final PropertyTree sourcePicosecondsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sourcePicoseconds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sourcePicosecondsPropertyTree!= null):((sourcePicosecondsPropertyTree == null)||(!sourcePicosecondsPropertyTree.isLeaf())))) {
                        this.sourcePicoseconds = _other.sourcePicoseconds;
                    }
                    final PropertyTree serverTimestampPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverTimestamp"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverTimestampPropertyTree!= null):((serverTimestampPropertyTree == null)||(!serverTimestampPropertyTree.isLeaf())))) {
                        this.serverTimestamp = ((_other.serverTimestamp == null)?null:((XMLGregorianCalendar) _other.serverTimestamp.clone()));
                    }
                    final PropertyTree serverPicosecondsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverPicoseconds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverPicosecondsPropertyTree!= null):((serverPicosecondsPropertyTree == null)||(!serverPicosecondsPropertyTree.isLeaf())))) {
                        this.serverPicoseconds = _other.serverPicoseconds;
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

        protected<_P extends DataValue >_P init(final _P _product) {
            _product.value = ((this.value == null)?null:this.value.build());
            _product.statusCode = ((this.statusCode == null)?null:this.statusCode.build());
            _product.sourceTimestamp = this.sourceTimestamp;
            _product.sourcePicoseconds = this.sourcePicoseconds;
            _product.serverTimestamp = this.serverTimestamp;
            _product.serverPicoseconds = this.serverPicoseconds;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "value" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param value
         *     Neuer Wert der Eigenschaft "value".
         */
        public DataValue.Builder<_B> withValue(final Variant value) {
            this.value = ((value == null)?null:new Variant.Builder<DataValue.Builder<_B>>(this, value, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "value".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "value".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends DataValue.Builder<_B>> withValue() {
            if (this.value!= null) {
                return this.value;
            }
            return this.value = new Variant.Builder<DataValue.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public DataValue.Builder<_B> withStatusCode(final StatusCode statusCode) {
            this.statusCode = ((statusCode == null)?null:new StatusCode.Builder<DataValue.Builder<_B>>(this, statusCode, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "statusCode".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "statusCode".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusCode.Builder<? extends DataValue.Builder<_B>> withStatusCode() {
            if (this.statusCode!= null) {
                return this.statusCode;
            }
            return this.statusCode = new StatusCode.Builder<DataValue.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sourceTimestamp" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param sourceTimestamp
         *     Neuer Wert der Eigenschaft "sourceTimestamp".
         */
        public DataValue.Builder<_B> withSourceTimestamp(final XMLGregorianCalendar sourceTimestamp) {
            this.sourceTimestamp = sourceTimestamp;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sourcePicoseconds" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param sourcePicoseconds
         *     Neuer Wert der Eigenschaft "sourcePicoseconds".
         */
        public DataValue.Builder<_B> withSourcePicoseconds(final Integer sourcePicoseconds) {
            this.sourcePicoseconds = sourcePicoseconds;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverTimestamp" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverTimestamp
         *     Neuer Wert der Eigenschaft "serverTimestamp".
         */
        public DataValue.Builder<_B> withServerTimestamp(final XMLGregorianCalendar serverTimestamp) {
            this.serverTimestamp = serverTimestamp;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverPicoseconds" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param serverPicoseconds
         *     Neuer Wert der Eigenschaft "serverPicoseconds".
         */
        public DataValue.Builder<_B> withServerPicoseconds(final Integer serverPicoseconds) {
            this.serverPicoseconds = serverPicoseconds;
            return this;
        }

        @Override
        public DataValue build() {
            if (_storedValue == null) {
                return this.init(new DataValue());
            } else {
                return ((DataValue) _storedValue);
            }
        }

        public DataValue.Builder<_B> copyOf(final DataValue _other) {
            _other.copyTo(this);
            return this;
        }

        public DataValue.Builder<_B> copyOf(final DataValue.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataValue.Selector<DataValue.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataValue.Select _root() {
            return new DataValue.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Variant.Selector<TRoot, DataValue.Selector<TRoot, TParent>> value = null;
        private StatusCode.Selector<TRoot, DataValue.Selector<TRoot, TParent>> statusCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>> sourceTimestamp = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>> sourcePicoseconds = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>> serverTimestamp = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>> serverPicoseconds = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.value!= null) {
                products.put("value", this.value.init());
            }
            if (this.statusCode!= null) {
                products.put("statusCode", this.statusCode.init());
            }
            if (this.sourceTimestamp!= null) {
                products.put("sourceTimestamp", this.sourceTimestamp.init());
            }
            if (this.sourcePicoseconds!= null) {
                products.put("sourcePicoseconds", this.sourcePicoseconds.init());
            }
            if (this.serverTimestamp!= null) {
                products.put("serverTimestamp", this.serverTimestamp.init());
            }
            if (this.serverPicoseconds!= null) {
                products.put("serverPicoseconds", this.serverPicoseconds.init());
            }
            return products;
        }

        public Variant.Selector<TRoot, DataValue.Selector<TRoot, TParent>> value() {
            return ((this.value == null)?this.value = new Variant.Selector<TRoot, DataValue.Selector<TRoot, TParent>>(this._root, this, "value"):this.value);
        }

        public StatusCode.Selector<TRoot, DataValue.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, DataValue.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>> sourceTimestamp() {
            return ((this.sourceTimestamp == null)?this.sourceTimestamp = new com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>>(this._root, this, "sourceTimestamp"):this.sourceTimestamp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>> sourcePicoseconds() {
            return ((this.sourcePicoseconds == null)?this.sourcePicoseconds = new com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>>(this._root, this, "sourcePicoseconds"):this.sourcePicoseconds);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>> serverTimestamp() {
            return ((this.serverTimestamp == null)?this.serverTimestamp = new com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>>(this._root, this, "serverTimestamp"):this.serverTimestamp);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>> serverPicoseconds() {
            return ((this.serverPicoseconds == null)?this.serverPicoseconds = new com.kscs.util.jaxb.Selector<TRoot, DataValue.Selector<TRoot, TParent>>(this._root, this, "serverPicoseconds"):this.serverPicoseconds);
        }

    }

}
