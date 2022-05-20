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
 * <p>Java-Klasse für ListOfFrame complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListOfFrame"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Frame" type="{http://opcfoundation.org/UA/2008/02/Types.xsd}Frame" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfFrame", propOrder = {
    "frame"
})
public class ListOfFrame {

    @XmlElement(name = "Frame", nillable = true)
    protected List<Frame> frame;

    /**
     * Gets the value of the frame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Frame }
     * 
     * 
     */
    public List<Frame> getFrame() {
        if (frame == null) {
            frame = new ArrayList<Frame>();
        }
        return this.frame;
    }

    /**
     * Copies all state of this object to a builder. This method is used by the {@link
     * #copyOf} method and should not be called directly by client code.
     * 
     * @param _other
     *     A builder instance to which the state of this object will be copied.
     */
    public<_B >void copyTo(final ListOfFrame.Builder<_B> _other) {
        if (this.frame == null) {
            _other.frame = null;
        } else {
            _other.frame = new ArrayList<Frame.Builder<ListOfFrame.Builder<_B>>>();
            for (Frame _item: this.frame) {
                _other.frame.add(((_item == null)?null:_item.newCopyBuilder(_other)));
            }
        }
    }

    public<_B >ListOfFrame.Builder<_B> newCopyBuilder(final _B _parentBuilder) {
        return new ListOfFrame.Builder<_B>(_parentBuilder, this, true);
    }

    public ListOfFrame.Builder<Void> newCopyBuilder() {
        return newCopyBuilder(null);
    }

    public static ListOfFrame.Builder<Void> builder() {
        return new ListOfFrame.Builder<Void>(null, null, false);
    }

    public static<_B >ListOfFrame.Builder<_B> copyOf(final ListOfFrame _other) {
        final ListOfFrame.Builder<_B> _newBuilder = new ListOfFrame.Builder<_B>(null, null, false);
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
    public<_B >void copyTo(final ListOfFrame.Builder<_B> _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final PropertyTree framePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("frame"));
        if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(framePropertyTree!= null):((framePropertyTree == null)||(!framePropertyTree.isLeaf())))) {
            if (this.frame == null) {
                _other.frame = null;
            } else {
                _other.frame = new ArrayList<Frame.Builder<ListOfFrame.Builder<_B>>>();
                for (Frame _item: this.frame) {
                    _other.frame.add(((_item == null)?null:_item.newCopyBuilder(_other, framePropertyTree, _propertyTreeUse)));
                }
            }
        }
    }

    public<_B >ListOfFrame.Builder<_B> newCopyBuilder(final _B _parentBuilder, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return new ListOfFrame.Builder<_B>(_parentBuilder, this, true, _propertyTree, _propertyTreeUse);
    }

    public ListOfFrame.Builder<Void> newCopyBuilder(final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        return newCopyBuilder(null, _propertyTree, _propertyTreeUse);
    }

    public static<_B >ListOfFrame.Builder<_B> copyOf(final ListOfFrame _other, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
        final ListOfFrame.Builder<_B> _newBuilder = new ListOfFrame.Builder<_B>(null, null, false);
        _other.copyTo(_newBuilder, _propertyTree, _propertyTreeUse);
        return _newBuilder;
    }

    public static ListOfFrame.Builder<Void> copyExcept(final ListOfFrame _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.EXCLUDE);
    }

    public static ListOfFrame.Builder<Void> copyOnly(final ListOfFrame _other, final PropertyTree _propertyTree) {
        return copyOf(_other, _propertyTree, PropertyTreeUse.INCLUDE);
    }

    public static class Builder<_B >implements Buildable
    {

        protected final _B _parentBuilder;
        protected final ListOfFrame _storedValue;
        private List<Frame.Builder<ListOfFrame.Builder<_B>>> frame;

        public Builder(final _B _parentBuilder, final ListOfFrame _other, final boolean _copy) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    if (_other.frame == null) {
                        this.frame = null;
                    } else {
                        this.frame = new ArrayList<Frame.Builder<ListOfFrame.Builder<_B>>>();
                        for (Frame _item: _other.frame) {
                            this.frame.add(((_item == null)?null:_item.newCopyBuilder(this)));
                        }
                    }
                } else {
                    _storedValue = _other;
                }
            } else {
                _storedValue = null;
            }
        }

        public Builder(final _B _parentBuilder, final ListOfFrame _other, final boolean _copy, final PropertyTree _propertyTree, final PropertyTreeUse _propertyTreeUse) {
            this._parentBuilder = _parentBuilder;
            if (_other!= null) {
                if (_copy) {
                    _storedValue = null;
                    final PropertyTree framePropertyTree = ((_propertyTree == null)?null:_propertyTree.get("frame"));
                    if (((_propertyTreeUse == PropertyTreeUse.INCLUDE)?(framePropertyTree!= null):((framePropertyTree == null)||(!framePropertyTree.isLeaf())))) {
                        if (_other.frame == null) {
                            this.frame = null;
                        } else {
                            this.frame = new ArrayList<Frame.Builder<ListOfFrame.Builder<_B>>>();
                            for (Frame _item: _other.frame) {
                                this.frame.add(((_item == null)?null:_item.newCopyBuilder(this, framePropertyTree, _propertyTreeUse)));
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

        protected<_P extends ListOfFrame >_P init(final _P _product) {
            if (this.frame!= null) {
                final List<Frame> frame = new ArrayList<Frame>(this.frame.size());
                for (Frame.Builder<ListOfFrame.Builder<_B>> _item: this.frame) {
                    frame.add(_item.build());
                }
                _product.frame = frame;
            }
            return _product;
        }

        /**
         * Fügt Werte zur Eigenschaft "frame" hinzu.
         * 
         * @param frame
         *     Werte, die zur Eigenschaft "frame" hinzugefügt werden.
         */
        public ListOfFrame.Builder<_B> addFrame(final Iterable<? extends Frame> frame) {
            if (frame!= null) {
                if (this.frame == null) {
                    this.frame = new ArrayList<Frame.Builder<ListOfFrame.Builder<_B>>>();
                }
                for (Frame _item: frame) {
                    this.frame.add(new Frame.Builder<ListOfFrame.Builder<_B>>(this, _item, false));
                }
            }
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "frame" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param frame
         *     Neuer Wert der Eigenschaft "frame".
         */
        public ListOfFrame.Builder<_B> withFrame(final Iterable<? extends Frame> frame) {
            if (this.frame!= null) {
                this.frame.clear();
            }
            return addFrame(frame);
        }

        /**
         * Fügt Werte zur Eigenschaft "frame" hinzu.
         * 
         * @param frame
         *     Werte, die zur Eigenschaft "frame" hinzugefügt werden.
         */
        public ListOfFrame.Builder<_B> addFrame(Frame... frame) {
            addFrame(Arrays.asList(frame));
            return this;
        }

        /**
         * Setzt den neuen Wert der Eigenschaft "frame" (Vorher zugewiesener Wert wird
         * ersetzt)
         * 
         * @param frame
         *     Neuer Wert der Eigenschaft "frame".
         */
        public ListOfFrame.Builder<_B> withFrame(Frame... frame) {
            withFrame(Arrays.asList(frame));
            return this;
        }

        /**
         * Erzeugt einen neuen "Builder" zum Zusammenbauen eines zusätzlichen Wertes für
         * die Eigenschaft "Frame".
         * Mit {@link org.opcfoundation.ua._2008._02.types.Frame.Builder#end()} geht es
         * zurück zum aktuellen Builder.
         * 
         * @return
         *     Ein neuer "Builder" zum Zusammenbauen eines zusätzlichen Wertes für die
         *     Eigenschaft "Frame".
         *     Mit {@link org.opcfoundation.ua._2008._02.types.Frame.Builder#end()} geht es
         *     zurück zum aktuellen Builder.
         */
        public Frame.Builder<? extends ListOfFrame.Builder<_B>> addFrame() {
            if (this.frame == null) {
                this.frame = new ArrayList<Frame.Builder<ListOfFrame.Builder<_B>>>();
            }
            final Frame.Builder<ListOfFrame.Builder<_B>> frame_Builder = new Frame.Builder<ListOfFrame.Builder<_B>>(this, null, false);
            this.frame.add(frame_Builder);
            return frame_Builder;
        }

        @Override
        public ListOfFrame build() {
            if (_storedValue == null) {
                return this.init(new ListOfFrame());
            } else {
                return ((ListOfFrame) _storedValue);
            }
        }

        public ListOfFrame.Builder<_B> copyOf(final ListOfFrame _other) {
            _other.copyTo(this);
            return this;
        }

        public ListOfFrame.Builder<_B> copyOf(final ListOfFrame.Builder _other) {
            return copyOf(_other.build());
        }

    }

    public static class Select
        extends ListOfFrame.Selector<ListOfFrame.Select, Void>
    {


        Select() {
            super(null, null, null);
        }

        public static ListOfFrame.Select _root() {
            return new ListOfFrame.Select();
        }

    }

    public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?> , TParent >
        extends com.kscs.util.jaxb.Selector<TRoot, TParent>
    {

        private Frame.Selector<TRoot, ListOfFrame.Selector<TRoot, TParent>> frame = null;

        public Selector(final TRoot root, final TParent parent, final String propertyName) {
            super(root, parent, propertyName);
        }

        @Override
        public Map<String, PropertyTree> buildChildren() {
            final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
            products.putAll(super.buildChildren());
            if (this.frame!= null) {
                products.put("frame", this.frame.init());
            }
            return products;
        }

        public Frame.Selector<TRoot, ListOfFrame.Selector<TRoot, TParent>> frame() {
            return ((this.frame == null)?this.frame = new Frame.Selector<TRoot, ListOfFrame.Selector<TRoot, TParent>>(this._root, this, "frame"):this.frame);
        }

    }

}
