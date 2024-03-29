/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TDivAssign extends Token
{
    public TDivAssign()
    {
        super.setText("/=");
    }

    public TDivAssign(int line, int pos)
    {
        super.setText("/=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TDivAssign(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDivAssign(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TDivAssign text.");
    }
}
