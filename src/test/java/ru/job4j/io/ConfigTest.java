package ru.job4j.io;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ConfigTest {
    @Test
    public void whenPairWithoutComment() {
        String path = "./data/pair_without_comment.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("hibernate.connection.username"),
                                    is("postgres"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenWrongConfigFile() {
        String path = "./data/wrong_data_config.properties";
        Config config = new Config(path);
        config.load();
    }
}