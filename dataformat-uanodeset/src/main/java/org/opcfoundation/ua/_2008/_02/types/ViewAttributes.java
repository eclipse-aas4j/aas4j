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
 * <p>Java-Klasse für ViewAttributes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ViewAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}NodeAttributes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainsNoLoops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "ViewAttributes", propOrder = {
    "containsNoLoops",
    "eventNotifier"
})
public class ViewAttributes
    extends NodeAttributes
{

    @XmlElement(name = "ContainsNoLoops")
    protected Boolean containsNoLoops;
    @XmlElement(name = "EventNotifier")
    @XmlSchemaType(name = "unsignedByte")
    protected Short eventNotifier;

    /**
     * Ruft den Wert der containsNoLoops-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsNoLoops() {
        return containsNoLoops;
    }

    /**
     * Legt den Wert der containsNoLoops-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsNoLoops(Boolean value) {
        this.containsNoLoops = value;
    }

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
    public<_B >void copyTo(final ViewAttributes.Builder<_B> _other) {
        super.copyTo(_other);
        _other.containsNoLoops = this.containsNoLoops;
        _other.eventNotifier = this.eventNotifier;
    }

    @Override
    public<_B >ViewAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ViewAttributes.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public ViewAttributes.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ViewAttributes.Builder<Void> builder() {
        return new ViewAttributes.Builder<Void>(null, null, false);
    }

    public static<_B >ViewAttributes.Builder<_B> copyOf(final NodeAttributes _other) {
        final ViewAttributes.Builder<_B> _newBuilder = new ViewAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >ViewAttributes.Builder<_B> copyOf(final ViewAttributes _other) {
        final ViewAttributes.Builder<_B> _newBuilder = new ViewAttributes.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ViewAttributes.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree containsNoLoopsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("containsNoLoops"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(containsNoLoopsPropertyTree!= null):((containsNoLoopsPropertyTree == null)||(!containsNoLoopsPropertyTree.isLeaf())))) {
            _other.containsNoLoops = this.containsNoLoops;
        }
        final PropertyTree eventNotifierPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventNotifier"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventNotifierPropertyTree!= null):((eventNotifierPropertyTree == null)||(!eventNotifierPropertyTree.isLeaf())))) {
            _other.eventNotifier = this.eventNotifier;
        }
    }

    @Override
    public<_B >ViewAttributes.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ViewAttributes.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public ViewAttributes.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ViewAttributes.Builder<_B> copyOf(final NodeAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ViewAttributes.Builder<_B> _newBuilder = new ViewAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >ViewAttributes.Builder<_B> copyOf(final ViewAttributes _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ViewAttributes.Builder<_B> _newBuilder = new ViewAttributes.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ViewAttributes.Builder<Void> copyExcept(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ViewAttributes.Builder<Void> copyExcept(final ViewAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ViewAttributes.Builder<Void> copyOnly(final NodeAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static ViewAttributes.Builder<Void> copyOnly(final ViewAttributes _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends NodeAttributes.Builder<_B>
        implements Buildable
    {

        private Boolean containsNoLoops;
        private Short eventNotifier;

        public Builder(final _B _parentBuilder, final ViewAttributes _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.containsNoLoops = _other.containsNoLoops;
                this.eventNotifier = _other.eventNotifier;
            }
        }

        public Builder(final _B _parentBuilder, final ViewAttributes _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree containsNoLoopsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("containsNoLoops"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(containsNoLoopsPropertyTree!= null):((containsNoLoopsPropertyTree == null)||(!containsNoLoopsPropertyTree.isLeaf())))) {
                    this.containsNoLoops = _other.containsNoLoops;
                }
                final PropertyTree eventNotifierPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("eventNotifier"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(eventNotifierPropertyTree!= null):((eventNotifierPropertyTree == null)||(!eventNotifierPropertyTree.isLeaf())))) {
                    this.eventNotifier = _other.eventNotifier;
                }
            }
        }

        protected<_P extends ViewAttributes >_P init(final _P _product) {
            _product.containsNoLoops = this.containsNoLoops;
            _product.eventNotifier = this.eventNotifier;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "containsNoLoops" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param containsNoLoops
         *     Neuer Wert der Eigenschaft "containsNoLoops".
         */
        public ViewAttributes.Builder<_B> withContainsNoLoops(final Boolean containsNoLoops) {
            this.containsNoLoops = containsNoLoops;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "eventNotifier" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param eventNotifier
         *     Neuer Wert der Eigenschaft "eventNotifier".
         */
        public ViewAttributes.Builder<_B> withEventNotifier(final Short eventNotifier) {
            this.eventNotifier = eventNotifier;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "specifiedAttributes" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param specifiedAttributes
         *     Neuer Wert der Eigenschaft "specifiedAttributes".
         */
        @Override
        public ViewAttributes.Builder<_B> withSpecifiedAttributes(final Long specifiedAttributes) {
            super.withSpecifiedAttributes(specifiedAttributes);
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
        public ViewAttributes.Builder<_B> withDisplayName(final JAXBElement<LocalizedText> displayName) {
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
        public ViewAttributes.Builder<_B> withDescription(final JAXBElement<LocalizedText> description) {
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
        public ViewAttributes.Builder<_B> withWriteMask(final Long writeMask) {
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
        public ViewAttributes.Builder<_B> withUserWriteMask(final Long userWriteMask) {
            super.withUserWriteMask(userWriteMask);
            return this;
        }

        @Override
        public ViewAttributes build() {
            if (_storedValue == null) {
                return this.init(new ViewAttributes());
            } else {
                return ((ViewAttributes) _storedValue);
            }
        }

        public ViewAttributes.Builder<_B> copyOf(final ViewAttributes _other) {
            _other.copyTo(this);
            return this;
        }

        public ViewAttributes.Builder<_B> copyOf(final ViewAttributes.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ViewAttributes.Selector<ViewAttributes.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ViewAttributes.Select _root() {
            return new ViewAttributes.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends NodeAttributes.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ViewAttributes.Selector<TRoot, TParent>> containsNoLoops = null;
        private com.kscs.util.jaxb.Selector<TRoot, ViewAttributes.Selector<TRoot, TParent>> eventNotifier = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.containsNoLoops!= null) {
                products.put("containsNoLoops", this.containsNoLoops.init());
            }
            if (this.eventNotifier!= null) {
                products.put("eventNotifier", this.eventNotifier.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ViewAttributes.Selector<TRoot, TParent>> containsNoLoops() {
            return ((this.containsNoLoops == null)?this.containsNoLoops = new com.kscs.util.jaxb.Selector<TRoot, ViewAttributes.Selector<TRoot, TParent>>(this._root, this, "containsNoLoops"):this.containsNoLoops);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ViewAttributes.Selector<TRoot, TParent>> eventNotifier() {
            return ((this.eventNotifier == null)?this.eventNotifier = new com.kscs.util.jaxb.Selector<TRoot, ViewAttributes.Selector<TRoot, TParent>>(this._root, this, "eventNotifier"):this.eventNotifier);
        }

    }

}
