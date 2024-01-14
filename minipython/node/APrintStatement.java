/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class APrintStatement extends PStatement
{
    private PExpression _exp1_;
    private final LinkedList _exp2_ = new TypedLinkedList(new Exp2_Cast());

    public APrintStatement()
    {
    }

    public APrintStatement(
        PExpression _exp1_,
        List _exp2_)
    {
        setExp1(_exp1_);

        {
            this._exp2_.clear();
            this._exp2_.addAll(_exp2_);
        }

    }
    public Object clone()
    {
        return new APrintStatement(
            (PExpression) cloneNode(_exp1_),
            cloneList(_exp2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrintStatement(this);
    }

    public PExpression getExp1()
    {
        return _exp1_;
    }

    public void setExp1(PExpression node)
    {
        if(_exp1_ != null)
        {
            _exp1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _exp1_ = node;
    }

    public LinkedList getExp2()
    {
        return _exp2_;
    }

    public void setExp2(List list)
    {
        _exp2_.clear();
        _exp2_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_exp1_)
            + toString(_exp2_);
    }

    void removeChild(Node child)
    {
        if(_exp1_ == child)
        {
            _exp1_ = null;
            return;
        }

        if(_exp2_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_exp1_ == oldChild)
        {
            setExp1((PExpression) newChild);
            return;
        }

        for(ListIterator i = _exp2_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class Exp2_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PExpression node = (PExpression) o;

            if((node.parent() != null) &&
                (node.parent() != APrintStatement.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != APrintStatement.this))
            {
                node.parent(APrintStatement.this);
            }

            return node;
        }
    }
}