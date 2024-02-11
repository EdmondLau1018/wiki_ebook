package com.edmond.wiki.mapper;

import com.edmond.wiki.domain.Ebook;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 电子书(Ebook)表数据库访问层
 *
 * @author makejava
 * @since 2024-02-11 10:01:59
 */
public interface EbookDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Ebook queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param ebook    查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
//    List<Ebook> queryAllByLimit(Ebook ebook, @Param("pageable") Pageable pageable);

    List<Ebook> queryAllList(Ebook ebook);

    /**
     * 统计总行数
     *
     * @param ebook 查询条件
     * @return 总行数
     */
    long count(Ebook ebook);

    /**
     * 新增数据
     *
     * @param ebook 实例对象
     * @return 影响行数
     */
    int insert(Ebook ebook);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Ebook> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Ebook> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Ebook> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Ebook> entities);

    /**
     * 修改数据
     *
     * @param ebook 实例对象
     * @return 影响行数
     */
    int update(Ebook ebook);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

