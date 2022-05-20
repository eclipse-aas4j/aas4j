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
 * <p>Java-Klasse für ReadAtTimeDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReadAtTimeDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryReadDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqTimes" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDateTime" minOccurs="0"/&gt;
 *         &lt;element name="UseSimpleBounds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadAtTimeDetails", propOrder = {
    "reqTimes",
    "useSimpleBounds"
})
public class ReadAtTimeDetails
    extends HistoryReadDetails
{

    @XmlElementRef(name = "ReqTimes", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDateTime> reqTimes;
    @XmlElement(name = "UseSimpleBounds")
    protected Boolean useSimpleBounds;

    /**
     * Ruft den Wert der reqTimes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDateTime }{@code >}
     *     
     */
    public JAXBElement<ListOfDateTime> getReqTimes() {
        return reqTimes;
    }

    /**
     * Legt den Wert der reqTimes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDateTime }{@code >}
     *     
     */
    public void setReqTimes(JAXBElement<ListOfDateTime> value) {
        this.reqTimes = value;
    }

    /**
     * Ruft den Wert der useSimpleBounds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSimpleBounds() {
        return useSimpleBounds;
    }

    /**
     * Legt den Wert der useSimpleBounds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSimpleBounds(Boolean value) {
        this.useSimpleBounds = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ReadAtTimeDetails.Builder<_B> _other) {
        super.copyTo(_other);
        _other.reqTimes = this.reqTimes;
        _other.useSimpleBounds = this.useSimpleBounds;
    }

    @Override
    public<_B >ReadAtTimeDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ReadAtTimeDetails.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ReadAtTimeDetails.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ReadAtTimeDetails.Builder<Void> builder() {
        return new ReadAtTimeDetails.Builder<Void>(null, null, false);
    }

    public static<_B >ReadAtTimeDetails.Builder<_B> copyOf(final HistoryReadDetails _other) {
        final ReadAtTimeDetails.Builder<_B> _newBuilder = new ReadAtTimeDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ReadAtTimeDetails.Builder<_B> copyOf(final ReadAtTimeDetails _other) {
        final ReadAtTimeDetails.Builder<_B> _newBuilder = new ReadAtTimeDetails.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ReadAtTimeDetails.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree reqTimesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("reqTimes"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(reqTimesPropertyTree!= null):((reqTimesPropertyTree == null)||(!reqTimesPropertyTree.isLeaf())))) {
            _other.reqTimes = this.reqTimes;
        }
        final PropertyTree useSimpleBoundsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("useSimpleBounds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(useSimpleBoundsPropertyTree!= null):((useSimpleBoundsPropertyTree == null)||(!useSimpleBoundsPropertyTree.isLeaf())))) {
            _other.useSimpleBounds = this.useSimpleBounds;
        }
    }

    @Override
    public<_B >ReadAtTimeDetails.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ReadAtTimeDetails.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ReadAtTimeDetails.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ReadAtTimeDetails.Builder<_B> copyOf(final HistoryReadDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReadAtTimeDetails.Builder<_B> _newBuilder = new ReadAtTimeDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ReadAtTimeDetails.Builder<_B> copyOf(final ReadAtTimeDetails _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ReadAtTimeDetails.Builder<_B> _newBuilder = new ReadAtTimeDetails.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ReadAtTimeDetails.Builder<Void> copyExcept(final HistoryReadDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReadAtTimeDetails.Builder<Void> copyExcept(final ReadAtTimeDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ReadAtTimeDetails.Builder<Void> copyOnly(final HistoryReadDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ReadAtTimeDetails.Builder<Void> copyOnly(final ReadAtTimeDetails _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends HistoryReadDetails.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfDateTime> reqTimes;
        private Boolean useSimpleBounds;

        public Builder(final _B _parentBuilder, final ReadAtTimeDetails _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.reqTimes = _other.reqTimes;
                this.useSimpleBounds = _other.useSimpleBounds;
            }
        }

        public Builder(final _B _parentBuilder, final ReadAtTimeDetails _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree reqTimesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("reqTimes"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(reqTimesPropertyTree!= null):((reqTimesPropertyTree == null)||(!reqTimesPropertyTree.isLeaf())))) {
                    this.reqTimes = _other.reqTimes;
                }
                final PropertyTree useSimpleBoundsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("useSimpleBounds"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(useSimpleBoundsPropertyTree!= null):((useSimpleBoundsPropertyTree == null)||(!useSimpleBoundsPropertyTree.isLeaf())))) {
                    this.useSimpleBounds = _other.useSimpleBounds;
                }
            }
        }

        protected<_P extends ReadAtTimeDetails >_P init(final _P _product) {
            _product.reqTimes = this.reqTimes;
            _product.useSimpleBounds = this.useSimpleBounds;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "reqTimes" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param reqTimes
         *     Neuer Wert der Eigenschaft "reqTimes".
         */
        public ReadAtTimeDetails.Builder<_B> withReqTimes(final JAXBElement<ListOfDateTime> reqTimes) {
            this.reqTimes = reqTimes;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "useSimpleBounds" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param useSimpleBounds
         *     Neuer Wert der Eigenschaft "useSimpleBounds".
         */
        public ReadAtTimeDetails.Builder<_B> withUseSimpleBounds(final Boolean useSimpleBounds) {
            this.useSimpleBounds = useSimpleBounds;
            return this;
        }

        @Override
        public ReadAtTimeDetails build() {
            if (_storedValue == null) {
                return this.init(new ReadAtTimeDetails());
            } else {
                return ((ReadAtTimeDetails) _storedValue);
            }
        }

        public ReadAtTimeDetails.Builder<_B> copyOf(final ReadAtTimeDetails _other) {
            _other.copyTo(this);
            return this;
        }

        public ReadAtTimeDetails.Builder<_B> copyOf(final ReadAtTimeDetails.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ReadAtTimeDetails.Selector<ReadAtTimeDetails.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ReadAtTimeDetails.Select _root() {
            return new ReadAtTimeDetails.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends HistoryReadDetails.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ReadAtTimeDetails.Selector<TRoot, TParent>> reqTimes = null;
        private com.kscs.util.jaxb.Selector<TRoot, ReadAtTimeDetails.Selector<TRoot, TParent>> useSimpleBounds = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.reqTimes!= null) {
                products.put("reqTimes", this.reqTimes.init());
            }
            if (this.useSimpleBounds!= null) {
                products.put("useSimpleBounds", this.useSimpleBounds.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadAtTimeDetails.Selector<TRoot, TParent>> reqTimes() {
            return ((this.reqTimes == null)?this.reqTimes = new com.kscs.util.jaxb.Selector<TRoot, ReadAtTimeDetails.Selector<TRoot, TParent>>(this._root, this, "reqTimes"):this.reqTimes);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ReadAtTimeDetails.Selector<TRoot, TParent>> useSimpleBounds() {
            return ((this.useSimpleBounds == null)?this.useSimpleBounds = new com.kscs.util.jaxb.Selector<TRoot, ReadAtTimeDetails.Selector<TRoot, TParent>>(this._root, this, "useSimpleBounds"):this.useSimpleBounds);
        }

    }

}
