import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ExampleTest : StringSpec({
    "this is a failing test" {
        Example().sayHello() shouldBe "bye bye"
    }
})
