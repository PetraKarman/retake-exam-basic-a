# EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Create a `.gitignore` file so generated files won't be committed
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-3. Complete the following tasks: (~90 mins)
- [Min-max difference](minmaxdiff/MinMaxDiff.java)
- [Most common word](most-common-word/MostCommonWord.java)
- [Library](library/Library.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 4. Question time! (~10 mins) [3p]

### How many constructors called when `myFoxi` initialized (and wich order) ?
```java
class Animal {
}

class Dog extends Animal {
}

class Foxi extends Dog {
	public static void main(String[] args) {
		Foxi myFoxi = new Foxi;
	}
}
```
#### Your answer:
[3, The first is the Object class's constructor, then the constructor of Animal Class and finally the constructor of Dog Class.]   
