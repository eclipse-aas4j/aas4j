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
 * <p>Java-Klasse für ListOfSignedSoftwareCertificate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfSignedSoftwareCertificate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignedSoftwareCertificate" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}SignedSoftwareCertificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSignedSoftwareCertificate", propOrder = {
    "signedSoftwareCertificate"
})
public class ListOfSignedSoftwareCertificate {

    @XmlElement(name = "SignedSoftwareCertificate", nillable = true)
    protected List<SignedSoftwareCertificate> signedSoftwareCertificate;

    /**
     * Gets the value of the signedSoftwareCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedSoftwareCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignedSoftwareCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignedSoftwareCertificate }
     * 
     * 
     */
    public List<SignedSoftwareCertificate> getSignedSoftwareCertificate() {
        if (signedSoftwareCertificate == null) {
            signedSoftwareCertificate = new ArrayList<SignedSoftwareCertificate>();
        }
        return this.signedSoftwareCertificate;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfSignedSoftwareCertificate.Builder<_B> _other) {
        if (this.signedSoftwareCertificate == null) {
            _other.signedSoftwareCertificate = null;
        } else {
            _other.signedSoftwareCertificate = new ArrayList<SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>>();
            for (SignedSoftwareCertificate _item: this.signedSoftwareCertificate) {
                _other.signedSoftwareCertificate.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfSignedSoftwareCertificate.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfSignedSoftwareCertificate.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfSignedSoftwareCertificate.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfSignedSoftwareCertificate.Builder<Void> builder() {
        return new ListOfSignedSoftwareCertificate.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfSignedSoftwareCertificate.Builder<_B> copyOf(final ListOfSignedSoftwareCertificate _other) {
        final ListOfSignedSoftwareCertificate.Builder<_B> _newBuilder = new ListOfSignedSoftwareCertificate.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfSignedSoftwareCertificate.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree signedSoftwareCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("signedSoftwareCertificate"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(signedSoftwareCertificatePropertyTree!= null):((signedSoftwareCertificatePropertyTree == null)||(!signedSoftwareCertificatePropertyTree.isLeaf())))) {
            if (this.signedSoftwareCertificate == null) {
                _other.signedSoftwareCertificate = null;
            } else {
                _other.signedSoftwareCertificate = new ArrayList<SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>>();
                for (SignedSoftwareCertificate _item: this.signedSoftwareCertificate) {
                    _other.signedSoftwareCertificate.add(((_item == null)?null:_item.newCopyBuilder(_other, signedSoftwareCertificatePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfSignedSoftwareCertificate.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfSignedSoftwareCertificate.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfSignedSoftwareCertificate.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfSignedSoftwareCertificate.Builder<_B> copyOf(final ListOfSignedSoftwareCertificate _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfSignedSoftwareCertificate.Builder<_B> _newBuilder = new ListOfSignedSoftwareCertificate.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfSignedSoftwareCertificate.Builder<Void> copyExcept(final ListOfSignedSoftwareCertificate _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfSignedSoftwareCertificate.Builder<Void> copyOnly(final ListOfSignedSoftwareCertificate _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfSignedSoftwareCertificate _storedValue;
        private List<SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>> signedSoftwareCertificate;

        public Builder(final _B _parentBuilder, final ListOfSignedSoftwareCertificate _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.signedSoftwareCertificate == null) {
                        this.signedSoftwareCertificate = null;
                    } else {
                        this.signedSoftwareCertificate = new ArrayList<SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>>();
                        for (SignedSoftwareCertificate _item: _other.signedSoftwareCertificate) {
                            this.signedSoftwareCertificate.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfSignedSoftwareCertificate _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree signedSoftwareCertificatePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("signedSoftwareCertificate"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(signedSoftwareCertificatePropertyTree!= null):((signedSoftwareCertificatePropertyTree == null)||(!signedSoftwareCertificatePropertyTree.isLeaf())))) {
                        if (_other.signedSoftwareCertificate == null) {
                            this.signedSoftwareCertificate = null;
                        } else {
                            this.signedSoftwareCertificate = new ArrayList<SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>>();
                            for (SignedSoftwareCertificate _item: _other.signedSoftwareCertificate) {
                                this.signedSoftwareCertificate.add(((_item == null)?null:_item.newCopyBuilder(this, signedSoftwareCertificatePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfSignedSoftwareCertificate >_P init(final _P _product) {
            if (this.signedSoftwareCertificate!= null) {
                final List<SignedSoftwareCertificate> signedSoftwareCertificate = new ArrayList<SignedSoftwareCertificate>(this.signedSoftwareCertificate.size());
                for (SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>> _item: this.signedSoftwareCertificate) {
                    signedSoftwareCertificate.add(_item.build());
                }
                _product.signedSoftwareCertificate = signedSoftwareCertificate;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "signedSoftwareCertificate" hinzu.
         * 
         * @param signedSoftwareCertificate
         *     Werte, die zur Eigenschaft "signedSoftwareCertificate" hinzugefügt werden.
         */
        public ListOfSignedSoftwareCertificate.Builder<_B> addSignedSoftwareCertificate(final Iterable<? extends SignedSoftwareCertificate> signedSoftwareCertificate) {
            if (signedSoftwareCertificate!= null) {
                if (this.signedSoftwareCertificate == null) {
                    this.signedSoftwareCertificate = new ArrayList<SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>>();
                }
                for (SignedSoftwareCertificate _item: signedSoftwareCertificate) {
                    this.signedSoftwareCertificate.add(new SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "signedSoftwareCertificate" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param signedSoftwareCertificate
         *     Neuer Wert der Eigenschaft "signedSoftwareCertificate".
         */
        public ListOfSignedSoftwareCertificate.Builder<_B> withSignedSoftwareCertificate(final Iterable<? extends SignedSoftwareCertificate> signedSoftwareCertificate) {
            if (this.signedSoftwareCertificate!= null) {
                this.signedSoftwareCertificate.clear();
            }
            return addSignedSoftwareCertificate(signedSoftwareCertificate);
        }

        /**
         * Fügt Werte zur Eigenschaft "signedSoftwareCertificate" hinzu.
         * 
         * @param signedSoftwareCertificate
         *     Werte, die zur Eigenschaft "signedSoftwareCertificate" hinzugefügt werden.
         */
        public ListOfSignedSoftwareCertificate.Builder<_B> addSignedSoftwareCertificate(SignedSoftwareCertificate... signedSoftwareCertificate) {
            addSignedSoftwareCertificate(Arrays.asList(signedSoftwareCertificate));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "signedSoftwareCertificate" (Vorher
         * zugewiesener Wert wird ersetzt)
         * 
         * @param signedSoftwareCertificate
         *     Neuer Wert der Eigenschaft "signedSoftwareCertificate".
         */
        public ListOfSignedSoftwareCertificate.Builder<_B> withSignedSoftwareCertificate(SignedSoftwareCertificate... signedSoftwareCertificate) {
            withSignedSoftwareCertificate(Arrays.asList(signedSoftwareCertificate));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "SignedSoftwareCertificate".
         * Mit {@link
         * org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate.Builder#end()}
         * geht es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "SignedSoftwareCertificate".
         *     Mit {@link
         *     org.opcfoundation.ua._2008._02.types.SignedSoftwareCertificate.Builder#end()}
         *     geht es zurück zum aktuellen Builder.
         */
        public SignedSoftwareCertificate.Builder<? extends ListOfSignedSoftwareCertificate.Builder<_B>> addSignedSoftwareCertificate() {
            if (this.signedSoftwareCertificate == null) {
                this.signedSoftwareCertificate = new ArrayList<SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>>();
            }
            final SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>> signedSoftwareCertificate_Builder = new SignedSoftwareCertificate.Builder<ListOfSignedSoftwareCertificate.Builder<_B>>(this, null, false);
            this.signedSoftwareCertificate.add(signedSoftwareCertificate_Builder);
            return signedSoftwareCertificate_Builder;
        }

        @Override
        public ListOfSignedSoftwareCertificate build() {
            if (_storedValue == null) {
                return this.init(new ListOfSignedSoftwareCertificate());
            } else {
                return ((ListOfSignedSoftwareCertificate) _storedValue);
            }
        }

        public ListOfSignedSoftwareCertificate.Builder<_B> copyOf(final ListOfSignedSoftwareCertificate _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfSignedSoftwareCertificate.Builder<_B> copyOf(final ListOfSignedSoftwareCertificate.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfSignedSoftwareCertificate.Selector<ListOfSignedSoftwareCertificate.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfSignedSoftwareCertificate.Select _root() {
            return new ListOfSignedSoftwareCertificate.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private SignedSoftwareCertificate.Selector<TRoot, ListOfSignedSoftwareCertificate.Selector<TRoot, TParent>> signedSoftwareCertificate = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.signedSoftwareCertificate!= null) {
                products.put("signedSoftwareCertificate", this.signedSoftwareCertificate.init());
            }
            return products;
        }

        public SignedSoftwareCertificate.Selector<TRoot, ListOfSignedSoftwareCertificate.Selector<TRoot, TParent>> signedSoftwareCertificate() {
            return ((this.signedSoftwareCertificate == null)?this.signedSoftwareCertificate = new SignedSoftwareCertificate.Selector<TRoot, ListOfSignedSoftwareCertificate.Selector<TRoot, TParent>>(this._root, this, "signedSoftwareCertificate"):this.signedSoftwareCertificate);
        }

    }

}
