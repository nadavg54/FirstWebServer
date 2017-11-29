package hello;

import org.elasticsearch.client.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.client.NodeClientFactoryBean;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.util.UUID;

/**
 * Created by nad on 11/27/17.
 */
public class config2 {

   /* @Bean
    public NodeClientFactoryBean client() {

        NodeClientFactoryBean bean = new NodeClientFactoryBean(true);
        bean.setClusterName(UUID.randomUUID().toString());
        bean.setEnableHttp(false);
        bean.setPathData("target/elasticsearchTestData");
        bean.setPathHome("src/test/resources/test-home-dir");
        return bean;
    }

    @Bean
    public ElasticsearchTemplate elasticsearchTemplate(Client client) throws Exception {
        return new ElasticsearchTemplate(client);
    }*/
}
