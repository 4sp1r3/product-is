package org.wso2.carbon.is.migration.util;

public class SQLQueries {

    public static final String SELECT_FROM_CONSUMER_APPS = "SELECT ID, USERNAME, USER_DOMAIN FROM IDN_OAUTH_CONSUMER_APPS";

    public static final String UPDATE_CONSUMER_APPS = "UPDATE IDN_OAUTH_CONSUMER_APPS SET USERNAME=?, USER_DOMAIN=? " +
            "WHERE ID=?";

    public static final String SELECT_FROM_ACCESS_TOKEN = "SELECT ACCESS_TOKEN, TOKEN_SCOPE, AUTHZ_USER, TOKEN_ID FROM " +
            "IDN_OAUTH2_ACCESS_TOKEN";

    public static final String INSERT_SCOPE_ASSOCIATION = "INSERT INTO IDN_OAUTH2_ACCESS_TOKEN_SCOPE (TOKEN_ID, " +
            "TOKEN_SCOPE) VALUES (?, ?)";

    public static final String INSERT_TOKEN_SCOPE_HASH = "UPDATE IDN_OAUTH2_ACCESS_TOKEN SET TOKEN_SCOPE_HASH=? WHERE" +
            " ACCESS_TOKEN=?";

    public static final String INSERT_TOKEN_ID = "UPDATE IDN_OAUTH2_ACCESS_TOKEN SET TOKEN_ID=? WHERE ACCESS_TOKEN=?";

    public static final String UPDATE_USER_NAME = "UPDATE IDN_OAUTH2_ACCESS_TOKEN SET AUTHZ_USER=?, TENANT_ID=?, " +
            "USER_DOMAIN=?, SUBJECT_IDENTIFIER=? WHERE ACCESS_TOKEN=?";

    public static final String DROP_TOKEN_SCOPE_COLUMN = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN DROP COLUMN TOKEN_SCOPE";

    public static final String SET_ACCESS_TOKEN_PRIMARY_KEY = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN ADD PRIMARY KEY " +
            "(TOKEN_ID)";

    public static final String SET_SCOPE_ASSOCIATION_PRIMARY_KEY = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN_SCOPE ADD " +
            "FOREIGN KEY (TOKEN_ID) REFERENCES IDN_OAUTH2_ACCESS_TOKEN(TOKEN_ID) ON DELETE CASCADE";

    public static final String ALTER_TOKEN_ID_NOT_NULL_ORACLE = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN MODIFY TOKEN_ID " +
            "VARCHAR2 (255) NOT NULL";

    public static final String ALTER_TOKEN_ID_NOT_NULL_MYSQL = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN MODIFY TOKEN_ID " +
            "VARCHAR (255) NOT NULL";

    public static final String ALTER_TOKEN_ID_NOT_NULL_H2 = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN ALTER COLUMN " +
            "TOKEN_ID VARCHAR (255) NOT NULL";

    public static final String ALTER_TOKEN_ID_NOT_NULL_MSSQL = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN ALTER COLUMN " +
            "TOKEN_ID VARCHAR (255) NOT NULL";

    public static final String ALTER_TOKEN_ID_NOT_NULL_POSTGRESQL = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN ALTER COLUMN" +
            " TOKEN_ID SET NOT NULL";

    public static final String SELECT_FROM_AUTHORIZATION_CODE = "SELECT AUTHORIZATION_CODE, AUTHZ_USER, USER_DOMAIN FROM " +
            "IDN_OAUTH2_AUTHORIZATION_CODE";

    public static final String UPDATE_USER_NAME_AUTHORIZATION_CODE = "UPDATE IDN_OAUTH2_AUTHORIZATION_CODE SET " +
            "AUTHZ_USER=?, TENANT_ID=?, USER_DOMAIN=?, CODE_ID=?, SUBJECT_IDENTIFIER=? WHERE AUTHORIZATION_CODE=?";

    public static final String SET_AUTHORIZATION_CODE_PRIMARY_KEY = "ALTER TABLE IDN_OAUTH2_AUTHORIZATION_CODE ADD " +
            "PRIMARY KEY (CODE_ID)";

    public static final String ALTER_CODE_ID_NOT_NULL_ORACLE = "ALTER TABLE IDN_OAUTH2_AUTHORIZATION_CODE MODIFY " +
            "CODE_ID VARCHAR2 (255) NOT NULL";

    public static final String ALTER_CODE_ID_NOT_NULL_MYSQL = "ALTER TABLE IDN_OAUTH2_AUTHORIZATION_CODE MODIFY " +
            "CODE_ID VARCHAR (255) NOT NULL";

    public static final String ALTER_CODE_ID_NOT_NULL_H2 = "ALTER TABLE IDN_OAUTH2_AUTHORIZATION_CODE ALTER COLUMN " +
            "CODE_ID VARCHAR (255) NOT NULL";

    public static final String ALTER_CODE_ID_NOT_NULL_MSSQL = "ALTER TABLE IDN_OAUTH2_AUTHORIZATION_CODE ALTER COLUMN" +
            " CODE_ID VARCHAR (255) NOT NULL";

    public static final String ALTER_CODE_ID_NOT_NULL_POSTGRESQL = "ALTER TABLE IDN_OAUTH2_AUTHORIZATION_CODE ALTER " +
            "COLUMN CODE_ID SET NOT NULL";

    public static final String SELECT_IDN_ASSOCIATED_ID = "SELECT ID, USER_NAME, DOMAIN_NAME FROM IDN_ASSOCIATED_ID";
    public static final String UPDATE_IDN_ASSOCIATED_ID = "UPDATE IDN_ASSOCIATED_ID SET DOMAIN_NAME=?, USER_NAME=? " +
            "WHERE ID=?";

    public static final String LOAD_APP_NAMES = "SELECT APP_NAME, TENANT_ID FROM SP_APP";
    public static final String UPDATE_ROLES = "UPDATE UM_HYBRID_ROLE SET UM_ROLE_NAME=? WHERE UM_ROLE_NAME=? AND " +
            "UM_TENANT_ID=?";

}
