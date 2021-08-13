package com.murilonerdx.bookmanager.user.builder;

import com.murilonerdx.bookmanager.model.user.service.JwtRequest;
import lombok.Builder;

@Builder
public class JwtRequestBuilder {

    @Builder.Default
    private String username = "murilo";

    @Builder.Default
    private String password = "123456";

    public JwtRequest buildJwtRequest() {
        return new JwtRequest(username, password);
    }
}
