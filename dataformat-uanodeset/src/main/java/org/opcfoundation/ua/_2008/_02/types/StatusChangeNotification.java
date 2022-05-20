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
 * <p>Java-Klasse für StatusChangeNotification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StatusChangeNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NotificationData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticInfo" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusChangeNotification", propOrder = {
    "status",
    "diagnosticInfo"
})
public class StatusChangeNotification
    extends NotificationData
{

    @XmlElement(name = "Status")
    protected StatusCode status;
    @XmlElementRef(name = "DiagnosticInfo", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DiagnosticInfo> diagnosticInfo;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatus(StatusCode value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der diagnosticInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<DiagnosticInfo> getDiagnosticInfo() {
        return diagnosticInfo;
    }

    /**
     * Legt den Wert der diagnosticInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiagnosticInfo }{@code >}
     *     
     */
    public void setDiagnosticInfo(JAXBElement<DiagnosticInfo> value) {
        this.diagnosticInfo = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final StatusChangeNotification.Builder<_B> _other) {
        super.copyTo(_other);
        _other.status = ((this.status == null)?null:this.status.newCopyBuilder(_other));
        _other.diagnosticInfo = this.diagnosticInfo;
    }

    @Override
    public<_B >StatusChangeNotification.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new StatusChangeNotification.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public StatusChangeNotification.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static StatusChangeNotification.Builder<Void> builder() {
        return new StatusChangeNotification.Builder<Void>(null, null, false);
    }

    public static<_B >StatusChangeNotification.Builder<_B> copyOf(final NotificationData _other) {
        final StatusChangeNotification.Builder<_B> _newBuilder = new StatusChangeNotification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >StatusChangeNotification.Builder<_B> copyOf(final StatusChangeNotification _other) {
        final StatusChangeNotification.Builder<_B> _newBuilder = new StatusChangeNotification.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final StatusChangeNotification.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree statusPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("status"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusPropertyTree!= null):((statusPropertyTree == null)||(!statusPropertyTree.isLeaf())))) {
            _other.status = ((this.status == null)?null:this.status.newCopyBuilder(_other, statusPropertyTree, _propertyTreeUse));
        }
        final PropertyTree diagnosticInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfo"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfoPropertyTree!= null):((diagnosticInfoPropertyTree == null)||(!diagnosticInfoPropertyTree.isLeaf())))) {
            _other.diagnosticInfo = this.diagnosticInfo;
        }
    }

    @Override
    public<_B >StatusChangeNotification.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new StatusChangeNotification.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public StatusChangeNotification.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >StatusChangeNotification.Builder<_B> copyOf(final NotificationData _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final StatusChangeNotification.Builder<_B> _newBuilder = new StatusChangeNotification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >StatusChangeNotification.Builder<_B> copyOf(final StatusChangeNotification _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final StatusChangeNotification.Builder<_B> _newBuilder = new StatusChangeNotification.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static StatusChangeNotification.Builder<Void> copyExcept(final NotificationData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static StatusChangeNotification.Builder<Void> copyExcept(final StatusChangeNotification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static StatusChangeNotification.Builder<Void> copyOnly(final NotificationData _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static StatusChangeNotification.Builder<Void> copyOnly(final StatusChangeNotification _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NotificationData.Builder<_B>
        implements Buildable
    {

        private StatusCode.Builder<StatusChangeNotification.Builder<_B>> status;
        private JAXBElement<DiagnosticInfo> diagnosticInfo;

        public Builder(final _B _parentBuilder, final StatusChangeNotification _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.status = ((_other.status == null)?null:_other.status.newCopyBuilder(this));
                this.diagnosticInfo = _other.diagnosticInfo;
            }
        }

        public Builder(final _B _parentBuilder, final StatusChangeNotification _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree statusPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("status"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statusPropertyTree!= null):((statusPropertyTree == null)||(!statusPropertyTree.isLeaf())))) {
                    this.status = ((_other.status == null)?null:_other.status.newCopyBuilder(this, statusPropertyTree, _propertyTreeUse));
                }
                final PropertyTree diagnosticInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("diagnosticInfo"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(diagnosticInfoPropertyTree!= null):((diagnosticInfoPropertyTree == null)||(!diagnosticInfoPropertyTree.isLeaf())))) {
                    this.diagnosticInfo = _other.diagnosticInfo;
                }
            }
        }

        protected<_P extends StatusChangeNotification >_P init(final _P _product) {
            _product.status = ((this.status == null)?null:this.status.build());
            _product.diagnosticInfo = this.diagnosticInfo;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "status" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param status
         *     Neuer Wert der Eigenschaft "status".
         */
        public StatusChangeNotification.Builder<_B> withStatus(final StatusCode status) {
            this.status = ((status == null)?null:new StatusCode.Builder<StatusChangeNotification.Builder<_B>>(this, status, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "status".
         * Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "status".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.StatusCode.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public StatusCode.Builder<? extends StatusChangeNotification.Builder<_B>> withStatus() {
            if (this.status!= null) {
                return this.status;
            }
            return this.status = new StatusCode.Builder<StatusChangeNotification.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "diagnosticInfo" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param diagnosticInfo
         *     Neuer Wert der Eigenschaft "diagnosticInfo".
         */
        public StatusChangeNotification.Builder<_B> withDiagnosticInfo(final JAXBElement<DiagnosticInfo> diagnosticInfo) {
            this.diagnosticInfo = diagnosticInfo;
            return this;
        }

        @Override
        public StatusChangeNotification build() {
            if (_storedValue == null) {
                return this.init(new StatusChangeNotification());
            } else {
                return ((StatusChangeNotification) _storedValue);
            }
        }

        public StatusChangeNotification.Builder<_B> copyOf(final StatusChangeNotification _other) {
            _other.copyTo(this);
            return this;
        }

        public StatusChangeNotification.Builder<_B> copyOf(final StatusChangeNotification.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends StatusChangeNotification.Selector<StatusChangeNotification.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static StatusChangeNotification.Select _root() {
            return new StatusChangeNotification.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NotificationData.Selector<TRoot, TParent>
    {

        private StatusCode.Selector<TRoot, StatusChangeNotification.Selector<TRoot, TParent>> status = null;
        private com.kscs.util.jaxb.Selector<TRoot, StatusChangeNotification.Selector<TRoot, TParent>> diagnosticInfo = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.status!= null) {
                products.put("status", this.status.init());
            }
            if (this.diagnosticInfo!= null) {
                products.put("diagnosticInfo", this.diagnosticInfo.init());
            }
            return products;
        }

        public StatusCode.Selector<TRoot, StatusChangeNotification.Selector<TRoot, TParent>> status() {
            return ((this.status == null)?this.status = new StatusCode.Selector<TRoot, StatusChangeNotification.Selector<TRoot, TParent>>(this._root, this, "status"):this.status);
        }

        public com.kscs.util.jaxb.Selector<TRoot, StatusChangeNotification.Selector<TRoot, TParent>> diagnosticInfo() {
            return ((this.diagnosticInfo == null)?this.diagnosticInfo = new com.kscs.util.jaxb.Selector<TRoot, StatusChangeNotification.Selector<TRoot, TParent>>(this._root, this, "diagnosticInfo"):this.diagnosticInfo);
        }

    }

}
