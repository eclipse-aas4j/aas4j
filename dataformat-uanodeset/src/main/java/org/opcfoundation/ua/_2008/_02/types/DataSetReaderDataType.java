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
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für DataSetReaderDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataSetReaderDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PublisherId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Variant" minOccurs="0"/&gt;
 *         &lt;element name="WriterGroupId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="DataSetWriterId" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/&gt;
 *         &lt;element name="DataSetMetaData" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetMetaDataType" minOccurs="0"/&gt;
 *         &lt;element name="DataSetFieldContentMask" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}DataSetFieldContentMask" minOccurs="0"/&gt;
 *         &lt;element name="MessageReceiveTimeout" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="KeyFrameCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="HeaderLayoutUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityMode" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}MessageSecurityMode" minOccurs="0"/&gt;
 *         &lt;element name="SecurityGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecurityKeyServices" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfEndpointDescription" minOccurs="0"/&gt;
 *         &lt;element name="DataSetReaderProperties" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfKeyValuePair" minOccurs="0"/&gt;
 *         &lt;element name="TransportSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="MessageSettings" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *         &lt;element name="SubscribedDataSet" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetReaderDataType", propOrder = {
    "name",
    "enabled",
    "publisherId",
    "writerGroupId",
    "dataSetWriterId",
    "dataSetMetaData",
    "dataSetFieldContentMask",
    "messageReceiveTimeout",
    "keyFrameCount",
    "headerLayoutUri",
    "securityMode",
    "securityGroupId",
    "securityKeyServices",
    "dataSetReaderProperties",
    "transportSettings",
    "messageSettings",
    "subscribedDataSet"
})
public class DataSetReaderDataType {

    @XmlElementRef(name = "Name", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "PublisherId")
    protected Variant publisherId;
    @XmlElement(name = "WriterGroupId")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer writerGroupId;
    @XmlElement(name = "DataSetWriterId")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dataSetWriterId;
    @XmlElementRef(name = "DataSetMetaData", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<DataSetMetaDataType> dataSetMetaData;
    @XmlElement(name = "DataSetFieldContentMask")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dataSetFieldContentMask;
    @XmlElement(name = "MessageReceiveTimeout")
    protected Double messageReceiveTimeout;
    @XmlElement(name = "KeyFrameCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long keyFrameCount;
    @XmlElementRef(name = "HeaderLayoutUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> headerLayoutUri;
    @XmlElement(name = "SecurityMode")
    @XmlSchemaType(name = "string")
    protected MessageSecurityMode securityMode;
    @XmlElementRef(name = "SecurityGroupId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> securityGroupId;
    @XmlElementRef(name = "SecurityKeyServices", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfEndpointDescription> securityKeyServices;
    @XmlElementRef(name = "DataSetReaderProperties", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfKeyValuePair> dataSetReaderProperties;
    @XmlElementRef(name = "TransportSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> transportSettings;
    @XmlElementRef(name = "MessageSettings", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> messageSettings;
    @XmlElementRef(name = "SubscribedDataSet", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtensionObject> subscribedDataSet;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der enabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Legt den Wert der enabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Ruft den Wert der publisherId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Variant }
     *     
     */
    public Variant getPublisherId() {
        return publisherId;
    }

    /**
     * Legt den Wert der publisherId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Variant }
     *     
     */
    public void setPublisherId(Variant value) {
        this.publisherId = value;
    }

    /**
     * Ruft den Wert der writerGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWriterGroupId() {
        return writerGroupId;
    }

    /**
     * Legt den Wert der writerGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWriterGroupId(Integer value) {
        this.writerGroupId = value;
    }

    /**
     * Ruft den Wert der dataSetWriterId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataSetWriterId() {
        return dataSetWriterId;
    }

    /**
     * Legt den Wert der dataSetWriterId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataSetWriterId(Integer value) {
        this.dataSetWriterId = value;
    }

    /**
     * Ruft den Wert der dataSetMetaData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataSetMetaDataType }{@code >}
     *     
     */
    public JAXBElement<DataSetMetaDataType> getDataSetMetaData() {
        return dataSetMetaData;
    }

    /**
     * Legt den Wert der dataSetMetaData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataSetMetaDataType }{@code >}
     *     
     */
    public void setDataSetMetaData(JAXBElement<DataSetMetaDataType> value) {
        this.dataSetMetaData = value;
    }

    /**
     * Ruft den Wert der dataSetFieldContentMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDataSetFieldContentMask() {
        return dataSetFieldContentMask;
    }

    /**
     * Legt den Wert der dataSetFieldContentMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDataSetFieldContentMask(Long value) {
        this.dataSetFieldContentMask = value;
    }

    /**
     * Ruft den Wert der messageReceiveTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMessageReceiveTimeout() {
        return messageReceiveTimeout;
    }

    /**
     * Legt den Wert der messageReceiveTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMessageReceiveTimeout(Double value) {
        this.messageReceiveTimeout = value;
    }

    /**
     * Ruft den Wert der keyFrameCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeyFrameCount() {
        return keyFrameCount;
    }

    /**
     * Legt den Wert der keyFrameCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeyFrameCount(Long value) {
        this.keyFrameCount = value;
    }

    /**
     * Ruft den Wert der headerLayoutUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHeaderLayoutUri() {
        return headerLayoutUri;
    }

    /**
     * Legt den Wert der headerLayoutUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHeaderLayoutUri(JAXBElement<String> value) {
        this.headerLayoutUri = value;
    }

    /**
     * Ruft den Wert der securityMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageSecurityMode }
     *     
     */
    public MessageSecurityMode getSecurityMode() {
        return securityMode;
    }

    /**
     * Legt den Wert der securityMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSecurityMode }
     *     
     */
    public void setSecurityMode(MessageSecurityMode value) {
        this.securityMode = value;
    }

    /**
     * Ruft den Wert der securityGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecurityGroupId() {
        return securityGroupId;
    }

    /**
     * Legt den Wert der securityGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecurityGroupId(JAXBElement<String> value) {
        this.securityGroupId = value;
    }

    /**
     * Ruft den Wert der securityKeyServices-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointDescription }{@code >}
     *     
     */
    public JAXBElement<ListOfEndpointDescription> getSecurityKeyServices() {
        return securityKeyServices;
    }

    /**
     * Legt den Wert der securityKeyServices-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfEndpointDescription }{@code >}
     *     
     */
    public void setSecurityKeyServices(JAXBElement<ListOfEndpointDescription> value) {
        this.securityKeyServices = value;
    }

    /**
     * Ruft den Wert der dataSetReaderProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public JAXBElement<ListOfKeyValuePair> getDataSetReaderProperties() {
        return dataSetReaderProperties;
    }

    /**
     * Legt den Wert der dataSetReaderProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfKeyValuePair }{@code >}
     *     
     */
    public void setDataSetReaderProperties(JAXBElement<ListOfKeyValuePair> value) {
        this.dataSetReaderProperties = value;
    }

    /**
     * Ruft den Wert der transportSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getTransportSettings() {
        return transportSettings;
    }

    /**
     * Legt den Wert der transportSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setTransportSettings(JAXBElement<ExtensionObject> value) {
        this.transportSettings = value;
    }

    /**
     * Ruft den Wert der messageSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getMessageSettings() {
        return messageSettings;
    }

    /**
     * Legt den Wert der messageSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setMessageSettings(JAXBElement<ExtensionObject> value) {
        this.messageSettings = value;
    }

    /**
     * Ruft den Wert der subscribedDataSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public JAXBElement<ExtensionObject> getSubscribedDataSet() {
        return subscribedDataSet;
    }

    /**
     * Legt den Wert der subscribedDataSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtensionObject }{@code >}
     *     
     */
    public void setSubscribedDataSet(JAXBElement<ExtensionObject> value) {
        this.subscribedDataSet = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final DataSetReaderDataType.Builder<_B> _other) {
        _other.name = this.name;
        _other.enabled = this.enabled;
        _other.publisherId = ((this.publisherId == null)?null:this.publisherId.newCopyBuilder(_other));
        _other.writerGroupId = this.writerGroupId;
        _other.dataSetWriterId = this.dataSetWriterId;
        _other.dataSetMetaData = this.dataSetMetaData;
        _other.dataSetFieldContentMask = this.dataSetFieldContentMask;
        _other.messageReceiveTimeout = this.messageReceiveTimeout;
        _other.keyFrameCount = this.keyFrameCount;
        _other.headerLayoutUri = this.headerLayoutUri;
        _other.securityMode = this.securityMode;
        _other.securityGroupId = this.securityGroupId;
        _other.securityKeyServices = this.securityKeyServices;
        _other.dataSetReaderProperties = this.dataSetReaderProperties;
        _other.transportSettings = this.transportSettings;
        _other.messageSettings = this.messageSettings;
        _other.subscribedDataSet = this.subscribedDataSet;
    }

    public<_B >DataSetReaderDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new DataSetReaderDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public DataSetReaderDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static DataSetReaderDataType.Builder<Void> builder() {
        return new DataSetReaderDataType.Builder<Void>(null, null, false);
    }

    public static<_B >DataSetReaderDataType.Builder<_B> copyOf(final DataSetReaderDataType _other) {
        final DataSetReaderDataType.Builder<_B> _newBuilder = new DataSetReaderDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final DataSetReaderDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
            _other.name = this.name;
        }
        final PropertyTree enabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enabled"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enabledPropertyTree!= null):((enabledPropertyTree == null)||(!enabledPropertyTree.isLeaf())))) {
            _other.enabled = this.enabled;
        }
        final PropertyTree publisherIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publisherId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publisherIdPropertyTree!= null):((publisherIdPropertyTree == null)||(!publisherIdPropertyTree.isLeaf())))) {
            _other.publisherId = ((this.publisherId == null)?null:this.publisherId.newCopyBuilder(_other, publisherIdPropertyTree, _propertyTreeUse));
        }
        final PropertyTree writerGroupIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupIdPropertyTree!= null):((writerGroupIdPropertyTree == null)||(!writerGroupIdPropertyTree.isLeaf())))) {
            _other.writerGroupId = this.writerGroupId;
        }
        final PropertyTree dataSetWriterIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterIdPropertyTree!= null):((dataSetWriterIdPropertyTree == null)||(!dataSetWriterIdPropertyTree.isLeaf())))) {
            _other.dataSetWriterId = this.dataSetWriterId;
        }
        final PropertyTree dataSetMetaDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMetaData"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMetaDataPropertyTree!= null):((dataSetMetaDataPropertyTree == null)||(!dataSetMetaDataPropertyTree.isLeaf())))) {
            _other.dataSetMetaData = this.dataSetMetaData;
        }
        final PropertyTree dataSetFieldContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFieldContentMask"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFieldContentMaskPropertyTree!= null):((dataSetFieldContentMaskPropertyTree == null)||(!dataSetFieldContentMaskPropertyTree.isLeaf())))) {
            _other.dataSetFieldContentMask = this.dataSetFieldContentMask;
        }
        final PropertyTree messageReceiveTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageReceiveTimeout"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageReceiveTimeoutPropertyTree!= null):((messageReceiveTimeoutPropertyTree == null)||(!messageReceiveTimeoutPropertyTree.isLeaf())))) {
            _other.messageReceiveTimeout = this.messageReceiveTimeout;
        }
        final PropertyTree keyFrameCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("keyFrameCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keyFrameCountPropertyTree!= null):((keyFrameCountPropertyTree == null)||(!keyFrameCountPropertyTree.isLeaf())))) {
            _other.keyFrameCount = this.keyFrameCount;
        }
        final PropertyTree headerLayoutUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("headerLayoutUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(headerLayoutUriPropertyTree!= null):((headerLayoutUriPropertyTree == null)||(!headerLayoutUriPropertyTree.isLeaf())))) {
            _other.headerLayoutUri = this.headerLayoutUri;
        }
        final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
            _other.securityMode = this.securityMode;
        }
        final PropertyTree securityGroupIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityGroupId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityGroupIdPropertyTree!= null):((securityGroupIdPropertyTree == null)||(!securityGroupIdPropertyTree.isLeaf())))) {
            _other.securityGroupId = this.securityGroupId;
        }
        final PropertyTree securityKeyServicesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityKeyServices"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityKeyServicesPropertyTree!= null):((securityKeyServicesPropertyTree == null)||(!securityKeyServicesPropertyTree.isLeaf())))) {
            _other.securityKeyServices = this.securityKeyServices;
        }
        final PropertyTree dataSetReaderPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaderProperties"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReaderPropertiesPropertyTree!= null):((dataSetReaderPropertiesPropertyTree == null)||(!dataSetReaderPropertiesPropertyTree.isLeaf())))) {
            _other.dataSetReaderProperties = this.dataSetReaderProperties;
        }
        final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
            _other.transportSettings = this.transportSettings;
        }
        final PropertyTree messageSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageSettings"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageSettingsPropertyTree!= null):((messageSettingsPropertyTree == null)||(!messageSettingsPropertyTree.isLeaf())))) {
            _other.messageSettings = this.messageSettings;
        }
        final PropertyTree subscribedDataSetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscribedDataSet"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscribedDataSetPropertyTree!= null):((subscribedDataSetPropertyTree == null)||(!subscribedDataSetPropertyTree.isLeaf())))) {
            _other.subscribedDataSet = this.subscribedDataSet;
        }
    }

    public<_B >DataSetReaderDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new DataSetReaderDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public DataSetReaderDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >DataSetReaderDataType.Builder<_B> copyOf(final DataSetReaderDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final DataSetReaderDataType.Builder<_B> _newBuilder = new DataSetReaderDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static DataSetReaderDataType.Builder<Void> copyExcept(final DataSetReaderDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static DataSetReaderDataType.Builder<Void> copyOnly(final DataSetReaderDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final DataSetReaderDataType _storedValue;
        private JAXBElement<String> name;
        private Boolean enabled;
        private Variant.Builder<DataSetReaderDataType.Builder<_B>> publisherId;
        private Integer writerGroupId;
        private Integer dataSetWriterId;
        private JAXBElement<DataSetMetaDataType> dataSetMetaData;
        private Long dataSetFieldContentMask;
        private Double messageReceiveTimeout;
        private Long keyFrameCount;
        private JAXBElement<String> headerLayoutUri;
        private MessageSecurityMode securityMode;
        private JAXBElement<String> securityGroupId;
        private JAXBElement<ListOfEndpointDescription> securityKeyServices;
        private JAXBElement<ListOfKeyValuePair> dataSetReaderProperties;
        private JAXBElement<ExtensionObject> transportSettings;
        private JAXBElement<ExtensionObject> messageSettings;
        private JAXBElement<ExtensionObject> subscribedDataSet;

        public Builder(final _B _parentBuilder, final DataSetReaderDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.name = _other.name;
                    this.enabled = _other.enabled;
                    this.publisherId = ((_other.publisherId == null)?null:_other.publisherId.newCopyBuilder(this));
                    this.writerGroupId = _other.writerGroupId;
                    this.dataSetWriterId = _other.dataSetWriterId;
                    this.dataSetMetaData = _other.dataSetMetaData;
                    this.dataSetFieldContentMask = _other.dataSetFieldContentMask;
                    this.messageReceiveTimeout = _other.messageReceiveTimeout;
                    this.keyFrameCount = _other.keyFrameCount;
                    this.headerLayoutUri = _other.headerLayoutUri;
                    this.securityMode = _other.securityMode;
                    this.securityGroupId = _other.securityGroupId;
                    this.securityKeyServices = _other.securityKeyServices;
                    this.dataSetReaderProperties = _other.dataSetReaderProperties;
                    this.transportSettings = _other.transportSettings;
                    this.messageSettings = _other.messageSettings;
                    this.subscribedDataSet = _other.subscribedDataSet;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final DataSetReaderDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree namePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("name"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(namePropertyTree!= null):((namePropertyTree == null)||(!namePropertyTree.isLeaf())))) {
                        this.name = _other.name;
                    }
                    final PropertyTree enabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enabled"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enabledPropertyTree!= null):((enabledPropertyTree == null)||(!enabledPropertyTree.isLeaf())))) {
                        this.enabled = _other.enabled;
                    }
                    final PropertyTree publisherIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publisherId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publisherIdPropertyTree!= null):((publisherIdPropertyTree == null)||(!publisherIdPropertyTree.isLeaf())))) {
                        this.publisherId = ((_other.publisherId == null)?null:_other.publisherId.newCopyBuilder(this, publisherIdPropertyTree, _propertyTreeUse));
                    }
                    final PropertyTree writerGroupIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writerGroupId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writerGroupIdPropertyTree!= null):((writerGroupIdPropertyTree == null)||(!writerGroupIdPropertyTree.isLeaf())))) {
                        this.writerGroupId = _other.writerGroupId;
                    }
                    final PropertyTree dataSetWriterIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetWriterId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetWriterIdPropertyTree!= null):((dataSetWriterIdPropertyTree == null)||(!dataSetWriterIdPropertyTree.isLeaf())))) {
                        this.dataSetWriterId = _other.dataSetWriterId;
                    }
                    final PropertyTree dataSetMetaDataPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetMetaData"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetMetaDataPropertyTree!= null):((dataSetMetaDataPropertyTree == null)||(!dataSetMetaDataPropertyTree.isLeaf())))) {
                        this.dataSetMetaData = _other.dataSetMetaData;
                    }
                    final PropertyTree dataSetFieldContentMaskPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetFieldContentMask"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetFieldContentMaskPropertyTree!= null):((dataSetFieldContentMaskPropertyTree == null)||(!dataSetFieldContentMaskPropertyTree.isLeaf())))) {
                        this.dataSetFieldContentMask = _other.dataSetFieldContentMask;
                    }
                    final PropertyTree messageReceiveTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageReceiveTimeout"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageReceiveTimeoutPropertyTree!= null):((messageReceiveTimeoutPropertyTree == null)||(!messageReceiveTimeoutPropertyTree.isLeaf())))) {
                        this.messageReceiveTimeout = _other.messageReceiveTimeout;
                    }
                    final PropertyTree keyFrameCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("keyFrameCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(keyFrameCountPropertyTree!= null):((keyFrameCountPropertyTree == null)||(!keyFrameCountPropertyTree.isLeaf())))) {
                        this.keyFrameCount = _other.keyFrameCount;
                    }
                    final PropertyTree headerLayoutUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("headerLayoutUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(headerLayoutUriPropertyTree!= null):((headerLayoutUriPropertyTree == null)||(!headerLayoutUriPropertyTree.isLeaf())))) {
                        this.headerLayoutUri = _other.headerLayoutUri;
                    }
                    final PropertyTree securityModePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityMode"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityModePropertyTree!= null):((securityModePropertyTree == null)||(!securityModePropertyTree.isLeaf())))) {
                        this.securityMode = _other.securityMode;
                    }
                    final PropertyTree securityGroupIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityGroupId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityGroupIdPropertyTree!= null):((securityGroupIdPropertyTree == null)||(!securityGroupIdPropertyTree.isLeaf())))) {
                        this.securityGroupId = _other.securityGroupId;
                    }
                    final PropertyTree securityKeyServicesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityKeyServices"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityKeyServicesPropertyTree!= null):((securityKeyServicesPropertyTree == null)||(!securityKeyServicesPropertyTree.isLeaf())))) {
                        this.securityKeyServices = _other.securityKeyServices;
                    }
                    final PropertyTree dataSetReaderPropertiesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataSetReaderProperties"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataSetReaderPropertiesPropertyTree!= null):((dataSetReaderPropertiesPropertyTree == null)||(!dataSetReaderPropertiesPropertyTree.isLeaf())))) {
                        this.dataSetReaderProperties = _other.dataSetReaderProperties;
                    }
                    final PropertyTree transportSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transportSettings"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transportSettingsPropertyTree!= null):((transportSettingsPropertyTree == null)||(!transportSettingsPropertyTree.isLeaf())))) {
                        this.transportSettings = _other.transportSettings;
                    }
                    final PropertyTree messageSettingsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("messageSettings"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(messageSettingsPropertyTree!= null):((messageSettingsPropertyTree == null)||(!messageSettingsPropertyTree.isLeaf())))) {
                        this.messageSettings = _other.messageSettings;
                    }
                    final PropertyTree subscribedDataSetPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscribedDataSet"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscribedDataSetPropertyTree!= null):((subscribedDataSetPropertyTree == null)||(!subscribedDataSetPropertyTree.isLeaf())))) {
                        this.subscribedDataSet = _other.subscribedDataSet;
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

        protected<_P extends DataSetReaderDataType >_P init(final _P _product) {
            _product.name = this.name;
            _product.enabled = this.enabled;
            _product.publisherId = ((this.publisherId == null)?null:this.publisherId.build());
            _product.writerGroupId = this.writerGroupId;
            _product.dataSetWriterId = this.dataSetWriterId;
            _product.dataSetMetaData = this.dataSetMetaData;
            _product.dataSetFieldContentMask = this.dataSetFieldContentMask;
            _product.messageReceiveTimeout = this.messageReceiveTimeout;
            _product.keyFrameCount = this.keyFrameCount;
            _product.headerLayoutUri = this.headerLayoutUri;
            _product.securityMode = this.securityMode;
            _product.securityGroupId = this.securityGroupId;
            _product.securityKeyServices = this.securityKeyServices;
            _product.dataSetReaderProperties = this.dataSetReaderProperties;
            _product.transportSettings = this.transportSettings;
            _product.messageSettings = this.messageSettings;
            _product.subscribedDataSet = this.subscribedDataSet;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "name" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param name
         *     Neuer Wert der Eigenschaft "name".
         */
        public DataSetReaderDataType.Builder<_B> withName(final JAXBElement<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enabled" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param enabled
         *     Neuer Wert der Eigenschaft "enabled".
         */
        public DataSetReaderDataType.Builder<_B> withEnabled(final Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publisherId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param publisherId
         *     Neuer Wert der Eigenschaft "publisherId".
         */
        public DataSetReaderDataType.Builder<_B> withPublisherId(final Variant publisherId) {
            this.publisherId = ((publisherId == null)?null:new Variant.Builder<DataSetReaderDataType.Builder<_B>>(this, publisherId, false));
            return this;
        }

        /**
         * Erzeugt den vorhandenen Builder oder einen neuen "Builder" zum Zusammenbauen des
         * Wertes der Eigenschaft "publisherId".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen des Wertes der Eigenschaft "publisherId".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Variant.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Variant.Builder<? extends DataSetReaderDataType.Builder<_B>> withPublisherId() {
            if (this.publisherId!= null) {
                return this.publisherId;
            }
            return this.publisherId = new Variant.Builder<DataSetReaderDataType.Builder<_B>>(this, null, false);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writerGroupId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param writerGroupId
         *     Neuer Wert der Eigenschaft "writerGroupId".
         */
        public DataSetReaderDataType.Builder<_B> withWriterGroupId(final Integer writerGroupId) {
            this.writerGroupId = writerGroupId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetWriterId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetWriterId
         *     Neuer Wert der Eigenschaft "dataSetWriterId".
         */
        public DataSetReaderDataType.Builder<_B> withDataSetWriterId(final Integer dataSetWriterId) {
            this.dataSetWriterId = dataSetWriterId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetMetaData" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param dataSetMetaData
         *     Neuer Wert der Eigenschaft "dataSetMetaData".
         */
        public DataSetReaderDataType.Builder<_B> withDataSetMetaData(final JAXBElement<DataSetMetaDataType> dataSetMetaData) {
            this.dataSetMetaData = dataSetMetaData;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetFieldContentMask" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetFieldContentMask
         *     Neuer Wert der Eigenschaft "dataSetFieldContentMask".
         */
        public DataSetReaderDataType.Builder<_B> withDataSetFieldContentMask(final Long dataSetFieldContentMask) {
            this.dataSetFieldContentMask = dataSetFieldContentMask;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "messageReceiveTimeout" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param messageReceiveTimeout
         *     Neuer Wert der Eigenschaft "messageReceiveTimeout".
         */
        public DataSetReaderDataType.Builder<_B> withMessageReceiveTimeout(final Double messageReceiveTimeout) {
            this.messageReceiveTimeout = messageReceiveTimeout;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "keyFrameCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param keyFrameCount
         *     Neuer Wert der Eigenschaft "keyFrameCount".
         */
        public DataSetReaderDataType.Builder<_B> withKeyFrameCount(final Long keyFrameCount) {
            this.keyFrameCount = keyFrameCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "headerLayoutUri" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param headerLayoutUri
         *     Neuer Wert der Eigenschaft "headerLayoutUri".
         */
        public DataSetReaderDataType.Builder<_B> withHeaderLayoutUri(final JAXBElement<String> headerLayoutUri) {
            this.headerLayoutUri = headerLayoutUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityMode" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityMode
         *     Neuer Wert der Eigenschaft "securityMode".
         */
        public DataSetReaderDataType.Builder<_B> withSecurityMode(final MessageSecurityMode securityMode) {
            this.securityMode = securityMode;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityGroupId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param securityGroupId
         *     Neuer Wert der Eigenschaft "securityGroupId".
         */
        public DataSetReaderDataType.Builder<_B> withSecurityGroupId(final JAXBElement<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityKeyServices" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param securityKeyServices
         *     Neuer Wert der Eigenschaft "securityKeyServices".
         */
        public DataSetReaderDataType.Builder<_B> withSecurityKeyServices(final JAXBElement<ListOfEndpointDescription> securityKeyServices) {
            this.securityKeyServices = securityKeyServices;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataSetReaderProperties" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataSetReaderProperties
         *     Neuer Wert der Eigenschaft "dataSetReaderProperties".
         */
        public DataSetReaderDataType.Builder<_B> withDataSetReaderProperties(final JAXBElement<ListOfKeyValuePair> dataSetReaderProperties) {
            this.dataSetReaderProperties = dataSetReaderProperties;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transportSettings" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transportSettings
         *     Neuer Wert der Eigenschaft "transportSettings".
         */
        public DataSetReaderDataType.Builder<_B> withTransportSettings(final JAXBElement<ExtensionObject> transportSettings) {
            this.transportSettings = transportSettings;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "messageSettings" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param messageSettings
         *     Neuer Wert der Eigenschaft "messageSettings".
         */
        public DataSetReaderDataType.Builder<_B> withMessageSettings(final JAXBElement<ExtensionObject> messageSettings) {
            this.messageSettings = messageSettings;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscribedDataSet" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param subscribedDataSet
         *     Neuer Wert der Eigenschaft "subscribedDataSet".
         */
        public DataSetReaderDataType.Builder<_B> withSubscribedDataSet(final JAXBElement<ExtensionObject> subscribedDataSet) {
            this.subscribedDataSet = subscribedDataSet;
            return this;
        }

        @Override
        public DataSetReaderDataType build() {
            if (_storedValue == null) {
                return this.init(new DataSetReaderDataType());
            } else {
                return ((DataSetReaderDataType) _storedValue);
            }
        }

        public DataSetReaderDataType.Builder<_B> copyOf(final DataSetReaderDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public DataSetReaderDataType.Builder<_B> copyOf(final DataSetReaderDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends DataSetReaderDataType.Selector<DataSetReaderDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static DataSetReaderDataType.Select _root() {
            return new DataSetReaderDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> name = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> enabled = null;
        private Variant.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> publisherId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> writerGroupId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> dataSetWriterId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> dataSetMetaData = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> dataSetFieldContentMask = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> messageReceiveTimeout = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> keyFrameCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> headerLayoutUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> securityMode = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> securityGroupId = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> securityKeyServices = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> dataSetReaderProperties = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> transportSettings = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> messageSettings = null;
        private com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> subscribedDataSet = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.name!= null) {
                products.put("name", this.name.init());
            }
            if (this.enabled!= null) {
                products.put("enabled", this.enabled.init());
            }
            if (this.publisherId!= null) {
                products.put("publisherId", this.publisherId.init());
            }
            if (this.writerGroupId!= null) {
                products.put("writerGroupId", this.writerGroupId.init());
            }
            if (this.dataSetWriterId!= null) {
                products.put("dataSetWriterId", this.dataSetWriterId.init());
            }
            if (this.dataSetMetaData!= null) {
                products.put("dataSetMetaData", this.dataSetMetaData.init());
            }
            if (this.dataSetFieldContentMask!= null) {
                products.put("dataSetFieldContentMask", this.dataSetFieldContentMask.init());
            }
            if (this.messageReceiveTimeout!= null) {
                products.put("messageReceiveTimeout", this.messageReceiveTimeout.init());
            }
            if (this.keyFrameCount!= null) {
                products.put("keyFrameCount", this.keyFrameCount.init());
            }
            if (this.headerLayoutUri!= null) {
                products.put("headerLayoutUri", this.headerLayoutUri.init());
            }
            if (this.securityMode!= null) {
                products.put("securityMode", this.securityMode.init());
            }
            if (this.securityGroupId!= null) {
                products.put("securityGroupId", this.securityGroupId.init());
            }
            if (this.securityKeyServices!= null) {
                products.put("securityKeyServices", this.securityKeyServices.init());
            }
            if (this.dataSetReaderProperties!= null) {
                products.put("dataSetReaderProperties", this.dataSetReaderProperties.init());
            }
            if (this.transportSettings!= null) {
                products.put("transportSettings", this.transportSettings.init());
            }
            if (this.messageSettings!= null) {
                products.put("messageSettings", this.messageSettings.init());
            }
            if (this.subscribedDataSet!= null) {
                products.put("subscribedDataSet", this.subscribedDataSet.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> name() {
            return ((this.name == null)?this.name = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "name"):this.name);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> enabled() {
            return ((this.enabled == null)?this.enabled = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "enabled"):this.enabled);
        }

        public Variant.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> publisherId() {
            return ((this.publisherId == null)?this.publisherId = new Variant.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "publisherId"):this.publisherId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> writerGroupId() {
            return ((this.writerGroupId == null)?this.writerGroupId = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "writerGroupId"):this.writerGroupId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> dataSetWriterId() {
            return ((this.dataSetWriterId == null)?this.dataSetWriterId = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetWriterId"):this.dataSetWriterId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> dataSetMetaData() {
            return ((this.dataSetMetaData == null)?this.dataSetMetaData = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetMetaData"):this.dataSetMetaData);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> dataSetFieldContentMask() {
            return ((this.dataSetFieldContentMask == null)?this.dataSetFieldContentMask = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetFieldContentMask"):this.dataSetFieldContentMask);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> messageReceiveTimeout() {
            return ((this.messageReceiveTimeout == null)?this.messageReceiveTimeout = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "messageReceiveTimeout"):this.messageReceiveTimeout);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> keyFrameCount() {
            return ((this.keyFrameCount == null)?this.keyFrameCount = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "keyFrameCount"):this.keyFrameCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> headerLayoutUri() {
            return ((this.headerLayoutUri == null)?this.headerLayoutUri = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "headerLayoutUri"):this.headerLayoutUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> securityMode() {
            return ((this.securityMode == null)?this.securityMode = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "securityMode"):this.securityMode);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> securityGroupId() {
            return ((this.securityGroupId == null)?this.securityGroupId = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "securityGroupId"):this.securityGroupId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> securityKeyServices() {
            return ((this.securityKeyServices == null)?this.securityKeyServices = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "securityKeyServices"):this.securityKeyServices);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> dataSetReaderProperties() {
            return ((this.dataSetReaderProperties == null)?this.dataSetReaderProperties = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "dataSetReaderProperties"):this.dataSetReaderProperties);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> transportSettings() {
            return ((this.transportSettings == null)?this.transportSettings = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "transportSettings"):this.transportSettings);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> messageSettings() {
            return ((this.messageSettings == null)?this.messageSettings = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "messageSettings"):this.messageSettings);
        }

        public com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>> subscribedDataSet() {
            return ((this.subscribedDataSet == null)?this.subscribedDataSet = new com.kscs.util.jaxb.Selector<TRoot, DataSetReaderDataType.Selector<TRoot, TParent>>(this._root, this, "subscribedDataSet"):this.subscribedDataSet);
        }

    }

}
