package com.spingcore.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")  // Mỗi lần bean được yêu cầu, một instance mới của bean sẽ được tạo
    // Được sử dụng khi bạn cần một bean mới cho mỗi yêu cầu
    public Person personsingleton(){
        return new Person();
    }

    //@Scope("singleton")
    // Mô tả : Mỗi bean chí có một Instance duy nhất được tạo và được chia sẻ trong toàn bộ Spring Container
    // Sử dụng : Được sử dụng khi bạn muốn sử dụng cùng một instance của bean trong suốt ứng dụng

    //@Scope("requet")
    // Mô tả : Một instance của bean sẽ được tạo mới cho mỗi yêu cầu HTTP
    // Sử dụng : Được sử dụng trong các ứng dụng web để đảm bảo rằng mỗi request có một instance bean riêng


    //@Scope("session")
    // Mô tả : Một instance của bean sẽ được tạo mới cho mỗi session HTTP
    // Sử dụng : Được sử dụng trong các ứng dụng web để đảm bảo rằng mỗi session có một session bean riêng

    //@Scope("application")
    // Mô tả : Một instance của beans sẽ được tạo cho toàn bộ vòng đời của ServletContext
    // Sử dụng : Được sử dụng trong cac ứng dụng web để chia sẻ bean giữa các yêu cầu và session

    //@Scope("websocket")
    // Mô tả : Một instance của bean sẽ được tạo mới cho mỗi phiên WebSocket
    // Sử dụng : Được sử dụng trong các ứng dụng web sử dụng WebSocket

}