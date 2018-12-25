package com.iandyou.common.util.common;

import com.iandyou.common.entity.idreamyou.UserInfoEntity;
import lombok.experimental.UtilityClass;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

/**
 * 安全工具类
 *
 * @author Juning
 * @date 2018/12/23
 */
@UtilityClass
public class SecurityUtils {
	/**
	 * 获取Authentication
	 */
	public Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}

	/**
	 * 获取用户
	 *
	 * @param authentication
	 * @return PigxUser
	 * <p>
	 * 获取当前用户的全部信息 EnablePigxResourceServer true
	 * 获取当前用户的用户名 EnablePigxResourceServer false
	 */
	public UserInfoEntity getUser(Authentication authentication) {
		Object principal = authentication.getPrincipal();
		if (principal instanceof UserInfoEntity) {
			return (UserInfoEntity) principal;
		}
		return null;
	}

	/**
	 * 获取当前用名
	 *
	 * @return String
	 */
	public String getUsername() {
		Object principal = getAuthentication().getPrincipal();
		if (principal instanceof String) {
			return principal.toString();
		}
		return null;
	}


	public String getClientId() {
		Authentication authentication = getAuthentication();
		if (authentication instanceof OAuth2Authentication) {
			OAuth2Authentication auth2Authentication = (OAuth2Authentication) authentication;
			return auth2Authentication.getOAuth2Request().getClientId();
		}
		return null;
	}

	/**
	 * 获取用户
	 */
	public UserInfoEntity getUser() {
		Authentication authentication = getAuthentication();
		if (authentication == null) {
			return null;
		}
		return getUser(authentication);
	}
}
