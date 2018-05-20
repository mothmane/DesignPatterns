package ma.oth.designpatterns.behavioral.interpreter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ma.oth.designpatterns.behavioral.interpreter.expressions.LeftExpression;
import ma.oth.designpatterns.behavioral.interpreter.parser.Parser;

public class Client {

	private Context ctx;

	
	private Parser parser;
	private final String HOME = "/home/othmane/Dev/workspaces/formation/design-patterns/src/main/resources/interpreter/langage/";

	public Client() {
		ctx = new Context();
		parser = new Parser();
		// right();
		try {
			this.execute(HOME + "doubleforpath.child");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void right() {
		List<AbstractExpression> list = new ArrayList<>();
		list.add(new LeftExpression());
		list.add(new LeftExpression());
		list.add(new LeftExpression());

		this.evaluate(list);
	}

	public void execute(String program) throws IOException {
		List<AbstractExpression> list = parser.parse(program);
		this.evaluate(list);

	}

	public void evaluate(List<AbstractExpression> list) {
		list.forEach(expression -> expression.interpret(ctx));
	}

	public static void main(String[] args) {
		new Client();
	}

}
