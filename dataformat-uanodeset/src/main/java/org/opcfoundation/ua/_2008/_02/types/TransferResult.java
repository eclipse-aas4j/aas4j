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
 * <p>Java-Klasse für TransferResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransferResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="AvailableSequenceNumbers" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfUInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferResult", propOrder = {
    "statusCode",
    "availableSequenceNumbers"
})
public class TransferResult {

    @XmlElement(name = "StatusCode")
    protected StatusCode statusCode;
    @XmlElementRef(name = "AvailableSequenceNumbers", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfUInt32> availableSequenceNumbers;

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
     * Ruft den Wert der availableSequenceNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public JAXBElement<ListOfUInt32> getAvailableSequenceNumbers() {
        return availableSequenceNumbers;
    }

    /**
     * Legt den Wert der availableSequenceNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfUInt32 }{@code >}
     *     
     */
    public void setAvailableSequenceNumbers(JAXBElement<ListOfUInt32> value) {
        this.availableSequenceNumbers = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final TransferResult.Builder<_B> _other) {
        _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other));
        _other.availableSequenceNumbers = this.availableSequenceNumbers;
    }

    public<_B >TransferResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new TransferResult.Builder<_B>(_parentBuilder, this, true);
    }

    public TransferResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static TransferResult.Builder<Void> builder() {
        return new TransferResult.Builder<Void>(null, null, false);
    }

    public static<_B >TransferResult.Builder<_B> copyOf(final TransferResult _other) {
        final TransferResult.Builder<_B> _newBuilder = new TransferResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final TransferResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
            _other.statusCode = ((this.statusCode == null)?null:this.statusCode.newCopyBuilder(_other, statusCodePropertyTree, _propertyTreeUse));
        }
        final PropertyTree availableSequenceNumbersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("availableSequenceNumbers"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(availableSequenceNumbersPropertyTree!= null):((availableSequenceNumbersPropertyTree == null)||(!availableSequenceNumbersPropertyTree.isLeaf())))) {
            _other.availableSequenceNumbers = this.availableSequenceNumbers;
        }
    }

    public<_B >TransferResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new TransferResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public TransferResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >TransferResult.Builder<_B> copyOf(final TransferResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final TransferResult.Builder<_B> _newBuilder = new TransferResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static TransferResult.Builder<Void> copyExcept(final TransferResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static TransferResult.Builder<Void> copyOnly(final TransferResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final TransferResult _storedValue;
        private StatusCode.Builder<TransferResult.Builder<_B>> statusCode;
        private JAXBElement<ListOfUInt32> availableSequenceNumbers;

        public Builder(final _B _parentBuilder, final TransferResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this));
                    this.availableSequenceNumbers = _other.availableSequenceNumbers;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final TransferResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree statusCodePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("statusCode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusCodePropertyTree!= null):((statusCodePropertyTree == null)||(!statusCodePropertyTree.isLeaf())))) {
                        this.statusCode = ((_other.statusCode == null)?null:_other.statusCode.newCopyBuilder(this, statusCodePropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree availableSequenceNumbersPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("availableSequenceNumbers"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(availableSequenceNumbersPropertyTree!= null):((availableSequenceNumbersPropertyTree == null)||(!availableSequenceNumbersPropertyTree.isLeaf())))) {
                        this.availableSequenceNumbers = _other.availableSequenceNumbers;
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

        protected<_P extends TransferResult >_P init(final _P _product) {
            _product.statusCode = ((this.statusCode == null)?null:this.statusCode.build());
            _product.availableSequenceNumbers = this.availableSequenceNumbers;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "statusCode" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param statusCode
         *     Neuer Wert der Eigenschaft "statusCode".
         */
        public TransferResult.Builder<_B> withStatusCode(final StatusCode statusCode) {
            this.statusCode = ((statusCode == null)?null:new StatusCode.Builder<TransferResult.Builder<_B>>(this, statusCode, false));
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
        public StatusCode.Builder<? extends TransferResult.Builder<_B>> withStatusCode() {
            if (this.statusCode!= null) {
                return this.statusCode;
            }
            return this.statusCode = new StatusCode.Builder<TransferResult.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "availableSequenceNumbers" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param availableSequenceNumbers
         *     Neuer Wert der Eigenschaft "availableSequenceNumbers".
         */
        public TransferResult.Builder<_B> withAvailableSequenceNumbers(final JAXBElement<ListOfUInt32> availableSequenceNumbers) {
            this.availableSequenceNumbers = availableSequenceNumbers;
            return this;
        }

        @Override
        public TransferResult build() {
            if (_storedValue == null) {
                return this.init(new TransferResult());
            } else {
                return ((TransferResult) _storedValue);
            }
        }

        public TransferResult.Builder<_B> copyOf(final TransferResult _other) {
            _other.copyTo(this);
            return this;
        }

        public TransferResult.Builder<_B> copyOf(final TransferResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends TransferResult.Selector<TransferResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static TransferResult.Select _root() {
            return new TransferResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, TransferResult.Selector<TRoot, TParent>> statusCode = null;
        private com.kscs.util.jaxb.Selector<TRoot, TransferResult.Selector<TRoot, TParent>> availableSequenceNumbers = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.statusCode!= null) {
                products.put("statusCode", this.statusCode.init());
            }
            if (this.availableSequenceNumbers!= null) {
                products.put("availableSequenceNumbers", this.availableSequenceNumbers.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, TransferResult.Selector<TRoot, TParent>> statusCode() {
            return ((this.statusCode == null)?this.statusCode = new StatusCode.Selector<TRoot, TransferResult.Selector<TRoot, TParent>>(this._root, this, "statusCode"):this.statusCode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, TransferResult.Selector<TRoot, TParent>> availableSequenceNumbers() {
            return ((this.availableSequenceNumbers == null)?this.availableSequenceNumbers = new com.kscs.util.jaxb.Selector<TRoot, TransferResult.Selector<TRoot, TParent>>(this._root, this, "availableSequenceNumbers"):this.availableSequenceNumbers);
        }

    }

}
