/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TMode extends Token
{
    public TMode()
    {
        super.setText("%");
    }

    public TMode(int line, int pos)
    {
        super.setText("%");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TMode(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMode(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TMode text.");
    }
}
