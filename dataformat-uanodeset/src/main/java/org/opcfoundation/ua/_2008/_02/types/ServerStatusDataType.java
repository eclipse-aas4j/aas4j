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
import javax.xml.datatype.XMLGregorianCalendar;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ServerStatusDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServerStatusDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServerState" minOccurs="0"/&gt;
 *         &lt;element name="BuildInfo" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}BuildInfo" minOccurs="0"/&gt;
 *         &lt;element name="SecondsTillShutdown" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ShutdownReason" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}LocalizedText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerStatusDataType", propOrder = {
    "startTime",
    "currentTime",
    "state",
    "buildInfo",
    "secondsTillShutdown",
    "shutdownReason"
})
public class ServerStatusDataType {

    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "CurrentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentTime;
    @XmlElement(name = "State")
    @XmlSchemaType(name = "string")
    protected ServerState state;
    @XmlElementRef(name = "BuildInfo", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BuildInfo> buildInfo;
    @XmlElement(name = "SecondsTillShutdown")
    @XmlSchemaType(name = "unsignedInt")
    protected Long secondsTillShutdown;
    @XmlElementRef(name = "ShutdownReason", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalizedText> shutdownReason;

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
     * Ruft den Wert der currentTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentTime() {
        return currentTime;
    }

    /**
     * Legt den Wert der currentTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentTime(XMLGregorianCalendar value) {
        this.currentTime = value;
    }

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServerState }
     *     
     */
    public ServerState getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerState }
     *     
     */
    public void setState(ServerState value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der buildInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildInfo }{@code >}
     *     
     */
    public JAXBElement<BuildInfo> getBuildInfo() {
        return buildInfo;
    }

    /**
     * Legt den Wert der buildInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildInfo }{@code >}
     *     
     */
    public void setBuildInfo(JAXBElement<BuildInfo> value) {
        this.buildInfo = value;
    }

    /**
     * Ruft den Wert der secondsTillShutdown-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecondsTillShutdown() {
        return secondsTillShutdown;
    }

    /**
     * Legt den Wert der secondsTillShutdown-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecondsTillShutdown(Long value) {
        this.secondsTillShutdown = value;
    }

    /**
     * Ruft den Wert der shutdownReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public JAXBElement<LocalizedText> getShutdownReason() {
        return shutdownReason;
    }

    /**
     * Legt den Wert der shutdownReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalizedText }{@code >}
     *     
     */
    public void setShutdownReason(JAXBElement<LocalizedText> value) {
        this.shutdownReason = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ServerStatusDataType.Builder<_B> _other) {
        _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        _other.currentTime = ((this.currentTime == null)?null:((XMLGregorianCalendar) this.currentTime.clone()));
        _other.state = this.state;
        _other.buildInfo = this.buildInfo;
        _other.secondsTillShutdown = this.secondsTillShutdown;
        _other.shutdownReason = this.shutdownReason;
    }

    public<_B >ServerStatusDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ServerStatusDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ServerStatusDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ServerStatusDataType.Builder<Void> builder() {
        return new ServerStatusDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ServerStatusDataType.Builder<_B> copyOf(final ServerStatusDataType _other) {
        final ServerStatusDataType.Builder<_B> _newBuilder = new ServerStatusDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ServerStatusDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
            _other.startTime = ((this.startTime == null)?null:((XMLGregorianCalendar) this.startTime.clone()));
        }
        final PropertyTree currentTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentTimePropertyTree!= null):((currentTimePropertyTree == null)||(!currentTimePropertyTree.isLeaf())))) {
            _other.currentTime = ((this.currentTime == null)?null:((XMLGregorianCalendar) this.currentTime.clone()));
        }
        final PropertyTree statePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("state"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statePropertyTree!= null):((statePropertyTree == null)||(!statePropertyTree.isLeaf())))) {
            _other.state = this.state;
        }
        final PropertyTree buildInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("buildInfo"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(buildInfoPropertyTree!= null):((buildInfoPropertyTree == null)||(!buildInfoPropertyTree.isLeaf())))) {
            _other.buildInfo = this.buildInfo;
        }
        final PropertyTree secondsTillShutdownPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("secondsTillShutdown"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(secondsTillShutdownPropertyTree!= null):((secondsTillShutdownPropertyTree == null)||(!secondsTillShutdownPropertyTree.isLeaf())))) {
            _other.secondsTillShutdown = this.secondsTillShutdown;
        }
        final PropertyTree shutdownReasonPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shutdownReason"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shutdownReasonPropertyTree!= null):((shutdownReasonPropertyTree == null)||(!shutdownReasonPropertyTree.isLeaf())))) {
            _other.shutdownReason = this.shutdownReason;
        }
    }

    public<_B >ServerStatusDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ServerStatusDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ServerStatusDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ServerStatusDataType.Builder<_B> copyOf(final ServerStatusDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ServerStatusDataType.Builder<_B> _newBuilder = new ServerStatusDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ServerStatusDataType.Builder<Void> copyExcept(final ServerStatusDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ServerStatusDataType.Builder<Void> copyOnly(final ServerStatusDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ServerStatusDataType _storedValue;
        private XMLGregorianCalendar startTime;
        private XMLGregorianCalendar currentTime;
        private ServerState state;
        private JAXBElement<BuildInfo> buildInfo;
        private Long secondsTillShutdown;
        private JAXBElement<LocalizedText> shutdownReason;

        public Builder(final _B _parentBuilder, final ServerStatusDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                    this.currentTime = ((_other.currentTime == null)?null:((XMLGregorianCalendar) _other.currentTime.clone()));
                    this.state = _other.state;
                    this.buildInfo = _other.buildInfo;
                    this.secondsTillShutdown = _other.secondsTillShutdown;
                    this.shutdownReason = _other.shutdownReason;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ServerStatusDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree startTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("startTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(startTimePropertyTree!= null):((startTimePropertyTree == null)||(!startTimePropertyTree.isLeaf())))) {
                        this.startTime = ((_other.startTime == null)?null:((XMLGregorianCalendar) _other.startTime.clone()));
                    }
                    final PropertyTree currentTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentTimePropertyTree!= null):((currentTimePropertyTree == null)||(!currentTimePropertyTree.isLeaf())))) {
                        this.currentTime = ((_other.currentTime == null)?null:((XMLGregorianCalendar) _other.currentTime.clone()));
                    }
                    final PropertyTree statePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("state"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(statePropertyTree!= null):((statePropertyTree == null)||(!statePropertyTree.isLeaf())))) {
                        this.state = _other.state;
                    }
                    final PropertyTree buildInfoPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("buildInfo"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(buildInfoPropertyTree!= null):((buildInfoPropertyTree == null)||(!buildInfoPropertyTree.isLeaf())))) {
                        this.buildInfo = _other.buildInfo;
                    }
                    final PropertyTree secondsTillShutdownPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("secondsTillShutdown"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(secondsTillShutdownPropertyTree!= null):((secondsTillShutdownPropertyTree == null)||(!secondsTillShutdownPropertyTree.isLeaf())))) {
                        this.secondsTillShutdown = _other.secondsTillShutdown;
                    }
                    final PropertyTree shutdownReasonPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("shutdownReason"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(shutdownReasonPropertyTree!= null):((shutdownReasonPropertyTree == null)||(!shutdownReasonPropertyTree.isLeaf())))) {
                        this.shutdownReason = _other.shutdownReason;
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

        protected<_P extends ServerStatusDataType >_P init(final _P _product) {
            _product.startTime = this.startTime;
            _product.currentTime = this.currentTime;
            _product.state = this.state;
            _product.buildInfo = this.buildInfo;
            _product.secondsTillShutdown = this.secondsTillShutdown;
            _product.shutdownReason = this.shutdownReason;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "startTime" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param startTime
         *     Neuer Wert der Eigenschaft "startTime".
         */
        public ServerStatusDataType.Builder<_B> withStartTime(final XMLGregorianCalendar startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currentTime" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param currentTime
         *     Neuer Wert der Eigenschaft "currentTime".
         */
        public ServerStatusDataType.Builder<_B> withCurrentTime(final XMLGregorianCalendar currentTime) {
            this.currentTime = currentTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "state" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param state
         *     Neuer Wert der Eigenschaft "state".
         */
        public ServerStatusDataType.Builder<_B> withState(final ServerState state) {
            this.state = state;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "buildInfo" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param buildInfo
         *     Neuer Wert der Eigenschaft "buildInfo".
         */
        public ServerStatusDataType.Builder<_B> withBuildInfo(final JAXBElement<BuildInfo> buildInfo) {
            this.buildInfo = buildInfo;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "secondsTillShutdown" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param secondsTillShutdown
         *     Neuer Wert der Eigenschaft "secondsTillShutdown".
         */
        public ServerStatusDataType.Builder<_B> withSecondsTillShutdown(final Long secondsTillShutdown) {
            this.secondsTillShutdown = secondsTillShutdown;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "shutdownReason" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param shutdownReason
         *     Neuer Wert der Eigenschaft "shutdownReason".
         */
        public ServerStatusDataType.Builder<_B> withShutdownReason(final JAXBElement<LocalizedText> shutdownReason) {
            this.shutdownReason = shutdownReason;
            return this;
        }

        @Override
        public ServerStatusDataType build() {
            if (_storedValue == null) {
                return this.init(new ServerStatusDataType());
            } else {
                return ((ServerStatusDataType) _storedValue);
            }
        }

        public ServerStatusDataType.Builder<_B> copyOf(final ServerStatusDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ServerStatusDataType.Builder<_B> copyOf(final ServerStatusDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ServerStatusDataType.Selector<ServerStatusDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ServerStatusDataType.Select _root() {
            return new ServerStatusDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> startTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> currentTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> state = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> buildInfo = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> secondsTillShutdown = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> shutdownReason = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.startTime!= null) {
                products.put("startTime", this.startTime.init());
            }
            if (this.currentTime!= null) {
                products.put("currentTime", this.currentTime.init());
            }
            if (this.state!= null) {
                products.put("state", this.state.init());
            }
            if (this.buildInfo!= null) {
                products.put("buildInfo", this.buildInfo.init());
            }
            if (this.secondsTillShutdown!= null) {
                products.put("secondsTillShutdown", this.secondsTillShutdown.init());
            }
            if (this.shutdownReason!= null) {
                products.put("shutdownReason", this.shutdownReason.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> startTime() {
            return ((this.startTime == null)?this.startTime = new com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>>(this._root, this, "startTime"):this.startTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> currentTime() {
            return ((this.currentTime == null)?this.currentTime = new com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>>(this._root, this, "currentTime"):this.currentTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> state() {
            return ((this.state == null)?this.state = new com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>>(this._root, this, "state"):this.state);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> buildInfo() {
            return ((this.buildInfo == null)?this.buildInfo = new com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>>(this._root, this, "buildInfo"):this.buildInfo);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> secondsTillShutdown() {
            return ((this.secondsTillShutdown == null)?this.secondsTillShutdown = new com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>>(this._root, this, "secondsTillShutdown"):this.secondsTillShutdown);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>> shutdownReason() {
            return ((this.shutdownReason == null)?this.shutdownReason = new com.kscs.util.jaxb.Selector<TRoot, ServerStatusDataType.Selector<TRoot, TParent>>(this._root, this, "shutdownReason"):this.shutdownReason);
        }

    }

}
