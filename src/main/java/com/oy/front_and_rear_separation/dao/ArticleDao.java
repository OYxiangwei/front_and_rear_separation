package com.oy.front_and_rear_separation.dao;

import com.oy.front_and_rear_separation.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ArticleDao {
    /**
     * 返回相应的数据集合
     *
     * @param map
     * @return
     */
    List<Article> findArticles(Map<String, Object> map);

    /**
     * 数据数目
     *
     * @param map
     * @return
     */
    int getTotalArticles(Map<String, Object> map);

    /**
     * 添加
     *
     * @return
     */
    int insertArticle(Article article);

    /**
     * 修改
     *
     * @return
     */
    int updArticle(Article article);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int delArticle(Integer id);

    /**
     * 根据id查找
     *
     * @param id
     * @return
     */
    Article getArticleById(Integer id);

    /**
     * 批量删除
     *
     * @param id
     * @return
     */
    int deleteBatch(Object[] id);
}
