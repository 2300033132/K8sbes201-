spring.application.name=ecommerce

# ✅ Tomcat WAR context path mapping
server.servlet.context-path=/back1

# ✅ MySQL inside Kubernetes (service name)
spring.datasource.url=jdbc:mysql://mysql:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# ✅ JPA Settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
