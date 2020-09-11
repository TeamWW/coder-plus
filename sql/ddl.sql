CREATE TABLE `wm_e_poi_signage_pic` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `wm_poi_id` bigint(11) NOT NULL COMMENT '门店id',
  `signage_pic_url` varchar(255) NOT NULL DEFAULT '' COMMENT '店铺招牌图url',
  `group_id` varchar(70) NOT NULL DEFAULT '' COMMENT '门店所属分组',
  `create_time` int(11) NOT NULL,
  `update_time` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `wm_poi_id` (`wm_poi_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6272849 DEFAULT CHARSET=utf8mb4