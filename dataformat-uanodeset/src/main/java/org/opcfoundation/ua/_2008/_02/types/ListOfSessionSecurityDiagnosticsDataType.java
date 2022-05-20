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
 * <p>Java-Klasse für ListOfSessionSecurityDiagnosticsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSessionSecurityDiagnosticsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionSecurityDiagnosticsDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SessionSecurityDiagnosticsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSessionSecurityDiagnosticsDataType", propOrder = {
    "sessionSecurityDiagnosticsDataType"
})
public class ListOfSessionSecurityDiagnosticsDataType {

    @XmlElement(name = "SessionSecurityDiagnosticsDataType", nillable = true)
    protected List<SessionSecurityDiagnosticsDataType> sessionSecurityDiagnosticsDataType;

    /**
     * Gets the value of the sessionSecurityDiagnosticsDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionSecurityDiagnosticsDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionSecurityDiagnosticsDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionSecurityDiagnosticsDataType }
     * 
     * 
     */
    public List<SessionSecurityDiagnosticsDataType> getSessionSecurityDiagnosticsDataType() {
        if (sessionSecurityDiagnosticsDataType == null) {
            sessionSecurityDiagnosticsDataType = new ArrayList<SessionSecurityDiagnosticsDataType>();
        }
        return this.sessionSecurityDiagnosticsDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSessionSecurityDiagnosticsDataType.Builder<_B> _other) {
        if (this.sessionSecurityDiagnosticsDataType == null) {
            _other.sessionSecurityDiagnosticsDataType = null;
        } else {
            _other.sessionSecurityDiagnosticsDataType = new ArrayList<SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>>();
            for (SessionSecurityDiagnosticsDataType _item: this.sessionSecurityDiagnosticsDataType) {
                _other.sessionSecurityDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSessionSecurityDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSessionSecurityDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSessionSecurityDiagnosticsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSessionSecurityDiagnosticsDataType.Builder<Void> builder() {
        return new ListOfSessionSecurityDiagnosticsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSessionSecurityDiagnosticsDataType.Builder<_B> copyOf(final ListOfSessionSecurityDiagnosticsDataType _other) {
        final ListOfSessionSecurityDiagnosticsDataType.Builder<_B> _newBuilder = new ListOfSessionSecurityDiagnosticsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSessionSecurityDiagnosticsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sessionSecurityDiagnosticsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionSecurityDiagnosticsDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionSecurityDiagnosticsDataTypePropertyTree!= null):((sessionSecurityDiagnosticsDataTypePropertyTree == null)||(!sessionSecurityDiagnosticsDataTypePropertyTree.isLeaf())))) {
            if (this.sessionSecurityDiagnosticsDataType == null) {
                _other.sessionSecurityDiagnosticsDataType = null;
            } else {
                _other.sessionSecurityDiagnosticsDataType = new ArrayList<SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>>();
                for (SessionSecurityDiagnosticsDataType _item: this.sessionSecurityDiagnosticsDataType) {
                    _other.sessionSecurityDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, sessionSecurityDiagnosticsDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSessionSecurityDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSessionSecurityDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSessionSecurityDiagnosticsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSessionSecurityDiagnosticsDataType.Builder<_B> copyOf(final ListOfSessionSecurityDiagnosticsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSessionSecurityDiagnosticsDataType.Builder<_B> _newBuilder = new ListOfSessionSecurityDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSessionSecurityDiagnosticsDataType.Builder<Void> copyExcept(final ListOfSessionSecurityDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSessionSecurityDiagnosticsDataType.Builder<Void> copyOnly(final ListOfSessionSecurityDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSessionSecurityDiagnosticsDataType _storedValue;
        private List<SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>> sessionSecurityDiagnosticsDataType;

        public Builder(final _B _parentBuilder, final ListOfSessionSecurityDiagnosticsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.sessionSecurityDiagnosticsDataType == null) {
                        this.sessionSecurityDiagnosticsDataType = null;
                    } else {
                        this.sessionSecurityDiagnosticsDataType = new ArrayList<SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>>();
                        for (SessionSecurityDiagnosticsDataType _item: _other.sessionSecurityDiagnosticsDataType) {
                            this.sessionSecurityDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSessionSecurityDiagnosticsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree sessionSecurityDiagnosticsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionSecurityDiagnosticsDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionSecurityDiagnosticsDataTypePropertyTree!= null):((sessionSecurityDiagnosticsDataTypePropertyTree == null)||(!sessionSecurityDiagnosticsDataTypePropertyTree.isLeaf())))) {
                        if (_other.sessionSecurityDiagnosticsDataType == null) {
                            this.sessionSecurityDiagnosticsDataType = null;
                        } else {
                            this.sessionSecurityDiagnosticsDataType = new ArrayList<SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>>();
                            for (SessionSecurityDiagnosticsDataType _item: _other.sessionSecurityDiagnosticsDataType) {
                                this.sessionSecurityDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(this, sessionSecurityDiagnosticsDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSessionSecurityDiagnosticsDataType >_P init(final _P _product) {
            if (this.sessionSecurityDiagnosticsDataType!= null) {
                final List<SessionSecurityDiagnosticsDataType> sessionSecurityDiagnosticsDataType = new ArrayList<SessionSecurityDiagnosticsDataType>(this.sessionSecurityDiagnosticsDataType.size());
                for (SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>> _item: this.sessionSecurityDiagnosticsDataType) {
                    sessionSecurityDiagnosticsDataType.add(_item.build());
                }
                _product.sessionSecurityDiagnosticsDataType = sessionSecurityDiagnosticsDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "sessionSecurityDiagnosticsDataType" hinzu.
         * 
         * @param sessionSecurityDiagnosticsDataType
         *     Werte, die zur Eigenschaft "sessionSecurityDiagnosticsDataType" hinzugefügt
         *     werden.
         */
        public ListOfSessionSecurityDiagnosticsDataType.Builder<_B> addSessionSecurityDiagnosticsDataType(final Iterable<? extends SessionSecurityDiagnosticsDataType> sessionSecurityDiagnosticsDataType) {
            if (sessionSecurityDiagnosticsDataType!= null) {
                if (this.sessionSecurityDiagnosticsDataType == null) {
                    this.sessionSecurityDiagnosticsDataType = new ArrayList<SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>>();
                }
                for (SessionSecurityDiagnosticsDataType _item: sessionSecurityDiagnosticsDataType) {
                    this.sessionSecurityDiagnosticsDataType.add(new SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionSecurityDiagnosticsDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param sessionSecurityDiagnosticsDataType
         *     Neuer Wert der Eigenschaft "sessionSecurityDiagnosticsDataType".
         */
        public ListOfSessionSecurityDiagnosticsDataType.Builder<_B> withSessionSecurityDiagnosticsDataType(final Iterable<? extends SessionSecurityDiagnosticsDataType> sessionSecurityDiagnosticsDataType) {
            if (this.sessionSecurityDiagnosticsDataType!= null) {
                this.sessionSecurityDiagnosticsDataType.clear();
            }
            return addSessionSecurityDiagnosticsDataType(sessionSecurityDiagnosticsDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "sessionSecurityDiagnosticsDataType" hinzu.
         * 
         * @param sessionSecurityDiagnosticsDataType
         *     Werte, die zur Eigenschaft "sessionSecurityDiagnosticsDataType" hinzugefügt
         *     werden.
         */
        public ListOfSessionSecurityDiagnosticsDataType.Builder<_B> addSessionSecurityDiagnosticsDataType(SessionSecurityDiagnosticsDataType... sessionSecurityDiagnosticsDataType) {
            addSessionSecurityDiagnosticsDataType(Arrays.asList(sessionSecurityDiagnosticsDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionSecurityDiagnosticsDataType"
         * (Vorher zugewiesener Wert wird ersetzt)
         * 
         * @param sessionSecurityDiagnosticsDataType
         *     Neuer Wert der Eigenschaft "sessionSecurityDiagnosticsDataType".
         */
        public ListOfSessionSecurityDiagnosticsDataType.Builder<_B> withSessionSecurityDiagnosticsDataType(SessionSecurityDiagnosticsDataType... sessionSecurityDiagnosticsDataType) {
            withSessionSecurityDiagnosticsDataType(Arrays.asList(sessionSecurityDiagnosticsDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SessionSecurityDiagnosticsDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SessionSecurityDiagnosticsDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SessionSecurityDiagnosticsDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SessionSecurityDiagnosticsDataType.Builder<? extends ListOfSessionSecurityDiagnosticsDataType.Builder<_B>> addSessionSecurityDiagnosticsDataType() {
            if (this.sessionSecurityDiagnosticsDataType == null) {
                this.sessionSecurityDiagnosticsDataType = new ArrayList<SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>>();
            }
            final SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>> sessionSecurityDiagnosticsDataType_Builder = new SessionSecurityDiagnosticsDataType.Builder<ListOfSessionSecurityDiagnosticsDataType.Builder<_B>>(this, null, false);
            this.sessionSecurityDiagnosticsDataType.add(sessionSecurityDiagnosticsDataType_Builder);
            return sessionSecurityDiagnosticsDataType_Builder;
        }

        @Override
        public ListOfSessionSecurityDiagnosticsDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfSessionSecurityDiagnosticsDataType());
            } else {
                return ((ListOfSessionSecurityDiagnosticsDataType) _storedValue);
            }
        }

        public ListOfSessionSecurityDiagnosticsDataType.Builder<_B> copyOf(final ListOfSessionSecurityDiagnosticsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSessionSecurityDiagnosticsDataType.Builder<_B> copyOf(final ListOfSessionSecurityDiagnosticsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSessionSecurityDiagnosticsDataType.Selector<ListOfSessionSecurityDiagnosticsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSessionSecurityDiagnosticsDataType.Select _root() {
            return new ListOfSessionSecurityDiagnosticsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SessionSecurityDiagnosticsDataType.Selector<TRoot, ListOfSessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> sessionSecurityDiagnosticsDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.sessionSecurityDiagnosticsDataType!= null) {
                products.put("sessionSecurityDiagnosticsDataType", this.sessionSecurityDiagnosticsDataType.init());
            }
            return products;
        }

        public SessionSecurityDiagnosticsDataType.Selector<TRoot, ListOfSessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>> sessionSecurityDiagnosticsDataType() {
            return ((this.sessionSecurityDiagnosticsDataType == null)?this.sessionSecurityDiagnosticsDataType = new SessionSecurityDiagnosticsDataType.Selector<TRoot, ListOfSessionSecurityDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "sessionSecurityDiagnosticsDataType"):this.sessionSecurityDiagnosticsDataType);
        }

    }

}
