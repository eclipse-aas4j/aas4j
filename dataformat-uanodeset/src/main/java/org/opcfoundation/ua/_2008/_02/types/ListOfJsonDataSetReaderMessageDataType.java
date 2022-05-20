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
 * <p>Java-Klasse für ListOfJsonDataSetReaderMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfJsonDataSetReaderMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JsonDataSetReaderMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}JsonDataSetReaderMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfJsonDataSetReaderMessageDataType", propOrder = {
    "jsonDataSetReaderMessageDataType"
})
public class ListOfJsonDataSetReaderMessageDataType {

    @XmlElement(name = "JsonDataSetReaderMessageDataType", nillable = true)
    protected List<JsonDataSetReaderMessageDataType> jsonDataSetReaderMessageDataType;

    /**
     * Gets the value of the jsonDataSetReaderMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jsonDataSetReaderMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJsonDataSetReaderMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JsonDataSetReaderMessageDataType }
     * 
     * 
     */
    public List<JsonDataSetReaderMessageDataType> getJsonDataSetReaderMessageDataType() {
        if (jsonDataSetReaderMessageDataType == null) {
            jsonDataSetReaderMessageDataType = new ArrayList<JsonDataSetReaderMessageDataType>();
        }
        return this.jsonDataSetReaderMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfJsonDataSetReaderMessageDataType.Builder<_B> _other) {
        if (this.jsonDataSetReaderMessageDataType == null) {
            _other.jsonDataSetReaderMessageDataType = null;
        } else {
            _other.jsonDataSetReaderMessageDataType = new ArrayList<JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>>();
            for (JsonDataSetReaderMessageDataType _item: this.jsonDataSetReaderMessageDataType) {
                _other.jsonDataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfJsonDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfJsonDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfJsonDataSetReaderMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfJsonDataSetReaderMessageDataType.Builder<Void> builder() {
        return new ListOfJsonDataSetReaderMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfJsonDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfJsonDataSetReaderMessageDataType _other) {
        final ListOfJsonDataSetReaderMessageDataType.Builder<_B> _newBuilder = new ListOfJsonDataSetReaderMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfJsonDataSetReaderMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree jsonDataSetReaderMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonDataSetReaderMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonDataSetReaderMessageDataTypePropertyTree!= null):((jsonDataSetReaderMessageDataTypePropertyTree == null)||(!jsonDataSetReaderMessageDataTypePropertyTree.isLeaf())))) {
            if (this.jsonDataSetReaderMessageDataType == null) {
                _other.jsonDataSetReaderMessageDataType = null;
            } else {
                _other.jsonDataSetReaderMessageDataType = new ArrayList<JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>>();
                for (JsonDataSetReaderMessageDataType _item: this.jsonDataSetReaderMessageDataType) {
                    _other.jsonDataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, jsonDataSetReaderMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfJsonDataSetReaderMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfJsonDataSetReaderMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfJsonDataSetReaderMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfJsonDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfJsonDataSetReaderMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfJsonDataSetReaderMessageDataType.Builder<_B> _newBuilder = new ListOfJsonDataSetReaderMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfJsonDataSetReaderMessageDataType.Builder<Void> copyExcept(final ListOfJsonDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfJsonDataSetReaderMessageDataType.Builder<Void> copyOnly(final ListOfJsonDataSetReaderMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfJsonDataSetReaderMessageDataType _storedValue;
        private List<JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>> jsonDataSetReaderMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfJsonDataSetReaderMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.jsonDataSetReaderMessageDataType == null) {
                        this.jsonDataSetReaderMessageDataType = null;
                    } else {
                        this.jsonDataSetReaderMessageDataType = new ArrayList<JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>>();
                        for (JsonDataSetReaderMessageDataType _item: _other.jsonDataSetReaderMessageDataType) {
                            this.jsonDataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfJsonDataSetReaderMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree jsonDataSetReaderMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonDataSetReaderMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonDataSetReaderMessageDataTypePropertyTree!= null):((jsonDataSetReaderMessageDataTypePropertyTree == null)||(!jsonDataSetReaderMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.jsonDataSetReaderMessageDataType == null) {
                            this.jsonDataSetReaderMessageDataType = null;
                        } else {
                            this.jsonDataSetReaderMessageDataType = new ArrayList<JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>>();
                            for (JsonDataSetReaderMessageDataType _item: _other.jsonDataSetReaderMessageDataType) {
                                this.jsonDataSetReaderMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, jsonDataSetReaderMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfJsonDataSetReaderMessageDataType >_P init(final _P _product) {
            if (this.jsonDataSetReaderMessageDataType!= null) {
                final List<JsonDataSetReaderMessageDataType> jsonDataSetReaderMessageDataType = new ArrayList<JsonDataSetReaderMessageDataType>(this.jsonDataSetReaderMessageDataType.size());
                for (JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>> _item: this.jsonDataSetReaderMessageDataType) {
                    jsonDataSetReaderMessageDataType.add(_item.build());
                }
                _product.jsonDataSetReaderMessageDataType = jsonDataSetReaderMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonDataSetReaderMessageDataType" hinzu.
         * 
         * @param jsonDataSetReaderMessageDataType
         *     Werte, die zur Eigenschaft "jsonDataSetReaderMessageDataType" hinzugefügt
         *     werden.
         */
        public ListOfJsonDataSetReaderMessageDataType.Builder<_B> addJsonDataSetReaderMessageDataType(final Iterable<? extends JsonDataSetReaderMessageDataType> jsonDataSetReaderMessageDataType) {
            if (jsonDataSetReaderMessageDataType!= null) {
                if (this.jsonDataSetReaderMessageDataType == null) {
                    this.jsonDataSetReaderMessageDataType = new ArrayList<JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>>();
                }
                for (JsonDataSetReaderMessageDataType _item: jsonDataSetReaderMessageDataType) {
                    this.jsonDataSetReaderMessageDataType.add(new JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonDataSetReaderMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonDataSetReaderMessageDataType
         *     Neuer Wert der Eigenschaft "jsonDataSetReaderMessageDataType".
         */
        public ListOfJsonDataSetReaderMessageDataType.Builder<_B> withJsonDataSetReaderMessageDataType(final Iterable<? extends JsonDataSetReaderMessageDataType> jsonDataSetReaderMessageDataType) {
            if (this.jsonDataSetReaderMessageDataType!= null) {
                this.jsonDataSetReaderMessageDataType.clear();
            }
            return addJsonDataSetReaderMessageDataType(jsonDataSetReaderMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonDataSetReaderMessageDataType" hinzu.
         * 
         * @param jsonDataSetReaderMessageDataType
         *     Werte, die zur Eigenschaft "jsonDataSetReaderMessageDataType" hinzugefügt
         *     werden.
         */
        public ListOfJsonDataSetReaderMessageDataType.Builder<_B> addJsonDataSetReaderMessageDataType(JsonDataSetReaderMessageDataType... jsonDataSetReaderMessageDataType) {
            addJsonDataSetReaderMessageDataType(Arrays.asList(jsonDataSetReaderMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonDataSetReaderMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonDataSetReaderMessageDataType
         *     Neuer Wert der Eigenschaft "jsonDataSetReaderMessageDataType".
         */
        public ListOfJsonDataSetReaderMessageDataType.Builder<_B> withJsonDataSetReaderMessageDataType(JsonDataSetReaderMessageDataType... jsonDataSetReaderMessageDataType) {
            withJsonDataSetReaderMessageDataType(Arrays.asList(jsonDataSetReaderMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "JsonDataSetReaderMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "JsonDataSetReaderMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.JsonDataSetReaderMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public JsonDataSetReaderMessageDataType.Builder<? extends ListOfJsonDataSetReaderMessageDataType.Builder<_B>> addJsonDataSetReaderMessageDataType() {
            if (this.jsonDataSetReaderMessageDataType == null) {
                this.jsonDataSetReaderMessageDataType = new ArrayList<JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>>();
            }
            final JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>> jsonDataSetReaderMessageDataType_Builder = new JsonDataSetReaderMessageDataType.Builder<ListOfJsonDataSetReaderMessageDataType.Builder<_B>>(this, null, false);
            this.jsonDataSetReaderMessageDataType.add(jsonDataSetReaderMessageDataType_Builder);
            return jsonDataSetReaderMessageDataType_Builder;
        }

        @Override
        public ListOfJsonDataSetReaderMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfJsonDataSetReaderMessageDataType());
            } else {
                return ((ListOfJsonDataSetReaderMessageDataType) _storedValue);
            }
        }

        public ListOfJsonDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfJsonDataSetReaderMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfJsonDataSetReaderMessageDataType.Builder<_B> copyOf(final ListOfJsonDataSetReaderMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfJsonDataSetReaderMessageDataType.Selector<ListOfJsonDataSetReaderMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfJsonDataSetReaderMessageDataType.Select _root() {
            return new ListOfJsonDataSetReaderMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private JsonDataSetReaderMessageDataType.Selector<TRoot, ListOfJsonDataSetReaderMessageDataType.Selector<TRoot, TParent>> jsonDataSetReaderMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.jsonDataSetReaderMessageDataType!= null) {
                products.put("jsonDataSetReaderMessageDataType", this.jsonDataSetReaderMessageDataType.init());
            }
            return products;
        }

        public JsonDataSetReaderMessageDataType.Selector<TRoot, ListOfJsonDataSetReaderMessageDataType.Selector<TRoot, TParent>> jsonDataSetReaderMessageDataType() {
            return ((this.jsonDataSetReaderMessageDataType == null)?this.jsonDataSetReaderMessageDataType = new JsonDataSetReaderMessageDataType.Selector<TRoot, ListOfJsonDataSetReaderMessageDataType.Selector<TRoot, TParent>>(this._root, this, "jsonDataSetReaderMessageDataType"):this.jsonDataSetReaderMessageDataType);
        }

    }

}
