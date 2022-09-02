drop database if exists `musicserver`;
create database if not exists `musicserver` character set utf8;

-- 使用数据库 use `musicserver`;
use `musicserver`;

DROP TABLE IF EXISTS `music`;
CREATE TABLE `music` (  `id` int PRIMARY KEY  AUTO_INCREMENT,`title` varchar(50) BINARY NOT NULL,  `singer` varchar(30) BINARY NOT NULL,  `time` varchar(13) BINARY NOT NULL,  `url` varchar(100) BINARY NOT NULL,  `userid` int(11) NOT NULL );

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (  `id` INT PRIMARY KEY AUTO_INCREMENT,  `username` varchar(20) BINARY NOT NULL,  `password` varchar(32) BINARY NOT NULL );

DROP TABLE IF EXISTS `lovemusic`;
CREATE TABLE `lovemusic` (  `id` int PRIMARY KEY  AUTO_INCREMENT,  `user_id` int(11) NOT NULL,  `music_id` int(11) NOT NULL );

DROP TABLE IF EXISTS `mv`;
CREATE TABLE `mv` (  `id` INT PRIMARY KEY AUTO_INCREMENT,  `title` varchar(50) BINARY NOT NULL,  `singer` varchar(32) BINARY NOT NULL,  `time` varchar(13) BINARY NOT NULL,  `url` varchar(100) BINARY NOT NULL,  `userid` int(11) NOT NULL );

DROP TABLE IF EXISTS `lovemv`;
CREATE TABLE `lovemv` (  `id` int PRIMARY KEY  AUTO_INCREMENT,  `user_id` int(11) NOT NULL,  `mv_id` int(11) NOT NULL );

INSERT INTO user(username, password) VALUES("kxy", "123456");



