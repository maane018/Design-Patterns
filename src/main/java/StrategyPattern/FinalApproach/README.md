Approach Description:

`This is the strategy pattern. Separate constants with variables. In our case, we have created 2 different interfaces Quackable and Flyable (with their individual concrete implementations)
and then we have created concrete implementations of Duck. 
Instead of inheritance, we have used composition. 
Now, each duck can specify what kind of behavior it has (quack behavior and fly behavior)
In the code, I have assumed that run behavior is same across all the ducks.`

Pros of this approach:

1. `We are not forcing the behavior on anybody. `
2. `No duplicate/redundannt code`
3. `Contracts for duck are also defined`
4. `Runtime behavior changes are also supported using all args constructor and constructor injection.`

Cons of this approach:

1. `None`

Learnings:

1. `Favour composition as compared to inheritance.`
2. `Separate what's constant and what's varying.`
