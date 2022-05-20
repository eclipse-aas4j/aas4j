//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ServerDiagnosticsSummaryDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServerDiagnosticsSummaryDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServerViewCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CurrentSessionCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CumulatedSessionCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SecurityRejectedSessionCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RejectedSessionCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SessionTimeoutCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SessionAbortCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CurrentSubscriptionCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="CumulatedSubscriptionCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="PublishingIntervalCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SecurityRejectedRequestsCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RejectedRequestsCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerDiagnosticsSummaryDataType", propOrder = {
    "serverViewCount",
    "currentSessionCount",
    "cumulatedSessionCount",
    "securityRejectedSessionCount",
    "rejectedSessionCount",
    "sessionTimeoutCount",
    "sessionAbortCount",
    "currentSubscriptionCount",
    "cumulatedSubscriptionCount",
    "publishingIntervalCount",
    "securityRejectedRequestsCount",
    "rejectedRequestsCount"
})
public class ServerDiagnosticsSummaryDataType {

    @XmlElement(name = "ServerViewCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long serverViewCount;
    @XmlElement(name = "CurrentSessionCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentSessionCount;
    @XmlElement(name = "CumulatedSessionCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cumulatedSessionCount;
    @XmlElement(name = "SecurityRejectedSessionCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long securityRejectedSessionCount;
    @XmlElement(name = "RejectedSessionCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long rejectedSessionCount;
    @XmlElement(name = "SessionTimeoutCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sessionTimeoutCount;
    @XmlElement(name = "SessionAbortCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sessionAbortCount;
    @XmlElement(name = "CurrentSubscriptionCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long currentSubscriptionCount;
    @XmlElement(name = "CumulatedSubscriptionCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cumulatedSubscriptionCount;
    @XmlElement(name = "PublishingIntervalCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long publishingIntervalCount;
    @XmlElement(name = "SecurityRejectedRequestsCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long securityRejectedRequestsCount;
    @XmlElement(name = "RejectedRequestsCount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long rejectedRequestsCount;

    /**
     * Ruft den Wert der serverViewCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServerViewCount() {
        return serverViewCount;
    }

    /**
     * Legt den Wert der serverViewCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServerViewCount(Long value) {
        this.serverViewCount = value;
    }

    /**
     * Ruft den Wert der currentSessionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentSessionCount() {
        return currentSessionCount;
    }

    /**
     * Legt den Wert der currentSessionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentSessionCount(Long value) {
        this.currentSessionCount = value;
    }

    /**
     * Ruft den Wert der cumulatedSessionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCumulatedSessionCount() {
        return cumulatedSessionCount;
    }

    /**
     * Legt den Wert der cumulatedSessionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCumulatedSessionCount(Long value) {
        this.cumulatedSessionCount = value;
    }

    /**
     * Ruft den Wert der securityRejectedSessionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecurityRejectedSessionCount() {
        return securityRejectedSessionCount;
    }

    /**
     * Legt den Wert der securityRejectedSessionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecurityRejectedSessionCount(Long value) {
        this.securityRejectedSessionCount = value;
    }

    /**
     * Ruft den Wert der rejectedSessionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRejectedSessionCount() {
        return rejectedSessionCount;
    }

    /**
     * Legt den Wert der rejectedSessionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRejectedSessionCount(Long value) {
        this.rejectedSessionCount = value;
    }

    /**
     * Ruft den Wert der sessionTimeoutCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionTimeoutCount() {
        return sessionTimeoutCount;
    }

    /**
     * Legt den Wert der sessionTimeoutCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionTimeoutCount(Long value) {
        this.sessionTimeoutCount = value;
    }

    /**
     * Ruft den Wert der sessionAbortCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionAbortCount() {
        return sessionAbortCount;
    }

    /**
     * Legt den Wert der sessionAbortCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionAbortCount(Long value) {
        this.sessionAbortCount = value;
    }

    /**
     * Ruft den Wert der currentSubscriptionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentSubscriptionCount() {
        return currentSubscriptionCount;
    }

    /**
     * Legt den Wert der currentSubscriptionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentSubscriptionCount(Long value) {
        this.currentSubscriptionCount = value;
    }

    /**
     * Ruft den Wert der cumulatedSubscriptionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCumulatedSubscriptionCount() {
        return cumulatedSubscriptionCount;
    }

    /**
     * Legt den Wert der cumulatedSubscriptionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCumulatedSubscriptionCount(Long value) {
        this.cumulatedSubscriptionCount = value;
    }

    /**
     * Ruft den Wert der publishingIntervalCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPublishingIntervalCount() {
        return publishingIntervalCount;
    }

    /**
     * Legt den Wert der publishingIntervalCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPublishingIntervalCount(Long value) {
        this.publishingIntervalCount = value;
    }

    /**
     * Ruft den Wert der securityRejectedRequestsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSecurityRejectedRequestsCount() {
        return securityRejectedRequestsCount;
    }

    /**
     * Legt den Wert der securityRejectedRequestsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSecurityRejectedRequestsCount(Long value) {
        this.securityRejectedRequestsCount = value;
    }

    /**
     * Ruft den Wert der rejectedRequestsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRejectedRequestsCount() {
        return rejectedRequestsCount;
    }

    /**
     * Legt den Wert der rejectedRequestsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRejectedRequestsCount(Long value) {
        this.rejectedRequestsCount = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ServerDiagnosticsSummaryDataType.Builder<_B> _other) {
        _other.serverViewCount = this.serverViewCount;
        _other.currentSessionCount = this.currentSessionCount;
        _other.cumulatedSessionCount = this.cumulatedSessionCount;
        _other.securityRejectedSessionCount = this.securityRejectedSessionCount;
        _other.rejectedSessionCount = this.rejectedSessionCount;
        _other.sessionTimeoutCount = this.sessionTimeoutCount;
        _other.sessionAbortCount = this.sessionAbortCount;
        _other.currentSubscriptionCount = this.currentSubscriptionCount;
        _other.cumulatedSubscriptionCount = this.cumulatedSubscriptionCount;
        _other.publishingIntervalCount = this.publishingIntervalCount;
        _other.securityRejectedRequestsCount = this.securityRejectedRequestsCount;
        _other.rejectedRequestsCount = this.rejectedRequestsCount;
    }

    public<_B >ServerDiagnosticsSummaryDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ServerDiagnosticsSummaryDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ServerDiagnosticsSummaryDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ServerDiagnosticsSummaryDataType.Builder<Void> builder() {
        return new ServerDiagnosticsSummaryDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ServerDiagnosticsSummaryDataType.Builder<_B> copyOf(final ServerDiagnosticsSummaryDataType _other) {
        final ServerDiagnosticsSummaryDataType.Builder<_B> _newBuilder = new ServerDiagnosticsSummaryDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ServerDiagnosticsSummaryDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree serverViewCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverViewCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverViewCountPropertyTree!= null):((serverViewCountPropertyTree == null)||(!serverViewCountPropertyTree.isLeaf())))) {
            _other.serverViewCount = this.serverViewCount;
        }
        final PropertyTree currentSessionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentSessionCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentSessionCountPropertyTree!= null):((currentSessionCountPropertyTree == null)||(!currentSessionCountPropertyTree.isLeaf())))) {
            _other.currentSessionCount = this.currentSessionCount;
        }
        final PropertyTree cumulatedSessionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cumulatedSessionCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cumulatedSessionCountPropertyTree!= null):((cumulatedSessionCountPropertyTree == null)||(!cumulatedSessionCountPropertyTree.isLeaf())))) {
            _other.cumulatedSessionCount = this.cumulatedSessionCount;
        }
        final PropertyTree securityRejectedSessionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityRejectedSessionCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityRejectedSessionCountPropertyTree!= null):((securityRejectedSessionCountPropertyTree == null)||(!securityRejectedSessionCountPropertyTree.isLeaf())))) {
            _other.securityRejectedSessionCount = this.securityRejectedSessionCount;
        }
        final PropertyTree rejectedSessionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rejectedSessionCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rejectedSessionCountPropertyTree!= null):((rejectedSessionCountPropertyTree == null)||(!rejectedSessionCountPropertyTree.isLeaf())))) {
            _other.rejectedSessionCount = this.rejectedSessionCount;
        }
        final PropertyTree sessionTimeoutCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionTimeoutCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionTimeoutCountPropertyTree!= null):((sessionTimeoutCountPropertyTree == null)||(!sessionTimeoutCountPropertyTree.isLeaf())))) {
            _other.sessionTimeoutCount = this.sessionTimeoutCount;
        }
        final PropertyTree sessionAbortCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionAbortCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionAbortCountPropertyTree!= null):((sessionAbortCountPropertyTree == null)||(!sessionAbortCountPropertyTree.isLeaf())))) {
            _other.sessionAbortCount = this.sessionAbortCount;
        }
        final PropertyTree currentSubscriptionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentSubscriptionCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentSubscriptionCountPropertyTree!= null):((currentSubscriptionCountPropertyTree == null)||(!currentSubscriptionCountPropertyTree.isLeaf())))) {
            _other.currentSubscriptionCount = this.currentSubscriptionCount;
        }
        final PropertyTree cumulatedSubscriptionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cumulatedSubscriptionCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cumulatedSubscriptionCountPropertyTree!= null):((cumulatedSubscriptionCountPropertyTree == null)||(!cumulatedSubscriptionCountPropertyTree.isLeaf())))) {
            _other.cumulatedSubscriptionCount = this.cumulatedSubscriptionCount;
        }
        final PropertyTree publishingIntervalCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingIntervalCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingIntervalCountPropertyTree!= null):((publishingIntervalCountPropertyTree == null)||(!publishingIntervalCountPropertyTree.isLeaf())))) {
            _other.publishingIntervalCount = this.publishingIntervalCount;
        }
        final PropertyTree securityRejectedRequestsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityRejectedRequestsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityRejectedRequestsCountPropertyTree!= null):((securityRejectedRequestsCountPropertyTree == null)||(!securityRejectedRequestsCountPropertyTree.isLeaf())))) {
            _other.securityRejectedRequestsCount = this.securityRejectedRequestsCount;
        }
        final PropertyTree rejectedRequestsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rejectedRequestsCount"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rejectedRequestsCountPropertyTree!= null):((rejectedRequestsCountPropertyTree == null)||(!rejectedRequestsCountPropertyTree.isLeaf())))) {
            _other.rejectedRequestsCount = this.rejectedRequestsCount;
        }
    }

    public<_B >ServerDiagnosticsSummaryDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ServerDiagnosticsSummaryDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ServerDiagnosticsSummaryDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ServerDiagnosticsSummaryDataType.Builder<_B> copyOf(final ServerDiagnosticsSummaryDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ServerDiagnosticsSummaryDataType.Builder<_B> _newBuilder = new ServerDiagnosticsSummaryDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ServerDiagnosticsSummaryDataType.Builder<Void> copyExcept(final ServerDiagnosticsSummaryDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ServerDiagnosticsSummaryDataType.Builder<Void> copyOnly(final ServerDiagnosticsSummaryDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ServerDiagnosticsSummaryDataType _storedValue;
        private Long serverViewCount;
        private Long currentSessionCount;
        private Long cumulatedSessionCount;
        private Long securityRejectedSessionCount;
        private Long rejectedSessionCount;
        private Long sessionTimeoutCount;
        private Long sessionAbortCount;
        private Long currentSubscriptionCount;
        private Long cumulatedSubscriptionCount;
        private Long publishingIntervalCount;
        private Long securityRejectedRequestsCount;
        private Long rejectedRequestsCount;

        public Builder(final _B _parentBuilder, final ServerDiagnosticsSummaryDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.serverViewCount = _other.serverViewCount;
                    this.currentSessionCount = _other.currentSessionCount;
                    this.cumulatedSessionCount = _other.cumulatedSessionCount;
                    this.securityRejectedSessionCount = _other.securityRejectedSessionCount;
                    this.rejectedSessionCount = _other.rejectedSessionCount;
                    this.sessionTimeoutCount = _other.sessionTimeoutCount;
                    this.sessionAbortCount = _other.sessionAbortCount;
                    this.currentSubscriptionCount = _other.currentSubscriptionCount;
                    this.cumulatedSubscriptionCount = _other.cumulatedSubscriptionCount;
                    this.publishingIntervalCount = _other.publishingIntervalCount;
                    this.securityRejectedRequestsCount = _other.securityRejectedRequestsCount;
                    this.rejectedRequestsCount = _other.rejectedRequestsCount;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ServerDiagnosticsSummaryDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree serverViewCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("serverViewCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(serverViewCountPropertyTree!= null):((serverViewCountPropertyTree == null)||(!serverViewCountPropertyTree.isLeaf())))) {
                        this.serverViewCount = _other.serverViewCount;
                    }
                    final PropertyTree currentSessionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentSessionCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentSessionCountPropertyTree!= null):((currentSessionCountPropertyTree == null)||(!currentSessionCountPropertyTree.isLeaf())))) {
                        this.currentSessionCount = _other.currentSessionCount;
                    }
                    final PropertyTree cumulatedSessionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cumulatedSessionCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cumulatedSessionCountPropertyTree!= null):((cumulatedSessionCountPropertyTree == null)||(!cumulatedSessionCountPropertyTree.isLeaf())))) {
                        this.cumulatedSessionCount = _other.cumulatedSessionCount;
                    }
                    final PropertyTree securityRejectedSessionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityRejectedSessionCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityRejectedSessionCountPropertyTree!= null):((securityRejectedSessionCountPropertyTree == null)||(!securityRejectedSessionCountPropertyTree.isLeaf())))) {
                        this.securityRejectedSessionCount = _other.securityRejectedSessionCount;
                    }
                    final PropertyTree rejectedSessionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rejectedSessionCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rejectedSessionCountPropertyTree!= null):((rejectedSessionCountPropertyTree == null)||(!rejectedSessionCountPropertyTree.isLeaf())))) {
                        this.rejectedSessionCount = _other.rejectedSessionCount;
                    }
                    final PropertyTree sessionTimeoutCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionTimeoutCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionTimeoutCountPropertyTree!= null):((sessionTimeoutCountPropertyTree == null)||(!sessionTimeoutCountPropertyTree.isLeaf())))) {
                        this.sessionTimeoutCount = _other.sessionTimeoutCount;
                    }
                    final PropertyTree sessionAbortCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionAbortCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionAbortCountPropertyTree!= null):((sessionAbortCountPropertyTree == null)||(!sessionAbortCountPropertyTree.isLeaf())))) {
                        this.sessionAbortCount = _other.sessionAbortCount;
                    }
                    final PropertyTree currentSubscriptionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("currentSubscriptionCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(currentSubscriptionCountPropertyTree!= null):((currentSubscriptionCountPropertyTree == null)||(!currentSubscriptionCountPropertyTree.isLeaf())))) {
                        this.currentSubscriptionCount = _other.currentSubscriptionCount;
                    }
                    final PropertyTree cumulatedSubscriptionCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("cumulatedSubscriptionCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(cumulatedSubscriptionCountPropertyTree!= null):((cumulatedSubscriptionCountPropertyTree == null)||(!cumulatedSubscriptionCountPropertyTree.isLeaf())))) {
                        this.cumulatedSubscriptionCount = _other.cumulatedSubscriptionCount;
                    }
                    final PropertyTree publishingIntervalCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishingIntervalCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishingIntervalCountPropertyTree!= null):((publishingIntervalCountPropertyTree == null)||(!publishingIntervalCountPropertyTree.isLeaf())))) {
                        this.publishingIntervalCount = _other.publishingIntervalCount;
                    }
                    final PropertyTree securityRejectedRequestsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("securityRejectedRequestsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(securityRejectedRequestsCountPropertyTree!= null):((securityRejectedRequestsCountPropertyTree == null)||(!securityRejectedRequestsCountPropertyTree.isLeaf())))) {
                        this.securityRejectedRequestsCount = _other.securityRejectedRequestsCount;
                    }
                    final PropertyTree rejectedRequestsCountPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("rejectedRequestsCount"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(rejectedRequestsCountPropertyTree!= null):((rejectedRequestsCountPropertyTree == null)||(!rejectedRequestsCountPropertyTree.isLeaf())))) {
                        this.rejectedRequestsCount = _other.rejectedRequestsCount;
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

        protected<_P extends ServerDiagnosticsSummaryDataType >_P init(final _P _product) {
            _product.serverViewCount = this.serverViewCount;
            _product.currentSessionCount = this.currentSessionCount;
            _product.cumulatedSessionCount = this.cumulatedSessionCount;
            _product.securityRejectedSessionCount = this.securityRejectedSessionCount;
            _product.rejectedSessionCount = this.rejectedSessionCount;
            _product.sessionTimeoutCount = this.sessionTimeoutCount;
            _product.sessionAbortCount = this.sessionAbortCount;
            _product.currentSubscriptionCount = this.currentSubscriptionCount;
            _product.cumulatedSubscriptionCount = this.cumulatedSubscriptionCount;
            _product.publishingIntervalCount = this.publishingIntervalCount;
            _product.securityRejectedRequestsCount = this.securityRejectedRequestsCount;
            _product.rejectedRequestsCount = this.rejectedRequestsCount;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "serverViewCount" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param serverViewCount
         *     Neuer Wert der Eigenschaft "serverViewCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withServerViewCount(final Long serverViewCount) {
            this.serverViewCount = serverViewCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currentSessionCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param currentSessionCount
         *     Neuer Wert der Eigenschaft "currentSessionCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withCurrentSessionCount(final Long currentSessionCount) {
            this.currentSessionCount = currentSessionCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "cumulatedSessionCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param cumulatedSessionCount
         *     Neuer Wert der Eigenschaft "cumulatedSessionCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withCumulatedSessionCount(final Long cumulatedSessionCount) {
            this.cumulatedSessionCount = cumulatedSessionCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityRejectedSessionCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param securityRejectedSessionCount
         *     Neuer Wert der Eigenschaft "securityRejectedSessionCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withSecurityRejectedSessionCount(final Long securityRejectedSessionCount) {
            this.securityRejectedSessionCount = securityRejectedSessionCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rejectedSessionCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param rejectedSessionCount
         *     Neuer Wert der Eigenschaft "rejectedSessionCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withRejectedSessionCount(final Long rejectedSessionCount) {
            this.rejectedSessionCount = rejectedSessionCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionTimeoutCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param sessionTimeoutCount
         *     Neuer Wert der Eigenschaft "sessionTimeoutCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withSessionTimeoutCount(final Long sessionTimeoutCount) {
            this.sessionTimeoutCount = sessionTimeoutCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionAbortCount" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param sessionAbortCount
         *     Neuer Wert der Eigenschaft "sessionAbortCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withSessionAbortCount(final Long sessionAbortCount) {
            this.sessionAbortCount = sessionAbortCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "currentSubscriptionCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param currentSubscriptionCount
         *     Neuer Wert der Eigenschaft "currentSubscriptionCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withCurrentSubscriptionCount(final Long currentSubscriptionCount) {
            this.currentSubscriptionCount = currentSubscriptionCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "cumulatedSubscriptionCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param cumulatedSubscriptionCount
         *     Neuer Wert der Eigenschaft "cumulatedSubscriptionCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withCumulatedSubscriptionCount(final Long cumulatedSubscriptionCount) {
            this.cumulatedSubscriptionCount = cumulatedSubscriptionCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishingIntervalCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishingIntervalCount
         *     Neuer Wert der Eigenschaft "publishingIntervalCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withPublishingIntervalCount(final Long publishingIntervalCount) {
            this.publishingIntervalCount = publishingIntervalCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "securityRejectedRequestsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param securityRejectedRequestsCount
         *     Neuer Wert der Eigenschaft "securityRejectedRequestsCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withSecurityRejectedRequestsCount(final Long securityRejectedRequestsCount) {
            this.securityRejectedRequestsCount = securityRejectedRequestsCount;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rejectedRequestsCount" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param rejectedRequestsCount
         *     Neuer Wert der Eigenschaft "rejectedRequestsCount".
         */
        public ServerDiagnosticsSummaryDataType.Builder<_B> withRejectedRequestsCount(final Long rejectedRequestsCount) {
            this.rejectedRequestsCount = rejectedRequestsCount;
            return this;
        }

        @Override
        public ServerDiagnosticsSummaryDataType build() {
            if (_storedValue == null) {
                return this.init(new ServerDiagnosticsSummaryDataType());
            } else {
                return ((ServerDiagnosticsSummaryDataType) _storedValue);
            }
        }

        public ServerDiagnosticsSummaryDataType.Builder<_B> copyOf(final ServerDiagnosticsSummaryDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ServerDiagnosticsSummaryDataType.Builder<_B> copyOf(final ServerDiagnosticsSummaryDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ServerDiagnosticsSummaryDataType.Selector<ServerDiagnosticsSummaryDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ServerDiagnosticsSummaryDataType.Select _root() {
            return new ServerDiagnosticsSummaryDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> serverViewCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> currentSessionCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> cumulatedSessionCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> securityRejectedSessionCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> rejectedSessionCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> sessionTimeoutCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> sessionAbortCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> currentSubscriptionCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> cumulatedSubscriptionCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> publishingIntervalCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> securityRejectedRequestsCount = null;
        private com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> rejectedRequestsCount = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.serverViewCount!= null) {
                products.put("serverViewCount", this.serverViewCount.init());
            }
            if (this.currentSessionCount!= null) {
                products.put("currentSessionCount", this.currentSessionCount.init());
            }
            if (this.cumulatedSessionCount!= null) {
                products.put("cumulatedSessionCount", this.cumulatedSessionCount.init());
            }
            if (this.securityRejectedSessionCount!= null) {
                products.put("securityRejectedSessionCount", this.securityRejectedSessionCount.init());
            }
            if (this.rejectedSessionCount!= null) {
                products.put("rejectedSessionCount", this.rejectedSessionCount.init());
            }
            if (this.sessionTimeoutCount!= null) {
                products.put("sessionTimeoutCount", this.sessionTimeoutCount.init());
            }
            if (this.sessionAbortCount!= null) {
                products.put("sessionAbortCount", this.sessionAbortCount.init());
            }
            if (this.currentSubscriptionCount!= null) {
                products.put("currentSubscriptionCount", this.currentSubscriptionCount.init());
            }
            if (this.cumulatedSubscriptionCount!= null) {
                products.put("cumulatedSubscriptionCount", this.cumulatedSubscriptionCount.init());
            }
            if (this.publishingIntervalCount!= null) {
                products.put("publishingIntervalCount", this.publishingIntervalCount.init());
            }
            if (this.securityRejectedRequestsCount!= null) {
                products.put("securityRejectedRequestsCount", this.securityRejectedRequestsCount.init());
            }
            if (this.rejectedRequestsCount!= null) {
                products.put("rejectedRequestsCount", this.rejectedRequestsCount.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> serverViewCount() {
            return ((this.serverViewCount == null)?this.serverViewCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "serverViewCount"):this.serverViewCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> currentSessionCount() {
            return ((this.currentSessionCount == null)?this.currentSessionCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "currentSessionCount"):this.currentSessionCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> cumulatedSessionCount() {
            return ((this.cumulatedSessionCount == null)?this.cumulatedSessionCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "cumulatedSessionCount"):this.cumulatedSessionCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> securityRejectedSessionCount() {
            return ((this.securityRejectedSessionCount == null)?this.securityRejectedSessionCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "securityRejectedSessionCount"):this.securityRejectedSessionCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> rejectedSessionCount() {
            return ((this.rejectedSessionCount == null)?this.rejectedSessionCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "rejectedSessionCount"):this.rejectedSessionCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> sessionTimeoutCount() {
            return ((this.sessionTimeoutCount == null)?this.sessionTimeoutCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "sessionTimeoutCount"):this.sessionTimeoutCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> sessionAbortCount() {
            return ((this.sessionAbortCount == null)?this.sessionAbortCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "sessionAbortCount"):this.sessionAbortCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> currentSubscriptionCount() {
            return ((this.currentSubscriptionCount == null)?this.currentSubscriptionCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "currentSubscriptionCount"):this.currentSubscriptionCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> cumulatedSubscriptionCount() {
            return ((this.cumulatedSubscriptionCount == null)?this.cumulatedSubscriptionCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "cumulatedSubscriptionCount"):this.cumulatedSubscriptionCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> publishingIntervalCount() {
            return ((this.publishingIntervalCount == null)?this.publishingIntervalCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "publishingIntervalCount"):this.publishingIntervalCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> securityRejectedRequestsCount() {
            return ((this.securityRejectedRequestsCount == null)?this.securityRejectedRequestsCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "securityRejectedRequestsCount"):this.securityRejectedRequestsCount);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>> rejectedRequestsCount() {
            return ((this.rejectedRequestsCount == null)?this.rejectedRequestsCount = new com.kscs.util.jaxb.Selector<TRoot, ServerDiagnosticsSummaryDataType.Selector<TRoot, TParent>>(this._root, this, "rejectedRequestsCount"):this.rejectedRequestsCount);
        }

    }

}
