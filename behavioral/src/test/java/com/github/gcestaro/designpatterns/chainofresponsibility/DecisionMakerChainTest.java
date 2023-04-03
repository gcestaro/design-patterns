package com.github.gcestaro.designpatterns.chainofresponsibility;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DecisionMakerChainTest {

  @ParameterizedTest
  @MethodSource("testData")
  void chainTest(Problem problem) {
    DecisionMakerChain chain = new Supervisor(new Manager(new Director()));
    chain.decide(problem);
  }

  @ParameterizedTest
  @MethodSource("testData")
  void noSupervisorTest(Problem problem) {
    DecisionMakerChain chain = new Manager(new Director());
    chain.decide(problem);
  }

  static Stream<Arguments> testData() {
    return Stream.of(
        Arguments.of(new Problem(Context.STRATEGICAL,
            "What is the Company's vision for the next five years?")),
        Arguments.of(new Problem(Context.TACTICAL,
            "Who is going to be part of this team?")),
        Arguments.of(new Problem(Context.OPERATIONAL,
            "Which design pattern should we use in this scenario?")));
  }
}