package rpn;

import java.util.stream.Stream;

public class TokenizerConsumer implements  Consummer{

    private final Bus bus;

    public TokenizerConsumer(Bus bus){
        this.bus = bus;
    }


    @Override
    public void consume(Message message){
        ExpressionMessage expressionMessage = (ExpressionMessage) message;
        String expression = expressionMessage.expression();

        Stream.of(expression.split("\\s+"))
                .forEach(s -> bus.publish(
                        new TokenMessage(expressionMessage.expressionId(), s)));
        }
}
