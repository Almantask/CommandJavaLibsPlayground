import JsonPractice.Person;
import com.google.gson.Gson;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonParseTest {
    @Test
    void tryParse_returns_Person(){
        String json = "{\"id\":25,\"first_name\":\"Sunshine\",\"last_name\":\"Glozman\",\"email\":\"sglozmano@exblog.jp\",\"gender\":\"Female\",\"GPA\":1.91}";
        Gson gson = new Gson();

        Person person = gson.fromJson(json, Person.class);

        assertThat(person).isEqualTo(person);
    }
}
