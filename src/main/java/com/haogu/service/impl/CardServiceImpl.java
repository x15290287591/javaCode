package com.haogu.service.impl;

import com.github.pagehelper.PageHelper;
import com.haogu.pojo.Card;
import com.haogu.pojo.PageVo;
import com.haogu.service.CardService;
import com.haogu.mapper.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CardServiceImpl implements CardService{
    @Autowired
    private CardMapper cardMapper;

    @Override
    public int update(Card card) {
        return cardMapper.update(card);
    }

    @Override
    public int insert(Card card) {
        return cardMapper.insert(card);
    }

    @Override
    public int deleteById(Integer id) {
        if (cardMapper.deleteById(id) == 0) {
            throw new RuntimeException("删除失败");
        }
        return cardMapper.deleteById(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        if (ids == null) {
            throw new RuntimeException("id为空");
        }
        if (cardMapper.deleteBatch(ids) == 0) {
            throw new RuntimeException("删除失败");
        }
        return cardMapper.deleteBatch(ids);
    }

    @Override
    public List<Card> selectAll() {
        return cardMapper.selectAll();
    }

    @Override
    public List<Card> selectByPage(PageVo pageVo) {
        PageHelper.startPage(pageVo);
        return cardMapper.selectAll();
    }

    @Override
    public List<Card> selectByStatus(String status, String monthcard) {
        return cardMapper.selectByStatus(status, monthcard);
    }
}




