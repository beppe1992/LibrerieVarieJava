package it.spring.approfondimenti.dto.spel;


import it.spring.approfondimenti.dto.Persona;


import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


/**
 * 
 */
public class SpelValidator {

	private String expression;

	private Expression expr;

	public boolean passSpell(Persona pers) {
		ExpressionParser parser = new SpelExpressionParser();
		expr = parser.parseExpression(expression);
		EvaluationContext context = new StandardEvaluationContext(pers);

		if (expr.getValue(context, Boolean.class)) {
			return true;

		}
		return false;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

}
