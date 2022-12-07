package com.pda.mobile.configs;

import java.nio.file.AccessDeniedException;
import java.util.Collection;
import java.util.stream.Collectors;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.adapters.RefreshableKeycloakSecurityContext;
import org.keycloak.admin.client.Keycloak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.WebApplicationContext;

import com.pda.mobile.dto.CurrentUser;
import com.pda.mobile.utils.KeycloakAdminClientUtils;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
@Configuration
public class CurrentUserProvider {

	@Autowired
	private KeycloakPropertyReader keycloakPropertyReader;

	@SuppressWarnings("unchecked")
	@Bean
	@Scope(value = WebApplicationContext.SCOPE_REQUEST)
	public CurrentUser getCurrentUser() throws AccessDeniedException {
		try {
			CurrentUser result = new CurrentUser();

			KeycloakPrincipal<RefreshableKeycloakSecurityContext> principal = (KeycloakPrincipal<RefreshableKeycloakSecurityContext>) SecurityContextHolder
					.getContext().getAuthentication().getPrincipal();

			String userId = principal.getKeycloakSecurityContext().getToken().getSubject();
			String username = principal.toString();
			String email = principal.getKeycloakSecurityContext().getToken().getEmail();
			Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) SecurityContextHolder
					.getContext().getAuthentication().getAuthorities();

			result.setUserId(userId);
			result.setUsername(username);
			result.setEmail(email);
			result.setRoles(
					authorities.stream().map(SimpleGrantedAuthority::getAuthority).collect(Collectors.toList()));
			return result;
		} catch (Exception e) {
			throw new AccessDeniedException("Not have access");
		}
	}

	@SuppressWarnings("unchecked")
	@Bean
	@Scope(value = WebApplicationContext.SCOPE_REQUEST)
	public Keycloak getKeycloakInstance() throws AccessDeniedException {
		try {
			KeycloakPrincipal<RefreshableKeycloakSecurityContext> principal = (KeycloakPrincipal<RefreshableKeycloakSecurityContext>) SecurityContextHolder
					.getContext().getAuthentication().getPrincipal();

			KeycloakAdminClientConfig keycloakAdminClientConfig = KeycloakAdminClientUtils
					.loadConfig(keycloakPropertyReader);
			return KeycloakAdminClientUtils.getKeycloakClient(principal.getKeycloakSecurityContext(),
					keycloakAdminClientConfig);
		} catch (Exception e) {
			throw new AccessDeniedException("Not have access");
		}

	}

}