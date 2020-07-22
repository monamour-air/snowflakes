CREATE TABLE IF NOT EXISTS `users` (
	-- `cloumn`  type(length)/enum(``,``,...)
	`id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键,自增长',
	`username` char(50) NOT NULL DEFAULT '' COMMENT '用户名',
	`password` char(200) NOT NULL COMMENT '密码',
	`enabled` boolean NOT NULL COMMENT '是否启用',
	`role_priv` enum('N','Y') CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '角色权限',
	PRIMARY KEY (`id`,`username`)
)
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户表'; 

