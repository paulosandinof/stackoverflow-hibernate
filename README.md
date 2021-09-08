# Stackoverflow-hibernate

This application uses Java 11 and MySQL 5.7.34.

Create your database and update the file `hibernate.cfg.xml` with your database connection properties.

```xml
<!-- Database connection settings -->
<property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
<property name="connection.url">jdbc:mysql://localhost:3306/YOUR_DATABASE_NAME?useUnicode=true&amp;characterEncoding=utf-8</property>
<property name="connection.username">YOUR_DATABASE_USERNAME</property>
<property name="connection.password">YOUR_DATABASE_PASSWORD</property>
```
