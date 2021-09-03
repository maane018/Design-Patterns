**Definition**

It's a creation pattern. Use it whenever you are dealing with POJO etc.

**Other solutions?** <br>

1. No other solutions, but there is 1 awesome library Lombok, which creates this builder class and everything just using an annotation @Builder.

**Learnings**:
1. Allow the flexibility of construction to users. Don't hard code the position of the inputs too. Generally that's how
      the CLI tools work. You can specify what you want, in any order you want, but it does not force you to do that.
Don't force users of your application to specify their inputs in a certain way.
2. Always think about thread-safety of your application.


**Ways to think**:
1. Is there a POJO in your application, with optional and mandatory parameters? Use builder pattern for the class.


**Important resources**:
1. https://www.geeksforgeeks.org/builder-pattern-in-java/
2. Lombok builder annotation: [Link](https://projectlombok.org/features/Builder)
3. Good video on Builder pattern: [Link](https://www.youtube.com/watch?v=M7Xi1yO_s8E)


