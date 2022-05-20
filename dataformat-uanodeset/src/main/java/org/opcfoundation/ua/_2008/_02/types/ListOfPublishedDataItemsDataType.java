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
 * <p>Java-Klasse für ListOfPublishedDataItemsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPublishedDataItemsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishedDataItemsDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PublishedDataItemsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPublishedDataItemsDataType", propOrder = {
    "publishedDataItemsDataType"
})
public class ListOfPublishedDataItemsDataType {

    @XmlElement(name = "PublishedDataItemsDataType", nillable = true)
    protected List<PublishedDataItemsDataType> publishedDataItemsDataType;

    /**
     * Gets the value of the publishedDataItemsDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedDataItemsDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedDataItemsDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishedDataItemsDataType }
     * 
     * 
     */
    public List<PublishedDataItemsDataType> getPublishedDataItemsDataType() {
        if (publishedDataItemsDataType == null) {
            publishedDataItemsDataType = new ArrayList<PublishedDataItemsDataType>();
        }
        return this.publishedDataItemsDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPublishedDataItemsDataType.Builder<_B> _other) {
        if (this.publishedDataItemsDataType == null) {
            _other.publishedDataItemsDataType = null;
        } else {
            _other.publishedDataItemsDataType = new ArrayList<PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>>();
            for (PublishedDataItemsDataType _item: this.publishedDataItemsDataType) {
                _other.publishedDataItemsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfPublishedDataItemsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPublishedDataItemsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPublishedDataItemsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPublishedDataItemsDataType.Builder<Void> builder() {
        return new ListOfPublishedDataItemsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPublishedDataItemsDataType.Builder<_B> copyOf(final ListOfPublishedDataItemsDataType _other) {
        final ListOfPublishedDataItemsDataType.Builder<_B> _newBuilder = new ListOfPublishedDataItemsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPublishedDataItemsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree publishedDataItemsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedDataItemsDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataItemsDataTypePropertyTree!= null):((publishedDataItemsDataTypePropertyTree == null)||(!publishedDataItemsDataTypePropertyTree.isLeaf())))) {
            if (this.publishedDataItemsDataType == null) {
                _other.publishedDataItemsDataType = null;
            } else {
                _other.publishedDataItemsDataType = new ArrayList<PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>>();
                for (PublishedDataItemsDataType _item: this.publishedDataItemsDataType) {
                    _other.publishedDataItemsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, publishedDataItemsDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfPublishedDataItemsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPublishedDataItemsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPublishedDataItemsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPublishedDataItemsDataType.Builder<_B> copyOf(final ListOfPublishedDataItemsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPublishedDataItemsDataType.Builder<_B> _newBuilder = new ListOfPublishedDataItemsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPublishedDataItemsDataType.Builder<Void> copyExcept(final ListOfPublishedDataItemsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPublishedDataItemsDataType.Builder<Void> copyOnly(final ListOfPublishedDataItemsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPublishedDataItemsDataType _storedValue;
        private List<PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>> publishedDataItemsDataType;

        public Builder(final _B _parentBuilder, final ListOfPublishedDataItemsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.publishedDataItemsDataType == null) {
                        this.publishedDataItemsDataType = null;
                    } else {
                        this.publishedDataItemsDataType = new ArrayList<PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>>();
                        for (PublishedDataItemsDataType _item: _other.publishedDataItemsDataType) {
                            this.publishedDataItemsDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPublishedDataItemsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree publishedDataItemsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedDataItemsDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataItemsDataTypePropertyTree!= null):((publishedDataItemsDataTypePropertyTree == null)||(!publishedDataItemsDataTypePropertyTree.isLeaf())))) {
                        if (_other.publishedDataItemsDataType == null) {
                            this.publishedDataItemsDataType = null;
                        } else {
                            this.publishedDataItemsDataType = new ArrayList<PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>>();
                            for (PublishedDataItemsDataType _item: _other.publishedDataItemsDataType) {
                                this.publishedDataItemsDataType.add(((_item == null)?null:_item.newCopyBuilder(this, publishedDataItemsDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfPublishedDataItemsDataType >_P init(final _P _product) {
            if (this.publishedDataItemsDataType!= null) {
                final List<PublishedDataItemsDataType> publishedDataItemsDataType = new ArrayList<PublishedDataItemsDataType>(this.publishedDataItemsDataType.size());
                for (PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>> _item: this.publishedDataItemsDataType) {
                    publishedDataItemsDataType.add(_item.build());
                }
                _product.publishedDataItemsDataType = publishedDataItemsDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedDataItemsDataType" hinzu.
         * 
         * @param publishedDataItemsDataType
         *     Werte, die zur Eigenschaft "publishedDataItemsDataType" hinzugefügt werden.
         */
        public ListOfPublishedDataItemsDataType.Builder<_B> addPublishedDataItemsDataType(final Iterable<? extends PublishedDataItemsDataType> publishedDataItemsDataType) {
            if (publishedDataItemsDataType!= null) {
                if (this.publishedDataItemsDataType == null) {
                    this.publishedDataItemsDataType = new ArrayList<PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>>();
                }
                for (PublishedDataItemsDataType _item: publishedDataItemsDataType) {
                    this.publishedDataItemsDataType.add(new PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedDataItemsDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedDataItemsDataType
         *     Neuer Wert der Eigenschaft "publishedDataItemsDataType".
         */
        public ListOfPublishedDataItemsDataType.Builder<_B> withPublishedDataItemsDataType(final Iterable<? extends PublishedDataItemsDataType> publishedDataItemsDataType) {
            if (this.publishedDataItemsDataType!= null) {
                this.publishedDataItemsDataType.clear();
            }
            return addPublishedDataItemsDataType(publishedDataItemsDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedDataItemsDataType" hinzu.
         * 
         * @param publishedDataItemsDataType
         *     Werte, die zur Eigenschaft "publishedDataItemsDataType" hinzugefügt werden.
         */
        public ListOfPublishedDataItemsDataType.Builder<_B> addPublishedDataItemsDataType(PublishedDataItemsDataType... publishedDataItemsDataType) {
            addPublishedDataItemsDataType(Arrays.asList(publishedDataItemsDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedDataItemsDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedDataItemsDataType
         *     Neuer Wert der Eigenschaft "publishedDataItemsDataType".
         */
        public ListOfPublishedDataItemsDataType.Builder<_B> withPublishedDataItemsDataType(PublishedDataItemsDataType... publishedDataItemsDataType) {
            withPublishedDataItemsDataType(Arrays.asList(publishedDataItemsDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "PublishedDataItemsDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "PublishedDataItemsDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.PublishedDataItemsDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public PublishedDataItemsDataType.Builder<? extends ListOfPublishedDataItemsDataType.Builder<_B>> addPublishedDataItemsDataType() {
            if (this.publishedDataItemsDataType == null) {
                this.publishedDataItemsDataType = new ArrayList<PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>>();
            }
            final PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>> publishedDataItemsDataType_Builder = new PublishedDataItemsDataType.Builder<ListOfPublishedDataItemsDataType.Builder<_B>>(this, null, false);
            this.publishedDataItemsDataType.add(publishedDataItemsDataType_Builder);
            return publishedDataItemsDataType_Builder;
        }

        @Override
        public ListOfPublishedDataItemsDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfPublishedDataItemsDataType());
            } else {
                return ((ListOfPublishedDataItemsDataType) _storedValue);
            }
        }

        public ListOfPublishedDataItemsDataType.Builder<_B> copyOf(final ListOfPublishedDataItemsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPublishedDataItemsDataType.Builder<_B> copyOf(final ListOfPublishedDataItemsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPublishedDataItemsDataType.Selector<ListOfPublishedDataItemsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPublishedDataItemsDataType.Select _root() {
            return new ListOfPublishedDataItemsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private PublishedDataItemsDataType.Selector<TRoot, ListOfPublishedDataItemsDataType.Selector<TRoot, TParent>> publishedDataItemsDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publishedDataItemsDataType!= null) {
                products.put("publishedDataItemsDataType", this.publishedDataItemsDataType.init());
            }
            return products;
        }

        public PublishedDataItemsDataType.Selector<TRoot, ListOfPublishedDataItemsDataType.Selector<TRoot, TParent>> publishedDataItemsDataType() {
            return ((this.publishedDataItemsDataType == null)?this.publishedDataItemsDataType = new PublishedDataItemsDataType.Selector<TRoot, ListOfPublishedDataItemsDataType.Selector<TRoot, TParent>>(this._root, this, "publishedDataItemsDataType"):this.publishedDataItemsDataType);
        }

    }

}
