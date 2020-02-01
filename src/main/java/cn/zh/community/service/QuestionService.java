package cn.zh.community.service;

import cn.zh.community.dto.PaginationDTO;
import cn.zh.community.dto.QuestionDTO;
import cn.zh.community.model.Question;

import java.util.List;

/**
 * @Author: zhanghuan
 * @date: 2020/2/1 17:11
 * @description:
 */
public interface QuestionService {

    PaginationDTO list(String search, String tag, String sort, Integer page, Integer size);
    PaginationDTO list(Long userId, Integer page, Integer size);
    QuestionDTO getById(Long id);
    void createOrUpdate(Question question);
    void incView(Long id);
    List<QuestionDTO> selectRelated(QuestionDTO queryDTO);

}
