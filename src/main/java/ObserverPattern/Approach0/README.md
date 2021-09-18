**Approach Description**:

Let's say we have a sensor class, which is connected to an actual sensor which reads temperature and humidity from the
weather. Whenever there is a change in the sensor values, it calls setTemperature and setHumidity functions of sensor
class. There is a weather station which reads the value of the sensor and displays them on some board. So, whenever
there is an update in the sensor values, weather station needs to know it.

**Pros of this approach**:

**Cons of this approach**:

1. Tied to an implementation
2. Implementation is tied to an implementation, basically WeatherStation to Sensor
3. This is poll mechanism, not very efficient because this loop will run infinite times and most of the time there will
   be no update.
4. Not very thread safe, what if the display thread/process fails?
5. Let's say we have one more client similar to weather station, it'll also have this infinite while loop to get the
   latest values Unnecessary computations
6. How do you select the frequency? Currently, frequency = time taken by the method, but what if the update is per ms?
7. We are doing 1 extra step i.e asking for the data, even before we know if there's any new data.

**Learnings:**

1. Tie to interface, not to implementations
2. Generally poll/pull mechanisms are bad because they waste a lot in computation values. Hence, push mechanism is more
   preferred, unless there are very few updates. Then I think both can be preferred. If there are just too many changes,
   both are bad.

