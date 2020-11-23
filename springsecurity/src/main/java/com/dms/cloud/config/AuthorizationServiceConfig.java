package com.dms.cloud.config;

import com.dms.cloud.service.impl.AuthUserServiceImpl;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.builders.JdbcClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.sql.DataSource;

/**
 * 授权服务
 */
@Configuration
@EnableAuthorizationServer
@AutoConfigureAfter(AuthUserServiceImpl.class)
public class AuthorizationServiceConfig extends AuthorizationServerConfigurerAdapter {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private AuthUserServiceImpl userDetailsService;
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public AuthorizationServiceConfig() {
        System.out.println("AuthorizationServiceConfig");
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("permitAll()")
                .allowFormAuthenticationForClients();
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        JdbcClientDetailsServiceBuilder jdbcClientDetailsServiceBuilder = clients.jdbc(dataSource);
        clients.inMemory()
                .withClient("7gBZcbsC7kLIWCdELIl8nxcs")
                .secret(passwordEncoder.encode("0osTIhce7uPvDKHz6aa67bhCukaKoYl4"))
                .redirectUris("https://www.baidu.com")
                .authorizedGrantTypes("authorization_code", "password", "refresh_token");


//        dms.common.client-id=7gBZcbsC7kLIWCdELIl8nxcs
//        dms.common.client-secret=0osTIhce7uPvDKHz6aa67bhCukaKoYl4
//        dms.common.scope=userProfile
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .userDetailsService(userDetailsService)
                .authenticationManager(authenticationManager)
                .tokenServices(tokenServices())
                .tokenStore(tokenStore());
    }

    @Bean
    public TokenStore tokenStore() {
        RedisTokenStore redisTokenStore = new RedisTokenStore(redisConnectionFactory);
        redisTokenStore.setPrefix("auth-Token");
        return redisTokenStore;
    }

    @Bean
    public DefaultTokenServices tokenServices() {
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        tokenServices.setTokenStore(tokenStore());
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setReuseRefreshToken(true);
        tokenServices.setAccessTokenValiditySeconds(12 * 60 * 60);
        tokenServices.setRefreshTokenValiditySeconds(7 * 24 * 60 * 60);
        return tokenServices;

    }
}
