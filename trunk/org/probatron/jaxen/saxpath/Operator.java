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
 * $Header: /TEST/probatron/org/probatron/jaxen/saxpath/Operator.java,v 1.1 2009/02/11 08:52:58 GBDP\andrews Exp $
 * $Revision: 1.1 $
 * $Date: 2009/02/11 08:52:58 $
 *
 * ====================================================================
 *
 * Copyright 2000-2002 bob mcwhirter & James Strachan.
 * All rights reserved.
 *
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
 * @version $Id: Operator.java,v 1.1 2009/02/11 08:52:58 GBDP\andrews Exp $
 */

package org.probatron.jaxen.saxpath;

/**
 * Constants used to represent XPath operators.
 */
public interface Operator
{
    /**
     * Indicates that we're passing through a grammar production without
     * actually activating it. For example in the expression
     * <code>1</code> is matches AdditiveExpr and MultiplicativeExpr in 
     * the XPath grammar, even though it has neither a plus, 
     * minus, multiplication, or other sign.
     */
    final static int NO_OP               =  0;
    
    // Equality
    /**
     * The equal to operator <code>=</code>. This is equivalent to <code>==</code>
     * in Java. This is a comparison operator, not an assignment operator.
     */
    final static int EQUALS              =  1;
    
    /**
     * The not equal to operator <code>!=</code>
     */
    final static int NOT_EQUALS          =  2;
    
    // Relational
    /**
     * The less-than operator <code>&lt;</code>
     */
    final static int LESS_THAN           =  3;
    
    /**
     * The less-than-or-equal-to operator <code>&lt;=</code>
     */
    final static int LESS_THAN_EQUALS    =  4;

    /**
     * The greater-than operator <code>></code>
     */
    final static int GREATER_THAN        =  5;

    /**
     * The greater-than or equals operator <code>>=</code>
     */
    final static int GREATER_THAN_EQUALS =  6;
    
    // Additive

    /**
     * The addition operator <code>+</code>
     */
    final static int ADD                 =  7;

    /**
     * The subtraction operator <code>-</code>
     */
    final static int SUBTRACT            =  8;

    // Multiplicative

    /**
     * The multiplication operator <code>*</code>
     */
    final static int MULTIPLY            =  9;

    /**
     * The remainder operator <code>mod</code>. This is equivalent to
     * <code>%</code> in Java. 
     */
    final static int MOD                 = 10;

    /**
     * The floating point division operator <code>div</code>.  This is equivalent to
     * <code>/</code> in Java. 
     */
    final static int DIV                 = 11;

    // Unary

    /**
     * Unary <code>-</code>
     */
    final static int NEGATIVE            = 12;
}
