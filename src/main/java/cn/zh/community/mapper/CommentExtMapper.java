package cn.zh.community.mapper;

import cn.zh.community.model.Comment;

/**
 * @Author: zhanghuan
 * @date: 2020/1/31 10:25
 * @description:
 */

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}