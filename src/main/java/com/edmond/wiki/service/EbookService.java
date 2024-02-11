package com.edmond.wiki.service;

import com.edmond.wiki.domain.Ebook;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 电子书(Ebook)表服务接口
 *
 * @author makejava
 * @since 2024-02-11 10:02:00
 */
//@Service
public interface EbookService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Ebook queryById(Long id);

    /**
     * 分页查询
     *
     * @param ebook       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    Page<Ebook> queryByPage(Ebook ebook, PageRequest pageRequest);

    List<Ebook> queryAll(Ebook ebook);

    /**
     * 新增数据
     *
     * @param ebook 实例对象
     * @return 实例对象
     */
    Ebook insert(Ebook ebook);

    /**
     * 修改数据
     *
     * @param ebook 实例对象
     * @return 实例对象
     */
    Ebook update(Ebook ebook);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
