package com.example.server.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = {"com.example.server.mapper"})
public class ServerConf {

}
