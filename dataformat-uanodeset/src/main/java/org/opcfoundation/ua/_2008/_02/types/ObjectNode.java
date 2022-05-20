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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ObjectNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ObjectNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}InstanceNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventNotifier" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectNode", propOrder = {
    "eventNotifier"
})
public class ObjectNode
    extends InstanceNode
{

    @XmlElement(name = "EventNotifier")
    @XmlSchemaType(name = "unsignedByte")
    protected Short eventNotifier;

    /**
     * Ruft den Wert der eventNotifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEventNotifier() {
        return eventNotifier;
    }

    /**
     * Legt den Wert der eventNotifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEventNotifier(Short value) {
        this.eventNotifier = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ObjectNode.Builder<_B> _other) {
        super.copyTo(_other);
        _other.eventNotifier = this.eventNotifier;
    }

    @Override
    public<_B >ObjectNode.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ObjectNode.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ObjectNode.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ObjectNode.Builder<Void> builder() {
        return new ObjectNode.Builder<Void>(null, null, false);
    }

    public static<_B >ObjectNode.Builder<_B> copyOf(final Node _other) {
        final ObjectNode.Builder<_B> _newBuilder = new ObjectNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ObjectNode.Builder<_B> copyOf(final InstanceNode _other) {
        final ObjectNode.Builder<_B> _newBuilder = new ObjectNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ObjectNode.Builder<_B> copyOf(final ObjectNode _other) {
        final ObjectNode.Builder<_B> _newBuilder = new ObjectNode.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ObjectNode.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree eventNotifierPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventNotifier"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventNotifierPropertyTree!= null):((eventNotifierPropertyTree == null)||(!eventNotifierPropertyTree.isLeaf())))) {
            _other.eventNotifier = this.eventNotifier;
        }
    }

    @Override
    public<_B >ObjectNode.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ObjectNode.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ObjectNode.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ObjectNode.Builder<_B> copyOf(final Node _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ObjectNode.Builder<_B> _newBuilder = new ObjectNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ObjectNode.Builder<_B> copyOf(final InstanceNode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ObjectNode.Builder<_B> _newBuilder = new ObjectNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ObjectNode.Builder<_B> copyOf(final ObjectNode _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ObjectNode.Builder<_B> _newBuilder = new ObjectNode.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ObjectNode.Builder<Void> copyExcept(final Node _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ObjectNode.Builder<Void> copyExcept(final InstanceNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ObjectNode.Builder<Void> copyExcept(final ObjectNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ObjectNode.Builder<Void> copyOnly(final Node _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ObjectNode.Builder<Void> copyOnly(final InstanceNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ObjectNode.Builder<Void> copyOnly(final ObjectNode _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends InstanceNode.Builder<_B>
        implements Buildable
    {

        private Short eventNotifier;

        public Builder(final _B _parentBuilder, final ObjectNode _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.eventNotifier = _other.eventNotifier;
            }
        }

        public Builder(final _B _parentBuilder, final ObjectNode _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree eventNotifierPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventNotifier"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventNotifierPropertyTree!= null):((eventNotifierPropertyTree == null)||(!eventNotifierPropertyTree.isLeaf())))) {
                    this.eventNotifier = _other.eventNotifier;
                }
            }
        }

        protected<_P extends ObjectNode >_P init(final _P _product) {
            _product.eventNotifier = this.eventNotifier;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventNotifier" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param eventNotifier
         *     Neuer Wert der Eigenschaft "eventNotifier".
         */
        public ObjectNode.Builder<_B> withEventNotifier(final Short eventNotifier) {
            this.eventNotifier = eventNotifier;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeId" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeId
         *     Neuer Wert der Eigenschaft "nodeId".
         */
        @Override
        public ObjectNode.Builder<_B> withNodeId(final JAXBElement<NodeId> nodeId) {
            super.withNodeId(nodeId);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "nodeClass" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param nodeClass
         *     Neuer Wert der Eigenschaft "nodeClass".
         */
        @Override
        public ObjectNode.Builder<_B> withNodeClass(final NodeClass nodeClass) {
            super.withNodeClass(nodeClass);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "browseName" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param browseName
         *     Neuer Wert der Eigenschaft "browseName".
         */
        @Override
        public ObjectNode.Builder<_B> withBrowseName(final JAXBElement<QualifiedName> browseName) {
            super.withBrowseName(browseName);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "displayName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param displayName
         *     Neuer Wert der Eigenschaft "displayName".
         */
        @Override
        public ObjectNode.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
            super.withDisplayName(displayName);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "description" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param description
         *     Neuer Wert der Eigenschaft "description".
         */
        @Override
        public ObjectNode.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
            super.withDescription(description);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "writeMask" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param writeMask
         *     Neuer Wert der Eigenschaft "writeMask".
         */
        @Override
        public ObjectNode.Builder<_B> withWriteMask(final Long writeMask) {
            super.withWriteMask(writeMask);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userWriteMask" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userWriteMask
         *     Neuer Wert der Eigenschaft "userWriteMask".
         */
        @Override
        public ObjectNode.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            super.withUserWriteMask(userWriteMask);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "rolePermissions" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param rolePermissions
         *     Neuer Wert der Eigenschaft "rolePermissions".
         */
        @Override
        public ObjectNode.Builder<_B> withRolePermissions(final JAXBElement<ListOfRolePermissionType> rolePermissions) {
            super.withRolePermissions(rolePermissions);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userRolePermissions" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param userRolePermissions
         *     Neuer Wert der Eigenschaft "userRolePermissions".
         */
        @Override
        public ObjectNode.Builder<_B> withUserRolePermissions(final JAXBElement<ListOfRolePermissionType> userRolePermissions) {
            super.withUserRolePermissions(userRolePermissions);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "accessRestrictions" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param accessRestrictions
         *     Neuer Wert der Eigenschaft "accessRestrictions".
         */
        @Override
        public ObjectNode.Builder<_B> withAccessRestrictions(final Integer accessRestrictions) {
            super.withAccessRestrictions(accessRestrictions);
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "references" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param references
         *     Neuer Wert der Eigenschaft "references".
         */
        @Override
        public ObjectNode.Builder<_B> withReferences(final JAXBElement<ListOfReferenceNode> references) {
            super.withReferences(references);
            return this;
        }

        @Override
        public ObjectNode build() {
            if (_storedValue == null) {
                return this.init(new ObjectNode());
            } else {
                return ((ObjectNode) _storedValue);
            }
        }

        public ObjectNode.Builder<_B> copyOf(final ObjectNode _other) {
            _other.copyTo(this);
            return this;
        }

        public ObjectNode.Builder<_B> copyOf(final ObjectNode.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ObjectNode.Selector<ObjectNode.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ObjectNode.Select _root() {
            return new ObjectNode.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends InstanceNode.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ObjectNode.Selector<TRoot, TParent>> eventNotifier = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.eventNotifier!= null) {
                products.put("eventNotifier", this.eventNotifier.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ObjectNode.Selector<TRoot, TParent>> eventNotifier() {
            return ((this.eventNotifier == null)?this.eventNotifier = new com.kscs.util.jaxb.Selector<TRoot, ObjectNode.Selector<TRoot, TParent>>(this._root, this, "eventNotifier"):this.eventNotifier);
        }

    }

}
