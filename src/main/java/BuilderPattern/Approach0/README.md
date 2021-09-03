**Approach Description**:

We define a class and just like we do everywhere else, we define a constructor with all the parameters. For optional
parameters, either we can leave it out of constructor or just set it as NULL initially and then allow client to change
value using setters.

**Pros of this approach**:

1. Easy implementation

**Cons of this approach**:

1. Remember the order of parameters, or even if we do it via named, so many parameters via constructor.
2. Not taking care of optional and mandatory parameters
3. If we introduce null in constructor, then chances of null pointer exception increase.
4. Constructor injection is okay. But what if we use setter injection? Not thread safe too.

**Learnings:**

1. Allow the flexibility of construction to users. Don't hard code the position of the inputs too. Generally that's how
   the CLI tools work. You can specify what you want, in any order you want, but it does not force you to do that.