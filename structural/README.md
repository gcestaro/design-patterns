# Behavioral Design Patterns

## Adapter

Also known as Wrapper, Adapter is a structural design pattern that allows objects with incompatible
interfaces to collaborate.

It is a special object that converts the interface of one object so that another object can
understand it. An adapter wraps one of the objects to hide the complexity of conversion happening
behind the scenes.

### Real life example

A great example of a real life adapter is a charger, it adapts the interface of your house's
electric socket to your device's battery.

### References

- [Refactoring Guru](https://refactoring.guru/design-patterns/adapter)

## Bridge

Bridge is a structural design pattern that lets you split a large class or a set of closely related
classes into two separate hierarchies—abstraction and implementation—which can be developed
independently of each other.

The Bridge pattern allows changing or even creating new classes without touching the code of the
opposite hierarchy.

Usage examples: The Bridge pattern is especially useful when dealing with cross-platform apps,
supporting multiple types of database servers or working with several API providers of a certain
kind (for example, cloud platforms, social networks, etc.)

### Real life example

Well, if a charger is an Adapter, the cable that connects your device to the charger is a Bridge
used to transfer energy to your device's battery. Both work well separately and handle their own
properties and functions, but sometimes a bridge that connects them is needed.

### References

- [Refactoring Guru](https://refactoring.guru/design-patterns/bridge)
- [Alura](https://cursos.alura.com.br/course/avancando-design-patterns-java/task/85650)

## Composite

Also known as Object Tree, Composite is a structural design pattern that lets you compose objects
into tree structures and then work with these structures as if they were individual objects.

### Real life example

A financial budget plan can be composed by more specific budgets. For instance, how much you earn
and can spend on self-development, games, hang-outs, bills, coffees and others per month?

### References

- [Refactoring Guru](https://refactoring.guru/design-patterns/composite)
- [Alura](https://cursos.alura.com.br/course/avancando-design-patterns-java/task/85654)

## Decorator

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing
these objects inside special wrapper objects that contain the behaviors.

### Real life example

Wearing clothes is an example of using decorators. When you’re cold, you wrap yourself in a sweater.
If you’re still cold, you can wear a jacket on top. If it’s raining, you can put on a raincoat. All
of these garments “extend” your basic behavior but aren’t part of you, and you can
easily take off any piece of clothing whenever you don’t need it.

### References

- [Refactoring Guru](https://refactoring.guru/design-patterns/decorator)
- [Alura](https://cursos.alura.com.br/course/avancando-design-patterns-java/task/85652)
- [Rafael Del Nero](https://github.com/rafadelnero/design-patterns-saga)

## Facade

Facade is a structural design pattern that provides a simplified interface to a library, a
framework, or any other complex set of classes.

### Real life example

The receptionist of a hospital is a facade to all the services available in that hospital. He/She
will access the system to give relevant information to the client that doesn't have the access.

### References

- [Refactoring Guru](https://refactoring.guru/design-patterns/facade)
- [Alura](https://cursos.alura.com.br/course/avancando-design-patterns-java/task/85656)

## Flyweight

Also known as Cache, Flyweight is a structural design pattern that lets you fit more objects into
the available amount of RAM by sharing common parts of state between multiple objects instead of
keeping all the data in each object.

### Real life example

It is more a computer science problem than a real world. But we can use imagination here...

Let's say our brain has a limited amount of memory that is stored to us remember. We could use a
file in a computer or a notebook to write things and them we don't need to remember everything. Once
we need, we access the file or paper. This will be our "cache", but the memory is still somewhere.

### References

- [Refactoring Guru](https://refactoring.guru/design-patterns/facade)
- [Alura](https://cursos.alura.com.br/course/avancando-design-patterns-java/task/85656)


