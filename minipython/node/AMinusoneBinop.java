/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AMinusoneBinop extends PBinop
{
    private TDminus _dminus_;

    public AMinusoneBinop()
    {
    }

    public AMinusoneBinop(
        TDminus _dminus_)
    {
        setDminus(_dminus_);

    }
    public Object clone()
    {
        return new AMinusoneBinop(
            (TDminus) cloneNode(_dminus_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusoneBinop(this);
    }

    public TDminus getDminus()
    {
        return _dminus_;
    }

    public void setDminus(TDminus node)
    {
        if(_dminus_ != null)
        {
            _dminus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _dminus_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_dminus_);
    }

    void removeChild(Node child)
    {
        if(_dminus_ == child)
        {
            _dminus_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_dminus_ == oldChild)
        {
            setDminus((TDminus) newChild);
            return;
        }

    }
}
