package ma.oth.designpatterns.behavioral.interpreter.parser;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import ma.oth.designpatterns.behavioral.interpreter.AbstractExpression;
import ma.oth.designpatterns.behavioral.interpreter.expressions.ForLoopExpression;
import ma.oth.designpatterns.behavioral.interpreter.expressions.LeftExpression;
import ma.oth.designpatterns.behavioral.interpreter.expressions.MoveExpression;

public class Parser {

	public List<String> load(String path) throws IOException {

		Path program = Paths.get(path);

		Charset charset = Charset.forName("ISO-8859-1");

		List<String> lines = Files.readAllLines(program, charset);

		return lines;

	}

	public List<AbstractExpression> parse(String path) throws IOException {
		List<AbstractExpression> expressions = new ArrayList<>();
		List<String> lines = this.load(path);
		// do not ever do this
		for (String line : lines) {
			expressions.add(this.extractExpression(line));
		}

		return expressions;
	}

	public AbstractExpression extractExpression(String line) {
		if (line.startsWith("left")) {
			return this.extractLeftExpression(line);
		} else if (line.startsWith("move")) {
			return this.extractMoveExpression(line);
		} else {
			return this.extractForExpression(line);
		}
	}

	public AbstractExpression extractLeftExpression(String line) {
		return new LeftExpression();

	}

	public AbstractExpression extractMoveExpression(String line) {
		return new MoveExpression();

	}

	public AbstractExpression extractForExpression(String line) {
		String[] elements = line.split(" ");
		// indexes
		String[] forIndexes = elements[1].split("to");
		int start = Integer.parseInt(forIndexes[0]);
		int end = Integer.parseInt(forIndexes[1]);

		ForLoopExpression fe = new ForLoopExpression();
		fe.setStart(start);
		fe.setEnd(end);
		
		StringBuilder rest = new StringBuilder(elements[2]);
		for (int i = 3; i < elements.length; i++) {
			rest.append(" " + elements[i]);
		}
		// for bloc
		fe.setExpression(this.extractExpression(rest.toString()));

		return fe;

	}

}
