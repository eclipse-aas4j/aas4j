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
 * <p>Java-Klasse für ListOfQualifiedName complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfQualifiedName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QualifiedName" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}QualifiedName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfQualifiedName", propOrder = {
    "qualifiedName"
})
public class ListOfQualifiedName {

    @XmlElement(name = "QualifiedName", nillable = true)
    protected List<QualifiedName> qualifiedName;

    /**
     * Gets the value of the qualifiedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifiedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedName }
     * 
     * 
     */
    public List<QualifiedName> getQualifiedName() {
        if (qualifiedName == null) {
            qualifiedName = new ArrayList<QualifiedName>();
        }
        return this.qualifiedName;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfQualifiedName.Builder<_B> _other) {
        if (this.qualifiedName == null) {
            _other.qualifiedName = null;
        } else {
            _other.qualifiedName = new ArrayList<QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>>();
            for (QualifiedName _item: this.qualifiedName) {
                _other.qualifiedName.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfQualifiedName.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfQualifiedName.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfQualifiedName.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfQualifiedName.Builder<Void> builder() {
        return new ListOfQualifiedName.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfQualifiedName.Builder<_B> copyOf(final ListOfQualifiedName _other) {
        final ListOfQualifiedName.Builder<_B> _newBuilder = new ListOfQualifiedName.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfQualifiedName.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree qualifiedNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("qualifiedName"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(qualifiedNamePropertyTree!= null):((qualifiedNamePropertyTree == null)||(!qualifiedNamePropertyTree.isLeaf())))) {
            if (this.qualifiedName == null) {
                _other.qualifiedName = null;
            } else {
                _other.qualifiedName = new ArrayList<QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>>();
                for (QualifiedName _item: this.qualifiedName) {
                    _other.qualifiedName.add(((_item == null)?null:_item.newCopyBuilder(_other, qualifiedNamePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfQualifiedName.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfQualifiedName.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfQualifiedName.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfQualifiedName.Builder<_B> copyOf(final ListOfQualifiedName _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfQualifiedName.Builder<_B> _newBuilder = new ListOfQualifiedName.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfQualifiedName.Builder<Void> copyExcept(final ListOfQualifiedName _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfQualifiedName.Builder<Void> copyOnly(final ListOfQualifiedName _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfQualifiedName _storedValue;
        private List<QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>> qualifiedName;

        public Builder(final _B _parentBuilder, final ListOfQualifiedName _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.qualifiedName == null) {
                        this.qualifiedName = null;
                    } else {
                        this.qualifiedName = new ArrayList<QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>>();
                        for (QualifiedName _item: _other.qualifiedName) {
                            this.qualifiedName.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfQualifiedName _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree qualifiedNamePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("qualifiedName"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(qualifiedNamePropertyTree!= null):((qualifiedNamePropertyTree == null)||(!qualifiedNamePropertyTree.isLeaf())))) {
                        if (_other.qualifiedName == null) {
                            this.qualifiedName = null;
                        } else {
                            this.qualifiedName = new ArrayList<QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>>();
                            for (QualifiedName _item: _other.qualifiedName) {
                                this.qualifiedName.add(((_item == null)?null:_item.newCopyBuilder(this, qualifiedNamePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfQualifiedName >_P init(final _P _product) {
            if (this.qualifiedName!= null) {
                final List<QualifiedName> qualifiedName = new ArrayList<QualifiedName>(this.qualifiedName.size());
                for (QualifiedName.Builder<ListOfQualifiedName.Builder<_B>> _item: this.qualifiedName) {
                    qualifiedName.add(_item.build());
                }
                _product.qualifiedName = qualifiedName;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "qualifiedName" hinzu.
         * 
         * @param qualifiedName
         *     Werte, die zur Eigenschaft "qualifiedName" hinzugefügt werden.
         */
        public ListOfQualifiedName.Builder<_B> addQualifiedName(final Iterable<? extends QualifiedName> qualifiedName) {
            if (qualifiedName!= null) {
                if (this.qualifiedName == null) {
                    this.qualifiedName = new ArrayList<QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>>();
                }
                for (QualifiedName _item: qualifiedName) {
                    this.qualifiedName.add(new QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "qualifiedName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param qualifiedName
         *     Neuer Wert der Eigenschaft "qualifiedName".
         */
        public ListOfQualifiedName.Builder<_B> withQualifiedName(final Iterable<? extends QualifiedName> qualifiedName) {
            if (this.qualifiedName!= null) {
                this.qualifiedName.clear();
            }
            return addQualifiedName(qualifiedName);
        }

        /**
         * Fügt Werte zur Eigenschaft "qualifiedName" hinzu.
         * 
         * @param qualifiedName
         *     Werte, die zur Eigenschaft "qualifiedName" hinzugefügt werden.
         */
        public ListOfQualifiedName.Builder<_B> addQualifiedName(QualifiedName... qualifiedName) {
            addQualifiedName(Arrays.asList(qualifiedName));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "qualifiedName" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param qualifiedName
         *     Neuer Wert der Eigenschaft "qualifiedName".
         */
        public ListOfQualifiedName.Builder<_B> withQualifiedName(QualifiedName... qualifiedName) {
            withQualifiedName(Arrays.asList(qualifiedName));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "QualifiedName".
         * Mit {@link org.opcfoundation.ua._2008._02.types.QualifiedName.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "QualifiedName".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.QualifiedName.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public QualifiedName.Builder<? extends ListOfQualifiedName.Builder<_B>> addQualifiedName() {
            if (this.qualifiedName == null) {
                this.qualifiedName = new ArrayList<QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>>();
            }
            final QualifiedName.Builder<ListOfQualifiedName.Builder<_B>> qualifiedName_Builder = new QualifiedName.Builder<ListOfQualifiedName.Builder<_B>>(this, null, false);
            this.qualifiedName.add(qualifiedName_Builder);
            return qualifiedName_Builder;
        }

        @Override
        public ListOfQualifiedName build() {
            if (_storedValue == null) {
                return this.init(new ListOfQualifiedName());
            } else {
                return ((ListOfQualifiedName) _storedValue);
            }
        }

        public ListOfQualifiedName.Builder<_B> copyOf(final ListOfQualifiedName _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfQualifiedName.Builder<_B> copyOf(final ListOfQualifiedName.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfQualifiedName.Selector<ListOfQualifiedName.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfQualifiedName.Select _root() {
            return new ListOfQualifiedName.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private QualifiedName.Selector<TRoot, ListOfQualifiedName.Selector<TRoot, TParent>> qualifiedName = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.qualifiedName!= null) {
                products.put("qualifiedName", this.qualifiedName.init());
            }
            return products;
        }

        public QualifiedName.Selector<TRoot, ListOfQualifiedName.Selector<TRoot, TParent>> qualifiedName() {
            return ((this.qualifiedName == null)?this.qualifiedName = new QualifiedName.Selector<TRoot, ListOfQualifiedName.Selector<TRoot, TParent>>(this._root, this, "qualifiedName"):this.qualifiedName);
        }

    }

}
