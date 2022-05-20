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
 * <p>Java-Klasse für EventFilterResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EventFilterResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://opcfoundation.org/UA/2008/02/Types.xsd}MonitoringFilterResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectClauseResults" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="SelectClauseDiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *         &lt;element name="WhereClauseResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ContentFilterResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFilterResult", propOrder = {
    "selectClauseResults",
    "selectClauseDiagnosticInfos",
    "whereClauseResult"
})
public class EventFilterResult
    extends MonitoringFilterResult
{

    @XmlElementRef(name = "SelectClauseResults", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfStatusCode> selectClauseResults;
    @XmlElementRef(name = "SelectClauseDiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> selectClauseDiagnosticInfos;
    @XmlElementRef(name = "WhereClauseResult", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentFilterResult> whereClauseResult;

    /**
     * Ruft den Wert der selectClauseResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public JAXBElement<ListOfStatusCode> getSelectClauseResults() {
        return selectClauseResults;
    }

    /**
     * Legt den Wert der selectClauseResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfStatusCode }{@code >}
     *     
     */
    public void setSelectClauseResults(JAXBElement<ListOfStatusCode> value) {
        this.selectClauseResults = value;
    }

    /**
     * Ruft den Wert der selectClauseDiagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getSelectClauseDiagnosticInfos() {
        return selectClauseDiagnosticInfos;
    }

    /**
     * Legt den Wert der selectClauseDiagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setSelectClauseDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.selectClauseDiagnosticInfos = value;
    }

    /**
     * Ruft den Wert der whereClauseResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentFilterResult }{@code >}
     *     
     */
    public JAXBElement<ContentFilterResult> getWhereClauseResult() {
        return whereClauseResult;
    }

    /**
     * Legt den Wert der whereClauseResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentFilterResult }{@code >}
     *     
     */
    public void setWhereClauseResult(JAXBElement<ContentFilterResult> value) {
        this.whereClauseResult = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final EventFilterResult.Builder<_B> _other) {
        super.copyTo(_other);
        _other.selectClauseResults = this.selectClauseResults;
        _other.selectClauseDiagnosticInfos = this.selectClauseDiagnosticInfos;
        _other.whereClauseResult = this.whereClauseResult;
    }

    @Override
    public<_B >EventFilterResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new EventFilterResult.Builder<_B>(_parentBuilder, this, true);
    }

    @Override
    public EventFilterResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static EventFilterResult.Builder<Void> builder() {
        return new EventFilterResult.Builder<Void>(null, null, false);
    }

    public static<_B >EventFilterResult.Builder<_B> copyOf(final MonitoringFilterResult _other) {
        final EventFilterResult.Builder<_B> _newBuilder = new EventFilterResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder);
        return _newBuilder;
    }

    public static<_B >EventFilterResult.Builder<_B> copyOf(final EventFilterResult _other) {
        final EventFilterResult.Builder<_B> _newBuilder = new EventFilterResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final EventFilterResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        super.copyTo(_other, _propertyTree, _propertyTreeUse);
        final PropertyTree selectClauseResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("selectClauseResults"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(selectClauseResultsPropertyTree!= null):((selectClauseResultsPropertyTree == null)||(!selectClauseResultsPropertyTree.isLeaf())))) {
            _other.selectClauseResults = this.selectClauseResults;
        }
        final PropertyTree selectClauseDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("selectClauseDiagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(selectClauseDiagnosticInfosPropertyTree!= null):((selectClauseDiagnosticInfosPropertyTree == null)||(!selectClauseDiagnosticInfosPropertyTree.isLeaf())))) {
            _other.selectClauseDiagnosticInfos = this.selectClauseDiagnosticInfos;
        }
        final PropertyTree whereClauseResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("whereClauseResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(whereClauseResultPropertyTree!= null):((whereClauseResultPropertyTree == null)||(!whereClauseResultPropertyTree.isLeaf())))) {
            _other.whereClauseResult = this.whereClauseResult;
        }
    }

    @Override
    public<_B >EventFilterResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new EventFilterResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    @Override
    public EventFilterResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >EventFilterResult.Builder<_B> copyOf(final MonitoringFilterResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EventFilterResult.Builder<_B> _newBuilder = new EventFilterResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static<_B >EventFilterResult.Builder<_B> copyOf(final EventFilterResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final EventFilterResult.Builder<_B> _newBuilder = new EventFilterResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static EventFilterResult.Builder<Void> copyExcept(final MonitoringFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EventFilterResult.Builder<Void> copyExcept(final EventFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static EventFilterResult.Builder<Void> copyOnly(final MonitoringFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static EventFilterResult.Builder<Void> copyOnly(final EventFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >
        extends MonitoringFilterResult.Builder<_B>
        implements Buildable
    {

        private JAXBElement<ListOfStatusCode> selectClauseResults;
        private JAXBElement<ListOfDiagnosticInfo> selectClauseDiagnosticInfos;
        private JAXBElement<ContentFilterResult> whereClauseResult;

        public Builder(final _B _parentBuilder, final EventFilterResult _other, final boolean _copy) {
            super(_parentBuilder, _other, _copy);
            if (_other!= null) {
                this.selectClauseResults = _other.selectClauseResults;
                this.selectClauseDiagnosticInfos = _other.selectClauseDiagnosticInfos;
                this.whereClauseResult = _other.whereClauseResult;
            }
        }

        public Builder(final _B _parentBuilder, final EventFilterResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            super(_parentBuilder, _other, _copy, _propertyTree, _propertyTreeUse);
            if (_other!= null) {
                final PropertyTree selectClauseResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("selectClauseResults"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(selectClauseResultsPropertyTree!= null):((selectClauseResultsPropertyTree == null)||(!selectClauseResultsPropertyTree.isLeaf())))) {
                    this.selectClauseResults = _other.selectClauseResults;
                }
                final PropertyTree selectClauseDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("selectClauseDiagnosticInfos"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(selectClauseDiagnosticInfosPropertyTree!= null):((selectClauseDiagnosticInfosPropertyTree == null)||(!selectClauseDiagnosticInfosPropertyTree.isLeaf())))) {
                    this.selectClauseDiagnosticInfos = _other.selectClauseDiagnosticInfos;
                }
                final PropertyTree whereClauseResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("whereClauseResult"));
                if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(whereClauseResultPropertyTree!= null):((whereClauseResultPropertyTree == null)||(!whereClauseResultPropertyTree.isLeaf())))) {
                    this.whereClauseResult = _other.whereClauseResult;
                }
            }
        }

        protected<_P extends EventFilterResult >_P init(final _P _product) {
            _product.selectClauseResults = this.selectClauseResults;
            _product.selectClauseDiagnosticInfos = this.selectClauseDiagnosticInfos;
            _product.whereClauseResult = this.whereClauseResult;
            return super.init(_product);
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "selectClauseResults" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param selectClauseResults
         *     Neuer Wert der Eigenschaft "selectClauseResults".
         */
        public EventFilterResult.Builder<_B> withSelectClauseResults(final JAXBElement<ListOfStatusCode> selectClauseResults) {
            this.selectClauseResults = selectClauseResults;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "selectClauseDiagnosticInfos" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param selectClauseDiagnosticInfos
         *     Neuer Wert der Eigenschaft "selectClauseDiagnosticInfos".
         */
        public EventFilterResult.Builder<_B> withSelectClauseDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> selectClauseDiagnosticInfos) {
            this.selectClauseDiagnosticInfos = selectClauseDiagnosticInfos;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "whereClauseResult" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param whereClauseResult
         *     Neuer Wert der Eigenschaft "whereClauseResult".
         */
        public EventFilterResult.Builder<_B> withWhereClauseResult(final JAXBElement<ContentFilterResult> whereClauseResult) {
            this.whereClauseResult = whereClauseResult;
            return this;
        }

        @Override
        public EventFilterResult build() {
            if (_storedValue == null) {
                return this.init(new EventFilterResult());
            } else {
                return ((EventFilterResult) _storedValue);
            }
        }

        public EventFilterResult.Builder<_B> copyOf(final EventFilterResult _other) {
            _other.copyTo(this);
            return this;
        }

        public EventFilterResult.Builder<_B> copyOf(final EventFilterResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends EventFilterResult.Selector<EventFilterResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static EventFilterResult.Select _root() {
            return new EventFilterResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends MonitoringFilterResult.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>> selectClauseResults = null;
        private com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>> selectClauseDiagnosticInfos = null;
        private com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>> whereClauseResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.selectClauseResults!= null) {
                products.put("selectClauseResults", this.selectClauseResults.init());
            }
            if (this.selectClauseDiagnosticInfos!= null) {
                products.put("selectClauseDiagnosticInfos", this.selectClauseDiagnosticInfos.init());
            }
            if (this.whereClauseResult!= null) {
                products.put("whereClauseResult", this.whereClauseResult.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>> selectClauseResults() {
            return ((this.selectClauseResults == null)?this.selectClauseResults = new com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>>(this._root, this, "selectClauseResults"):this.selectClauseResults);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>> selectClauseDiagnosticInfos() {
            return ((this.selectClauseDiagnosticInfos == null)?this.selectClauseDiagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>>(this._root, this, "selectClauseDiagnosticInfos"):this.selectClauseDiagnosticInfos);
        }

        public com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>> whereClauseResult() {
            return ((this.whereClauseResult == null)?this.whereClauseResult = new com.kscs.util.jaxb.Selector<TRoot, EventFilterResult.Selector<TRoot, TParent>>(this._root, this, "whereClauseResult"):this.whereClauseResult);
        }

    }

}
