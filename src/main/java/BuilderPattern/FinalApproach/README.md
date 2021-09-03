**Approach Description**:

Use builder strategy pattern. Have a builder class inside the main class and then it will do all the work.

**Pros of this approach**:

1. No need to mention all parameters in order.
2. We can easily specify the mandatory vs optional parameters. The client can also specify the parameters they need, and we can have additional checks from our side regarding mandatory parameters.
3. Thread safe

**Cons of this approach**:


**Learnings:**
1. Always think about thread-safety of your application.
2. Don't force users of your application to specify their inputs in a certain way.
