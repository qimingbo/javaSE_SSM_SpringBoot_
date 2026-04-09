package com.qmb.tx_xml.dao;

public interface BookDao {
    // 根据书本id获取价格
    public int getPriceByBookId(int bookId);

    // 修改书本库存
    public void updateStockByBookId(int bookId);
    // 修改用户余额
    public void updateByUserId(int userId,int price);
}
