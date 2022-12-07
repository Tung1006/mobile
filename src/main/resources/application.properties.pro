spring.datasource.url=jdbc:oracle:thin:@222.252.17.169:11521/orcl
spring.datasource.username=pccc_dev_docker3
spring.datasource.password=Asdf1234

# create n drop tables, loads import.sql.bak
#spring.jpa.hibernate.ddl-auto=create-drop
#spring.jpa.hibernate.ddl-auto=create

#spring.jpa.hibernate.ddl-auto=update

#spring.datasource.url=jdbc:oracle:thin:@10.0.2.8:1521/orcl
#spring.datasource.username=pccc_mobile
#spring.datasource.password=Asdf1234
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.Oracle12cDialect
logging.file.name=apimobile.log
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
logging.level.org.springframework.jdbc.core.JdbcTemplate=DEBUG
logging.level.org.springframework.jdbc.core.StatementCreatorUtils=TRACE

# define paramter using in app
battery.limit=50
online.status=1
signal.limit=20

#define topic name of kafka
pda.mobile.firealarm=firealarm
pda.mobile.device=deviceAlarm
pda.mobile.sensor=sensorAlarm

#ErrorCode
err.data-not-found=ERR01
err.system=ERR999

#config keycloak
keycloak.auth-server-url=http://222.252.17.169:8013/auth
keycloak.realm=pccc
keycloak.resource=web
keycloak.cors=true
keycloak.use-resource-role-mappings = true
keycloak.bearer-only= true
keycloak.principal-attribute=preferred_username
keycloak.ssl-required=none
#Config FCM
serviceAccountKeyFile=~/serviceAccountKey.json
server.port=8080