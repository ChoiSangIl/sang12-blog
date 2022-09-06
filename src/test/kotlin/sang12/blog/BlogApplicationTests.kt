package sang12.blog

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Test
    fun `Application Context를 가져 올 수 있다`(){
    }


}
