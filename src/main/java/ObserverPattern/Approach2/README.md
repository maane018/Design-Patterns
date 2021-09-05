**Approach Description**:

This is the push-push method. Basically, whenever there is any update in any Observable (TemperatureSensor), the notify method will notify all the observers that some update is there, along with the updated value.
it is just that "Hey something has updated. Take the new value and do whatever you want".

**Pros of this approach**:

1. We have tied to an interface, not implementations.
2. No need to poll the subscriptions continuously for an update. The subscription will automatically tell clients that we have an update, please take updated value.
3. Currently, subscription is storing all subscribers in list i.e there is no preference. All the clients will be treated equally and first come first serve.
We can also have a priority list with the subscribers, so the subscriber with most priority will be notified first.

**Cons of this approach**:
1. We are forcing the subscribers to take the value if there is an update. Subscriber can also choose to ignore the update or can take the update. Depending on use-case.
2. The subscribers can subscribe to multiple observables, but for each of them, we'll have to create a new update method.
3. Let's say subscriber does not want the updated value at once, or has additional checks for showing updated value, then our implementation is not good.
We have forced subscriber to take the value whether it wants or not.
4. Let's say we have a sensor which sends out multiple values, but we need only 1 of them. Then we'll have to change update method implementation and take all parameters, even when we need one only.
5. Loosely coupled code. Even if we change any logic in observable/observer, as long as contract remains same, we are good.


**Learnings:**
1. Program to interface, not implementations.
2. Give an option to clients if they want your data or not.
3. Generally push mechanism is better than poll mechanism.
4. Try to create loosely coupled classes.


