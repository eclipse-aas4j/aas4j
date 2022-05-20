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
 * <p>Java-Klasse für ReadRawModifiedDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReadRawModifiedDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryReadDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsReadModified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NumValuesPerNode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ReturnBounds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadRawModifiedDetails", propOrder = {
    "isReadModified",
    "startTime",
    "endTime",
    "numValuesPerNode",
    "returnBounds"
})
public class ReadRawModifiedDetails
    extends HistoryReadDetails
{

    @XmlElement(name = "IsReadModified")
    protected Boolean isReadModified;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "NumValuesPerNode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numValuesPerNode;
    @XmlElement(name = "ReturnBounds")
    protected Boolean returnBounds;

    /**
     * Ruft den Wert der isReadModified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReadModified() {
        return isReadModified;
    }

    /**
     * Legt den Wert der isReadModified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReadModified(Boolean value) {
        this.isReadModified = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der numValuesPerNode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumValuesPerNode() {
        return numValuesPerNode;
    }

    /**
     * Legt den Wert der numValuesPerNode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumValuesPerNode(Long value) {
        this.numValuesPerNode = value;
    }

    /**
     * Ruft den Wert der returnBounds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnBounds() {
        return returnBounds;
    }

    /**
     * Legt den Wert der returnBounds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnBounds(Boolean value) {
        this.returnBounds = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ReadRawModifiedDetails.Builder<_B> _other) {
        super.copyTo(_other);
        _other.isReadModified = this.isReadModified;
        _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        _other.endTime = ((this.endTime == null)?null:((XMLGregorianCalendar) this.endTime.clone()));
        _other.numValuesPerNode = this.numValuesPerNode;
        _other.returnBounds = this.returnBounds;
    }

    @Override
    public<_B >ReadRawModifiedDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ReadRawModifiedDetails.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ReadRawModifiedDetails.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ReadRawModifiedDetails.Builder<Void> builder() {
        return new ReadRawModifiedDetails.Builder<Void>(null, null, false);
    }

    public static<_B >ReadRawModifiedDetails.Builder<_B> copyOf(final HistoryReadDetails _other) {
        final ReadRawModifiedDetails.Builder<_B> _newBuilder = new ReadRawModifiedDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ReadRawModifiedDetails.Builder<_B> copyOf(final ReadRawModifiedDetails _other) {
        final ReadRawModifiedDetails.Builder<_B> _newBuilder = new ReadRawModifiedDetails.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ReadRawModifiedDetails.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree isReadModifiedPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isReadModified"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isReadModifiedPropertyTree!= null):((isReadModifiedPropertyTree == null)||(!isReadModifiedPropertyTree.isLeaf())))) {
            _other.isReadModified = this.isReadModified;
        }
        final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
            _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        }
        final PropertyTree endTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endTimePropertyTree!= null):((endTimePropertyTree == null)||(!endTimePropertyTree.isLeaf())))) {
            _other.endTime = ((this.endTime == null)?null:((XMLGregorianCalendar) this.endTime.clone()));
        }
        final PropertyTree numValuesPerNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numValuesPerNode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numValuesPerNodePropertyTree!= null):((numValuesPerNodePropertyTree == null)||(!numValuesPerNodePropertyTree.isLeaf())))) {
            _other.numValuesPerNode = this.numValuesPerNode;
        }
        final PropertyTree returnBoundsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("returnBounds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(returnBoundsPropertyTree!= null):((returnBoundsPropertyTree == null)||(!returnBoundsPropertyTree.isLeaf())))) {
            _other.returnBounds = this.returnBounds;
        }
    }

    @Override
    public<_B >ReadRawModifiedDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ReadRawModifiedDetails.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ReadRawModifiedDetails.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ReadRawModifiedDetails.Builder<_B> copyOf(final HistoryReadDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReadRawModifiedDetails.Builder<_B> _newBuilder = new ReadRawModifiedDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ReadRawModifiedDetails.Builder<_B> copyOf(final ReadRawModifiedDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReadRawModifiedDetails.Builder<_B> _newBuilder = new ReadRawModifiedDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ReadRawModifiedDetails.Builder<Void> copyExcept(final HistoryReadDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReadRawModifiedDetails.Builder<Void> copyExcept(final ReadRawModifiedDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReadRawModifiedDetails.Builder<Void> copyOnly(final HistoryReadDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ReadRawModifiedDetails.Builder<Void> copyOnly(final ReadRawModifiedDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends HistoryReadDetails.Builder<_B>
        implements Buildable
    {

        private Boolean isReadModified;
        private XMLGregorianCalendar startTime;
        private XMLGregorianCalendar endTime;
        private Long numValuesPerNode;
        private Boolean returnBounds;

        public Builder(final _B _parentBuilder, final ReadRawModifiedDetails _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.isReadModified = _other.isReadModified;
                this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                this.endTime = ((_other.endTime == null)?null:((XMLGregorianCalendar) _other.endTime.clone()));
                this.numValuesPerNode = _other.numValuesPerNode;
                this.returnBounds = _other.returnBounds;
            }
        }

        public Builder(final _B _parentBuilder, final ReadRawModifiedDetails _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree isReadModifiedPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isReadModified"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isReadModifiedPropertyTree!= null):((isReadModifiedPropertyTree == null)||(!isReadModifiedPropertyTree.isLeaf())))) {
                    this.isReadModified = _other.isReadModified;
                }
                final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
                    this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                }
                final PropertyTree endTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endTimePropertyTree!= null):((endTimePropertyTree == null)||(!endTimePropertyTree.isLeaf())))) {
                    this.endTime = ((_other.endTime == null)?null:((XMLGregorianCalendar) _other.endTime.clone()));
                }
                final PropertyTree numValuesPerNodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("numValuesPerNode"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(numValuesPerNodePropertyTree!= null):((numValuesPerNodePropertyTree == null)||(!numValuesPerNodePropertyTree.isLeaf())))) {
                    this.numValuesPerNode = _other.numValuesPerNode;
                }
                final PropertyTree returnBoundsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("returnBounds"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(returnBoundsPropertyTree!= null):((returnBoundsPropertyTree == null)||(!returnBoundsPropertyTree.isLeaf())))) {
                    this.returnBounds = _other.returnBounds;
                }
            }
        }

        protected<_P extends ReadRawModifiedDetails >_P init(final _P _product) {
            _product.isReadModified = this.isReadModified;
            _product.startTime = this.startTime;
            _product.endTime = this.endTime;
            _product.numValuesPerNode = this.numValuesPerNode;
            _product.returnBounds = this.returnBounds;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isReadModified" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param isReadModified
         *     Neuer Wert der Eigenschaft "isReadModified".
         */
        public ReadRawModifiedDetails.Builder<_B> withIsReadModified(final Boolean isReadModified) {
            this.isReadModified = isReadModified;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "startTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param startTime
         *     Neuer Wert der Eigenschaft "startTime".
         */
        public ReadRawModifiedDetails.Builder<_B> withStartTime(final XMLGregorianCalendar startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param endTime
         *     Neuer Wert der Eigenschaft "endTime".
         */
        public ReadRawModifiedDetails.Builder<_B> withEndTime(final XMLGregorianCalendar endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "numValuesPerNode" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param numValuesPerNode
         *     Neuer Wert der Eigenschaft "numValuesPerNode".
         */
        public ReadRawModifiedDetails.Builder<_B> withNumValuesPerNode(final Long numValuesPerNode) {
            this.numValuesPerNode = numValuesPerNode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "returnBounds" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param returnBounds
         *     Neuer Wert der Eigenschaft "returnBounds".
         */
        public ReadRawModifiedDetails.Builder<_B> withReturnBounds(final Boolean returnBounds) {
            this.returnBounds = returnBounds;
            return this;
        }

        @Override
        public ReadRawModifiedDetails build() {
            if (_storedValue == null) {
                return this.init(new ReadRawModifiedDetails());
            } else {
                return ((ReadRawModifiedDetails) _storedValue);
            }
        }

        public ReadRawModifiedDetails.Builder<_B> copyOf(final ReadRawModifiedDetails _other) {
            _other.copyTo(this);
            return this;
        }

        public ReadRawModifiedDetails.Builder<_B> copyOf(final ReadRawModifiedDetails.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ReadRawModifiedDetails.Selector<ReadRawModifiedDetails.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ReadRawModifiedDetails.Select _root() {
            return new ReadRawModifiedDetails.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends HistoryReadDetails.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> isReadModified = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> startTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> endTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> numValuesPerNode = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> returnBounds = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.isReadModified!= null) {
                products.put("isReadModified", this.isReadModified.init());
            }
            if (this.startTime!= null) {
                products.put("startTime", this.startTime.init());
            }
            if (this.endTime!= null) {
                products.put("endTime", this.endTime.init());
            }
            if (this.numValuesPerNode!= null) {
                products.put("numValuesPerNode", this.numValuesPerNode.init());
            }
            if (this.returnBounds!= null) {
                products.put("returnBounds", this.returnBounds.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> isReadModified() {
            return ((this.isReadModified == null)?this.isReadModified = new com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>>(this._root, this, "isReadModified"):this.isReadModified);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> startTime() {
            return ((this.startTime == null)?this.startTime = new com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>>(this._root, this, "startTime"):this.startTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> endTime() {
            return ((this.endTime == null)?this.endTime = new com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>>(this._root, this, "endTime"):this.endTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> numValuesPerNode() {
            return ((this.numValuesPerNode == null)?this.numValuesPerNode = new com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>>(this._root, this, "numValuesPerNode"):this.numValuesPerNode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>> returnBounds() {
            return ((this.returnBounds == null)?this.returnBounds = new com.kscs.util.jaxb.Selector<TRoot, ReadRawModifiedDetails.Selector<TRoot, TParent>>(this._root, this, "returnBounds"):this.returnBounds);
        }

    }

}
