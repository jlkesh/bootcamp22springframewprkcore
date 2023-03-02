package dev.jlkeesh.springframeworkcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Arrays;

public class Main {
    static ExpressionParser parser = new SpelExpressionParser();

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc-settings.xml");
        SpelArithmeticOperators arithmeticOperators = context.getBean(SpelArithmeticOperators.class);
        System.out.println(arithmeticOperators);
        // StandardEvaluationContext evaluationContext = new StandardEvaluationContext(itClub);
//        evaluationContext.setVariable("club", itClub);
        /*System.out.println(itClub.isMember("Shengo"));
        Expression expression = parser.parseExpression("'Hello ' + ' PDP!'");
        String value = expression.getValue(String.class);
        System.out.println("value = " + value);
        Expression expression1 = getExpression("{1,2,3,4,5}");
        System.out.println(Arrays.toString(expression1.getValue(int[].class)));
        System.out.println(Arrays.deepToString(getExpression("{{1,2},{4,5}}").getValue(int[][].class)));
        System.out.println(getExpression("'hello pdp java guys'.substring(3,10)").getValue(String.class));
        System.out.println(getExpression("'hello pdp java guys'.toUpperCase").getValue(String.class));
        System.out.println(getExpression("'hello pdp java guys'.bytes").getValue(String.class));
        System.out.println(getExpression("isMember('Javohir')").getValue(evaluationContext, Boolean.class));
        Person person = getExpression("new dev.jlkeesh.springframeworkcore.Person('Elmurodov Javohir','28')").getValue(Person.class);
        System.out.println("person = " + person);
        */

        /*System.out.println(getExpression("5 == 5").getValue(Boolean.class));
        System.out.println(getExpression("5 != 5").getValue(Boolean.class));
        System.out.println(getExpression("'white' < 'whete'").getValue(Boolean.class));*/

        /*System.out.println(getExpression("123.45 instanceOf T(Integer)").getValue(Boolean.class));
        System.out.println(getExpression("123.45F instanceOf T(Float)").getValue(Boolean.class));
        System.out.println(getExpression("123.45 instanceOf T(Double)").getValue(Boolean.class));
        System.out.println(getExpression("'Hello' instanceOf T(String)").getValue(Boolean.class));

        System.out.println(getExpression("'+998908115224' matches '^\\+99890\\d{7}$'").getValue(Boolean.class));
        */
        /*System.out.println(getExpression("true and true").getValue(Boolean.class));
        System.out.println(getExpression("true and false").getValue(Boolean.class));
        System.out.println(getExpression("true or false").getValue(Boolean.class));
        System.out.println(getExpression("true and !false").getValue(Boolean.class));
        System.out.println(getExpression("isMember('Shengo') and isMember('Elshodbek')").getValue(evaluationContext, Boolean.class));
        System.out.println(getExpression("!isMember('Shengo')").getValue(evaluationContext, Boolean.class));*/

        /*System.out.println(getExpression("'test '+ 124").getValue(String.class));
        System.out.println(getExpression("123 + 124").getValue(String.class));
*/

    }

    private static Expression getExpression(String expressionString) {
        return parser.parseExpression(expressionString);
    }
}