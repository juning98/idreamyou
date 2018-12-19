package cn.idreamyou.constant;

/**
 * Spring Security 常量
 *
 * @author Juning
 * @date 2018/12/18
 */
public class SecurityConstants {

    /**
     * 角色前缀
     */
    public static final String ROLE = "ROLE_";

    /**
     * {bcrypt} 加密的特征码
     */
    public static final String BCRYPT = "{bcrypt}";

    /**
     * 前缀
     */
    public static final String IDREAMYOU_PREFIX = "idreamyou_";

    /**
     * oauth 相关前缀
     */
    public static final String OAUTH_PREFIX = "oauth:";

    /**
     * 项目的license
     */
    public static final String IDREAMYOU_LICENSE = " Hi! I Dream You";

    /**
     * oauth 客户端信息
     */
    public static final String CLIENT_DETAILS_KEY = "idreamyou_oauth:client:details";

    /**
     * sys_oauth_client_details 表的字段，不包括client_id、client_secret
     */
    public static final String CLIENT_FIELDS = "client_id, CONCAT('{noop}',client_secret) as client_secret, resource_ids, scope, "
            + "authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, "
            + "refresh_token_validity, additional_information, autoapprove";

    /**
     * JdbcClientDetailsService 查询语句
     */
    public static final String BASE_FIND_STATEMENT = "select " + CLIENT_FIELDS
            + " from sys_oauth_client_details";

    /**
     * 默认的查询语句
     */
    public static final String DEFAULT_FIND_STATEMENT = BASE_FIND_STATEMENT + " order by client_id";

    /**
     * 按条件client_id 查询
     */
    public static final String DEFAULT_SELECT_STATEMENT = BASE_FIND_STATEMENT + " where client_id = ?";

}
