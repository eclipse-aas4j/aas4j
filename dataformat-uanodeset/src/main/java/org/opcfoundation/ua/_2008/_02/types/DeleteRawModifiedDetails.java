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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für DeleteRawModifiedDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteRawModifiedDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryUpdateDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsDeleteModified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteRawModifiedDetails", propOrder = {
    "isDeleteModified",
    "startTime",
    "endTime"
})
public class DeleteRawModifiedDetails
    extends HistoryUpdateDetails
{

    @XmlElement(name = "IsDeleteModified")
    protected Boolean isDeleteModified;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;

    /**
     * Ruft den Wert der isDeleteModified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleteModified() {
        return isDeleteModified;
    }

    /**
     * Legt den Wert der isDeleteModified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleteModified(Boolean value) {
        this.isDeleteModified = value;
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
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DeleteRawModifiedDetails.Builder<_B> _other) {
        super.copyTo(_other);
        _other.isDeleteModified = this.isDeleteModified;
        _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        _other.endTime = ((this.endTime == null)?null:((XMLGregorianCalendar) this.endTime.clone()));
    }

    @Override
    public<_B >DeleteRawModifiedDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DeleteRawModifiedDetails.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DeleteRawModifiedDetails.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DeleteRawModifiedDetails.Builder<Void> builder() {
        return new DeleteRawModifiedDetails.Builder<Void>(null, null, false);
    }

    public static<_B >DeleteRawModifiedDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other) {
        final DeleteRawModifiedDetails.Builder<_B> _newBuilder = new DeleteRawModifiedDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DeleteRawModifiedDetails.Builder<_B> copyOf(final DeleteRawModifiedDetails _other) {
        final DeleteRawModifiedDetails.Builder<_B> _newBuilder = new DeleteRawModifiedDetails.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DeleteRawModifiedDetails.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree isDeleteModifiedPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isDeleteModified"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isDeleteModifiedPropertyTree!= null):((isDeleteModifiedPropertyTree == null)||(!isDeleteModifiedPropertyTree.isLeaf())))) {
            _other.isDeleteModified = this.isDeleteModified;
        }
        final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
            _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        }
        final PropertyTree endTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endTimePropertyTree!= null):((endTimePropertyTree == null)||(!endTimePropertyTree.isLeaf())))) {
            _other.endTime = ((this.endTime == null)?null:((XMLGregorianCalendar) this.endTime.clone()));
        }
    }

    @Override
    public<_B >DeleteRawModifiedDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DeleteRawModifiedDetails.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DeleteRawModifiedDetails.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DeleteRawModifiedDetails.Builder<_B> copyOf(final HistoryUpdateDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DeleteRawModifiedDetails.Builder<_B> _newBuilder = new DeleteRawModifiedDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DeleteRawModifiedDetails.Builder<_B> copyOf(final DeleteRawModifiedDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DeleteRawModifiedDetails.Builder<_B> _newBuilder = new DeleteRawModifiedDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DeleteRawModifiedDetails.Builder<Void> copyExcept(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DeleteRawModifiedDetails.Builder<Void> copyExcept(final DeleteRawModifiedDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DeleteRawModifiedDetails.Builder<Void> copyOnly(final HistoryUpdateDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DeleteRawModifiedDetails.Builder<Void> copyOnly(final DeleteRawModifiedDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends HistoryUpdateDetails.Builder<_B>
        implements Buildable
    {

        private Boolean isDeleteModified;
        private XMLGregorianCalendar startTime;
        private XMLGregorianCalendar endTime;

        public Builder(final _B _parentBuilder, final DeleteRawModifiedDetails _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.isDeleteModified = _other.isDeleteModified;
                this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                this.endTime = ((_other.endTime == null)?null:((XMLGregorianCalendar) _other.endTime.clone()));
            }
        }

        public Builder(final _B _parentBuilder, final DeleteRawModifiedDetails _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree isDeleteModifiedPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("isDeleteModified"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(isDeleteModifiedPropertyTree!= null):((isDeleteModifiedPropertyTree == null)||(!isDeleteModifiedPropertyTree.isLeaf())))) {
                    this.isDeleteModified = _other.isDeleteModified;
                }
                final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
                    this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                }
                final PropertyTree endTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endTime"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endTimePropertyTree!= null):((endTimePropertyTree == null)||(!endTimePropertyTree.isLeaf())))) {
                    this.endTime = ((_other.endTime == null)?null:((XMLGregorianCalendar) _other.endTime.clone()));
                }
            }
        }

        protected<_P extends DeleteRawModifiedDetails >_P init(final _P _product) {
            _product.isDeleteModified = this.isDeleteModified;
            _product.startTime = this.startTime;
            _product.endTime = this.endTime;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "isDeleteModified" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param isDeleteModified
         *     Neuer Wert der Eigenschaft "isDeleteModified".
         */
        public DeleteRawModifiedDetails.Builder<_B> withIsDeleteModified(final Boolean isDeleteModified) {
            this.isDeleteModified = isDeleteModified;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "startTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param startTime
         *     Neuer Wert der Eigenschaft "startTime".
         */
        public DeleteRawModifiedDetails.Builder<_B> withStartTime(final XMLGregorianCalendar startTime) {
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
        public DeleteRawModifiedDetails.Builder<_B> withEndTime(final XMLGregorianCalendar endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        @Override
        public DeleteRawModifiedDetails.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            super.withNodeId(nodeId);
            return this;
        }

        @Override
        public DeleteRawModifiedDetails build() {
            if (_storedValue == null) {
                return this.init(new DeleteRawModifiedDetails());
            } else {
                return ((DeleteRawModifiedDetails) _storedValue);
            }
        }

        public DeleteRawModifiedDetails.Builder<_B> copyOf(final DeleteRawModifiedDetails _other) {
            _other.copyTo(this);
            return this;
        }

        public DeleteRawModifiedDetails.Builder<_B> copyOf(final DeleteRawModifiedDetails.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DeleteRawModifiedDetails.Selector<DeleteRawModifiedDetails.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DeleteRawModifiedDetails.Select _root() {
            return new DeleteRawModifiedDetails.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends HistoryUpdateDetails.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>> isDeleteModified = null;
        private com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>> startTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>> endTime = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.isDeleteModified!= null) {
                products.put("isDeleteModified", this.isDeleteModified.init());
            }
            if (this.startTime!= null) {
                products.put("startTime", this.startTime.init());
            }
            if (this.endTime!= null) {
                products.put("endTime", this.endTime.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>> isDeleteModified() {
            return ((this.isDeleteModified == null)?this.isDeleteModified = new com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>>(this._root, this, "isDeleteModified"):this.isDeleteModified);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>> startTime() {
            return ((this.startTime == null)?this.startTime = new com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>>(this._root, this, "startTime"):this.startTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>> endTime() {
            return ((this.endTime == null)?this.endTime = new com.kscs.util.jaxb.Selector<TRoot, DeleteRawModifiedDetails.Selector<TRoot, TParent>>(this._root, this, "endTime"):this.endTime);
        }

    }

}
