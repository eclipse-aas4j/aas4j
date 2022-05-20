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
 * <p>Java-Klasse für ListOfPublishedVariableDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfPublishedVariableDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishedVariableDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}PublishedVariableDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPublishedVariableDataType", propOrder = {
    "publishedVariableDataType"
})
public class ListOfPublishedVariableDataType {

    @XmlElement(name = "PublishedVariableDataType", nillable = true)
    protected List<PublishedVariableDataType> publishedVariableDataType;

    /**
     * Gets the value of the publishedVariableDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedVariableDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedVariableDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishedVariableDataType }
     * 
     * 
     */
    public List<PublishedVariableDataType> getPublishedVariableDataType() {
        if (publishedVariableDataType == null) {
            publishedVariableDataType = new ArrayList<PublishedVariableDataType>();
        }
        return this.publishedVariableDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfPublishedVariableDataType.Builder<_B> _other) {
        if (this.publishedVariableDataType == null) {
            _other.publishedVariableDataType = null;
        } else {
            _other.publishedVariableDataType = new ArrayList<PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>>();
            for (PublishedVariableDataType _item: this.publishedVariableDataType) {
                _other.publishedVariableDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfPublishedVariableDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfPublishedVariableDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfPublishedVariableDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfPublishedVariableDataType.Builder<Void> builder() {
        return new ListOfPublishedVariableDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfPublishedVariableDataType.Builder<_B> copyOf(final ListOfPublishedVariableDataType _other) {
        final ListOfPublishedVariableDataType.Builder<_B> _newBuilder = new ListOfPublishedVariableDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfPublishedVariableDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree publishedVariableDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedVariableDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedVariableDataTypePropertyTree!= null):((publishedVariableDataTypePropertyTree == null)||(!publishedVariableDataTypePropertyTree.isLeaf())))) {
            if (this.publishedVariableDataType == null) {
                _other.publishedVariableDataType = null;
            } else {
                _other.publishedVariableDataType = new ArrayList<PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>>();
                for (PublishedVariableDataType _item: this.publishedVariableDataType) {
                    _other.publishedVariableDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, publishedVariableDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfPublishedVariableDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfPublishedVariableDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfPublishedVariableDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfPublishedVariableDataType.Builder<_B> copyOf(final ListOfPublishedVariableDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfPublishedVariableDataType.Builder<_B> _newBuilder = new ListOfPublishedVariableDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfPublishedVariableDataType.Builder<Void> copyExcept(final ListOfPublishedVariableDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfPublishedVariableDataType.Builder<Void> copyOnly(final ListOfPublishedVariableDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfPublishedVariableDataType _storedValue;
        private List<PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>> publishedVariableDataType;

        public Builder(final _B _parentBuilder, final ListOfPublishedVariableDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.publishedVariableDataType == null) {
                        this.publishedVariableDataType = null;
                    } else {
                        this.publishedVariableDataType = new ArrayList<PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>>();
                        for (PublishedVariableDataType _item: _other.publishedVariableDataType) {
                            this.publishedVariableDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfPublishedVariableDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree publishedVariableDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("publishedVariableDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(publishedVariableDataTypePropertyTree!= null):((publishedVariableDataTypePropertyTree == null)||(!publishedVariableDataTypePropertyTree.isLeaf())))) {
                        if (_other.publishedVariableDataType == null) {
                            this.publishedVariableDataType = null;
                        } else {
                            this.publishedVariableDataType = new ArrayList<PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>>();
                            for (PublishedVariableDataType _item: _other.publishedVariableDataType) {
                                this.publishedVariableDataType.add(((_item == null)?null:_item.newCopyBuilder(this, publishedVariableDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfPublishedVariableDataType >_P init(final _P _product) {
            if (this.publishedVariableDataType!= null) {
                final List<PublishedVariableDataType> publishedVariableDataType = new ArrayList<PublishedVariableDataType>(this.publishedVariableDataType.size());
                for (PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>> _item: this.publishedVariableDataType) {
                    publishedVariableDataType.add(_item.build());
                }
                _product.publishedVariableDataType = publishedVariableDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedVariableDataType" hinzu.
         * 
         * @param publishedVariableDataType
         *     Werte, die zur Eigenschaft "publishedVariableDataType" hinzugefügt werden.
         */
        public ListOfPublishedVariableDataType.Builder<_B> addPublishedVariableDataType(final Iterable<? extends PublishedVariableDataType> publishedVariableDataType) {
            if (publishedVariableDataType!= null) {
                if (this.publishedVariableDataType == null) {
                    this.publishedVariableDataType = new ArrayList<PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>>();
                }
                for (PublishedVariableDataType _item: publishedVariableDataType) {
                    this.publishedVariableDataType.add(new PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedVariableDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedVariableDataType
         *     Neuer Wert der Eigenschaft "publishedVariableDataType".
         */
        public ListOfPublishedVariableDataType.Builder<_B> withPublishedVariableDataType(final Iterable<? extends PublishedVariableDataType> publishedVariableDataType) {
            if (this.publishedVariableDataType!= null) {
                this.publishedVariableDataType.clear();
            }
            return addPublishedVariableDataType(publishedVariableDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "publishedVariableDataType" hinzu.
         * 
         * @param publishedVariableDataType
         *     Werte, die zur Eigenschaft "publishedVariableDataType" hinzugefügt werden.
         */
        public ListOfPublishedVariableDataType.Builder<_B> addPublishedVariableDataType(PublishedVariableDataType... publishedVariableDataType) {
            addPublishedVariableDataType(Arrays.asList(publishedVariableDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "publishedVariableDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param publishedVariableDataType
         *     Neuer Wert der Eigenschaft "publishedVariableDataType".
         */
        public ListOfPublishedVariableDataType.Builder<_B> withPublishedVariableDataType(PublishedVariableDataType... publishedVariableDataType) {
            withPublishedVariableDataType(Arrays.asList(publishedVariableDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "PublishedVariableDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.PublishedVariableDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "PublishedVariableDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.PublishedVariableDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public PublishedVariableDataType.Builder<? extends ListOfPublishedVariableDataType.Builder<_B>> addPublishedVariableDataType() {
            if (this.publishedVariableDataType == null) {
                this.publishedVariableDataType = new ArrayList<PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>>();
            }
            final PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>> publishedVariableDataType_Builder = new PublishedVariableDataType.Builder<ListOfPublishedVariableDataType.Builder<_B>>(this, null, false);
            this.publishedVariableDataType.add(publishedVariableDataType_Builder);
            return publishedVariableDataType_Builder;
        }

        @Override
        public ListOfPublishedVariableDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfPublishedVariableDataType());
            } else {
                return ((ListOfPublishedVariableDataType) _storedValue);
            }
        }

        public ListOfPublishedVariableDataType.Builder<_B> copyOf(final ListOfPublishedVariableDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfPublishedVariableDataType.Builder<_B> copyOf(final ListOfPublishedVariableDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfPublishedVariableDataType.Selector<ListOfPublishedVariableDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfPublishedVariableDataType.Select _root() {
            return new ListOfPublishedVariableDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private PublishedVariableDataType.Selector<TRoot, ListOfPublishedVariableDataType.Selector<TRoot, TParent>> publishedVariableDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.publishedVariableDataType!= null) {
                products.put("publishedVariableDataType", this.publishedVariableDataType.init());
            }
            return products;
        }

        public PublishedVariableDataType.Selector<TRoot, ListOfPublishedVariableDataType.Selector<TRoot, TParent>> publishedVariableDataType() {
            return ((this.publishedVariableDataType == null)?this.publishedVariableDataType = new PublishedVariableDataType.Selector<TRoot, ListOfPublishedVariableDataType.Selector<TRoot, TParent>>(this._root, this, "publishedVariableDataType"):this.publishedVariableDataType);
        }

    }

}
