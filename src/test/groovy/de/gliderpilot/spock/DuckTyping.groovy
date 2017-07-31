class Cat {
    def makeSound() {
        println "meow!"
    }
}

class Dog {
    def makeSound() {
        println "wuff!"
    }
}

def animal = new Cat()
animal.makeSound()
animal = new Dog()
animal.makeSound()
