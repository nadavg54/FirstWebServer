package hello;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.NodeClientFactoryBean;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.net.InetSocketAddress;
import java.util.UUID;

/**
 * Created by nad on 11/27/17.
 */
@Configuration
public class config {

    @Bean
    public TransportClient elasticsearchSecuredClient() throws Exception {
        Settings settings = Settings.builder()
                .build();

        return new PreBuiltTransportClient(settings)
                .addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("localhost", 9300)));
    }
}
