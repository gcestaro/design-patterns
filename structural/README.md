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

### References

- [Refactoring Guru](https://refactoring.guru/design-patterns/composite)

