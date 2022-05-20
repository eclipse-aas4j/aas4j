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
 * <p>Java-Klasse für ListOfJsonDataSetWriterMessageDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfJsonDataSetWriterMessageDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JsonDataSetWriterMessageDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}JsonDataSetWriterMessageDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfJsonDataSetWriterMessageDataType", propOrder = {
    "jsonDataSetWriterMessageDataType"
})
public class ListOfJsonDataSetWriterMessageDataType {

    @XmlElement(name = "JsonDataSetWriterMessageDataType", nillable = true)
    protected List<JsonDataSetWriterMessageDataType> jsonDataSetWriterMessageDataType;

    /**
     * Gets the value of the jsonDataSetWriterMessageDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jsonDataSetWriterMessageDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJsonDataSetWriterMessageDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JsonDataSetWriterMessageDataType }
     * 
     * 
     */
    public List<JsonDataSetWriterMessageDataType> getJsonDataSetWriterMessageDataType() {
        if (jsonDataSetWriterMessageDataType == null) {
            jsonDataSetWriterMessageDataType = new ArrayList<JsonDataSetWriterMessageDataType>();
        }
        return this.jsonDataSetWriterMessageDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfJsonDataSetWriterMessageDataType.Builder<_B> _other) {
        if (this.jsonDataSetWriterMessageDataType == null) {
            _other.jsonDataSetWriterMessageDataType = null;
        } else {
            _other.jsonDataSetWriterMessageDataType = new ArrayList<JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>>();
            for (JsonDataSetWriterMessageDataType _item: this.jsonDataSetWriterMessageDataType) {
                _other.jsonDataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfJsonDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfJsonDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfJsonDataSetWriterMessageDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfJsonDataSetWriterMessageDataType.Builder<Void> builder() {
        return new ListOfJsonDataSetWriterMessageDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfJsonDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfJsonDataSetWriterMessageDataType _other) {
        final ListOfJsonDataSetWriterMessageDataType.Builder<_B> _newBuilder = new ListOfJsonDataSetWriterMessageDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfJsonDataSetWriterMessageDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree jsonDataSetWriterMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonDataSetWriterMessageDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonDataSetWriterMessageDataTypePropertyTree!= null):((jsonDataSetWriterMessageDataTypePropertyTree == null)||(!jsonDataSetWriterMessageDataTypePropertyTree.isLeaf())))) {
            if (this.jsonDataSetWriterMessageDataType == null) {
                _other.jsonDataSetWriterMessageDataType = null;
            } else {
                _other.jsonDataSetWriterMessageDataType = new ArrayList<JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>>();
                for (JsonDataSetWriterMessageDataType _item: this.jsonDataSetWriterMessageDataType) {
                    _other.jsonDataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, jsonDataSetWriterMessageDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfJsonDataSetWriterMessageDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfJsonDataSetWriterMessageDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfJsonDataSetWriterMessageDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfJsonDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfJsonDataSetWriterMessageDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfJsonDataSetWriterMessageDataType.Builder<_B> _newBuilder = new ListOfJsonDataSetWriterMessageDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfJsonDataSetWriterMessageDataType.Builder<Void> copyExcept(final ListOfJsonDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfJsonDataSetWriterMessageDataType.Builder<Void> copyOnly(final ListOfJsonDataSetWriterMessageDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfJsonDataSetWriterMessageDataType _storedValue;
        private List<JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>> jsonDataSetWriterMessageDataType;

        public Builder(final _B _parentBuilder, final ListOfJsonDataSetWriterMessageDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.jsonDataSetWriterMessageDataType == null) {
                        this.jsonDataSetWriterMessageDataType = null;
                    } else {
                        this.jsonDataSetWriterMessageDataType = new ArrayList<JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>>();
                        for (JsonDataSetWriterMessageDataType _item: _other.jsonDataSetWriterMessageDataType) {
                            this.jsonDataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfJsonDataSetWriterMessageDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree jsonDataSetWriterMessageDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("jsonDataSetWriterMessageDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(jsonDataSetWriterMessageDataTypePropertyTree!= null):((jsonDataSetWriterMessageDataTypePropertyTree == null)||(!jsonDataSetWriterMessageDataTypePropertyTree.isLeaf())))) {
                        if (_other.jsonDataSetWriterMessageDataType == null) {
                            this.jsonDataSetWriterMessageDataType = null;
                        } else {
                            this.jsonDataSetWriterMessageDataType = new ArrayList<JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>>();
                            for (JsonDataSetWriterMessageDataType _item: _other.jsonDataSetWriterMessageDataType) {
                                this.jsonDataSetWriterMessageDataType.add(((_item == null)?null:_item.newCopyBuilder(this, jsonDataSetWriterMessageDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfJsonDataSetWriterMessageDataType >_P init(final _P _product) {
            if (this.jsonDataSetWriterMessageDataType!= null) {
                final List<JsonDataSetWriterMessageDataType> jsonDataSetWriterMessageDataType = new ArrayList<JsonDataSetWriterMessageDataType>(this.jsonDataSetWriterMessageDataType.size());
                for (JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>> _item: this.jsonDataSetWriterMessageDataType) {
                    jsonDataSetWriterMessageDataType.add(_item.build());
                }
                _product.jsonDataSetWriterMessageDataType = jsonDataSetWriterMessageDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonDataSetWriterMessageDataType" hinzu.
         * 
         * @param jsonDataSetWriterMessageDataType
         *     Werte, die zur Eigenschaft "jsonDataSetWriterMessageDataType" hinzugefügt
         *     werden.
         */
        public ListOfJsonDataSetWriterMessageDataType.Builder<_B> addJsonDataSetWriterMessageDataType(final Iterable<? extends JsonDataSetWriterMessageDataType> jsonDataSetWriterMessageDataType) {
            if (jsonDataSetWriterMessageDataType!= null) {
                if (this.jsonDataSetWriterMessageDataType == null) {
                    this.jsonDataSetWriterMessageDataType = new ArrayList<JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>>();
                }
                for (JsonDataSetWriterMessageDataType _item: jsonDataSetWriterMessageDataType) {
                    this.jsonDataSetWriterMessageDataType.add(new JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonDataSetWriterMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonDataSetWriterMessageDataType
         *     Neuer Wert der Eigenschaft "jsonDataSetWriterMessageDataType".
         */
        public ListOfJsonDataSetWriterMessageDataType.Builder<_B> withJsonDataSetWriterMessageDataType(final Iterable<? extends JsonDataSetWriterMessageDataType> jsonDataSetWriterMessageDataType) {
            if (this.jsonDataSetWriterMessageDataType!= null) {
                this.jsonDataSetWriterMessageDataType.clear();
            }
            return addJsonDataSetWriterMessageDataType(jsonDataSetWriterMessageDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "jsonDataSetWriterMessageDataType" hinzu.
         * 
         * @param jsonDataSetWriterMessageDataType
         *     Werte, die zur Eigenschaft "jsonDataSetWriterMessageDataType" hinzugefügt
         *     werden.
         */
        public ListOfJsonDataSetWriterMessageDataType.Builder<_B> addJsonDataSetWriterMessageDataType(JsonDataSetWriterMessageDataType... jsonDataSetWriterMessageDataType) {
            addJsonDataSetWriterMessageDataType(Arrays.asList(jsonDataSetWriterMessageDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "jsonDataSetWriterMessageDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param jsonDataSetWriterMessageDataType
         *     Neuer Wert der Eigenschaft "jsonDataSetWriterMessageDataType".
         */
        public ListOfJsonDataSetWriterMessageDataType.Builder<_B> withJsonDataSetWriterMessageDataType(JsonDataSetWriterMessageDataType... jsonDataSetWriterMessageDataType) {
            withJsonDataSetWriterMessageDataType(Arrays.asList(jsonDataSetWriterMessageDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "JsonDataSetWriterMessageDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "JsonDataSetWriterMessageDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.JsonDataSetWriterMessageDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public JsonDataSetWriterMessageDataType.Builder<? extends ListOfJsonDataSetWriterMessageDataType.Builder<_B>> addJsonDataSetWriterMessageDataType() {
            if (this.jsonDataSetWriterMessageDataType == null) {
                this.jsonDataSetWriterMessageDataType = new ArrayList<JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>>();
            }
            final JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>> jsonDataSetWriterMessageDataType_Builder = new JsonDataSetWriterMessageDataType.Builder<ListOfJsonDataSetWriterMessageDataType.Builder<_B>>(this, null, false);
            this.jsonDataSetWriterMessageDataType.add(jsonDataSetWriterMessageDataType_Builder);
            return jsonDataSetWriterMessageDataType_Builder;
        }

        @Override
        public ListOfJsonDataSetWriterMessageDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfJsonDataSetWriterMessageDataType());
            } else {
                return ((ListOfJsonDataSetWriterMessageDataType) _storedValue);
            }
        }

        public ListOfJsonDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfJsonDataSetWriterMessageDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfJsonDataSetWriterMessageDataType.Builder<_B> copyOf(final ListOfJsonDataSetWriterMessageDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfJsonDataSetWriterMessageDataType.Selector<ListOfJsonDataSetWriterMessageDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfJsonDataSetWriterMessageDataType.Select _root() {
            return new ListOfJsonDataSetWriterMessageDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private JsonDataSetWriterMessageDataType.Selector<TRoot, ListOfJsonDataSetWriterMessageDataType.Selector<TRoot, TParent>> jsonDataSetWriterMessageDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.jsonDataSetWriterMessageDataType!= null) {
                products.put("jsonDataSetWriterMessageDataType", this.jsonDataSetWriterMessageDataType.init());
            }
            return products;
        }

        public JsonDataSetWriterMessageDataType.Selector<TRoot, ListOfJsonDataSetWriterMessageDataType.Selector<TRoot, TParent>> jsonDataSetWriterMessageDataType() {
            return ((this.jsonDataSetWriterMessageDataType == null)?this.jsonDataSetWriterMessageDataType = new JsonDataSetWriterMessageDataType.Selector<TRoot, ListOfJsonDataSetWriterMessageDataType.Selector<TRoot, TParent>>(this._root, this, "jsonDataSetWriterMessageDataType"):this.jsonDataSetWriterMessageDataType);
        }

    }

}
