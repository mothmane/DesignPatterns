package ma.oth.designpatterns.behavioral.interpreter.expressions;

import ma.oth.designpatterns.behavioral.interpreter.AbstractExpression;
import ma.oth.designpatterns.behavioral.interpreter.Context;

public class ForLoopExpression implements AbstractExpression {

	private int start;
	private int end;
	private AbstractExpression expression;

	@Override
	public void interpret(Context ctx) {
		for (int i = start; i < end; i++) {
			expression.interpret(ctx);
		}
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public AbstractExpression getExpression() {
		return expression;
	}

	public void setExpression(AbstractExpression expression) {
		this.expression = expression;
	}
	

}
