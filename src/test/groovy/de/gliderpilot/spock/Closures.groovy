import static org.awaitility.Awaitility.await

int count = 0
20.times { // <1>
    count++
}
assert count == 20
new Thread({ count = 0 }).start()
assert await().until { count == 0 }

def closure = { println it } // <2>
def closureWithNamedArguments = { a, b -> // <3>
    println "$a $b"
}

closure("Hello World!")

closureWithNamedArguments("Hello", "World!")
