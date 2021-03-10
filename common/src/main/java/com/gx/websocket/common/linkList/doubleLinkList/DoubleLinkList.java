package com.gx.websocket.common.linkList.doubleLinkList;

import com.gx.websocket.common.linkList.singleLinkList.SingleLinkNode;

/**
 * 单链表
 */
public class DoubleLinkList {

    /**
     * 初始节点
     */
    public SingleLinkNode origNode = null;

    public SingleLinkNode origOperNode = null;

    public SingleLinkNode tempNode = null;

    public Integer size = 0;

    public Integer count = 0;

    public Integer delCount = 0;

    public SingleLinkNode next = null;

    public SingleLinkNode pre = null;

    private Integer add() {
        return size = size + 1;
    }

    private Integer sub() {
        if (size >= 1) {
            return size = size - 1;
        } else {
            size = 0;
            return 0;
        }
    }

    public void add(Integer value) {
    }

    /**
     * 递归算法遍历
     */
    public void showAll() {
    }

    /**
     * 使用递归算法 遍历查询指定下标的节点
     *
     * @param index
     */
    public Integer getByIndex(int index) {
        return null;
    }

    public void removeByIndex(int index) {
    }


    public static void main(String[] args) {
        DoubleLinkList linkList = new DoubleLinkList();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        linkList.add(6);
        linkList.showAll();
        Integer indexValue = linkList.getByIndex(0);
        System.out.println("indexValue = " + indexValue);
        System.out.println("linkList.size = " + linkList.size);
        linkList.removeByIndex(4);
        linkList.showAll();
    }


}
