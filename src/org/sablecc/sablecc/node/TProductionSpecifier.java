/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import org.sablecc.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TProductionSpecifier extends Token
{
    public TProductionSpecifier()
    {
        super.setText("P");
    }

    public TProductionSpecifier(int line, int pos)
    {
        super.setText("P");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TProductionSpecifier(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTProductionSpecifier(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TProductionSpecifier text.");
    }
}
