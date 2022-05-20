//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;
import org.w3c.dom.Element;


/**
 * <p>Java-Klasse für ListOfXmlElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfXmlElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XmlElement" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfXmlElement", propOrder = {
    "xmlElement"
})
public class ListOfXmlElement {

    @javax.xml.bind.annotation.XmlElement(name = "XmlElement", nillable = true)
    protected List<ListOfXmlElement.XmlElement> xmlElement;

    /**
     * Gets the value of the xmlElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmlElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfXmlElement.XmlElement }
     * 
     * 
     */
    public List<ListOfXmlElement.XmlElement> getXmlElement() {
        if (xmlElement == null) {
            xmlElement = new ArrayList<ListOfXmlElement.XmlElement>();
        }
        return this.xmlElement;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfXmlElement.Builder<_B> _other) {
        if (this.xmlElement == null) {
            _other.xmlElement = null;
        } else {
            _other.xmlElement = new ArrayList<ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>>();
            for (ListOfXmlElement.XmlElement _item: this.xmlElement) {
                _other.xmlElement.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfXmlElement.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfXmlElement.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfXmlElement.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfXmlElement.Builder<Void> builder() {
        return new ListOfXmlElement.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfXmlElement.Builder<_B> copyOf(final ListOfXmlElement _other) {
        final ListOfXmlElement.Builder<_B> _newBuilder = new ListOfXmlElement.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfXmlElement.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree xmlElementPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("xmlElement"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(xmlElementPropertyTree!= null):((xmlElementPropertyTree == null)||(!xmlElementPropertyTree.isLeaf())))) {
            if (this.xmlElement == null) {
                _other.xmlElement = null;
            } else {
                _other.xmlElement = new ArrayList<ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>>();
                for (ListOfXmlElement.XmlElement _item: this.xmlElement) {
                    _other.xmlElement.add(((_item == null)?null:_item.newCopyBuilder(_other, xmlElementPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfXmlElement.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfXmlElement.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfXmlElement.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfXmlElement.Builder<_B> copyOf(final ListOfXmlElement _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfXmlElement.Builder<_B> _newBuilder = new ListOfXmlElement.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfXmlElement.Builder<Void> copyExcept(final ListOfXmlElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfXmlElement.Builder<Void> copyOnly(final ListOfXmlElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfXmlElement _storedValue;
        private List<ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>> xmlElement;

        public Builder(final _B _parentBuilder, final ListOfXmlElement _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.xmlElement == null) {
                        this.xmlElement = null;
                    } else {
                        this.xmlElement = new ArrayList<ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>>();
                        for (ListOfXmlElement.XmlElement _item: _other.xmlElement) {
                            this.xmlElement.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfXmlElement _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree xmlElementPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("xmlElement"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(xmlElementPropertyTree!= null):((xmlElementPropertyTree == null)||(!xmlElementPropertyTree.isLeaf())))) {
                        if (_other.xmlElement == null) {
                            this.xmlElement = null;
                        } else {
                            this.xmlElement = new ArrayList<ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>>();
                            for (ListOfXmlElement.XmlElement _item: _other.xmlElement) {
                                this.xmlElement.add(((_item == null)?null:_item.newCopyBuilder(this, xmlElementPropertyTree, _propertyTreeUse)));
                            }
                        }
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

        protected<_P extends ListOfXmlElement >_P init(final _P _product) {
            if (this.xmlElement!= null) {
                final List<ListOfXmlElement.XmlElement> xmlElement = new ArrayList<ListOfXmlElement.XmlElement>(this.xmlElement.size());
                for (ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>> _item: this.xmlElement) {
                    xmlElement.add(_item.build());
                }
                _product.xmlElement = xmlElement;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "xmlElement" hinzu.
         * 
         * @param xmlElement
         *     Werte, die zur Eigenschaft "xmlElement" hinzugefügt werden.
         */
        public ListOfXmlElement.Builder<_B> addXmlElement(final Iterable<? extends ListOfXmlElement.XmlElement> xmlElement) {
            if (xmlElement!= null) {
                if (this.xmlElement == null) {
                    this.xmlElement = new ArrayList<ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>>();
                }
                for (ListOfXmlElement.XmlElement _item: xmlElement) {
                    this.xmlElement.add(new ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "xmlElement" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param xmlElement
         *     Neuer Wert der Eigenschaft "xmlElement".
         */
        public ListOfXmlElement.Builder<_B> withXmlElement(final Iterable<? extends ListOfXmlElement.XmlElement> xmlElement) {
            if (this.xmlElement!= null) {
                this.xmlElement.clear();
            }
            return addXmlElement(xmlElement);
        }

        /**
         * Fügt Werte zur Eigenschaft "xmlElement" hinzu.
         * 
         * @param xmlElement
         *     Werte, die zur Eigenschaft "xmlElement" hinzugefügt werden.
         */
        public ListOfXmlElement.Builder<_B> addXmlElement(ListOfXmlElement.XmlElement... xmlElement) {
            addXmlElement(Arrays.asList(xmlElement));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "xmlElement" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param xmlElement
         *     Neuer Wert der Eigenschaft "xmlElement".
         */
        public ListOfXmlElement.Builder<_B> withXmlElement(ListOfXmlElement.XmlElement... xmlElement) {
            withXmlElement(Arrays.asList(xmlElement));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "XmlElement".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ListOfXmlElement.XmlElement.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "XmlElement".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ListOfXmlElement.XmlElement.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ListOfXmlElement.XmlElement.Builder<? extends ListOfXmlElement.Builder<_B>> addXmlElement() {
            if (this.xmlElement == null) {
                this.xmlElement = new ArrayList<ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>>();
            }
            final ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>> xmlElement_Builder = new ListOfXmlElement.XmlElement.Builder<ListOfXmlElement.Builder<_B>>(this, null, false);
            this.xmlElement.add(xmlElement_Builder);
            return xmlElement_Builder;
        }

        @Override
        public ListOfXmlElement build() {
            if (_storedValue == null) {
                return this.init(new ListOfXmlElement());
            } else {
                return ((ListOfXmlElement) _storedValue);
            }
        }

        public ListOfXmlElement.Builder<_B> copyOf(final ListOfXmlElement _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfXmlElement.Builder<_B> copyOf(final ListOfXmlElement.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfXmlElement.Selector<ListOfXmlElement.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfXmlElement.Select _root() {
            return new ListOfXmlElement.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ListOfXmlElement.XmlElement.Selector<TRoot, ListOfXmlElement.Selector<TRoot, TParent>> xmlElement = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.xmlElement!= null) {
                products.put("xmlElement", this.xmlElement.init());
            }
            return products;
        }

        public ListOfXmlElement.XmlElement.Selector<TRoot, ListOfXmlElement.Selector<TRoot, TParent>> xmlElement() {
            return ((this.xmlElement == null)?this.xmlElement = new ListOfXmlElement.XmlElement.Selector<TRoot, ListOfXmlElement.Selector<TRoot, TParent>>(this._root, this, "xmlElement"):this.xmlElement);
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class XmlElement {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Ruft den Wert der any-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Legt den Wert der any-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        /**
         * Copies all state of this object to a builder. This method is used by the {@link
         * #copyOf} method and should not be called directly by client code.
         * 
         * @param _other
         *     A builder instance to which the state of this object will be copied.
         */
        public<_B >void copyTo(final ListOfXmlElement.XmlElement.Builder<_B> _other) {
        }

        public<_B >ListOfXmlElement.XmlElement.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
            return new ListOfXmlElement.XmlElement.Builder<_B>(_parentBuilder, this, true);
        }

        public ListOfXmlElement.XmlElement.Builder<Void> newCopyBuilder() {
            return newCopyBuilder(null);
        }

        public static ListOfXmlElement.XmlElement.Builder<Void> builder() {
            return new ListOfXmlElement.XmlElement.Builder<Void>(null, null, false);
        }

        public static<_B >ListOfXmlElement.XmlElement.Builder<_B> copyOf(final ListOfXmlElement.XmlElement _other) {
            final ListOfXmlElement.XmlElement.Builder<_B> _newBuilder = new ListOfXmlElement.XmlElement.Builder<_B>(null, null, false);
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
        public<_B >void copyTo(final ListOfXmlElement.XmlElement.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        }

        public<_B >ListOfXmlElement.XmlElement.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            return new ListOfXmlElement.XmlElement.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
        }

        public ListOfXmlElement.XmlElement.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
        }

        public static<_B >ListOfXmlElement.XmlElement.Builder<_B> copyOf(final ListOfXmlElement.XmlElement _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            final ListOfXmlElement.XmlElement.Builder<_B> _newBuilder = new ListOfXmlElement.XmlElement.Builder<_B>(null, null, false);
            _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
            return _newBuilder;
        }

        public static ListOfXmlElement.XmlElement.Builder<Void> copyExcept(final ListOfXmlElement.XmlElement _other, final PropertyTree _propertyTree) {
            return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
        }

        public static ListOfXmlElement.XmlElement.Builder<Void> copyOnly(final ListOfXmlElement.XmlElement _other, final PropertyTree _propertyTree) {
            return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
        }

        public static class Builder<_B >implements Buildable
        {

            protected final _B _parentBuilder;
            protected final ListOfXmlElement.XmlElement _storedValue;
            private Object any;

            public Builder(final _B _parentBuilder, final ListOfXmlElement.XmlElement _other, final boolean _copy) {
                this._parentBuilder = _parentBuilder;
                if (_other!= null) {
                    if (_copy) {
                        _storedValue = null;
                    } else {
                        _storedValue = _other;
                    }
                } else {
                    _storedValue = null;
                }
            }

            public Builder(final _B _parentBuilder, final ListOfXmlElement.XmlElement _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
                this._parentBuilder = _parentBuilder;
                if (_other!= null) {
                    if (_copy) {
                        _storedValue = null;
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

            protected<_P extends ListOfXmlElement.XmlElement >_P init(final _P _product) {
                _product.any = this.any;
                return _product;
            }

            /**
             * Setzt den neuen Wert der Eigenschaft "any" (Vorher zugewiesener Wert wird
             * ersetzt)
             * 
             * @param any
             *     Neuer Wert der Eigenschaft "any".
             */
            public ListOfXmlElement.XmlElement.Builder<_B> withAny(final Object any) {
                this.any = any;
                return this;
            }

            @Override
            public ListOfXmlElement.XmlElement build() {
                if (_storedValue == null) {
                    return this.init(new ListOfXmlElement.XmlElement());
                } else {
                    return ((ListOfXmlElement.XmlElement) _storedValue);
                }
            }

            public ListOfXmlElement.XmlElement.Builder<_B> copyOf(final ListOfXmlElement.XmlElement _other) {
                _other.copyTo(this);
                return this;
            }

            public ListOfXmlElement.XmlElement.Builder<_B> copyOf(final ListOfXmlElement.XmlElement.Builder _other) {
                return copyOf(_other.build());
            }

        }

        public static class Select
            extends ListOfXmlElement.XmlElement.Selector<ListOfXmlElement.XmlElement.Select, Void>
        {


            Select() {
                super(null, null, null);
            }

            public static ListOfXmlElement.XmlElement.Select _root() {
                return new ListOfXmlElement.XmlElement.Select();
            }

        }

        public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
            extends com.kscs.util.jaxb.Selector<TRoot, TParent>
        {

            private com.kscs.util.jaxb.Selector<TRoot, ListOfXmlElement.XmlElement.Selector<TRoot, TParent>> any = null;

            public Selector(final TRoot root, final TParent parent, final String propertyName) {
                super(root, parent, propertyName);
            }

            @Override
            public Map<String, PropertyTree> buildChildren() {
                final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
                products.putAll(super.buildChildren());
                if (this.any!= null) {
                    products.put("any", this.any.init());
                }
                return products;
            }

            public com.kscs.util.jaxb.Selector<TRoot, ListOfXmlElement.XmlElement.Selector<TRoot, TParent>> any() {
                return ((this.any == null)?this.any = new com.kscs.util.jaxb.Selector<TRoot, ListOfXmlElement.XmlElement.Selector<TRoot, TParent>>(this._root, this, "any"):this.any);
            }

        }

    }

}
