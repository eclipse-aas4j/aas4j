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
 * <p>Java-Klasse für ListOfModelChangeStructureDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfModelChangeStructureDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModelChangeStructureDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ModelChangeStructureDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfModelChangeStructureDataType", propOrder = {
    "modelChangeStructureDataType"
})
public class ListOfModelChangeStructureDataType {

    @XmlElement(name = "ModelChangeStructureDataType", nillable = true)
    protected List<ModelChangeStructureDataType> modelChangeStructureDataType;

    /**
     * Gets the value of the modelChangeStructureDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelChangeStructureDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelChangeStructureDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelChangeStructureDataType }
     * 
     * 
     */
    public List<ModelChangeStructureDataType> getModelChangeStructureDataType() {
        if (modelChangeStructureDataType == null) {
            modelChangeStructureDataType = new ArrayList<ModelChangeStructureDataType>();
        }
        return this.modelChangeStructureDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfModelChangeStructureDataType.Builder<_B> _other) {
        if (this.modelChangeStructureDataType == null) {
            _other.modelChangeStructureDataType = null;
        } else {
            _other.modelChangeStructureDataType = new ArrayList<ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>>();
            for (ModelChangeStructureDataType _item: this.modelChangeStructureDataType) {
                _other.modelChangeStructureDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfModelChangeStructureDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfModelChangeStructureDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfModelChangeStructureDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfModelChangeStructureDataType.Builder<Void> builder() {
        return new ListOfModelChangeStructureDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfModelChangeStructureDataType.Builder<_B> copyOf(final ListOfModelChangeStructureDataType _other) {
        final ListOfModelChangeStructureDataType.Builder<_B> _newBuilder = new ListOfModelChangeStructureDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfModelChangeStructureDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree modelChangeStructureDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modelChangeStructureDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modelChangeStructureDataTypePropertyTree!= null):((modelChangeStructureDataTypePropertyTree == null)||(!modelChangeStructureDataTypePropertyTree.isLeaf())))) {
            if (this.modelChangeStructureDataType == null) {
                _other.modelChangeStructureDataType = null;
            } else {
                _other.modelChangeStructureDataType = new ArrayList<ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>>();
                for (ModelChangeStructureDataType _item: this.modelChangeStructureDataType) {
                    _other.modelChangeStructureDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, modelChangeStructureDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfModelChangeStructureDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfModelChangeStructureDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfModelChangeStructureDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfModelChangeStructureDataType.Builder<_B> copyOf(final ListOfModelChangeStructureDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfModelChangeStructureDataType.Builder<_B> _newBuilder = new ListOfModelChangeStructureDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfModelChangeStructureDataType.Builder<Void> copyExcept(final ListOfModelChangeStructureDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfModelChangeStructureDataType.Builder<Void> copyOnly(final ListOfModelChangeStructureDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfModelChangeStructureDataType _storedValue;
        private List<ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>> modelChangeStructureDataType;

        public Builder(final _B _parentBuilder, final ListOfModelChangeStructureDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.modelChangeStructureDataType == null) {
                        this.modelChangeStructureDataType = null;
                    } else {
                        this.modelChangeStructureDataType = new ArrayList<ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>>();
                        for (ModelChangeStructureDataType _item: _other.modelChangeStructureDataType) {
                            this.modelChangeStructureDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfModelChangeStructureDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree modelChangeStructureDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("modelChangeStructureDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(modelChangeStructureDataTypePropertyTree!= null):((modelChangeStructureDataTypePropertyTree == null)||(!modelChangeStructureDataTypePropertyTree.isLeaf())))) {
                        if (_other.modelChangeStructureDataType == null) {
                            this.modelChangeStructureDataType = null;
                        } else {
                            this.modelChangeStructureDataType = new ArrayList<ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>>();
                            for (ModelChangeStructureDataType _item: _other.modelChangeStructureDataType) {
                                this.modelChangeStructureDataType.add(((_item == null)?null:_item.newCopyBuilder(this, modelChangeStructureDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfModelChangeStructureDataType >_P init(final _P _product) {
            if (this.modelChangeStructureDataType!= null) {
                final List<ModelChangeStructureDataType> modelChangeStructureDataType = new ArrayList<ModelChangeStructureDataType>(this.modelChangeStructureDataType.size());
                for (ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>> _item: this.modelChangeStructureDataType) {
                    modelChangeStructureDataType.add(_item.build());
                }
                _product.modelChangeStructureDataType = modelChangeStructureDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "modelChangeStructureDataType" hinzu.
         * 
         * @param modelChangeStructureDataType
         *     Werte, die zur Eigenschaft "modelChangeStructureDataType" hinzugefügt werden.
         */
        public ListOfModelChangeStructureDataType.Builder<_B> addModelChangeStructureDataType(final Iterable<? extends ModelChangeStructureDataType> modelChangeStructureDataType) {
            if (modelChangeStructureDataType!= null) {
                if (this.modelChangeStructureDataType == null) {
                    this.modelChangeStructureDataType = new ArrayList<ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>>();
                }
                for (ModelChangeStructureDataType _item: modelChangeStructureDataType) {
                    this.modelChangeStructureDataType.add(new ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modelChangeStructureDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param modelChangeStructureDataType
         *     Neuer Wert der Eigenschaft "modelChangeStructureDataType".
         */
        public ListOfModelChangeStructureDataType.Builder<_B> withModelChangeStructureDataType(final Iterable<? extends ModelChangeStructureDataType> modelChangeStructureDataType) {
            if (this.modelChangeStructureDataType!= null) {
                this.modelChangeStructureDataType.clear();
            }
            return addModelChangeStructureDataType(modelChangeStructureDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "modelChangeStructureDataType" hinzu.
         * 
         * @param modelChangeStructureDataType
         *     Werte, die zur Eigenschaft "modelChangeStructureDataType" hinzugefügt werden.
         */
        public ListOfModelChangeStructureDataType.Builder<_B> addModelChangeStructureDataType(ModelChangeStructureDataType... modelChangeStructureDataType) {
            addModelChangeStructureDataType(Arrays.asList(modelChangeStructureDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "modelChangeStructureDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param modelChangeStructureDataType
         *     Neuer Wert der Eigenschaft "modelChangeStructureDataType".
         */
        public ListOfModelChangeStructureDataType.Builder<_B> withModelChangeStructureDataType(ModelChangeStructureDataType... modelChangeStructureDataType) {
            withModelChangeStructureDataType(Arrays.asList(modelChangeStructureDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ModelChangeStructureDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ModelChangeStructureDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.ModelChangeStructureDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ModelChangeStructureDataType.Builder<? extends ListOfModelChangeStructureDataType.Builder<_B>> addModelChangeStructureDataType() {
            if (this.modelChangeStructureDataType == null) {
                this.modelChangeStructureDataType = new ArrayList<ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>>();
            }
            final ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>> modelChangeStructureDataType_Builder = new ModelChangeStructureDataType.Builder<ListOfModelChangeStructureDataType.Builder<_B>>(this, null, false);
            this.modelChangeStructureDataType.add(modelChangeStructureDataType_Builder);
            return modelChangeStructureDataType_Builder;
        }

        @Override
        public ListOfModelChangeStructureDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfModelChangeStructureDataType());
            } else {
                return ((ListOfModelChangeStructureDataType) _storedValue);
            }
        }

        public ListOfModelChangeStructureDataType.Builder<_B> copyOf(final ListOfModelChangeStructureDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfModelChangeStructureDataType.Builder<_B> copyOf(final ListOfModelChangeStructureDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfModelChangeStructureDataType.Selector<ListOfModelChangeStructureDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfModelChangeStructureDataType.Select _root() {
            return new ListOfModelChangeStructureDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ModelChangeStructureDataType.Selector<TRoot, ListOfModelChangeStructureDataType.Selector<TRoot, TParent>> modelChangeStructureDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.modelChangeStructureDataType!= null) {
                products.put("modelChangeStructureDataType", this.modelChangeStructureDataType.init());
            }
            return products;
        }

        public ModelChangeStructureDataType.Selector<TRoot, ListOfModelChangeStructureDataType.Selector<TRoot, TParent>> modelChangeStructureDataType() {
            return ((this.modelChangeStructureDataType == null)?this.modelChangeStructureDataType = new ModelChangeStructureDataType.Selector<TRoot, ListOfModelChangeStructureDataType.Selector<TRoot, TParent>>(this._root, this, "modelChangeStructureDataType"):this.modelChangeStructureDataType);
        }

    }

}
