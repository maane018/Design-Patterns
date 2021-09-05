**Approach Description**:

This is the push-pull method. Basically, whenever there is any update in any Observable (either HumiditySensor or TemperatureSensor), the notify method will notify all the observers that some update is there.
It won't send the value, it is just that "Hey something has updated. It's upto you now if you want the new value or not". And if the subscriber wants, then it can ask using getValue().

**Pros of this approach**:

1. We are not forcing the subscribers to take the value if there is an update. Subscriber can also choose to ignore the update or can pull the update. Depending on use-case.
Let's say we have a Newspaper website, where we just want to update the users that there is a new news article but don't want to show them, unless they pay for it.
So, we can do this via push-pull method of Observer method.

2. The subscribers can subscribe to multiple observables.
3. We have tied to an interface, not implementations.
4. No need to poll the subscriptions continuously for an update. The subscription will automatically tell clients that we have an update, please see if you want to.
5. Currently, subscription is storing all subscribers in list i.e there is no preference. All the clients will be treated equally and first come first serve.
We can also have a priority list with thr subscribers, so the subscriber with most priority will be notified first.
6. Loosely coupled code. Even if we change any logic in observable/observer, as long as contract remains same, we are good.

**Cons of this approach**:

**Learnings:**
1. Program to interface, not implementations.
2. Give an option to clients if they want your data or not.
3. Generally push mechanism is better than poll mechanism.
4. Try to create loosely coupled classes.

