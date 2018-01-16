package priv.ality.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.ality.mapper.TbItemMapper;
import priv.ality.pojo.TbItem;
import priv.ality.service.ItemService;

/**
 * 商品查询Service
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        return itemMapper.selectByPrimaryKey(itemId);
    }
}
