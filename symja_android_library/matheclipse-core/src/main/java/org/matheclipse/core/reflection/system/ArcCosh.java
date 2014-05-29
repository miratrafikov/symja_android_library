package org.matheclipse.core.reflection.system;

import org.matheclipse.core.eval.interfaces.AbstractTrigArg1;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.reflection.system.rules.ArcCoshRules;
import org.matheclipse.parser.client.SyntaxError;

/**
 * Inverse hyperbolic cosine
 * 
 * See <a href="http://en.wikipedia.org/wiki/Inverse_hyperbolic_function"> Inverse hyperbolic functions</a>
 */
public class ArcCosh extends AbstractTrigArg1 implements ArcCoshRules {
	 
	@Override
	public IAST getRuleAST() {
		return RULES;
	}

	public ArcCosh() {
	}

	@Override
	public IExpr evaluateArg1(final IExpr arg1) {
		return null;
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}
}
