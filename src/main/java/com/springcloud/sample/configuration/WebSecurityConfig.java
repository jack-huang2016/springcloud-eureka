/**
 * FileName: WebSecurityConfig
 * Author:   huang.yj
 * Date:     2020/7/21 13:37
 * Description:
 */
package com.springcloud.sample.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author huang.yj
 * @create 2020/7/21
 * @since 0.1.0
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 关闭csrf
        http.csrf().disable();
        // 支持httpBasic
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}