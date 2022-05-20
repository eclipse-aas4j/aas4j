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
 * <p>Java-Klasse für ProgramDiagnostic2DataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProgramDiagnostic2DataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateSessionId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="CreateClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvocationCreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastTransitionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastMethodCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastMethodSessionId" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeId" minOccurs="0"/&gt;
 *         &lt;element name="LastMethodInputArguments" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfArgument" minOccurs="0"/&gt;
 *         &lt;element name="LastMethodOutputArguments" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfArgument" minOccurs="0"/&gt;
 *         &lt;element name="LastMethodInputValues" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfVariant" minOccurs="0"/&gt;
 *         &lt;element name="LastMethodOutputValues" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfVariant" minOccurs="0"/&gt;
 *         &lt;element name="LastMethodCallTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastMethodReturnStatus" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}StatusResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramDiagnostic2DataType", propOrder = {
    "createSessionId",
    "createClientName",
    "invocationCreationTime",
    "lastTransitionTime",
    "lastMethodCall",
    "lastMethodSessionId",
    "lastMethodInputArguments",
    "lastMethodOutputArguments",
    "lastMethodInputValues",
    "lastMethodOutputValues",
    "lastMethodCallTime",
    "lastMethodReturnStatus"
})
public class ProgramDiagnostic2DataType {

    @XmlElementRef(name = "CreateSessionId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> createSessionId;
    @XmlElementRef(name = "CreateClientName", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createClientName;
    @XmlElement(name = "InvocationCreationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invocationCreationTime;
    @XmlElement(name = "LastTransitionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTransitionTime;
    @XmlElementRef(name = "LastMethodCall", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastMethodCall;
    @XmlElementRef(name = "LastMethodSessionId", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeId> lastMethodSessionId;
    @XmlElementRef(name = "LastMethodInputArguments", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfArgument> lastMethodInputArguments;
    @XmlElementRef(name = "LastMethodOutputArguments", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfArgument> lastMethodOutputArguments;
    @XmlElementRef(name = "LastMethodInputValues", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfVariant> lastMethodInputValues;
    @XmlElementRef(name = "LastMethodOutputValues", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfVariant> lastMethodOutputValues;
    @XmlElement(name = "LastMethodCallTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastMethodCallTime;
    @XmlElementRef(name = "LastMethodReturnStatus", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusResult> lastMethodReturnStatus;

    /**
     * Ruft den Wert der createSessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getCreateSessionId() {
        return createSessionId;
    }

    /**
     * Legt den Wert der createSessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setCreateSessionId(JAXBElement<NodeId> value) {
        this.createSessionId = value;
    }

    /**
     * Ruft den Wert der createClientName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreateClientName() {
        return createClientName;
    }

    /**
     * Legt den Wert der createClientName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreateClientName(JAXBElement<String> value) {
        this.createClientName = value;
    }

    /**
     * Ruft den Wert der invocationCreationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvocationCreationTime() {
        return invocationCreationTime;
    }

    /**
     * Legt den Wert der invocationCreationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvocationCreationTime(XMLGregorianCalendar value) {
        this.invocationCreationTime = value;
    }

    /**
     * Ruft den Wert der lastTransitionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTransitionTime() {
        return lastTransitionTime;
    }

    /**
     * Legt den Wert der lastTransitionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTransitionTime(XMLGregorianCalendar value) {
        this.lastTransitionTime = value;
    }

    /**
     * Ruft den Wert der lastMethodCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastMethodCall() {
        return lastMethodCall;
    }

    /**
     * Legt den Wert der lastMethodCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastMethodCall(JAXBElement<String> value) {
        this.lastMethodCall = value;
    }

    /**
     * Ruft den Wert der lastMethodSessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public JAXBElement<NodeId> getLastMethodSessionId() {
        return lastMethodSessionId;
    }

    /**
     * Legt den Wert der lastMethodSessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeId }{@code >}
     *     
     */
    public void setLastMethodSessionId(JAXBElement<NodeId> value) {
        this.lastMethodSessionId = value;
    }

    /**
     * Ruft den Wert der lastMethodInputArguments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfArgument }{@code >}
     *     
     */
    public JAXBElement<ListOfArgument> getLastMethodInputArguments() {
        return lastMethodInputArguments;
    }

    /**
     * Legt den Wert der lastMethodInputArguments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfArgument }{@code >}
     *     
     */
    public void setLastMethodInputArguments(JAXBElement<ListOfArgument> value) {
        this.lastMethodInputArguments = value;
    }

    /**
     * Ruft den Wert der lastMethodOutputArguments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfArgument }{@code >}
     *     
     */
    public JAXBElement<ListOfArgument> getLastMethodOutputArguments() {
        return lastMethodOutputArguments;
    }

    /**
     * Legt den Wert der lastMethodOutputArguments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfArgument }{@code >}
     *     
     */
    public void setLastMethodOutputArguments(JAXBElement<ListOfArgument> value) {
        this.lastMethodOutputArguments = value;
    }

    /**
     * Ruft den Wert der lastMethodInputValues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public JAXBElement<ListOfVariant> getLastMethodInputValues() {
        return lastMethodInputValues;
    }

    /**
     * Legt den Wert der lastMethodInputValues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public void setLastMethodInputValues(JAXBElement<ListOfVariant> value) {
        this.lastMethodInputValues = value;
    }

    /**
     * Ruft den Wert der lastMethodOutputValues-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public JAXBElement<ListOfVariant> getLastMethodOutputValues() {
        return lastMethodOutputValues;
    }

    /**
     * Legt den Wert der lastMethodOutputValues-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfVariant }{@code >}
     *     
     */
    public void setLastMethodOutputValues(JAXBElement<ListOfVariant> value) {
        this.lastMethodOutputValues = value;
    }

    /**
     * Ruft den Wert der lastMethodCallTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastMethodCallTime() {
        return lastMethodCallTime;
    }

    /**
     * Legt den Wert der lastMethodCallTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastMethodCallTime(XMLGregorianCalendar value) {
        this.lastMethodCallTime = value;
    }

    /**
     * Ruft den Wert der lastMethodReturnStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusResult }{@code >}
     *     
     */
    public JAXBElement<StatusResult> getLastMethodReturnStatus() {
        return lastMethodReturnStatus;
    }

    /**
     * Legt den Wert der lastMethodReturnStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusResult }{@code >}
     *     
     */
    public void setLastMethodReturnStatus(JAXBElement<StatusResult> value) {
        this.lastMethodReturnStatus = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ProgramDiagnostic2DataType.Builder<_B> _other) {
        _other.createSessionId = this.createSessionId;
        _other.createClientName = this.createClientName;
        _other.invocationCreationTime = ((this.invocationCreationTime == null)?null:((XMLGregorianCalendar) this.invocationCreationTime.clone()));
        _other.lastTransitionTime = ((this.lastTransitionTime == null)?null:((XMLGregorianCalendar) this.lastTransitionTime.clone()));
        _other.lastMethodCall = this.lastMethodCall;
        _other.lastMethodSessionId = this.lastMethodSessionId;
        _other.lastMethodInputArguments = this.lastMethodInputArguments;
        _other.lastMethodOutputArguments = this.lastMethodOutputArguments;
        _other.lastMethodInputValues = this.lastMethodInputValues;
        _other.lastMethodOutputValues = this.lastMethodOutputValues;
        _other.lastMethodCallTime = ((this.lastMethodCallTime == null)?null:((XMLGregorianCalendar) this.lastMethodCallTime.clone()));
        _other.lastMethodReturnStatus = this.lastMethodReturnStatus;
    }

    public<_B >ProgramDiagnostic2DataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ProgramDiagnostic2DataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ProgramDiagnostic2DataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ProgramDiagnostic2DataType.Builder<Void> builder() {
        return new ProgramDiagnostic2DataType.Builder<Void>(null, null, false);
    }

    public static<_B >ProgramDiagnostic2DataType.Builder<_B> copyOf(final ProgramDiagnostic2DataType _other) {
        final ProgramDiagnostic2DataType.Builder<_B> _newBuilder = new ProgramDiagnostic2DataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ProgramDiagnostic2DataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree createSessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createSessionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createSessionIdPropertyTree!= null):((createSessionIdPropertyTree == null)||(!createSessionIdPropertyTree.isLeaf())))) {
            _other.createSessionId = this.createSessionId;
        }
        final PropertyTree createClientNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createClientName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createClientNamePropertyTree!= null):((createClientNamePropertyTree == null)||(!createClientNamePropertyTree.isLeaf())))) {
            _other.createClientName = this.createClientName;
        }
        final PropertyTree invocationCreationTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("invocationCreationTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(invocationCreationTimePropertyTree!= null):((invocationCreationTimePropertyTree == null)||(!invocationCreationTimePropertyTree.isLeaf())))) {
            _other.invocationCreationTime = ((this.invocationCreationTime == null)?null:((XMLGregorianCalendar) this.invocationCreationTime.clone()));
        }
        final PropertyTree lastTransitionTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastTransitionTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastTransitionTimePropertyTree!= null):((lastTransitionTimePropertyTree == null)||(!lastTransitionTimePropertyTree.isLeaf())))) {
            _other.lastTransitionTime = ((this.lastTransitionTime == null)?null:((XMLGregorianCalendar) this.lastTransitionTime.clone()));
        }
        final PropertyTree lastMethodCallPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodCall"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodCallPropertyTree!= null):((lastMethodCallPropertyTree == null)||(!lastMethodCallPropertyTree.isLeaf())))) {
            _other.lastMethodCall = this.lastMethodCall;
        }
        final PropertyTree lastMethodSessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodSessionId"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodSessionIdPropertyTree!= null):((lastMethodSessionIdPropertyTree == null)||(!lastMethodSessionIdPropertyTree.isLeaf())))) {
            _other.lastMethodSessionId = this.lastMethodSessionId;
        }
        final PropertyTree lastMethodInputArgumentsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodInputArguments"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodInputArgumentsPropertyTree!= null):((lastMethodInputArgumentsPropertyTree == null)||(!lastMethodInputArgumentsPropertyTree.isLeaf())))) {
            _other.lastMethodInputArguments = this.lastMethodInputArguments;
        }
        final PropertyTree lastMethodOutputArgumentsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodOutputArguments"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodOutputArgumentsPropertyTree!= null):((lastMethodOutputArgumentsPropertyTree == null)||(!lastMethodOutputArgumentsPropertyTree.isLeaf())))) {
            _other.lastMethodOutputArguments = this.lastMethodOutputArguments;
        }
        final PropertyTree lastMethodInputValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodInputValues"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodInputValuesPropertyTree!= null):((lastMethodInputValuesPropertyTree == null)||(!lastMethodInputValuesPropertyTree.isLeaf())))) {
            _other.lastMethodInputValues = this.lastMethodInputValues;
        }
        final PropertyTree lastMethodOutputValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodOutputValues"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodOutputValuesPropertyTree!= null):((lastMethodOutputValuesPropertyTree == null)||(!lastMethodOutputValuesPropertyTree.isLeaf())))) {
            _other.lastMethodOutputValues = this.lastMethodOutputValues;
        }
        final PropertyTree lastMethodCallTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodCallTime"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodCallTimePropertyTree!= null):((lastMethodCallTimePropertyTree == null)||(!lastMethodCallTimePropertyTree.isLeaf())))) {
            _other.lastMethodCallTime = ((this.lastMethodCallTime == null)?null:((XMLGregorianCalendar) this.lastMethodCallTime.clone()));
        }
        final PropertyTree lastMethodReturnStatusPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodReturnStatus"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodReturnStatusPropertyTree!= null):((lastMethodReturnStatusPropertyTree == null)||(!lastMethodReturnStatusPropertyTree.isLeaf())))) {
            _other.lastMethodReturnStatus = this.lastMethodReturnStatus;
        }
    }

    public<_B >ProgramDiagnostic2DataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ProgramDiagnostic2DataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ProgramDiagnostic2DataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ProgramDiagnostic2DataType.Builder<_B> copyOf(final ProgramDiagnostic2DataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ProgramDiagnostic2DataType.Builder<_B> _newBuilder = new ProgramDiagnostic2DataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ProgramDiagnostic2DataType.Builder<Void> copyExcept(final ProgramDiagnostic2DataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ProgramDiagnostic2DataType.Builder<Void> copyOnly(final ProgramDiagnostic2DataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ProgramDiagnostic2DataType _storedValue;
        private JAXBElement<NodeId> createSessionId;
        private JAXBElement<String> createClientName;
        private XMLGregorianCalendar invocationCreationTime;
        private XMLGregorianCalendar lastTransitionTime;
        private JAXBElement<String> lastMethodCall;
        private JAXBElement<NodeId> lastMethodSessionId;
        private JAXBElement<ListOfArgument> lastMethodInputArguments;
        private JAXBElement<ListOfArgument> lastMethodOutputArguments;
        private JAXBElement<ListOfVariant> lastMethodInputValues;
        private JAXBElement<ListOfVariant> lastMethodOutputValues;
        private XMLGregorianCalendar lastMethodCallTime;
        private JAXBElement<StatusResult> lastMethodReturnStatus;

        public Builder(final _B _parentBuilder, final ProgramDiagnostic2DataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.createSessionId = _other.createSessionId;
                    this.createClientName = _other.createClientName;
                    this.invocationCreationTime = ((_other.invocationCreationTime == null)?null:((XMLGregorianCalendar) _other.invocationCreationTime.clone()));
                    this.lastTransitionTime = ((_other.lastTransitionTime == null)?null:((XMLGregorianCalendar) _other.lastTransitionTime.clone()));
                    this.lastMethodCall = _other.lastMethodCall;
                    this.lastMethodSessionId = _other.lastMethodSessionId;
                    this.lastMethodInputArguments = _other.lastMethodInputArguments;
                    this.lastMethodOutputArguments = _other.lastMethodOutputArguments;
                    this.lastMethodInputValues = _other.lastMethodInputValues;
                    this.lastMethodOutputValues = _other.lastMethodOutputValues;
                    this.lastMethodCallTime = ((_other.lastMethodCallTime == null)?null:((XMLGregorianCalendar) _other.lastMethodCallTime.clone()));
                    this.lastMethodReturnStatus = _other.lastMethodReturnStatus;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ProgramDiagnostic2DataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree createSessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createSessionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createSessionIdPropertyTree!= null):((createSessionIdPropertyTree == null)||(!createSessionIdPropertyTree.isLeaf())))) {
                        this.createSessionId = _other.createSessionId;
                    }
                    final PropertyTree createClientNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("createClientName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(createClientNamePropertyTree!= null):((createClientNamePropertyTree == null)||(!createClientNamePropertyTree.isLeaf())))) {
                        this.createClientName = _other.createClientName;
                    }
                    final PropertyTree invocationCreationTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("invocationCreationTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(invocationCreationTimePropertyTree!= null):((invocationCreationTimePropertyTree == null)||(!invocationCreationTimePropertyTree.isLeaf())))) {
                        this.invocationCreationTime = ((_other.invocationCreationTime == null)?null:((XMLGregorianCalendar) _other.invocationCreationTime.clone()));
                    }
                    final PropertyTree lastTransitionTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastTransitionTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastTransitionTimePropertyTree!= null):((lastTransitionTimePropertyTree == null)||(!lastTransitionTimePropertyTree.isLeaf())))) {
                        this.lastTransitionTime = ((_other.lastTransitionTime == null)?null:((XMLGregorianCalendar) _other.lastTransitionTime.clone()));
                    }
                    final PropertyTree lastMethodCallPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodCall"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodCallPropertyTree!= null):((lastMethodCallPropertyTree == null)||(!lastMethodCallPropertyTree.isLeaf())))) {
                        this.lastMethodCall = _other.lastMethodCall;
                    }
                    final PropertyTree lastMethodSessionIdPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodSessionId"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodSessionIdPropertyTree!= null):((lastMethodSessionIdPropertyTree == null)||(!lastMethodSessionIdPropertyTree.isLeaf())))) {
                        this.lastMethodSessionId = _other.lastMethodSessionId;
                    }
                    final PropertyTree lastMethodInputArgumentsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodInputArguments"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodInputArgumentsPropertyTree!= null):((lastMethodInputArgumentsPropertyTree == null)||(!lastMethodInputArgumentsPropertyTree.isLeaf())))) {
                        this.lastMethodInputArguments = _other.lastMethodInputArguments;
                    }
                    final PropertyTree lastMethodOutputArgumentsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodOutputArguments"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodOutputArgumentsPropertyTree!= null):((lastMethodOutputArgumentsPropertyTree == null)||(!lastMethodOutputArgumentsPropertyTree.isLeaf())))) {
                        this.lastMethodOutputArguments = _other.lastMethodOutputArguments;
                    }
                    final PropertyTree lastMethodInputValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodInputValues"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodInputValuesPropertyTree!= null):((lastMethodInputValuesPropertyTree == null)||(!lastMethodInputValuesPropertyTree.isLeaf())))) {
                        this.lastMethodInputValues = _other.lastMethodInputValues;
                    }
                    final PropertyTree lastMethodOutputValuesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodOutputValues"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodOutputValuesPropertyTree!= null):((lastMethodOutputValuesPropertyTree == null)||(!lastMethodOutputValuesPropertyTree.isLeaf())))) {
                        this.lastMethodOutputValues = _other.lastMethodOutputValues;
                    }
                    final PropertyTree lastMethodCallTimePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodCallTime"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodCallTimePropertyTree!= null):((lastMethodCallTimePropertyTree == null)||(!lastMethodCallTimePropertyTree.isLeaf())))) {
                        this.lastMethodCallTime = ((_other.lastMethodCallTime == null)?null:((XMLGregorianCalendar) _other.lastMethodCallTime.clone()));
                    }
                    final PropertyTree lastMethodReturnStatusPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("lastMethodReturnStatus"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(lastMethodReturnStatusPropertyTree!= null):((lastMethodReturnStatusPropertyTree == null)||(!lastMethodReturnStatusPropertyTree.isLeaf())))) {
                        this.lastMethodReturnStatus = _other.lastMethodReturnStatus;
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

        protected<_P extends ProgramDiagnostic2DataType >_P init(final _P _product) {
            _product.createSessionId = this.createSessionId;
            _product.createClientName = this.createClientName;
            _product.invocationCreationTime = this.invocationCreationTime;
            _product.lastTransitionTime = this.lastTransitionTime;
            _product.lastMethodCall = this.lastMethodCall;
            _product.lastMethodSessionId = this.lastMethodSessionId;
            _product.lastMethodInputArguments = this.lastMethodInputArguments;
            _product.lastMethodOutputArguments = this.lastMethodOutputArguments;
            _product.lastMethodInputValues = this.lastMethodInputValues;
            _product.lastMethodOutputValues = this.lastMethodOutputValues;
            _product.lastMethodCallTime = this.lastMethodCallTime;
            _product.lastMethodReturnStatus = this.lastMethodReturnStatus;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "createSessionId" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param createSessionId
         *     Neuer Wert der Eigenschaft "createSessionId".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withCreateSessionId(final JAXBElement<NodeId> createSessionId) {
            this.createSessionId = createSessionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "createClientName" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param createClientName
         *     Neuer Wert der Eigenschaft "createClientName".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withCreateClientName(final JAXBElement<String> createClientName) {
            this.createClientName = createClientName;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "invocationCreationTime" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param invocationCreationTime
         *     Neuer Wert der Eigenschaft "invocationCreationTime".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withInvocationCreationTime(final XMLGregorianCalendar invocationCreationTime) {
            this.invocationCreationTime = invocationCreationTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastTransitionTime" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param lastTransitionTime
         *     Neuer Wert der Eigenschaft "lastTransitionTime".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastTransitionTime(final XMLGregorianCalendar lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastMethodCall" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param lastMethodCall
         *     Neuer Wert der Eigenschaft "lastMethodCall".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastMethodCall(final JAXBElement<String> lastMethodCall) {
            this.lastMethodCall = lastMethodCall;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastMethodSessionId" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param lastMethodSessionId
         *     Neuer Wert der Eigenschaft "lastMethodSessionId".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastMethodSessionId(final JAXBElement<NodeId> lastMethodSessionId) {
            this.lastMethodSessionId = lastMethodSessionId;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastMethodInputArguments" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param lastMethodInputArguments
         *     Neuer Wert der Eigenschaft "lastMethodInputArguments".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastMethodInputArguments(final JAXBElement<ListOfArgument> lastMethodInputArguments) {
            this.lastMethodInputArguments = lastMethodInputArguments;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastMethodOutputArguments" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param lastMethodOutputArguments
         *     Neuer Wert der Eigenschaft "lastMethodOutputArguments".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastMethodOutputArguments(final JAXBElement<ListOfArgument> lastMethodOutputArguments) {
            this.lastMethodOutputArguments = lastMethodOutputArguments;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastMethodInputValues" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param lastMethodInputValues
         *     Neuer Wert der Eigenschaft "lastMethodInputValues".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastMethodInputValues(final JAXBElement<ListOfVariant> lastMethodInputValues) {
            this.lastMethodInputValues = lastMethodInputValues;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastMethodOutputValues" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param lastMethodOutputValues
         *     Neuer Wert der Eigenschaft "lastMethodOutputValues".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastMethodOutputValues(final JAXBElement<ListOfVariant> lastMethodOutputValues) {
            this.lastMethodOutputValues = lastMethodOutputValues;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastMethodCallTime" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param lastMethodCallTime
         *     Neuer Wert der Eigenschaft "lastMethodCallTime".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastMethodCallTime(final XMLGregorianCalendar lastMethodCallTime) {
            this.lastMethodCallTime = lastMethodCallTime;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "lastMethodReturnStatus" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param lastMethodReturnStatus
         *     Neuer Wert der Eigenschaft "lastMethodReturnStatus".
         */
        public ProgramDiagnostic2DataType.Builder<_B> withLastMethodReturnStatus(final JAXBElement<StatusResult> lastMethodReturnStatus) {
            this.lastMethodReturnStatus = lastMethodReturnStatus;
            return this;
        }

        @Override
        public ProgramDiagnostic2DataType build() {
            if (_storedValue == null) {
                return this.init(new ProgramDiagnostic2DataType());
            } else {
                return ((ProgramDiagnostic2DataType) _storedValue);
            }
        }

        public ProgramDiagnostic2DataType.Builder<_B> copyOf(final ProgramDiagnostic2DataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ProgramDiagnostic2DataType.Builder<_B> copyOf(final ProgramDiagnostic2DataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ProgramDiagnostic2DataType.Selector<ProgramDiagnostic2DataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ProgramDiagnostic2DataType.Select _root() {
            return new ProgramDiagnostic2DataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> createSessionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> createClientName = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> invocationCreationTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastTransitionTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodCall = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodSessionId = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodInputArguments = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodOutputArguments = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodInputValues = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodOutputValues = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodCallTime = null;
        private com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodReturnStatus = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.createSessionId!= null) {
                products.put("createSessionId", this.createSessionId.init());
            }
            if (this.createClientName!= null) {
                products.put("createClientName", this.createClientName.init());
            }
            if (this.invocationCreationTime!= null) {
                products.put("invocationCreationTime", this.invocationCreationTime.init());
            }
            if (this.lastTransitionTime!= null) {
                products.put("lastTransitionTime", this.lastTransitionTime.init());
            }
            if (this.lastMethodCall!= null) {
                products.put("lastMethodCall", this.lastMethodCall.init());
            }
            if (this.lastMethodSessionId!= null) {
                products.put("lastMethodSessionId", this.lastMethodSessionId.init());
            }
            if (this.lastMethodInputArguments!= null) {
                products.put("lastMethodInputArguments", this.lastMethodInputArguments.init());
            }
            if (this.lastMethodOutputArguments!= null) {
                products.put("lastMethodOutputArguments", this.lastMethodOutputArguments.init());
            }
            if (this.lastMethodInputValues!= null) {
                products.put("lastMethodInputValues", this.lastMethodInputValues.init());
            }
            if (this.lastMethodOutputValues!= null) {
                products.put("lastMethodOutputValues", this.lastMethodOutputValues.init());
            }
            if (this.lastMethodCallTime!= null) {
                products.put("lastMethodCallTime", this.lastMethodCallTime.init());
            }
            if (this.lastMethodReturnStatus!= null) {
                products.put("lastMethodReturnStatus", this.lastMethodReturnStatus.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> createSessionId() {
            return ((this.createSessionId == null)?this.createSessionId = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "createSessionId"):this.createSessionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> createClientName() {
            return ((this.createClientName == null)?this.createClientName = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "createClientName"):this.createClientName);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> invocationCreationTime() {
            return ((this.invocationCreationTime == null)?this.invocationCreationTime = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "invocationCreationTime"):this.invocationCreationTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastTransitionTime() {
            return ((this.lastTransitionTime == null)?this.lastTransitionTime = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastTransitionTime"):this.lastTransitionTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodCall() {
            return ((this.lastMethodCall == null)?this.lastMethodCall = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastMethodCall"):this.lastMethodCall);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodSessionId() {
            return ((this.lastMethodSessionId == null)?this.lastMethodSessionId = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastMethodSessionId"):this.lastMethodSessionId);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodInputArguments() {
            return ((this.lastMethodInputArguments == null)?this.lastMethodInputArguments = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastMethodInputArguments"):this.lastMethodInputArguments);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodOutputArguments() {
            return ((this.lastMethodOutputArguments == null)?this.lastMethodOutputArguments = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastMethodOutputArguments"):this.lastMethodOutputArguments);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodInputValues() {
            return ((this.lastMethodInputValues == null)?this.lastMethodInputValues = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastMethodInputValues"):this.lastMethodInputValues);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodOutputValues() {
            return ((this.lastMethodOutputValues == null)?this.lastMethodOutputValues = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastMethodOutputValues"):this.lastMethodOutputValues);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodCallTime() {
            return ((this.lastMethodCallTime == null)?this.lastMethodCallTime = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastMethodCallTime"):this.lastMethodCallTime);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>> lastMethodReturnStatus() {
            return ((this.lastMethodReturnStatus == null)?this.lastMethodReturnStatus = new com.kscs.util.jaxb.Selector<TRoot, ProgramDiagnostic2DataType.Selector<TRoot, TParent>>(this._root, this, "lastMethodReturnStatus"):this.lastMethodReturnStatus);
        }

    }

}
