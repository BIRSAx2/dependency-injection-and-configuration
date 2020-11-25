package dev.mouhieddine.dependencyinjection.config;

import dev.mouhieddine.dependencyinjection.examplebeans.FakeDataSource;
import dev.mouhieddine.dependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration

public class PropertyConfig {


  @Value("${dev.username}")
  String user;
  @Value("${dev.password}")
  String password;
  @Value("${dev.dburl}")
  String url;

  @Value("${dev.jms.username}")
  String jmsUser;
  @Value("${dev.jms.password}")
  String jmsPassword;
  @Value("${dev.jms.dburl}")
  String jmsUrl;

  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    fakeDataSource.setUser(user);
    return fakeDataSource;


  }

  @Bean
  public FakeJmsBroker fakeJmsBroker() {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setPassword(jmsPassword);
    fakeJmsBroker.setUrl(jmsUrl);
    fakeJmsBroker.setUser(jmsUser);
    return fakeJmsBroker;


  }
}
