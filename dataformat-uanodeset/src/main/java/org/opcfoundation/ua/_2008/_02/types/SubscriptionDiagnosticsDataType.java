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
 * <p>Java-Klasse für SubscriptionDiagnosticsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionDiagnosticsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="PublishingInterval" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MaxKeepAliveCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MaxLifetimeCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MaxNotificationsPerPublish" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="PublishingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ModifyCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="EnableCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DisableCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RepublishRequestCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RepublishMessageRequestCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RepublishMessageCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TransferRequestCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TransferredToAltClientCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TransferredToSameClientCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="PublishRequestCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DataChangeNotificationsCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="EventNotificationsCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NotificationsCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="LatePublishRequestCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CurrentKeepAliveCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CurrentLifetimeCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="UnacknowledgedMessageCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DiscardedMessageCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MonitoredItemCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DisabledMonitoredItemCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringQueueOverflowCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NextSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="EventQueueOverFlowCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionDiagnosticsDataType", propOrder = {
    "sessionId",
    "subscriptionId",
    "priority",
    "publishingInterval",
    "maxKeepAliveCount",
    "maxLifetimeCount",
    "maxNotificationsPerPublish",
    "publishingEnabled",
    "modifyCount",
    "enableCount",
    "disableCount",
    "republishRequestCount",
    "republishMessageRequestCount",
    "republishMessageCount",
    "transferRequestCount",
    "transferredToAltClientCount",
    "transferredToSameClientCount",
    "publishRequestCount",
    "dataChangeNotificationsCount",
    "eventNotificationsCount",
    "notificationsCount",
    "latePublishRequestCount",
    "currentKeepAliveCount",
    "currentLifetimeCount",
    "unacknowledgedMessageCount",
    "discardedMessageCount",
    "monitoredItemCount",
    "disabledMonitoredItemCount",
    "monitoringQueueOverflowCount",
    "nextSequenceNumber",
    "eventQueueOverFlowCount"
})
public class SubscriptionDiagnosticsDataType {

    @XmlElementRef(name = "SessionId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> sessionId;
    @XmlElement(name = "SubscriptionId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriptionId;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "unsignedByte")
    protected Short priority;
    @XmlElement(name = "PublishingInterval")
    protected Double publishingInterval;
    @XmlElement(name = "MaxKeepAliveCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxKeepAliveCount;
    @XmlElement(name = "MaxLifetimeCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxLifetimeCount;
    @XmlElement(name = "MaxNotificationsPerPublish")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxNotificationsPerPublish;
    @XmlElement(name = "PublishingEnabled")
    protected Boolean publishingEnabled;
    @XmlElement(name = "ModifyCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long modifyCount;
    @XmlElement(name = "EnableCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long enableCount;
    @XmlElement(name = "DisableCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long disableCount;
    @XmlElement(name = "RepublishRequestCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long republishRequestCount;
    @XmlElement(name = "RepublishMessageRequestCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long republishMessageRequestCount;
    @XmlElement(name = "RepublishMessageCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long republishMessageCount;
    @XmlElement(name = "TransferRequestCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long transferRequestCount;
    @XmlElement(name = "TransferredToAltClientCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long transferredToAltClientCount;
    @XmlElement(name = "TransferredToSameClientCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long transferredToSameClientCount;
    @XmlElement(name = "PublishRequestCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long publishRequestCount;
    @XmlElement(name = "DataChangeNotificationsCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long dataChangeNotificationsCount;
    @XmlElement(name = "EventNotificationsCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long eventNotificationsCount;
    @XmlElement(name = "NotificationsCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long notificationsCount;
    @XmlElement(name = "LatePublishRequestCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long latePublishRequestCount;
    @XmlElement(name = "CurrentKeepAliveCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentKeepAliveCount;
    @XmlElement(name = "CurrentLifetimeCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentLifetimeCount;
    @XmlElement(name = "UnacknowledgedMessageCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long unacknowledgedMessageCount;
    @XmlElement(name = "DiscardedMessageCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long discardedMessageCount;
    @XmlElement(name = "MonitoredItemCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long monitoredItemCount;
    @XmlElement(name = "DisabledMonitoredItemCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long disabledMonitoredItemCount;
    @XmlElement(name = "MonitoringQueueOverflowCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long monitoringQueueOverflowCount;
    @XmlElement(name = "NextSequenceNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected Long nextSequenceNumber;
    @XmlElement(name = "EventQueueOverFlowCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long eventQueueOverFlowCount;

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
     * Ruft den Wert der subscriptionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Legt den Wert der subscriptionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriptionId(Long value) {
        this.subscriptionId = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriority(Short value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der publishingInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPublishingInterval() {
        return publishingInterval;
    }

    /**
     * Legt den Wert der publishingInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPublishingInterval(Double value) {
        this.publishingInterval = value;
    }

    /**
     * Ruft den Wert der maxKeepAliveCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxKeepAliveCount() {
        return maxKeepAliveCount;
    }

    /**
     * Legt den Wert der maxKeepAliveCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxKeepAliveCount(Long value) {
        this.maxKeepAliveCount = value;
    }

    /**
     * Ruft den Wert der maxLifetimeCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLifetimeCount() {
        return maxLifetimeCount;
    }

    /**
     * Legt den Wert der maxLifetimeCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLifetimeCount(Long value) {
        this.maxLifetimeCount = value;
    }

    /**
     * Ruft den Wert der maxNotificationsPerPublish-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxNotificationsPerPublish() {
        return maxNotificationsPerPublish;
    }

    /**
     * Legt den Wert der maxNotificationsPerPublish-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxNotificationsPerPublish(Long value) {
        this.maxNotificationsPerPublish = value;
    }

    /**
     * Ruft den Wert der publishingEnabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishingEnabled() {
        return publishingEnabled;
    }

    /**
     * Legt den Wert der publishingEnabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishingEnabled(Boolean value) {
        this.publishingEnabled = value;
    }

    /**
     * Ruft den Wert der modifyCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModifyCount() {
        return modifyCount;
    }

    /**
     * Legt den Wert der modifyCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModifyCount(Long value) {
        this.modifyCount = value;
    }

    /**
     * Ruft den Wert der enableCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnableCount() {
        return enableCount;
    }

    /**
     * Legt den Wert der enableCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnableCount(Long value) {
        this.enableCount = value;
    }

    /**
     * Ruft den Wert der disableCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisableCount() {
        return disableCount;
    }

    /**
     * Legt den Wert der disableCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisableCount(Long value) {
        this.disableCount = value;
    }

    /**
     * Ruft den Wert der republishRequestCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepublishRequestCount() {
        return republishRequestCount;
    }

    /**
     * Legt den Wert der republishRequestCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepublishRequestCount(Long value) {
        this.republishRequestCount = value;
    }

    /**
     * Ruft den Wert der republishMessageRequestCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepublishMessageRequestCount() {
        return republishMessageRequestCount;
    }

    /**
     * Legt den Wert der republishMessageRequestCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepublishMessageRequestCount(Long value) {
        this.republishMessageRequestCount = value;
    }

    /**
     * Ruft den Wert der republishMessageCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepublishMessageCount() {
        return republishMessageCount;
    }

    /**
     * Legt den Wert der republishMessageCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepublishMessageCount(Long value) {
        this.republishMessageCount = value;
    }

    /**
     * Ruft den Wert der transferRequestCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferRequestCount() {
        return transferRequestCount;
    }

    /**
     * Legt den Wert der transferRequestCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferRequestCount(Long value) {
        this.transferRequestCount = value;
    }

    /**
     * Ruft den Wert der transferredToAltClientCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferredToAltClientCount() {
        return transferredToAltClientCount;
    }

    /**
     * Legt den Wert der transferredToAltClientCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferredToAltClientCount(Long value) {
        this.transferredToAltClientCount = value;
    }

    /**
     * Ruft den Wert der transferredToSameClientCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferredToSameClientCount() {
        return transferredToSameClientCount;
    }

    /**
     * Legt den Wert der transferredToSameClientCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferredToSameClientCount(Long value) {
        this.transferredToSameClientCount = value;
    }

    /**
     * Ruft den Wert der publishRequestCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPublishRequestCount() {
        return publishRequestCount;
    }

    /**
     * Legt den Wert der publishRequestCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPublishRequestCount(Long value) {
        this.publishRequestCount = value;
    }

    /**
     * Ruft den Wert der dataChangeNotificationsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDataChangeNotificationsCount() {
        return dataChangeNotificationsCount;
    }

    /**
     * Legt den Wert der dataChangeNotificationsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDataChangeNotificationsCount(Long value) {
        this.dataChangeNotificationsCount = value;
    }

    /**
     * Ruft den Wert der eventNotificationsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventNotificationsCount() {
        return eventNotificationsCount;
    }

    /**
     * Legt den Wert der eventNotificationsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventNotificationsCount(Long value) {
        this.eventNotificationsCount = value;
    }

    /**
     * Ruft den Wert der notificationsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNotificationsCount() {
        return notificationsCount;
    }

    /**
     * Legt den Wert der notificationsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNotificationsCount(Long value) {
        this.notificationsCount = value;
    }

    /**
     * Ruft den Wert der latePublishRequestCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLatePublishRequestCount() {
        return latePublishRequestCount;
    }

    /**
     * Legt den Wert der latePublishRequestCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLatePublishRequestCount(Long value) {
        this.latePublishRequestCount = value;
    }

    /**
     * Ruft den Wert der currentKeepAliveCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentKeepAliveCount() {
        return currentKeepAliveCount;
    }

    /**
     * Legt den Wert der currentKeepAliveCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentKeepAliveCount(Long value) {
        this.currentKeepAliveCount = value;
    }

    /**
     * Ruft den Wert der currentLifetimeCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentLifetimeCount() {
        return currentLifetimeCount;
    }

    /**
     * Legt den Wert der currentLifetimeCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentLifetimeCount(Long value) {
        this.currentLifetimeCount = value;
    }

    /**
     * Ruft den Wert der unacknowledgedMessageCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnacknowledgedMessageCount() {
        return unacknowledgedMessageCount;
    }

    /**
     * Legt den Wert der unacknowledgedMessageCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnacknowledgedMessageCount(Long value) {
        this.unacknowledgedMessageCount = value;
    }

    /**
     * Ruft den Wert der discardedMessageCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscardedMessageCount() {
        return discardedMessageCount;
    }

    /**
     * Legt den Wert der discardedMessageCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscardedMessageCount(Long value) {
        this.discardedMessageCount = value;
    }

    /**
     * Ruft den Wert der monitoredItemCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonitoredItemCount() {
        return monitoredItemCount;
    }

    /**
     * Legt den Wert der monitoredItemCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonitoredItemCount(Long value) {
        this.monitoredItemCount = value;
    }

    /**
     * Ruft den Wert der disabledMonitoredItemCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisabledMonitoredItemCount() {
        return disabledMonitoredItemCount;
    }

    /**
     * Legt den Wert der disabledMonitoredItemCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisabledMonitoredItemCount(Long value) {
        this.disabledMonitoredItemCount = value;
    }

    /**
     * Ruft den Wert der monitoringQueueOverflowCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonitoringQueueOverflowCount() {
        return monitoringQueueOverflowCount;
    }

    /**
     * Legt den Wert der monitoringQueueOverflowCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonitoringQueueOverflowCount(Long value) {
        this.monitoringQueueOverflowCount = value;
    }

    /**
     * Ruft den Wert der nextSequenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNextSequenceNumber() {
        return nextSequenceNumber;
    }

    /**
     * Legt den Wert der nextSequenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNextSequenceNumber(Long value) {
        this.nextSequenceNumber = value;
    }

    /**
     * Ruft den Wert der eventQueueOverFlowCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventQueueOverFlowCount() {
        return eventQueueOverFlowCount;
    }

    /**
     * Legt den Wert der eventQueueOverFlowCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventQueueOverFlowCount(Long value) {
        this.eventQueueOverFlowCount = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final SubscriptionDiagnosticsDataType.Builder<_B> _other) {
        _other.sessionId = this.sessionId;
        _other.subscriptionId = this.subscriptionId;
        _other.priority = this.priority;
        _other.publishingInterval = this.publishingInterval;
        _other.maxKeepAliveCount = this.maxKeepAliveCount;
        _other.maxLifetimeCount = this.maxLifetimeCount;
        _other.maxNotificationsPerPublish = this.maxNotificationsPerPublish;
        _other.publishingEnabled = this.publishingEnabled;
        _other.modifyCount = this.modifyCount;
        _other.enableCount = this.enableCount;
        _other.disableCount = this.disableCount;
        _other.republishRequestCount = this.republishRequestCount;
        _other.republishMessageRequestCount = this.republishMessageRequestCount;
        _other.republishMessageCount = this.republishMessageCount;
        _other.transferRequestCount = this.transferRequestCount;
        _other.transferredToAltClientCount = this.transferredToAltClientCount;
        _other.transferredToSameClientCount = this.transferredToSameClientCount;
        _other.publishRequestCount = this.publishRequestCount;
        _other.dataChangeNotificationsCount = this.dataChangeNotificationsCount;
        _other.eventNotificationsCount = this.eventNotificationsCount;
        _other.notificationsCount = this.notificationsCount;
        _other.latePublishRequestCount = this.latePublishRequestCount;
        _other.currentKeepAliveCount = this.currentKeepAliveCount;
        _other.currentLifetimeCount = this.currentLifetimeCount;
        _other.unacknowledgedMessageCount = this.unacknowledgedMessageCount;
        _other.discardedMessageCount = this.discardedMessageCount;
        _other.monitoredItemCount = this.monitoredItemCount;
        _other.disabledMonitoredItemCount = this.disabledMonitoredItemCount;
        _other.monitoringQueueOverflowCount = this.monitoringQueueOverflowCount;
        _other.nextSequenceNumber = this.nextSequenceNumber;
        _other.eventQueueOverFlowCount = this.eventQueueOverFlowCount;
    }

    public<_B >SubscriptionDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new SubscriptionDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public SubscriptionDiagnosticsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static SubscriptionDiagnosticsDataType.Builder<Void> builder() {
        return new SubscriptionDiagnosticsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >SubscriptionDiagnosticsDataType.Builder<_B> copyOf(final SubscriptionDiagnosticsDataType _other) {
        final SubscriptionDiagnosticsDataType.Builder<_B> _newBuilder = new SubscriptionDiagnosticsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final SubscriptionDiagnosticsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionIdPropertyTree!= null):((sessionIdPropertyTree == null)||(!sessionIdPropertyTree.isLeaf())))) {
            _other.sessionId = this.sessionId;
        }
        final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
            _other.subscriptionId = this.subscriptionId;
        }
        final PropertyTree priorityPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("priority"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(priorityPropertyTree!= null):((priorityPropertyTree == null)||(!priorityPropertyTree.isLeaf())))) {
            _other.priority = this.priority;
        }
        final PropertyTree publishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingInterval"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingIntervalPropertyTree!= null):((publishingIntervalPropertyTree == null)||(!publishingIntervalPropertyTree.isLeaf())))) {
            _other.publishingInterval = this.publishingInterval;
        }
        final PropertyTree maxKeepAliveCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxKeepAliveCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxKeepAliveCountPropertyTree!= null):((maxKeepAliveCountPropertyTree == null)||(!maxKeepAliveCountPropertyTree.isLeaf())))) {
            _other.maxKeepAliveCount = this.maxKeepAliveCount;
        }
        final PropertyTree maxLifetimeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxLifetimeCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxLifetimeCountPropertyTree!= null):((maxLifetimeCountPropertyTree == null)||(!maxLifetimeCountPropertyTree.isLeaf())))) {
            _other.maxLifetimeCount = this.maxLifetimeCount;
        }
        final PropertyTree maxNotificationsPerPublishPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxNotificationsPerPublish"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxNotificationsPerPublishPropertyTree!= null):((maxNotificationsPerPublishPropertyTree == null)||(!maxNotificationsPerPublishPropertyTree.isLeaf())))) {
            _other.maxNotificationsPerPublish = this.maxNotificationsPerPublish;
        }
        final PropertyTree publishingEnabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingEnabled"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingEnabledPropertyTree!= null):((publishingEnabledPropertyTree == null)||(!publishingEnabledPropertyTree.isLeaf())))) {
            _other.publishingEnabled = this.publishingEnabled;
        }
        final PropertyTree modifyCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modifyCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modifyCountPropertyTree!= null):((modifyCountPropertyTree == null)||(!modifyCountPropertyTree.isLeaf())))) {
            _other.modifyCount = this.modifyCount;
        }
        final PropertyTree enableCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enableCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enableCountPropertyTree!= null):((enableCountPropertyTree == null)||(!enableCountPropertyTree.isLeaf())))) {
            _other.enableCount = this.enableCount;
        }
        final PropertyTree disableCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("disableCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(disableCountPropertyTree!= null):((disableCountPropertyTree == null)||(!disableCountPropertyTree.isLeaf())))) {
            _other.disableCount = this.disableCount;
        }
        final PropertyTree republishRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("republishRequestCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(republishRequestCountPropertyTree!= null):((republishRequestCountPropertyTree == null)||(!republishRequestCountPropertyTree.isLeaf())))) {
            _other.republishRequestCount = this.republishRequestCount;
        }
        final PropertyTree republishMessageRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("republishMessageRequestCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(republishMessageRequestCountPropertyTree!= null):((republishMessageRequestCountPropertyTree == null)||(!republishMessageRequestCountPropertyTree.isLeaf())))) {
            _other.republishMessageRequestCount = this.republishMessageRequestCount;
        }
        final PropertyTree republishMessageCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("republishMessageCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(republishMessageCountPropertyTree!= null):((republishMessageCountPropertyTree == null)||(!republishMessageCountPropertyTree.isLeaf())))) {
            _other.republishMessageCount = this.republishMessageCount;
        }
        final PropertyTree transferRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferRequestCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferRequestCountPropertyTree!= null):((transferRequestCountPropertyTree == null)||(!transferRequestCountPropertyTree.isLeaf())))) {
            _other.transferRequestCount = this.transferRequestCount;
        }
        final PropertyTree transferredToAltClientCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferredToAltClientCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferredToAltClientCountPropertyTree!= null):((transferredToAltClientCountPropertyTree == null)||(!transferredToAltClientCountPropertyTree.isLeaf())))) {
            _other.transferredToAltClientCount = this.transferredToAltClientCount;
        }
        final PropertyTree transferredToSameClientCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferredToSameClientCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferredToSameClientCountPropertyTree!= null):((transferredToSameClientCountPropertyTree == null)||(!transferredToSameClientCountPropertyTree.isLeaf())))) {
            _other.transferredToSameClientCount = this.transferredToSameClientCount;
        }
        final PropertyTree publishRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishRequestCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishRequestCountPropertyTree!= null):((publishRequestCountPropertyTree == null)||(!publishRequestCountPropertyTree.isLeaf())))) {
            _other.publishRequestCount = this.publishRequestCount;
        }
        final PropertyTree dataChangeNotificationsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataChangeNotificationsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataChangeNotificationsCountPropertyTree!= null):((dataChangeNotificationsCountPropertyTree == null)||(!dataChangeNotificationsCountPropertyTree.isLeaf())))) {
            _other.dataChangeNotificationsCount = this.dataChangeNotificationsCount;
        }
        final PropertyTree eventNotificationsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventNotificationsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventNotificationsCountPropertyTree!= null):((eventNotificationsCountPropertyTree == null)||(!eventNotificationsCountPropertyTree.isLeaf())))) {
            _other.eventNotificationsCount = this.eventNotificationsCount;
        }
        final PropertyTree notificationsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("notificationsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(notificationsCountPropertyTree!= null):((notificationsCountPropertyTree == null)||(!notificationsCountPropertyTree.isLeaf())))) {
            _other.notificationsCount = this.notificationsCount;
        }
        final PropertyTree latePublishRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("latePublishRequestCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(latePublishRequestCountPropertyTree!= null):((latePublishRequestCountPropertyTree == null)||(!latePublishRequestCountPropertyTree.isLeaf())))) {
            _other.latePublishRequestCount = this.latePublishRequestCount;
        }
        final PropertyTree currentKeepAliveCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentKeepAliveCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentKeepAliveCountPropertyTree!= null):((currentKeepAliveCountPropertyTree == null)||(!currentKeepAliveCountPropertyTree.isLeaf())))) {
            _other.currentKeepAliveCount = this.currentKeepAliveCount;
        }
        final PropertyTree currentLifetimeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentLifetimeCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentLifetimeCountPropertyTree!= null):((currentLifetimeCountPropertyTree == null)||(!currentLifetimeCountPropertyTree.isLeaf())))) {
            _other.currentLifetimeCount = this.currentLifetimeCount;
        }
        final PropertyTree unacknowledgedMessageCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("unacknowledgedMessageCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unacknowledgedMessageCountPropertyTree!= null):((unacknowledgedMessageCountPropertyTree == null)||(!unacknowledgedMessageCountPropertyTree.isLeaf())))) {
            _other.unacknowledgedMessageCount = this.unacknowledgedMessageCount;
        }
        final PropertyTree discardedMessageCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discardedMessageCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discardedMessageCountPropertyTree!= null):((discardedMessageCountPropertyTree == null)||(!discardedMessageCountPropertyTree.isLeaf())))) {
            _other.discardedMessageCount = this.discardedMessageCount;
        }
        final PropertyTree monitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemCountPropertyTree!= null):((monitoredItemCountPropertyTree == null)||(!monitoredItemCountPropertyTree.isLeaf())))) {
            _other.monitoredItemCount = this.monitoredItemCount;
        }
        final PropertyTree disabledMonitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("disabledMonitoredItemCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(disabledMonitoredItemCountPropertyTree!= null):((disabledMonitoredItemCountPropertyTree == null)||(!disabledMonitoredItemCountPropertyTree.isLeaf())))) {
            _other.disabledMonitoredItemCount = this.disabledMonitoredItemCount;
        }
        final PropertyTree monitoringQueueOverflowCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoringQueueOverflowCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoringQueueOverflowCountPropertyTree!= null):((monitoringQueueOverflowCountPropertyTree == null)||(!monitoringQueueOverflowCountPropertyTree.isLeaf())))) {
            _other.monitoringQueueOverflowCount = this.monitoringQueueOverflowCount;
        }
        final PropertyTree nextSequenceNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nextSequenceNumber"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nextSequenceNumberPropertyTree!= null):((nextSequenceNumberPropertyTree == null)||(!nextSequenceNumberPropertyTree.isLeaf())))) {
            _other.nextSequenceNumber = this.nextSequenceNumber;
        }
        final PropertyTree eventQueueOverFlowCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventQueueOverFlowCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventQueueOverFlowCountPropertyTree!= null):((eventQueueOverFlowCountPropertyTree == null)||(!eventQueueOverFlowCountPropertyTree.isLeaf())))) {
            _other.eventQueueOverFlowCount = this.eventQueueOverFlowCount;
        }
    }

    public<_B >SubscriptionDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new SubscriptionDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public SubscriptionDiagnosticsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >SubscriptionDiagnosticsDataType.Builder<_B> copyOf(final SubscriptionDiagnosticsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final SubscriptionDiagnosticsDataType.Builder<_B> _newBuilder = new SubscriptionDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static SubscriptionDiagnosticsDataType.Builder<Void> copyExcept(final SubscriptionDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static SubscriptionDiagnosticsDataType.Builder<Void> copyOnly(final SubscriptionDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final SubscriptionDiagnosticsDataType _storedValue;
        private JAXBElement<NodeId> sessionId;
        private Long subscriptionId;
        private Short priority;
        private Double publishingInterval;
        private Long maxKeepAliveCount;
        private Long maxLifetimeCount;
        private Long maxNotificationsPerPublish;
        private Boolean publishingEnabled;
        private Long modifyCount;
        private Long enableCount;
        private Long disableCount;
        private Long republishRequestCount;
        private Long republishMessageRequestCount;
        private Long republishMessageCount;
        private Long transferRequestCount;
        private Long transferredToAltClientCount;
        private Long transferredToSameClientCount;
        private Long publishRequestCount;
        private Long dataChangeNotificationsCount;
        private Long eventNotificationsCount;
        private Long notificationsCount;
        private Long latePublishRequestCount;
        private Long currentKeepAliveCount;
        private Long currentLifetimeCount;
        private Long unacknowledgedMessageCount;
        private Long discardedMessageCount;
        private Long monitoredItemCount;
        private Long disabledMonitoredItemCount;
        private Long monitoringQueueOverflowCount;
        private Long nextSequenceNumber;
        private Long eventQueueOverFlowCount;

        public Builder(final _B _parentBuilder, final SubscriptionDiagnosticsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.sessionId = _other.sessionId;
                    this.subscriptionId = _other.subscriptionId;
                    this.priority = _other.priority;
                    this.publishingInterval = _other.publishingInterval;
                    this.maxKeepAliveCount = _other.maxKeepAliveCount;
                    this.maxLifetimeCount = _other.maxLifetimeCount;
                    this.maxNotificationsPerPublish = _other.maxNotificationsPerPublish;
                    this.publishingEnabled = _other.publishingEnabled;
                    this.modifyCount = _other.modifyCount;
                    this.enableCount = _other.enableCount;
                    this.disableCount = _other.disableCount;
                    this.republishRequestCount = _other.republishRequestCount;
                    this.republishMessageRequestCount = _other.republishMessageRequestCount;
                    this.republishMessageCount = _other.republishMessageCount;
                    this.transferRequestCount = _other.transferRequestCount;
                    this.transferredToAltClientCount = _other.transferredToAltClientCount;
                    this.transferredToSameClientCount = _other.transferredToSameClientCount;
                    this.publishRequestCount = _other.publishRequestCount;
                    this.dataChangeNotificationsCount = _other.dataChangeNotificationsCount;
                    this.eventNotificationsCount = _other.eventNotificationsCount;
                    this.notificationsCount = _other.notificationsCount;
                    this.latePublishRequestCount = _other.latePublishRequestCount;
                    this.currentKeepAliveCount = _other.currentKeepAliveCount;
                    this.currentLifetimeCount = _other.currentLifetimeCount;
                    this.unacknowledgedMessageCount = _other.unacknowledgedMessageCount;
                    this.discardedMessageCount = _other.discardedMessageCount;
                    this.monitoredItemCount = _other.monitoredItemCount;
                    this.disabledMonitoredItemCount = _other.disabledMonitoredItemCount;
                    this.monitoringQueueOverflowCount = _other.monitoringQueueOverflowCount;
                    this.nextSequenceNumber = _other.nextSequenceNumber;
                    this.eventQueueOverFlowCount = _other.eventQueueOverFlowCount;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final SubscriptionDiagnosticsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree sessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionIdPropertyTree!= null):((sessionIdPropertyTree == null)||(!sessionIdPropertyTree.isLeaf())))) {
                        this.sessionId = _other.sessionId;
                    }
                    final PropertyTree subscriptionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("subscriptionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(subscriptionIdPropertyTree!= null):((subscriptionIdPropertyTree == null)||(!subscriptionIdPropertyTree.isLeaf())))) {
                        this.subscriptionId = _other.subscriptionId;
                    }
                    final PropertyTree priorityPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("priority"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(priorityPropertyTree!= null):((priorityPropertyTree == null)||(!priorityPropertyTree.isLeaf())))) {
                        this.priority = _other.priority;
                    }
                    final PropertyTree publishingIntervalPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingInterval"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingIntervalPropertyTree!= null):((publishingIntervalPropertyTree == null)||(!publishingIntervalPropertyTree.isLeaf())))) {
                        this.publishingInterval = _other.publishingInterval;
                    }
                    final PropertyTree maxKeepAliveCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxKeepAliveCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxKeepAliveCountPropertyTree!= null):((maxKeepAliveCountPropertyTree == null)||(!maxKeepAliveCountPropertyTree.isLeaf())))) {
                        this.maxKeepAliveCount = _other.maxKeepAliveCount;
                    }
                    final PropertyTree maxLifetimeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxLifetimeCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxLifetimeCountPropertyTree!= null):((maxLifetimeCountPropertyTree == null)||(!maxLifetimeCountPropertyTree.isLeaf())))) {
                        this.maxLifetimeCount = _other.maxLifetimeCount;
                    }
                    final PropertyTree maxNotificationsPerPublishPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("maxNotificationsPerPublish"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(maxNotificationsPerPublishPropertyTree!= null):((maxNotificationsPerPublishPropertyTree == null)||(!maxNotificationsPerPublishPropertyTree.isLeaf())))) {
                        this.maxNotificationsPerPublish = _other.maxNotificationsPerPublish;
                    }
                    final PropertyTree publishingEnabledPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingEnabled"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingEnabledPropertyTree!= null):((publishingEnabledPropertyTree == null)||(!publishingEnabledPropertyTree.isLeaf())))) {
                        this.publishingEnabled = _other.publishingEnabled;
                    }
                    final PropertyTree modifyCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modifyCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modifyCountPropertyTree!= null):((modifyCountPropertyTree == null)||(!modifyCountPropertyTree.isLeaf())))) {
                        this.modifyCount = _other.modifyCount;
                    }
                    final PropertyTree enableCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("enableCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(enableCountPropertyTree!= null):((enableCountPropertyTree == null)||(!enableCountPropertyTree.isLeaf())))) {
                        this.enableCount = _other.enableCount;
                    }
                    final PropertyTree disableCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("disableCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(disableCountPropertyTree!= null):((disableCountPropertyTree == null)||(!disableCountPropertyTree.isLeaf())))) {
                        this.disableCount = _other.disableCount;
                    }
                    final PropertyTree republishRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("republishRequestCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(republishRequestCountPropertyTree!= null):((republishRequestCountPropertyTree == null)||(!republishRequestCountPropertyTree.isLeaf())))) {
                        this.republishRequestCount = _other.republishRequestCount;
                    }
                    final PropertyTree republishMessageRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("republishMessageRequestCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(republishMessageRequestCountPropertyTree!= null):((republishMessageRequestCountPropertyTree == null)||(!republishMessageRequestCountPropertyTree.isLeaf())))) {
                        this.republishMessageRequestCount = _other.republishMessageRequestCount;
                    }
                    final PropertyTree republishMessageCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("republishMessageCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(republishMessageCountPropertyTree!= null):((republishMessageCountPropertyTree == null)||(!republishMessageCountPropertyTree.isLeaf())))) {
                        this.republishMessageCount = _other.republishMessageCount;
                    }
                    final PropertyTree transferRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferRequestCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferRequestCountPropertyTree!= null):((transferRequestCountPropertyTree == null)||(!transferRequestCountPropertyTree.isLeaf())))) {
                        this.transferRequestCount = _other.transferRequestCount;
                    }
                    final PropertyTree transferredToAltClientCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferredToAltClientCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferredToAltClientCountPropertyTree!= null):((transferredToAltClientCountPropertyTree == null)||(!transferredToAltClientCountPropertyTree.isLeaf())))) {
                        this.transferredToAltClientCount = _other.transferredToAltClientCount;
                    }
                    final PropertyTree transferredToSameClientCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("transferredToSameClientCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(transferredToSameClientCountPropertyTree!= null):((transferredToSameClientCountPropertyTree == null)||(!transferredToSameClientCountPropertyTree.isLeaf())))) {
                        this.transferredToSameClientCount = _other.transferredToSameClientCount;
                    }
                    final PropertyTree publishRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishRequestCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishRequestCountPropertyTree!= null):((publishRequestCountPropertyTree == null)||(!publishRequestCountPropertyTree.isLeaf())))) {
                        this.publishRequestCount = _other.publishRequestCount;
                    }
                    final PropertyTree dataChangeNotificationsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("dataChangeNotificationsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(dataChangeNotificationsCountPropertyTree!= null):((dataChangeNotificationsCountPropertyTree == null)||(!dataChangeNotificationsCountPropertyTree.isLeaf())))) {
                        this.dataChangeNotificationsCount = _other.dataChangeNotificationsCount;
                    }
                    final PropertyTree eventNotificationsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventNotificationsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventNotificationsCountPropertyTree!= null):((eventNotificationsCountPropertyTree == null)||(!eventNotificationsCountPropertyTree.isLeaf())))) {
                        this.eventNotificationsCount = _other.eventNotificationsCount;
                    }
                    final PropertyTree notificationsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("notificationsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(notificationsCountPropertyTree!= null):((notificationsCountPropertyTree == null)||(!notificationsCountPropertyTree.isLeaf())))) {
                        this.notificationsCount = _other.notificationsCount;
                    }
                    final PropertyTree latePublishRequestCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("latePublishRequestCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(latePublishRequestCountPropertyTree!= null):((latePublishRequestCountPropertyTree == null)||(!latePublishRequestCountPropertyTree.isLeaf())))) {
                        this.latePublishRequestCount = _other.latePublishRequestCount;
                    }
                    final PropertyTree currentKeepAliveCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentKeepAliveCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentKeepAliveCountPropertyTree!= null):((currentKeepAliveCountPropertyTree == null)||(!currentKeepAliveCountPropertyTree.isLeaf())))) {
                        this.currentKeepAliveCount = _other.currentKeepAliveCount;
                    }
                    final PropertyTree currentLifetimeCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentLifetimeCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentLifetimeCountPropertyTree!= null):((currentLifetimeCountPropertyTree == null)||(!currentLifetimeCountPropertyTree.isLeaf())))) {
                        this.currentLifetimeCount = _other.currentLifetimeCount;
                    }
                    final PropertyTree unacknowledgedMessageCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("unacknowledgedMessageCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(unacknowledgedMessageCountPropertyTree!= null):((unacknowledgedMessageCountPropertyTree == null)||(!unacknowledgedMessageCountPropertyTree.isLeaf())))) {
                        this.unacknowledgedMessageCount = _other.unacknowledgedMessageCount;
                    }
                    final PropertyTree discardedMessageCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("discardedMessageCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(discardedMessageCountPropertyTree!= null):((discardedMessageCountPropertyTree == null)||(!discardedMessageCountPropertyTree.isLeaf())))) {
                        this.discardedMessageCount = _other.discardedMessageCount;
                    }
                    final PropertyTree monitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoredItemCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoredItemCountPropertyTree!= null):((monitoredItemCountPropertyTree == null)||(!monitoredItemCountPropertyTree.isLeaf())))) {
                        this.monitoredItemCount = _other.monitoredItemCount;
                    }
                    final PropertyTree disabledMonitoredItemCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("disabledMonitoredItemCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(disabledMonitoredItemCountPropertyTree!= null):((disabledMonitoredItemCountPropertyTree == null)||(!disabledMonitoredItemCountPropertyTree.isLeaf())))) {
                        this.disabledMonitoredItemCount = _other.disabledMonitoredItemCount;
                    }
                    final PropertyTree monitoringQueueOverflowCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("monitoringQueueOverflowCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(monitoringQueueOverflowCountPropertyTree!= null):((monitoringQueueOverflowCountPropertyTree == null)||(!monitoringQueueOverflowCountPropertyTree.isLeaf())))) {
                        this.monitoringQueueOverflowCount = _other.monitoringQueueOverflowCount;
                    }
                    final PropertyTree nextSequenceNumberPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("nextSequenceNumber"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(nextSequenceNumberPropertyTree!= null):((nextSequenceNumberPropertyTree == null)||(!nextSequenceNumberPropertyTree.isLeaf())))) {
                        this.nextSequenceNumber = _other.nextSequenceNumber;
                    }
                    final PropertyTree eventQueueOverFlowCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventQueueOverFlowCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventQueueOverFlowCountPropertyTree!= null):((eventQueueOverFlowCountPropertyTree == null)||(!eventQueueOverFlowCountPropertyTree.isLeaf())))) {
                        this.eventQueueOverFlowCount = _other.eventQueueOverFlowCount;
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

        protected<_P extends SubscriptionDiagnosticsDataType >_P init(final _P _product) {
            _product.sessionId = this.sessionId;
            _product.subscriptionId = this.subscriptionId;
            _product.priority = this.priority;
            _product.publishingInterval = this.publishingInterval;
            _product.maxKeepAliveCount = this.maxKeepAliveCount;
            _product.maxLifetimeCount = this.maxLifetimeCount;
            _product.maxNotificationsPerPublish = this.maxNotificationsPerPublish;
            _product.publishingEnabled = this.publishingEnabled;
            _product.modifyCount = this.modifyCount;
            _product.enableCount = this.enableCount;
            _product.disableCount = this.disableCount;
            _product.republishRequestCount = this.republishRequestCount;
            _product.republishMessageRequestCount = this.republishMessageRequestCount;
            _product.republishMessageCount = this.republishMessageCount;
            _product.transferRequestCount = this.transferRequestCount;
            _product.transferredToAltClientCount = this.transferredToAltClientCount;
            _product.transferredToSameClientCount = this.transferredToSameClientCount;
            _product.publishRequestCount = this.publishRequestCount;
            _product.dataChangeNotificationsCount = this.dataChangeNotificationsCount;
            _product.eventNotificationsCount = this.eventNotificationsCount;
            _product.notificationsCount = this.notificationsCount;
            _product.latePublishRequestCount = this.latePublishRequestCount;
            _product.currentKeepAliveCount = this.currentKeepAliveCount;
            _product.currentLifetimeCount = this.currentLifetimeCount;
            _product.unacknowledgedMessageCount = this.unacknowledgedMessageCount;
            _product.discardedMessageCount = this.discardedMessageCount;
            _product.monitoredItemCount = this.monitoredItemCount;
            _product.disabledMonitoredItemCount = this.disabledMonitoredItemCount;
            _product.monitoringQueueOverflowCount = this.monitoringQueueOverflowCount;
            _product.nextSequenceNumber = this.nextSequenceNumber;
            _product.eventQueueOverFlowCount = this.eventQueueOverFlowCount;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param sessionId
         *     Neuer Wert der Eigenschaft "sessionId".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withSessionId(final JAXBElement<NodeId> sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "subscriptionId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param subscriptionId
         *     Neuer Wert der Eigenschaft "subscriptionId".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withSubscriptionId(final Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "priority" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param priority
         *     Neuer Wert der Eigenschaft "priority".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withPriority(final Short priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishingInterval" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishingInterval
         *     Neuer Wert der Eigenschaft "publishingInterval".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withPublishingInterval(final Double publishingInterval) {
            this.publishingInterval = publishingInterval;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxKeepAliveCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param maxKeepAliveCount
         *     Neuer Wert der Eigenschaft "maxKeepAliveCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withMaxKeepAliveCount(final Long maxKeepAliveCount) {
            this.maxKeepAliveCount = maxKeepAliveCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxLifetimeCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param maxLifetimeCount
         *     Neuer Wert der Eigenschaft "maxLifetimeCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withMaxLifetimeCount(final Long maxLifetimeCount) {
            this.maxLifetimeCount = maxLifetimeCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "maxNotificationsPerPublish" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param maxNotificationsPerPublish
         *     Neuer Wert der Eigenschaft "maxNotificationsPerPublish".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withMaxNotificationsPerPublish(final Long maxNotificationsPerPublish) {
            this.maxNotificationsPerPublish = maxNotificationsPerPublish;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishingEnabled" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishingEnabled
         *     Neuer Wert der Eigenschaft "publishingEnabled".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withPublishingEnabled(final Boolean publishingEnabled) {
            this.publishingEnabled = publishingEnabled;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modifyCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param modifyCount
         *     Neuer Wert der Eigenschaft "modifyCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withModifyCount(final Long modifyCount) {
            this.modifyCount = modifyCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "enableCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param enableCount
         *     Neuer Wert der Eigenschaft "enableCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withEnableCount(final Long enableCount) {
            this.enableCount = enableCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "disableCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param disableCount
         *     Neuer Wert der Eigenschaft "disableCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withDisableCount(final Long disableCount) {
            this.disableCount = disableCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "republishRequestCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param republishRequestCount
         *     Neuer Wert der Eigenschaft "republishRequestCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withRepublishRequestCount(final Long republishRequestCount) {
            this.republishRequestCount = republishRequestCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "republishMessageRequestCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param republishMessageRequestCount
         *     Neuer Wert der Eigenschaft "republishMessageRequestCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withRepublishMessageRequestCount(final Long republishMessageRequestCount) {
            this.republishMessageRequestCount = republishMessageRequestCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "republishMessageCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param republishMessageCount
         *     Neuer Wert der Eigenschaft "republishMessageCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withRepublishMessageCount(final Long republishMessageCount) {
            this.republishMessageCount = republishMessageCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transferRequestCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param transferRequestCount
         *     Neuer Wert der Eigenschaft "transferRequestCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withTransferRequestCount(final Long transferRequestCount) {
            this.transferRequestCount = transferRequestCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transferredToAltClientCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param transferredToAltClientCount
         *     Neuer Wert der Eigenschaft "transferredToAltClientCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withTransferredToAltClientCount(final Long transferredToAltClientCount) {
            this.transferredToAltClientCount = transferredToAltClientCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "transferredToSameClientCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param transferredToSameClientCount
         *     Neuer Wert der Eigenschaft "transferredToSameClientCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withTransferredToSameClientCount(final Long transferredToSameClientCount) {
            this.transferredToSameClientCount = transferredToSameClientCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishRequestCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param publishRequestCount
         *     Neuer Wert der Eigenschaft "publishRequestCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withPublishRequestCount(final Long publishRequestCount) {
            this.publishRequestCount = publishRequestCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "dataChangeNotificationsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param dataChangeNotificationsCount
         *     Neuer Wert der Eigenschaft "dataChangeNotificationsCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withDataChangeNotificationsCount(final Long dataChangeNotificationsCount) {
            this.dataChangeNotificationsCount = dataChangeNotificationsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventNotificationsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param eventNotificationsCount
         *     Neuer Wert der Eigenschaft "eventNotificationsCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withEventNotificationsCount(final Long eventNotificationsCount) {
            this.eventNotificationsCount = eventNotificationsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "notificationsCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param notificationsCount
         *     Neuer Wert der Eigenschaft "notificationsCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withNotificationsCount(final Long notificationsCount) {
            this.notificationsCount = notificationsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "latePublishRequestCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param latePublishRequestCount
         *     Neuer Wert der Eigenschaft "latePublishRequestCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withLatePublishRequestCount(final Long latePublishRequestCount) {
            this.latePublishRequestCount = latePublishRequestCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currentKeepAliveCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param currentKeepAliveCount
         *     Neuer Wert der Eigenschaft "currentKeepAliveCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withCurrentKeepAliveCount(final Long currentKeepAliveCount) {
            this.currentKeepAliveCount = currentKeepAliveCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currentLifetimeCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param currentLifetimeCount
         *     Neuer Wert der Eigenschaft "currentLifetimeCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withCurrentLifetimeCount(final Long currentLifetimeCount) {
            this.currentLifetimeCount = currentLifetimeCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "unacknowledgedMessageCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param unacknowledgedMessageCount
         *     Neuer Wert der Eigenschaft "unacknowledgedMessageCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withUnacknowledgedMessageCount(final Long unacknowledgedMessageCount) {
            this.unacknowledgedMessageCount = unacknowledgedMessageCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "discardedMessageCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param discardedMessageCount
         *     Neuer Wert der Eigenschaft "discardedMessageCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withDiscardedMessageCount(final Long discardedMessageCount) {
            this.discardedMessageCount = discardedMessageCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoredItemCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param monitoredItemCount
         *     Neuer Wert der Eigenschaft "monitoredItemCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withMonitoredItemCount(final Long monitoredItemCount) {
            this.monitoredItemCount = monitoredItemCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "disabledMonitoredItemCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param disabledMonitoredItemCount
         *     Neuer Wert der Eigenschaft "disabledMonitoredItemCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withDisabledMonitoredItemCount(final Long disabledMonitoredItemCount) {
            this.disabledMonitoredItemCount = disabledMonitoredItemCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "monitoringQueueOverflowCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param monitoringQueueOverflowCount
         *     Neuer Wert der Eigenschaft "monitoringQueueOverflowCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withMonitoringQueueOverflowCount(final Long monitoringQueueOverflowCount) {
            this.monitoringQueueOverflowCount = monitoringQueueOverflowCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nextSequenceNumber" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param nextSequenceNumber
         *     Neuer Wert der Eigenschaft "nextSequenceNumber".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withNextSequenceNumber(final Long nextSequenceNumber) {
            this.nextSequenceNumber = nextSequenceNumber;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventQueueOverFlowCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param eventQueueOverFlowCount
         *     Neuer Wert der Eigenschaft "eventQueueOverFlowCount".
         */
        public SubscriptionDiagnosticsDataType.Builder<_B> withEventQueueOverFlowCount(final Long eventQueueOverFlowCount) {
            this.eventQueueOverFlowCount = eventQueueOverFlowCount;
            return this;
        }

        @Override
        public SubscriptionDiagnosticsDataType build() {
            if (_storedValue == null) {
                return this.init(new SubscriptionDiagnosticsDataType());
            } else {
                return ((SubscriptionDiagnosticsDataType) _storedValue);
            }
        }

        public SubscriptionDiagnosticsDataType.Builder<_B> copyOf(final SubscriptionDiagnosticsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public SubscriptionDiagnosticsDataType.Builder<_B> copyOf(final SubscriptionDiagnosticsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends SubscriptionDiagnosticsDataType.Selector<SubscriptionDiagnosticsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static SubscriptionDiagnosticsDataType.Select _root() {
            return new SubscriptionDiagnosticsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> sessionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> subscriptionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> priority = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> publishingInterval = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> maxKeepAliveCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> maxLifetimeCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> maxNotificationsPerPublish = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> publishingEnabled = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> modifyCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> enableCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> disableCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> republishRequestCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> republishMessageRequestCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> republishMessageCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> transferRequestCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> transferredToAltClientCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> transferredToSameClientCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> publishRequestCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> dataChangeNotificationsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> eventNotificationsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> notificationsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> latePublishRequestCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> currentKeepAliveCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> currentLifetimeCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> unacknowledgedMessageCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> discardedMessageCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> monitoredItemCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> disabledMonitoredItemCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> monitoringQueueOverflowCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> nextSequenceNumber = null;
        private com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> eventQueueOverFlowCount = null;

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
            if (this.subscriptionId!= null) {
                products.put("subscriptionId", this.subscriptionId.init());
            }
            if (this.priority!= null) {
                products.put("priority", this.priority.init());
            }
            if (this.publishingInterval!= null) {
                products.put("publishingInterval", this.publishingInterval.init());
            }
            if (this.maxKeepAliveCount!= null) {
                products.put("maxKeepAliveCount", this.maxKeepAliveCount.init());
            }
            if (this.maxLifetimeCount!= null) {
                products.put("maxLifetimeCount", this.maxLifetimeCount.init());
            }
            if (this.maxNotificationsPerPublish!= null) {
                products.put("maxNotificationsPerPublish", this.maxNotificationsPerPublish.init());
            }
            if (this.publishingEnabled!= null) {
                products.put("publishingEnabled", this.publishingEnabled.init());
            }
            if (this.modifyCount!= null) {
                products.put("modifyCount", this.modifyCount.init());
            }
            if (this.enableCount!= null) {
                products.put("enableCount", this.enableCount.init());
            }
            if (this.disableCount!= null) {
                products.put("disableCount", this.disableCount.init());
            }
            if (this.republishRequestCount!= null) {
                products.put("republishRequestCount", this.republishRequestCount.init());
            }
            if (this.republishMessageRequestCount!= null) {
                products.put("republishMessageRequestCount", this.republishMessageRequestCount.init());
            }
            if (this.republishMessageCount!= null) {
                products.put("republishMessageCount", this.republishMessageCount.init());
            }
            if (this.transferRequestCount!= null) {
                products.put("transferRequestCount", this.transferRequestCount.init());
            }
            if (this.transferredToAltClientCount!= null) {
                products.put("transferredToAltClientCount", this.transferredToAltClientCount.init());
            }
            if (this.transferredToSameClientCount!= null) {
                products.put("transferredToSameClientCount", this.transferredToSameClientCount.init());
            }
            if (this.publishRequestCount!= null) {
                products.put("publishRequestCount", this.publishRequestCount.init());
            }
            if (this.dataChangeNotificationsCount!= null) {
                products.put("dataChangeNotificationsCount", this.dataChangeNotificationsCount.init());
            }
            if (this.eventNotificationsCount!= null) {
                products.put("eventNotificationsCount", this.eventNotificationsCount.init());
            }
            if (this.notificationsCount!= null) {
                products.put("notificationsCount", this.notificationsCount.init());
            }
            if (this.latePublishRequestCount!= null) {
                products.put("latePublishRequestCount", this.latePublishRequestCount.init());
            }
            if (this.currentKeepAliveCount!= null) {
                products.put("currentKeepAliveCount", this.currentKeepAliveCount.init());
            }
            if (this.currentLifetimeCount!= null) {
                products.put("currentLifetimeCount", this.currentLifetimeCount.init());
            }
            if (this.unacknowledgedMessageCount!= null) {
                products.put("unacknowledgedMessageCount", this.unacknowledgedMessageCount.init());
            }
            if (this.discardedMessageCount!= null) {
                products.put("discardedMessageCount", this.discardedMessageCount.init());
            }
            if (this.monitoredItemCount!= null) {
                products.put("monitoredItemCount", this.monitoredItemCount.init());
            }
            if (this.disabledMonitoredItemCount!= null) {
                products.put("disabledMonitoredItemCount", this.disabledMonitoredItemCount.init());
            }
            if (this.monitoringQueueOverflowCount!= null) {
                products.put("monitoringQueueOverflowCount", this.monitoringQueueOverflowCount.init());
            }
            if (this.nextSequenceNumber!= null) {
                products.put("nextSequenceNumber", this.nextSequenceNumber.init());
            }
            if (this.eventQueueOverFlowCount!= null) {
                products.put("eventQueueOverFlowCount", this.eventQueueOverFlowCount.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> sessionId() {
            return ((this.sessionId == null)?this.sessionId = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "sessionId"):this.sessionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> subscriptionId() {
            return ((this.subscriptionId == null)?this.subscriptionId = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "subscriptionId"):this.subscriptionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> priority() {
            return ((this.priority == null)?this.priority = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "priority"):this.priority);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> publishingInterval() {
            return ((this.publishingInterval == null)?this.publishingInterval = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "publishingInterval"):this.publishingInterval);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> maxKeepAliveCount() {
            return ((this.maxKeepAliveCount == null)?this.maxKeepAliveCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "maxKeepAliveCount"):this.maxKeepAliveCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> maxLifetimeCount() {
            return ((this.maxLifetimeCount == null)?this.maxLifetimeCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "maxLifetimeCount"):this.maxLifetimeCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> maxNotificationsPerPublish() {
            return ((this.maxNotificationsPerPublish == null)?this.maxNotificationsPerPublish = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "maxNotificationsPerPublish"):this.maxNotificationsPerPublish);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> publishingEnabled() {
            return ((this.publishingEnabled == null)?this.publishingEnabled = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "publishingEnabled"):this.publishingEnabled);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> modifyCount() {
            return ((this.modifyCount == null)?this.modifyCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "modifyCount"):this.modifyCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> enableCount() {
            return ((this.enableCount == null)?this.enableCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "enableCount"):this.enableCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> disableCount() {
            return ((this.disableCount == null)?this.disableCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "disableCount"):this.disableCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> republishRequestCount() {
            return ((this.republishRequestCount == null)?this.republishRequestCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "republishRequestCount"):this.republishRequestCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> republishMessageRequestCount() {
            return ((this.republishMessageRequestCount == null)?this.republishMessageRequestCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "republishMessageRequestCount"):this.republishMessageRequestCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> republishMessageCount() {
            return ((this.republishMessageCount == null)?this.republishMessageCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "republishMessageCount"):this.republishMessageCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> transferRequestCount() {
            return ((this.transferRequestCount == null)?this.transferRequestCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "transferRequestCount"):this.transferRequestCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> transferredToAltClientCount() {
            return ((this.transferredToAltClientCount == null)?this.transferredToAltClientCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "transferredToAltClientCount"):this.transferredToAltClientCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> transferredToSameClientCount() {
            return ((this.transferredToSameClientCount == null)?this.transferredToSameClientCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "transferredToSameClientCount"):this.transferredToSameClientCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> publishRequestCount() {
            return ((this.publishRequestCount == null)?this.publishRequestCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "publishRequestCount"):this.publishRequestCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> dataChangeNotificationsCount() {
            return ((this.dataChangeNotificationsCount == null)?this.dataChangeNotificationsCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "dataChangeNotificationsCount"):this.dataChangeNotificationsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> eventNotificationsCount() {
            return ((this.eventNotificationsCount == null)?this.eventNotificationsCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "eventNotificationsCount"):this.eventNotificationsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> notificationsCount() {
            return ((this.notificationsCount == null)?this.notificationsCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "notificationsCount"):this.notificationsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> latePublishRequestCount() {
            return ((this.latePublishRequestCount == null)?this.latePublishRequestCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "latePublishRequestCount"):this.latePublishRequestCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> currentKeepAliveCount() {
            return ((this.currentKeepAliveCount == null)?this.currentKeepAliveCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "currentKeepAliveCount"):this.currentKeepAliveCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> currentLifetimeCount() {
            return ((this.currentLifetimeCount == null)?this.currentLifetimeCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "currentLifetimeCount"):this.currentLifetimeCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> unacknowledgedMessageCount() {
            return ((this.unacknowledgedMessageCount == null)?this.unacknowledgedMessageCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "unacknowledgedMessageCount"):this.unacknowledgedMessageCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> discardedMessageCount() {
            return ((this.discardedMessageCount == null)?this.discardedMessageCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "discardedMessageCount"):this.discardedMessageCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> monitoredItemCount() {
            return ((this.monitoredItemCount == null)?this.monitoredItemCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "monitoredItemCount"):this.monitoredItemCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> disabledMonitoredItemCount() {
            return ((this.disabledMonitoredItemCount == null)?this.disabledMonitoredItemCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "disabledMonitoredItemCount"):this.disabledMonitoredItemCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> monitoringQueueOverflowCount() {
            return ((this.monitoringQueueOverflowCount == null)?this.monitoringQueueOverflowCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "monitoringQueueOverflowCount"):this.monitoringQueueOverflowCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> nextSequenceNumber() {
            return ((this.nextSequenceNumber == null)?this.nextSequenceNumber = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "nextSequenceNumber"):this.nextSequenceNumber);
        }

        public com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>> eventQueueOverFlowCount() {
            return ((this.eventQueueOverFlowCount == null)?this.eventQueueOverFlowCount = new com.kscs.util.jaxb.Selector<TRoot, SubscriptionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "eventQueueOverFlowCount"):this.eventQueueOverFlowCount);
        }

    }

}
