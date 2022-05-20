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
 * <p>Java-Klasse für ListOfPublishedDataSetSourceDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPublishedDataSetSourceDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishedDataSetSourceDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PublishedDataSetSourceDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPublishedDataSetSourceDataType", propOrder = {
    "publishedDataSetSourceDataType"
})
public class ListOfPublishedDataSetSourceDataType {

    @XmlElement(name = "PublishedDataSetSourceDataType", nillable = true)
    protected List<PublishedDataSetSourceDataType> publishedDataSetSourceDataType;

    /**
     * Gets the value of the publishedDataSetSourceDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedDataSetSourceDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedDataSetSourceDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishedDataSetSourceDataType }
     * 
     * 
     */
    public List<PublishedDataSetSourceDataType> getPublishedDataSetSourceDataType() {
        if (publishedDataSetSourceDataType == null) {
            publishedDataSetSourceDataType = new ArrayList<PublishedDataSetSourceDataType>();
        }
        return this.publishedDataSetSourceDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPublishedDataSetSourceDataType.Builder<_B> _other) {
        if (this.publishedDataSetSourceDataType == null) {
            _other.publishedDataSetSourceDataType = null;
        } else {
            _other.publishedDataSetSourceDataType = new ArrayList<PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>>();
            for (PublishedDataSetSourceDataType _item: this.publishedDataSetSourceDataType) {
                _other.publishedDataSetSourceDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfPublishedDataSetSourceDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPublishedDataSetSourceDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPublishedDataSetSourceDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPublishedDataSetSourceDataType.Builder<Void> builder() {
        return new ListOfPublishedDataSetSourceDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPublishedDataSetSourceDataType.Builder<_B> copyOf(final ListOfPublishedDataSetSourceDataType _other) {
        final ListOfPublishedDataSetSourceDataType.Builder<_B> _newBuilder = new ListOfPublishedDataSetSourceDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPublishedDataSetSourceDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree publishedDataSetSourceDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedDataSetSourceDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataSetSourceDataTypePropertyTree!= null):((publishedDataSetSourceDataTypePropertyTree == null)||(!publishedDataSetSourceDataTypePropertyTree.isLeaf())))) {
            if (this.publishedDataSetSourceDataType == null) {
                _other.publishedDataSetSourceDataType = null;
            } else {
                _other.publishedDataSetSourceDataType = new ArrayList<PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>>();
                for (PublishedDataSetSourceDataType _item: this.publishedDataSetSourceDataType) {
                    _other.publishedDataSetSourceDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, publishedDataSetSourceDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfPublishedDataSetSourceDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPublishedDataSetSourceDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPublishedDataSetSourceDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPublishedDataSetSourceDataType.Builder<_B> copyOf(final ListOfPublishedDataSetSourceDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPublishedDataSetSourceDataType.Builder<_B> _newBuilder = new ListOfPublishedDataSetSourceDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPublishedDataSetSourceDataType.Builder<Void> copyExcept(final ListOfPublishedDataSetSourceDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPublishedDataSetSourceDataType.Builder<Void> copyOnly(final ListOfPublishedDataSetSourceDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPublishedDataSetSourceDataType _storedValue;
        private List<PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>> publishedDataSetSourceDataType;

        public Builder(final _B _parentBuilder, final ListOfPublishedDataSetSourceDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.publishedDataSetSourceDataType == null) {
                        this.publishedDataSetSourceDataType = null;
                    } else {
                        this.publishedDataSetSourceDataType = new ArrayList<PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>>();
                        for (PublishedDataSetSourceDataType _item: _other.publishedDataSetSourceDataType) {
                            this.publishedDataSetSourceDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPublishedDataSetSourceDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree publishedDataSetSourceDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedDataSetSourceDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedDataSetSourceDataTypePropertyTree!= null):((publishedDataSetSourceDataTypePropertyTree == null)||(!publishedDataSetSourceDataTypePropertyTree.isLeaf())))) {
                        if (_other.publishedDataSetSourceDataType == null) {
                            this.publishedDataSetSourceDataType = null;
                        } else {
                            this.publishedDataSetSourceDataType = new ArrayList<PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>>();
                            for (PublishedDataSetSourceDataType _item: _other.publishedDataSetSourceDataType) {
                                this.publishedDataSetSourceDataType.add(((_item == null)?null:_item.newCopyBuilder(this, publishedDataSetSourceDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfPublishedDataSetSourceDataType >_P init(final _P _product) {
            if (this.publishedDataSetSourceDataType!= null) {
                final List<PublishedDataSetSourceDataType> publishedDataSetSourceDataType = new ArrayList<PublishedDataSetSourceDataType>(this.publishedDataSetSourceDataType.size());
                for (PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>> _item: this.publishedDataSetSourceDataType) {
                    publishedDataSetSourceDataType.add(_item.build());
                }
                _product.publishedDataSetSourceDataType = publishedDataSetSourceDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedDataSetSourceDataType" hinzu.
         * 
         * @param publishedDataSetSourceDataType
         *     Werte, die zur Eigenschaft "publishedDataSetSourceDataType" hinzugefügt werden.
         */
        public ListOfPublishedDataSetSourceDataType.Builder<_B> addPublishedDataSetSourceDataType(final Iterable<? extends PublishedDataSetSourceDataType> publishedDataSetSourceDataType) {
            if (publishedDataSetSourceDataType!= null) {
                if (this.publishedDataSetSourceDataType == null) {
                    this.publishedDataSetSourceDataType = new ArrayList<PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>>();
                }
                for (PublishedDataSetSourceDataType _item: publishedDataSetSourceDataType) {
                    this.publishedDataSetSourceDataType.add(new PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedDataSetSourceDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedDataSetSourceDataType
         *     Neuer Wert der Eigenschaft "publishedDataSetSourceDataType".
         */
        public ListOfPublishedDataSetSourceDataType.Builder<_B> withPublishedDataSetSourceDataType(final Iterable<? extends PublishedDataSetSourceDataType> publishedDataSetSourceDataType) {
            if (this.publishedDataSetSourceDataType!= null) {
                this.publishedDataSetSourceDataType.clear();
            }
            return addPublishedDataSetSourceDataType(publishedDataSetSourceDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedDataSetSourceDataType" hinzu.
         * 
         * @param publishedDataSetSourceDataType
         *     Werte, die zur Eigenschaft "publishedDataSetSourceDataType" hinzugefügt werden.
         */
        public ListOfPublishedDataSetSourceDataType.Builder<_B> addPublishedDataSetSourceDataType(PublishedDataSetSourceDataType... publishedDataSetSourceDataType) {
            addPublishedDataSetSourceDataType(Arrays.asList(publishedDataSetSourceDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedDataSetSourceDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedDataSetSourceDataType
         *     Neuer Wert der Eigenschaft "publishedDataSetSourceDataType".
         */
        public ListOfPublishedDataSetSourceDataType.Builder<_B> withPublishedDataSetSourceDataType(PublishedDataSetSourceDataType... publishedDataSetSourceDataType) {
            withPublishedDataSetSourceDataType(Arrays.asList(publishedDataSetSourceDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "PublishedDataSetSourceDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.PublishedDataSetSourceDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "PublishedDataSetSourceDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.PublishedDataSetSourceDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public PublishedDataSetSourceDataType.Builder<? extends ListOfPublishedDataSetSourceDataType.Builder<_B>> addPublishedDataSetSourceDataType() {
            if (this.publishedDataSetSourceDataType == null) {
                this.publishedDataSetSourceDataType = new ArrayList<PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>>();
            }
            final PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>> publishedDataSetSourceDataType_Builder = new PublishedDataSetSourceDataType.Builder<ListOfPublishedDataSetSourceDataType.Builder<_B>>(this, null, false);
            this.publishedDataSetSourceDataType.add(publishedDataSetSourceDataType_Builder);
            return publishedDataSetSourceDataType_Builder;
        }

        @Override
        public ListOfPublishedDataSetSourceDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfPublishedDataSetSourceDataType());
            } else {
                return ((ListOfPublishedDataSetSourceDataType) _storedValue);
            }
        }

        public ListOfPublishedDataSetSourceDataType.Builder<_B> copyOf(final ListOfPublishedDataSetSourceDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPublishedDataSetSourceDataType.Builder<_B> copyOf(final ListOfPublishedDataSetSourceDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPublishedDataSetSourceDataType.Selector<ListOfPublishedDataSetSourceDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPublishedDataSetSourceDataType.Select _root() {
            return new ListOfPublishedDataSetSourceDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private PublishedDataSetSourceDataType.Selector<TRoot, ListOfPublishedDataSetSourceDataType.Selector<TRoot, TParent>> publishedDataSetSourceDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publishedDataSetSourceDataType!= null) {
                products.put("publishedDataSetSourceDataType", this.publishedDataSetSourceDataType.init());
            }
            return products;
        }

        public PublishedDataSetSourceDataType.Selector<TRoot, ListOfPublishedDataSetSourceDataType.Selector<TRoot, TParent>> publishedDataSetSourceDataType() {
            return ((this.publishedDataSetSourceDataType == null)?this.publishedDataSetSourceDataType = new PublishedDataSetSourceDataType.Selector<TRoot, ListOfPublishedDataSetSourceDataType.Selector<TRoot, TParent>>(this._root, this, "publishedDataSetSourceDataType"):this.publishedDataSetSourceDataType);
        }

    }

}
