**Approach Description**:

Use builder strategy pattern. Have a builder class inside the main class and then it will do all the work.

**Pros of this approach**:

1. No need to mention all parameters in order.
2. We can easily specify the mandatory vs optional parameters. No need to include additional checks from our side.
3. Thread safe
4. Important: In case we need a complex representation, builder pattern will be able to help us out here. Eg: List<int>
   so either we take a list from user, or just addElement(6).addElement(9).... will add it to list. This is generally
   used in adding elements to a plain ArrayList too. new ArrayList().put(6).put(7)... This way, this pattern gives more
   flexibility to users on how to create object.

**Cons of this approach**:

**Learnings:**

1. Always think about thread-safety of your application.
2. Don't force users of your application to specify their inputs in a certain way.
