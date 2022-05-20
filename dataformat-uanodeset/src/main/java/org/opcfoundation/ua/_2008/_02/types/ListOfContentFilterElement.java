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
 * <p>Java-Klasse für ListOfContentFilterElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfContentFilterElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentFilterElement" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ContentFilterElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContentFilterElement", propOrder = {
    "contentFilterElement"
})
public class ListOfContentFilterElement {

    @XmlElement(name = "ContentFilterElement", nillable = true)
    protected List<ContentFilterElement> contentFilterElement;

    /**
     * Gets the value of the contentFilterElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentFilterElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentFilterElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentFilterElement }
     * 
     * 
     */
    public List<ContentFilterElement> getContentFilterElement() {
        if (contentFilterElement == null) {
            contentFilterElement = new ArrayList<ContentFilterElement>();
        }
        return this.contentFilterElement;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfContentFilterElement.Builder<_B> _other) {
        if (this.contentFilterElement == null) {
            _other.contentFilterElement = null;
        } else {
            _other.contentFilterElement = new ArrayList<ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>>();
            for (ContentFilterElement _item: this.contentFilterElement) {
                _other.contentFilterElement.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfContentFilterElement.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfContentFilterElement.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfContentFilterElement.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfContentFilterElement.Builder<Void> builder() {
        return new ListOfContentFilterElement.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfContentFilterElement.Builder<_B> copyOf(final ListOfContentFilterElement _other) {
        final ListOfContentFilterElement.Builder<_B> _newBuilder = new ListOfContentFilterElement.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfContentFilterElement.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree contentFilterElementPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("contentFilterElement"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(contentFilterElementPropertyTree!= null):((contentFilterElementPropertyTree == null)||(!contentFilterElementPropertyTree.isLeaf())))) {
            if (this.contentFilterElement == null) {
                _other.contentFilterElement = null;
            } else {
                _other.contentFilterElement = new ArrayList<ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>>();
                for (ContentFilterElement _item: this.contentFilterElement) {
                    _other.contentFilterElement.add(((_item == null)?null:_item.newCopyBuilder(_other, contentFilterElementPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfContentFilterElement.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfContentFilterElement.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfContentFilterElement.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfContentFilterElement.Builder<_B> copyOf(final ListOfContentFilterElement _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfContentFilterElement.Builder<_B> _newBuilder = new ListOfContentFilterElement.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfContentFilterElement.Builder<Void> copyExcept(final ListOfContentFilterElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfContentFilterElement.Builder<Void> copyOnly(final ListOfContentFilterElement _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfContentFilterElement _storedValue;
        private List<ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>> contentFilterElement;

        public Builder(final _B _parentBuilder, final ListOfContentFilterElement _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.contentFilterElement == null) {
                        this.contentFilterElement = null;
                    } else {
                        this.contentFilterElement = new ArrayList<ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>>();
                        for (ContentFilterElement _item: _other.contentFilterElement) {
                            this.contentFilterElement.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfContentFilterElement _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree contentFilterElementPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("contentFilterElement"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(contentFilterElementPropertyTree!= null):((contentFilterElementPropertyTree == null)||(!contentFilterElementPropertyTree.isLeaf())))) {
                        if (_other.contentFilterElement == null) {
                            this.contentFilterElement = null;
                        } else {
                            this.contentFilterElement = new ArrayList<ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>>();
                            for (ContentFilterElement _item: _other.contentFilterElement) {
                                this.contentFilterElement.add(((_item == null)?null:_item.newCopyBuilder(this, contentFilterElementPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfContentFilterElement >_P init(final _P _product) {
            if (this.contentFilterElement!= null) {
                final List<ContentFilterElement> contentFilterElement = new ArrayList<ContentFilterElement>(this.contentFilterElement.size());
                for (ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>> _item: this.contentFilterElement) {
                    contentFilterElement.add(_item.build());
                }
                _product.contentFilterElement = contentFilterElement;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "contentFilterElement" hinzu.
         * 
         * @param contentFilterElement
         *     Werte, die zur Eigenschaft "contentFilterElement" hinzugefügt werden.
         */
        public ListOfContentFilterElement.Builder<_B> addContentFilterElement(final Iterable<? extends ContentFilterElement> contentFilterElement) {
            if (contentFilterElement!= null) {
                if (this.contentFilterElement == null) {
                    this.contentFilterElement = new ArrayList<ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>>();
                }
                for (ContentFilterElement _item: contentFilterElement) {
                    this.contentFilterElement.add(new ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "contentFilterElement" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param contentFilterElement
         *     Neuer Wert der Eigenschaft "contentFilterElement".
         */
        public ListOfContentFilterElement.Builder<_B> withContentFilterElement(final Iterable<? extends ContentFilterElement> contentFilterElement) {
            if (this.contentFilterElement!= null) {
                this.contentFilterElement.clear();
            }
            return addContentFilterElement(contentFilterElement);
        }

        /**
         * Fügt Werte zur Eigenschaft "contentFilterElement" hinzu.
         * 
         * @param contentFilterElement
         *     Werte, die zur Eigenschaft "contentFilterElement" hinzugefügt werden.
         */
        public ListOfContentFilterElement.Builder<_B> addContentFilterElement(ContentFilterElement... contentFilterElement) {
            addContentFilterElement(Arrays.asList(contentFilterElement));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "contentFilterElement" (Vorher zugewiesener
         * Wert wird ersetzt)
         * 
         * @param contentFilterElement
         *     Neuer Wert der Eigenschaft "contentFilterElement".
         */
        public ListOfContentFilterElement.Builder<_B> withContentFilterElement(ContentFilterElement... contentFilterElement) {
            withContentFilterElement(Arrays.asList(contentFilterElement));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ContentFilterElement".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ContentFilterElement.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ContentFilterElement".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ContentFilterElement.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public ContentFilterElement.Builder<? extends ListOfContentFilterElement.Builder<_B>> addContentFilterElement() {
            if (this.contentFilterElement == null) {
                this.contentFilterElement = new ArrayList<ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>>();
            }
            final ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>> contentFilterElement_Builder = new ContentFilterElement.Builder<ListOfContentFilterElement.Builder<_B>>(this, null, false);
            this.contentFilterElement.add(contentFilterElement_Builder);
            return contentFilterElement_Builder;
        }

        @Override
        public ListOfContentFilterElement build() {
            if (_storedValue == null) {
                return this.init(new ListOfContentFilterElement());
            } else {
                return ((ListOfContentFilterElement) _storedValue);
            }
        }

        public ListOfContentFilterElement.Builder<_B> copyOf(final ListOfContentFilterElement _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfContentFilterElement.Builder<_B> copyOf(final ListOfContentFilterElement.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfContentFilterElement.Selector<ListOfContentFilterElement.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfContentFilterElement.Select _root() {
            return new ListOfContentFilterElement.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ContentFilterElement.Selector<TRoot, ListOfContentFilterElement.Selector<TRoot, TParent>> contentFilterElement = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.contentFilterElement!= null) {
                products.put("contentFilterElement", this.contentFilterElement.init());
            }
            return products;
        }

        public ContentFilterElement.Selector<TRoot, ListOfContentFilterElement.Selector<TRoot, TParent>> contentFilterElement() {
            return ((this.contentFilterElement == null)?this.contentFilterElement = new ContentFilterElement.Selector<TRoot, ListOfContentFilterElement.Selector<TRoot, TParent>>(this._root, this, "contentFilterElement"):this.contentFilterElement);
        }

    }

}
