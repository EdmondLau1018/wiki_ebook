package com.edmond.wiki.service.impl;

import com.edmond.wiki.mapper.EbookDao;
import com.edmond.wiki.domain.Ebook;
import com.edmond.wiki.service.EbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电子书(Ebook)表服务实现类
 *
 * @author makejava
 * @since 2024-02-11 10:02:00
 */
@Service("ebookService")
public class EbookServiceImpl implements EbookService {
    @Resource
    private EbookDao ebookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Ebook queryById(Long id) {
        return this.ebookDao.queryById(id);
    }

    @Override
    public List<Ebook> queryAll(Ebook ebook) {
        return ebookDao.queryAllList(ebook);
    }

    /**
     * 分页查询
     *
     * @param ebook       筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
//    @Override
//    public Page<Ebook> queryByPage(Ebook ebook, PageRequest pageRequest) {
//        long total = this.ebookDao.count(ebook);
//        return new PageImpl<>(this.ebookDao.queryAllByLimit(ebook, pageRequest), pageRequest, total);
//    }

    /**
     * 新增数据
     *
     * @param ebook 实例对象
     * @return 实例对象
     */
    @Override
    public Ebook insert(Ebook ebook) {
        this.ebookDao.insert(ebook);
        return ebook;
    }

    /**
     * 修改数据
     *
     * @param ebook 实例对象
     * @return 实例对象
     */
    @Override
    public Ebook update(Ebook ebook) {
        this.ebookDao.update(ebook);
        return this.queryById(ebook.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ebookDao.deleteById(id) > 0;
    }
}
