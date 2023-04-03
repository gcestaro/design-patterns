# Behavioral Design Patterns

## Chain of Responsibility

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain
of handlers. Upon receiving a request, each handler decides either to process the request or to
pass it to the next handler in the chain.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/chain-of-responsibility)

## Command

Command is a behavioral design pattern that turns a request into a stand-alone object that contains
all information about the request. This transformation lets you pass requests as a method arguments,
delay or queue a request’s execution, and support undoable operations.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/command)

## Iterator

Iterator is a behavioral design pattern that lets you traverse elements of a collection without 
exposing its underlying representation (list, stack, tree, etc.).

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/iterator)

## Mediator

Also known as Controller, Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. 
The pattern restricts direct communications between the objects and forces them to collaborate only 
via a mediator object.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/mediator)

## Memento

Also known as Snapshot, Memento is a behavioral design pattern that lets you save and restore the previous state of an 
object without revealing the details of its implementation.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/memento)

## Observer

Also known as Event-Subscriber, Listener, Observer is a behavioral design pattern that lets you 
define a subscription mechanism to notify multiple objects about any events that happen to the 
object they’re observing.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/observer)

## State

State is a behavioral design pattern that lets an object alter its behavior when its internal state 
changes. It appears as if the object changed its class.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/state)

## Strategy

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of 
them into a separate class, and make their objects interchangeable.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/strategy)

## Template Method

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the 
superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/template-method)
* [Design Patterns Saga](https://github.com/rafadelnero/design-patterns-saga/)

## Visitor

Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

## References

* [Refactoring Guru](https://refactoring.guru/design-patterns/visitor)