package com.dms.cloud.controller;

import com.dms.cloud.config.AuthorizationServiceConfig;
import com.dms.cloud.service.impl.AuthUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerEndpointsConfiguration;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.OAuth2RequestFactory;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.endpoint.AbstractEndpoint;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@ConditionalOnBean(AuthorizationServiceConfig.class)
public class TokenController {

    @Value("${oauth2.grant_type}")
    private String grantType;
    @Value("${oauth2.client_id}")
    private String clientId;
    @Value("${oauth2.client_secret}")
    private String clientSecret;
    @Value("${oauth2.scope}")
    private String scope;

    @Autowired
    AuthorizationServerEndpointsConfiguration endpoints;

    public TokenController(){
        System.out.println("TokenController");
    }

    @GetMapping(value = "/login/token")
    public OAuth2AccessToken login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        OAuth2AccessToken result = null;
        Map<String, String> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
        map.put("client_id", clientId);
        map.put("grant_type", grantType);
        map.put("client_secret", clientSecret);
        map.put("scope", scope);
//        AbstractEndpoint endpoint = new TokenEndpoint();
//        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//        TokenRequest tokenRequest = new TokenRequest(map, clientId, new ArrayList<>(), grantType);
//        OAuth2Request oAuth2Request = new OAuth2Request(map, clientId, null, true, null, null, (String) null, (Set) null, (Map) null);

        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(clientId, clientSecret, Collections.emptyList());
        try {
            ResponseEntity<OAuth2AccessToken> responseEntity = endpoints.tokenEndpoint().postAccessToken(auth, map);
            OAuth2AccessToken oAuth2AccessToken = responseEntity.getBody();
            result = oAuth2AccessToken;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
