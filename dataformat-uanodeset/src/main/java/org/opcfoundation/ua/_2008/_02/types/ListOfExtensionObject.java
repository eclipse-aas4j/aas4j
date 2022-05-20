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
 * <p>Java-Klasse für ListOfExtensionObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfExtensionObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtensionObject" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ExtensionObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfExtensionObject", propOrder = {
    "extensionObject"
})
public class ListOfExtensionObject {

    @XmlElement(name = "ExtensionObject", nillable = true)
    protected List<ExtensionObject> extensionObject;

    /**
     * Gets the value of the extensionObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionObject }
     * 
     * 
     */
    public List<ExtensionObject> getExtensionObject() {
        if (extensionObject == null) {
            extensionObject = new ArrayList<ExtensionObject>();
        }
        return this.extensionObject;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfExtensionObject.Builder<_B> _other) {
        if (this.extensionObject == null) {
            _other.extensionObject = null;
        } else {
            _other.extensionObject = new ArrayList<ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>>();
            for (ExtensionObject _item: this.extensionObject) {
                _other.extensionObject.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfExtensionObject.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfExtensionObject.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfExtensionObject.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfExtensionObject.Builder<Void> builder() {
        return new ListOfExtensionObject.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfExtensionObject.Builder<_B> copyOf(final ListOfExtensionObject _other) {
        final ListOfExtensionObject.Builder<_B> _newBuilder = new ListOfExtensionObject.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfExtensionObject.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree extensionObjectPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("extensionObject"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(extensionObjectPropertyTree!= null):((extensionObjectPropertyTree == null)||(!extensionObjectPropertyTree.isLeaf())))) {
            if (this.extensionObject == null) {
                _other.extensionObject = null;
            } else {
                _other.extensionObject = new ArrayList<ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>>();
                for (ExtensionObject _item: this.extensionObject) {
                    _other.extensionObject.add(((_item == null)?null:_item.newCopyBuilder(_other, extensionObjectPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfExtensionObject.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfExtensionObject.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfExtensionObject.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfExtensionObject.Builder<_B> copyOf(final ListOfExtensionObject _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfExtensionObject.Builder<_B> _newBuilder = new ListOfExtensionObject.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfExtensionObject.Builder<Void> copyExcept(final ListOfExtensionObject _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfExtensionObject.Builder<Void> copyOnly(final ListOfExtensionObject _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfExtensionObject _storedValue;
        private List<ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>> extensionObject;

        public Builder(final _B _parentBuilder, final ListOfExtensionObject _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.extensionObject == null) {
                        this.extensionObject = null;
                    } else {
                        this.extensionObject = new ArrayList<ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>>();
                        for (ExtensionObject _item: _other.extensionObject) {
                            this.extensionObject.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfExtensionObject _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree extensionObjectPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("extensionObject"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(extensionObjectPropertyTree!= null):((extensionObjectPropertyTree == null)||(!extensionObjectPropertyTree.isLeaf())))) {
                        if (_other.extensionObject == null) {
                            this.extensionObject = null;
                        } else {
                            this.extensionObject = new ArrayList<ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>>();
                            for (ExtensionObject _item: _other.extensionObject) {
                                this.extensionObject.add(((_item == null)?null:_item.newCopyBuilder(this, extensionObjectPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfExtensionObject >_P init(final _P _product) {
            if (this.extensionObject!= null) {
                final List<ExtensionObject> extensionObject = new ArrayList<ExtensionObject>(this.extensionObject.size());
                for (ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>> _item: this.extensionObject) {
                    extensionObject.add(_item.build());
                }
                _product.extensionObject = extensionObject;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "extensionObject" hinzu.
         * 
         * @param extensionObject
         *     Werte, die zur Eigenschaft "extensionObject" hinzugefügt werden.
         */
        public ListOfExtensionObject.Builder<_B> addExtensionObject(final Iterable<? extends ExtensionObject> extensionObject) {
            if (extensionObject!= null) {
                if (this.extensionObject == null) {
                    this.extensionObject = new ArrayList<ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>>();
                }
                for (ExtensionObject _item: extensionObject) {
                    this.extensionObject.add(new ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "extensionObject" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param extensionObject
         *     Neuer Wert der Eigenschaft "extensionObject".
         */
        public ListOfExtensionObject.Builder<_B> withExtensionObject(final Iterable<? extends ExtensionObject> extensionObject) {
            if (this.extensionObject!= null) {
                this.extensionObject.clear();
            }
            return addExtensionObject(extensionObject);
        }

        /**
         * Fügt Werte zur Eigenschaft "extensionObject" hinzu.
         * 
         * @param extensionObject
         *     Werte, die zur Eigenschaft "extensionObject" hinzugefügt werden.
         */
        public ListOfExtensionObject.Builder<_B> addExtensionObject(ExtensionObject... extensionObject) {
            addExtensionObject(Arrays.asList(extensionObject));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "extensionObject" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param extensionObject
         *     Neuer Wert der Eigenschaft "extensionObject".
         */
        public ListOfExtensionObject.Builder<_B> withExtensionObject(ExtensionObject... extensionObject) {
            withExtensionObject(Arrays.asList(extensionObject));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ExtensionObject".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ExtensionObject.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ExtensionObject".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ExtensionObject.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public ExtensionObject.Builder<? extends ListOfExtensionObject.Builder<_B>> addExtensionObject() {
            if (this.extensionObject == null) {
                this.extensionObject = new ArrayList<ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>>();
            }
            final ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>> extensionObject_Builder = new ExtensionObject.Builder<ListOfExtensionObject.Builder<_B>>(this, null, false);
            this.extensionObject.add(extensionObject_Builder);
            return extensionObject_Builder;
        }

        @Override
        public ListOfExtensionObject build() {
            if (_storedValue == null) {
                return this.init(new ListOfExtensionObject());
            } else {
                return ((ListOfExtensionObject) _storedValue);
            }
        }

        public ListOfExtensionObject.Builder<_B> copyOf(final ListOfExtensionObject _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfExtensionObject.Builder<_B> copyOf(final ListOfExtensionObject.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfExtensionObject.Selector<ListOfExtensionObject.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfExtensionObject.Select _root() {
            return new ListOfExtensionObject.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ExtensionObject.Selector<TRoot, ListOfExtensionObject.Selector<TRoot, TParent>> extensionObject = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.extensionObject!= null) {
                products.put("extensionObject", this.extensionObject.init());
            }
            return products;
        }

        public ExtensionObject.Selector<TRoot, ListOfExtensionObject.Selector<TRoot, TParent>> extensionObject() {
            return ((this.extensionObject == null)?this.extensionObject = new ExtensionObject.Selector<TRoot, ListOfExtensionObject.Selector<TRoot, TParent>>(this._root, this, "extensionObject"):this.extensionObject);
        }

    }

}
