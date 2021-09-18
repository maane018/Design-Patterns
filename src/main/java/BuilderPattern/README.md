**Definition** <br>

Encapsulates the way a complex object is created. Allow objects to be constructed in multi-step and varying process. It
hides the internal representation of product from client. The client can only see the abstract implementation and not
the whole class. It's a creation pattern. Use it whenever you are dealing with POJO etc.

**Cons** <br>

Constructing objects require a little bit more knowledge than factories.

**Other solutions?** <br>

1. Write many constructors, with all of the combinations of mandatory and optional parameters. <br>
   Eg: A,B = Mandatory and C,D = Optional, so there will be 5 constructors as (A,B) (A,B,C),(A,B,D),(A,B,C,D),(
   A,B,D,C) <br>
   More parameters, more constructor combinations. Not good. <br>

2. Instead of creating objects via constructor, why don't we try combination of constructor + setters? <br>
   Mandatory parameters via constructor and optional parameters via setters? <br>
   Again, 2 problems <br>
    1. If number of mandatory parameters are too many, then ordering problems <br>
    2. By using setters, we are making our objects mutable. Not a good idea <br>
        1. In our builder class, we also have setters but then they don't make our object mutable. Since once our
           builder object is built, only after that we get our original object.w
    3. If we do setters for mandatory parameters also, we'll need to include additional checks too, to check if they are
       present. :(  <br>

3. There is 1 awesome library Lombok, which creates this builder class and everything just using an annotation @Builder.

**Learnings**:

1. Allow the flexibility of construction to users. Don't hard code the position of the inputs too. Generally that's how
   the CLI tools work. You can specify what you want, in any order you want, but it does not force you to do that. Don't
   force users of your application to specify their inputs in a certain way.
2. Always think about thread-safety of your application.

**Ways to think**:

1. Is there a POJO in your application, with optional and mandatory parameters? Use builder pattern for the class.

**Important resources**:

1. https://www.geeksforgeeks.org/builder-pattern-in-java/
2. Lombok builder annotation: [Link](https://projectlombok.org/features/Builder)
3. Good tutorial: [Link](https://dzone.com/articles/the-builder-pattern-for-class-with-many-constructo)
4. Good video on Builder pattern: [Link](https://www.youtube.com/watch?v=6Wi2XZeAf-Q)


