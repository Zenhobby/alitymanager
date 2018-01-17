package priv.ality.service;

import priv.ality.pojo.TbItem;
import priv.ality.utils.EasyUIDataGridResult;

import java.util.List;

public interface ItemService {
    TbItem getItemById(Long itemId);
    EasyUIDataGridResult getItemList(int page, int rows);
}