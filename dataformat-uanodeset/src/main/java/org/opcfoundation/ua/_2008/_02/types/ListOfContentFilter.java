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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.Buildable;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;


/**
 * <p>Java-Klasse für ListOfContentFilter complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfContentFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentFilter" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ContentFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContentFilter", propOrder = {
    "contentFilter"
})
public class ListOfContentFilter {

    @XmlElement(name = "ContentFilter", nillable = true)
    protected List<ContentFilter> contentFilter;

    /**
     * Gets the value of the contentFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentFilter }
     * 
     * 
     */
    public List<ContentFilter> getContentFilter() {
        if (contentFilter == null) {
            contentFilter = new ArrayList<ContentFilter>();
        }
        return this.contentFilter;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfContentFilter.Builder<_B> _other) {
        if (this.contentFilter == null) {
            _other.contentFilter = null;
        } else {
            _other.contentFilter = new ArrayList<ContentFilter.Builder<ListOfContentFilter.Builder<_B>>>();
            for (ContentFilter _item: this.contentFilter) {
                _other.contentFilter.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfContentFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfContentFilter.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfContentFilter.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfContentFilter.Builder<Void> builder() {
        return new ListOfContentFilter.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfContentFilter.Builder<_B> copyOf(final ListOfContentFilter _other) {
        final ListOfContentFilter.Builder<_B> _newBuilder = new ListOfContentFilter.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfContentFilter.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree contentFilterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("contentFilter"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(contentFilterPropertyTree!= null):((contentFilterPropertyTree == null)||(!contentFilterPropertyTree.isLeaf())))) {
            if (this.contentFilter == null) {
                _other.contentFilter = null;
            } else {
                _other.contentFilter = new ArrayList<ContentFilter.Builder<ListOfContentFilter.Builder<_B>>>();
                for (ContentFilter _item: this.contentFilter) {
                    _other.contentFilter.add(((_item == null)?null:_item.newCopyBuilder(_other, contentFilterPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfContentFilter.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfContentFilter.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfContentFilter.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfContentFilter.Builder<_B> copyOf(final ListOfContentFilter _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfContentFilter.Builder<_B> _newBuilder = new ListOfContentFilter.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfContentFilter.Builder<Void> copyExcept(final ListOfContentFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfContentFilter.Builder<Void> copyOnly(final ListOfContentFilter _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfContentFilter _storedValue;
        private List<ContentFilter.Builder<ListOfContentFilter.Builder<_B>>> contentFilter;

        public Builder(final _B _parentBuilder, final ListOfContentFilter _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.contentFilter == null) {
                        this.contentFilter = null;
                    } else {
                        this.contentFilter = new ArrayList<ContentFilter.Builder<ListOfContentFilter.Builder<_B>>>();
                        for (ContentFilter _item: _other.contentFilter) {
                            this.contentFilter.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfContentFilter _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree contentFilterPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("contentFilter"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(contentFilterPropertyTree!= null):((contentFilterPropertyTree == null)||(!contentFilterPropertyTree.isLeaf())))) {
                        if (_other.contentFilter == null) {
                            this.contentFilter = null;
                        } else {
                            this.contentFilter = new ArrayList<ContentFilter.Builder<ListOfContentFilter.Builder<_B>>>();
                            for (ContentFilter _item: _other.contentFilter) {
                                this.contentFilter.add(((_item == null)?null:_item.newCopyBuilder(this, contentFilterPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfContentFilter >_P init(final _P _product) {
            if (this.contentFilter!= null) {
                final List<ContentFilter> contentFilter = new ArrayList<ContentFilter>(this.contentFilter.size());
                for (ContentFilter.Builder<ListOfContentFilter.Builder<_B>> _item: this.contentFilter) {
                    contentFilter.add(_item.build());
                }
                _product.contentFilter = contentFilter;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "contentFilter" hinzu.
         * 
         * @param contentFilter
         *     Werte, die zur Eigenschaft "contentFilter" hinzugefügt werden.
         */
        public ListOfContentFilter.Builder<_B> addContentFilter(final Iterable<? extends ContentFilter> contentFilter) {
            if (contentFilter!= null) {
                if (this.contentFilter == null) {
                    this.contentFilter = new ArrayList<ContentFilter.Builder<ListOfContentFilter.Builder<_B>>>();
                }
                for (ContentFilter _item: contentFilter) {
                    this.contentFilter.add(new ContentFilter.Builder<ListOfContentFilter.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "contentFilter" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param contentFilter
         *     Neuer Wert der Eigenschaft "contentFilter".
         */
        public ListOfContentFilter.Builder<_B> withContentFilter(final Iterable<? extends ContentFilter> contentFilter) {
            if (this.contentFilter!= null) {
                this.contentFilter.clear();
            }
            return addContentFilter(contentFilter);
        }

        /**
         * Fügt Werte zur Eigenschaft "contentFilter" hinzu.
         * 
         * @param contentFilter
         *     Werte, die zur Eigenschaft "contentFilter" hinzugefügt werden.
         */
        public ListOfContentFilter.Builder<_B> addContentFilter(ContentFilter... contentFilter) {
            addContentFilter(Arrays.asList(contentFilter));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "contentFilter" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param contentFilter
         *     Neuer Wert der Eigenschaft "contentFilter".
         */
        public ListOfContentFilter.Builder<_B> withContentFilter(ContentFilter... contentFilter) {
            withContentFilter(Arrays.asList(contentFilter));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ContentFilter".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ContentFilter.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ContentFilter".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ContentFilter.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ContentFilter.Builder<? extends ListOfContentFilter.Builder<_B>> addContentFilter() {
            if (this.contentFilter == null) {
                this.contentFilter = new ArrayList<ContentFilter.Builder<ListOfContentFilter.Builder<_B>>>();
            }
            final ContentFilter.Builder<ListOfContentFilter.Builder<_B>> contentFilter_Builder = new ContentFilter.Builder<ListOfContentFilter.Builder<_B>>(this, null, false);
            this.contentFilter.add(contentFilter_Builder);
            return contentFilter_Builder;
        }

        @Override
        public ListOfContentFilter build() {
            if (_storedValue == null) {
                return this.init(new ListOfContentFilter());
            } else {
                return ((ListOfContentFilter) _storedValue);
            }
        }

        public ListOfContentFilter.Builder<_B> copyOf(final ListOfContentFilter _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfContentFilter.Builder<_B> copyOf(final ListOfContentFilter.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfContentFilter.Selector<ListOfContentFilter.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfContentFilter.Select _root() {
            return new ListOfContentFilter.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ContentFilter.Selector<TRoot, ListOfContentFilter.Selector<TRoot, TParent>> contentFilter = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.contentFilter!= null) {
                products.put("contentFilter", this.contentFilter.init());
            }
            return products;
        }

        public ContentFilter.Selector<TRoot, ListOfContentFilter.Selector<TRoot, TParent>> contentFilter() {
            return ((this.contentFilter == null)?this.contentFilter = new ContentFilter.Selector<TRoot, ListOfContentFilter.Selector<TRoot, TParent>>(this._root, this, "contentFilter"):this.contentFilter);
        }

    }

}
