/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TMinusAssign extends Token
{
    public TMinusAssign()
    {
        super.setText("-=");
    }

    public TMinusAssign(int line, int pos)
    {
        super.setText("-=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TMinusAssign(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMinusAssign(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TMinusAssign text.");
    }
}
