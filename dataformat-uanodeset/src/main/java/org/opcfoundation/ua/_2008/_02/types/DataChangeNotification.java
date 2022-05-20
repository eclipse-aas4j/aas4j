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
 * <p>Java-Klasse für DataChangeNotification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataChangeNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NotificationData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitoredItems" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfMonitoredItemNotification" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataChangeNotification", propOrder = {
    "monitoredItems",
    "diagnosticInfos"
})
public class DataChangeNotification
    extends NotificationData
{

    @XmlElementRef(name = "MonitoredItems", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfMonitoredItemNotification> monitoredItems;
    @XmlElementRef(name = "DiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

    /**
     * Ruft den Wert der monitoredItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfMonitoredItemNotification }{@code >}
     *     
     */
    public JAXBElement<ListOfMonitoredItemNotification> getMonitoredItems() {
        return monitoredItems;
    }

    /**
     * Legt den Wert der monitoredItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfMonitoredItemNotification }{@code >}
     *     
     */
    public void setMonitoredItems(JAXBElement<ListOfMonitoredItemNotification> value) {
        this.monitoredItems = value;
    }

    /**
     * Ruft den Wert der diagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getDiagnosticInfos() {
        return diagnosticInfos;
    }

    /**
     * Legt den Wert der diagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.diagnosticInfos = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataChangeNotification.Builder<_B> _other) {
        super.copyTo(_other);
        _other.monitoredItems = this.monitoredItems;
        _other.diagnosticInfos = this.diagnosticInfos;
    }

    @Override
    public<_B >DataChangeNotification.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataChangeNotification.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public DataChangeNotification.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataChangeNotification.Builder<Void> builder() {
        return new DataChangeNotification.Builder<Void>(null, null, false);
    }

    public static<_B >DataChangeNotification.Builder<_B> copyOf(final NotificationData _other) {
        final DataChangeNotification.Builder<_B> _newBuilder = new DataChangeNotification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >DataChangeNotification.Builder<_B> copyOf(final DataChangeNotification _other) {
        final DataChangeNotification.Builder<_B> _newBuilder = new DataChangeNotification.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataChangeNotification.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree monitoredItemsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItems"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemsPropertyTree!= null):((monitoredItemsPropertyTree == null)||(!monitoredItemsPropertyTree.isLeaf())))) {
            _other.monitoredItems = this.monitoredItems;
        }
        final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
            _other.diagnosticInfos = this.diagnosticInfos;
        }
    }

    @Override
    public<_B >DataChangeNotification.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataChangeNotification.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public DataChangeNotification.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataChangeNotification.Builder<_B> copyOf(final NotificationData _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataChangeNotification.Builder<_B> _newBuilder = new DataChangeNotification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >DataChangeNotification.Builder<_B> copyOf(final DataChangeNotification _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataChangeNotification.Builder<_B> _newBuilder = new DataChangeNotification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataChangeNotification.Builder<Void> copyExcept(final NotificationData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataChangeNotification.Builder<Void> copyExcept(final DataChangeNotification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataChangeNotification.Builder<Void> copyOnly(final NotificationData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static DataChangeNotification.Builder<Void> copyOnly(final DataChangeNotification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NotificationData.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfMonitoredItemNotification> monitoredItems;
        private JAXBElement<ListOfDiagnosticInfo> diagnosticInfos;

        public Builder(final _B _parentBuilder, final DataChangeNotification _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.monitoredItems = _other.monitoredItems;
                this.diagnosticInfos = _other.diagnosticInfos;
            }
        }

        public Builder(final _B _parentBuilder, final DataChangeNotification _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree monitoredItemsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItems"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemsPropertyTree!= null):((monitoredItemsPropertyTree == null)||(!monitoredItemsPropertyTree.isLeaf())))) {
                    this.monitoredItems = _other.monitoredItems;
                }
                final PropertyTree diagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfos"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfosPropertyTree!= null):((diagnosticInfosPropertyTree == null)||(!diagnosticInfosPropertyTree.isLeaf())))) {
                    this.diagnosticInfos = _other.diagnosticInfos;
                }
            }
        }

        protected<_P extends DataChangeNotification >_P init(final _P _product) {
            _product.monitoredItems = this.monitoredItems;
            _product.diagnosticInfos = this.diagnosticInfos;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItems" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param monitoredItems
         *     Neuer Wert der Eigenschaft "monitoredItems".
         */
        public DataChangeNotification.Builder<_B> withMonitoredItems(final JAXBElement<ListOfMonitoredItemNotification> monitoredItems) {
            this.monitoredItems = monitoredItems;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticInfos" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param diagnosticInfos
         *     Neuer Wert der Eigenschaft "diagnosticInfos".
         */
        public DataChangeNotification.Builder<_B> withDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> diagnosticInfos) {
            this.diagnosticInfos = diagnosticInfos;
            return this;
        }

        @Override
        public DataChangeNotification build() {
            if (_storedValue == null) {
                return this.init(new DataChangeNotification());
            } else {
                return ((DataChangeNotification) _storedValue);
            }
        }

        public DataChangeNotification.Builder<_B> copyOf(final DataChangeNotification _other) {
            _other.copyTo(this);
            return this;
        }

        public DataChangeNotification.Builder<_B> copyOf(final DataChangeNotification.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataChangeNotification.Selector<DataChangeNotification.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataChangeNotification.Select _root() {
            return new DataChangeNotification.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NotificationData.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataChangeNotification.Selector<TRoot, TParent>> monitoredItems = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataChangeNotification.Selector<TRoot, TParent>> diagnosticInfos = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.monitoredItems!= null) {
                products.put("monitoredItems", this.monitoredItems.init());
            }
            if (this.diagnosticInfos!= null) {
                products.put("diagnosticInfos", this.diagnosticInfos.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataChangeNotification.Selector<TRoot, TParent>> monitoredItems() {
            return ((this.monitoredItems == null)?this.monitoredItems = new com.kscs.util.jaxb.Selector<TRoot, DataChangeNotification.Selector<TRoot, TParent>>(this._root, this, "monitoredItems"):this.monitoredItems);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataChangeNotification.Selector<TRoot, TParent>> diagnosticInfos() {
            return ((this.diagnosticInfos == null)?this.diagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, DataChangeNotification.Selector<TRoot, TParent>>(this._root, this, "diagnosticInfos"):this.diagnosticInfos);
        }

    }

}
