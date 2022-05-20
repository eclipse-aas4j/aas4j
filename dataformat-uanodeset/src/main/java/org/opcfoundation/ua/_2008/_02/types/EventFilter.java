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
 * <p>Java-Klasse für EventFilter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EventFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoringFilter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectClauses" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfSimpleAttributeOperand" minOccurs="0"/&gt;
 *         &lt;element name="WhereClause" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ContentFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFilter", propOrder = {
    "selectClauses",
    "whereClause"
})
public class EventFilter
    extends MonitoringFilter
{

    @XmlElementRef(name = "SelectClauses", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfSimpleAttributeOperand> selectClauses;
    @XmlElementRef(name = "WhereClause", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentFilter> whereClause;

    /**
     * Ruft den Wert der selectClauses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfSimpleAttributeOperand }{@code >}
     *     
     */
    public JAXBElement<ListOfSimpleAttributeOperand> getSelectClauses() {
        return selectClauses;
    }

    /**
     * Legt den Wert der selectClauses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfSimpleAttributeOperand }{@code >}
     *     
     */
    public void setSelectClauses(JAXBElement<ListOfSimpleAttributeOperand> value) {
        this.selectClauses = value;
    }

    /**
     * Ruft den Wert der whereClause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentFilter }{@code >}
     *     
     */
    public JAXBElement<ContentFilter> getWhereClause() {
        return whereClause;
    }

    /**
     * Legt den Wert der whereClause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentFilter }{@code >}
     *     
     */
    public void setWhereClause(JAXBElement<ContentFilter> value) {
        this.whereClause = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EventFilter.Builder<_B> _other) {
        super.copyTo(_other);
        _other.selectClauses = this.selectClauses;
        _other.whereClause = this.whereClause;
    }

    @Override
    public<_B >EventFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EventFilter.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public EventFilter.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EventFilter.Builder<Void> builder() {
        return new EventFilter.Builder<Void>(null, null, false);
    }

    public static<_B >EventFilter.Builder<_B> copyOf(final MonitoringFilter _other) {
        final EventFilter.Builder<_B> _newBuilder = new EventFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >EventFilter.Builder<_B> copyOf(final EventFilter _other) {
        final EventFilter.Builder<_B> _newBuilder = new EventFilter.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EventFilter.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree selectClausesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("selectClauses"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(selectClausesPropertyTree!= null):((selectClausesPropertyTree == null)||(!selectClausesPropertyTree.isLeaf())))) {
            _other.selectClauses = this.selectClauses;
        }
        final PropertyTree whereClausePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("whereClause"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(whereClausePropertyTree!= null):((whereClausePropertyTree == null)||(!whereClausePropertyTree.isLeaf())))) {
            _other.whereClause = this.whereClause;
        }
    }

    @Override
    public<_B >EventFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EventFilter.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public EventFilter.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EventFilter.Builder<_B> copyOf(final MonitoringFilter _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EventFilter.Builder<_B> _newBuilder = new EventFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >EventFilter.Builder<_B> copyOf(final EventFilter _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EventFilter.Builder<_B> _newBuilder = new EventFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EventFilter.Builder<Void> copyExcept(final MonitoringFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EventFilter.Builder<Void> copyExcept(final EventFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EventFilter.Builder<Void> copyOnly(final MonitoringFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static EventFilter.Builder<Void> copyOnly(final EventFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends MonitoringFilter.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfSimpleAttributeOperand> selectClauses;
        private JAXBElement<ContentFilter> whereClause;

        public Builder(final _B _parentBuilder, final EventFilter _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.selectClauses = _other.selectClauses;
                this.whereClause = _other.whereClause;
            }
        }

        public Builder(final _B _parentBuilder, final EventFilter _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree selectClausesPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("selectClauses"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(selectClausesPropertyTree!= null):((selectClausesPropertyTree == null)||(!selectClausesPropertyTree.isLeaf())))) {
                    this.selectClauses = _other.selectClauses;
                }
                final PropertyTree whereClausePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("whereClause"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(whereClausePropertyTree!= null):((whereClausePropertyTree == null)||(!whereClausePropertyTree.isLeaf())))) {
                    this.whereClause = _other.whereClause;
                }
            }
        }

        protected<_P extends EventFilter >_P init(final _P _product) {
            _product.selectClauses = this.selectClauses;
            _product.whereClause = this.whereClause;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "selectClauses" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param selectClauses
         *     Neuer Wert der Eigenschaft "selectClauses".
         */
        public EventFilter.Builder<_B> withSelectClauses(final JAXBElement<ListOfSimpleAttributeOperand> selectClauses) {
            this.selectClauses = selectClauses;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "whereClause" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param whereClause
         *     Neuer Wert der Eigenschaft "whereClause".
         */
        public EventFilter.Builder<_B> withWhereClause(final JAXBElement<ContentFilter> whereClause) {
            this.whereClause = whereClause;
            return this;
        }

        @Override
        public EventFilter build() {
            if (_storedValue == null) {
                return this.init(new EventFilter());
            } else {
                return ((EventFilter) _storedValue);
            }
        }

        public EventFilter.Builder<_B> copyOf(final EventFilter _other) {
            _other.copyTo(this);
            return this;
        }

        public EventFilter.Builder<_B> copyOf(final EventFilter.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EventFilter.Selector<EventFilter.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EventFilter.Select _root() {
            return new EventFilter.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends MonitoringFilter.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EventFilter.Selector<TRoot, TParent>> selectClauses = null;
        private com.kscs.util.jaxb.Selector<TRoot, EventFilter.Selector<TRoot, TParent>> whereClause = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.selectClauses!= null) {
                products.put("selectClauses", this.selectClauses.init());
            }
            if (this.whereClause!= null) {
                products.put("whereClause", this.whereClause.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EventFilter.Selector<TRoot, TParent>> selectClauses() {
            return ((this.selectClauses == null)?this.selectClauses = new com.kscs.util.jaxb.Selector<TRoot, EventFilter.Selector<TRoot, TParent>>(this._root, this, "selectClauses"):this.selectClauses);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EventFilter.Selector<TRoot, TParent>> whereClause() {
            return ((this.whereClause == null)?this.whereClause = new com.kscs.util.jaxb.Selector<TRoot, EventFilter.Selector<TRoot, TParent>>(this._root, this, "whereClause"):this.whereClause);
        }

    }

}
