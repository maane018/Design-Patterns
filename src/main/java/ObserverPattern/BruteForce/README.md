**Approach Description**:

This is also a push based mechanism code, but if you see the sensor class, we have hardcoded the update method with
clients. And also, if we have any more sensors in the future, we need to hardcode the clients + no behavior re-use.

**Pros of this approach**:

1. Push based mechanism

**Cons of this approach**:

1. Tied to an implementation
2. Implementation is tied to an implementation, basically WeatherStation to Sensor
3. Not very thread safe, what if the update thread/process fails?
4. No behavior re-use.
5. Not thinking about future enhancements.
6. Let's say we have a new client in the future, need to change sensor :( Very bad real life case.

**Learnings:**

1. Tie to interface, not to implementation.
2. Try to do behavior re-use and think about future enhancements.
3. Code should always be unavailable for modifications, but always be open to extensions.
4. Always see what can be modified and what's less modifiable, and write code accordingly. There should not be many
   changes in unmodifiable entities.

