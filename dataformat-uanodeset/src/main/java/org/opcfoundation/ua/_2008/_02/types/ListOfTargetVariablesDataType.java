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
 * <p>Java-Klasse für ListOfTargetVariablesDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfTargetVariablesDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TargetVariablesDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}TargetVariablesDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfTargetVariablesDataType", propOrder = {
    "targetVariablesDataType"
})
public class ListOfTargetVariablesDataType {

    @XmlElement(name = "TargetVariablesDataType", nillable = true)
    protected List<TargetVariablesDataType> targetVariablesDataType;

    /**
     * Gets the value of the targetVariablesDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetVariablesDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetVariablesDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetVariablesDataType }
     * 
     * 
     */
    public List<TargetVariablesDataType> getTargetVariablesDataType() {
        if (targetVariablesDataType == null) {
            targetVariablesDataType = new ArrayList<TargetVariablesDataType>();
        }
        return this.targetVariablesDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfTargetVariablesDataType.Builder<_B> _other) {
        if (this.targetVariablesDataType == null) {
            _other.targetVariablesDataType = null;
        } else {
            _other.targetVariablesDataType = new ArrayList<TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>>();
            for (TargetVariablesDataType _item: this.targetVariablesDataType) {
                _other.targetVariablesDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfTargetVariablesDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfTargetVariablesDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfTargetVariablesDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfTargetVariablesDataType.Builder<Void> builder() {
        return new ListOfTargetVariablesDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfTargetVariablesDataType.Builder<_B> copyOf(final ListOfTargetVariablesDataType _other) {
        final ListOfTargetVariablesDataType.Builder<_B> _newBuilder = new ListOfTargetVariablesDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfTargetVariablesDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree targetVariablesDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetVariablesDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetVariablesDataTypePropertyTree!= null):((targetVariablesDataTypePropertyTree == null)||(!targetVariablesDataTypePropertyTree.isLeaf())))) {
            if (this.targetVariablesDataType == null) {
                _other.targetVariablesDataType = null;
            } else {
                _other.targetVariablesDataType = new ArrayList<TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>>();
                for (TargetVariablesDataType _item: this.targetVariablesDataType) {
                    _other.targetVariablesDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, targetVariablesDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfTargetVariablesDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfTargetVariablesDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfTargetVariablesDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfTargetVariablesDataType.Builder<_B> copyOf(final ListOfTargetVariablesDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfTargetVariablesDataType.Builder<_B> _newBuilder = new ListOfTargetVariablesDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfTargetVariablesDataType.Builder<Void> copyExcept(final ListOfTargetVariablesDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfTargetVariablesDataType.Builder<Void> copyOnly(final ListOfTargetVariablesDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfTargetVariablesDataType _storedValue;
        private List<TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>> targetVariablesDataType;

        public Builder(final _B _parentBuilder, final ListOfTargetVariablesDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.targetVariablesDataType == null) {
                        this.targetVariablesDataType = null;
                    } else {
                        this.targetVariablesDataType = new ArrayList<TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>>();
                        for (TargetVariablesDataType _item: _other.targetVariablesDataType) {
                            this.targetVariablesDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfTargetVariablesDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree targetVariablesDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("targetVariablesDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(targetVariablesDataTypePropertyTree!= null):((targetVariablesDataTypePropertyTree == null)||(!targetVariablesDataTypePropertyTree.isLeaf())))) {
                        if (_other.targetVariablesDataType == null) {
                            this.targetVariablesDataType = null;
                        } else {
                            this.targetVariablesDataType = new ArrayList<TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>>();
                            for (TargetVariablesDataType _item: _other.targetVariablesDataType) {
                                this.targetVariablesDataType.add(((_item == null)?null:_item.newCopyBuilder(this, targetVariablesDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfTargetVariablesDataType >_P init(final _P _product) {
            if (this.targetVariablesDataType!= null) {
                final List<TargetVariablesDataType> targetVariablesDataType = new ArrayList<TargetVariablesDataType>(this.targetVariablesDataType.size());
                for (TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>> _item: this.targetVariablesDataType) {
                    targetVariablesDataType.add(_item.build());
                }
                _product.targetVariablesDataType = targetVariablesDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "targetVariablesDataType" hinzu.
         * 
         * @param targetVariablesDataType
         *     Werte, die zur Eigenschaft "targetVariablesDataType" hinzugefügt werden.
         */
        public ListOfTargetVariablesDataType.Builder<_B> addTargetVariablesDataType(final Iterable<? extends TargetVariablesDataType> targetVariablesDataType) {
            if (targetVariablesDataType!= null) {
                if (this.targetVariablesDataType == null) {
                    this.targetVariablesDataType = new ArrayList<TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>>();
                }
                for (TargetVariablesDataType _item: targetVariablesDataType) {
                    this.targetVariablesDataType.add(new TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetVariablesDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param targetVariablesDataType
         *     Neuer Wert der Eigenschaft "targetVariablesDataType".
         */
        public ListOfTargetVariablesDataType.Builder<_B> withTargetVariablesDataType(final Iterable<? extends TargetVariablesDataType> targetVariablesDataType) {
            if (this.targetVariablesDataType!= null) {
                this.targetVariablesDataType.clear();
            }
            return addTargetVariablesDataType(targetVariablesDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "targetVariablesDataType" hinzu.
         * 
         * @param targetVariablesDataType
         *     Werte, die zur Eigenschaft "targetVariablesDataType" hinzugefügt werden.
         */
        public ListOfTargetVariablesDataType.Builder<_B> addTargetVariablesDataType(TargetVariablesDataType... targetVariablesDataType) {
            addTargetVariablesDataType(Arrays.asList(targetVariablesDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "targetVariablesDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param targetVariablesDataType
         *     Neuer Wert der Eigenschaft "targetVariablesDataType".
         */
        public ListOfTargetVariablesDataType.Builder<_B> withTargetVariablesDataType(TargetVariablesDataType... targetVariablesDataType) {
            withTargetVariablesDataType(Arrays.asList(targetVariablesDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "TargetVariablesDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.TargetVariablesDataType.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "TargetVariablesDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.TargetVariablesDataType.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public TargetVariablesDataType.Builder<? extends ListOfTargetVariablesDataType.Builder<_B>> addTargetVariablesDataType() {
            if (this.targetVariablesDataType == null) {
                this.targetVariablesDataType = new ArrayList<TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>>();
            }
            final TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>> targetVariablesDataType_Builder = new TargetVariablesDataType.Builder<ListOfTargetVariablesDataType.Builder<_B>>(this, null, false);
            this.targetVariablesDataType.add(targetVariablesDataType_Builder);
            return targetVariablesDataType_Builder;
        }

        @Override
        public ListOfTargetVariablesDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfTargetVariablesDataType());
            } else {
                return ((ListOfTargetVariablesDataType) _storedValue);
            }
        }

        public ListOfTargetVariablesDataType.Builder<_B> copyOf(final ListOfTargetVariablesDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfTargetVariablesDataType.Builder<_B> copyOf(final ListOfTargetVariablesDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfTargetVariablesDataType.Selector<ListOfTargetVariablesDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfTargetVariablesDataType.Select _root() {
            return new ListOfTargetVariablesDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private TargetVariablesDataType.Selector<TRoot, ListOfTargetVariablesDataType.Selector<TRoot, TParent>> targetVariablesDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.targetVariablesDataType!= null) {
                products.put("targetVariablesDataType", this.targetVariablesDataType.init());
            }
            return products;
        }

        public TargetVariablesDataType.Selector<TRoot, ListOfTargetVariablesDataType.Selector<TRoot, TParent>> targetVariablesDataType() {
            return ((this.targetVariablesDataType == null)?this.targetVariablesDataType = new TargetVariablesDataType.Selector<TRoot, ListOfTargetVariablesDataType.Selector<TRoot, TParent>>(this._root, this, "targetVariablesDataType"):this.targetVariablesDataType);
        }

    }

}
