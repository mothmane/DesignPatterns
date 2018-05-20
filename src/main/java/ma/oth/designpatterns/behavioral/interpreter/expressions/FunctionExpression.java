package ma.oth.designpatterns.behavioral.interpreter.expressions;

import java.util.List;

import ma.oth.designpatterns.behavioral.interpreter.AbstractExpression;
import ma.oth.designpatterns.behavioral.interpreter.Context;

public class FunctionExpression implements AbstractExpression {

	List<AbstractExpression> expressions;

	public List<AbstractExpression> getExpressions() {
		return expressions;
	}

	public void setExpressions(List<AbstractExpression> expressions) {
		this.expressions = expressions;
	}

	@Override
	public void interpret(Context ctx) {
		expressions.forEach(e -> e.interpret(ctx));

	}

}
