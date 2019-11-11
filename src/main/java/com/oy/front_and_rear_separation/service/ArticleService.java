package com.oy.front_and_rear_separation.service;

import com.oy.front_and_rear_separation.entity.Article;
import com.oy.front_and_rear_separation.utils.PageResult;
import com.oy.front_and_rear_separation.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface ArticleService {
    PageResult getArticlePage(PageUtil pageUtil);

    Article queryObject(Integer id);

    List<Article> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(Article article);

    int update(Article article);

    int delete(Integer id);

    int deleteBatch(Integer[] ids);
}
