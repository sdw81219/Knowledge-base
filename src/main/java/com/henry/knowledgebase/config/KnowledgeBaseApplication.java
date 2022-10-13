package com.henry.knowledgebase.config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.henry")
@SpringBootApplication
public class KnowledgeBaseApplication {
    private static final Logger LOG = LoggerFactory.getLogger(KnowledgeBaseApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(KnowledgeBaseApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("Successfully Run");
        LOG.info("Ip address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
