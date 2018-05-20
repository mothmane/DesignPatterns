package ma.oth.designpatterns.behavioral.interpreter.expressions;

import ma.oth.designpatterns.behavioral.interpreter.AbstractExpression;
import ma.oth.designpatterns.behavioral.interpreter.Context;

public class LeftExpression implements AbstractExpression {

	@Override
	public void interpret(Context ctx) {
		

		ctx.setCurrentDirection(ctx.getDirection(ctx.getCurrentDirectionIndex()+1));

		System.out.println(ctx.getCurrentDirection());

	}

}
