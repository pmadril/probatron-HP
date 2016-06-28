/*
 * Copyright 2009 Griffin Brown Digital Publishing Ltd
 * All rights reserved.
 *
 * This file is part of Probatron.
 *
 * Probatron is free software: you can redistribute it and/or modify
 * it under the terms of the Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Probatron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Affero General Public License for more details.
 *
 * You should have received a copy of the Affero General Public License
 * along with Probatron.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * This software contains, in modified form, source code originally created by 
 * the Jaxen Project.
 *
 * The copyright notice, conditions and disclaimer pertaining to that 
 * distribution are included below.
 *
 * Jaxen distributions are available from <http://jaxen.org/>.
 */  

/*
 * $Header: /TEST/probatron/com/xmlprobe/jaxen/pattern/NameTest.java,v 1.2 2009/02/11 08:52:54 GBDP\andrews Exp $
 * $Revision: 1.2 $
 * $Date: 2009/02/11 08:52:54 $
 *
 * ====================================================================
 *
 * Copyright 2000-2002 bob mcwhirter & James Strachan.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 * 
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *   * Neither the name of the Jaxen Project nor the names of its
 *     contributors may be used to endorse or promote products derived 
 *     from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * ====================================================================
 * This software consists of voluntary contributions made by many 
 * individuals on behalf of the Jaxen Project and was originally 
 * created by bob mcwhirter <bob@werken.com> and 
 * James Strachan <jstrachan@apache.org>.  For more information on the 
 * Jaxen Project, please see <http://www.jaxen.org/>.
 * 
 * @version $Id: NameTest.java,v 1.2 2009/02/11 08:52:54 GBDP\andrews Exp $
 */

package org.probatron.jaxen.pattern;

import org.probatron.jaxen.Context;
import org.probatron.jaxen.Navigator;

/** <p><code>NameTest</code> tests for a node name.</p>
  *
  * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
  * @version $Revision: 1.2 $
  */
public class NameTest extends NodeTest {
    
    /** The name to match against */
    private String name;
    
    /** The type of node to match - either attribute or element */
    private short nodeType;
    
    public NameTest(String name, short nodeType)   
    {
        this.name = name;
        this.nodeType = nodeType;
    }
        
    /** @return true if the pattern matches the given node
      */
    public boolean matches( int node, Context context ) 
    {
        Navigator navigator = context.getNavigator();
        if ( nodeType == Pattern.ELEMENT_NODE ) 
        {
            return navigator.isElement( node ) 
                && name.equals( navigator.getElementName( node ) );
        }
        else if ( nodeType == Pattern.ATTRIBUTE_NODE ) 
        {
            return navigator.isAttribute( node )
                && name.equals( navigator.getAttributeName( node ) );
        }
        else
        {
            if ( navigator.isElement( node ) )
            {
                return name.equals( navigator.getElementName( node ) );
            }
            else
            if ( navigator.isAttribute( node ) )
            {
                return name.equals( navigator.getAttributeName( node ) );
            }
        }
        return false;
    }
    
    public double getPriority() 
    {
        return 0.0;
    }


    public short getMatchType() 
    {
        return nodeType;
    }
    
    public String getText() 
    {
        if ( nodeType == Pattern.ATTRIBUTE_NODE ) 
        {
            return "@" + name;
        }
        else 
        {
            return name;
        }
    }
    
    public String toString()
    {
        return super.toString() + "[ name: " + name + " type: " + nodeType + " ]";
    }
}
