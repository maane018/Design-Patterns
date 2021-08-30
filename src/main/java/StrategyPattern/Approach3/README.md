Approach Description:

`So, in our previous approaches, we discovered that fly() and quack() behaviors are different. And we should not force the behaviors on a particular class. What can do instead is, create a new interface Flyable() and Quackable(). Whichever Duck wants to have these behaviors can implement these, hence we are not forcing the behavior now.`

Pros of this approach:

1. `We are not forcing the behavior on anybody. `

Cons of this approach:

1. `Duplicate/Redundant behavior shared across various implementations`
2. `We cannot just call methods on interface now, since there are multiple interfaces. See Application.java`
3. `Contracts are not defined.`
4. `Runtime Behavior changes are difficult.`

Learnings:

1. `Solution for inheritance problems is not more inheritance`
