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
 * <p>Java-Klasse für ListOfSessionDiagnosticsDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSessionDiagnosticsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionDiagnosticsDataType" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SessionDiagnosticsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSessionDiagnosticsDataType", propOrder = {
    "sessionDiagnosticsDataType"
})
public class ListOfSessionDiagnosticsDataType {

    @XmlElement(name = "SessionDiagnosticsDataType", nillable = true)
    protected List<SessionDiagnosticsDataType> sessionDiagnosticsDataType;

    /**
     * Gets the value of the sessionDiagnosticsDataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessionDiagnosticsDataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessionDiagnosticsDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SessionDiagnosticsDataType }
     * 
     * 
     */
    public List<SessionDiagnosticsDataType> getSessionDiagnosticsDataType() {
        if (sessionDiagnosticsDataType == null) {
            sessionDiagnosticsDataType = new ArrayList<SessionDiagnosticsDataType>();
        }
        return this.sessionDiagnosticsDataType;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSessionDiagnosticsDataType.Builder<_B> _other) {
        if (this.sessionDiagnosticsDataType == null) {
            _other.sessionDiagnosticsDataType = null;
        } else {
            _other.sessionDiagnosticsDataType = new ArrayList<SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>>();
            for (SessionDiagnosticsDataType _item: this.sessionDiagnosticsDataType) {
                _other.sessionDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSessionDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSessionDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSessionDiagnosticsDataType.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSessionDiagnosticsDataType.Builder<Void> builder() {
        return new ListOfSessionDiagnosticsDataType.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSessionDiagnosticsDataType.Builder<_B> copyOf(final ListOfSessionDiagnosticsDataType _other) {
        final ListOfSessionDiagnosticsDataType.Builder<_B> _newBuilder = new ListOfSessionDiagnosticsDataType.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSessionDiagnosticsDataType.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree sessionDiagnosticsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionDiagnosticsDataType"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionDiagnosticsDataTypePropertyTree!= null):((sessionDiagnosticsDataTypePropertyTree == null)||(!sessionDiagnosticsDataTypePropertyTree.isLeaf())))) {
            if (this.sessionDiagnosticsDataType == null) {
                _other.sessionDiagnosticsDataType = null;
            } else {
                _other.sessionDiagnosticsDataType = new ArrayList<SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>>();
                for (SessionDiagnosticsDataType _item: this.sessionDiagnosticsDataType) {
                    _other.sessionDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(_other, sessionDiagnosticsDataTypePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSessionDiagnosticsDataType.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSessionDiagnosticsDataType.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSessionDiagnosticsDataType.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSessionDiagnosticsDataType.Builder<_B> copyOf(final ListOfSessionDiagnosticsDataType _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSessionDiagnosticsDataType.Builder<_B> _newBuilder = new ListOfSessionDiagnosticsDataType.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSessionDiagnosticsDataType.Builder<Void> copyExcept(final ListOfSessionDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSessionDiagnosticsDataType.Builder<Void> copyOnly(final ListOfSessionDiagnosticsDataType _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSessionDiagnosticsDataType _storedValue;
        private List<SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>> sessionDiagnosticsDataType;

        public Builder(final _B _parentBuilder, final ListOfSessionDiagnosticsDataType _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.sessionDiagnosticsDataType == null) {
                        this.sessionDiagnosticsDataType = null;
                    } else {
                        this.sessionDiagnosticsDataType = new ArrayList<SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>>();
                        for (SessionDiagnosticsDataType _item: _other.sessionDiagnosticsDataType) {
                            this.sessionDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSessionDiagnosticsDataType _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree sessionDiagnosticsDataTypePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("sessionDiagnosticsDataType"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(sessionDiagnosticsDataTypePropertyTree!= null):((sessionDiagnosticsDataTypePropertyTree == null)||(!sessionDiagnosticsDataTypePropertyTree.isLeaf())))) {
                        if (_other.sessionDiagnosticsDataType == null) {
                            this.sessionDiagnosticsDataType = null;
                        } else {
                            this.sessionDiagnosticsDataType = new ArrayList<SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>>();
                            for (SessionDiagnosticsDataType _item: _other.sessionDiagnosticsDataType) {
                                this.sessionDiagnosticsDataType.add(((_item == null)?null:_item.newCopyBuilder(this, sessionDiagnosticsDataTypePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSessionDiagnosticsDataType >_P init(final _P _product) {
            if (this.sessionDiagnosticsDataType!= null) {
                final List<SessionDiagnosticsDataType> sessionDiagnosticsDataType = new ArrayList<SessionDiagnosticsDataType>(this.sessionDiagnosticsDataType.size());
                for (SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>> _item: this.sessionDiagnosticsDataType) {
                    sessionDiagnosticsDataType.add(_item.build());
                }
                _product.sessionDiagnosticsDataType = sessionDiagnosticsDataType;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "sessionDiagnosticsDataType" hinzu.
         * 
         * @param sessionDiagnosticsDataType
         *     Werte, die zur Eigenschaft "sessionDiagnosticsDataType" hinzugefügt werden.
         */
        public ListOfSessionDiagnosticsDataType.Builder<_B> addSessionDiagnosticsDataType(final Iterable<? extends SessionDiagnosticsDataType> sessionDiagnosticsDataType) {
            if (sessionDiagnosticsDataType!= null) {
                if (this.sessionDiagnosticsDataType == null) {
                    this.sessionDiagnosticsDataType = new ArrayList<SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>>();
                }
                for (SessionDiagnosticsDataType _item: sessionDiagnosticsDataType) {
                    this.sessionDiagnosticsDataType.add(new SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionDiagnosticsDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param sessionDiagnosticsDataType
         *     Neuer Wert der Eigenschaft "sessionDiagnosticsDataType".
         */
        public ListOfSessionDiagnosticsDataType.Builder<_B> withSessionDiagnosticsDataType(final Iterable<? extends SessionDiagnosticsDataType> sessionDiagnosticsDataType) {
            if (this.sessionDiagnosticsDataType!= null) {
                this.sessionDiagnosticsDataType.clear();
            }
            return addSessionDiagnosticsDataType(sessionDiagnosticsDataType);
        }

        /**
         * Fügt Werte zur Eigenschaft "sessionDiagnosticsDataType" hinzu.
         * 
         * @param sessionDiagnosticsDataType
         *     Werte, die zur Eigenschaft "sessionDiagnosticsDataType" hinzugefügt werden.
         */
        public ListOfSessionDiagnosticsDataType.Builder<_B> addSessionDiagnosticsDataType(SessionDiagnosticsDataType... sessionDiagnosticsDataType) {
            addSessionDiagnosticsDataType(Arrays.asList(sessionDiagnosticsDataType));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "sessionDiagnosticsDataType" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param sessionDiagnosticsDataType
         *     Neuer Wert der Eigenschaft "sessionDiagnosticsDataType".
         */
        public ListOfSessionDiagnosticsDataType.Builder<_B> withSessionDiagnosticsDataType(SessionDiagnosticsDataType... sessionDiagnosticsDataType) {
            withSessionDiagnosticsDataType(Arrays.asList(sessionDiagnosticsDataType));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SessionDiagnosticsDataType".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SessionDiagnosticsDataType".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SessionDiagnosticsDataType.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SessionDiagnosticsDataType.Builder<? extends ListOfSessionDiagnosticsDataType.Builder<_B>> addSessionDiagnosticsDataType() {
            if (this.sessionDiagnosticsDataType == null) {
                this.sessionDiagnosticsDataType = new ArrayList<SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>>();
            }
            final SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>> sessionDiagnosticsDataType_Builder = new SessionDiagnosticsDataType.Builder<ListOfSessionDiagnosticsDataType.Builder<_B>>(this, null, false);
            this.sessionDiagnosticsDataType.add(sessionDiagnosticsDataType_Builder);
            return sessionDiagnosticsDataType_Builder;
        }

        @Override
        public ListOfSessionDiagnosticsDataType build() {
            if (_storedValue == null) {
                return this.init(new ListOfSessionDiagnosticsDataType());
            } else {
                return ((ListOfSessionDiagnosticsDataType) _storedValue);
            }
        }

        public ListOfSessionDiagnosticsDataType.Builder<_B> copyOf(final ListOfSessionDiagnosticsDataType _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSessionDiagnosticsDataType.Builder<_B> copyOf(final ListOfSessionDiagnosticsDataType.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSessionDiagnosticsDataType.Selector<ListOfSessionDiagnosticsDataType.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSessionDiagnosticsDataType.Select _root() {
            return new ListOfSessionDiagnosticsDataType.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SessionDiagnosticsDataType.Selector<TRoot, ListOfSessionDiagnosticsDataType.Selector<TRoot, TParent>> sessionDiagnosticsDataType = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.sessionDiagnosticsDataType!= null) {
                products.put("sessionDiagnosticsDataType", this.sessionDiagnosticsDataType.init());
            }
            return products;
        }

        public SessionDiagnosticsDataType.Selector<TRoot, ListOfSessionDiagnosticsDataType.Selector<TRoot, TParent>> sessionDiagnosticsDataType() {
            return ((this.sessionDiagnosticsDataType == null)?this.sessionDiagnosticsDataType = new SessionDiagnosticsDataType.Selector<TRoot, ListOfSessionDiagnosticsDataType.Selector<TRoot, TParent>>(this._root, this, "sessionDiagnosticsDataType"):this.sessionDiagnosticsDataType);
        }

    }

}
