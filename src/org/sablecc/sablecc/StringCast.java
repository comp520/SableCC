/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * This file is part of SableCC.                             *
 * See the file "LICENSE" for copyright information and the  *
 * terms and conditions for copying, distribution and        *
 * modification of SableCC.                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package org.sablecc.sablecc;


public class StringCast implements Cast
{
  public final static StringCast instance = new StringCast();

  private StringCast()
  {}

  @Override
  public  Object cast(Object o)
  {
    return (String) o;
  }
}
