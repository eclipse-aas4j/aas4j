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
 * <p>Java-Klasse für SessionDiagnosticsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SessionDiagnosticsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="SessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientDescription" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ApplicationDescription" minOccurs="0"/&gt;
 *         &lt;element name="ServerUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndpointUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocaleIds" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfString" minOccurs="0"/&gt;
 *         &lt;element name="ActualSessionTimeout" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MaxResponseMessageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ClientConnectionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ClientLastContactTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrentSubscriptionsCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CurrentMonitoredItemsCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CurrentPublishRequestsInQueue" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TotalRequestCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="UnauthorizedRequestCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ReadCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="HistoryReadCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="WriteCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="HistoryUpdateCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="CallCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="CreateMonitoredItemsCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="ModifyMonitoredItemsCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="SetMonitoringModeCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="SetTriggeringCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="DeleteMonitoredItemsCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="CreateSubscriptionCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="ModifySubscriptionCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="SetPublishingModeCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="PublishCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="RepublishCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="TransferSubscriptionsCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="DeleteSubscriptionsCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="AddNodesCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="AddReferencesCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="DeleteNodesCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="DeleteReferencesCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="BrowseCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="BrowseNextCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="TranslateBrowsePathsToNodeIdsCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="QueryFirstCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="QueryNextCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="RegisterNodesCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *         &lt;element name="UnregisterNodesCount" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ServiceCounterDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionDiagnosticsDataType", propOrder = {
    "sessionId",
    "sessionName",
    "clientDescription",
    "serverUri",
    "endpointUrl",
    "localeIds",
    "actualSessionTimeout",
    "maxResponseMessageSize",
    "clientConnectionTime",
    "clientLastContactTime",
    "currentSubscriptionsCount",
    "currentMonitoredItemsCount",
    "currentPublishRequestsInQueue",
    "totalRequestCount",
    "unauthorizedRequestCount",
    "readCount",
    "historyReadCount",
    "writeCount",
    "historyUpdateCount",
    "callCount",
    "createMonitoredItemsCount",
    "modifyMonitoredItemsCount",
    "setMonitoringModeCount",
    "setTriggeringCount",
    "deleteMonitoredItemsCount",
    "createSubscriptionCount",
    "modifySubscriptionCount",
    "setPublishingModeCount",
    "publishCount",
    "republishCount",
    "transferSubscriptionsCount",
    "deleteSubscriptionsCount",
    "addNodesCount",
    "addReferencesCount",
    "deleteNodesCount",
    "deleteReferencesCount",
    "browseCount",
    "browseNextCount",
    "translateBrowsePathsToNodeIdsCount",
    "queryFirstCount",
    "queryNextCount",
    "registerNodesCount",
    "unregisterNodesCount"
})
public class SessionDiagnosticsDataType {

    @XmlElementRef(name = "SessionId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> sessionId;
    @XmlElementRef(name = "SessionName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionName;
    @XmlElementRef(name = "ClientDescription", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ApplicationDescription> clientDescription;
    @XmlElementRef(name = "ServerUri", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serverUri;
    @XmlElementRef(name = "EndpointUrl", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endpointUrl;
    @XmlElementRef(name = "LocaleIds", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfString> localeIds;
    @XmlElement(name = "ActualSessionTimeout")
    protected Double actualSessionTimeout;
    @XmlElement(name = "MaxResponseMessageSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxResponseMessageSize;
    @XmlElement(name = "ClientConnectionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientConnectionTime;
    @XmlElement(name = "ClientLastContactTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientLastContactTime;
    @XmlElement(name = "CurrentSubscriptionsCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentSubscriptionsCount;
    @XmlElement(name = "CurrentMonitoredItemsCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentMonitoredItemsCount;
    @XmlElement(name = "CurrentPublishRequestsInQueue")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentPublishRequestsInQueue;
    @XmlElementRef(name = "TotalRequestCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> totalRequestCount;
    @XmlElement(name = "UnauthorizedRequestCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long unauthorizedRequestCount;
    @XmlElementRef(name = "ReadCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> readCount;
    @XmlElementRef(name = "HistoryReadCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> historyReadCount;
    @XmlElementRef(name = "WriteCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> writeCount;
    @XmlElementRef(name = "HistoryUpdateCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> historyUpdateCount;
    @XmlElementRef(name = "CallCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> callCount;
    @XmlElementRef(name = "CreateMonitoredItemsCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> createMonitoredItemsCount;
    @XmlElementRef(name = "ModifyMonitoredItemsCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> modifyMonitoredItemsCount;
    @XmlElementRef(name = "SetMonitoringModeCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> setMonitoringModeCount;
    @XmlElementRef(name = "SetTriggeringCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> setTriggeringCount;
    @XmlElementRef(name = "DeleteMonitoredItemsCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> deleteMonitoredItemsCount;
    @XmlElementRef(name = "CreateSubscriptionCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> createSubscriptionCount;
    @XmlElementRef(name = "ModifySubscriptionCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> modifySubscriptionCount;
    @XmlElementRef(name = "SetPublishingModeCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> setPublishingModeCount;
    @XmlElementRef(name = "PublishCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> publishCount;
    @XmlElementRef(name = "RepublishCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> republishCount;
    @XmlElementRef(name = "TransferSubscriptionsCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> transferSubscriptionsCount;
    @XmlElementRef(name = "DeleteSubscriptionsCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> deleteSubscriptionsCount;
    @XmlElementRef(name = "AddNodesCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> addNodesCount;
    @XmlElementRef(name = "AddReferencesCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> addReferencesCount;
    @XmlElementRef(name = "DeleteNodesCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> deleteNodesCount;
    @XmlElementRef(name = "DeleteReferencesCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> deleteReferencesCount;
    @XmlElementRef(name = "BrowseCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> browseCount;
    @XmlElementRef(name = "BrowseNextCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> browseNextCount;
    @XmlElementRef(name = "TranslateBrowsePathsToNodeIdsCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> translateBrowsePathsToNodeIdsCount;
    @XmlElementRef(name = "QueryFirstCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> queryFirstCount;
    @XmlElementRef(name = "QueryNextCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> queryNextCount;
    @XmlElementRef(name = "RegisterNodesCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> registerNodesCount;
    @XmlElementRef(name = "UnregisterNodesCount", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceCounterDataType> unregisterNodesCount;

    /**
     * Ruft den Wert der sessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getSessionId() {
        return sessionId;
    }

    /**
     * Legt den Wert der sessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setSessionId(JAXBElement<NodeId> value) {
        this.sessionId = value;
    }

    /**
     * Ruft den Wert der sessionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionName() {
        return sessionName;
    }

    /**
     * Legt den Wert der sessionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionName(JAXBElement<String> value) {
        this.sessionName = value;
    }

    /**
     * Ruft den Wert der clientDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApplicationDescription }{@code >}
     *     
     */
    public JAXBElement<ApplicationDescription> getClientDescription() {
        return clientDescription;
    }

    /**
     * Legt den Wert der clientDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApplicationDescription }{@code >}
     *     
     */
    public void setClientDescription(JAXBElement<ApplicationDescription> value) {
        this.clientDescription = value;
    }

    /**
     * Ruft den Wert der serverUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerUri() {
        return serverUri;
    }

    /**
     * Legt den Wert der serverUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerUri(JAXBElement<String> value) {
        this.serverUri = value;
    }

    /**
     * Ruft den Wert der endpointUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndpointUrl() {
        return endpointUrl;
    }

    /**
     * Legt den Wert der endpointUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndpointUrl(JAXBElement<String> value) {
        this.endpointUrl = value;
    }

    /**
     * Ruft den Wert der localeIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public JAXBElement<ListOfString> getLocaleIds() {
        return localeIds;
    }

    /**
     * Legt den Wert der localeIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfString }{@code >}
     *     
     */
    public void setLocaleIds(JAXBElement<ListOfString> value) {
        this.localeIds = value;
    }

    /**
     * Ruft den Wert der actualSessionTimeout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualSessionTimeout() {
        return actualSessionTimeout;
    }

    /**
     * Legt den Wert der actualSessionTimeout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualSessionTimeout(Double value) {
        this.actualSessionTimeout = value;
    }

    /**
     * Ruft den Wert der maxResponseMessageSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxResponseMessageSize() {
        return maxResponseMessageSize;
    }

    /**
     * Legt den Wert der maxResponseMessageSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxResponseMessageSize(Long value) {
        this.maxResponseMessageSize = value;
    }

    /**
     * Ruft den Wert der clientConnectionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientConnectionTime() {
        return clientConnectionTime;
    }

    /**
     * Legt den Wert der clientConnectionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientConnectionTime(XMLGregorianCalendar value) {
        this.clientConnectionTime = value;
    }

    /**
     * Ruft den Wert der clientLastContactTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientLastContactTime() {
        return clientLastContactTime;
    }

    /**
     * Legt den Wert der clientLastContactTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientLastContactTime(XMLGregorianCalendar value) {
        this.clientLastContactTime = value;
    }

    /**
     * Ruft den Wert der currentSubscriptionsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentSubscriptionsCount() {
        return currentSubscriptionsCount;
    }

    /**
     * Legt den Wert der currentSubscriptionsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentSubscriptionsCount(Long value) {
        this.currentSubscriptionsCount = value;
    }

    /**
     * Ruft den Wert der currentMonitoredItemsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentMonitoredItemsCount() {
        return currentMonitoredItemsCount;
    }

    /**
     * Legt den Wert der currentMonitoredItemsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentMonitoredItemsCount(Long value) {
        this.currentMonitoredItemsCount = value;
    }

    /**
     * Ruft den Wert der currentPublishRequestsInQueue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentPublishRequestsInQueue() {
        return currentPublishRequestsInQueue;
    }

    /**
     * Legt den Wert der currentPublishRequestsInQueue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentPublishRequestsInQueue(Long value) {
        this.currentPublishRequestsInQueue = value;
    }

    /**
     * Ruft den Wert der totalRequestCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getTotalRequestCount() {
        return totalRequestCount;
    }

    /**
     * Legt den Wert der totalRequestCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setTotalRequestCount(JAXBElement<ServiceCounterDataType> value) {
        this.totalRequestCount = value;
    }

    /**
     * Ruft den Wert der unauthorizedRequestCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnauthorizedRequestCount() {
        return unauthorizedRequestCount;
    }

    /**
     * Legt den Wert der unauthorizedRequestCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnauthorizedRequestCount(Long value) {
        this.unauthorizedRequestCount = value;
    }

    /**
     * Ruft den Wert der readCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getReadCount() {
        return readCount;
    }

    /**
     * Legt den Wert der readCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setReadCount(JAXBElement<ServiceCounterDataType> value) {
        this.readCount = value;
    }

    /**
     * Ruft den Wert der historyReadCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getHistoryReadCount() {
        return historyReadCount;
    }

    /**
     * Legt den Wert der historyReadCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setHistoryReadCount(JAXBElement<ServiceCounterDataType> value) {
        this.historyReadCount = value;
    }

    /**
     * Ruft den Wert der writeCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getWriteCount() {
        return writeCount;
    }

    /**
     * Legt den Wert der writeCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setWriteCount(JAXBElement<ServiceCounterDataType> value) {
        this.writeCount = value;
    }

    /**
     * Ruft den Wert der historyUpdateCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getHistoryUpdateCount() {
        return historyUpdateCount;
    }

    /**
     * Legt den Wert der historyUpdateCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setHistoryUpdateCount(JAXBElement<ServiceCounterDataType> value) {
        this.historyUpdateCount = value;
    }

    /**
     * Ruft den Wert der callCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getCallCount() {
        return callCount;
    }

    /**
     * Legt den Wert der callCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setCallCount(JAXBElement<ServiceCounterDataType> value) {
        this.callCount = value;
    }

    /**
     * Ruft den Wert der createMonitoredItemsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getCreateMonitoredItemsCount() {
        return createMonitoredItemsCount;
    }

    /**
     * Legt den Wert der createMonitoredItemsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setCreateMonitoredItemsCount(JAXBElement<ServiceCounterDataType> value) {
        this.createMonitoredItemsCount = value;
    }

    /**
     * Ruft den Wert der modifyMonitoredItemsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getModifyMonitoredItemsCount() {
        return modifyMonitoredItemsCount;
    }

    /**
     * Legt den Wert der modifyMonitoredItemsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setModifyMonitoredItemsCount(JAXBElement<ServiceCounterDataType> value) {
        this.modifyMonitoredItemsCount = value;
    }

    /**
     * Ruft den Wert der setMonitoringModeCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getSetMonitoringModeCount() {
        return setMonitoringModeCount;
    }

    /**
     * Legt den Wert der setMonitoringModeCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setSetMonitoringModeCount(JAXBElement<ServiceCounterDataType> value) {
        this.setMonitoringModeCount = value;
    }

    /**
     * Ruft den Wert der setTriggeringCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getSetTriggeringCount() {
        return setTriggeringCount;
    }

    /**
     * Legt den Wert der setTriggeringCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setSetTriggeringCount(JAXBElement<ServiceCounterDataType> value) {
        this.setTriggeringCount = value;
    }

    /**
     * Ruft den Wert der deleteMonitoredItemsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getDeleteMonitoredItemsCount() {
        return deleteMonitoredItemsCount;
    }

    /**
     * Legt den Wert der deleteMonitoredItemsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setDeleteMonitoredItemsCount(JAXBElement<ServiceCounterDataType> value) {
        this.deleteMonitoredItemsCount = value;
    }

    /**
     * Ruft den Wert der createSubscriptionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getCreateSubscriptionCount() {
        return createSubscriptionCount;
    }

    /**
     * Legt den Wert der createSubscriptionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setCreateSubscriptionCount(JAXBElement<ServiceCounterDataType> value) {
        this.createSubscriptionCount = value;
    }

    /**
     * Ruft den Wert der modifySubscriptionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getModifySubscriptionCount() {
        return modifySubscriptionCount;
    }

    /**
     * Legt den Wert der modifySubscriptionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setModifySubscriptionCount(JAXBElement<ServiceCounterDataType> value) {
        this.modifySubscriptionCount = value;
    }

    /**
     * Ruft den Wert der setPublishingModeCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getSetPublishingModeCount() {
        return setPublishingModeCount;
    }

    /**
     * Legt den Wert der setPublishingModeCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setSetPublishingModeCount(JAXBElement<ServiceCounterDataType> value) {
        this.setPublishingModeCount = value;
    }

    /**
     * Ruft den Wert der publishCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getPublishCount() {
        return publishCount;
    }

    /**
     * Legt den Wert der publishCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setPublishCount(JAXBElement<ServiceCounterDataType> value) {
        this.publishCount = value;
    }

    /**
     * Ruft den Wert der republishCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getRepublishCount() {
        return republishCount;
    }

    /**
     * Legt den Wert der republishCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setRepublishCount(JAXBElement<ServiceCounterDataType> value) {
        this.republishCount = value;
    }

    /**
     * Ruft den Wert der transferSubscriptionsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getTransferSubscriptionsCount() {
        return transferSubscriptionsCount;
    }

    /**
     * Legt den Wert der transferSubscriptionsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setTransferSubscriptionsCount(JAXBElement<ServiceCounterDataType> value) {
        this.transferSubscriptionsCount = value;
    }

    /**
     * Ruft den Wert der deleteSubscriptionsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getDeleteSubscriptionsCount() {
        return deleteSubscriptionsCount;
    }

    /**
     * Legt den Wert der deleteSubscriptionsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setDeleteSubscriptionsCount(JAXBElement<ServiceCounterDataType> value) {
        this.deleteSubscriptionsCount = value;
    }

    /**
     * Ruft den Wert der addNodesCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getAddNodesCount() {
        return addNodesCount;
    }

    /**
     * Legt den Wert der addNodesCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setAddNodesCount(JAXBElement<ServiceCounterDataType> value) {
        this.addNodesCount = value;
    }

    /**
     * Ruft den Wert der addReferencesCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getAddReferencesCount() {
        return addReferencesCount;
    }

    /**
     * Legt den Wert der addReferencesCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setAddReferencesCount(JAXBElement<ServiceCounterDataType> value) {
        this.addReferencesCount = value;
    }

    /**
     * Ruft den Wert der deleteNodesCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getDeleteNodesCount() {
        return deleteNodesCount;
    }

    /**
     * Legt den Wert der deleteNodesCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setDeleteNodesCount(JAXBElement<ServiceCounterDataType> value) {
        this.deleteNodesCount = value;
    }

    /**
     * Ruft den Wert der deleteReferencesCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getDeleteReferencesCount() {
        return deleteReferencesCount;
    }

    /**
     * Legt den Wert der deleteReferencesCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setDeleteReferencesCount(JAXBElement<ServiceCounterDataType> value) {
        this.deleteReferencesCount = value;
    }

    /**
     * Ruft den Wert der browseCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getBrowseCount() {
        return browseCount;
    }

    /**
     * Legt den Wert der browseCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setBrowseCount(JAXBElement<ServiceCounterDataType> value) {
        this.browseCount = value;
    }

    /**
     * Ruft den Wert der browseNextCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getBrowseNextCount() {
        return browseNextCount;
    }

    /**
     * Legt den Wert der browseNextCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setBrowseNextCount(JAXBElement<ServiceCounterDataType> value) {
        this.browseNextCount = value;
    }

    /**
     * Ruft den Wert der translateBrowsePathsToNodeIdsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getTranslateBrowsePathsToNodeIdsCount() {
        return translateBrowsePathsToNodeIdsCount;
    }

    /**
     * Legt den Wert der translateBrowsePathsToNodeIdsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setTranslateBrowsePathsToNodeIdsCount(JAXBElement<ServiceCounterDataType> value) {
        this.translateBrowsePathsToNodeIdsCount = value;
    }

    /**
     * Ruft den Wert der queryFirstCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getQueryFirstCount() {
        return queryFirstCount;
    }

    /**
     * Legt den Wert der queryFirstCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setQueryFirstCount(JAXBElement<ServiceCounterDataType> value) {
        this.queryFirstCount = value;
    }

    /**
     * Ruft den Wert der queryNextCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getQueryNextCount() {
        return queryNextCount;
    }

    /**
     * Legt den Wert der queryNextCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setQueryNextCount(JAXBElement<ServiceCounterDataType> value) {
        this.queryNextCount = value;
    }

    /**
     * Ruft den Wert der registerNodesCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getRegisterNodesCount() {
        return registerNodesCount;
    }

    /**
     * Legt den Wert der registerNodesCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setRegisterNodesCount(JAXBElement<ServiceCounterDataType> value) {
        this.registerNodesCount = value;
    }

    /**
     * Ruft den Wert der unregisterNodesCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public JAXBElement<ServiceCounterDataType> getUnregisterNodesCount() {
        return unregisterNodesCount;
    }

    /**
     * Legt den Wert der unregisterNodesCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceCounterDataType }{@code >}
     *     
     */
    public void setUnregisterNodesCount(JAXBElement<ServiceCounterDataType> value) {
        this.unregisterNodesCount = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SessionDiagnosticsDataType.Builder<_B> _other) {
        _other.sessionId = this.sessionId;
        _other.sessionName = this.sessionName;
        _other.clientDescription = this.clientDescription;
        _other.serverUri = this.serverUri;
        _other.endpointUrl = this.endpointUrl;
        _other.localeIds = this.localeIds;
        _other.actualSessionTimeout = this.actualSessionTimeout;
        _other.maxResponseMessageSize = this.maxResponseMessageSize;
        _other.clientConnectionTime = ((this.clientConnectionTime == null)?null:((XMLGregorianCalendar) this.clientConnectionTime.clone()));
        _other.clientLastContactTime = ((this.clientLastContactTime == null)?null:((XMLGregorianCalendar) this.clientLastContactTime.clone()));
        _other.currentSubscriptionsCount = this.currentSubscriptionsCount;
        _other.currentMonitoredItemsCount = this.currentMonitoredItemsCount;
        _other.currentPublishRequestsInQueue = this.currentPublishRequestsInQueue;
        _other.totalRequestCount = this.totalRequestCount;
        _other.unauthorizedRequestCount = this.unauthorizedRequestCount;
        _other.readCount = this.readCount;
        _other.historyReadCount = this.historyReadCount;
        _other.writeCount = this.writeCount;
        _other.historyUpdateCount = this.historyUpdateCount;
        _other.callCount = this.callCount;
        _other.createMonitoredItemsCount = this.createMonitoredItemsCount;
        _other.modifyMonitoredItemsCount = this.modifyMonitoredItemsCount;
        _other.setMonitoringModeCount = this.setMonitoringModeCount;
        _other.setTriggeringCount = this.setTriggeringCount;
        _other.deleteMonitoredItemsCount = this.deleteMonitoredItemsCount;
        _other.createSubscriptionCount = this.createSubscriptionCount;
        _other.modifySubscriptionCount = this.modifySubscriptionCount;
        _other.setPublishingModeCount = this.setPublishingModeCount;
        _other.publishCount = this.publishCount;
        _other.republishCount = this.republishCount;
        _other.transferSubscriptionsCount = this.transferSubscriptionsCount;
        _other.deleteSubscriptionsCount = this.deleteSubscriptionsCount;
        _other.addNodesCount = this.addNodesCount;
        _other.addReferencesCount = this.addReferencesCount;
        _other.deleteNodesCount = this.deleteNodesCount;
        _other.deleteReferencesCount = this.deleteReferencesCount;
        _other.browseCount = this.browseCount;
        _other.browseNextCount = this.browseNextCount;
        _other.translateBrowsePathsToNodeIdsCount = this.translateBrowsePathsToNodeIdsCount;
        _other.queryFirstCount = this.queryFirstCount;
        _other.queryNextCount = this.queryNextCount;
        _other.registerNodesCount = this.registerNodesCount;
        _other.unregisterNodesCount = this.unregisterNodesCount;
    }

    public<_B >SessionDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SessionDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public SessionDiagnosticsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SessionDiagnosticsDataType.Builder<Void> builder() {
        return new SessionDiagnosticsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >SessionDiagnosticsDataType.Builder<_B> copyOf(final SessionDiagnosticsDataType _other) {
        final SessionDiagnosticsDataType.Builder<_B> _newBuilder = new SessionDiagnosticsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SessionDiagnosticsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionIdPropertyTree!= null):((sessionIdPropertyTree == null)||(!sessionIdPropertyTree.isLeaf())))) {
            _other.sessionId = this.sessionId;
        }
        final PropertyTree sessionNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionNamePropertyTree!= null):((sessionNamePropertyTree == null)||(!sessionNamePropertyTree.isLeaf())))) {
            _other.sessionName = this.sessionName;
        }
        final PropertyTree clientDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientDescription"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientDescriptionPropertyTree!= null):((clientDescriptionPropertyTree == null)||(!clientDescriptionPropertyTree.isLeaf())))) {
            _other.clientDescription = this.clientDescription;
        }
        final PropertyTree serverUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUri"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUriPropertyTree!= null):((serverUriPropertyTree == null)||(!serverUriPropertyTree.isLeaf())))) {
            _other.serverUri = this.serverUri;
        }
        final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
            _other.endpointUrl = this.endpointUrl;
        }
        final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
            _other.localeIds = this.localeIds;
        }
        final PropertyTree actualSessionTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("actualSessionTimeout"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(actualSessionTimeoutPropertyTree!= null):((actualSessionTimeoutPropertyTree == null)||(!actualSessionTimeoutPropertyTree.isLeaf())))) {
            _other.actualSessionTimeout = this.actualSessionTimeout;
        }
        final PropertyTree maxResponseMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxResponseMessageSize"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxResponseMessageSizePropertyTree!= null):((maxResponseMessageSizePropertyTree == null)||(!maxResponseMessageSizePropertyTree.isLeaf())))) {
            _other.maxResponseMessageSize = this.maxResponseMessageSize;
        }
        final PropertyTree clientConnectionTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientConnectionTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientConnectionTimePropertyTree!= null):((clientConnectionTimePropertyTree == null)||(!clientConnectionTimePropertyTree.isLeaf())))) {
            _other.clientConnectionTime = ((this.clientConnectionTime == null)?null:((XMLGregorianCalendar) this.clientConnectionTime.clone()));
        }
        final PropertyTree clientLastContactTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientLastContactTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientLastContactTimePropertyTree!= null):((clientLastContactTimePropertyTree == null)||(!clientLastContactTimePropertyTree.isLeaf())))) {
            _other.clientLastContactTime = ((this.clientLastContactTime == null)?null:((XMLGregorianCalendar) this.clientLastContactTime.clone()));
        }
        final PropertyTree currentSubscriptionsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentSubscriptionsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentSubscriptionsCountPropertyTree!= null):((currentSubscriptionsCountPropertyTree == null)||(!currentSubscriptionsCountPropertyTree.isLeaf())))) {
            _other.currentSubscriptionsCount = this.currentSubscriptionsCount;
        }
        final PropertyTree currentMonitoredItemsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentMonitoredItemsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentMonitoredItemsCountPropertyTree!= null):((currentMonitoredItemsCountPropertyTree == null)||(!currentMonitoredItemsCountPropertyTree.isLeaf())))) {
            _other.currentMonitoredItemsCount = this.currentMonitoredItemsCount;
        }
        final PropertyTree currentPublishRequestsInQueuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentPublishRequestsInQueue"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentPublishRequestsInQueuePropertyTree!= null):((currentPublishRequestsInQueuePropertyTree == null)||(!currentPublishRequestsInQueuePropertyTree.isLeaf())))) {
            _other.currentPublishRequestsInQueue = this.currentPublishRequestsInQueue;
        }
        final PropertyTree totalRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("totalRequestCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(totalRequestCountPropertyTree!= null):((totalRequestCountPropertyTree == null)||(!totalRequestCountPropertyTree.isLeaf())))) {
            _other.totalRequestCount = this.totalRequestCount;
        }
        final PropertyTree unauthorizedRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("unauthorizedRequestCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unauthorizedRequestCountPropertyTree!= null):((unauthorizedRequestCountPropertyTree == null)||(!unauthorizedRequestCountPropertyTree.isLeaf())))) {
            _other.unauthorizedRequestCount = this.unauthorizedRequestCount;
        }
        final PropertyTree readCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readCountPropertyTree!= null):((readCountPropertyTree == null)||(!readCountPropertyTree.isLeaf())))) {
            _other.readCount = this.readCount;
        }
        final PropertyTree historyReadCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyReadCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyReadCountPropertyTree!= null):((historyReadCountPropertyTree == null)||(!historyReadCountPropertyTree.isLeaf())))) {
            _other.historyReadCount = this.historyReadCount;
        }
        final PropertyTree writeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeCountPropertyTree!= null):((writeCountPropertyTree == null)||(!writeCountPropertyTree.isLeaf())))) {
            _other.writeCount = this.writeCount;
        }
        final PropertyTree historyUpdateCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyUpdateCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyUpdateCountPropertyTree!= null):((historyUpdateCountPropertyTree == null)||(!historyUpdateCountPropertyTree.isLeaf())))) {
            _other.historyUpdateCount = this.historyUpdateCount;
        }
        final PropertyTree callCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("callCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(callCountPropertyTree!= null):((callCountPropertyTree == null)||(!callCountPropertyTree.isLeaf())))) {
            _other.callCount = this.callCount;
        }
        final PropertyTree createMonitoredItemsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createMonitoredItemsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createMonitoredItemsCountPropertyTree!= null):((createMonitoredItemsCountPropertyTree == null)||(!createMonitoredItemsCountPropertyTree.isLeaf())))) {
            _other.createMonitoredItemsCount = this.createMonitoredItemsCount;
        }
        final PropertyTree modifyMonitoredItemsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modifyMonitoredItemsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modifyMonitoredItemsCountPropertyTree!= null):((modifyMonitoredItemsCountPropertyTree == null)||(!modifyMonitoredItemsCountPropertyTree.isLeaf())))) {
            _other.modifyMonitoredItemsCount = this.modifyMonitoredItemsCount;
        }
        final PropertyTree setMonitoringModeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("setMonitoringModeCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(setMonitoringModeCountPropertyTree!= null):((setMonitoringModeCountPropertyTree == null)||(!setMonitoringModeCountPropertyTree.isLeaf())))) {
            _other.setMonitoringModeCount = this.setMonitoringModeCount;
        }
        final PropertyTree setTriggeringCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("setTriggeringCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(setTriggeringCountPropertyTree!= null):((setTriggeringCountPropertyTree == null)||(!setTriggeringCountPropertyTree.isLeaf())))) {
            _other.setTriggeringCount = this.setTriggeringCount;
        }
        final PropertyTree deleteMonitoredItemsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteMonitoredItemsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteMonitoredItemsCountPropertyTree!= null):((deleteMonitoredItemsCountPropertyTree == null)||(!deleteMonitoredItemsCountPropertyTree.isLeaf())))) {
            _other.deleteMonitoredItemsCount = this.deleteMonitoredItemsCount;
        }
        final PropertyTree createSubscriptionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createSubscriptionCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createSubscriptionCountPropertyTree!= null):((createSubscriptionCountPropertyTree == null)||(!createSubscriptionCountPropertyTree.isLeaf())))) {
            _other.createSubscriptionCount = this.createSubscriptionCount;
        }
        final PropertyTree modifySubscriptionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modifySubscriptionCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modifySubscriptionCountPropertyTree!= null):((modifySubscriptionCountPropertyTree == null)||(!modifySubscriptionCountPropertyTree.isLeaf())))) {
            _other.modifySubscriptionCount = this.modifySubscriptionCount;
        }
        final PropertyTree setPublishingModeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("setPublishingModeCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(setPublishingModeCountPropertyTree!= null):((setPublishingModeCountPropertyTree == null)||(!setPublishingModeCountPropertyTree.isLeaf())))) {
            _other.setPublishingModeCount = this.setPublishingModeCount;
        }
        final PropertyTree publishCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishCountPropertyTree!= null):((publishCountPropertyTree == null)||(!publishCountPropertyTree.isLeaf())))) {
            _other.publishCount = this.publishCount;
        }
        final PropertyTree republishCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("republishCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(republishCountPropertyTree!= null):((republishCountPropertyTree == null)||(!republishCountPropertyTree.isLeaf())))) {
            _other.republishCount = this.republishCount;
        }
        final PropertyTree transferSubscriptionsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferSubscriptionsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferSubscriptionsCountPropertyTree!= null):((transferSubscriptionsCountPropertyTree == null)||(!transferSubscriptionsCountPropertyTree.isLeaf())))) {
            _other.transferSubscriptionsCount = this.transferSubscriptionsCount;
        }
        final PropertyTree deleteSubscriptionsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteSubscriptionsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteSubscriptionsCountPropertyTree!= null):((deleteSubscriptionsCountPropertyTree == null)||(!deleteSubscriptionsCountPropertyTree.isLeaf())))) {
            _other.deleteSubscriptionsCount = this.deleteSubscriptionsCount;
        }
        final PropertyTree addNodesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addNodesCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addNodesCountPropertyTree!= null):((addNodesCountPropertyTree == null)||(!addNodesCountPropertyTree.isLeaf())))) {
            _other.addNodesCount = this.addNodesCount;
        }
        final PropertyTree addReferencesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addReferencesCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addReferencesCountPropertyTree!= null):((addReferencesCountPropertyTree == null)||(!addReferencesCountPropertyTree.isLeaf())))) {
            _other.addReferencesCount = this.addReferencesCount;
        }
        final PropertyTree deleteNodesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteNodesCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteNodesCountPropertyTree!= null):((deleteNodesCountPropertyTree == null)||(!deleteNodesCountPropertyTree.isLeaf())))) {
            _other.deleteNodesCount = this.deleteNodesCount;
        }
        final PropertyTree deleteReferencesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteReferencesCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteReferencesCountPropertyTree!= null):((deleteReferencesCountPropertyTree == null)||(!deleteReferencesCountPropertyTree.isLeaf())))) {
            _other.deleteReferencesCount = this.deleteReferencesCount;
        }
        final PropertyTree browseCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseCountPropertyTree!= null):((browseCountPropertyTree == null)||(!browseCountPropertyTree.isLeaf())))) {
            _other.browseCount = this.browseCount;
        }
        final PropertyTree browseNextCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseNextCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseNextCountPropertyTree!= null):((browseNextCountPropertyTree == null)||(!browseNextCountPropertyTree.isLeaf())))) {
            _other.browseNextCount = this.browseNextCount;
        }
        final PropertyTree translateBrowsePathsToNodeIdsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("translateBrowsePathsToNodeIdsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(translateBrowsePathsToNodeIdsCountPropertyTree!= null):((translateBrowsePathsToNodeIdsCountPropertyTree == null)||(!translateBrowsePathsToNodeIdsCountPropertyTree.isLeaf())))) {
            _other.translateBrowsePathsToNodeIdsCount = this.translateBrowsePathsToNodeIdsCount;
        }
        final PropertyTree queryFirstCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryFirstCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryFirstCountPropertyTree!= null):((queryFirstCountPropertyTree == null)||(!queryFirstCountPropertyTree.isLeaf())))) {
            _other.queryFirstCount = this.queryFirstCount;
        }
        final PropertyTree queryNextCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryNextCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryNextCountPropertyTree!= null):((queryNextCountPropertyTree == null)||(!queryNextCountPropertyTree.isLeaf())))) {
            _other.queryNextCount = this.queryNextCount;
        }
        final PropertyTree registerNodesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("registerNodesCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(registerNodesCountPropertyTree!= null):((registerNodesCountPropertyTree == null)||(!registerNodesCountPropertyTree.isLeaf())))) {
            _other.registerNodesCount = this.registerNodesCount;
        }
        final PropertyTree unregisterNodesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("unregisterNodesCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unregisterNodesCountPropertyTree!= null):((unregisterNodesCountPropertyTree == null)||(!unregisterNodesCountPropertyTree.isLeaf())))) {
            _other.unregisterNodesCount = this.unregisterNodesCount;
        }
    }

    public<_B >SessionDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SessionDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SessionDiagnosticsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SessionDiagnosticsDataType.Builder<_B> copyOf(final SessionDiagnosticsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SessionDiagnosticsDataType.Builder<_B> _newBuilder = new SessionDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SessionDiagnosticsDataType.Builder<Void> copyExcept(final SessionDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SessionDiagnosticsDataType.Builder<Void> copyOnly(final SessionDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SessionDiagnosticsDataType _storedValue;
        private JAXBElement<NodeId> sessionId;
        private JAXBElement<String> sessionName;
        private JAXBElement<ApplicationDescription> clientDescription;
        private JAXBElement<String> serverUri;
        private JAXBElement<String> endpointUrl;
        private JAXBElement<ListOfString> localeIds;
        private Double actualSessionTimeout;
        private Long maxResponseMessageSize;
        private XMLGregorianCalendar clientConnectionTime;
        private XMLGregorianCalendar clientLastContactTime;
        private Long currentSubscriptionsCount;
        private Long currentMonitoredItemsCount;
        private Long currentPublishRequestsInQueue;
        private JAXBElement<ServiceCounterDataType> totalRequestCount;
        private Long unauthorizedRequestCount;
        private JAXBElement<ServiceCounterDataType> readCount;
        private JAXBElement<ServiceCounterDataType> historyReadCount;
        private JAXBElement<ServiceCounterDataType> writeCount;
        private JAXBElement<ServiceCounterDataType> historyUpdateCount;
        private JAXBElement<ServiceCounterDataType> callCount;
        private JAXBElement<ServiceCounterDataType> createMonitoredItemsCount;
        private JAXBElement<ServiceCounterDataType> modifyMonitoredItemsCount;
        private JAXBElement<ServiceCounterDataType> setMonitoringModeCount;
        private JAXBElement<ServiceCounterDataType> setTriggeringCount;
        private JAXBElement<ServiceCounterDataType> deleteMonitoredItemsCount;
        private JAXBElement<ServiceCounterDataType> createSubscriptionCount;
        private JAXBElement<ServiceCounterDataType> modifySubscriptionCount;
        private JAXBElement<ServiceCounterDataType> setPublishingModeCount;
        private JAXBElement<ServiceCounterDataType> publishCount;
        private JAXBElement<ServiceCounterDataType> republishCount;
        private JAXBElement<ServiceCounterDataType> transferSubscriptionsCount;
        private JAXBElement<ServiceCounterDataType> deleteSubscriptionsCount;
        private JAXBElement<ServiceCounterDataType> addNodesCount;
        private JAXBElement<ServiceCounterDataType> addReferencesCount;
        private JAXBElement<ServiceCounterDataType> deleteNodesCount;
        private JAXBElement<ServiceCounterDataType> deleteReferencesCount;
        private JAXBElement<ServiceCounterDataType> browseCount;
        private JAXBElement<ServiceCounterDataType> browseNextCount;
        private JAXBElement<ServiceCounterDataType> translateBrowsePathsToNodeIdsCount;
        private JAXBElement<ServiceCounterDataType> queryFirstCount;
        private JAXBElement<ServiceCounterDataType> queryNextCount;
        private JAXBElement<ServiceCounterDataType> registerNodesCount;
        private JAXBElement<ServiceCounterDataType> unregisterNodesCount;

        public Builder(final _B _parentBuilder, final SessionDiagnosticsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.sessionId = _other.sessionId;
                    this.sessionName = _other.sessionName;
                    this.clientDescription = _other.clientDescription;
                    this.serverUri = _other.serverUri;
                    this.endpointUrl = _other.endpointUrl;
                    this.localeIds = _other.localeIds;
                    this.actualSessionTimeout = _other.actualSessionTimeout;
                    this.maxResponseMessageSize = _other.maxResponseMessageSize;
                    this.clientConnectionTime = ((_other.clientConnectionTime == null)?null:((XMLGregorianCalendar) _other.clientConnectionTime.clone()));
                    this.clientLastContactTime = ((_other.clientLastContactTime == null)?null:((XMLGregorianCalendar) _other.clientLastContactTime.clone()));
                    this.currentSubscriptionsCount = _other.currentSubscriptionsCount;
                    this.currentMonitoredItemsCount = _other.currentMonitoredItemsCount;
                    this.currentPublishRequestsInQueue = _other.currentPublishRequestsInQueue;
                    this.totalRequestCount = _other.totalRequestCount;
                    this.unauthorizedRequestCount = _other.unauthorizedRequestCount;
                    this.readCount = _other.readCount;
                    this.historyReadCount = _other.historyReadCount;
                    this.writeCount = _other.writeCount;
                    this.historyUpdateCount = _other.historyUpdateCount;
                    this.callCount = _other.callCount;
                    this.createMonitoredItemsCount = _other.createMonitoredItemsCount;
                    this.modifyMonitoredItemsCount = _other.modifyMonitoredItemsCount;
                    this.setMonitoringModeCount = _other.setMonitoringModeCount;
                    this.setTriggeringCount = _other.setTriggeringCount;
                    this.deleteMonitoredItemsCount = _other.deleteMonitoredItemsCount;
                    this.createSubscriptionCount = _other.createSubscriptionCount;
                    this.modifySubscriptionCount = _other.modifySubscriptionCount;
                    this.setPublishingModeCount = _other.setPublishingModeCount;
                    this.publishCount = _other.publishCount;
                    this.republishCount = _other.republishCount;
                    this.transferSubscriptionsCount = _other.transferSubscriptionsCount;
                    this.deleteSubscriptionsCount = _other.deleteSubscriptionsCount;
                    this.addNodesCount = _other.addNodesCount;
                    this.addReferencesCount = _other.addReferencesCount;
                    this.deleteNodesCount = _other.deleteNodesCount;
                    this.deleteReferencesCount = _other.deleteReferencesCount;
                    this.browseCount = _other.browseCount;
                    this.browseNextCount = _other.browseNextCount;
                    this.translateBrowsePathsToNodeIdsCount = _other.translateBrowsePathsToNodeIdsCount;
                    this.queryFirstCount = _other.queryFirstCount;
                    this.queryNextCount = _other.queryNextCount;
                    this.registerNodesCount = _other.registerNodesCount;
                    this.unregisterNodesCount = _other.unregisterNodesCount;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SessionDiagnosticsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree sessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionIdPropertyTree!= null):((sessionIdPropertyTree == null)||(!sessionIdPropertyTree.isLeaf())))) {
                        this.sessionId = _other.sessionId;
                    }
                    final PropertyTree sessionNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionNamePropertyTree!= null):((sessionNamePropertyTree == null)||(!sessionNamePropertyTree.isLeaf())))) {
                        this.sessionName = _other.sessionName;
                    }
                    final PropertyTree clientDescriptionPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientDescription"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientDescriptionPropertyTree!= null):((clientDescriptionPropertyTree == null)||(!clientDescriptionPropertyTree.isLeaf())))) {
                        this.clientDescription = _other.clientDescription;
                    }
                    final PropertyTree serverUriPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverUri"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverUriPropertyTree!= null):((serverUriPropertyTree == null)||(!serverUriPropertyTree.isLeaf())))) {
                        this.serverUri = _other.serverUri;
                    }
                    final PropertyTree endpointUrlPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("endpointUrl"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(endpointUrlPropertyTree!= null):((endpointUrlPropertyTree == null)||(!endpointUrlPropertyTree.isLeaf())))) {
                        this.endpointUrl = _other.endpointUrl;
                    }
                    final PropertyTree localeIdsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("localeIds"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(localeIdsPropertyTree!= null):((localeIdsPropertyTree == null)||(!localeIdsPropertyTree.isLeaf())))) {
                        this.localeIds = _other.localeIds;
                    }
                    final PropertyTree actualSessionTimeoutPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("actualSessionTimeout"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(actualSessionTimeoutPropertyTree!= null):((actualSessionTimeoutPropertyTree == null)||(!actualSessionTimeoutPropertyTree.isLeaf())))) {
                        this.actualSessionTimeout = _other.actualSessionTimeout;
                    }
                    final PropertyTree maxResponseMessageSizePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxResponseMessageSize"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxResponseMessageSizePropertyTree!= null):((maxResponseMessageSizePropertyTree == null)||(!maxResponseMessageSizePropertyTree.isLeaf())))) {
                        this.maxResponseMessageSize = _other.maxResponseMessageSize;
                    }
                    final PropertyTree clientConnectionTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientConnectionTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientConnectionTimePropertyTree!= null):((clientConnectionTimePropertyTree == null)||(!clientConnectionTimePropertyTree.isLeaf())))) {
                        this.clientConnectionTime = ((_other.clientConnectionTime == null)?null:((XMLGregorianCalendar) _other.clientConnectionTime.clone()));
                    }
                    final PropertyTree clientLastContactTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("clientLastContactTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(clientLastContactTimePropertyTree!= null):((clientLastContactTimePropertyTree == null)||(!clientLastContactTimePropertyTree.isLeaf())))) {
                        this.clientLastContactTime = ((_other.clientLastContactTime == null)?null:((XMLGregorianCalendar) _other.clientLastContactTime.clone()));
                    }
                    final PropertyTree currentSubscriptionsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentSubscriptionsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentSubscriptionsCountPropertyTree!= null):((currentSubscriptionsCountPropertyTree == null)||(!currentSubscriptionsCountPropertyTree.isLeaf())))) {
                        this.currentSubscriptionsCount = _other.currentSubscriptionsCount;
                    }
                    final PropertyTree currentMonitoredItemsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentMonitoredItemsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentMonitoredItemsCountPropertyTree!= null):((currentMonitoredItemsCountPropertyTree == null)||(!currentMonitoredItemsCountPropertyTree.isLeaf())))) {
                        this.currentMonitoredItemsCount = _other.currentMonitoredItemsCount;
                    }
                    final PropertyTree currentPublishRequestsInQueuePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentPublishRequestsInQueue"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentPublishRequestsInQueuePropertyTree!= null):((currentPublishRequestsInQueuePropertyTree == null)||(!currentPublishRequestsInQueuePropertyTree.isLeaf())))) {
                        this.currentPublishRequestsInQueue = _other.currentPublishRequestsInQueue;
                    }
                    final PropertyTree totalRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("totalRequestCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(totalRequestCountPropertyTree!= null):((totalRequestCountPropertyTree == null)||(!totalRequestCountPropertyTree.isLeaf())))) {
                        this.totalRequestCount = _other.totalRequestCount;
                    }
                    final PropertyTree unauthorizedRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("unauthorizedRequestCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unauthorizedRequestCountPropertyTree!= null):((unauthorizedRequestCountPropertyTree == null)||(!unauthorizedRequestCountPropertyTree.isLeaf())))) {
                        this.unauthorizedRequestCount = _other.unauthorizedRequestCount;
                    }
                    final PropertyTree readCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("readCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(readCountPropertyTree!= null):((readCountPropertyTree == null)||(!readCountPropertyTree.isLeaf())))) {
                        this.readCount = _other.readCount;
                    }
                    final PropertyTree historyReadCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyReadCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyReadCountPropertyTree!= null):((historyReadCountPropertyTree == null)||(!historyReadCountPropertyTree.isLeaf())))) {
                        this.historyReadCount = _other.historyReadCount;
                    }
                    final PropertyTree writeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("writeCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(writeCountPropertyTree!= null):((writeCountPropertyTree == null)||(!writeCountPropertyTree.isLeaf())))) {
                        this.writeCount = _other.writeCount;
                    }
                    final PropertyTree historyUpdateCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("historyUpdateCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(historyUpdateCountPropertyTree!= null):((historyUpdateCountPropertyTree == null)||(!historyUpdateCountPropertyTree.isLeaf())))) {
                        this.historyUpdateCount = _other.historyUpdateCount;
                    }
                    final PropertyTree callCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("callCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(callCountPropertyTree!= null):((callCountPropertyTree == null)||(!callCountPropertyTree.isLeaf())))) {
                        this.callCount = _other.callCount;
                    }
                    final PropertyTree createMonitoredItemsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createMonitoredItemsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createMonitoredItemsCountPropertyTree!= null):((createMonitoredItemsCountPropertyTree == null)||(!createMonitoredItemsCountPropertyTree.isLeaf())))) {
                        this.createMonitoredItemsCount = _other.createMonitoredItemsCount;
                    }
                    final PropertyTree modifyMonitoredItemsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modifyMonitoredItemsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modifyMonitoredItemsCountPropertyTree!= null):((modifyMonitoredItemsCountPropertyTree == null)||(!modifyMonitoredItemsCountPropertyTree.isLeaf())))) {
                        this.modifyMonitoredItemsCount = _other.modifyMonitoredItemsCount;
                    }
                    final PropertyTree setMonitoringModeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("setMonitoringModeCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(setMonitoringModeCountPropertyTree!= null):((setMonitoringModeCountPropertyTree == null)||(!setMonitoringModeCountPropertyTree.isLeaf())))) {
                        this.setMonitoringModeCount = _other.setMonitoringModeCount;
                    }
                    final PropertyTree setTriggeringCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("setTriggeringCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(setTriggeringCountPropertyTree!= null):((setTriggeringCountPropertyTree == null)||(!setTriggeringCountPropertyTree.isLeaf())))) {
                        this.setTriggeringCount = _other.setTriggeringCount;
                    }
                    final PropertyTree deleteMonitoredItemsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteMonitoredItemsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteMonitoredItemsCountPropertyTree!= null):((deleteMonitoredItemsCountPropertyTree == null)||(!deleteMonitoredItemsCountPropertyTree.isLeaf())))) {
                        this.deleteMonitoredItemsCount = _other.deleteMonitoredItemsCount;
                    }
                    final PropertyTree createSubscriptionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createSubscriptionCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createSubscriptionCountPropertyTree!= null):((createSubscriptionCountPropertyTree == null)||(!createSubscriptionCountPropertyTree.isLeaf())))) {
                        this.createSubscriptionCount = _other.createSubscriptionCount;
                    }
                    final PropertyTree modifySubscriptionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modifySubscriptionCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modifySubscriptionCountPropertyTree!= null):((modifySubscriptionCountPropertyTree == null)||(!modifySubscriptionCountPropertyTree.isLeaf())))) {
                        this.modifySubscriptionCount = _other.modifySubscriptionCount;
                    }
                    final PropertyTree setPublishingModeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("setPublishingModeCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(setPublishingModeCountPropertyTree!= null):((setPublishingModeCountPropertyTree == null)||(!setPublishingModeCountPropertyTree.isLeaf())))) {
                        this.setPublishingModeCount = _other.setPublishingModeCount;
                    }
                    final PropertyTree publishCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishCountPropertyTree!= null):((publishCountPropertyTree == null)||(!publishCountPropertyTree.isLeaf())))) {
                        this.publishCount = _other.publishCount;
                    }
                    final PropertyTree republishCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("republishCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(republishCountPropertyTree!= null):((republishCountPropertyTree == null)||(!republishCountPropertyTree.isLeaf())))) {
                        this.republishCount = _other.republishCount;
                    }
                    final PropertyTree transferSubscriptionsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferSubscriptionsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferSubscriptionsCountPropertyTree!= null):((transferSubscriptionsCountPropertyTree == null)||(!transferSubscriptionsCountPropertyTree.isLeaf())))) {
                        this.transferSubscriptionsCount = _other.transferSubscriptionsCount;
                    }
                    final PropertyTree deleteSubscriptionsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteSubscriptionsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteSubscriptionsCountPropertyTree!= null):((deleteSubscriptionsCountPropertyTree == null)||(!deleteSubscriptionsCountPropertyTree.isLeaf())))) {
                        this.deleteSubscriptionsCount = _other.deleteSubscriptionsCount;
                    }
                    final PropertyTree addNodesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addNodesCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addNodesCountPropertyTree!= null):((addNodesCountPropertyTree == null)||(!addNodesCountPropertyTree.isLeaf())))) {
                        this.addNodesCount = _other.addNodesCount;
                    }
                    final PropertyTree addReferencesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("addReferencesCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(addReferencesCountPropertyTree!= null):((addReferencesCountPropertyTree == null)||(!addReferencesCountPropertyTree.isLeaf())))) {
                        this.addReferencesCount = _other.addReferencesCount;
                    }
                    final PropertyTree deleteNodesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteNodesCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteNodesCountPropertyTree!= null):((deleteNodesCountPropertyTree == null)||(!deleteNodesCountPropertyTree.isLeaf())))) {
                        this.deleteNodesCount = _other.deleteNodesCount;
                    }
                    final PropertyTree deleteReferencesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("deleteReferencesCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(deleteReferencesCountPropertyTree!= null):((deleteReferencesCountPropertyTree == null)||(!deleteReferencesCountPropertyTree.isLeaf())))) {
                        this.deleteReferencesCount = _other.deleteReferencesCount;
                    }
                    final PropertyTree browseCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseCountPropertyTree!= null):((browseCountPropertyTree == null)||(!browseCountPropertyTree.isLeaf())))) {
                        this.browseCount = _other.browseCount;
                    }
                    final PropertyTree browseNextCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("browseNextCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(browseNextCountPropertyTree!= null):((browseNextCountPropertyTree == null)||(!browseNextCountPropertyTree.isLeaf())))) {
                        this.browseNextCount = _other.browseNextCount;
                    }
                    final PropertyTree translateBrowsePathsToNodeIdsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("translateBrowsePathsToNodeIdsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(translateBrowsePathsToNodeIdsCountPropertyTree!= null):((translateBrowsePathsToNodeIdsCountPropertyTree == null)||(!translateBrowsePathsToNodeIdsCountPropertyTree.isLeaf())))) {
                        this.translateBrowsePathsToNodeIdsCount = _other.translateBrowsePathsToNodeIdsCount;
                    }
                    final PropertyTree queryFirstCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryFirstCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryFirstCountPropertyTree!= null):((queryFirstCountPropertyTree == null)||(!queryFirstCountPropertyTree.isLeaf())))) {
                        this.queryFirstCount = _other.queryFirstCount;
                    }
                    final PropertyTree queryNextCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("queryNextCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(queryNextCountPropertyTree!= null):((queryNextCountPropertyTree == null)||(!queryNextCountPropertyTree.isLeaf())))) {
                        this.queryNextCount = _other.queryNextCount;
                    }
                    final PropertyTree registerNodesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("registerNodesCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(registerNodesCountPropertyTree!= null):((registerNodesCountPropertyTree == null)||(!registerNodesCountPropertyTree.isLeaf())))) {
                        this.registerNodesCount = _other.registerNodesCount;
                    }
                    final PropertyTree unregisterNodesCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("unregisterNodesCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unregisterNodesCountPropertyTree!= null):((unregisterNodesCountPropertyTree == null)||(!unregisterNodesCountPropertyTree.isLeaf())))) {
                        this.unregisterNodesCount = _other.unregisterNodesCount;
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

        protected<_P extends SessionDiagnosticsDataType >_P init(final _P _product) {
            _product.sessionId = this.sessionId;
            _product.sessionName = this.sessionName;
            _product.clientDescription = this.clientDescription;
            _product.serverUri = this.serverUri;
            _product.endpointUrl = this.endpointUrl;
            _product.localeIds = this.localeIds;
            _product.actualSessionTimeout = this.actualSessionTimeout;
            _product.maxResponseMessageSize = this.maxResponseMessageSize;
            _product.clientConnectionTime = this.clientConnectionTime;
            _product.clientLastContactTime = this.clientLastContactTime;
            _product.currentSubscriptionsCount = this.currentSubscriptionsCount;
            _product.currentMonitoredItemsCount = this.currentMonitoredItemsCount;
            _product.currentPublishRequestsInQueue = this.currentPublishRequestsInQueue;
            _product.totalRequestCount = this.totalRequestCount;
            _product.unauthorizedRequestCount = this.unauthorizedRequestCount;
            _product.readCount = this.readCount;
            _product.historyReadCount = this.historyReadCount;
            _product.writeCount = this.writeCount;
            _product.historyUpdateCount = this.historyUpdateCount;
            _product.callCount = this.callCount;
            _product.createMonitoredItemsCount = this.createMonitoredItemsCount;
            _product.modifyMonitoredItemsCount = this.modifyMonitoredItemsCount;
            _product.setMonitoringModeCount = this.setMonitoringModeCount;
            _product.setTriggeringCount = this.setTriggeringCount;
            _product.deleteMonitoredItemsCount = this.deleteMonitoredItemsCount;
            _product.createSubscriptionCount = this.createSubscriptionCount;
            _product.modifySubscriptionCount = this.modifySubscriptionCount;
            _product.setPublishingModeCount = this.setPublishingModeCount;
            _product.publishCount = this.publishCount;
            _product.republishCount = this.republishCount;
            _product.transferSubscriptionsCount = this.transferSubscriptionsCount;
            _product.deleteSubscriptionsCount = this.deleteSubscriptionsCount;
            _product.addNodesCount = this.addNodesCount;
            _product.addReferencesCount = this.addReferencesCount;
            _product.deleteNodesCount = this.deleteNodesCount;
            _product.deleteReferencesCount = this.deleteReferencesCount;
            _product.browseCount = this.browseCount;
            _product.browseNextCount = this.browseNextCount;
            _product.translateBrowsePathsToNodeIdsCount = this.translateBrowsePathsToNodeIdsCount;
            _product.queryFirstCount = this.queryFirstCount;
            _product.queryNextCount = this.queryNextCount;
            _product.registerNodesCount = this.registerNodesCount;
            _product.unregisterNodesCount = this.unregisterNodesCount;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param sessionId
         *     Neuer Wert der Eigenschaft "sessionId".
         */
        public SessionDiagnosticsDataType.Builder<_B> withSessionId(final JAXBElement<NodeId> sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param sessionName
         *     Neuer Wert der Eigenschaft "sessionName".
         */
        public SessionDiagnosticsDataType.Builder<_B> withSessionName(final JAXBElement<String> sessionName) {
            this.sessionName = sessionName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientDescription" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param clientDescription
         *     Neuer Wert der Eigenschaft "clientDescription".
         */
        public SessionDiagnosticsDataType.Builder<_B> withClientDescription(final JAXBElement<ApplicationDescription> clientDescription) {
            this.clientDescription = clientDescription;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverUri" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param serverUri
         *     Neuer Wert der Eigenschaft "serverUri".
         */
        public SessionDiagnosticsDataType.Builder<_B> withServerUri(final JAXBElement<String> serverUri) {
            this.serverUri = serverUri;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "endpointUrl" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param endpointUrl
         *     Neuer Wert der Eigenschaft "endpointUrl".
         */
        public SessionDiagnosticsDataType.Builder<_B> withEndpointUrl(final JAXBElement<String> endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "localeIds" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param localeIds
         *     Neuer Wert der Eigenschaft "localeIds".
         */
        public SessionDiagnosticsDataType.Builder<_B> withLocaleIds(final JAXBElement<ListOfString> localeIds) {
            this.localeIds = localeIds;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "actualSessionTimeout" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param actualSessionTimeout
         *     Neuer Wert der Eigenschaft "actualSessionTimeout".
         */
        public SessionDiagnosticsDataType.Builder<_B> withActualSessionTimeout(final Double actualSessionTimeout) {
            this.actualSessionTimeout = actualSessionTimeout;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxResponseMessageSize" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxResponseMessageSize
         *     Neuer Wert der Eigenschaft "maxResponseMessageSize".
         */
        public SessionDiagnosticsDataType.Builder<_B> withMaxResponseMessageSize(final Long maxResponseMessageSize) {
            this.maxResponseMessageSize = maxResponseMessageSize;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientConnectionTime" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param clientConnectionTime
         *     Neuer Wert der Eigenschaft "clientConnectionTime".
         */
        public SessionDiagnosticsDataType.Builder<_B> withClientConnectionTime(final XMLGregorianCalendar clientConnectionTime) {
            this.clientConnectionTime = clientConnectionTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "clientLastContactTime" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param clientLastContactTime
         *     Neuer Wert der Eigenschaft "clientLastContactTime".
         */
        public SessionDiagnosticsDataType.Builder<_B> withClientLastContactTime(final XMLGregorianCalendar clientLastContactTime) {
            this.clientLastContactTime = clientLastContactTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currentSubscriptionsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param currentSubscriptionsCount
         *     Neuer Wert der Eigenschaft "currentSubscriptionsCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withCurrentSubscriptionsCount(final Long currentSubscriptionsCount) {
            this.currentSubscriptionsCount = currentSubscriptionsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currentMonitoredItemsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param currentMonitoredItemsCount
         *     Neuer Wert der Eigenschaft "currentMonitoredItemsCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withCurrentMonitoredItemsCount(final Long currentMonitoredItemsCount) {
            this.currentMonitoredItemsCount = currentMonitoredItemsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currentPublishRequestsInQueue" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param currentPublishRequestsInQueue
         *     Neuer Wert der Eigenschaft "currentPublishRequestsInQueue".
         */
        public SessionDiagnosticsDataType.Builder<_B> withCurrentPublishRequestsInQueue(final Long currentPublishRequestsInQueue) {
            this.currentPublishRequestsInQueue = currentPublishRequestsInQueue;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "totalRequestCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param totalRequestCount
         *     Neuer Wert der Eigenschaft "totalRequestCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withTotalRequestCount(final JAXBElement<ServiceCounterDataType> totalRequestCount) {
            this.totalRequestCount = totalRequestCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "unauthorizedRequestCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param unauthorizedRequestCount
         *     Neuer Wert der Eigenschaft "unauthorizedRequestCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withUnauthorizedRequestCount(final Long unauthorizedRequestCount) {
            this.unauthorizedRequestCount = unauthorizedRequestCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "readCount" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param readCount
         *     Neuer Wert der Eigenschaft "readCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withReadCount(final JAXBElement<ServiceCounterDataType> readCount) {
            this.readCount = readCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyReadCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyReadCount
         *     Neuer Wert der Eigenschaft "historyReadCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withHistoryReadCount(final JAXBElement<ServiceCounterDataType> historyReadCount) {
            this.historyReadCount = historyReadCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeCount" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeCount
         *     Neuer Wert der Eigenschaft "writeCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withWriteCount(final JAXBElement<ServiceCounterDataType> writeCount) {
            this.writeCount = writeCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "historyUpdateCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param historyUpdateCount
         *     Neuer Wert der Eigenschaft "historyUpdateCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withHistoryUpdateCount(final JAXBElement<ServiceCounterDataType> historyUpdateCount) {
            this.historyUpdateCount = historyUpdateCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "callCount" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param callCount
         *     Neuer Wert der Eigenschaft "callCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withCallCount(final JAXBElement<ServiceCounterDataType> callCount) {
            this.callCount = callCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "createMonitoredItemsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param createMonitoredItemsCount
         *     Neuer Wert der Eigenschaft "createMonitoredItemsCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withCreateMonitoredItemsCount(final JAXBElement<ServiceCounterDataType> createMonitoredItemsCount) {
            this.createMonitoredItemsCount = createMonitoredItemsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modifyMonitoredItemsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param modifyMonitoredItemsCount
         *     Neuer Wert der Eigenschaft "modifyMonitoredItemsCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withModifyMonitoredItemsCount(final JAXBElement<ServiceCounterDataType> modifyMonitoredItemsCount) {
            this.modifyMonitoredItemsCount = modifyMonitoredItemsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "setMonitoringModeCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param setMonitoringModeCount
         *     Neuer Wert der Eigenschaft "setMonitoringModeCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withSetMonitoringModeCount(final JAXBElement<ServiceCounterDataType> setMonitoringModeCount) {
            this.setMonitoringModeCount = setMonitoringModeCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "setTriggeringCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param setTriggeringCount
         *     Neuer Wert der Eigenschaft "setTriggeringCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withSetTriggeringCount(final JAXBElement<ServiceCounterDataType> setTriggeringCount) {
            this.setTriggeringCount = setTriggeringCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteMonitoredItemsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param deleteMonitoredItemsCount
         *     Neuer Wert der Eigenschaft "deleteMonitoredItemsCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withDeleteMonitoredItemsCount(final JAXBElement<ServiceCounterDataType> deleteMonitoredItemsCount) {
            this.deleteMonitoredItemsCount = deleteMonitoredItemsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "createSubscriptionCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param createSubscriptionCount
         *     Neuer Wert der Eigenschaft "createSubscriptionCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withCreateSubscriptionCount(final JAXBElement<ServiceCounterDataType> createSubscriptionCount) {
            this.createSubscriptionCount = createSubscriptionCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modifySubscriptionCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param modifySubscriptionCount
         *     Neuer Wert der Eigenschaft "modifySubscriptionCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withModifySubscriptionCount(final JAXBElement<ServiceCounterDataType> modifySubscriptionCount) {
            this.modifySubscriptionCount = modifySubscriptionCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "setPublishingModeCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param setPublishingModeCount
         *     Neuer Wert der Eigenschaft "setPublishingModeCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withSetPublishingModeCount(final JAXBElement<ServiceCounterDataType> setPublishingModeCount) {
            this.setPublishingModeCount = setPublishingModeCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param publishCount
         *     Neuer Wert der Eigenschaft "publishCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withPublishCount(final JAXBElement<ServiceCounterDataType> publishCount) {
            this.publishCount = publishCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "republishCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param republishCount
         *     Neuer Wert der Eigenschaft "republishCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withRepublishCount(final JAXBElement<ServiceCounterDataType> republishCount) {
            this.republishCount = republishCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transferSubscriptionsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param transferSubscriptionsCount
         *     Neuer Wert der Eigenschaft "transferSubscriptionsCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withTransferSubscriptionsCount(final JAXBElement<ServiceCounterDataType> transferSubscriptionsCount) {
            this.transferSubscriptionsCount = transferSubscriptionsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteSubscriptionsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param deleteSubscriptionsCount
         *     Neuer Wert der Eigenschaft "deleteSubscriptionsCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withDeleteSubscriptionsCount(final JAXBElement<ServiceCounterDataType> deleteSubscriptionsCount) {
            this.deleteSubscriptionsCount = deleteSubscriptionsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addNodesCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param addNodesCount
         *     Neuer Wert der Eigenschaft "addNodesCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withAddNodesCount(final JAXBElement<ServiceCounterDataType> addNodesCount) {
            this.addNodesCount = addNodesCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "addReferencesCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param addReferencesCount
         *     Neuer Wert der Eigenschaft "addReferencesCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withAddReferencesCount(final JAXBElement<ServiceCounterDataType> addReferencesCount) {
            this.addReferencesCount = addReferencesCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteNodesCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param deleteNodesCount
         *     Neuer Wert der Eigenschaft "deleteNodesCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withDeleteNodesCount(final JAXBElement<ServiceCounterDataType> deleteNodesCount) {
            this.deleteNodesCount = deleteNodesCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "deleteReferencesCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param deleteReferencesCount
         *     Neuer Wert der Eigenschaft "deleteReferencesCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withDeleteReferencesCount(final JAXBElement<ServiceCounterDataType> deleteReferencesCount) {
            this.deleteReferencesCount = deleteReferencesCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param browseCount
         *     Neuer Wert der Eigenschaft "browseCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withBrowseCount(final JAXBElement<ServiceCounterDataType> browseCount) {
            this.browseCount = browseCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseNextCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param browseNextCount
         *     Neuer Wert der Eigenschaft "browseNextCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withBrowseNextCount(final JAXBElement<ServiceCounterDataType> browseNextCount) {
            this.browseNextCount = browseNextCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "translateBrowsePathsToNodeIdsCount"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param translateBrowsePathsToNodeIdsCount
         *     Neuer Wert der Eigenschaft "translateBrowsePathsToNodeIdsCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withTranslateBrowsePathsToNodeIdsCount(final JAXBElement<ServiceCounterDataType> translateBrowsePathsToNodeIdsCount) {
            this.translateBrowsePathsToNodeIdsCount = translateBrowsePathsToNodeIdsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queryFirstCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param queryFirstCount
         *     Neuer Wert der Eigenschaft "queryFirstCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withQueryFirstCount(final JAXBElement<ServiceCounterDataType> queryFirstCount) {
            this.queryFirstCount = queryFirstCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "queryNextCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param queryNextCount
         *     Neuer Wert der Eigenschaft "queryNextCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withQueryNextCount(final JAXBElement<ServiceCounterDataType> queryNextCount) {
            this.queryNextCount = queryNextCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "registerNodesCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param registerNodesCount
         *     Neuer Wert der Eigenschaft "registerNodesCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withRegisterNodesCount(final JAXBElement<ServiceCounterDataType> registerNodesCount) {
            this.registerNodesCount = registerNodesCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "unregisterNodesCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param unregisterNodesCount
         *     Neuer Wert der Eigenschaft "unregisterNodesCount".
         */
        public SessionDiagnosticsDataType.Builder<_B> withUnregisterNodesCount(final JAXBElement<ServiceCounterDataType> unregisterNodesCount) {
            this.unregisterNodesCount = unregisterNodesCount;
            return this;
        }

        @Override
        public SessionDiagnosticsDataType build() {
            if (_storedValue == null) {
                return this.init(new SessionDiagnosticsDataType());
            } else {
                return ((SessionDiagnosticsDataType) _storedValue);
            }
        }

        public SessionDiagnosticsDataType.Builder<_B> copyOf(final SessionDiagnosticsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public SessionDiagnosticsDataType.Builder<_B> copyOf(final SessionDiagnosticsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SessionDiagnosticsDataType.Selector<SessionDiagnosticsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SessionDiagnosticsDataType.Select _root() {
            return new SessionDiagnosticsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> sessionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> sessionName = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> clientDescription = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> serverUri = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> endpointUrl = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> localeIds = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> actualSessionTimeout = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> maxResponseMessageSize = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> clientConnectionTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> clientLastContactTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> currentSubscriptionsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> currentMonitoredItemsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> currentPublishRequestsInQueue = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> totalRequestCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> unauthorizedRequestCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> readCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> historyReadCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> writeCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> historyUpdateCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> callCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> createMonitoredItemsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> modifyMonitoredItemsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> setMonitoringModeCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> setTriggeringCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> deleteMonitoredItemsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> createSubscriptionCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> modifySubscriptionCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> setPublishingModeCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> publishCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> republishCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> transferSubscriptionsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> deleteSubscriptionsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> addNodesCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> addReferencesCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> deleteNodesCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> deleteReferencesCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> browseCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> browseNextCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> translateBrowsePathsToNodeIdsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> queryFirstCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> queryNextCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> registerNodesCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> unregisterNodesCount = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.sessionId!= null) {
                products.put("sessionId", this.sessionId.init());
            }
            if (this.sessionName!= null) {
                products.put("sessionName", this.sessionName.init());
            }
            if (this.clientDescription!= null) {
                products.put("clientDescription", this.clientDescription.init());
            }
            if (this.serverUri!= null) {
                products.put("serverUri", this.serverUri.init());
            }
            if (this.endpointUrl!= null) {
                products.put("endpointUrl", this.endpointUrl.init());
            }
            if (this.localeIds!= null) {
                products.put("localeIds", this.localeIds.init());
            }
            if (this.actualSessionTimeout!= null) {
                products.put("actualSessionTimeout", this.actualSessionTimeout.init());
            }
            if (this.maxResponseMessageSize!= null) {
                products.put("maxResponseMessageSize", this.maxResponseMessageSize.init());
            }
            if (this.clientConnectionTime!= null) {
                products.put("clientConnectionTime", this.clientConnectionTime.init());
            }
            if (this.clientLastContactTime!= null) {
                products.put("clientLastContactTime", this.clientLastContactTime.init());
            }
            if (this.currentSubscriptionsCount!= null) {
                products.put("currentSubscriptionsCount", this.currentSubscriptionsCount.init());
            }
            if (this.currentMonitoredItemsCount!= null) {
                products.put("currentMonitoredItemsCount", this.currentMonitoredItemsCount.init());
            }
            if (this.currentPublishRequestsInQueue!= null) {
                products.put("currentPublishRequestsInQueue", this.currentPublishRequestsInQueue.init());
            }
            if (this.totalRequestCount!= null) {
                products.put("totalRequestCount", this.totalRequestCount.init());
            }
            if (this.unauthorizedRequestCount!= null) {
                products.put("unauthorizedRequestCount", this.unauthorizedRequestCount.init());
            }
            if (this.readCount!= null) {
                products.put("readCount", this.readCount.init());
            }
            if (this.historyReadCount!= null) {
                products.put("historyReadCount", this.historyReadCount.init());
            }
            if (this.writeCount!= null) {
                products.put("writeCount", this.writeCount.init());
            }
            if (this.historyUpdateCount!= null) {
                products.put("historyUpdateCount", this.historyUpdateCount.init());
            }
            if (this.callCount!= null) {
                products.put("callCount", this.callCount.init());
            }
            if (this.createMonitoredItemsCount!= null) {
                products.put("createMonitoredItemsCount", this.createMonitoredItemsCount.init());
            }
            if (this.modifyMonitoredItemsCount!= null) {
                products.put("modifyMonitoredItemsCount", this.modifyMonitoredItemsCount.init());
            }
            if (this.setMonitoringModeCount!= null) {
                products.put("setMonitoringModeCount", this.setMonitoringModeCount.init());
            }
            if (this.setTriggeringCount!= null) {
                products.put("setTriggeringCount", this.setTriggeringCount.init());
            }
            if (this.deleteMonitoredItemsCount!= null) {
                products.put("deleteMonitoredItemsCount", this.deleteMonitoredItemsCount.init());
            }
            if (this.createSubscriptionCount!= null) {
                products.put("createSubscriptionCount", this.createSubscriptionCount.init());
            }
            if (this.modifySubscriptionCount!= null) {
                products.put("modifySubscriptionCount", this.modifySubscriptionCount.init());
            }
            if (this.setPublishingModeCount!= null) {
                products.put("setPublishingModeCount", this.setPublishingModeCount.init());
            }
            if (this.publishCount!= null) {
                products.put("publishCount", this.publishCount.init());
            }
            if (this.republishCount!= null) {
                products.put("republishCount", this.republishCount.init());
            }
            if (this.transferSubscriptionsCount!= null) {
                products.put("transferSubscriptionsCount", this.transferSubscriptionsCount.init());
            }
            if (this.deleteSubscriptionsCount!= null) {
                products.put("deleteSubscriptionsCount", this.deleteSubscriptionsCount.init());
            }
            if (this.addNodesCount!= null) {
                products.put("addNodesCount", this.addNodesCount.init());
            }
            if (this.addReferencesCount!= null) {
                products.put("addReferencesCount", this.addReferencesCount.init());
            }
            if (this.deleteNodesCount!= null) {
                products.put("deleteNodesCount", this.deleteNodesCount.init());
            }
            if (this.deleteReferencesCount!= null) {
                products.put("deleteReferencesCount", this.deleteReferencesCount.init());
            }
            if (this.browseCount!= null) {
                products.put("browseCount", this.browseCount.init());
            }
            if (this.browseNextCount!= null) {
                products.put("browseNextCount", this.browseNextCount.init());
            }
            if (this.translateBrowsePathsToNodeIdsCount!= null) {
                products.put("translateBrowsePathsToNodeIdsCount", this.translateBrowsePathsToNodeIdsCount.init());
            }
            if (this.queryFirstCount!= null) {
                products.put("queryFirstCount", this.queryFirstCount.init());
            }
            if (this.queryNextCount!= null) {
                products.put("queryNextCount", this.queryNextCount.init());
            }
            if (this.registerNodesCount!= null) {
                products.put("registerNodesCount", this.registerNodesCount.init());
            }
            if (this.unregisterNodesCount!= null) {
                products.put("unregisterNodesCount", this.unregisterNodesCount.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> sessionId() {
            return ((this.sessionId == null)?this.sessionId = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "sessionId"):this.sessionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> sessionName() {
            return ((this.sessionName == null)?this.sessionName = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "sessionName"):this.sessionName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> clientDescription() {
            return ((this.clientDescription == null)?this.clientDescription = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "clientDescription"):this.clientDescription);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> serverUri() {
            return ((this.serverUri == null)?this.serverUri = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "serverUri"):this.serverUri);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> endpointUrl() {
            return ((this.endpointUrl == null)?this.endpointUrl = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "endpointUrl"):this.endpointUrl);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> localeIds() {
            return ((this.localeIds == null)?this.localeIds = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "localeIds"):this.localeIds);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> actualSessionTimeout() {
            return ((this.actualSessionTimeout == null)?this.actualSessionTimeout = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "actualSessionTimeout"):this.actualSessionTimeout);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> maxResponseMessageSize() {
            return ((this.maxResponseMessageSize == null)?this.maxResponseMessageSize = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "maxResponseMessageSize"):this.maxResponseMessageSize);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> clientConnectionTime() {
            return ((this.clientConnectionTime == null)?this.clientConnectionTime = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "clientConnectionTime"):this.clientConnectionTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> clientLastContactTime() {
            return ((this.clientLastContactTime == null)?this.clientLastContactTime = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "clientLastContactTime"):this.clientLastContactTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> currentSubscriptionsCount() {
            return ((this.currentSubscriptionsCount == null)?this.currentSubscriptionsCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "currentSubscriptionsCount"):this.currentSubscriptionsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> currentMonitoredItemsCount() {
            return ((this.currentMonitoredItemsCount == null)?this.currentMonitoredItemsCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "currentMonitoredItemsCount"):this.currentMonitoredItemsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> currentPublishRequestsInQueue() {
            return ((this.currentPublishRequestsInQueue == null)?this.currentPublishRequestsInQueue = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "currentPublishRequestsInQueue"):this.currentPublishRequestsInQueue);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> totalRequestCount() {
            return ((this.totalRequestCount == null)?this.totalRequestCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "totalRequestCount"):this.totalRequestCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> unauthorizedRequestCount() {
            return ((this.unauthorizedRequestCount == null)?this.unauthorizedRequestCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "unauthorizedRequestCount"):this.unauthorizedRequestCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> readCount() {
            return ((this.readCount == null)?this.readCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "readCount"):this.readCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> historyReadCount() {
            return ((this.historyReadCount == null)?this.historyReadCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "historyReadCount"):this.historyReadCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> writeCount() {
            return ((this.writeCount == null)?this.writeCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "writeCount"):this.writeCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> historyUpdateCount() {
            return ((this.historyUpdateCount == null)?this.historyUpdateCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "historyUpdateCount"):this.historyUpdateCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> callCount() {
            return ((this.callCount == null)?this.callCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "callCount"):this.callCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> createMonitoredItemsCount() {
            return ((this.createMonitoredItemsCount == null)?this.createMonitoredItemsCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "createMonitoredItemsCount"):this.createMonitoredItemsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> modifyMonitoredItemsCount() {
            return ((this.modifyMonitoredItemsCount == null)?this.modifyMonitoredItemsCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "modifyMonitoredItemsCount"):this.modifyMonitoredItemsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> setMonitoringModeCount() {
            return ((this.setMonitoringModeCount == null)?this.setMonitoringModeCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "setMonitoringModeCount"):this.setMonitoringModeCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> setTriggeringCount() {
            return ((this.setTriggeringCount == null)?this.setTriggeringCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "setTriggeringCount"):this.setTriggeringCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> deleteMonitoredItemsCount() {
            return ((this.deleteMonitoredItemsCount == null)?this.deleteMonitoredItemsCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "deleteMonitoredItemsCount"):this.deleteMonitoredItemsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> createSubscriptionCount() {
            return ((this.createSubscriptionCount == null)?this.createSubscriptionCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "createSubscriptionCount"):this.createSubscriptionCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> modifySubscriptionCount() {
            return ((this.modifySubscriptionCount == null)?this.modifySubscriptionCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "modifySubscriptionCount"):this.modifySubscriptionCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> setPublishingModeCount() {
            return ((this.setPublishingModeCount == null)?this.setPublishingModeCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "setPublishingModeCount"):this.setPublishingModeCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> publishCount() {
            return ((this.publishCount == null)?this.publishCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "publishCount"):this.publishCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> republishCount() {
            return ((this.republishCount == null)?this.republishCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "republishCount"):this.republishCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> transferSubscriptionsCount() {
            return ((this.transferSubscriptionsCount == null)?this.transferSubscriptionsCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "transferSubscriptionsCount"):this.transferSubscriptionsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> deleteSubscriptionsCount() {
            return ((this.deleteSubscriptionsCount == null)?this.deleteSubscriptionsCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "deleteSubscriptionsCount"):this.deleteSubscriptionsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> addNodesCount() {
            return ((this.addNodesCount == null)?this.addNodesCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "addNodesCount"):this.addNodesCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> addReferencesCount() {
            return ((this.addReferencesCount == null)?this.addReferencesCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "addReferencesCount"):this.addReferencesCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> deleteNodesCount() {
            return ((this.deleteNodesCount == null)?this.deleteNodesCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "deleteNodesCount"):this.deleteNodesCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> deleteReferencesCount() {
            return ((this.deleteReferencesCount == null)?this.deleteReferencesCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "deleteReferencesCount"):this.deleteReferencesCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> browseCount() {
            return ((this.browseCount == null)?this.browseCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "browseCount"):this.browseCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> browseNextCount() {
            return ((this.browseNextCount == null)?this.browseNextCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "browseNextCount"):this.browseNextCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> translateBrowsePathsToNodeIdsCount() {
            return ((this.translateBrowsePathsToNodeIdsCount == null)?this.translateBrowsePathsToNodeIdsCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "translateBrowsePathsToNodeIdsCount"):this.translateBrowsePathsToNodeIdsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> queryFirstCount() {
            return ((this.queryFirstCount == null)?this.queryFirstCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "queryFirstCount"):this.queryFirstCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> queryNextCount() {
            return ((this.queryNextCount == null)?this.queryNextCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "queryNextCount"):this.queryNextCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> registerNodesCount() {
            return ((this.registerNodesCount == null)?this.registerNodesCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "registerNodesCount"):this.registerNodesCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>> unregisterNodesCount() {
            return ((this.unregisterNodesCount == null)?this.unregisterNodesCount = new com.kscs.util.jaxb.Selector<TRoot, SessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "unregisterNodesCount"):this.unregisterNodesCount);
        }

    }

}
