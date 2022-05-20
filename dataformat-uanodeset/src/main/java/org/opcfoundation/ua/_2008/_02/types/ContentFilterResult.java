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
 * <p>Java-Klasse für ContentFilterResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentFilterResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElementResults" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfContentFilterElementResult" minOccurs="0"/&gt;
 *         &lt;element name="ElementDiagnosticInfos" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ListOfDiagnosticInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentFilterResult", propOrder = {
    "elementResults",
    "elementDiagnosticInfos"
})
public class ContentFilterResult {

    @XmlElementRef(name = "ElementResults", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfContentFilterElementResult> elementResults;
    @XmlElementRef(name = "ElementDiagnosticInfos", namespace = "http://opcfoundation.org/UA/2008/02/Types.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListOfDiagnosticInfo> elementDiagnosticInfos;

    /**
     * Ruft den Wert der elementResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfContentFilterElementResult }{@code >}
     *     
     */
    public JAXBElement<ListOfContentFilterElementResult> getElementResults() {
        return elementResults;
    }

    /**
     * Legt den Wert der elementResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfContentFilterElementResult }{@code >}
     *     
     */
    public void setElementResults(JAXBElement<ListOfContentFilterElementResult> value) {
        this.elementResults = value;
    }

    /**
     * Ruft den Wert der elementDiagnosticInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public JAXBElement<ListOfDiagnosticInfo> getElementDiagnosticInfos() {
        return elementDiagnosticInfos;
    }

    /**
     * Legt den Wert der elementDiagnosticInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListOfDiagnosticInfo }{@code >}
     *     
     */
    public void setElementDiagnosticInfos(JAXBElement<ListOfDiagnosticInfo> value) {
        this.elementDiagnosticInfos = value;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ContentFilterResult.Builder<_B> _other) {
        _other.elementResults = this.elementResults;
        _other.elementDiagnosticInfos = this.elementDiagnosticInfos;
    }

    public<_B >ContentFilterResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ContentFilterResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ContentFilterResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ContentFilterResult.Builder<Void> builder() {
        return new ContentFilterResult.Builder<Void>(null, null, false);
    }

    public static<_B >ContentFilterResult.Builder<_B> copyOf(final ContentFilterResult _other) {
        final ContentFilterResult.Builder<_B> _newBuilder = new ContentFilterResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ContentFilterResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree elementResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("elementResults"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(elementResultsPropertyTree!= null):((elementResultsPropertyTree == null)||(!elementResultsPropertyTree.isLeaf())))) {
            _other.elementResults = this.elementResults;
        }
        final PropertyTree elementDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("elementDiagnosticInfos"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(elementDiagnosticInfosPropertyTree!= null):((elementDiagnosticInfosPropertyTree == null)||(!elementDiagnosticInfosPropertyTree.isLeaf())))) {
            _other.elementDiagnosticInfos = this.elementDiagnosticInfos;
        }
    }

    public<_B >ContentFilterResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ContentFilterResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ContentFilterResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ContentFilterResult.Builder<_B> copyOf(final ContentFilterResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ContentFilterResult.Builder<_B> _newBuilder = new ContentFilterResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ContentFilterResult.Builder<Void> copyExcept(final ContentFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ContentFilterResult.Builder<Void> copyOnly(final ContentFilterResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ContentFilterResult _storedValue;
        private JAXBElement<ListOfContentFilterElementResult> elementResults;
        private JAXBElement<ListOfDiagnosticInfo> elementDiagnosticInfos;

        public Builder(final _B _parentBuilder, final ContentFilterResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    this.elementResults = _other.elementResults;
                    this.elementDiagnosticInfos = _other.elementDiagnosticInfos;
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ContentFilterResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree elementResultsPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("elementResults"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(elementResultsPropertyTree!= null):((elementResultsPropertyTree == null)||(!elementResultsPropertyTree.isLeaf())))) {
                        this.elementResults = _other.elementResults;
                    }
                    final PropertyTree elementDiagnosticInfosPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("elementDiagnosticInfos"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(elementDiagnosticInfosPropertyTree!= null):((elementDiagnosticInfosPropertyTree == null)||(!elementDiagnosticInfosPropertyTree.isLeaf())))) {
                        this.elementDiagnosticInfos = _other.elementDiagnosticInfos;
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

        protected<_P extends ContentFilterResult >_P init(final _P _product) {
            _product.elementResults = this.elementResults;
            _product.elementDiagnosticInfos = this.elementDiagnosticInfos;
            return _product;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "elementResults" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param elementResults
         *     Neuer Wert der Eigenschaft "elementResults".
         */
        public ContentFilterResult.Builder<_B> withElementResults(final JAXBElement<ListOfContentFilterElementResult> elementResults) {
            this.elementResults = elementResults;
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "elementDiagnosticInfos" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param elementDiagnosticInfos
         *     Neuer Wert der Eigenschaft "elementDiagnosticInfos".
         */
        public ContentFilterResult.Builder<_B> withElementDiagnosticInfos(final JAXBElement<ListOfDiagnosticInfo> elementDiagnosticInfos) {
            this.elementDiagnosticInfos = elementDiagnosticInfos;
            return this;
        }

        @Override
        public ContentFilterResult build() {
            if (_storedValue == null) {
                return this.init(new ContentFilterResult());
            } else {
                return ((ContentFilterResult) _storedValue);
            }
        }

        public ContentFilterResult.Builder<_B> copyOf(final ContentFilterResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ContentFilterResult.Builder<_B> copyOf(final ContentFilterResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ContentFilterResult.Selector<ContentFilterResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ContentFilterResult.Select _root() {
            return new ContentFilterResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private com.kscs.util.jaxb.Selector<TRoot, ContentFilterResult.Selector<TRoot, TParent>> elementResults = null;
        private com.kscs.util.jaxb.Selector<TRoot, ContentFilterResult.Selector<TRoot, TParent>> elementDiagnosticInfos = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.elementResults!= null) {
                products.put("elementResults", this.elementResults.init());
            }
            if (this.elementDiagnosticInfos!= null) {
                products.put("elementDiagnosticInfos", this.elementDiagnosticInfos.init());
            }
            return products;
        }

        public com.kscs.util.jaxb.Selector<TRoot, ContentFilterResult.Selector<TRoot, TParent>> elementResults() {
            return ((this.elementResults == null)?this.elementResults = new com.kscs.util.jaxb.Selector<TRoot, ContentFilterResult.Selector<TRoot, TParent>>(this._root, this, "elementResults"):this.elementResults);
        }

        public com.kscs.util.jaxb.Selector<TRoot, ContentFilterResult.Selector<TRoot, TParent>> elementDiagnosticInfos() {
            return ((this.elementDiagnosticInfos == null)?this.elementDiagnosticInfos = new com.kscs.util.jaxb.Selector<TRoot, ContentFilterResult.Selector<TRoot, TParent>>(this._root, this, "elementDiagnosticInfos"):this.elementDiagnosticInfos);
        }

    }

}
