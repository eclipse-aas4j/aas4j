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
 * <p>Java-Klasse für HistoryModifiedData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HistoryModifiedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}HistoryData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModificationInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfModificationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryModifiedData", propOrder = {
    "modificationInfos"
})
public class HistoryModifiedData
    extends HistoryData
{

    @XmlElementRef(name = "ModificationInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfModificationInfo> modificationInfos;

    /**
     * Ruft den Wert der modificationInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfModificationInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfModificationInfo> getModificationInfos() {
        return modificationInfos;
    }

    /**
     * Legt den Wert der modificationInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfModificationInfo }{@code >}
     *     
     */
    public void setModificationInfos(JAXBElement<ListOfModificationInfo> value) {
        this.modificationInfos = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final HistoryModifiedData.Builder<_B> _other) {
        super.copyTo(_other);
        _other.modificationInfos = this.modificationInfos;
    }

    @Override
    public<_B >HistoryModifiedData.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new HistoryModifiedData.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public HistoryModifiedData.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static HistoryModifiedData.Builder<Void> builder() {
        return new HistoryModifiedData.Builder<Void>(null, null, false);
    }

    public static<_B >HistoryModifiedData.Builder<_B> copyOf(final HistoryData _other) {
        final HistoryModifiedData.Builder<_B> _newBuilder = new HistoryModifiedData.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >HistoryModifiedData.Builder<_B> copyOf(final HistoryModifiedData _other) {
        final HistoryModifiedData.Builder<_B> _newBuilder = new HistoryModifiedData.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final HistoryModifiedData.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree modificationInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modificationInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modificationInfosPropertyTree!= null):((modificationInfosPropertyTree == null)||(!modificationInfosPropertyTree.isLeaf())))) {
            _other.modificationInfos = this.modificationInfos;
        }
    }

    @Override
    public<_B >HistoryModifiedData.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new HistoryModifiedData.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public HistoryModifiedData.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >HistoryModifiedData.Builder<_B> copyOf(final HistoryData _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryModifiedData.Builder<_B> _newBuilder = new HistoryModifiedData.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >HistoryModifiedData.Builder<_B> copyOf(final HistoryModifiedData _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final HistoryModifiedData.Builder<_B> _newBuilder = new HistoryModifiedData.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static HistoryModifiedData.Builder<Void> copyExcept(final HistoryData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryModifiedData.Builder<Void> copyExcept(final HistoryModifiedData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static HistoryModifiedData.Builder<Void> copyOnly(final HistoryData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static HistoryModifiedData.Builder<Void> copyOnly(final HistoryModifiedData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends HistoryData.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfModificationInfo> modificationInfos;

        public Builder(final _B _parentBuilder, final HistoryModifiedData _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.modificationInfos = _other.modificationInfos;
            }
        }

        public Builder(final _B _parentBuilder, final HistoryModifiedData _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree modificationInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modificationInfos"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modificationInfosPropertyTree!= null):((modificationInfosPropertyTree == null)||(!modificationInfosPropertyTree.isLeaf())))) {
                    this.modificationInfos = _other.modificationInfos;
                }
            }
        }

        protected<_P extends HistoryModifiedData >_P init(final _P _product) {
            _product.modificationInfos = this.modificationInfos;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modificationInfos" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param modificationInfos
         *     Neuer Wert der Eigenschaft "modificationInfos".
         */
        public HistoryModifiedData.Builder<_B> withModificationInfos(final JAXBElement<ListOfModificationInfo> modificationInfos) {
            this.modificationInfos = modificationInfos;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataValues" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param dataValues
         *     Neuer Wert der Eigenschaft "dataValues".
         */
        @Override
        public HistoryModifiedData.Builder<_B> withDataValues(final JAXBElement<ListOfDataValue> dataValues) {
            super.withDataValues(dataValues);
            return this;
        }

        @Override
        public HistoryModifiedData build() {
            if (_storedValue == null) {
                return this.init(new HistoryModifiedData());
            } else {
                return ((HistoryModifiedData) _storedValue);
            }
        }

        public HistoryModifiedData.Builder<_B> copyOf(final HistoryModifiedData _other) {
            _other.copyTo(this);
            return this;
        }

        public HistoryModifiedData.Builder<_B> copyOf(final HistoryModifiedData.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends HistoryModifiedData.Selector<HistoryModifiedData.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static HistoryModifiedData.Select _root() {
            return new HistoryModifiedData.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends HistoryData.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, HistoryModifiedData.Selector<TRoot, TParent>> modificationInfos = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.modificationInfos!= null) {
                products.put("modificationInfos", this.modificationInfos.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, HistoryModifiedData.Selector<TRoot, TParent>> modificationInfos() {
            return ((this.modificationInfos == null)?this.modificationInfos = new com.kscs.util.jaxb.Selector<TRoot, HistoryModifiedData.Selector<TRoot, TParent>>(this._root, this, "modificationInfos"):this.modificationInfos);
        }

    }

}
