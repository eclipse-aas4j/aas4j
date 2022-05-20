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
 * <p>Java-Klasse für ListOfThreeDFrame complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfThreeDFrame"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ThreeDFrame" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}ThreeDFrame" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfThreeDFrame", propOrder = {
    "threeDFrame"
})
public class ListOfThreeDFrame {

    @XmlElement(name = "ThreeDFrame", nillable = true)
    protected List<ThreeDFrame> threeDFrame;

    /**
     * Gets the value of the threeDFrame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threeDFrame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreeDFrame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThreeDFrame }
     * 
     * 
     */
    public List<ThreeDFrame> getThreeDFrame() {
        if (threeDFrame == null) {
            threeDFrame = new ArrayList<ThreeDFrame>();
        }
        return this.threeDFrame;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfThreeDFrame.Builder<_B> _other) {
        if (this.threeDFrame == null) {
            _other.threeDFrame = null;
        } else {
            _other.threeDFrame = new ArrayList<ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>>();
            for (ThreeDFrame _item: this.threeDFrame) {
                _other.threeDFrame.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfThreeDFrame.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfThreeDFrame.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfThreeDFrame.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfThreeDFrame.Builder<Void> builder() {
        return new ListOfThreeDFrame.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfThreeDFrame.Builder<_B> copyOf(final ListOfThreeDFrame _other) {
        final ListOfThreeDFrame.Builder<_B> _newBuilder = new ListOfThreeDFrame.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfThreeDFrame.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree threeDFramePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("threeDFrame"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(threeDFramePropertyTree!= null):((threeDFramePropertyTree == null)||(!threeDFramePropertyTree.isLeaf())))) {
            if (this.threeDFrame == null) {
                _other.threeDFrame = null;
            } else {
                _other.threeDFrame = new ArrayList<ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>>();
                for (ThreeDFrame _item: this.threeDFrame) {
                    _other.threeDFrame.add(((_item == null)?null:_item.newCopyBuilder(_other, threeDFramePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfThreeDFrame.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfThreeDFrame.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfThreeDFrame.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfThreeDFrame.Builder<_B> copyOf(final ListOfThreeDFrame _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfThreeDFrame.Builder<_B> _newBuilder = new ListOfThreeDFrame.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfThreeDFrame.Builder<Void> copyExcept(final ListOfThreeDFrame _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfThreeDFrame.Builder<Void> copyOnly(final ListOfThreeDFrame _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfThreeDFrame _storedValue;
        private List<ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>> threeDFrame;

        public Builder(final _B _parentBuilder, final ListOfThreeDFrame _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.threeDFrame == null) {
                        this.threeDFrame = null;
                    } else {
                        this.threeDFrame = new ArrayList<ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>>();
                        for (ThreeDFrame _item: _other.threeDFrame) {
                            this.threeDFrame.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfThreeDFrame _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree threeDFramePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("threeDFrame"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(threeDFramePropertyTree!= null):((threeDFramePropertyTree == null)||(!threeDFramePropertyTree.isLeaf())))) {
                        if (_other.threeDFrame == null) {
                            this.threeDFrame = null;
                        } else {
                            this.threeDFrame = new ArrayList<ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>>();
                            for (ThreeDFrame _item: _other.threeDFrame) {
                                this.threeDFrame.add(((_item == null)?null:_item.newCopyBuilder(this, threeDFramePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfThreeDFrame >_P init(final _P _product) {
            if (this.threeDFrame!= null) {
                final List<ThreeDFrame> threeDFrame = new ArrayList<ThreeDFrame>(this.threeDFrame.size());
                for (ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>> _item: this.threeDFrame) {
                    threeDFrame.add(_item.build());
                }
                _product.threeDFrame = threeDFrame;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "threeDFrame" hinzu.
         * 
         * @param threeDFrame
         *     Werte, die zur Eigenschaft "threeDFrame" hinzugefügt werden.
         */
        public ListOfThreeDFrame.Builder<_B> addThreeDFrame(final Iterable<? extends ThreeDFrame> threeDFrame) {
            if (threeDFrame!= null) {
                if (this.threeDFrame == null) {
                    this.threeDFrame = new ArrayList<ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>>();
                }
                for (ThreeDFrame _item: threeDFrame) {
                    this.threeDFrame.add(new ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "threeDFrame" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param threeDFrame
         *     Neuer Wert der Eigenschaft "threeDFrame".
         */
        public ListOfThreeDFrame.Builder<_B> withThreeDFrame(final Iterable<? extends ThreeDFrame> threeDFrame) {
            if (this.threeDFrame!= null) {
                this.threeDFrame.clear();
            }
            return addThreeDFrame(threeDFrame);
        }

        /**
         * Fügt Werte zur Eigenschaft "threeDFrame" hinzu.
         * 
         * @param threeDFrame
         *     Werte, die zur Eigenschaft "threeDFrame" hinzugefügt werden.
         */
        public ListOfThreeDFrame.Builder<_B> addThreeDFrame(ThreeDFrame... threeDFrame) {
            addThreeDFrame(Arrays.asList(threeDFrame));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "threeDFrame" (Vorher zugewiesener Wert
         * wird ersetzt)
         * 
         * @param threeDFrame
         *     Neuer Wert der Eigenschaft "threeDFrame".
         */
        public ListOfThreeDFrame.Builder<_B> withThreeDFrame(ThreeDFrame... threeDFrame) {
            withThreeDFrame(Arrays.asList(threeDFrame));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "ThreeDFrame".
         * Mit {@link org.opcfoundation.ua._2008._02.types.ThreeDFrame.Builder#end()} geht
         * es zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "ThreeDFrame".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.ThreeDFrame.Builder#end()} geht
         *     es zurück zum aktuellen Builder.
         */
        public ThreeDFrame.Builder<? extends ListOfThreeDFrame.Builder<_B>> addThreeDFrame() {
            if (this.threeDFrame == null) {
                this.threeDFrame = new ArrayList<ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>>();
            }
            final ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>> threeDFrame_Builder = new ThreeDFrame.Builder<ListOfThreeDFrame.Builder<_B>>(this, null, false);
            this.threeDFrame.add(threeDFrame_Builder);
            return threeDFrame_Builder;
        }

        @Override
        public ListOfThreeDFrame build() {
            if (_storedValue == null) {
                return this.init(new ListOfThreeDFrame());
            } else {
                return ((ListOfThreeDFrame) _storedValue);
            }
        }

        public ListOfThreeDFrame.Builder<_B> copyOf(final ListOfThreeDFrame _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfThreeDFrame.Builder<_B> copyOf(final ListOfThreeDFrame.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfThreeDFrame.Selector<ListOfThreeDFrame.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfThreeDFrame.Select _root() {
            return new ListOfThreeDFrame.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private ThreeDFrame.Selector<TRoot, ListOfThreeDFrame.Selector<TRoot, TParent>> threeDFrame = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.threeDFrame!= null) {
                products.put("threeDFrame", this.threeDFrame.init());
            }
            return products;
        }

        public ThreeDFrame.Selector<TRoot, ListOfThreeDFrame.Selector<TRoot, TParent>> threeDFrame() {
            return ((this.threeDFrame == null)?this.threeDFrame = new ThreeDFrame.Selector<TRoot, ListOfThreeDFrame.Selector<TRoot, TParent>>(this._root, this, "threeDFrame"):this.threeDFrame);
        }

    }

}
