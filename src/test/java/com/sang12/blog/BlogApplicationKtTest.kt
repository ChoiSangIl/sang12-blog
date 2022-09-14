package com.sang12.blog

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldNotBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

/**
 * kotest testing style
 * https://kotest.io/docs/framework/testing-styles.html
 */
@SpringBootTest
class BlogApplicationKtTest(
    @Autowired private val context: ApplicationContext
) : StringSpec({
    "Spring Boot 서비스가 실행 됐을경우, ApllicationContext 객체를 반환해야 한다" {
        context shouldNotBe null
    }
})

@SpringBootTest
class BlogApplicationKtShouldSpec(
    @Autowired private val context: ApplicationContext
) : ShouldSpec({
    should("Spring Boot 서비스가 실행 됐을경우, ApllicationContext 객체를 반환해야 한다"){
        context shouldNotBe null
    }
})

@SpringBootTest
class BlogApplicationKtBehaviorSpec(
    @Autowired private val context: ApplicationContext
) : BehaviorSpec({
    given("context 객체가 주어 졌을 때") {
        `when`("스프링부트 서비스가 올라갈 때") {
            then("context 객체를 반환해야한다") {
                context shouldNotBe null
            }
        }
    }
})

@SpringBootTest
class BlogApplicationKtWordSpec(
    @Autowired private val context: ApplicationContext
) : WordSpec({
    "context 객체" should {
        "return not null" {
            context shouldNotBe null
        }
    }
})