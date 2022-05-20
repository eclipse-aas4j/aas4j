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
 * <p>Java-Klasse für ListOfPublishedDataSetDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPublishedDataSetDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishedDataSetDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PublishedDataSetDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPublishedDataSetDataType", propOrder = {
    "publishedDataSetDataType"
})
public class ListOfPublishedDataSetDataType {

    @XmlElement(name = "PublishedDataSetDataType", nillable = true)
    protected List<PublishedDataSetDataType> publishedDataSetDataType;

    /**
     * Gets the value of the publishedDataSetDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedDataSetDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedDataSetDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishedDataSetDataType }
     * 
     * 
     */
    public List<PublishedDataSetDataType> getPublishedDataSetDataType() {
        if (publishedDataSetDataType == null) {
            publishedDataSetDataType = new ArrayList<PublishedDataSetDataType>();
        }
        return this.publishedDataSetDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPublishedDataSetDataType.Builder<_B> _other) {
        if (this.publishedDataSetDataType == null) {
            _other.publishedDataSetDataType = null;
        } else {
            _other.publishedDataSetDataType = new ArrayList<PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>>();
            for (PublishedDataSetDataType _item: this.publishedDataSetDataType) {
                _other.publishedDataSetDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfPublishedDataSetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPublishedDataSetDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPublishedDataSetDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPublishedDataSetDataType.Builder<Void> builder() {
        return new ListOfPublishedDataSetDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPublishedDataSetDataType.Builder<_B> copyOf(final ListOfPublishedDataSetDataType _other) {
        final ListOfPublishedDataSetDataType.Builder<_B> _newBuilder = new ListOfPublishedDataSetDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPublishedDataSetDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree publishedDataSetDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedDataSetDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataSetDataTypePropertyTree!= null):((publishedDataSetDataTypePropertyTree == null)||(!publishedDataSetDataTypePropertyTree.isLeaf())))) {
            if (this.publishedDataSetDataType == null) {
                _other.publishedDataSetDataType = null;
            } else {
                _other.publishedDataSetDataType = new ArrayList<PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>>();
                for (PublishedDataSetDataType _item: this.publishedDataSetDataType) {
                    _other.publishedDataSetDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, publishedDataSetDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfPublishedDataSetDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPublishedDataSetDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPublishedDataSetDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPublishedDataSetDataType.Builder<_B> copyOf(final ListOfPublishedDataSetDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPublishedDataSetDataType.Builder<_B> _newBuilder = new ListOfPublishedDataSetDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPublishedDataSetDataType.Builder<Void> copyExcept(final ListOfPublishedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPublishedDataSetDataType.Builder<Void> copyOnly(final ListOfPublishedDataSetDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPublishedDataSetDataType _storedValue;
        private List<PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>> publishedDataSetDataType;

        public Builder(final _B _parentBuilder, final ListOfPublishedDataSetDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.publishedDataSetDataType == null) {
                        this.publishedDataSetDataType = null;
                    } else {
                        this.publishedDataSetDataType = new ArrayList<PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>>();
                        for (PublishedDataSetDataType _item: _other.publishedDataSetDataType) {
                            this.publishedDataSetDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPublishedDataSetDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree publishedDataSetDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedDataSetDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataSetDataTypePropertyTree!= null):((publishedDataSetDataTypePropertyTree == null)||(!publishedDataSetDataTypePropertyTree.isLeaf())))) {
                        if (_other.publishedDataSetDataType == null) {
                            this.publishedDataSetDataType = null;
                        } else {
                            this.publishedDataSetDataType = new ArrayList<PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>>();
                            for (PublishedDataSetDataType _item: _other.publishedDataSetDataType) {
                                this.publishedDataSetDataType.add(((_item == null)?null:_item.newCopyBuilder(this, publishedDataSetDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfPublishedDataSetDataType >_P init(final _P _product) {
            if (this.publishedDataSetDataType!= null) {
                final List<PublishedDataSetDataType> publishedDataSetDataType = new ArrayList<PublishedDataSetDataType>(this.publishedDataSetDataType.size());
                for (PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>> _item: this.publishedDataSetDataType) {
                    publishedDataSetDataType.add(_item.build());
                }
                _product.publishedDataSetDataType = publishedDataSetDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedDataSetDataType" hinzu.
         * 
         * @param publishedDataSetDataType
         *     Werte, die zur Eigenschaft "publishedDataSetDataType" hinzugefügt werden.
         */
        public ListOfPublishedDataSetDataType.Builder<_B> addPublishedDataSetDataType(final Iterable<? extends PublishedDataSetDataType> publishedDataSetDataType) {
            if (publishedDataSetDataType!= null) {
                if (this.publishedDataSetDataType == null) {
                    this.publishedDataSetDataType = new ArrayList<PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>>();
                }
                for (PublishedDataSetDataType _item: publishedDataSetDataType) {
                    this.publishedDataSetDataType.add(new PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedDataSetDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedDataSetDataType
         *     Neuer Wert der Eigenschaft "publishedDataSetDataType".
         */
        public ListOfPublishedDataSetDataType.Builder<_B> withPublishedDataSetDataType(final Iterable<? extends PublishedDataSetDataType> publishedDataSetDataType) {
            if (this.publishedDataSetDataType!= null) {
                this.publishedDataSetDataType.clear();
            }
            return addPublishedDataSetDataType(publishedDataSetDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedDataSetDataType" hinzu.
         * 
         * @param publishedDataSetDataType
         *     Werte, die zur Eigenschaft "publishedDataSetDataType" hinzugefügt werden.
         */
        public ListOfPublishedDataSetDataType.Builder<_B> addPublishedDataSetDataType(PublishedDataSetDataType... publishedDataSetDataType) {
            addPublishedDataSetDataType(Arrays.asList(publishedDataSetDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedDataSetDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedDataSetDataType
         *     Neuer Wert der Eigenschaft "publishedDataSetDataType".
         */
        public ListOfPublishedDataSetDataType.Builder<_B> withPublishedDataSetDataType(PublishedDataSetDataType... publishedDataSetDataType) {
            withPublishedDataSetDataType(Arrays.asList(publishedDataSetDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "PublishedDataSetDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "PublishedDataSetDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.PublishedDataSetDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public PublishedDataSetDataType.Builder<? extends ListOfPublishedDataSetDataType.Builder<_B>> addPublishedDataSetDataType() {
            if (this.publishedDataSetDataType == null) {
                this.publishedDataSetDataType = new ArrayList<PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>>();
            }
            final PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>> publishedDataSetDataType_Builder = new PublishedDataSetDataType.Builder<ListOfPublishedDataSetDataType.Builder<_B>>(this, null, false);
            this.publishedDataSetDataType.add(publishedDataSetDataType_Builder);
            return publishedDataSetDataType_Builder;
        }

        @Override
        public ListOfPublishedDataSetDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfPublishedDataSetDataType());
            } else {
                return ((ListOfPublishedDataSetDataType) _storedValue);
            }
        }

        public ListOfPublishedDataSetDataType.Builder<_B> copyOf(final ListOfPublishedDataSetDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPublishedDataSetDataType.Builder<_B> copyOf(final ListOfPublishedDataSetDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPublishedDataSetDataType.Selector<ListOfPublishedDataSetDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPublishedDataSetDataType.Select _root() {
            return new ListOfPublishedDataSetDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private PublishedDataSetDataType.Selector<TRoot, ListOfPublishedDataSetDataType.Selector<TRoot, TParent>> publishedDataSetDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publishedDataSetDataType!= null) {
                products.put("publishedDataSetDataType", this.publishedDataSetDataType.init());
            }
            return products;
        }

        public PublishedDataSetDataType.Selector<TRoot, ListOfPublishedDataSetDataType.Selector<TRoot, TParent>> publishedDataSetDataType() {
            return ((this.publishedDataSetDataType == null)?this.publishedDataSetDataType = new PublishedDataSetDataType.Selector<TRoot, ListOfPublishedDataSetDataType.Selector<TRoot, TParent>>(this._root, this, "publishedDataSetDataType"):this.publishedDataSetDataType);
        }

    }

}
