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
 * <p>Java-Klasse für ListOfUserTokenPolicy complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfUserTokenPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserTokenPolicy" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}UserTokenPolicy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUserTokenPolicy", propOrder = {
    "userTokenPolicy"
})
public class ListOfUserTokenPolicy {

    @XmlElement(name = "UserTokenPolicy", nillable = true)
    protected List<UserTokenPolicy> userTokenPolicy;

    /**
     * Gets the value of the userTokenPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userTokenPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserTokenPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserTokenPolicy }
     * 
     * 
     */
    public List<UserTokenPolicy> getUserTokenPolicy() {
        if (userTokenPolicy == null) {
            userTokenPolicy = new ArrayList<UserTokenPolicy>();
        }
        return this.userTokenPolicy;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfUserTokenPolicy.Builder<_B> _other) {
        if (this.userTokenPolicy == null) {
            _other.userTokenPolicy = null;
        } else {
            _other.userTokenPolicy = new ArrayList<UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>>();
            for (UserTokenPolicy _item: this.userTokenPolicy) {
                _other.userTokenPolicy.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfUserTokenPolicy.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfUserTokenPolicy.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfUserTokenPolicy.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfUserTokenPolicy.Builder<Void> builder() {
        return new ListOfUserTokenPolicy.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfUserTokenPolicy.Builder<_B> copyOf(final ListOfUserTokenPolicy _other) {
        final ListOfUserTokenPolicy.Builder<_B> _newBuilder = new ListOfUserTokenPolicy.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfUserTokenPolicy.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree userTokenPolicyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userTokenPolicy"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userTokenPolicyPropertyTree!= null):((userTokenPolicyPropertyTree == null)||(!userTokenPolicyPropertyTree.isLeaf())))) {
            if (this.userTokenPolicy == null) {
                _other.userTokenPolicy = null;
            } else {
                _other.userTokenPolicy = new ArrayList<UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>>();
                for (UserTokenPolicy _item: this.userTokenPolicy) {
                    _other.userTokenPolicy.add(((_item == null)?null:_item.newCopyBuilder(_other, userTokenPolicyPropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfUserTokenPolicy.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfUserTokenPolicy.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfUserTokenPolicy.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfUserTokenPolicy.Builder<_B> copyOf(final ListOfUserTokenPolicy _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfUserTokenPolicy.Builder<_B> _newBuilder = new ListOfUserTokenPolicy.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfUserTokenPolicy.Builder<Void> copyExcept(final ListOfUserTokenPolicy _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfUserTokenPolicy.Builder<Void> copyOnly(final ListOfUserTokenPolicy _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfUserTokenPolicy _storedValue;
        private List<UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>> userTokenPolicy;

        public Builder(final _B _parentBuilder, final ListOfUserTokenPolicy _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.userTokenPolicy == null) {
                        this.userTokenPolicy = null;
                    } else {
                        this.userTokenPolicy = new ArrayList<UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>>();
                        for (UserTokenPolicy _item: _other.userTokenPolicy) {
                            this.userTokenPolicy.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfUserTokenPolicy _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree userTokenPolicyPropertyTree = ((_propertyTree == null)?null:_propertyTree.get("userTokenPolicy"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(userTokenPolicyPropertyTree!= null):((userTokenPolicyPropertyTree == null)||(!userTokenPolicyPropertyTree.isLeaf())))) {
                        if (_other.userTokenPolicy == null) {
                            this.userTokenPolicy = null;
                        } else {
                            this.userTokenPolicy = new ArrayList<UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>>();
                            for (UserTokenPolicy _item: _other.userTokenPolicy) {
                                this.userTokenPolicy.add(((_item == null)?null:_item.newCopyBuilder(this, userTokenPolicyPropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfUserTokenPolicy >_P init(final _P _product) {
            if (this.userTokenPolicy!= null) {
                final List<UserTokenPolicy> userTokenPolicy = new ArrayList<UserTokenPolicy>(this.userTokenPolicy.size());
                for (UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>> _item: this.userTokenPolicy) {
                    userTokenPolicy.add(_item.build());
                }
                _product.userTokenPolicy = userTokenPolicy;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "userTokenPolicy" hinzu.
         * 
         * @param userTokenPolicy
         *     Werte, die zur Eigenschaft "userTokenPolicy" hinzugefügt werden.
         */
        public ListOfUserTokenPolicy.Builder<_B> addUserTokenPolicy(final Iterable<? extends UserTokenPolicy> userTokenPolicy) {
            if (userTokenPolicy!= null) {
                if (this.userTokenPolicy == null) {
                    this.userTokenPolicy = new ArrayList<UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>>();
                }
                for (UserTokenPolicy _item: userTokenPolicy) {
                    this.userTokenPolicy.add(new UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userTokenPolicy" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userTokenPolicy
         *     Neuer Wert der Eigenschaft "userTokenPolicy".
         */
        public ListOfUserTokenPolicy.Builder<_B> withUserTokenPolicy(final Iterable<? extends UserTokenPolicy> userTokenPolicy) {
            if (this.userTokenPolicy!= null) {
                this.userTokenPolicy.clear();
            }
            return addUserTokenPolicy(userTokenPolicy);
        }

        /**
         * Fügt Werte zur Eigenschaft "userTokenPolicy" hinzu.
         * 
         * @param userTokenPolicy
         *     Werte, die zur Eigenschaft "userTokenPolicy" hinzugefügt werden.
         */
        public ListOfUserTokenPolicy.Builder<_B> addUserTokenPolicy(UserTokenPolicy... userTokenPolicy) {
            addUserTokenPolicy(Arrays.asList(userTokenPolicy));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "userTokenPolicy" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param userTokenPolicy
         *     Neuer Wert der Eigenschaft "userTokenPolicy".
         */
        public ListOfUserTokenPolicy.Builder<_B> withUserTokenPolicy(UserTokenPolicy... userTokenPolicy) {
            withUserTokenPolicy(Arrays.asList(userTokenPolicy));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "UserTokenPolicy".
         * Mit {@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "UserTokenPolicy".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.UserTokenPolicy.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public UserTokenPolicy.Builder<? extends ListOfUserTokenPolicy.Builder<_B>> addUserTokenPolicy() {
            if (this.userTokenPolicy == null) {
                this.userTokenPolicy = new ArrayList<UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>>();
            }
            final UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>> userTokenPolicy_Builder = new UserTokenPolicy.Builder<ListOfUserTokenPolicy.Builder<_B>>(this, null, false);
            this.userTokenPolicy.add(userTokenPolicy_Builder);
            return userTokenPolicy_Builder;
        }

        @Override
        public ListOfUserTokenPolicy build() {
            if (_storedValue == null) {
                return this.init(new ListOfUserTokenPolicy());
            } else {
                return ((ListOfUserTokenPolicy) _storedValue);
            }
        }

        public ListOfUserTokenPolicy.Builder<_B> copyOf(final ListOfUserTokenPolicy _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfUserTokenPolicy.Builder<_B> copyOf(final ListOfUserTokenPolicy.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfUserTokenPolicy.Selector<ListOfUserTokenPolicy.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfUserTokenPolicy.Select _root() {
            return new ListOfUserTokenPolicy.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private UserTokenPolicy.Selector<TRoot, ListOfUserTokenPolicy.Selector<TRoot, TParent>> userTokenPolicy = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.userTokenPolicy!= null) {
                products.put("userTokenPolicy", this.userTokenPolicy.init());
            }
            return products;
        }

        public UserTokenPolicy.Selector<TRoot, ListOfUserTokenPolicy.Selector<TRoot, TParent>> userTokenPolicy() {
            return ((this.userTokenPolicy == null)?this.userTokenPolicy = new UserTokenPolicy.Selector<TRoot, ListOfUserTokenPolicy.Selector<TRoot, TParent>>(this._root, this, "userTokenPolicy"):this.userTokenPolicy);
        }

    }

}
