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
 * <p>Java-Klasse für ListOfPublishedEventsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPublishedEventsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishedEventsDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PublishedEventsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPublishedEventsDataType", propOrder = {
    "publishedEventsDataType"
})
public class ListOfPublishedEventsDataType {

    @XmlElement(name = "PublishedEventsDataType", nillable = true)
    protected List<PublishedEventsDataType> publishedEventsDataType;

    /**
     * Gets the value of the publishedEventsDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedEventsDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedEventsDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishedEventsDataType }
     * 
     * 
     */
    public List<PublishedEventsDataType> getPublishedEventsDataType() {
        if (publishedEventsDataType == null) {
            publishedEventsDataType = new ArrayList<PublishedEventsDataType>();
        }
        return this.publishedEventsDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPublishedEventsDataType.Builder<_B> _other) {
        if (this.publishedEventsDataType == null) {
            _other.publishedEventsDataType = null;
        } else {
            _other.publishedEventsDataType = new ArrayList<PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>>();
            for (PublishedEventsDataType _item: this.publishedEventsDataType) {
                _other.publishedEventsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfPublishedEventsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPublishedEventsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPublishedEventsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPublishedEventsDataType.Builder<Void> builder() {
        return new ListOfPublishedEventsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPublishedEventsDataType.Builder<_B> copyOf(final ListOfPublishedEventsDataType _other) {
        final ListOfPublishedEventsDataType.Builder<_B> _newBuilder = new ListOfPublishedEventsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPublishedEventsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree publishedEventsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedEventsDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedEventsDataTypePropertyTree!= null):((publishedEventsDataTypePropertyTree == null)||(!publishedEventsDataTypePropertyTree.isLeaf())))) {
            if (this.publishedEventsDataType == null) {
                _other.publishedEventsDataType = null;
            } else {
                _other.publishedEventsDataType = new ArrayList<PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>>();
                for (PublishedEventsDataType _item: this.publishedEventsDataType) {
                    _other.publishedEventsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, publishedEventsDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfPublishedEventsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPublishedEventsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPublishedEventsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPublishedEventsDataType.Builder<_B> copyOf(final ListOfPublishedEventsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPublishedEventsDataType.Builder<_B> _newBuilder = new ListOfPublishedEventsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPublishedEventsDataType.Builder<Void> copyExcept(final ListOfPublishedEventsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPublishedEventsDataType.Builder<Void> copyOnly(final ListOfPublishedEventsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPublishedEventsDataType _storedValue;
        private List<PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>> publishedEventsDataType;

        public Builder(final _B _parentBuilder, final ListOfPublishedEventsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.publishedEventsDataType == null) {
                        this.publishedEventsDataType = null;
                    } else {
                        this.publishedEventsDataType = new ArrayList<PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>>();
                        for (PublishedEventsDataType _item: _other.publishedEventsDataType) {
                            this.publishedEventsDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPublishedEventsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree publishedEventsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedEventsDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedEventsDataTypePropertyTree!= null):((publishedEventsDataTypePropertyTree == null)||(!publishedEventsDataTypePropertyTree.isLeaf())))) {
                        if (_other.publishedEventsDataType == null) {
                            this.publishedEventsDataType = null;
                        } else {
                            this.publishedEventsDataType = new ArrayList<PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>>();
                            for (PublishedEventsDataType _item: _other.publishedEventsDataType) {
                                this.publishedEventsDataType.add(((_item == null)?null:_item.newCopyBuilder(this, publishedEventsDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfPublishedEventsDataType >_P init(final _P _product) {
            if (this.publishedEventsDataType!= null) {
                final List<PublishedEventsDataType> publishedEventsDataType = new ArrayList<PublishedEventsDataType>(this.publishedEventsDataType.size());
                for (PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>> _item: this.publishedEventsDataType) {
                    publishedEventsDataType.add(_item.build());
                }
                _product.publishedEventsDataType = publishedEventsDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedEventsDataType" hinzu.
         * 
         * @param publishedEventsDataType
         *     Werte, die zur Eigenschaft "publishedEventsDataType" hinzugefügt werden.
         */
        public ListOfPublishedEventsDataType.Builder<_B> addPublishedEventsDataType(final Iterable<? extends PublishedEventsDataType> publishedEventsDataType) {
            if (publishedEventsDataType!= null) {
                if (this.publishedEventsDataType == null) {
                    this.publishedEventsDataType = new ArrayList<PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>>();
                }
                for (PublishedEventsDataType _item: publishedEventsDataType) {
                    this.publishedEventsDataType.add(new PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedEventsDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedEventsDataType
         *     Neuer Wert der Eigenschaft "publishedEventsDataType".
         */
        public ListOfPublishedEventsDataType.Builder<_B> withPublishedEventsDataType(final Iterable<? extends PublishedEventsDataType> publishedEventsDataType) {
            if (this.publishedEventsDataType!= null) {
                this.publishedEventsDataType.clear();
            }
            return addPublishedEventsDataType(publishedEventsDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedEventsDataType" hinzu.
         * 
         * @param publishedEventsDataType
         *     Werte, die zur Eigenschaft "publishedEventsDataType" hinzugefügt werden.
         */
        public ListOfPublishedEventsDataType.Builder<_B> addPublishedEventsDataType(PublishedEventsDataType... publishedEventsDataType) {
            addPublishedEventsDataType(Arrays.asList(publishedEventsDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedEventsDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedEventsDataType
         *     Neuer Wert der Eigenschaft "publishedEventsDataType".
         */
        public ListOfPublishedEventsDataType.Builder<_B> withPublishedEventsDataType(PublishedEventsDataType... publishedEventsDataType) {
            withPublishedEventsDataType(Arrays.asList(publishedEventsDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "PublishedEventsDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.PublishedEventsDataType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "PublishedEventsDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.PublishedEventsDataType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public PublishedEventsDataType.Builder<? extends ListOfPublishedEventsDataType.Builder<_B>> addPublishedEventsDataType() {
            if (this.publishedEventsDataType == null) {
                this.publishedEventsDataType = new ArrayList<PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>>();
            }
            final PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>> publishedEventsDataType_Builder = new PublishedEventsDataType.Builder<ListOfPublishedEventsDataType.Builder<_B>>(this, null, false);
            this.publishedEventsDataType.add(publishedEventsDataType_Builder);
            return publishedEventsDataType_Builder;
        }

        @Override
        public ListOfPublishedEventsDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfPublishedEventsDataType());
            } else {
                return ((ListOfPublishedEventsDataType) _storedValue);
            }
        }

        public ListOfPublishedEventsDataType.Builder<_B> copyOf(final ListOfPublishedEventsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPublishedEventsDataType.Builder<_B> copyOf(final ListOfPublishedEventsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPublishedEventsDataType.Selector<ListOfPublishedEventsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPublishedEventsDataType.Select _root() {
            return new ListOfPublishedEventsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private PublishedEventsDataType.Selector<TRoot, ListOfPublishedEventsDataType.Selector<TRoot, TParent>> publishedEventsDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publishedEventsDataType!= null) {
                products.put("publishedEventsDataType", this.publishedEventsDataType.init());
            }
            return products;
        }

        public PublishedEventsDataType.Selector<TRoot, ListOfPublishedEventsDataType.Selector<TRoot, TParent>> publishedEventsDataType() {
            return ((this.publishedEventsDataType == null)?this.publishedEventsDataType = new PublishedEventsDataType.Selector<TRoot, ListOfPublishedEventsDataType.Selector<TRoot, TParent>>(this._root, this, "publishedEventsDataType"):this.publishedEventsDataType);
        }

    }

}
