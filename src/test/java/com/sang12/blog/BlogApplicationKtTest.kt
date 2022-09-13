package com.sang12.blog

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration

@SpringBootTest
@ContextConfiguration
class BlogApplicationKtTest(
    private val context: ApplicationContext
) : StringSpec({

    "should return the greeting provided by greeting service" {
        context shouldNotBe null
    }

})
