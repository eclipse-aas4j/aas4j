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
 * <p>Java-Klasse für ListOfJsonWriterGroupMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfJsonWriterGroupMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JsonWriterGroupMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}JsonWriterGroupMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfJsonWriterGroupMessageDataType", propOrder = {
    "jsonWriterGroupMessageDataType"
})
public class ListOfJsonWriterGroupMessageDataType {

    @XmlElement(name = "JsonWriterGroupMessageDataType", nillable = true)
    protected List<JsonWriterGroupMessageDataType> jsonWriterGroupMessageDataType;

    /**
     * Gets the value of the jsonWriterGroupMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jsonWriterGroupMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJsonWriterGroupMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JsonWriterGroupMessageDataType }
     * 
     * 
     */
    public List<JsonWriterGroupMessageDataType> getJsonWriterGroupMessageDataType() {
        if (jsonWriterGroupMessageDataType == null) {
            jsonWriterGroupMessageDataType = new ArrayList<JsonWriterGroupMessageDataType>();
        }
        return this.jsonWriterGroupMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfJsonWriterGroupMessageDataType.Builder<_B> _other) {
        if (this.jsonWriterGroupMessageDataType == null) {
            _other.jsonWriterGroupMessageDataType = null;
        } else {
            _other.jsonWriterGroupMessageDataType = new ArrayList<JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>>();
            for (JsonWriterGroupMessageDataType _item: this.jsonWriterGroupMessageDataType) {
                _other.jsonWriterGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfJsonWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfJsonWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfJsonWriterGroupMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfJsonWriterGroupMessageDataType.Builder<Void> builder() {
        return new ListOfJsonWriterGroupMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfJsonWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfJsonWriterGroupMessageDataType _other) {
        final ListOfJsonWriterGroupMessageDataType.Builder<_B> _newBuilder = new ListOfJsonWriterGroupMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfJsonWriterGroupMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree jsonWriterGroupMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonWriterGroupMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonWriterGroupMessageDataTypePropertyTree!= null):((jsonWriterGroupMessageDataTypePropertyTree == null)||(!jsonWriterGroupMessageDataTypePropertyTree.isLeaf())))) {
            if (this.jsonWriterGroupMessageDataType == null) {
                _other.jsonWriterGroupMessageDataType = null;
            } else {
                _other.jsonWriterGroupMessageDataType = new ArrayList<JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>>();
                for (JsonWriterGroupMessageDataType _item: this.jsonWriterGroupMessageDataType) {
                    _other.jsonWriterGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, jsonWriterGroupMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfJsonWriterGroupMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfJsonWriterGroupMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfJsonWriterGroupMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfJsonWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfJsonWriterGroupMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfJsonWriterGroupMessageDataType.Builder<_B> _newBuilder = new ListOfJsonWriterGroupMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfJsonWriterGroupMessageDataType.Builder<Void> copyExcept(final ListOfJsonWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfJsonWriterGroupMessageDataType.Builder<Void> copyOnly(final ListOfJsonWriterGroupMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfJsonWriterGroupMessageDataType _storedValue;
        private List<JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>> jsonWriterGroupMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfJsonWriterGroupMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.jsonWriterGroupMessageDataType == null) {
                        this.jsonWriterGroupMessageDataType = null;
                    } else {
                        this.jsonWriterGroupMessageDataType = new ArrayList<JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>>();
                        for (JsonWriterGroupMessageDataType _item: _other.jsonWriterGroupMessageDataType) {
                            this.jsonWriterGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfJsonWriterGroupMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree jsonWriterGroupMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonWriterGroupMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonWriterGroupMessageDataTypePropertyTree!= null):((jsonWriterGroupMessageDataTypePropertyTree == null)||(!jsonWriterGroupMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.jsonWriterGroupMessageDataType == null) {
                            this.jsonWriterGroupMessageDataType = null;
                        } else {
                            this.jsonWriterGroupMessageDataType = new ArrayList<JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>>();
                            for (JsonWriterGroupMessageDataType _item: _other.jsonWriterGroupMessageDataType) {
                                this.jsonWriterGroupMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, jsonWriterGroupMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfJsonWriterGroupMessageDataType >_P init(final _P _product) {
            if (this.jsonWriterGroupMessageDataType!= null) {
                final List<JsonWriterGroupMessageDataType> jsonWriterGroupMessageDataType = new ArrayList<JsonWriterGroupMessageDataType>(this.jsonWriterGroupMessageDataType.size());
                for (JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>> _item: this.jsonWriterGroupMessageDataType) {
                    jsonWriterGroupMessageDataType.add(_item.build());
                }
                _product.jsonWriterGroupMessageDataType = jsonWriterGroupMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonWriterGroupMessageDataType" hinzu.
         * 
         * @param jsonWriterGroupMessageDataType
         *     Werte, die zur Eigenschaft "jsonWriterGroupMessageDataType" hinzugefügt werden.
         */
        public ListOfJsonWriterGroupMessageDataType.Builder<_B> addJsonWriterGroupMessageDataType(final Iterable<? extends JsonWriterGroupMessageDataType> jsonWriterGroupMessageDataType) {
            if (jsonWriterGroupMessageDataType!= null) {
                if (this.jsonWriterGroupMessageDataType == null) {
                    this.jsonWriterGroupMessageDataType = new ArrayList<JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>>();
                }
                for (JsonWriterGroupMessageDataType _item: jsonWriterGroupMessageDataType) {
                    this.jsonWriterGroupMessageDataType.add(new JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonWriterGroupMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonWriterGroupMessageDataType
         *     Neuer Wert der Eigenschaft "jsonWriterGroupMessageDataType".
         */
        public ListOfJsonWriterGroupMessageDataType.Builder<_B> withJsonWriterGroupMessageDataType(final Iterable<? extends JsonWriterGroupMessageDataType> jsonWriterGroupMessageDataType) {
            if (this.jsonWriterGroupMessageDataType!= null) {
                this.jsonWriterGroupMessageDataType.clear();
            }
            return addJsonWriterGroupMessageDataType(jsonWriterGroupMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonWriterGroupMessageDataType" hinzu.
         * 
         * @param jsonWriterGroupMessageDataType
         *     Werte, die zur Eigenschaft "jsonWriterGroupMessageDataType" hinzugefügt werden.
         */
        public ListOfJsonWriterGroupMessageDataType.Builder<_B> addJsonWriterGroupMessageDataType(JsonWriterGroupMessageDataType... jsonWriterGroupMessageDataType) {
            addJsonWriterGroupMessageDataType(Arrays.asList(jsonWriterGroupMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonWriterGroupMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonWriterGroupMessageDataType
         *     Neuer Wert der Eigenschaft "jsonWriterGroupMessageDataType".
         */
        public ListOfJsonWriterGroupMessageDataType.Builder<_B> withJsonWriterGroupMessageDataType(JsonWriterGroupMessageDataType... jsonWriterGroupMessageDataType) {
            withJsonWriterGroupMessageDataType(Arrays.asList(jsonWriterGroupMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "JsonWriterGroupMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "JsonWriterGroupMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.JsonWriterGroupMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public JsonWriterGroupMessageDataType.Builder<? extends ListOfJsonWriterGroupMessageDataType.Builder<_B>> addJsonWriterGroupMessageDataType() {
            if (this.jsonWriterGroupMessageDataType == null) {
                this.jsonWriterGroupMessageDataType = new ArrayList<JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>>();
            }
            final JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>> jsonWriterGroupMessageDataType_Builder = new JsonWriterGroupMessageDataType.Builder<ListOfJsonWriterGroupMessageDataType.Builder<_B>>(this, null, false);
            this.jsonWriterGroupMessageDataType.add(jsonWriterGroupMessageDataType_Builder);
            return jsonWriterGroupMessageDataType_Builder;
        }

        @Override
        public ListOfJsonWriterGroupMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfJsonWriterGroupMessageDataType());
            } else {
                return ((ListOfJsonWriterGroupMessageDataType) _storedValue);
            }
        }

        public ListOfJsonWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfJsonWriterGroupMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfJsonWriterGroupMessageDataType.Builder<_B> copyOf(final ListOfJsonWriterGroupMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfJsonWriterGroupMessageDataType.Selector<ListOfJsonWriterGroupMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfJsonWriterGroupMessageDataType.Select _root() {
            return new ListOfJsonWriterGroupMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private JsonWriterGroupMessageDataType.Selector<TRoot, ListOfJsonWriterGroupMessageDataType.Selector<TRoot, TParent>> jsonWriterGroupMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.jsonWriterGroupMessageDataType!= null) {
                products.put("jsonWriterGroupMessageDataType", this.jsonWriterGroupMessageDataType.init());
            }
            return products;
        }

        public JsonWriterGroupMessageDataType.Selector<TRoot, ListOfJsonWriterGroupMessageDataType.Selector<TRoot, TParent>> jsonWriterGroupMessageDataType() {
            return ((this.jsonWriterGroupMessageDataType == null)?this.jsonWriterGroupMessageDataType = new JsonWriterGroupMessageDataType.Selector<TRoot, ListOfJsonWriterGroupMessageDataType.Selector<TRoot, TParent>>(this._root, this, "jsonWriterGroupMessageDataType"):this.jsonWriterGroupMessageDataType);
        }

    }

}
