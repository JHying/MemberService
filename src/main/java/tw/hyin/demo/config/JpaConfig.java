package tw.hyin.demo.config;

import java.sql.Types;

import org.hibernate.dialect.SQLServerDialect;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig extends SQLServerDialect {

	// 解決 MappingException: No Dialect mapping for JDBC (型態不一致)
	public JpaConfig() {
		super();
		registerHibernateType(Types.CHAR, StandardBasicTypes.STRING.getName());
		registerHibernateType(Types.CHAR, 1, StandardBasicTypes.STRING.getName());
		registerHibernateType(Types.NCHAR, StandardBasicTypes.STRING.getName());
		registerHibernateType(Types.NVARCHAR, StandardBasicTypes.STRING.getName());
		registerHibernateType(Types.LONGNVARCHAR, StandardBasicTypes.TEXT.getName());
		registerHibernateType(Types.LONGNVARCHAR, StandardBasicTypes.NTEXT.getName());
		registerHibernateType(Types.NCLOB, StandardBasicTypes.CLOB.getName());
	}

}
