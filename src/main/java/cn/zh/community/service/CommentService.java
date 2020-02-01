package cn.zh.community.service;

import cn.zh.community.dto.CommentDTO;
import cn.zh.community.enums.CommentTypeEnum;
import cn.zh.community.model.Comment;
import cn.zh.community.model.User;

import java.util.List;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 17:09
 * @description:
 */
public interface CommentService {

    void insert(Comment comment, User commentator);
    List<CommentDTO> listByTargetId(Long id, CommentTypeEnum type);

}
