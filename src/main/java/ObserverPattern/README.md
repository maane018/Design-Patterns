**Definition**

Defines a one to many dependency of objects so that when one object changes, all other objects are updated automatically.
One: Observable, think of it kind of newspaper subscription
Many: Observers, think of it like subscribers
Push mechanism
Assumption: Subject knows about the subscribers (is it even as assumption or a requirement??)

**Other solutions?** <br>

1. Can use Java's own observable and subject libraries. Only available in old Java versions. Deprecated now, after Java 9.
[Link 1](https://www.infoworld.com/article/2077258/observer-and-observable.html)
[Link 2](https://www.geeksforgeeks.org/java-util-observable-class-java/)
We can use this for changing the mechanism to pull also.
2. After Java 9, PropertyChangeEvents and PropertyChangeListeners.

3. Do we need to update everytime there's a new value? What happens if too much change in temp/humidity?
- We can have a logic in observable that whenever change is significant (change > threshold), then call update().
  This threshold can also be provided by the client at time of registration.
- We can have a logic in observable that only call update after atleast x seconds. This can also be provided by client at time of registration.

3. Let's say we have TemperatureSensors, with one having no priority, second having priority subscribers etc... We can use Strategy Pattern here for add/update method also.
Interface: TemperatureSensor, with concrete as TemperatureSensorBehavior1, TemperatureSensorBehavior2....
4. Our subjects can also be the observer for somebody else.
Eg: A sends to B, B processes it and sends to C and so on.
5. We can probably extend it where subject has different kind of messages and our subscribers need different messages out of them. Kind of subscription filter in SNS.
Eg: Subject has messages related to A,B,C and X observer needs A, Y observer needs B and Z needs C.


**Learnings**:

1. Program to interface, not implementations.
2. Give an option to clients if they want your data or not.
3. Generally poll/pull mechanisms are bad because they waste a lot in computation values. Hence, push mechanism is more preferred, unless there are very few updates.
      Then I think both can be preferred. If there are just too many changes, both are bad.
4. Always create loosely coupled classes.
This means one object does not care about what other object is, as long as it is interacting with it in normal manner. Think of humans, we interact with som many things but do we care about how they function?
5. Composition over inheritance
6. Try to do behavior re-use and think about future enhancements.
7. Code should always be unavailable for modifications, but always be open to extensions.
8. Always see what can be modified and what's less modifiable, and write code accordingly. There should not be many changes in unmodifiable entities


**Ways to think**:

1. Whenever you have something which needs to be notified when something is completed, use observer pattern.
Generally used in Multi-processing in Java also.
2. Generally used in UI with something like "whenever something is pressed, do this". "ON CLICK event"
3. Pub-sub, publisher-subscriber component

**Important resources**:

1. Christopher Okhravi's Video: [Link](https://www.youtube.com/watch?v=_BpmfnqjgzQ)
2. Head first design patterns Chapter 2





