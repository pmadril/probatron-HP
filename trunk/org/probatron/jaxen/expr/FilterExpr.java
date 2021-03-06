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
 * $Header: /TEST/probatron/org/probatron/jaxen/expr/FilterExpr.java,v 1.1 2009/02/11 08:52:56 GBDP\andrews Exp $
 * $Revision: 1.1 $
 * $Date: 2009/02/11 08:52:56 $
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
 * @version $Id: FilterExpr.java,v 1.1 2009/02/11 08:52:56 GBDP\andrews Exp $
 */



package org.probatron.jaxen.expr;

import org.probatron.jaxen.Context;
import org.probatron.jaxen.JaxenException;

/**
 * Represents an XPath filter expression. This is production 20 in the 
 * <a href="http://www.w3.org/TR/xpath#NT-EqualityExpr">XPath 1.0 specification</a>:
 * 
 * <table><tr valign="baseline">
 * <td><a name="NT-FilterExpr"></a>[20]&nbsp;&nbsp;&nbsp;</td><td>FilterExpr</td><td>&nbsp;&nbsp;&nbsp;::=&nbsp;&nbsp;&nbsp;</td><td><a href="http://www.w3.org/TR/xpath#NT-PrimaryExpr">PrimaryExpr</a></td><td></td>
 * </tr>
 * <tr valign="baseline">
 * <td></td><td></td><td></td><td>| <a href="http://www.w3.org/TR/xpath#NT-FilterExpr">FilterExpr</a> <a href="http://www.w3.org/TR/xpath#NT-Predicate">Predicate</a></td><td></td>
 * </tr> 
 * </table>
 * 
 */
public interface FilterExpr extends Expr, Predicated
{

    /** 
     * Evaluates the filter expression on the current context
     * and returns true if at least one node matches.
     * 
     * @return true if a node matches; false if no node matches
     */
    public boolean asBoolean(Context context) throws JaxenException;
    
    /** 
     * @return the underlying filter expression
     */
    public Expr getExpr();
}
