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
 * <p>Java-Klasse für ListOfContentFilterElementResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfContentFilterElementResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentFilterElementResult" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ContentFilterElementResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContentFilterElementResult", propOrder = {
    "contentFilterElementResult"
})
public class ListOfContentFilterElementResult {

    @XmlElement(name = "ContentFilterElementResult", nillable = true)
    protected List<ContentFilterElementResult> contentFilterElementResult;

    /**
     * Gets the value of the contentFilterElementResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentFilterElementResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentFilterElementResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentFilterElementResult }
     * 
     * 
     */
    public List<ContentFilterElementResult> getContentFilterElementResult() {
        if (contentFilterElementResult == null) {
            contentFilterElementResult = new ArrayList<ContentFilterElementResult>();
        }
        return this.contentFilterElementResult;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfContentFilterElementResult.Builder<_B> _other) {
        if (this.contentFilterElementResult == null) {
            _other.contentFilterElementResult = null;
        } else {
            _other.contentFilterElementResult = new ArrayList<ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>>();
            for (ContentFilterElementResult _item: this.contentFilterElementResult) {
                _other.contentFilterElementResult.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfContentFilterElementResult.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfContentFilterElementResult.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfContentFilterElementResult.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfContentFilterElementResult.Builder<Void> builder() {
        return new ListOfContentFilterElementResult.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfContentFilterElementResult.Builder<_B> copyOf(final ListOfContentFilterElementResult _other) {
        final ListOfContentFilterElementResult.Builder<_B> _newBuilder = new ListOfContentFilterElementResult.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfContentFilterElementResult.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree contentFilterElementResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("contentFilterElementResult"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(contentFilterElementResultPropertyTree!= null):((contentFilterElementResultPropertyTree == null)||(!contentFilterElementResultPropertyTree.isLeaf())))) {
            if (this.contentFilterElementResult == null) {
                _other.contentFilterElementResult = null;
            } else {
                _other.contentFilterElementResult = new ArrayList<ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>>();
                for (ContentFilterElementResult _item: this.contentFilterElementResult) {
                    _other.contentFilterElementResult.add(((_item == null)?null:_item.newCopyBuilder(_other, contentFilterElementResultPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfContentFilterElementResult.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfContentFilterElementResult.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfContentFilterElementResult.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfContentFilterElementResult.Builder<_B> copyOf(final ListOfContentFilterElementResult _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfContentFilterElementResult.Builder<_B> _newBuilder = new ListOfContentFilterElementResult.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfContentFilterElementResult.Builder<Void> copyExcept(final ListOfContentFilterElementResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfContentFilterElementResult.Builder<Void> copyOnly(final ListOfContentFilterElementResult _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfContentFilterElementResult _storedValue;
        private List<ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>> contentFilterElementResult;

        public Builder(final _B _parentBuilder, final ListOfContentFilterElementResult _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.contentFilterElementResult == null) {
                        this.contentFilterElementResult = null;
                    } else {
                        this.contentFilterElementResult = new ArrayList<ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>>();
                        for (ContentFilterElementResult _item: _other.contentFilterElementResult) {
                            this.contentFilterElementResult.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfContentFilterElementResult _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree contentFilterElementResultPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("contentFilterElementResult"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(contentFilterElementResultPropertyTree!= null):((contentFilterElementResultPropertyTree == null)||(!contentFilterElementResultPropertyTree.isLeaf())))) {
                        if (_other.contentFilterElementResult == null) {
                            this.contentFilterElementResult = null;
                        } else {
                            this.contentFilterElementResult = new ArrayList<ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>>();
                            for (ContentFilterElementResult _item: _other.contentFilterElementResult) {
                                this.contentFilterElementResult.add(((_item == null)?null:_item.newCopyBuilder(this, contentFilterElementResultPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfContentFilterElementResult >_P init(final _P _product) {
            if (this.contentFilterElementResult!= null) {
                final List<ContentFilterElementResult> contentFilterElementResult = new ArrayList<ContentFilterElementResult>(this.contentFilterElementResult.size());
                for (ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>> _item: this.contentFilterElementResult) {
                    contentFilterElementResult.add(_item.build());
                }
                _product.contentFilterElementResult = contentFilterElementResult;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "contentFilterElementResult" hinzu.
         * 
         * @param contentFilterElementResult
         *     Werte, die zur Eigenschaft "contentFilterElementResult" hinzugefügt werden.
         */
        public ListOfContentFilterElementResult.Builder<_B> addContentFilterElementResult(final Iterable<? extends ContentFilterElementResult> contentFilterElementResult) {
            if (contentFilterElementResult!= null) {
                if (this.contentFilterElementResult == null) {
                    this.contentFilterElementResult = new ArrayList<ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>>();
                }
                for (ContentFilterElementResult _item: contentFilterElementResult) {
                    this.contentFilterElementResult.add(new ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "contentFilterElementResult" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param contentFilterElementResult
         *     Neuer Wert der Eigenschaft "contentFilterElementResult".
         */
        public ListOfContentFilterElementResult.Builder<_B> withContentFilterElementResult(final Iterable<? extends ContentFilterElementResult> contentFilterElementResult) {
            if (this.contentFilterElementResult!= null) {
                this.contentFilterElementResult.clear();
            }
            return addContentFilterElementResult(contentFilterElementResult);
        }

        /**
         * Fügt Werte zur Eigenschaft "contentFilterElementResult" hinzu.
         * 
         * @param contentFilterElementResult
         *     Werte, die zur Eigenschaft "contentFilterElementResult" hinzugefügt werden.
         */
        public ListOfContentFilterElementResult.Builder<_B> addContentFilterElementResult(ContentFilterElementResult... contentFilterElementResult) {
            addContentFilterElementResult(Arrays.asList(contentFilterElementResult));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "contentFilterElementResult" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param contentFilterElementResult
         *     Neuer Wert der Eigenschaft "contentFilterElementResult".
         */
        public ListOfContentFilterElementResult.Builder<_B> withContentFilterElementResult(ContentFilterElementResult... contentFilterElementResult) {
            withContentFilterElementResult(Arrays.asList(contentFilterElementResult));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ContentFilterElementResult".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ContentFilterElementResult.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ContentFilterElementResult".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ContentFilterElementResult.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ContentFilterElementResult.Builder<? extends ListOfContentFilterElementResult.Builder<_B>> addContentFilterElementResult() {
            if (this.contentFilterElementResult == null) {
                this.contentFilterElementResult = new ArrayList<ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>>();
            }
            final ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>> contentFilterElementResult_Builder = new ContentFilterElementResult.Builder<ListOfContentFilterElementResult.Builder<_B>>(this, null, false);
            this.contentFilterElementResult.add(contentFilterElementResult_Builder);
            return contentFilterElementResult_Builder;
        }

        @Override
        public ListOfContentFilterElementResult build() {
            if (_storedValue == null) {
                return this.init(new ListOfContentFilterElementResult());
            } else {
                return ((ListOfContentFilterElementResult) _storedValue);
            }
        }

        public ListOfContentFilterElementResult.Builder<_B> copyOf(final ListOfContentFilterElementResult _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfContentFilterElementResult.Builder<_B> copyOf(final ListOfContentFilterElementResult.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfContentFilterElementResult.Selector<ListOfContentFilterElementResult.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfContentFilterElementResult.Select _root() {
            return new ListOfContentFilterElementResult.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ContentFilterElementResult.Selector<TRoot, ListOfContentFilterElementResult.Selector<TRoot, TParent>> contentFilterElementResult = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.contentFilterElementResult!= null) {
                products.put("contentFilterElementResult", this.contentFilterElementResult.init());
            }
            return products;
        }

        public ContentFilterElementResult.Selector<TRoot, ListOfContentFilterElementResult.Selector<TRoot, TParent>> contentFilterElementResult() {
            return ((this.contentFilterElementResult == null)?this.contentFilterElementResult = new ContentFilterElementResult.Selector<TRoot, ListOfContentFilterElementResult.Selector<TRoot, TParent>>(this._root, this, "contentFilterElementResult"):this.contentFilterElementResult);
        }

    }

}
