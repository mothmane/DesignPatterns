package ma.oth.designpatterns.behavioral.interpreter.expressions;

import ma.oth.designpatterns.behavioral.interpreter.AbstractExpression;
import ma.oth.designpatterns.behavioral.interpreter.Context;

public class MoveExpression implements AbstractExpression {

	@Override
	public void interpret(Context ctx) {
		
		System.out.println("Move");

	}

}
